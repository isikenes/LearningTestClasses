import com.ei.learningMaven.MaxFinderInArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MaxFinderInArrayTest {

    @Test
    public void FindMaxTest() {
        int[] ints= {2,5,3,7,8,1,10,43,23,31};
        int expected=43;
        int actual=new MaxFinderInArray().FindMax(ints);
        Assert.assertEquals("There is an error!", expected, actual);
    }

    @Test
    public void FindMaxTestRandomized() {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int i: arr) {
            set.add(i);
        }

        int expected=Collections.max(set);
        int actual=new MaxFinderInArray().FindMax(arr);
        Assert.assertEquals("There is an error!", expected, actual);
    }
}
