public class Main {
    public static void main(String[] args) {

        int hello=5;
        int privet=10;
        int hola=15;
        int ciao=25;

        int sumOfFirstVars=hello+privet;
        int sumOfLastVars=hola+ciao;

        System.out.println("Is first sum bigger - " + (sumOfFirstVars > sumOfLastVars));

        sumOfFirstVars++;
        sumOfLastVars-= 2;

        System.out.println("Is first sum bigger after changes - " + (sumOfFirstVars > sumOfLastVars));

        System.out.println("At least one sum is even - " + (sumOfFirstVars % 2 == 0 || sumOfLastVars % 2 == 0));
    }
}