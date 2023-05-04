/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author filip
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", 
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int ano = 2024;
        if (ano % 4 == 0)    // Verificar se ano é bissexto    
            tot[1] = 29;
        for(int c=0; c<=mes.length-1; c++){
            System.out.println("O mes de " + mes[c] + " tem " +
                    tot[c] + " dias ao todo.");
        }
        
    }
    
}
