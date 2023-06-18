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
        int matriz3[][] = new int[1][1];
        System.out.println("Bienvenidos a BINGOOO");
        System.out.println("Prescione enter para iniciar");
        while (cont1 <= 1 || cont2 <= 1) {  
            lea.nextLine();
            MatrizBola(matriz3);
            System.out.println("----------");
            System.out.println("");
            MatrizJugador1(matriz1);
            System.out.println("----------");
            System.out.println("");
            MatrizJugador2(matriz2);
            System.out.println("Jugadores logran ver si el numero de la bola aparece en uno de sus tableros? Marquen si o no");
            String respuesta = lea.nextLine();
            if (respuesta.contentEquals("si")) {
                boolean bandera = true;
                while (bandera){
                System.out.println("Que jugador tiene el numero?");
                System.out.println("");
                System.out.println("Sus obciones son las siguientes: ");
                System.out.println();
                System.out.println("1.Jugador 1");
                System.out.println("2.Jugador 2");
                System.out.println("3.Ambos");
                System.out.println();
                System.out.println("Ingrese el numero de enfrente de la opcion para escogerla: ");
                int desicion = 0;
                desicion = lea.nextInt();
                    switch (desicion) {
                        case 1:
                            boolean veamos = Validacion(desicion, matriz1, matriz2, matriz3);
                            if (veamos==true) {
                                System.out.println("Jugador 1 obtiene 1 punto");
                                cont1++;
                                System.out.println(cont1);
                            } else {
                                System.out.println("mentirosillo no hagas trampa");
                            }
                            bandera=false;
                            break;
                        case 2:
                            boolean veamos2 = Validacion(desicion, matriz1, matriz2, matriz3);
                            if (veamos2==true) {
                                System.out.println("Jugador 2 obtiene 1 punto");
                                cont2++;
                                System.out.println(cont2);
                            } else {
                                System.out.println("mentirosillo no hagas trampa");
                            }
                            bandera=false;
                            break;
                        case 3:
                            boolean veamos3 = Validacion(desicion, matriz1, matriz2, matriz3);
                            if (veamos3==true) {
                                System.out.println("Jugador 1 y 2 obtienen 1 punto");
                                cont1++;
                                cont2++;
                                System.out.println(cont1);
                                System.out.println(cont2);
                            } else {
                                System.out.println("mentirosillos no hagan trampa");
                            }
                            bandera=false;
                            break;
                        default:
                            System.out.println("Opcion invalida marque otro numero:");
                            bandera=true;
                            break;
                    }
                }
            } else {
                System.out.println("Tiremos de nuevo entonces");
                System.out.println("Marque enter nuevamente");
            }
            System.out.println("----------");
        }
        if (cont1>cont2) {
            System.out.println("Jugador 1 gana");
        }else if(cont2>cont1){
            System.out.println("Jugador 2 gana");
        }else{
            System.out.println("draw");
        }
    }

    public static void MatrizJugador1(int matriz[][]) {
        Nombres N = new Nombres();
        String x = N.NP1();
        int matriz1[][] = matriz;
        N.imprimir(x);
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                int randomizador = (int) ((Math.random() * (30 - 1)) + 1);
                matriz1[i][j] = randomizador;
                System.out.print("[" + matriz1[i][j] + "]");
            }

            System.out.println(" ");

        }
    }

    public static void MatrizJugador2(int matriz[][]) {
        Nombres N = new Nombres();
        String x = N.NP2();
        int matriz2[][] = matriz;
        N.imprimir(x);
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                int randomizador = (int) ((Math.random() * (30 - 1)) + 1);
                matriz2[i][j] = randomizador;
                System.out.print("[" + matriz2[i][j] + "]");
            }

            System.out.println(" ");

        }
    }

    public static void MatrizBola(int matriz[][]) {
        int matrizb[][] = matriz;
        System.out.println("Bola bingo");
        for (int i = 0; i < matrizb.length; i++) {
            for (int j = 0; j < matrizb[i].length; j++) {
                int randomizador = (int) ((Math.random() * (30 - 1)) + 1);
                matrizb[i][j] = randomizador;
                System.out.print("[" + matrizb[i][j] + "]");
            }

            System.out.println(" ");

        }
    }

    public static boolean Validacion(int determinante, int matriz1[][], int matriz2[][], int matriz3[][]) {
        int matrizuno[][] = matriz1;
        int matrizdos[][] = matriz2;
        int matrizD[][] = matriz3;
        int FD = 0;
        for (int i = 0; i < matrizD.length; i++) {
                for (int j = 0; j < matrizD[i].length; j++) {
                    FD = matrizD[i][j];
                }
            }
        if (determinante == 1) {
            int a = 0;
            for (int i = 0; i < matrizuno.length; i++) {
                for (int j = 0; j < matrizuno[i].length; j++) {
                    if (matrizuno[i][j] == FD) {
                        a++;
                    }
                }
            }
            if (a > 0) {
                return true;
            } else {
                return false;
            }
        } else if (determinante == 2) {
            int b = 0;
            for (int i = 0; i < matrizdos.length; i++) {
                for (int j = 0; j < matrizdos[i].length; j++) {
                    if (matrizdos[i][j] == FD) {
                        b++;
                    }
                }
            }
            if (b > 0) {
                return true;
            } else {
                return false;
            }
        } else if (determinante == 3) {
            int x = 0;
            int y = 0;
            for (int i = 0; i < matrizuno.length; i++) {
                for (int j = 0; j < matrizuno[i].length; j++) {
                    if (matrizuno[i][j] == FD) {
                        x++;
                    }
                }
            }
            for (int i = 0; i < matrizdos.length; i++) {
                for (int j = 0; j < matrizdos[i].length; j++) {
                    if (matrizdos[i][j] == FD) {
                        y++;
                    }
                }
            }
            if (x > 0 && y > 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
