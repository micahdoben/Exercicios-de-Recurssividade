package Recursividade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Binarios {
   public static void  binarios(int num){
       if( num >0){
           binarios (num/2);
           System.out.println(num%2);
           
       }
         
   }
   
    public static void main(String[] args) {
        binarios(124);
        
    }
}
