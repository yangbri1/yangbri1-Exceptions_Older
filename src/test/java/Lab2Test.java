import Util.BehaviorUtil;
import Util.LabUtil1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lab2Test {
    Lab2 lab;
    @Before
    public void setUp(){
        lab = new Lab2();
        LabUtil1.testReset();
    }

    @Test
    public void mustCallMethodTest(){
        BehaviorUtil.setStrategy(3);
        try{
            lab.mustCatchException();
            Assert.assertTrue("You must invoke the LabUtil1.couldThrowException() " +
                    "method.", LabUtil1.flag1());
        }catch (Exception e){
            Assert.fail("If the exception is thrown from LabUtil1.couldThrowException(), you must catch it.");
        }
    }
    @Test
    public void exceptionMustRecoverTest(){
        BehaviorUtil.setStrategy(1);
        try{
            lab.mustCatchException();
            Assert.assertTrue("If the exception is thrown from LabUtil1.couldThrowException(), " +
                    " you must invoke the LabUtil1.recover() method.", LabUtil1.flag2());
        }catch (Exception e){
            Assert.fail("If the exception is thrown from LabUtil1.couldThrowException(), you must catch it.");
        }
    }
    @Test
    public void noRecoverWhenExceptionNotThrownTest(){
        BehaviorUtil.setStrategy(2);
        try {
            lab.mustCatchException();
            Assert.assertTrue("If the exception is not thrown, you must not invoke the " +
                    " LabUtil1.recover() method.", !LabUtil1.flag2());
        }catch (Exception e){
            Assert.fail("If the exception is thrown from LabUtil1.couldThrowException(), you must catch it.");

        }
    }

}
