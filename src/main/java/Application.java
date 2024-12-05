import Util.LabUtil1;
import Util.LabUtil2;

import java.util.Arrays;

public class Application {
    /**
     * This class contains a main method that allows you to manually test the Exception lab.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.mustThrow method should throw an exception.
     */
    public static void main(String[] args) {
        Lab1 thrower = new Lab1();
        Lab2 catch1 = new Lab2();
        Lab3 catch2 = new Lab3();
        System.out.println("The lab code should throw an exception, causing a stack trace to be printed to console here:");
        try{
            thrower.mustThrowException();
            System.out.println("This line will only be printed if the exception is not thrown.");
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println("This method should throw an IOException, causing a stack trace to be printed to console here:");
        try{
            thrower.mustThrowIOException();
            System.out.println("This line will only be printed if the exception is not thrown.");
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        try{
            catch1.mustCatchException();
            System.out.println("Was the method LabUtil1.couldThrowException() invoked in lab2?");
            System.out.println(LabUtil1.flag1());
            System.out.println("There's a 1/4 chance of an exception, in which case you should" +
                    " invoke LabUtil1.recover(). Invoked?");
            System.out.println(LabUtil1.flag2());
        }catch (Exception e){
            System.out.println("You should catch the exception in Lab2.");
            e.printStackTrace();
        }
        try{
            catch2.mustCatchMultipleException();
            System.out.println("Was the method LabUtil2.couldThrowException() invoked in lab3?");
            System.out.println(LabUtil2.flag1());
            System.out.println("There's a 1/4 chance of an IOException, in which case you should" +
                    " invoke LabUtil2.recoverFromIoException(). Invoked?");
            System.out.println(LabUtil2.flag4());
            System.out.println("There's a 1/4 chance of an InterruptedException, in which case you should" +
                    " invoke LabUtil2.recoverFromInterruptedException(). Invoked?");
            System.out.println(LabUtil2.flag5());
            System.out.println("If no exception is thrown (1/2 chance), you should invoke " +
                    "LabUtil2.runWhenNoExceptionThrown(). Invoked?");
            System.out.println(LabUtil2.flag2());
            System.out.println("Regardless of if an exception is thrown or not, you should invoke" +
                    " LabUtil2.runAlways(). Invoked?");
            System.out.println(LabUtil2.flag3());
        }catch (Exception e){
            System.out.println("You should catch the exception in Lab3.");
            e.printStackTrace();
        }
    }
}
