import java.util.Scanner;

public class ReadNumber {

    public static final int MAX = 999;
    public static final int MIN = 0;
    public static final int MAX_ONES = 10;
    public static final int MIN_ONES = 0;
    public static final int MIN_TENS = 10;
    public static final int TWENTY = 20;
    public static final int MIN_HUNDREDS = 100;
    public static final int MAX_HUNDREDS = 1000;
    String numberOnesInString;
    String numberTenToTwentyInString;
    String numberTensInString;
    String numberHundredsInString;

    private boolean isAbility(int number) {
        boolean isAvailable;
        isAvailable = number >= MIN && number <= MAX;
        return isAvailable;
    }

    void input() {
        int number;
        System.out.print("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if (isAbility(number)) {
            process(number);
        } else {
            System.out.println("Out of ability");
        }
    }

    private void process(int inputNumber) {
        if (inputNumber >= MIN_ONES && inputNumber < MAX_ONES) {
            readOnes(inputNumber);
        }else if(inputNumber>= MIN_TENS && inputNumber< TWENTY){
            readTenToTwenty(inputNumber);
        }else if(inputNumber>=TWENTY && inputNumber< MIN_HUNDREDS){
            readTens(inputNumber);
        }else if(inputNumber>=MIN_HUNDREDS && inputNumber< MAX_HUNDREDS) {
            readHundreds(inputNumber);
        }
    }

    void readOnes(int numberOnes) {
        switch (numberOnes) {
            case 0:
                numberOnesInString = "zero";
                break;
            case 1:
                numberOnesInString = "one";
                break;
            case 2:
                numberOnesInString = "two";
                break;
            case 3:
                numberOnesInString = "three";
                break;
            case 4:
                numberOnesInString = "four";
                break;
            case 5:
                numberOnesInString = "five";
                break;
            case 6:
                numberOnesInString = "six";
                break;
            case 7:
                numberOnesInString = "seven";
                break;
            case 8:
                numberOnesInString = "eight";
                break;
            case 9:
                numberOnesInString = "nine";
                break;
            default:
                numberOnesInString = "not ability";
        }
    }

    void readTenToTwenty(int numberTens) {
        switch (numberTens) {
            case 10:
                numberTenToTwentyInString = "ten";
                break;
            case 11:
                numberTenToTwentyInString = "eleven";
                break;
            case 12:
                numberTenToTwentyInString = "twelve";
                break;
            case 13:
                numberTenToTwentyInString = "thirteen";
                break;
            case 14:
                numberTenToTwentyInString = "fourteen";
                break;
            case 15:
                numberTenToTwentyInString = "fifteen";
                break;
            case 16:
                numberTenToTwentyInString = "sixteen";
                break;
            case 17:
                numberTenToTwentyInString = "seventeen";
                break;
            case 18:
                numberTenToTwentyInString = "eighteen";
                break;
            case 19:
                numberTenToTwentyInString = "nineteen";
                break;
            default:
                numberTenToTwentyInString = "not ability";
        }
    }
    void readTens (int numberTens){
        int tens = numberTens/10;
        int ones = numberTens%10;
        readOnes(ones);
        switch (tens){
            case 2:
                numberTensInString = "twenty";
                break;
            case 3:
                numberTensInString = "thirty";
                break;
            case 4:
                numberTensInString = "fourty";
                break;
            case 5:
                numberTensInString = "fifty";
                break;
            case 6:
                numberTensInString = "sixty";
                break;
            case 7:
                numberTensInString = "seventy";
                break;
            case 8:
                numberTensInString = "eighty";
                break;
            case 9:
                numberTensInString = "ninety";
                break;
        }
    }
    void readHundreds(int numberHundreds) {
        int tens = numberHundreds%100;
        int ones = tens%10;
        int hundreds = numberHundreds/100;
        readTens(tens);
        readOnes(ones);
        switch (hundreds){
            case 1:
                numberHundredsInString = "one hundred";
                break;
            case 2:
                numberHundredsInString = "two hundred";
                break;
            case 3:
                numberHundredsInString = "three hundred";
                break;
            case 4:
                numberHundredsInString = "four hundred";
                break;
            case 5:
                numberHundredsInString = "five hundred";
                break;
            case 6:
                numberHundredsInString = "six hundred";
                break;
            case 7:
                numberHundredsInString = "seven hundred";
                break;
            case 8:
                numberHundredsInString = "eight hundred";
                break;
            case 9:
                numberHundredsInString = "nine hundred";
                break;
        }

    }

    void showResult(String outputHundred, String outputTens, String outputOnes, String outputTenToTwenty){
        if(outputTenToTwenty!=null){
            System.out.print(outputTenToTwenty);
        }
        if(outputHundred!=null){
            System.out.print(outputHundred +" and ");
        }
        if(outputTens!=null){
            System.out.print(outputTens+" ");
        }
        if(outputOnes!=null){
            System.out.print(outputOnes+" ");
        }
    }
    public static void main(String[] args) {
        String outputHundred;
        String outputTens;
        String outputOnes;
        String outputTenToTwenty;
        ReadNumber app = new ReadNumber();
        app.input();
        outputHundred = app.numberHundredsInString;
        outputTens = app.numberTensInString;
        outputOnes = app.numberOnesInString;
        outputTenToTwenty = app.numberTenToTwentyInString;
        app.showResult(outputHundred,outputTens,outputOnes,outputTenToTwenty);
    }
}