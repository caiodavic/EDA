import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        HashSet set = new HashSet(size);
        String[] option;
        do {
            option = sc.nextLine().split(" ");
            String imprime;
            switch (option[0]) {
                case "put":
                     imprime = Arrays.toString(set.put(Integer.parseInt(option[1])));
                    System.out.println(imprime);
                    break;

                case "remove":
                    imprime = Arrays.toString(set.remove(Integer.parseInt(option[1])));
                    System.out.println(imprime);
                    break;

                case "contains":
                    imprime = Boolean.toString(set.contains(Integer.parseInt(option[1])));
                    System.out.println(imprime);
                    break;

                case "print":
                    imprime = set.toString();
                    System.out.println(imprime);

                default:
                    break;
            }

        }while (!option[0].equals("end"));
    }
}
