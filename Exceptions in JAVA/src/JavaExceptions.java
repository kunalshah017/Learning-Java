public class JavaExceptions {

    static void multipleExceptions() {
        try {
            int a=10, b=0;
            int c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds.");
        }catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        multipleExceptions();
    }
}