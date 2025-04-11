package br.com.desafio.dio.domain;

public class Pedido {

    private Cliente cliente;
    private Produto[] produtos;
    private int numero;
    private static int proximoNumero = 1;

    public Pedido(Cliente cliente, Produto[] produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.numero = proximoNumero++;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("Pedido #" + numero + " - Cliente: " + cliente.getNome());
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + ": R$" + produto.getPreco());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}
