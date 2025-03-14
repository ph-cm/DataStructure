package MainAlgorithms;

public class BigONotation {
/* Forma de denotar desempenho do algoritmo porem, nao eh uma medida de performance
 * trata-se mais sobre escalabilidade com o tamanho do input
 * ou seja, eh uma denotacao sobre quanto aquele algoritmo escala com o aumento de inputs
 * 
 * se o input for muito pequeno, provavelmente qualquer solucao vai ser "boa" 
 * 
 * -complexidade temporal: quantas vezes os elementos sao percorridos 
 * tipos:
 * 	O(1):-tempo constante
 * 		 -memoria constante
 * 	
 * 	O(LOG N):-tempo aumenta em log(n)
 * 			 -Conforme haja um aumento do input, o tempo aumenta linearmente
 * 			  ou seja, se dobrar a quantidade de elementos, o tempo de execucao aumenta
 * 			  de maneira logaritmica (as vezes com o dobro do input aumenta somente 1 no tempo de execucao)
 * 			 -EX: binary search (encontrar um elemento tendo o meio do array 
 * 				  como referencia de procurador
 	O(N):-tempo 
 		 -percorrer todos os elementos(considerando o pior caso de todos)
 		 -se dobrar o array, o tempo de execucao dobra(escala na mesma medida do aumento do input)
 	
 	O(N LOG N):- O(N)=percorrer os elementos
 				 O(LOG N)=divisao e ordenacao dos elementos
 			   -Geralmente todos os sorts sao n log n(quicksort, mergesort)
 			   -Divide and Conquer
 	O(N^2):-Loop duplo for dentro de um for
 		   
 	O(2^N), O(raiz de N), O(N!): impossivel cair em entrevista(solucoes muito ruins de escalabilidade
 	
 	*/
}
