class Eletronico extends Produto {

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        if (porcentagem > 20) {
            porcentagem = 20;
        }
        return preco - (preco * porcentagem / 100);
    }
}

