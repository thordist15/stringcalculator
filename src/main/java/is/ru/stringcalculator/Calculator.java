package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){

			text = text.replaceAll("\n", ",");
	
			if(text.equals("")){
				return 0;
			}
			
			else
			{
				String[] n = splitNumbers(text);
				String e = "";
				for (String s : n) {
					if (s.indexOf("-")>=0){
						e += s + ",";
					}
				}
				if (!e.isEmpty()) {
					System.err.println("Negatives not allowed: " + e);
				}
				return sum(splitNumbers(text));
			}
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }
}


