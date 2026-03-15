public class BinaryTriangle {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            int num;

            // Decide starting number for each row
            if (i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");

                // Toggle between 1 and 0
                if (num == 1) {
                    num = 0;
                } else {
                    num = 1;
                }
            }

            System.out.println();
        }
    }
}