import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos pinos a torre vai ter: ");
        int numeroDePinos = teclado.nextInt();

        TorreHanoi minhaTorre = new TorreHanoi(numeroDePinos);
        minhaTorre.imprimirA(0);
        
    }
}