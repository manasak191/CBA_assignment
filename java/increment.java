public class IncrementDecrementExample {
    public static void main(String[] args) {

        int count = 5;

        System.out.println("Initial value: " + count);

        System.out.println("Post-increment (count++): " + count++);
        System.out.println("After post-increment: " + count);

        System.out.println("Pre-increment (++count): " + ++count);
        System.out.println("After pre-increment: " + count);

        System.out.println("Post-decrement (count--): " + count--);
        System.out.println("After post-decrement: " + count);

        System.out.println("Pre-decrement (--count): " + --count);
        System.out.println("After pre-decrement: " + count);
    }
}
