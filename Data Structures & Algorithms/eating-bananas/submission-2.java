class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int n=piles.length;
       int start=1;
       int end=Arrays.stream(piles).max().getAsInt();
       int ans= end;
       while(start<=end){
        int mid=start+(end-start)/2;
        if(canEat(mid,piles,h)){
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
       }
       return ans;
    }
    private boolean canEat(int mid,int []piles,int h){
        int total=0;
        for(int p:piles){
            total+=(p+mid-1)/mid;
        }
        return total<=h;
    }
}
