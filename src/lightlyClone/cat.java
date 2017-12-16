package lightlyClone;

import javax.lang.model.element.NestingKind;


/**
 * @author liutao
 * @date 2017/12/16  7:39
 */
public class cat implements Cloneable {
    private String name;
    private int age;
    private animal an;

    public cat() {
    }

    public animal getAn() {
        return an;
    }

    public void setAn(animal an) {
        this.an = an;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() {
        cat c = null;
        try {
            c = (cat) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return c;
    }
}
