servidor-de-impressao
=====================

Sobre o exercício, fiz algumas observações abaixo, mas para não emperrar a entrega desenvolvi a solução sugerindo detalhes no código.

-Criei a Interface para a fila e uma implementação da mesma no formato circular, juntamente com suas Exceções.

-Criei 2 produtores(no exercício não pedia, mas vi que na saída do console possuíam 2) adicionando Jobs na fila e 1 consumidor removendo itens da fila enquanto ela não estivesse vazia.

-Criei uma classe para fazer um teste unitário com o Junit, coisa simples só pra me ajudar no desenvolvimento e nas tarefas repetitivas.

-Observei que a Thread da Printer possui o método HALT, mas não consegui achar o momento que ele seria acionado, mas implementei o método mesmo assim.

Desenvolvi o projeto no Eclipse, logo, para executar o mesmo é só importar e rodar a Classe principal PrinterApp ou por linha de comando mesmo.
