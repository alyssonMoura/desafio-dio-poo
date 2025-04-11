package br.com.desafio.dio.domain;

public class PedidoBalcao extends Pedido {
    int numeroMesa;

    public PedidoBalcao(Cliente cliente, Produto[] produtos, int numeroMesa) {
        super(cliente, produtos);
        this.numeroMesa = numeroMesa;
    }

    @Override
    public void exibirPedido() {
        super.exibirPedido();
        System.out.println("Mesa: " + numeroMesa);
    }

}
