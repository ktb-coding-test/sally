class Solution {
    public String solution(String p) {
        return recursion(p);
    }
    static String recursion(String p){
        if(p.isEmpty()) return "";
        int balance = 0;
        int index = 0; //분리할 지점
        for(int i =0; i<p.length(); i++){
            if (p.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            if(balance == 0){
                index = i + 1;
                break;
            }
        }
        String u = p.substring(0, index);
        String v = p.substring(index);
        //u가 올바른 문자열이면 재귀로 뒷 부분도 판단
        if(isCorrect(u))
            return u + recursion(v);
        //u가 올바른 문자열이 아니라면 실행
        String str = "(";
        str += recursion(v);
        str += ")";
        u = u.substring(1, u.length()-1);
        for(int i =0; i<u.length(); i++){
            if(u.charAt(i) == '(')
                str += ")";
            else
                str += "(";                   
        }
        return str;
    } 
    
    
    static boolean isCorrect(String u){
        int balance = 0;
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            } //')'가 먼저 나오면 올바르지 않은 문자열 리턴 false
           if(balance < 0)
               return false;
    }//아니면 리턴 true
        return balance == 0;
}
}