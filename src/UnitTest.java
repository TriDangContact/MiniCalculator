public class UnitTest {
    public static void multiplyFiveTest() {
        MiniCalculator mCalc = new MiniCalculator();
        // 1 * 5 = 5
        mCalc.multiply(5);
        assertEquals(mCalc.calculate(), 5);
    }

    public static void multiplyNegativeTest() {
        MiniCalculator mCalc = new MiniCalculator();

        // 1 * 2 = 2
        mCalc.multiply(2);
        assertEquals(mCalc.calculate(), 2);

        // 2 * -2 = -4
        mCalc.multiply(-2);
        assertEquals(mCalc.calculate(), -4);
    }

    public static void multiplyZeroTest() {
        MiniCalculator mCalc = new MiniCalculator();

        // 1 * 20 = 20
        mCalc.multiply(20);
        assertEquals(mCalc.calculate(), 20);

        // 20 * 0 = 0
        mCalc.multiply(0);
        assertEquals(mCalc.calculate(), 0);
    }

    public static void divideToZeroTest() {
        MiniCalculator mCalc = new MiniCalculator();
        // 1 / 5 = 0
        try {
            mCalc.divide(5);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        assertEquals(mCalc.calculate(), 0);
    }

    public static void divideFiveTest() {
        MiniCalculator mCalc = new MiniCalculator();
        // 1 * 20 = 20
        mCalc.multiply(20);

        // 20 / 5 = 4
        try {
            mCalc.divide(5);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        assertEquals(mCalc.calculate(), 4);
    }

    public static void divideZeroTest() {
        MiniCalculator mCalc = new MiniCalculator();
        // 1 * 20 = 20
        mCalc.multiply(20);

        // 20 / 0 = error
        try {
            mCalc.divide(0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void divideNegativeTest() {
        MiniCalculator mCalc = new MiniCalculator();
        // 1 * 20 = 20
        mCalc.multiply(20);

        // 20 / -5 = -4
        try {
            mCalc.divide(-5);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        assertEquals(mCalc.calculate(), -4);
    }

    public static void calculateTest() {
        MiniCalculator mCalc = new MiniCalculator();
        // 1 * 20 = 20
        mCalc.multiply(20);
        assertEquals(mCalc.calculate(), 20);
    }

    public static void assertEquals(int value1, int value2) {
        if (value1 == value2) {
            System.out.println("Success, " + value1 + " equals " + value2);
        } else {
            System.out.println("Failed, " + value1 + " NOT equal " + value2);
        }
    }





    public static void main(String[] args) {
        System.out.println("TESTING Multiply");
	    multiplyFiveTest();
	    multiplyNegativeTest();
	    multiplyZeroTest();

        System.out.println("\n---------\n");

        System.out.println("TESTING Divide");
	    divideToZeroTest();
	    divideFiveTest();
	    divideZeroTest();
	    divideNegativeTest();

        System.out.println("\n---------\n");

        System.out.println("TESTING calculate()");
	    calculateTest();

    }
}
