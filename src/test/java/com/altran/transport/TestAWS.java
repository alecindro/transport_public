package com.altran.transport;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class TestAWS {
	
	
	
	public static void main(String[] args) {
		TestAWS.primo(10,20);
	}

	static Integer i = 0;
	public static void x(int[] values) {
		Arrays.stream(values).filter(x -> x>0).sorted().forEach(System.out::println);
		Integer result =  Arrays.stream(values).sorted().filter(x -> x>0).filter(x -> {
			i = i+1;
			return x != i;
		 }).findFirst().orElse(i+1);
		//System.out.println(result);
		
	}
	
	public static void test() {
		int x = runTest("B{1}O{1}]","BAXPTOLLON",0);
		System.out.println(x);
	}
	
	public static int runTest(String regex, String text, int number) {
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(text);
	    if (matcher.find()) {
	    	int count = matcher.groupCount();
	        String rep = matcher.group(0);
	        number++;
	        number = runTest(regex, rep, number);
	    }
	    return number;
	}
	
	public static void primo(int A, int B) {
		java.util.List<Integer> values = new java.util.ArrayList<>();
		while (B >= A) {
			int i = 0;
			values.add(calculate(B, i));
			
			B = B -1;
		}
		Integer result = values.stream().mapToInt(x -> x).max().orElseThrow(java.util.NoSuchElementException::new);;
		System.out.println(result);
	}
	
	private static int calculate(int numero, int qtd) {
		double value = Math.sqrt(numero);
        if(value == (int) value) {
        	if(isPrime(numero)) {
        		return qtd;
        	}
        	return calculate((int)value, qtd++);
        }
        return qtd;
    }
	
	private static boolean isPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0)
                return false;   
        }
        return true;
    }
	
}
