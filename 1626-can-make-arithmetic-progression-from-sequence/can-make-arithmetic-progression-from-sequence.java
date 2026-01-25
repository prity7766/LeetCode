class Solution{
    public boolean canMakeArithmeticProgression(int[] arr){
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        boolean ans=true;
        for(int i=1; i< arr.length-1; i++){
            if(arr[i+1]-arr[i]!=d){
                ans=false;
            }
        }
        return ans;
    }
}