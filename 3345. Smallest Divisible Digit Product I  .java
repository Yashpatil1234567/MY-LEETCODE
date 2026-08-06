class Solution {
    public int smallestNumber(int n, int t) {
      
      while(true){
          int product = 1 ;
          int num = n ;
          
          while(num>0){
            int temp = num%10;
            product*=temp;
            num/=10;
          }
        

        if(product % t == 0){
            return n ;
        }
        else{
            n++;
        }
      }
       
    }
}
