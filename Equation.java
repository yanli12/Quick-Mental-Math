import java.util.Random;

class Equation {
    private int num1;
    private int num2;
    private char op;
    private int ans;
    private final char[] operation = {'+', '-', '*', '/'};

    public Equation() {
        Random r = new Random();
        int index = r.nextInt(4);
        this.op = operation[index];

        if (op == '+') {
            num1 = r.nextInt(51);
            num2 = r.nextInt(51);
        } else if (op == '-') {
            num1 = r.nextInt(101);
            num2 = r.nextInt(101);
        } else if (op == '*') {
            num1 = r.nextInt(13);
            num2 = r.nextInt(13);
        } else {
            num1 = r.nextInt(145);
            while (isPrime(num1)) { //num1 cannot be prime
                num1++;
            }

            num2 = r.nextInt(num1 - 1) + 1; // exclude 0
            while (num1 % num2 != 0) {
                num2--;
            }
        }
    }

    private boolean isPrime(int num) {
        int[] primeArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139};
        boolean numPrime = false;

        for (int primeNum : primeArr) //check if num is prime
        {
            if (num == primeNum) {
                numPrime = true;
                break;
            }
        }
        return numPrime;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getAnswer() {

        if (op == '+') {
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*') {
            ans = num1 * num2;
        } else if (op == '/') {
            ans = num1 / num2;
        }

        return ans;
    }

    public String toString() {
        return num1 + " " + op + " " + num2 + " = ";
    }
}
