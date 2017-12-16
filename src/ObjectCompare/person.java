package ObjectCompare;

/**
 * @author liutao
 * @date 2017/12/16  15:32
 */
public class person implements Comparable {

    private int age;
    private String name;
    private int hight;

    public person(int age, String name, int hight) {
        this.age = age;
        this.name = name;
        this.hight = hight;
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

    public float getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public int compareTo(Object o) {
        person p = (person) o;
        return p.age - this.age == 0 ? p.hight - this.hight : p.age - this.age;
    }
}
