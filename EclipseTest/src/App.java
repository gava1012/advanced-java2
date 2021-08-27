import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(1);
		li.add(1);
		
		li.forEach(System.out::println);
	}

}
