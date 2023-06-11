/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    /*
    ingeniera este es el avance en cuestion, llevamos el cuerpo y la idea ya formados nada mas nos hace falta completar condiciones
    ademas de la validacion para poder terminar con el proyecto, eso tomaria unos 2 dias a lo maximo, luego de eso veremos como 
    implementar clases y ver si lo podemos hacer mas interesante, ya con eso terminariamos
    */
    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        System.out.println("Bienvenidos a BINGOOO");
        while (cont1 < 7 || cont2 < 7) {
            MatrizBola();
            System.out.println("----------");
            System.out.println("");
            MatrizJugador1();
            System.out.println("----------");
            System.out.println("");
            MatrizJugador2();
            System.out.println("Jugadores logran ver si el numero de la bola aparece en uno de sus tableros? Marquen si o no");
            String respuesta=lea.nextLine();
            if (respuesta=="si"||respuesta=="Si") {
                System.out.println("Que jugador tiene el numero?");
                System.out.println("Sus obciones son las siguientes: ");
                System.out.println();
                System.out.println("1.Jugador 1");
                System.out.println("2.Jugador 2");
                System.out.println("3.Ambos");
                System.out.println();
                System.out.println("Ingrese el numero de enfrente de la opcion para escogerla: ");
                int desicion=0;
                switch(desicion){
                    case 1:
                        
                        break;
                     case 2:
                        
                        break;
                     case 3:
                        
                        break;
                     default:
                        
                        break;
                }
            }else{
                System.out.println("Tiremos de nuevo entonces");
            }
        }

    }
    
    
    public static void MatrizJugador1(){
        int matriz[][] = new int[3][3];
        System.out.println("Tablero jugador 1");
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int randomizador = (int) ((Math.random() * (30 - 1)) + 1);
                matriz[i][j] =randomizador;
                System.out.print("[" + matriz[i][j] + "]");    
            }
            
            System.out.println(" ");

        }   
    }
    
    public static void MatrizJugador2(){
        int matriz[][] = new int[3][3];
        System.out.println("Tablero jugador 2");
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int randomizador = (int) ((Math.random() * (30 - 1)) + 1);
                matriz[i][j] =randomizador;
                System.out.print("[" + matriz[i][j] + "]");    
            }
            
            System.out.println(" ");

        }   
    }
    
    public static void MatrizBola(){
        int matriz[][] = new int[1][1];
        System.out.println("Bola bingo");
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int randomizador = (int) ((Math.random() * (30 - 1)) + 1);
                matriz[i][j] =randomizador;
                System.out.print("[" + matriz[i][j] + "]");    
            }
            
            System.out.println(" ");
    
         }
    }
    
    public static boolean Validacion(int matriz1[][],int matriz2[][]){
            for (int i = 0; i < 10; i++) {
            
        }
        return true;
    }
}
