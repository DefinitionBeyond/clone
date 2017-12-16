package ObjectCompare;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liutao
 * @date 2017/12/16  15:36
 */
public class test {


    @Test
    public void test1() {
        person[] o = {
                new person(19, "mike", 176),
                new person(20, "rose", 168),
                new person(20, "json", 169),
                new person(18, "kobe", 169)
        };
        Arrays.sort(o);
//        for(Object o1:o){
//            System.out.println(o1);
//        }
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i].getName());
        }
    }
}
