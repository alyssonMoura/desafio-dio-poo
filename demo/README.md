# Desafio de Programação Orientada a Objetos (POO)

## Descrição do Projeto
Este projeto implementa um sistema de gerenciamento de pedidos utilizando conceitos de Programação Orientada a Objetos (POO). O sistema permite criar e manipular pedidos com seus respectivos itens e clientes.

## Estrutura do Projeto
- **Domain**: Classes que representam as entidades do negócio:
  - `Pedido`: Representa um pedido com número, data, cliente e itens
  - `Cliente`: Representa um cliente do sistema
  - `ItemPedido`: Representa os itens que compõem um pedido

## Princípios de POO Aplicados
- **Encapsulamento**: Atributos privados com getters e setters
- **Composição**: Um pedido contém vários itens (relação 1:N)
- **Associação**: Pedidos estão associados a clientes

## Como Executar
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="br.com.desafio.dio.App"
```

## Tecnologias Utilizadas
- Java
- Maven para gerenciamento de dependências