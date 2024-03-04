class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    boolean even(int num)
    {
        int nofdigits=digits(num);
        if(nofdigits%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int digits(int num)
    {
        int count=0;
        if(num<0)
        {
            num=num*-1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}