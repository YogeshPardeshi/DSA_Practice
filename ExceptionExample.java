public class ExceptionExample {
    public static void main(String[] args) {
        int i = 10;
        try {
            i = i/0;
            System.out.println("Value of i is: " + i);
        } catch(ArithmeticException ae) {
            System.out.println("I am in Arithmetic Exception block");
        } catch(Throwable t) {
            System.out.println("I am in Throwable block");
        }
//        catch(Exception e) {
//            System.out.println("I am in Exception block");
//        }
    }

}