package duotailei;

public class Cat extends Animal {

    private String maojiao="喵喵叫";

    @Override
    public String fangshi() {
        System.out.println("小猫叫的方式：");
        return maojiao;
    }
}
