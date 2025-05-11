import java.util.Scanner;

class v_19 {

// 1.
    public static void main(String[] args) {
        int n = 15;
        if (n==15) {
            System.out.println("you are a child");
            } else {
                System.out.println("you are not a child");
            }

// 2.

        Scanner sc = new Scanner(System.in);
        byte a,b,c;
        System.out.println("enter the number of bengali: ");
        a=sc.nextByte();
        System.out.println("Enter the number of english: ");
        b=sc.nextByte();
        System.out.println("enter the number of geography: ");
        c=sc.nextByte();
        float total=(a+b+c)/3.0f;
        if(total>=40 && a>=33 &&  b>=33 && c>=33){
            System.out.println("your result is pass with "+total+" marks");
            }else{
                System.out.println("your result is fail with "+total+" marks");
    }

// 3.

// Scanner sc = new Scanner(System.in);
       System.out.println("Enter your income in Lakhs per annum");
       float tax = 0;
       float income = sc.nextFloat();
       if(income<=2.5){
           tax = tax + 0;
       }
       else if(income>2.5f && income <= 5f){
           tax = tax + 0.05f * (income - 2.5f);
       }
       else if(income>5f && income <= 10.0f){
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (income - 5f);
       }
       else if(income>10.0f){
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (10.0f - 5f);
           tax = tax + 0.3f * (income - 10.0f);
       }

       System.out.println("The total tax paid by the employee is: " + tax);

// 4.

int day = 5;
switch (day) {
    case 1 :
    System.out.println("Sunday"); 
    break;
    case 2:
    System.out.println("Monday");
    break;
    case 3:
    System.out.println("Tuesday");
    break;
    case 4 :
    System.out.println("Wednesday");
    break;
    case 5:
    System.out.println("Thursday");
    break;
    case 6:
    System.out.println("Friday");
    break;
    case 7:
    System.out.println("Saturday");
    break;
    default:
    System.out.println("Invalid Day Number");
    break;
}   

// 5.

    System.out.println("enter the year: ");
    int year =sc.nextInt();
    if (year % 4 == 0 && year  % 100 != 0 || year % 400==0 ) {
        System.out.println(year+" is leap year");
        }else{
            System.out.println(year+ "is not a leap year");
    }

// 6.

    String website = sc.next();
    if(website.endsWith(".com")){
        System.out.println("This is a commercial Website.");
    }else if(website.endsWith(".org")) {
        System.out.println("This is an organization Website.");
    } else if (website.endsWith(".in")){
        System.out.println("This is an Indian Website.");
    }
}
}

// finish.
