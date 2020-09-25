import java.util.Scanner;

class calculoTeoremaMestre {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] abOrd = sc.nextLine().split(" ");
        int a = Integer.parseInt(abOrd[0]);
        int b = Integer.parseInt(abOrd[1]);
        int ord = Integer.parseInt(abOrd[2]);

        System.out.println(calcularTeoremaMestre(a,b,ord));

    }

    public static int customLog(double base, double logNumber) {
        return (int) (Math.log(logNumber)/Math.log(base));
}
    public static String calcularTeoremaMestre(int a,int b,int ord){
        String novaOrdem;

        if(ord < customLog(b,a)){
            novaOrdem = Integer.toString(customLog(b,a));
            return "T(n) = theta(n**" + novaOrdem + ")";

        } else if(ord == customLog(b,a)) {
            return "T(n) = theta(n**" + ord + " * log n)";

        } else if(ord > customLog(b,a)){
            return "T(n) = theta(n**" + ord + ")";
        }

        return "fail";
    }
}
