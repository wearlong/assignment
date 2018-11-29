
import java.util.Stack;
import java.util.Iterator;

public class TestStack {
	public static void main (String args[]) {
		ListStack s = new ListStack();  // <== uncomment this for Q1

		System.out.println(s);

		System.out.println("Patrick is at " + s.search("Patrick"));

		s.push(new Character('A'));
		System.out.println(s);
                s.push(new Character('B'));
		System.out.println(s);
                s.push(new Character('C'));
		System.out.println(s);
                s.push(new Character('D'));
		System.out.println(s);
                s.push(new Integer(56));
		System.out.println(s);
		s.push("Patrick");
		System.out.println(s);
		s.push(new Double(789.123));
		System.out.println(s);
                s.push("Egg");
		System.out.println(s);

                System.out.println("peek() returns: " + s.peek());
                System.out.println("After pop()");
                s.pop();
                System.out.println(s);
		System.out.println("peek() returns: " + s.peek());

		System.out.println("Patrick is at " + s.search("Patrick"));
                System.out.println("A is at " + s.search(new Character('A')));
		System.out.println("789.123 is at " + s.search(new Double(789.123)));

	}

} // class TestStack
