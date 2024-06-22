package Exception;

public class ThrowableException {
    public static void main(String[] args) throws RuntimeException {
        try{
            String a = "zain";
            check(a);
            System.out.println(a.charAt(4));
        } catch (RuntimeException e) {
            throw new RuntimeException();

        } catch (Exception e){

        }
        finally {
            System.out.println("hello");
        }

    }

    static void check(String a) throws RuntimeException {
        System.out.println(a.charAt( 5));
    }
}
