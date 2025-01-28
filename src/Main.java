public class Main {
    public static void main(String[] args) {
        System.out.println("Boas vindas ao projeto de calculadora básica para testar os conhecimentos em Git");

        System.out.println("1 + 1 = " + soma(1,1));
        System.out.println("2 - 1 = " + subtracao(2,1));
        System.out.println("5 * 2 = " + multiplicacao(5,2));
        System.out.println("10 / 2 = " + divisao(10,2));
    }

    public static int soma(int x, int y) {
        return x + y;
    }

    public static int subtracao(int x, int y) {
        return x - y;
    }

    public static int multiplicacao(int x, int y) {
        return x * y;
    }

    public static int divisao(int x, int y) {
        return x / y;
    }
}