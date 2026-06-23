import java.util.*;

public class RemovingStarFromString{
    public static String removeStars(String s){
            Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeStars(s));
    }
}