package arbolesBinarios;

import java.util.*;

class Ch72 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int number;
        BinarySearchTree tree;
        tree = new BinarySearchTree();
        System.out.println();
        System.out.print("Enter a positive integer to insert ");
        System.out.print("or a negative integer to stop: ");
        number = scanner.nextInt();
        while (number >= 0) {
            tree.insertBST(number);
            tree.traverseBST();
            System.out.println();
            System.out.print("Enter a positive integer to insert ");
            System.out.print("or a negative integer to stop: ");
            number = scanner.nextInt();
        }
        System.out.println();
        System.out.print("Enter a positive integer to remove ");
        System.out.print("or a negative integer to quit: ");
        number = scanner.nextInt();
        while (number >= 0) {
            tree.removeBST(number);
            tree.traverseBST();
            System.out.println();
            System.out.print("Enter a positive integer to remove ");
            System.out.print("or a negative integer to quit: ");
            number = scanner.nextInt();
        }
        System.out.println();
        System.out.println("End of Program");
        System.out.println();
    }
}
