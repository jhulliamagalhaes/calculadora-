
package javaapplication4;

import javax.swing.JOptionPane;

public class JavaApplication4 {

    public static void main(String[] args) {
        String t1Number = JOptionPane.showInputDialog(" DIGITE O PRIMEIRO VALOR ");
        String t2Number = JOptionPane.showInputDialog(" DIGITE O SEGUNDO VALOR ");
        String op = JOptionPane.showInputDialog("DIGITE SUA OPÇÂO QUE CALCULO IRÁ FAZER: 1- ADIÇÂO, 2-SUBTRAÇÃO, 3-DIVISÃO, 4-MULTIPLICAÇÃO ");
        
        
        double n1 = Double.parseDouble( t1Number );
        double n2 = Double.parseDouble( t2Number );
        int ops = Integer.parseInt(op);
        
        
        NewClass nc  = new NewClass();
        
        
        if (ops == 1){
         double rs = nc.soma(n1, n2);
         JOptionPane.showMessageDialog(null," a soma é "+rs);
        }
          
          
        if(ops == 2){
          double rs = nc.subtracao(n1, n2);
          JOptionPane.showMessageDialog(null,"a subtração é" +rs);
        }
        
        if(ops == 3){
          double rs = nc.divisão(n1, n2);
          JOptionPane.showMessageDialog(null," a divisâo é" +rs);
        }
        
        if(ops==4){
           double rs = nc.multiplicação(n1, n2);
           JOptionPane.showMessageDialog(null, " a multiplicação é " +rs);
        }
    
   }
    
}
