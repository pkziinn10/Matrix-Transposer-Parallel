public class Matriz {
    private int linhas;
    private int colunas;
    private int[][] dados;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
        preencherAleatoriamente();
    }

    private void preencherAleatoriamente() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public int getValor(int linha, int coluna) {
        return dados[linha][coluna];
    }

    public void setValor(int linha, int coluna, int valor) {
        dados[linha][coluna] = valor;
    }

    public void imprimir() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(dados[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
