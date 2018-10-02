public class DemoArray2{
	public static void main(String[] args) {
		// contoh program pencarian

		String names[] = {"Adi", "Aji", "Abbi", "Hasif","Abdul"};
		String searchName = "Abdul";
		boolean foundName = false;

		for (int i = 0;i<names.length ;i++) {
			if (names[i].equals(searchName)) { //equalsIgnoreCase (tidak case sensitif)
				foundName = true;
				break;
			}
		}
		if (foundName) {
			System.out.println(searchName + " Found!");
		}else{
			System.out.println(searchName + " Not Found!");
		}
	}
}