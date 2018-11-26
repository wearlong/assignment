
import java.util.Stack;
import java.util.Iterator;

public class TestStack {
	public static void main (String args[]) {
		ListStack s = new ListStack();  // <== uncomment this for Q1

		System.out.println(s);

		System.out.println("Patrick is at " + s.search("Patrick"));

		s.push("Apple");
		System.out.println(s);
		s.push("Ben");
		System.out.println(s);
		s.push("Cat");
		System.out.println(s);
		s.push("Dog");
		System.out.println(s);
                s.push(new Integer(56));
		System.out.println(s);
		s.push("Patrick");
		System.out.println(s);
		s.push("Egg");
		System.out.println(s);
		s.push(new Double(789.123));
		System.out.println(s);

                System.out.println("peek() returns: " + s.peek());
                System.out.println("Is empty? " +s.empty());
                System.out.println("After pop()");
                s.pop();
                System.out.println(s);
		System.out.println("peek() returns: " + s.peek());

		System.out.println("Patrick is at " + s.search("Patrick"));
		System.out.println("Apple is at " + s.search("Apple"));
                System.out.println("Ben is at " + s.search("Ben"));
		System.out.println("Peter is at " + s.search("Peter"));

	}

} // class TestStack