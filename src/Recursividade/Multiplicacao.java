
package Recursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author Micaela Freitas
 *
 */
public class Multiplicacao {
    public static int vezes(int num, int numero){
        if (num ==1){
            return numero;
            
        }
        return numero + vezes (num-1, numero);
        
        
        
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"O numero que multiplicou e: \n" +vezes(2, 3));
        
    }
}
