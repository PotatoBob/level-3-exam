import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {
	HashMap<String, String> hashmap1 = new HashMap<String, String>();
	HashMap<String, String> hashmap2 = new HashMap<String, String>();
	ArrayList<String> keys1 = new ArrayList<String>();
	ArrayList<String> keys2 = new ArrayList<String>();
	ArrayList<String> values1 = new ArrayList<String>();
	ArrayList<String> values2 = new ArrayList<String>();
	public static void main(String[] args) {
		HashMapCalculator HMC = new HashMapCalculator();
	}
	HashMapCalculator() {
		
	}
	@SuppressWarnings("unchecked")
	int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int count = 0;
		for (String string : hashmap1.keySet()) {
			if(hashmap2.containsKey(string)) {
				if(hashmap2.containsValue(hashmap1.get(string))) {
					count++;
				}
			}
		}
		return count;
	}
}
