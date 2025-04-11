package br.com.desafio.dio.domain;

public class Restaurante {
    String nome;
    Produto[] menu;

    public Restaurante(String nome, Produto[] menu) {
        this.nome = nome;
        this.menu = menu;
    }

    public PedidoDelivery criarPedidoDelivery(Cliente cliente, Produto[] produtos, String enderecoEntrega) {
        return new PedidoDelivery(cliente, produtos, enderecoEntrega);
    }

    public PedidoBalcao criarPedidoBalcao(Cliente cliente, Produto[] produtos, int numeroMesa) {
        return new PedidoBalcao(cliente, produtos, numeroMesa);
    }

}
