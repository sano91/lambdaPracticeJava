package sano.com.model;

import sano.com.service.StateChanger;

public class LambdaPracticeJavaSeven {

    private StateChanger stateChanger;

    public StateChanger getStateChanger() {
        return stateChanger;
    }

    public void addStateListener(StateChanger listener) {
        System.out.println("listener was added");
        this.stateChanger = listener;
    }




}
