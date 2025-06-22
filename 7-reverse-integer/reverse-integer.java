class Solution {
    public int reverse(int x)
    {
        int res = 0;
     while(x != 0)
     {
        int ld   = x%10;
         x = x/10;
         if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
                return 0; // Return 0 if overflow occurs
            }
        res = (res*10) +ld;
       
     }   
    return res;
    }
}