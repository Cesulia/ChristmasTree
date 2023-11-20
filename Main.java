public class Main {
    public static void main(String[] args) {
        int treeHeight = 10;
        ChristmasTree(treeHeight);
    }

    public static void ChristmasTree(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|||");
    }
}
