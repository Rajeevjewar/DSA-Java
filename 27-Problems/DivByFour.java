public class DivByFour {
    public static void main(String[] args) {

    }

    int divisibleBy4(String N) {
        // Your Code Here
        if (N.length() < 3) {
            int val = Int.parseInt(N);
            if (val % 4 == 0)
                return 1;
            else
                return 0;
        } else {
            String lastDigits = N.substring(N.length() - 3);
            int val = Integer.parseInt(lastDigits);
            if (val % 4 == 0)
                return 1;
            else
                return 0;
        }
        return 0;
    }
}