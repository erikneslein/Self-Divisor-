public class Code1
{
    public static boolean isSelfDivisor(int n)
    {
        boolean result = true;
        while (n>0)
        {
            int digit =  n%10;
            if (digit==0 || (n%digit)!=0) 
                result = false;
            n/=10;
        }
        return result;
    }
    
    public static int[] firstNumSelfDivisor(int start, int num)
    {
        
    }
}
