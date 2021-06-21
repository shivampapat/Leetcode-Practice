public class ReverseInteger {
      
            public int reverse(int x) {
                
                String neg = "";
                if(x < 0){
                    neg = "-";
                    x = -x;
               }
                //Convert to wrapper
                Integer X = Integer.valueOf(x);
                
                //Make string to reverse it
                StringBuilder s = new StringBuilder(X.toString());
                s.reverse();
                s.insert(0,neg);
                
                int result;
                //If number greate than make it 0
                try{
                    result = Integer.parseInt(s.toString());
                }
                catch(NumberFormatException e){
                    result = 0;
                }
                return result;
            }
        
}
