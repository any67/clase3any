/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3any;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB08
 * 
 */


public class Esfera 
        
        
{
  public class ImpuestosGUI
        
{       
      
  
        public static void main(String[] args)
          
    {
    
        
    float radio, volumen;
    final float PI=3.14f;//final define una constante
    
    //Scanner escaner = new Scanner(System.in);
    //System.out.println("Ingrese su salario: ");
    
    //Estamos convirtiendo el String a entero antes de guardarlo
    radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un radio"));
    //sueldo = escaner.nextInt();
    
    if(radio>0)
        
    {
     volumen = (4/3)*PI*(radio*radio*radio);
        JOptionPane.showMessageDialog(null, "El volumen de su esfera es: "+volumen);
                
    }
    
    
  }
