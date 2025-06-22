public class DadosSorteados {

    public static void main(String[] args) {
        int qtdDados = 1; // padrão 1 dado

        
        if (args.length > 0) {
            try {
                qtdDados = Integer.parseInt(args[0]);
                if (qtdDados < 1) {
                    System.out.println("Quantidade de dados deve ser no mínimo 1. Usando 1 dado.");
                    qtdDados = 1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Parâmetro inválido. Usando 1 dado.");
            }
        }

        for (int i = 0; i < qtdDados; i++) {
            int valor = (int) (Math.random() * 6) + 1;
            System.out.println("Dado " + (i+1) + ": " + valor);
            imprimirDado(valor);
            System.out.println();
        }
    }

    
    public static void imprimirDado(int valor) {
        switch (valor) {
            case 1:
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   *   |");
                System.out.println("|       |");
                System.out.println("+-------+");
                break;
            case 2:
                System.out.println("+-------+");
                System.out.println("| *     |");
                System.out.println("|       |");
                System.out.println("|     * |");
                System.out.println("+-------+");
                break;
            case 3:
                System.out.println("+-------+");
                System.out.println("| *     |");
                System.out.println("|   *   |");
                System.out.println("|     * |");
                System.out.println("+-------+");
                break;
            case 4:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("|       |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
            case 5:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("|   *   |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
            case 6:
                System.out.println("+-------+");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("+-------+");
                break;
            default:
                System.out.println("Valor inválido do dado!");
        }
    }
}
