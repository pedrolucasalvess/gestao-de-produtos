import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto eletronico1 = new Eletronico("Smartphone", 1500);
        Produto alimento1 = new Alimento("Maçã", 3.50);

        estoque.adicionarProduto(eletronico1);
        estoque.adicionarProduto(alimento1);

        System.out.println("Preços com 10% de desconto:");
        estoque.exibirPrecosComDesconto(10);

        System.out.println("\nPreços com 30% de desconto:");
        estoque.exibirPrecosComDesconto(30);
    }
}
