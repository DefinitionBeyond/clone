package lightlyClone;

import org.junit.Test;

/**
 * @author liutao
 * @date 2017/12/16  7:43
 */
public class test {
    @Test
    public void test1() {
        cat c = new cat();
        c.setAge(12);
        c.setName("dog");
        animal an = new animal();
        an.setHeight(1.25f);
        an.setName("horse");
        c.setAn(an);

        cat c1 = (cat) c.clone();
        System.out.println(c);
        System.out.println(c.getAn());
        System.out.println(c1);
        System.out.println(c1.getAn());

    }
}
