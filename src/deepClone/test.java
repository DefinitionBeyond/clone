package deepClone;

import org.junit.Test;

/**
 * @author liutao
 * @date 2017/12/16  16:03
 */
public class test {
    @Test
    public void run() {
        hus h = new hus();
        h.setAge(24);
        h.setName("jim");
        wife w = new wife();
        w.setAge(22);
        w.setWeight(45);
        h.setW(w);
        try {
            hus h1 = (hus) h.clone();
            System.out.println(h);
            System.out.println(h1);
            System.out.println(h.getW());
            System.out.println(h1.getW());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
