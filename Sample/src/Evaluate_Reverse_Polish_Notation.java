import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set new1=new HashSet();
		new1.add("sdfas");
		new1.add(1);
		new1.add("sdfassdfs");
		new1.add(2);
		System.out.println("set is "+new1.toString());
		String[] tokens = new String[] { "2", "1", "+", "3", "*", "6", "/" };
		String operations = "+-*/";
		Stack<String> stack = new Stack<String>();
		for (String t : tokens) {
			if (!operations.contains(t)) {
				stack.push(t);
			} else {
				System.out.println("stack size : " + stack.size());
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operations.indexOf(t);
				switch (index) {
				case 0:
					stack.push(String.valueOf(a + b));
					break;
				case 1:
					stack.push(String.valueOf(b - a));
					break;
				case 2:
					stack.push(String.valueOf(a * b));
					break;
				case 3:
					stack.push(String.valueOf(b / a));
					break;
				}

			}
		}

		System.out.println("Value " + Integer.valueOf(stack.pop()));
	}

}
