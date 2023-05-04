/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Filipe Reis
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso eh um(a)" );
        /*switch (perna) {
        case 1:
        tipo = "Saci";
        break;
        case 2:
        tipo = "Bipede";
        break;
        case 4:
        tipo = "Quadrupede";
        break;
        case 6, 8:
        tipo = "Aranha";
        break;
        default:
        tipo = "ET";            
        }*/
        tipo = switch (perna) {
            case 1 -> "Saci";
            case 2 -> "Bipede";
            case 4 -> "Quadrupede";
            case 6, 8 -> "Aranha";
            default -> "ET";
        };
        System.out.println(" "+tipo);
    }
    
}
