package Model;

public class Calculadora {

    public static Double somar(Double n1, Double n2) {
        return n1 + n2;
    }

    public static Double subtrair(Double n1, Double n2) {
        return n1 - n2;
    }

    public static Double multiplicar(Double n1, Double n2) {
        return n1 * n2;
    }

    public static Double dividir(Double n1, Double n2) {
        return n1 / n2;
    }
    public static Double potencia(Double n1, Double n2){
        return Math.pow(n1, n2);
    }

}
