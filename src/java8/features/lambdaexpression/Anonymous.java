package java8.features.lambdaexpression;

public class Anonymous {

    static int d = 10;
    public static void main(String[] args) {
        //variable c within method has to be final or effectively final because its using in
        // lambda expression and if we change variable value then it will cause confusion as lambda expression store variable
        int c = 5;
        Checking checking = (a,b) ->{
            return d/c;
        } ;
        System.out.println("value of c : " + checking.calc(10,15));
    }


}
