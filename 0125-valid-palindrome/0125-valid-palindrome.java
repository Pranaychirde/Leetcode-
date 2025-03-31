class Solution {
    public boolean isPalindrome(String s) {
     return checkPalindrome(s.toLowerCase(),0,s.length()-1);   
    }

    private boolean checkPalindrome(String s,int start,int end){
      
     

        if(start >= end){
            return true;
        }

        if(!Character.isLetterOrDigit(s.charAt(start))){
         return checkPalindrome(s,start+1,end);
        }

        if(!Character.isLetterOrDigit(s.charAt(end))){
          return checkPalindrome(s,start,end-1);
        }

        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }

        return checkPalindrome(s,start+1,end-1);
    }
}