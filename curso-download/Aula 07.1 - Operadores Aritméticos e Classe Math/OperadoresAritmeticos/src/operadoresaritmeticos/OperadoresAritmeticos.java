/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Filipe Reis
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A média é igual a " + m);*/
        
        //int numero = 5;
        //int valor = 5 + numero++; // ++ faz toda a operação, depois incrementa
        //int valor2 = 5 + ++numero; // ++ incrementa, depois faz a operação
        //System.out.println(valor);
        //System.out.println(valor2);
        
        /*numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/
        
        /*int x = 4;
        x -= 2;
        System.out.println(x);*/
        
        /*float v = 8.4f;
        int ar = (int) Math.round(v);
        System.out.println(ar);*/
        
        // floor = arredonda pra baixo
        // ceil = arredonda pra cima
        // round = arredonda tradicionalmente
        
        double ale = Math.random(); //sorteio 0 a 1
        //int n = (int) (15 + ale * (50-15)); //15 a 49
        int n = (int) (1 + ale * (6-1)); // 1 a 5
        System.out.println(n);
    }
    
}
