public class MyRunnable implements Runnable {
    private final int linha;
    private final Matriz origem;
    private final Matriz destino;

    public MyRunnable(int linha, Matriz origem, Matriz destino) {
        this.linha = linha;
        this.origem = origem;
        this.destino = destino;
    }

    @Override
    public void run() {
        for (int j = 0; j < origem.getColunas(); j++) {
            int valor = origem.getValor(linha, j);
            destino.setValor(j, linha, valor);
        }
    }
}
