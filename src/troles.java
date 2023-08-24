public class troles {
    public static void main(String[] args) {
        public String frontTimes(String str, int n) {
            int firstThree=3;
            if(firstThree>str.length()){
                firstThree=str.length();
            }
            String front=str.substring(0,firstThree);
            String result="";
            for(int i=0; i<n; i++){
                result=result+front;
            }
            return result;
        }
    }
}
