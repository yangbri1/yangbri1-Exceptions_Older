
import Util.LabUtil1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Lab1Test {
    Lab1 lab;

    @Before
    public void setUp(){
        lab = new Lab1();
    }

    @Test
    public void exceptionMustThrowTest(){
        try{
            lab.mustThrowException();
            Assert.fail("You must throw an Exception from the mustThrowException method.");
        }catch (Exception e){

        }
    }

    @Test
    public void ioExceptionMustThrowTest(){
        try{
            lab.mustThrowIOException();
            Assert.fail("You must throw an Exception from the mustThrowIOException method, " +
                    "including the appropriate 'throws' declaration.");
        }catch (Exception e){
            Assert.assertEquals("The exception thrown from mustThrowIOException must be " +
                    "an IOException.", IOException.class, e.getClass());
        }
    }
}
