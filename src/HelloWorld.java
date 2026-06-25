public class HelloWorld {

    public static void main(String[] args) {
        int num1 = 20;
        int num2=6;
        int sum=num1+num2;
        int difference=num1-num2;
        int product=num1*num2;
        int Quotient=num1/num2;
        int remainder=num1%num2;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(Quotient);
        System.out.println(remainder);

        int age=17;
        if(age>18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not Eligible to Vote");

        int number=68;
        if(number>50 && number %2==0)
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}