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
        return null;
    }
}
