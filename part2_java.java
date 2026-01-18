public class MemoryTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5}; // allocated on heap
        System. out.println("Sum: " + sum(arr));
        arr = null; // eligible for GC
        System.gc(); // hint to JVM to collect garbage
    }
 
    public static int sum(int[] numbers) {
        int total = 0;
        for (int n: numbers) total += n;
        return total;
    }
}
