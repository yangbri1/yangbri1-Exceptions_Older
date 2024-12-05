import Util.LabUtil1;
import Util.LabUtil2;

public class Lab2 {
    /**
     * Once an exception is thrown, other parts of the application will need to react to it in some
     * way. If we would like to "catch" rather than "throw" an exception (the naming being rather
     * literal), we'll use a "try/catch" block. The try block consists of code that we would like to
     * run which is capable of throwing an exception, and in the event that the exception is thrown,
     * the remainder of the try block is skipped, and the catch block is ran, as shown below.
     *
     *      try{
     *          // let's say that method1() might throw an exception
     *          method1();
     *          // if someCode1() throws an exception, skip the remainder of the try block
     *          // and run the catch block
     *          method2();
     *      }catch(Exception ex){
     *          // We have access to the Exception object that was thrown in the try block.
     *          // This code only runs if the exception was thrown. For instance, the code
     *          ex.printStackTrace();
     *          // will print the method call stack (ie all methods that were called to lead
     *          // to this point) , which is useful for debugging.
     *          method3();
     *      }
     *
     * Notice that LabUti1l.couldThrowException() below throws an Exception, and has been commented out.
     * That method has a 50% chance of failing - analogous to any unpreventable circumstance, such
     * as a network error. If we surround LabUtil1.couldThrowException() with a try/catch block, we
     * also won't need to add a "throws" declaration to the method because the Exception would be safely
     * handled within the try/catch.
     *
     * TODO: Use a try/catch block to safely run LabUtil1.couldThrowException(), and only run recover()
     * if LabUtil1.couldThrowException() throws an exception.
     */
    public void mustCatchException() throws Exception{

//        LabUtil1.couldThrowException();
//        LabUtil1.recover();

    }

}
