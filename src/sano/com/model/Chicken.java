package sano.com.model;

public class Chicken extends Bird{

    private String name;

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
