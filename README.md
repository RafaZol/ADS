🎟️ Sistema de Venda de Ingressos para Eventos
Este projeto foi desenvolvido como parte de uma prova prática da faculdade,
com o objetivo de aplicar conceitos fundamentais de programação orientada a objetos em Java. O sistema simula a venda de ingressos para shows e eventos, incorporando regras reais de negócio e validações.

📌 Descrição do Projeto
Você foi contratado para desenvolver um sistema de venda de ingressos para shows e eventos. O sistema contempla:

Cadastro de eventos com informações obrigatórias

Venda de ingressos nominais com diferentes categorias

Cálculo dinâmico de valores conforme o tipo de ingresso

Controle de capacidade máxima do evento

Relatórios simples de vendas. 

🗓️ Evento
Cada evento possui:

Nome

Data

Valor único do ingresso

Capacidade máxima

Lista de ingressos vendidos

Métodos principais:

venderIngresso(): adiciona um ingresso à lista, respeitando a capacidade

getQuantidadeIngressosVendidos(): retorna o total de ingressos vendidos

🎫 Ingresso
Todo ingresso é nominal, contendo:

Nome do comprador

CPF

Evento relacionado

Categorias:

Pista: valor base do evento

VIP: valor base + 30%

Camarote: valor base + 60%

Métodos principais:

calcularValor(): calcula o valor conforme a categoria

mostrarResumo(): exibe nome, CPF, nome do evento e data

imprimirValor(): retorna o tipo do ingresso com o valor calculado
