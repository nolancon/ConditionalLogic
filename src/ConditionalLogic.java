import java.util.Scanner;

enum Direction{
    NORTH,SOUTH,EAST,WEST
}
public class ConditionalLogic {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //preAndPostDifference();
        //booleanLogicShortCircuitOp();
        //booleanBitwiseOps();
        //compareStrings();
        //System.out.println(admitToFilm(17,18));
        //ternaryOperator();
        //switchVowelOrConsonant();
        //ifMonth();
        //ifGrade();
        //switchMathOperation();
        //switchEnumType();
        switchDaysInMonth();
    }
    public static void preAndPostDifference(){
        int x = 5, y = 10;
        System.out.println("The value of x is " + x);
        System.out.println("The value of ++x is " + ++x);
        System.out.println("The value of x++ is " + x++);
        System.out.println("The value of x is " + x);

        System.out.println("The value of y is " + y);
        System.out.println("The value of --y is " + --y);
        System.out.println("The value of y-- is " + y--);
        System.out.println("The value of y is " + y);
    }

    public static void booleanLogicShortCircuitOp(){
        System.out.println("Enter two numbers:");
        int firstNum = sc.nextInt(), secondNum = sc.nextInt();
        if(firstNum < 0 && secondNum++ < 0){
            System.out.println(secondNum);
        }else if (firstNum > 0 && secondNum++ > 0){
            System.out.println(secondNum);
        } else if (firstNum == 0 || secondNum++ == 0) {
            System.out.println(secondNum);
        } else if (firstNum < 0 || secondNum++ < 0) {
            System.out.println(secondNum);
        }
    }

    public static void booleanBitwiseOps(){
        System.out.println("Enter two numbers:");
        int firstNum = sc.nextInt(), secondNum = sc.nextInt();
        if(firstNum < 0 & secondNum++ < 0){
            System.out.println(secondNum);
        }else if (firstNum > 0 & secondNum++ > 0){
            System.out.println(secondNum);
        } else if (firstNum == 0 | secondNum++ == 0) {
            System.out.println(secondNum);
        } else if (firstNum < 0 | secondNum++ < 0) {
            System.out.println(secondNum);
        }
    }

    public static void compareStrings() {
        System.out.println("Enter two strings:");
        String s1 = sc.next(), s2 = sc.next();
        System.out.printf("Using == returns %b\n", s1 == s2);
        System.out.println("Using equals() returns " + s1.equals(s2));

        String name1 = "Sean", name2 = "Sean";
        System.out.printf("Using == returns %b\n", name1 == name2);
        System.out.println("Using equals() returns " + name1.equals(name2));

        String name3 = "John";
        String name4 = new String("John");
        System.out.printf("Using == returns %b\n", name3 == name4);
        System.out.println("Using equals() returns " + name3.equals(name4));
    }

    public static boolean admitToFilm(int age, int film){
        return age >= film;
    }

    public static void ternaryOperator(){
        boolean isHappy = true;
        String mood = null;
        if (isHappy){
            mood = "I am happy!";
        }else {
            mood = "I am not happy!";
        }
        System.out.println(mood);
        System.out.println("Enter two integers");
        int x = sc.nextInt(), y = sc.nextInt();
        int minVal = x;
        if (y < x){
            minVal = y;
        }
        System.out.println("minVal: " + minVal);
    }

    public static void switchVowelOrConsonant(){
        System.out.println("Enter a letter: ");
        char letter = sc.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 65:
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("is a vowel");
                return;
            default:
                if(Character.isLetter(letter)) {
                    System.out.println("is a consonant");
                }else {
                    System.out.println("is not a letter");
                }
        }
    }

    public static void ifMonth(){
        System.out.println("Enter a month (1...12): ");
        int month = 0;

        final int JAN=1,FEB=2,MAR=3,APR=4,MAY=5,JUN=6,JUL=7,AUG=8,SEP=9,OCT=10,NOV=11,DEC=12;
        try {
            month = sc.nextInt();
            if (month == JAN){
                System.out.println("January");
                } else if (month == FEB) {
                    System.out.println("February");
                }else if (month == MAR) {
                    System.out.println("March");
                }else if (month == APR) {
                    System.out.println("April");
                }else if (month == MAY) {
                    System.out.println("May");
                }else if (month == JUN) {
                    System.out.println("June");
                }else if (month == JUL) {
                    System.out.println("July");
                }else if (month == AUG) {
                    System.out.println("August");
                }else if (month == SEP) {
                    System.out.println("September");
                }else if (month == OCT) {
                    System.out.println("October");
                }else if (month == NOV) {
                    System.out.println("November");
                }else if (month == DEC) {
                    System.out.println("December");
                } else {
                    System.out.println("Not in range 1-12");
            }
        }catch (Exception e) {
            System.out.println("Exception caught!");
            e.printStackTrace();
        }
    }

    public static void ifGrade(){
        System.out.println("Enter Grade (1...100):");
        try {
            int grade = sc.nextInt();
            if (grade >= 40 && grade <= 49) {
                System.out.println("D");
            } else if (grade >= 50 && grade <= 59) {
                System.out.println("C");
            } else if (grade >= 60 && grade <= 69) {
                System.out.println("B");
            } else if (grade >= 70 && grade <= 100) {
                System.out.println("A");
            } else {
                System.out.println("Fail");
            }
        }catch (Exception e){
            System.out.println("Exception caught!");
            e.printStackTrace();
        }
    }

    public static void switchMathOperation(){
        System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble(), num2 = sc.nextDouble();
        double answer = 0;
        boolean charOK = true;
        System.out.println("Enter an operation:");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                System.out.println("Unknown mathematical operator: " + operation);
                charOK = false;
        }
        if (charOK){
            System.out.println("Answer: " + answer);
        }
    }

    public static void switchEnumType(){
        Direction theWay = null;
        System.out.println("Enter string to represent direction (N, S, E or W):");
        String direction = sc.next().toUpperCase();
        switch (direction) {
            case "N":
                theWay = Direction.NORTH;
                break;
            case "S":
                theWay = Direction.SOUTH;

                break;
            case "E":
                theWay = Direction.EAST;
                break;
            case "W":
                theWay = Direction.WEST;
                break;
            default:
                System.out.println(direction + " is not recognised.");
                return;
        }
        switch (theWay) {
            case NORTH:
                System.out.println("Santy...");;
                break;
            case SOUTH:
                System.out.println("Penguins...");;
                break;
            case EAST:
                System.out.println("The land of the rising sun...");;
                break;
            case WEST:
                System.out.println("Hollywood...");;
                break;
        }
    }

    public static void switchDaysInMonth(){
        try {
            System.out.println("Enter a year: ");
            int year = sc.nextInt();
            System.out.println("Enter a month: (1...12):");
            int month = sc.nextInt();
            int numDays = 0;
            final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6, JUL = 7, AUG = 8, SEP = 9, OCT = 10, NOV = 11, DEC = 12;

            switch (month) {
                case JAN:
                case MAR:
                case MAY:
                case JUL:
                case AUG:
                case OCT:
                case DEC:
                    numDays = 31;
                    break;
                case APR:
                case JUN:
                case SEP:
                case NOV:
                    numDays = 30;
                    break;
                case FEB:
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        numDays = 29;
                    } else {
                        numDays = 28;
                    }
                    break;
                default:
                    System.out.println(month + " is not a valid entry for month (1..12).");
            }
            System.out.println("Days in month: " + numDays);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
