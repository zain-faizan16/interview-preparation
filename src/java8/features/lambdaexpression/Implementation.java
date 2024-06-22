package java8.features.lambdaexpression;

public class Implementation {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c;
        System.out.println("normal function calling: " +addition(a, b));
        Checking checking = (x, y) -> x + y;
        System.out.println("lambda function addition calling: "+ checking.calc(a, b));
        checking = (x,y) -> x-y;
        System.out.println("lambda function subtraction calling: "+ checking.calc(a, b));
        System.out.println("lambda function passing as argument: "+implementationAsArgument((x,y)-> x+y));

    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int implementationAsArgument(Checking checking){
        return checking.calc(5,6);
    }

}

