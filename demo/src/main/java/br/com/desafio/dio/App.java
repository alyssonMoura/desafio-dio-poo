package br.com.desafio.dio;

import br.com.desafio.dio.domain.Cliente;
import br.com.desafio.dio.domain.PedidoBalcao;
import br.com.desafio.dio.domain.PedidoDelivery;
import br.com.desafio.dio.domain.Produto;
import br.com.desafio.dio.domain.Restaurante;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Criando produtos
        Produto pizza = new Produto("Pizza Margherita", 35.0);
        Produto hamburguer = new Produto("Hambúrguer Clássico", 25.0);
        Produto refrigerante = new Produto("Refrigerante", 5.0);

        // Criando menu
        Produto[] menu = { pizza, hamburguer, refrigerante };

        // Criando restaurante
        Restaurante meuRestaurante = new Restaurante("Sabor Italiano", menu);

        // Criando cliente
        Cliente cliente1 = new Cliente("João", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria", "Rua B, 456");

        // Criando pedidos
        Produto[] produtosPedido1 = { pizza, refrigerante };
        PedidoDelivery pedido1 = meuRestaurante.criarPedidoDelivery(cliente1, produtosPedido1, "Rua C, 789");

        Produto[] produtosPedido2 = { hamburguer, refrigerante };
        PedidoBalcao pedido2 = meuRestaurante.criarPedidoBalcao(cliente2, produtosPedido2, 5);

        // Exibindo pedidos
        pedido1.exibirPedido();
        System.out.println("--------------------");
        pedido2.exibirPedido();
    }
}
