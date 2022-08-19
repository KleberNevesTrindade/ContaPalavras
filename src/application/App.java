package application;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        final String ARQ = "/home/kleber/Documentos/WS-Eclipse/CodeFreela/ContaPalavras/src/application/in.txt";
        String leitura = "";

/*        File file = new File(ARQ);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println();
                System.out.println(sc.nextLine());
            }
        }
*/      try (
            FileReader fr = new FileReader(ARQ);
            BufferedReader br = new BufferedReader(fr);
        ){
            while (br.ready()){
                leitura += br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    /*  finally {
            if (sc != null) {
                sc .close();
            }
        }
        */
        //System.out.println(leitura);
        System.out.println("---------------");
        String[] entrada = leitura.toLowerCase().split(" ");
        int len = entrada.length;
        String[] saida = new String[len];
        String temp = "";
        for (int i = 0; i<len; i++){
            for (int j=i+1; j<len; j++){
                if (entrada[i].compareTo(entrada[j]) > 0) {
                    temp = entrada[i];
                    entrada[i] = entrada[j];
                    entrada[j] = temp; 
                    saida[i] = entrada[i];                  
                }
                else if (entrada[i].compareTo(entrada[j]) < 0) {
                    saida[i] = entrada[i];
                }
                else {
                    break;
                }
            }
        }
        for (String s : saida){
            System.out.println(s);
        }
    }
}
