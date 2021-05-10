



public class FizzBuzz {
	public String generateFizzBuzz(Integer data) {
		if(data % 5 == 0 && data % 3 == 0) return "FizzBuzz";
		if(data % 3 == 0) return "Fizz";
		if(data % 5 == 0) return "Buzz";
		
		return data.toString();
	}
	
	public String createFizzBuzzSequence(int limit) {
		String result = "";
		for(int i = 1; i <= limit; i++) {
			result+=generateFizzBuzz(i) + ",";
		}
		
		result = result.substring(0, result.length()-1);
		
		return result;
	}
}

