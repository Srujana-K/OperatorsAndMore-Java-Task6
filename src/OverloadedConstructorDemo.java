public class OverloadedConstructorDemo {
    OverloadedConstructorDemo(){
        this("Namaste!");
    }
    OverloadedConstructorDemo(String msg){
        System.out.println("Hello "+msg);
    }
}
