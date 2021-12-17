package com.cod;
import java.util.Scanner;

public class Funciones {

    public static boolean generarAleatorio(Tablero auxtablero) {
        auxtablero.setCifraAleatoria("54321");
        return true;
    }

    public static boolean pedirSecuencia(Tablero auxtablero) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número de cinco cifras");
        String numero=scanner.next();
        auxtablero.setCifraSecuencia(numero);
        return true;
    }
    /**
     *
     * @param cifraAleatoria cifra generada
     * @param cifraSecuencia cifra introducida por el jugador
     * @return
     */
    public static boolean comprobarSecuencia(String cifraAleatoria, String cifraSecuencia) {
        //comparar
        return cifraAleatoria.equals(cifraSecuencia);
    }

    public static void mostrar(String mensaje) {

    }

    public static String mostrarPista(Tablero tablero) {
        //String.charAt
        String aleatorio=new String(tablero.getCifraAleatoria());
        String secuencia=new String(tablero.getCifraSecuencia());
        tablero.setCifraPista("-----");
        String pista=new String(tablero.getCifraPista());
        for(int i=0; i<5; i++) {
            if (aleatorio.charAt(i) == secuencia.charAt(i)) {
                pista.replace(pista.charAt(i), 'O');
            } else {
                for (int j = 0; j < 5; j++) {
                    pista.replace(pista.charAt(i), 'X');
                    break;
                }
            }
        }
        System.out.println(tablero.getCifraAleatoria());
        return tablero.getCifraAleatoria();
    }
}
