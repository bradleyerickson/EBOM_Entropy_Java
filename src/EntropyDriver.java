public class EntropyDriver {

	public static void main(String[] args) {
		String[] idArray = {"1","2","3","4","5","6"};  //Array of possible click ids
		String[] clickArray = {"1", "2", "1", "3", "4", "5", "6", "6", "5", "4", "3", "2", "1", "1", "2", "4", "5"}; //Array of clicks that happened by id reference
		String[] clickArray2 = {"1", "2", "3"}; //Second array of clicks that happened by id
		
		//Create the Entropy object and hashtable
		Entropy workingList = new Entropy(idArray);
		//Count the elements from the array and send back a list of counted instances 
		int[] counterArray = workingList.count(clickArray);
		//Calculate the entropy of each element and store in hashtable (need to send click array for size)
		workingList.calcEntropy(clickArray, counterArray);
		//Display All
		workingList.displayAll();
		//Display 3
		workingList.displayOne("3");
		//Space and clear counter array
		System.out.println();
		counterArray = null;
		//Count elements in second click stream and return counter list
		counterArray = workingList.count(clickArray2);
		//Calculate the entropy of each element and store in hashtable (need to send click array for size)
		workingList.calcEntropy(clickArray2, counterArray);
		//Display All
		workingList.displayAll();
		//Display 3
		workingList.displayOne("3");
	}

}
