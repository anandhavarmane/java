import java.util.Scanner;
import pack.s2;
class acc{
    public String a,b;
    void dis()
    {
        System.out.println("account no:"+a+"\nname :"+b);
    }
};
class savings extends acc
{
    Scanner sa=new Scanner(System.in);
    float amount=0;
    public void calc()
    {
        System.out.println("Enter amount :");
        amount=sa.nextFloat();
        System.out.println("Savings Account created successfully!!!");
    }
};
class current extends savings
{
    Scanner cu= new Scanner(System.in);
    float amount1=0;
    void calc1()
    {
        System.out.println("Enter amount :");
        amount1=cu.nextFloat();
        System.out.println("Current Account created successfully!!!");
    }
};
class fixed extends current
{
    Scanner fi=new Scanner(System.in);
    float amt=0,amt1=0,inte,inte1,resu,resu1,r,r1;
    int prin,prin1;
    
        public void cal()
        {
            System.out.println("Enter fixed deposit amount :");
            amt=fi.nextFloat();
            System.out.println("Enter fixed deposit interest :");
            inte=fi.nextFloat();
            System.out.println("Enter fixed deposit time period(in months) :");
            prin=fi.nextInt();
            r=amt*prin*inte/(100*12);
            resu=amt+r;
            System.out.println("After "+prin+" months the maturity amount "+resu);
        }
};
 class recurring extends fixed 
{
    public void cal1()
    {
        System.out.println("Enter monthly recurring deposit amount :");
        amt1=fi.nextFloat();
        System.out.println("Enter recurring deposit interest :");
        inte1=fi.nextFloat();
        System.out.println("Enter recurring deposit time period(in months) :");
        prin1=fi.nextInt();
        r1=amt1*prin1*inte1/(100*12);
        resu1=amt1+r1;
        System.out.println("After "+prin1+" months the maturity amount "+resu1);
    }

};
class B extends recurring
{
    Scanner s1=new Scanner(System.in);
    void add()
    {
        
        System.out.println("Enter the amount to be added: ");
        float a=s1.nextFloat();
        amount=amount+a;
    
    }
    void add1()
    {
        System.out.println("Enter the amount to be added: ");
        float a=s1.nextFloat();
        amount1=amount1+a;
    }
    void With()
    {
        System.out.println("Enter the amount to be debited: ");
        float a=s1.nextFloat();
        amount=amount-a;
        if(amount<0)
        {
            System.out.println("Cannot debit from the account!!!");
            amount=amount+a;
        }
    }
    void With1()
    {
        System.out.println("Enter the amount to be debited: ");
        float a=s1.nextFloat();
        amount1=amount1-a;
        if(amount1<0)
        {
            System.out.println("Cannot debit from the account!!!");
            amount1=amount1+a;
        }
    }

};

public class s1 
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int flag=0,user1=0,user=0,m=1;
        System.out.println("enter how many records do you want to save :");
        int n1=n.nextInt();
        n.nextLine();
        B[] r1=new B[n1];
        s2[] s=new s2[n1];
        int ne=1;
      task:
        for(int i=0;i<n1;i++)
        {
        System.out.println((i+1)+".Enter acc no: ");
        r1[i]=new B();
        r1[i].a=n.nextLine();
        for(int l=0;l<i;l++)
        {
        if(r1[i].a.equals(r1[l].a))
        {
        System.out.println("Already a user!!");
        i--;
        continue task;
        }
        }
        for(int j=0;j<r1[i].a.length();j++)
        {
        if(Character.isLetter(r1[i].a.charAt(j)))
        flag=1;
        }
        if(flag==1)
        {
        System.out.println("Enter digits only!!");
        i--;
        flag=0;
        continue task;
        }
        System.out.println("Enter name :");
        r1[i].b=n.nextLine();
        for(int j=0;j<r1[i].b.length();j++)
        {
        if(Character.isDigit(r1[i].b.charAt(j)))
        flag=1;
        }
        if(flag==1)
        {
        System.out.println("Enter Letters only!!");
        i--;
        flag=0;
        continue task;
        }
        while(m!=0){
        System.out.println("Which account want to create,\n1.Savings\n2.current\nOther exit");
                try{
                    user=n.nextInt();   
                }
                catch(Exception e)
                {
                    n.nextLine();
                    System.out.println("enter numbers only in given limit");
                    continue ;
                }
            m=0;
        }
        m=1;
        if(user==1)
        {
            r1[i].calc();
            System.out.println("Which type of deposit want to choose,\n1.Fixed\n2.Recurring\nother exit");
            user1=n.nextInt();
            n.nextLine();
            if(user1==1)
            {
                r1[i].cal();
            }
            else if(user1==2)
            {
                r1[i].cal1();
            }
            else 
            continue task;
        }
        else if(user==2)
        {
            r1[i].calc1();
            System.out.println("Which type of deposit want to choose,\n1.Fixed\n2.Recurring\nother exit");
            int user2=n.nextInt();
            n.nextLine();
            if(user2==1)
            {
                r1[i].cal();
            }
            else if(user2==2)
            {
                r1[i].cal1();
            }
            else 
            continue task;
        }
        else 
        continue task;
        
        }
    while(ne!=0)
    {
        Scanner w1=new Scanner(System.in);
        System.out.println("1.Add\n2.Withdraw\nother exit");
        int w=w1.nextInt();
        w1.nextLine();
        if(w==1)
        {
            ne=0;
            int f=0,f1=0;
            System.out.println("Enter Ac/no :");
            String a1=w1.nextLine();
            for(int v=0;v<n1;v++)
            {
                if(a1.equals(r1[v].a))
                {
                    f=1;
                    f1=v;
                }
            }
            if(f==1)
            {
                if(user==1)
                r1[f1].add();
                else if (user==2)
                r1[f1].add1();
            }
            else
            System.out.println("invalid ac/no!!!");
        }
        else if(w==2)
        {
            ne=0;
            int f=0,f1=0;
            System.out.println("Enter Ac/no :");
            String a1=w1.nextLine();
            for(int v=0;v<n1;v++)
            {
                if(a1.equals(r1[v].a))
                {
                    f=1;
                    f1=v;
                }
            }
            if(f==1)
            {
                if(user==1)
                r1[f1].With();
                else if(user==2)
                r1[f1].With1();
            }
            else
            System.out.println("invalid ac/no!!!");
        }
        else 
        break;
        w1.close();
    }
        
    for(int m1=0;m1<n1;m1++)
    {
        s[m1]=new s2(r1[m1].a,r1[m1].b,r1[m1].amount,r1[m1].amount1,r1[m1].amt,r1[m1].amt1);
        s[m1].display();
    }
    n.close();
    
    }
    


}
