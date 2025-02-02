package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
    	StringBuilder output = new StringBuilder("");
        Boolean both = false;
        if (num <= 0) {
          return output.toString();
        }
        if (num % 3 != 0 && num % 5 != 0) { 
          return String.valueOf(num);
        }
        if (num % 3 == 0) {
          output.append("Fizz");
          both = true;
        }
        if (num % 5 == 0) {
          output.append("Buzz");
        }
        
        return output.toString();
	}
	
	String processNumbers (int[] numList)
	{
    	StringBuilder output = new StringBuilder("");
        for (int i = 0; i < numList.length; i++) {
          int test = numList[i];
          if (test <= 0) {
            continue;
          }
          output.append(processNumber(test));
          if (i != numList.length -1) {
            output.append(", ");
          }
        }
        return output.toString();
	}

}
