/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Filipe Reis
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola, Mundo", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        int n, s = 0, totV = 0, totPar = 0, totImpar = 0, aCem = 0;
        int media;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um numero: <br><em>(Valor 0 interrompe)</em></html>"));
            s += n;
            totV++;
            if (n%2 == 0) totPar++;
                else totImpar++;
            if (n > 100) aCem++;               
        } while (n != 0);
        media = s / totV;
        //double mAr = Math.round(media);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" + 
                "<br>Total de Valores: " + (--totV) + 
                "<br>Total de Pares: " + (--totPar) +
                "<br>Total de Ímpares: " + totImpar +
                "<br>Acima de 100: " + aCem +
                "<br>Média dos Valores: " + media
                + "</html>");
        
        
        
    }
    
}
