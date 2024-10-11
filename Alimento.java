class Alimento extends Produto {

    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        if (porcentagem > 50) {
            porcentagem = 50;
        }
        return preco - (preco * porcentagem / 100);
    }
}