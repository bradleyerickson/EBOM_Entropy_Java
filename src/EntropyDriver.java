public class EntropyDriver {

	public static void main(String[] args) {
		String[] idArray = {"1","2","3","4","5","6"};  //Array of possible click ids
		String[] clickArray = {"1", "2", "1", "3", "4", "5", "6", "6", "5", "4", "3", "2", "1", "1", "2", "4", "5"}; //Array of clicks that happened by id reference
		String[] clickArray2 = {"1", "2", "3"}; //Second array of clicks that happened by id
		
		//Create the Entropy object and hashtable
		Entropy workingList = new Entropy(idArray);
		//Count the elements from the array and send back a list of counted instances 
		workingList.count(clickArray);
		//Calculate the entropy of each element and store in hashtable (need to send click array for size)
		workingList.calcEntropy(idArray, clickArray.length );
		//Display All
		workingList.displayAll();
		//Display 3
		workingList.displayOne("3");
		//Space and clear counter array
		System.out.println();

		//Count elements in second click stream and return counter list
		workingList.count(clickArray2);
		//Calculate the entropy of each element and store in hashtable (need to send click array for size)
		workingList.calcEntropy(idArray, clickArray2.length);
		//Display All
		workingList.displayAll();
		//Display 3
		workingList.displayOne("3");
	}

}
