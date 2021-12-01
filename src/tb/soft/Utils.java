package tb.soft;

import java.util.TreeMap;

public class Utils {

	public static TreeMap<String, char[]> createExampleLoginData() {
		TreeMap<String, char[]> loginData = new TreeMap<>();
		for (int i = 1; i <= 10; i++) {
			loginData.put("student"+String.valueOf(i),("student"+ String.valueOf(i)).toCharArray());
		}
		return loginData;
	}

}
