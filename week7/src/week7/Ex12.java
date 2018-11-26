/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;
import java.util.Arrays;
/**
 *
 * @author chpeter868
 */
public class Ex12 {
    public static int count = 0;
    public static void quickSort(int[] test, int head, int tail) {  
        if (head >= tail || test == null || test.length <= 1) {
            return;
        }
        int i = head, j = tail, pivot = test[(head + tail) / 2];
        while (i <= j) {
            while (test[i] < pivot) {
                ++i;
            }
            while (test[j] > pivot) {
                --j;
            }
            if (i < j) {
                int t = test[i];
                test[i] = test[j];
                test[j] = t;
                ++i;
                --j;
                count++;
            } else if (i == j) {
                ++i;
            }
        }
        System.out.println("Move count:" + count + " " +Arrays.toString(test));
        quickSort(test, head, j);
        quickSort(test, i, tail);
    }

    public static void main(String[] args) {
        int[] test = new int[]{30, 13, 22, 90};
        quickSort(test, 0, test.length - 1);
        System.out.println("Quick sort total moved: "+count);
    }
}
