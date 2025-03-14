package MainAlgorithms;

import java.util.HashMap;
import java.util.Map;

/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]
 */

/*
 * Eh possivel resolver por forca bruta O(N^2) = solucao possivel porém, não é a ideal
 * Usando um hashmap a solucao fica mais refinada
 * 	 -dado um target(13), ao escolher o primeiro elemento(2), calcula-se 
 * 	  qual o outro elemento necessario para alcancar o target(11)
 * 	  esse elemento torna-se a chave do hashmap que, ao percorrer o array,
 * 	  sera a chave procurada. Ou seja, calcular o complemento do elemento escolhido
 * 
 * 			Ver se um item esta no hashmap eh O(1) pois, eh acesso a memoria
 * 
 * 		1: inicializar hashmape
 * 		2: for loop por itens:
 * 			3: checar se o complemento do item existe:
 * 				4: se existir, retorna posicao complemento e posicao atual
 * 			5:Caso nao exista, adicionar complemento e posicao ao hashmap
 * 
 * 		Complexidade espacial: O(N)
 * 		Complexidade temporal: O(N)
 * 
 * **Problema do hashmap: inicializar custa tempo de execucao(hashmap calcula onde na memoria ele vai armazenar esse item)
 * 
 * */

public class TwoSum {
	public static void main(String[] args)
	{
		TwoSum obj = new TwoSum();
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] result = obj.twoSum(nums,  target);
		
		System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
	}
	
	public int[] twoSum(int[] nums, int target)
	{
		Map<Integer, Integer> numMap = new HashMap<>();
		int n = nums.length;
		
		for(int i = 0; i < n; i++)
		{
			int complement = target - nums[i];
			if(numMap.containsKey(complement))
				{
					return new int[] {numMap.get(complement), i};	
				}
				numMap.put(nums[i], i);
		}
		return new int[] {};
	}
	
}
