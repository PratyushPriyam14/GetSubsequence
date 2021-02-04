import java.util.*;
public class GetSubsequence
{
    public static void main(String args[])throws Exception
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        ArrayList<String> result = gss(str);
        System.out.println(result);
    }
    //faith  bc=[--,-c,b-,bc]
    //expetation abc=[when a says no then--> ---,--c,-b-,-bc][when a says yes then-->a--,a-c,ab-,abc]

    public static ArrayList<String>gss(String str) {
        if(str.length()==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch = str.charAt(0); //abc->a
        String ros = str.substring(1); //abc->bc
        ArrayList<String> rresult = gss(ros);// result for this line will be [--,-c,b-,bc]

        ArrayList<String> myreslut = new ArrayList<>();
        for (String rstr : rresult) {  //when a said no
            myreslut.add(" " + rstr);
        }
        for (String rstr : rresult) { //when a said yea
            myreslut.add(ch + rstr);
        }
       /* String s="hello";
        System.out.println(s);
        char c=s.charAt(0);
        System.out.println(c);
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            System.out.println(ch);
        }
        */
     /*   ArrayList<Integer>i=new ArrayList<>();
        i.add(10);
        i.add(20);
        i.add(30);
        System.out.println(i);
        System.out.println(i.size());
            i.add(1,300);
        for(int value:i){
            System.out.println(value);
            // i.set(1,3000);
        }

      */
        return myreslut;
    }
}
