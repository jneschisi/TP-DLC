package utn.dlc.tp;

public class Termino {
    private String palabra;
    private int nr;
    private int max_tf;

    public String getPalabra() {
        return palabra;
    }

    public int getNr() {
        return nr;
    }

    public int getMax_tf() {
        return max_tf;
    }

    public Termino(String palabra) {
        this.palabra = palabra;
        this.nr = 1;
        this.max_tf = 0;
    }

    public void incrementarNr(){
        nr++;
    }

    @Override
    public String toString() {
        return " nr=" + nr + " | palabra=" + palabra + "<br>";
    }
}