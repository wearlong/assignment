/**
 * Title:        SimBusStop.java
 * Description:  A simple Bus Stop simulation using Queue
 * Company:      ICT HKIVE(TY)
 * @author       Patrick Tong
 */

import miscLib.*;

public class SimBusStop {

    public static void main(String[] args) {
//    ListQueue t = new ListQueue();
	ArrayQueue t = new ArrayQueue(50);
    int code, time, count;
    Integer item;
    int people = 0;
    int wait = 0;

		do {
			code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
		} while (code < -1 || code > 1);
		int lastTime = 0;
		while (code!=-1) {
			do {
				time = SimpleInput.getInteger("Arrival time (>="+Integer.toString(lastTime)+"): ");
			} while (lastTime > time);
			lastTime = time;
			do {
				count = SimpleInput.getInteger("Arrival count (> 0): ");
			} while (count <= 0);
			if (code==0) {
				people += count;
				while (count-- > 0)
					t.enqueue (new Integer(time));
			}
			else if (code==1) {
				while ( (count-- > 0) && !t.empty ()){
					item = (Integer) t.dequeue ();
					wait += time - item.intValue();
				}
			}
			do {
				code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
			} while (code < -1 || code > 1);
		}

		if (people!=0)
			System.out.println (people + " people waited for " +
								wait + " minutes, average waiting time = " +
								(float) wait/people + " minutes.");
	} // main

} // class SimBusStop