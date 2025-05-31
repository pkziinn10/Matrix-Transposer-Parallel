public class MatrizTranspostaService {
    public Matriz transporParalelamente(Matriz original) {
        int novaLinhas = original.getColunas();
        int novaColunas = original.getLinhas();
        Matriz transposta = new Matriz(novaLinhas, novaColunas);

        Thread[] threads = new Thread[original.getLinhas()];

        for (int i = 0; i < original.getLinhas(); i++) {
            threads[i] = new Thread(new MyRunnable(i, original, transposta));
            threads[i].start();
        }

        aguardarThreads(threads);
        return transposta;
    }

    private void aguardarThreads(Thread[] threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Erro na execução das threads: " + e.getMessage());
            }
        }
    }
}
