# Q1-Siemens
Escreva um programa que imprime cada número de 1 até 100 em uma nova linha.

## Teste a validação

O código foi desenvolvido com a sintaxe de JAVA. No arquivo enviado, já providenciei um método main incluindo uma chamada do método imprimeIntervalo com os parâmetros corretos (intervalo iniciando em 1 e terminando em 100). O método pode ser testado com a execução do método  main. Para testagem de intervalos numéricos diferentes, os valores das variáveis valorInicial e valorFinal podem ser alterados conforme for necessário. A variável valorInicial indica o primeiro número que será impresso, e a variável valorFinal indica o último número a ser impresso.

## Comentários

1 - A função poderia ter sido elaborada sem uso de parâmetros, sendo restrita ao intervalo 1-100.
Optei por incluir parâmetros para possibilitar uma testagem mais detalhada da função e um escopo
de uso mais amplo. A inclusão não afetou o número de linhas ou a eficiência da função.

2- Como o problema exigia o mínimo de linhas possível para o código, optei por estruturar o código com algumas peculiaridades. 
A cada iteração, o código inicia assumindo que texto a ser impresso (sempre determinado pela variável textoSaida") será o número referente àquela iteração (i). Esta assunção poupa linhas que seriam usadas para definir uma condição específica para o número não ser múltiplo de 3 ou de 5.
```java
			String textoSaida = Integer.toString(i);
```
O código procede, então, para testar se o número é múltiplo de 3. Coloquei um operador ternário (poupando mais linhas para o caso de outro condicional) aninhado a esta condição para avaliar se o número é apenas múltiplo de 3 (textoSaida="Foo") ou se é, ao mesmo tempo, múltiplo 5 (textoSaida="FooBaa"). 
```java
			if (i%3==0) {
				textoSaida = (i%5!=0)?"Foo":"FooBaa";
				}
```
Se o número não é múltiplo de 3, testa-se se ele é  múltiplo de 5 (textoSaida="Baa"). Por fim, é impresso o valor na variável "textoSaida".
```java
			else if (i%5==0) {
				textoSaida = "Baa";
				}
			System.out.println(textoSaida);
```

3 - O dilema central do problema em questão é a escolha entre iteração ou recursão como método para percorrer o intervalo de números. Para o intervalo numérico 1-100, há poucas diferenças entre as uas abordagens, optei pela iteração pelas seguintes razões.

3.1- Em primeiro lugar, o código iterativo é, de modo geral, mais eficiente no que tange o uso de memória. Para o intervalo 1-100, não há diferenças consideráveis entre o código iterativo e o recursivo, mas se o intervalo for ampliado para maiores magnitudes, a difereça será considerável (incluindo o fato do método iterativo não estar sujeito a estouro de pilhas - stack overflow).

3.2- Em segundo lugar, o código iterativo ficou ligeiramente mais curto que o código recursivo. Segue abaixo, para fins de comparação, um exemplo da função recursiva para o problema em questão

3.3 - Código recursivo:

```java
	public static void imprimeIntervaloRecursivo (int valorInicial, int valorFinal) {
		String textoSaida = Integer.toString(valorInicial);
		if (valorInicial>valorFinal) {
			return;
			}
		else if (valorInicial%3==0) {
			textoSaida= (valorInicial%5!=0)?"Foo":"FooBaa";
			}
		else if (valorInicial%5==0) {
			textoSaida= "Baa";
			}
		System.out.printlntextoSaida
		imprimeCemRecursivo(valorInicial+1, valorFinal);
	}
```
