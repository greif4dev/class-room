# Sala-de-Aula
### Projetinho em Java utilizando o conceto de Associação e Relacionamento entre classes

## Regras de Negócio:

Uma porta tem uma cor e um código para cada uma delas, e uma indicação se está aberta ou fechada.

Uma sala tem nome, uma porta de entrada, uma porta de saída, um número máximo de pessoas
que podem estar dentro da sala e quantas pessoas estão na sala.

A porta deve ser criada fechada e com uma cor (1, 2 ,3 ,4 ou 5) recebida via parâmetro. Se
parâmetro inválido, a porta deve ser pintada de branco.

A classe Porta deve receber métodos para:

- retornar código da cor
- retornar cor da porta
- retornar o estado da porta
- alterar cor da porta
- alterar para o próxima cor de acordo com os códigos
- abrir porta
- fechar porta

A sala deve ser criada vazia, com nome, com duas portas e com o número máximo de pessoas que a
sala suporta. Estes dados devem ser recebidos via parâmetros.

A classe Sala deve receber métotodos para:

- retornar nome da sala
- retornar a capacidade de lotação da sala
- retornar quantas pessoas estão na sala
- retornar se a sala está lotada de acordo com a quantidade de pessoas presentes
- retornar true se entrou e false se não foi possível entrar. Só pode entrar se a sala não está
cheia. Quando entrar o primeiro, a porta de entrada deve ser aberta. Quando entrar o último (sala
fica cheia), a porta de entrada deve ser fechada.
- retorna true se saiu e false se não foi possível sair. Só pode sair, se há alguém na sala. Quando
sair de uma sala cheia, abrir a porta de entrada. Quando sair o primeiro, a porta de saída deve ser
aberta. Quando sair o último, as duas portas devem ser fechadas e pintadas.
- retornar todos os dados da sala e de suas portas

Autor: João Pedro Greif (greif4dev) :)


