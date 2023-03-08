public class Main {
    public static void main() {
        //Primera parte
        sumar3(5, 10, 15);
        //Segunda parte
        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.print(miCoche.puertas);
    };

    public static int sumar3(int a, int b, int c) {
        int resultado = a + b + c;
        return resultado;
    }
}

class Coche {
    public int puertas = 4;

    public void addPuerta() {
        this.puertas++;
    }
}