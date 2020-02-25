package sano.com.model;

public class Turkey extends Bird{

    private String name;

    public String getName() {
        return name;
    }

    public Turkey(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Turkey{" +
                "name='" + name + '\'' +
                '}';
    }
}
