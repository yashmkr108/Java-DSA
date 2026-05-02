import java.util.Scanner;

public class Conditionals {
    public static void main() {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//
//        // if-else
//        if (age == 0) {
//            System.out.println("Please born first");
//        }else if(age < 18){
//            System.out.println("the age is less than 18");
//        }else{
//            System.out.println("the age is greater than 18");
//        }
//
//        // Ternary
//        System.out.println("Entere the status: ");
//        boolean isTrue = sc.nextBoolean();
//        String status = (isTrue == true) ? "Yes the value is true" : "Yes the value if false";
//        System.out.println(status);
//
//        // Switch Case
//        System.out.println("Enter the number in words");
//        String number = sc.next();
//        switch (number){
//            case "one":
//                System.out.println("the value is one");
//                break;
//            case "two":
//                System.out.println("the value is two");
//                break;
//            default:
//                System.out.println(number);
//        }

        // Questions
        // 1. Take the input of age and print if he/she is eligible for vote or not
        System.out.println("Enter you name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println(name + ", you are eligible for vote");
        } else {
            System.out.println(name + ", you are not eligible for vote");
        }

        // 2. take input of five subject and print the overall percentage
        System.out.println("Enter your marks " + name);
        System.out.println("Subject 1");
        int subject1 = sc.nextInt();
        System.out.println("Subject 2");
        int subject2 = sc.nextInt();
        System.out.println("Subject 3");
        int subject3 = sc.nextInt();
        System.out.println("Subject 4");
        int subject4 = sc.nextInt();
        System.out.println("Subject 5");
        int subject5 = sc.nextInt();
        int total5 = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentageOverall = (total5/500.0)*100;
        System.out.println("Overall percentage is " + percentageOverall);

        //3. take a lowercase character print its uppercase version
        System.out.println("Enter the character in lowercase e.g a, b, c....");
        char lowerCase = sc.next().charAt(0);
        System.out.println("This is an uppercase version :" + Character.toUpperCase(lowerCase)); // Inbuild method of character class

        //4. take an uppercase character print its lowercase version
        System.out.println("Enter the character in uppercase e.g A, B, C....");
        char upperCase = sc.next().charAt(0);
        System.out.println("This is a lowercase version :" + Character.toLowerCase(upperCase));

        // 5. take input of five subject and print the percentage of top four marks
        System.out.println("Enter your marks of 5 subject top 4 will be use to calculate percentage" + name);
        System.out.println("Subject 1");
        int subject10 = sc.nextInt();
        System.out.println("Subject 2");
        int subject20 = sc.nextInt();
        System.out.println("Subject 3");
        int subject30 = sc.nextInt();
        System.out.println("Subject 4");
        int subject40 = sc.nextInt();
        System.out.println("Subject 5");
        int subject50 = sc.nextInt();

        int min = subject10;
        if (subject20 < min) min = subject20;
        if (subject30 < min) min = subject30;
        if (subject40 < min) min = subject40;
        if (subject50 < min) min = subject50;

        int total = subject50 + subject10 + subject20 + subject30 + subject40 - min;
        double percentage = (total / 400.0) * 100;
        System.out.println("Percentage top 4 subjects: " + percentage);

        sc.close();
    }
}
