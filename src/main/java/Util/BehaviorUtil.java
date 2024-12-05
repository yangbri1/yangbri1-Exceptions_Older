package Util;

/**
 * Do not change anything in this class. It is used by the test cases.
 */
public class BehaviorUtil {
    private static int strategy = 0;

    /**
     * utility method to generate a random number of 0-3 for determining behavior with
     * option to perform mock behavior by changing strategy
     * @return
     */
    public static double gen(){
        if(strategy == 0){
            return (int) (Math.random() * 4);
        }else{
            return strategy;
        }
    }

    public static void setStrategy(int strategy) {
        BehaviorUtil.strategy = strategy;
    }
}
