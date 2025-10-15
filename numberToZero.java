class Solution {
    public int numberOfSteps(int num) 
    {
        
        int ans= helper(num, 0);
        return ans;
        
    }

    static int helper(int num, int count)
    {
        //base case
        if(num ==0)
        {
            return count;
        }

        if(num%2 !=0)//odd
        {
            return helper(num-1,count+1);
        }
        return helper(num/2, count+1); //even
    }
}
