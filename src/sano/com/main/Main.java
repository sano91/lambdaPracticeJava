package sano.com.main;

import sano.com.model.*;
import sano.com.service.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        LambdaPracticeJavaSeven lambdaPracticeJavaSeven = new LambdaPracticeJavaSeven();
        lambdaPracticeJavaSeven.addStateListener(new StateChanger() {
            @Override
            public void onStateChange(State old, State newState) {
                System.out.println("The state was changed from: " + old.getState() + ", to: " + newState.getState());
            }
        });

        LambdaPracticeJavaEight lambdaPracticeJavaEight = new LambdaPracticeJavaEight();
        // lambda type inference
        lambdaPracticeJavaEight.addStateListener(((old, newState) -> System.out.println("The state was changed from: " + old.getState() + ", to: " + newState.getState())));

        lambdaPracticeJavaSeven.getStateChanger().onStateChange(new State("MAcesz"), new State("Csokor"));
        lambdaPracticeJavaEight.getStateChanger().onStateChange(new State("Eight"), new State("nine"));
        var fileOUStreamer = new FileOutputStream(lambdaPracticeJavaEight.getPathAndFileName());
        lambdaPracticeJavaEight.getStateChanger().printUtf8To("keslányom", fileOUStreamer);
        lambdaPracticeJavaEight.getStateChanger().printUtf8To("gelesztás", fileOUStreamer);


        MyEventConsumer myEventConsumer = event -> System.out.println(event.hashCode());

        myEventConsumer.consume(new Chicken("Pipi Joe"));
        myEventConsumer.consume(new Turkey("Turking"));
//-------------------------------------------------------------------------------------------
        Function<Integer, Integer> doubleIt = (var input) -> input * 2;
        int six = doubleIt.apply(3);
        System.out.println(six);
//--------------------------------------------------------------------------------------------
/*
        A Java lambda expression is essentially an object.
        You can assign a lambda expression
         to a variable and pass it around, like you do with any other object.
          Here is an example:
*/
        Decider decider = () -> 51 > ThreadLocalRandom.current().nextInt(1, 101);
        boolean theDecision = decider.decide();
        String decisionInText = theDecision ? "buy" : "don't buy";
        System.out.println(decisionInText);


        lambdaPracticeJavaEight.attach();
        StaticMethodReferenceExample staticMethodReferenceExample = LambdaPracticeJavaEight::doFindStatic;
        int stringPosition = staticMethodReferenceExample.find("bcaa", "a");
        System.out.println("String position: " + stringPosition);
        InstanceMethodReferenceExample instanceMethodReferenceExample = lambdaPracticeJavaEight::nameGenerator;
        System.out.println(instanceMethodReferenceExample.giveName("Csont"));

        //Parameter method reference
        ParameterMethodReference parameterMethodReference = String::indexOf;
        parameterMethodReference.StringPosition("Bika", "a");

        //Constructor reference
        ConstructorReferenceInterface constructorReferenceInterface = ContructorReferenceExample::new;
        System.out.println(constructorReferenceInterface.isEven(11).isResult());



    }
}
