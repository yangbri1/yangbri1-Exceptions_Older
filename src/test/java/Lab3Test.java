import Util.BehaviorUtil;
import Util.LabUtil2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lab3Test {
    Lab3 lab;
    @Before
    public void setUp(){
        lab = new Lab3();
        LabUtil2.testReset();
    }
    @Test
    public void methodCalledTest(){
        BehaviorUtil.setStrategy(3);
        try{
            lab.mustCatchMultipleException();
            Assert.assertTrue("You must invoke the LabUtil2.isMethodWasCalled() method.",
                    LabUtil2.flag1());
        }catch (Exception e){
            Assert.fail("All exceptions thrown by LabUtil2.couldThrowMultipleExceptions() must be caught.");
        }
    }
    @Test
    public void multipleExceptionCatchIoTest(){
        BehaviorUtil.setStrategy(1);
        try{
            lab.mustCatchMultipleException();
            Assert.assertTrue("If the IOException is thrown, the method " +
                    "LabUtil2.recoverFromIOException() should be invoked.",
                    LabUtil2.flag4());
            Assert.assertTrue("If the IOException is thrown, the method " +
                            "LabUtil2.recoverFromInterruptedException() should not be invoked.",
                    !LabUtil2.flag5());
        }catch (Exception e){
            Assert.fail("All exceptions thrown by LabUtil2.couldThrowMultipleExceptions() must be caught.");
        }
    }
    @Test
    public void multipleExceptionCatchInterruptedTest(){
        BehaviorUtil.setStrategy(2);
        try{
            lab.mustCatchMultipleException();
            Assert.assertTrue("If the Interrupted is thrown, the method " +
                            "LabUtil2.recoverFromInterruptedException() should be invoked.",
                    LabUtil2.flag5());
            Assert.assertTrue("If the InterruptedException is thrown, the method " +
                            "LabUtil2.recoverFromIOException() should not be invoked.",
                    !LabUtil2.flag4());
        }catch (Exception e){
            Assert.fail("All exceptions thrown by LabUtil2.couldThrowMultipleExceptions() must be caught.");
        }
    }
    @Test
    public void noExceptionTest(){
        BehaviorUtil.setStrategy(3);
        try{
            lab.mustCatchMultipleException();
            Assert.assertTrue("If no exception is thrown, neither recovery method" +
                            " should be invoked.",
                    !LabUtil2.flag5());
            Assert.assertTrue("If no exception is thrown, neither recovery method" +
                            " should be invoked.",
                    !LabUtil2.flag4());
            Assert.assertTrue("If no exception is thrown, the method " +
                    "LabUtil2.runWhenNoExceptionThrown() should be invoked.",
                    LabUtil2.flag2());
        }catch (Exception e){
            Assert.fail("All exceptions thrown by LabUtil2.couldThrowMultipleExceptions() must be caught.");
        }
    }
    @Test
    public void runAlwaysTest1(){
        BehaviorUtil.setStrategy(1);
        try{
            lab.mustCatchMultipleException();
            Assert.assertTrue("The LabUtil2.runAlways() method should always " +
                            "be invoked.",
                    LabUtil2.flag3());
        }catch (Exception e){
            Assert.fail("All exceptions thrown by LabUtil2.couldThrowMultipleExceptions() must be caught.");
        }
    }
    @Test
    public void runAlwaysTest2(){
        BehaviorUtil.setStrategy(2);
        try{
            lab.mustCatchMultipleException();
            Assert.assertTrue("The LabUtil2.runAlways() method should always " +
                            "be invoked.",
                    LabUtil2.flag3());
        }catch (Exception e){
            Assert.fail("All exceptions thrown by LabUtil2.couldThrowMultipleExceptions() must be caught.");
        }
    }
    @Test
    public void runAlwaysTest3(){
        BehaviorUtil.setStrategy(3);
        try{
            lab.mustCatchMultipleException();
            Assert.assertTrue("The LabUtil2.runAlways() method should always " +
                            "be invoked.",
                    LabUtil2.flag3());
        }catch (Exception e){
            Assert.fail("All exceptions thrown by LabUtil2.couldThrowMultipleExceptions() must be caught.");
        }
    }
}
