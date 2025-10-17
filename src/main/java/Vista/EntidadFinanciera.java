/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import Modelo.*;

import javax.swing.JOptionPane;
/**
 *
 * @author Jonatan
 */
public class EntidadFinanciera {

  
    
    public static void main(String[] args) {
        
        // Crea cliente y  la cuenta
        Cliente cliente = new Cliente("Jonatan Cuellar", "1085324567");
        CuentaAhorros cuenta = new CuentaAhorros("001-ABC", 21000, cliente);
        
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "menu de la entidad banco sanchito Financiera\n" +
                "1. Ver datos de la cuenta\n" +
                "2. Realizar consignación\n" +
                "3. Realizar retiro\n" +
                "4. Realizar reembolso\n" +
                "5. Salir"
            ));
            
            switch(opcion) {
                case 1:
                    cuenta.mostrarDatos();
                    break;
                case 2:
                    double valorC = Double.parseDouble(JOptionPane.showInputDialog("Valor a consignar:"));
                    String motivo = JOptionPane.showInputDialog("motivo de la consignacion:");
                    cuenta.consignar(valorC, motivo);
                    break;
                case 3:
                    double valorR = Double.parseDouble(JOptionPane.showInputDialog("valor a retirar:"));
                    cuenta.retirar(valorR);
                    break;
                case 4:
                    double valorRe = Double.parseDouble(JOptionPane.showInputDialog("valor del reembolso:"));
                    cuenta.realizarReembolso(valorRe);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "gracias por usar la entidad banco sanchito financiera.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        } while (opcion != 5);
    }
    
}
