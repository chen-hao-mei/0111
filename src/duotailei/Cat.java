package duotailei;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName()+"在喵喵叫");
    }
}
