package com.cod;

public class Tablero {
    private Tablero(){
    }
    private static Tablero instance=null;
    public static Tablero getInstance(){
        if(instance==null){
            instance=new Tablero();
        }
        return instance;
    }
    private String cifraAleatoria;
    private String cifraSecuencia;
    private String cifraPista;

    public String getCifraAleatoria() {
        return cifraAleatoria;
    }

    public void setCifraAleatoria(String cifraAleatoria) {
        this.cifraAleatoria = cifraAleatoria;
    }

    public String getCifraSecuencia() {
        return cifraSecuencia;
    }

    public void setCifraSecuencia(String cifraSecuencia) {
        this.cifraSecuencia = cifraSecuencia;
    }

    public String getCifraPista() {
        return cifraPista;
    }

    public void setCifraPista(String cifraPista) {
        this.cifraPista = cifraPista;
    }
}
