import java.util.*;

public class ChefShopping {

    public static int maximumDifference(int[] weights, int K) {
        Arrays.sort(weights);
        int chefSum = 0;
        int sonSum = 0;
        int N = weights.length;

        for (int i = 0; i < N; i++) {
            if (i < K)
                sonSum += weights[i];
            else
                chefSum += weights[i];
        }

        return chefSum - sonSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Number of items
            int K = scanner.nextInt(); // Number of items for the son
            int[] weights = new int[N];

            for (int i = 0; i < N; i++) {
                weights[i] = scanner.nextInt();
            }

            int difference = maximumDifference(weights, K);
            System.out.println(difference);
        }
    }
}
