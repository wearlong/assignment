/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;


/**
 *
 * @author chpeter868
 */
public class TestLinkedList {
	public static void main (String args[]) {
		LinkedList s = new LinkedList();
		System.out.println(s);
		System.out.println();

		s.addToTail (new Integer(42));
		System.out.println(s);
		System.out.println();
		s.addToTail (new Character('n'));
		System.out.println(s);
		System.out.println();
		s.addToTail (new String("hello"));
		System.out.println(s);
		System.out.println();
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromHead());
			System.out.println(s);
			System.out.println();
		}

	}
} // class TestLinkedList