public class Day4 {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }


        int a=1;
        while(a<=10){
            System.out.println(a);
            a++;
        }


        int b=1;
        do{
            System.out.println(b);
            b++;
        }while(b<=10);

       int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);

        for(int i=1;i<=20;i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }

        int abc = 1234;
        while(abc>0){
            System.out.print(abc%10);
            abc=abc/10;
        }
    }
}
