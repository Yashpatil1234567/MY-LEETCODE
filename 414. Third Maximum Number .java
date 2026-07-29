class Solution {
    public int thirdMax(int[] arr) {
       Arrays.sort(arr);
        int n=arr.length;
        int count=1;
        int max = arr[arr.length-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[i+1]){
                count++;
            }
           
           if(count==3){
            return arr[i];
           }
                
          
        }
       

       return max;
    }
}
