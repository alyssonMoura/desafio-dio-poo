package br.com.desafio.dio.domain;

public class PedidoDelivery extends Pedido {
    String enderecoEntrega;

    public PedidoDelivery(Cliente cliente, Produto[] produtos, String enderecoEntrega) {
        super(cliente, produtos);
        this.enderecoEntrega = enderecoEntrega;
    }

    @Override
    public void exibirPedido() {
        super.exibirPedido();
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
    }

}
