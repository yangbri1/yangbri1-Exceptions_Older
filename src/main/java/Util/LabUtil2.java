package Util;

import java.io.IOException;

/**
 * Disregard this code, it's used in 'Lab3'.
 * Do not change anything in this class.
 */
public class LabUtil2 {
    private static boolean methodWasCalled;
    private static boolean runWhenNoExceptionThrown;
    private static boolean runAlways;
    private static boolean recoveredFromIoException;
    private static boolean recoveredFromInterruptedException;

    public static void couldThrowMultipleExceptions() throws IOException, InterruptedException {
        methodWasCalled = true;
        if(BehaviorUtil.gen() == 1) {
            throw new IOException();
        }else if(BehaviorUtil.gen() == 2){
            throw new InterruptedException();
        }
    }
    public static void runWhenNoExceptionThrown(){
        runWhenNoExceptionThrown = true;
    }
    public static void runAlways(){
        runAlways = true;
    }
    public static void recoverFromIOException(){
        recoveredFromIoException = true;
    }
    public static void recoverFromInterruptedException(){
        recoveredFromInterruptedException = true;
    }

    public static void testReset(){
        methodWasCalled = false;
        runWhenNoExceptionThrown = false;
        runAlways = false;
        recoveredFromInterruptedException = false;
        recoveredFromIoException = false;
    }

    public static boolean flag1() {
        return methodWasCalled;
    }

    public static boolean flag2() {
        return runWhenNoExceptionThrown;
    }

    public static boolean flag3() {
        return runAlways;
    }

    public static boolean flag4() {
        return recoveredFromIoException;
    }

    public static boolean flag5() {
        return recoveredFromInterruptedException;
    }
}
