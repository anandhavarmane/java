package pack;
interface display1
{
    void display();
}
public class s2 implements display1{
    String acc,no;
    float c,d,e,f;
    public s2(String a,String b,float c,float d,float e,float f)
    {
        acc=a;
        no=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public void display()
    {
        if(d!=0 || c!=0 )
        {
        System.out.println("---------------------------------");
        System.out.println("Ac/no: "+acc);
        System.out.println("Name: "+no);
        if(d==0)
        System.out.println("Savings account,\nAmount :"+c);
        if(c==0)
        System.out.println("Current account,\nAmount :"+d);
        if(f!=0 || e!=0)
        {
        if(f==0)
        System.out.println("Fixed Deposit,\nAmount :"+e);
        if(e==0)
        System.out.println("Recurring Deposit,\nAmount :"+f);
        }
        System.out.println("---------------------------------");
        }
    }
    public static void main(String[] args)
    {

    }
}