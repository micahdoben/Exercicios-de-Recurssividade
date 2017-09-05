/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

import static Recursividade.Somar.mais;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Somar {
   public static int mais(int num,String a){
       
    if (num < 0){
         return  Integer.parseInt(Character.toString(a.charAt(num)));
     
        
    } 
      return a.length()-1;
   }
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros inteiros"));
        JOptionPane.showMessageDialog(null, num);
    }
}
