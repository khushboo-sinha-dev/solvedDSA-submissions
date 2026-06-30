class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int n=weights.length;
      int start=Arrays.stream(weights).max().getAsInt();
      int end=Arrays.stream(weights).sum();
      int ans=0;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(canPossible(weights,mid,days)){
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
      }
      return ans;
    }
    private boolean canPossible(int []weights,int mid,int days){
        int totalDays=1;
        int totalWeights=0;
        for(int w:weights){
            if(totalWeights+w>mid){
                totalDays++;
                totalWeights=w;
            }
            else{
                totalWeights+=w;
            }
        }
        return (totalDays<=days);
    }
}