import java.util.*;
class helloworld
{
    public static void main(String args[])
    {
        for(int i=1;i<=100;i++)
            {
                int flag=0;
                if(i==1)
                {
                    flag=1;
                }
                else
                {
                for(int j=2;j<=Math.sqrt(i);j++)
                    {
                        if(i%j==0)
                        {
                            flag=1;
                            break;
                        }
                    }
                }
                if(flag==0)
                    System.out.print(i+" ")
            }
    }
}
