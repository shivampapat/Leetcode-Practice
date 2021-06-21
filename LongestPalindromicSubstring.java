public class LongestPalindromicSubstring {

            public String longestPalindrome(String s) {
                
                if(s.length() == 0){
                    return null;
                }
                if(s.length()==1){
                    return s;
                }
                
                String long_palin = null;
                
                //Creating boolean array for storing palindromes of substrings
                boolean[][] is_palin = new boolean[s.length()][s.length()];
                
                int max_len = Integer.MIN_VALUE;
                int max_i=0;
                int max_j=0;
                
                //Go from back to front
                for(int i=s.length()-1 ;i>=0;i--){
                    //For each character go back till string ends
                    for(int j=i;j<s.length();j++){
                        
                        //if both characters are same then check 
                          //whether they are less than 3 characters
                          //or
                          //whether their prev substring was palindrome
                        if(s.charAt(i) == s.charAt(j) && ((j-i <3) || is_palin[i+1][j-1] == true)){
                            is_palin[i][j] =true;
                            
                            if(max_len < (j-i)){
                                max_len = j-i;
                                max_i = i;
                                max_j = j;
                            }
                        }
                    }
                }
                
                long_palin = s.substring(max_i,max_j+1);
                return long_palin;
            }
        
}
