public class LogicalOperatorsExample {
    public static void main(String[] args) {

        boolean isSunny = true;
        boolean isWarm = false;

        System.out.println("isSunny && isWarm: " + (isSunny && isWarm));
        System.out.println("isSunny || isWarm: " + (isSunny || isWarm));
        System.out.println("!isSunny: " + (!isSunny));
        System.out.println("!isWarm: " + (!isWarm));
    }
}
