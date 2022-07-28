class Solution {
    public boolean backspaceCompare(String s, String t) {
     Stack<Character> s1=new Stack();
        Stack<Character> s2=new Stack();
    String str1="",str2= "";
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)!= '#')
             s1.push(s.charAt(i));
         else if(s.charAt(i)== '#' && !s1.isEmpty())
             s1.pop();
     }
        for(int i=0;i<t.length();i++)
     {
         if(t.charAt(i) != '#')
             s2.push(t.charAt(i));
         else if(t.charAt(i) == '#' && !s2.isEmpty())
             s2.pop();
     }
        while(!s1.empty())
        {
            str1=str1+s1.pop();
        }
        while(!s2.isEmpty())
        {
            str2=str2+s2.pop();
        }
        return str1.equals(str2);
    }
}