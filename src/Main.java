public class Main {

    public static void main(String[] args) {

        System.out.println(printFirstDigit(1225));
        System.out.println(printFirstDigit(74356225));
        System.out.println(printFirstDigit(843562254));

    }
    public static int printFirstDigit(int number){

        while (number >= 10){
            number = number / 10;
        }
        return number;
    }
}