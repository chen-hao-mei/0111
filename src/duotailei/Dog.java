package duotailei;

public class Dog extends Animal {
    private String dogjiao;

    public Dog(String dogjiao) {
        this.dogjiao=dogjiao;
    }

    @Override
    public String fangshi() {
        System.out.println("小狗叫的方式：");
        return dogjiao;
    }
}
