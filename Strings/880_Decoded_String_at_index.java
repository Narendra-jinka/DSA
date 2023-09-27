class Solution {
    public static StringBuilder repeat(StringBuilder str,int r){
        StringBuilder sub=str;
        for(int i=0;i<r-1;i++){
            str=new StringBuilder(str+""+sub);
        }
        return str;
    }
    public String decodeAtIndex(String s, int k) {
        if(s.length()==0){
            return "";
        }
        if(k==1){
            return ""+s.charAt(0);
        }
        StringBuilder sb=new StringBuilder("");
        for(char c:s.toCharArray()){
            if(!Character.isDigit(c)){
                sb=new StringBuilder(sb+""+c);
            }
            else{
               sb=repeat(sb,Integer.parseInt(c+""));
            }
            if(sb.length()==k){
                break;
            }
        }
        return ""+sb.charAt(k-1);
    }
}
