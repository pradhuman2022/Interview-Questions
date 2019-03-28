public class MissingElement_IB {
     
    public static void main(String args[])
    {
        int arr[] = new int[]{1,2,3,5,3} ;
        arr = missingValue(arr) ;
        for(int y : arr) 
            System.out.print(y+" ");
    }
    static int[] missingValue(int arr[])
    {
        int n = arr.length ;
        int sum = (n*(n + 1)) / 2 ;
        int sum1 = 0;
        int sum_sq_ar = 0 ;
        for(int x : arr)
        { 
            sum_sq_ar += x * x ;
            sum1 += x ;
        }
        int sumsq = 0 ;
        for(int i = 1 ; i <= n ;i++)
            sumsq += (i * i) ;
       //int sum_sq_ar = 0 ;
       System.out.println(sumsq+" "+sum_sq_ar) ;
       
        int diff_sq = sumsq - sum_sq_ar ;
        int diff = sum - sum1 ;
        int x = diff_sq / diff;
        System.out.println(diff_sq+ " "+ diff) ;
        int A = (x +  diff) / 2 ;
        int B = A - diff ; 
     return new int[]{A,B} ;   
    }
    
}
