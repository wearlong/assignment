

import java.util.EmptyStackException;

public class ListStack extends LinkedList {

    public ListStack() {    // <== constructor, different from ListStackComp.java
		super();
    }

	public boolean empty() {
            if (super.isEmpty()){
                return true;
            } else {
                return false;
            }
	}

	public Object push(Object item) {
            super.addToTail(item);
            return item;
	}

	public Object pop() {
            length = super.count();
            Object result = super.get(length);
            super.remove(length);
            return result;
	}

	public Object peek() {
            length = super.count();
            return super.get(length);
	}

	public int search(Object item) {
               length = super.count();
               for(int i = 1; i<=length; i++) {
                    if (item.equals(super.get(i))) {
                        return i;
                    }
               }
               
               return -1;
	}
}
