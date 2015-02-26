import java.util.*;

public class Entropy {
	Map<String, Double> entropy = new HashMap<String, Double>();
	Map<String, Double> counter = new HashMap<String, Double>();

	
	//Constructor for the hashtable and counter array. User sends their idArray over and both are built. 
	public Entropy(String[] idArray){
		for(String id : idArray){
			String word = id.toLowerCase();
			if(entropy.containsKey(word)){
				continue;
			}
			else
				entropy.put(word, (double) 0.0);
			
			if(counter.containsKey(word)){
				continue;
			}
			else
				counter.put(word, (double) 0.0);
		}
	}
	
	//Counts through the array and records in the counter array the amount for each element. 
	public void count(String[] clickArray){
		for(String click : clickArray){
			String word = click.toLowerCase();
			if(counter.containsKey(word)){
				double count = counter.get(word);
				counter.put(word, count + 1);
			}
			else{
				System.out.println("Error Unkown Click!");
				return;
			}
		}
		return;
	}
	
	//Does the entropy calculation and stores it to the hashmap locations
	public void calcEntropy(String[] idArray, int length){
		for(String id : entropy.keySet()){
			double prob = counter.get(id);
				if(prob == 0.0){
					continue;
				}
				prob = prob/length;
				double entr = entropy.get(id);
				double entrop = -(prob * Math.log10(prob));
				System.out.println(entrop);
				entr = entr + entrop;
				entropy.put(id, entr);

				counter.put(id, 0.0);
		}
		return;
	}
	
	//Displays All Entropy Values 
	public void displayAll(){
		for(String key : entropy.keySet()){
			System.out.println(key + ": " + entropy.get(key));
		}
	}
	
	//Displays A Specific Entropy Value
	public void displayOne(String choice){ 
		if(entropy.containsKey(choice)){
			System.out.println(choice + ": " + entropy.get(choice));
		}
		else{
			System.out.println("That choice does not exist!");
			return;
		}
		return;
	}
}
