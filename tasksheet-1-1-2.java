//Compound Operators
class ArithmeticTask {

    public static void main (String[] args){
        
        int result = 1;
        result += 2; // result is now 3 equivalent to result + 2
        System.out.println(result);

        result -= 1; // result is now 2 equivalent to result - 1
        System.out.println(result);

        result *= 2; // result is now 4 equivalent to result * 2
        System.out.println(result);

        result /= 2; // result is now 2 equivalent to 
        System.out.println(result);

        result += 8; // result is now 10 equivalent to result + 8
        System.out.println(result);
        result %= 7; // result is now 3 equivalent to result % 7
        System.out.println(result);

    }
}