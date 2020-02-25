package sano.com.model;

public class State {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public State(String state) {
        this.state = state;
    }

    public State() {
        this.state = "passive";
    }
}
