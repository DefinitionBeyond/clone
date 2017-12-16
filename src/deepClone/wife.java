package deepClone;

import java.io.Serializable;

/**
 * @author liutao
 * @date 2017/12/16  7:55
 */
public class wife implements Cloneable, Serializable {
    private int age;
    private float weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    protected Object clone() {
        wife o = null;
        try {
            o = (wife) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
