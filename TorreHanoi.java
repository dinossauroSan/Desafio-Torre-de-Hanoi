
public class TorreHanoi {
    private int[] a;
    private int[] b;
    private int[] c;
    private int numeroDePinos;

    public TorreHanoi(int numeroDePinos) {
        this.a = new int[numeroDePinos];
        this.b = new int[numeroDePinos];
        this.c = new int[numeroDePinos];
        this.numeroDePinos = numeroDePinos;
        if (numeroDePinos > 0) {
            preencherTorreA((numeroDePinos - 1), numeroDePinos);
            inverterVetor(this.a);
        }

    }

    public int[] preencherTorreA(int indice, int numeroDePinos) { //Colocar indice 1 unidade a menos do numero de pinos
        
        if (indice == -1) {
            return this.a;
        } else {
            
            this.a[indice] = (indice + 1);
            return preencherTorreA(indice - 1, numeroDePinos);
        }
        
    }

    public void inverterVetor(int[] vetor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }
    }

    public void imprimirA(int indice) {
        if (indice == a.length) {
            return;
        } else {
            System.out.print("[" + a[indice] + "] ");
            imprimirA(indice + 1);
        }
    }

    public void imprimirB(int indice) {
        if (indice == b.length) {
            return;
        } else {
            System.out.print("[" + b[indice] + "] ");
            imprimirB(indice + 1);
        }
    }

    public void imprimirC(int indice) {
        if (indice == c.length) {
            return;
        } else {
            System.out.print("[" + c[indice] + "] ");
            imprimirC(indice + 1);
        }
    }

    public void moverDisco(int[] origem, int[] destino) {
        
    }

    public void resolverHanoi(int n, int[] a, int[] b, int[] c){
        if (this.a[0] == 0 && this.b[0] == 0) {


        } else if (n == 1) {

        }
    }
}