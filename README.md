## Projeto de um contador de palavras
Trabalho de faculdade que lê palavras de um TXT e as ordene usando busca linear
fonte: https://codefreela.com/job/93603-trabalho-de-faculdade-que-le-palavras-de-um-txt-e-as-ordene-usando-busca-linear

## Proposta
Projeto de um contador de palavras que leia um texto de um arquivo txt e ordene usando busca linear.
Você foi convidado a escrever um programa que liste todas as diferentes palavras que existem no livro preferido do Samuel, as palavras do livro estarão armazenadas em arquivo texto. 
Considere que uma palavra é definida como uma sequência de letras, maiúsculas ou minúsculas, palavras com apenas uma letra também deverão ser consideradas. 
Ademais o seu programa deverá ser "CaSe InSeNsItIvE", por exemplo, palavras como "Apple", "apple" ou "APPLE" deverão ser consideradas como mesma palavra. 
Para garantir que não tenhamos palavras repetidas no dicionário do Samuel, para cada palavra lida no arquivo texto deve feita uma busca no dicionário, caso a palavra já conste no dicionário a palavra lida deve ser descartada, caso contrário a palavra deve ser inserida no dicionário de forma a manter a ordem alfabética.

Importante: 
     • Para armazenar o dicionário de palavras use um vetor de String, não sendo permito o uso de classes prontas de lista do Java para armazenar as palavras, por exemplo a classe Arraylist. 
     Considere que no arquivo texto não teremos mais de 100 palavras diferentes, ou seja, você pode declarar um vetor de String com 100 posições. 
     • A busca no dicionário deve ser implementada utilizando uma função recursiva (sem loops) que faz busca linear no vetor de palavras (vetor de String). 
     • Para inserir uma nova palavra no vetor de String use uma função recursiva (sem loops). 
     Importante, não é para inserir todas as palavras no vetor e depois ordenar, e sim a cada palavra nova, esta deverá ser inserida no vetor de palavras que continuará ordenado.

Entrada do programa:
O arquivo de entrada contém várias linhas de texto, cada uma delas com várias palavras separadas por um espaço em branco (“ “), o fim da entrada é determinado por um ponto (“.”) em uma linha com somente esse caractere. 
Exemplos de arquivos de entrada.:
     texT Adventures in Disneyland Two blondes were going to Disneyland when they came to a fork in the road The sign read disneyland LEFT So they went home
     
Dicas para trabalhar com Strings no Java: 
    • Para separar as palavras armazenadas em uma linha use método split(“ ”) da classe String, cuidado que o split pode gerar palavras vazias “”. 
    • Para comparar duas Strings e descobrir qual vem antes da outra use o método compareTo() da classe String 
    • Para converter os caracteres da String todos em letras minúsculas use a função toLowerCase() 
    • Para saber mais sobre Strings acessem:
        https://www.devmedia.com.br/java-string-manipulando-metodos-da-classe-string/29862
        https://www.guj.com.br/t/metodo-compareto/334450/2 

Saída do programa:
Você deve imprimir uma lista de diferentes palavras que aparecem no texto, uma palavra por linha. 
Todas as palavras devem ser impressas com letras minúsculas, em ordem alfabética. 
No final da lista você deve informar quantas palavras diferentes existe no texto.
Exemplo de saída:
     a adventures blondes came disneyland fork going home in left read road sign so text the they to two went were when 
     total de palavras diferentes no dicionario=22

## Tópicos
leia um texto de um arquivo txt
ordene usando busca linear
liste todas as diferentes palavras
dicionário de palavras use um vetor de String[100]
	busca no dicionário implementada utilizando uma função recursiva
	inserir uma nova palavra no vetor de String use uma função recursiva
imprimir uma lista de diferentes palavras / uma por linha / minusculas / ordem alfabética

