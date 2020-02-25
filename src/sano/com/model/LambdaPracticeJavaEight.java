package sano.com.model;

import sano.com.service.Groom;
import sano.com.service.StateChanger;

public class LambdaPracticeJavaEight {
    private final String name = "Doom";

    public String getPathAndFileName() {
        return pathAndFileName;
    }

    private final String pathAndFileName = "/home/kulin/codecool/text/output_stream.txt";

    private StateChanger stateChanger;


    public StateChanger getStateChanger() {
        return stateChanger;
    }

    public void addStateListener(StateChanger stateChanger) {
        System.out.println("listener was added");
        this.stateChanger = stateChanger;
    }

    // lambda function used instance variable
    public void attach(){
        Groom groom = () -> System.out.println(this.name);
        groom.grooming();
    }

    public static int doFindStatic(String s1, String s2){
        return s1.lastIndexOf(s2);
    }

    public String nameGenerator(String originalName){
        return "Dr " + originalName;
    }
}
