public class Main {
    public static void main(String[] args) {
        condicionalNumeroIf();
        bucleNumeroWhile();
        bucleNumeroDoWhile();
        bucleNumeroFor();
        switchEstacion();
    }

    public static void condicionalNumeroIf() {
        Integer numeroIf = 5;
        if (numeroIf > 0) {
            System.out.print(numeroIf + " es postivo\n");
        } else if (numeroIf < 0) {
            System.out.print(numeroIf + " es negativo\n");
        } else {
            System.out.print(numeroIf + " es cero\n");
        }
    };

    public static void bucleNumeroWhile() {
        Integer numeroWhile = 2;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.print("numeroWhile = " + numeroWhile + "\n");
        }
    };

    public static void bucleNumeroDoWhile() {
        Integer numeroDoWhile = 2;
        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.print("numeroDoWhile = " + numeroDoWhile + "\n");
        } while (false);
    };

    public static void bucleNumeroFor() {
        for(int numeroFor=0; numeroFor<=3; numeroFor++) {
            System.out.print("numeroFor = " + numeroFor + "\n");
        }
    };

    public static void switchEstacion() {
        String estacion = "PRIMAVERA";
        switch (estacion) {
        case "INVIERNO":
            System.out.print("Estamos en invierno\n");
            break;
        case "VERANO":
            System.out.print("Estamos en verano\n");
            break;
        case "OTONO":
            System.out.print("Estamos en otono\n");
            break;
        case "PRIMAVERA":
            System.out.print("Estamos en primavera\n");
            break;
        default:
            System.out.print("La informacion ingresada no corresponde a ninguna estacion\n");
        }
    };
}