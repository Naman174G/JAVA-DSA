import java.util.Scanner;

 class Switch{
    public static void main(String[] args) {

        // Take a number input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7: ");
        int number = input.nextInt();

        // Corresponding case is executed depending on the value of number
        switch (number) {
            case 1:
                System.out.println("It's Sunday!");
                break;

            case 2:
                System.out.println("It's Monday!");
                break;

            case 3:
                System.out.println("It's Tuesday!");
                break;

            case 4:
                System.out.println("It's Wednesday!");
                break;

            case 5:
                System.out.println("It's Thursday!");
                break;

            case 6:
                System.out.println("It's Friday!");
                break;

            case 7:
                System.out.println("It's Saturday!");
                break;

            default:
                System.out.println("Invalid Number");
        }
    }
}