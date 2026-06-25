public class Day3 {
    public static void main(String[] args){
        int number= 40;
        if(number%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");


        int a = 10;
        int b = 20;
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);

        int marks=80;
        if(marks>=90)
            System.out.println("A");
        else if(marks>=75)
            System.out.println("B");
        else if(marks>=50)
            System.out.println("C");
        else
            System.out.println("Fail");


        int day=7;
        switch(day){
            case 1:System.out.println("Monday"); break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
            case 7:System.out.println("SUNDAY");break;
            default:
                System.out.println("Invalid day");
        }
    }
}
