
public class TorreHanoi {
    private int[] a;
    private int[] b;
    private int[] c;
    private int numeroDePinos;

    public TorreHanoi(int numeroDePinos) {
        this.a = new int[numeroDePinos];
        this.b = new int[numeroDePinos];
        this.c = new int[numeroDePinos];
        if (numeroDePinos > 0) {
            preencherTorreA((numeroDePinos - 1), numeroDePinos);
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

    public void imprimirA(int indice) {
        if (indice == a.length) {
            return;
        } else {
            System.out.print("[" + a[indice] + "] ");
            imprimirA(indice + 1);
        }
    }

    public void resolverHanoi(int n, int[] a, int[] b, int[] c){
        
    }
}