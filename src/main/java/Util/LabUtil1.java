package Util;

/**
 * Disregard this code, it's used in 'Lab2'.
 * Do not change anything in this class.
 */
public class LabUtil1 {

    private static boolean methodWasCalledFlag;
    private static boolean recoveredFromException;

    /**
     * This method will flip a flag that will inform test cases that this method was invoked,
     * and then throw an Exception.
     * @throws Exception
     */
    public static void couldThrowException() throws Exception{
        methodWasCalledFlag = true;
        if(BehaviorUtil.gen() == 1) {
            throw new Exception();
        }
    }
    public static void recover(){
        recoveredFromException = true;
    }
    public static void testReset(){
        methodWasCalledFlag = false;
        recoveredFromException = false;
    }

    public static boolean flag1() {
        return methodWasCalledFlag;
    }

    public static boolean flag2() {
        return recoveredFromException;
    }
}
