public class Triangle {
    int a;
    int b;
    int c;

    public void area(int a,int b ,int c ){
        int s=0;
        s=(a+b+c)/2;
        s=s*(s-a)*(s-b)*(s-c);
        System.out.println(Math.sqrt(s));

    }
}
