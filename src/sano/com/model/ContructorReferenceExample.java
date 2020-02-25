package sano.com.model;

public class ContructorReferenceExample {

    private boolean result;

    public boolean isResult() {
        return result;
    }

    public ContructorReferenceExample(int i){
      this.result = i % 2 == 0;
    }
}
