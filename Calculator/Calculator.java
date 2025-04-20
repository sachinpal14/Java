package Calculator;

public class Calculator {
    public void showMsg() {
       System.out.println("Hello, this is a calculator program.");

    }

    public void callClassDemo (){
        Demo demo = new Demo();
        demo.showMsg2();
        System.out.println("Hello, this is calling by the main class program.");
    }
}



class Demo extends Calculator {
    public void showMsg2(){
        System.out.println("Hello, this is a demo program.");
    }
} 
