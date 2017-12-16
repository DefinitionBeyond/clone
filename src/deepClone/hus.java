package deepClone;

import java.io.Serializable;

/**
 * @author liutao
 * @date 2017/12/16  7:54
 */
public class hus implements Cloneable, Serializable {
    private wife w;
    private int age;
    private String name;

    public wife getW() {
        return w;
    }

    public void setW(wife w) {
        this.w = w;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        hus h = null;
        h = (hus) super.clone();
        h.w = (wife) this.w.clone();
        return h;
    }
}
