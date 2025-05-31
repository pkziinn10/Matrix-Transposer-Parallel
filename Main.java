public class Main {
    public static void main(String[] args) {
        Matriz matrizOriginal = new Matriz(3, 4);

        System.out.println("Matriz original:");
        matrizOriginal.imprimir();

        MatrizTranspostaService transpositor = new MatrizTranspostaService();
        Matriz matrizTransposta = transpositor.transporParalelamente(matrizOriginal);

        System.out.println("\nMatriz transposta:");
        matrizTransposta.imprimir();
    }
}
