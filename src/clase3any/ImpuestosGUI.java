/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3any;
//import java.util.Scanner;
//Paquete para implementar Ventanas Graficas de usuarios
import javax.swing.JOptionPane;



/**
 *
 * @author LAB08
 */
public class ImpuestosGUI
        
{       
      
  
  public static void main(String[] args)
  {
    int sueldo;
    
    //Scanner escaner = new Scanner(System.in);
    //System.out.println("Ingrese su salario: ");
    
    //Estamos convirtiendo el String a entero antes de guardarlo
    sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
    //sueldo = escaner.nextInt();
    
    if(sueldo>600000)
        
    {
    //System.out.println("Debe pagar Impuestos");
        JOptionPane.showMessageDialog(null, "Debe pagar impuestos");
                
    }
            
            
   }
  
  }