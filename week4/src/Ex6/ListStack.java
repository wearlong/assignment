

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
            super.add(1,item);
            return item;
	}

	public Object pop() {
            Object result = super.get(1);
            super.remove(1);
            return result;
	}

	public Object peek() {
		return super.get(1);
	}

	public int search(Object item) {
               length = super.count();
               for(int i = 1; i<=length; i++) {
                    if (item == super.get(i)) {
                        return i;
                    }
               }
               
               return -1;
	}
}