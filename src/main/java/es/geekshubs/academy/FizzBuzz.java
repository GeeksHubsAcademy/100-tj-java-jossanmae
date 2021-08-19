package es.geekshubs.academy;

public class FizzBuzz {

	/**
	 * Apply Method
	 * 
	 * @param count
	 * @return
	 */
	public String apply(final int count) {
		final String GEEKS = "Geeks";
		final String HUBS = "Hubs";
		String output = "";
		
		for(int i=1; i<=count; i++) {
			if(!(i%3 == 0 || i%5 == 0))
				output += String.valueOf(i);
			else {
				if(i%3 == 0)
					output += GEEKS;
				if(i%5 == 0)
					output += HUBS;				
			}
				
			output += "\n";
		}
		
		return output;
	}

}
