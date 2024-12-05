import Util.LabUtil2;

import java.io.IOException;

public class Lab3 {
    /**
     * Finally, let's go over the different ways that try/catch blocks can be formatted.
     * Firstly, remember that when an exception is thrown in a try block, all remaining code
     * in the try block is skipped. Therefore,
     *      try{
     *          throw new Exception();
     *          //Hello will never be printed
     *          System.out.println("Hello");
     *      }catch(Exception e){
     *
     *      }
     * If we would like to handle multiple exceptions from the same try block, we can have multiple
     * catch blocks. Mind that any Exception which could possibly be thrown in the try block
     * should be caught in some catch block. For instance:
     *      try{
     *          if(Math.random() < .333){
     *              throw new TypeAException();
     *          }else if(Math.random() < .333){
     *              throw new TypeBException();
     *          }
     *      }catch(TypeAException e){
     *
     *      }catch(TypeBException e){
     *
     *      }
     * We can have a "finally" block, which is attached to the end of the try/catch block, containing
     * code that runs unconditionally after either the try block or catch block. It's also possible
     * to have a "finally" block without any "catch" blocks.
     *      try{
     *
     *      }catch(Exception a){
     *
     *      }finally{
     *
     *      }
     * There also exist try-with-resources statements, which are used as shorthand in cases where using
     * some input or output might inherently cause an Exception. For instance, when reading a file,
     * there is an inherent risk of the file not existing, causing a FileNotFoundException or other
     * type of IOException.
     *      try (FileReader reader = new FileReader("file.txt")) {
     *          // I can use from the file using "reader", which could throw an IOException
     *      } catch (IOException e) {
     *          // eg file.txt does not exist
     *      }
     *
     * TODO: The method LabUtil2.couldThrowMultipleExceptions() could throw either an IOException or
     * InterruptedException. In either of these cases, you should run either the
     * LabUtil2.recoverFromIOException() or LabUtil2.recoverFromInterruptedException() methods in the
     * event that these exceptions are thrown. LabUtil2.runWhenNoExceptionThrown() should only
     * run when neither exception is thrown. LabUtil2.runAlways() should always run, whether the
     * exception is thrown or not. This is achievable using the proper configuration of try, catch,
     * and finally statements.
     */
    public void mustCatchMultipleException(){

//        LabUtil2.couldThrowMultipleExceptions();
//        LabUtil2.runWhenNoExceptionThrown();
//        LabUtil2.runAlways();
//        LabUtil2.recoverFromIOException();
//        LabUtil2.recoverFromInterruptedException();

    }
}
