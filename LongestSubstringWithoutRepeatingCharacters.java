public class LongestSubstringWithoutRepeatingCharacters {
      
            public int lengthOfLongestSubstring(String s) {
                
                
                if(s.length() <2){
                    return s.length();
                }
                
                int count =0,temp_count=0;;
                
                LinkedList<Character> q=  new LinkedList<Character>();
                
                char[] arr = s.toCharArray();
                
                for(char ch : arr){
                    if(q.contains(ch)){
                        
                        if(count < temp_count){
                            count = temp_count;
                        }
                        while(q.contains(ch)){
                            q.removeFirst();
                            temp_count--;
                        }
                    }
                    q.addLast(ch);
                    temp_count++;
                }
                
                if(count < temp_count){
                    count = temp_count;
                }
                
                return count;
            }
        
}
