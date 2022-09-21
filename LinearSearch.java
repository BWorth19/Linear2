public class LinearSearch 
{
	public static void main(String[] args) 
	{
		String sentence = "In the beginning God created the heavens and the earth";
		String search1 = "the";
		String search2 = "beginning";
		String search3 = "recreate";
		SearchString(sentence, search1);
		SearchString(sentence, search2);
		SearchString(sentence, search3);
		
	}
	static int SearchString(String str, String word)
	{
	    // split the string by spaces in a
	    String a[] = str.split(" ");
	 
	    // search for pattern in a
	    int count = 0;
	    for (int i = 0; i < a.length; i++)
	    {
	    // if match found increase count
	    if (word.equals(a[i]))
	        count++;
	    }
	    System.out.println("Occurrence of '" + word + "': " + count);
	    return count;
	}

}
