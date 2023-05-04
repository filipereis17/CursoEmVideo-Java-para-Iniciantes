/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cursoemvideo.idiomadosistema;

import java.util.Locale;

/**
 *
 * @author Filipe Reis
 */
public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(loc.getDisplayLanguage());
    }
}
