package kotlintests.services

class FibonacciList {
	fun calculate(limit: Int): List<Int>{
		val numbersList = mutableListOf<Int>();
		return recursiveCalculator(numbersList, limit);
	}
	
	private fun recursiveCalculator(list: MutableList<Int>, limit: Int): List<Int>{
		if (list.size == limit){
			return list;
		}
		else{
			val numberToAdd: Int;
			if (list.size == 0){
				numberToAdd = 0;
			}
			else if (list.size == 1){
				numberToAdd = list.last() + 1;
			}								
			else{
				numberToAdd = list.takeLast(2).sum();			
			}
			list.add(numberToAdd);
			return recursiveCalculator(list, limit);
		}
	}
}