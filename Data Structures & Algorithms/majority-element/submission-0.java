class Solution {
    public int majorityElement(int[] nums) {
      int n=nums.length;
      int el=0;
      int freq=0;
      for(int num:nums){
        if(freq==0){
            el=num;
            freq=1;
        }
        else if(num==el){
            freq++;
        }
        else{
            freq--;
        }
      }  
      return el;
    }
}