class Solution {
    public int mySqrt(int x) {
     if(x==0||x==1) return x;
     int start=2;
     int end=x/2;
     int answer=0;
     while(start<=end){
        long mid=start+(end-start)/2;
        if(mid*mid==x){
            return(int) mid;
        }
        else if(mid*mid>x){
          end=(int)mid-1;
        }
        else{
            start=(int)mid+1;
            answer=(int)mid;
        }
     }
     return answer;
    }
}