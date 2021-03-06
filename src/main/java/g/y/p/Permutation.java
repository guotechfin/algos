package g.y.p;

public class Permutation {
    public static void main(String[] args) {
//        permutation("1234");
        String str = "ABCD";
        permu(str,0,str.length()-1);
    }

    public static void permutation(String input){
        permute("",input);
    }

    /**
     * PN = ai,PN-1 for each i in N
     */
    private static void permute(String perm, String word){
        if(word.isEmpty()){
            System.out.println(perm);
        }else{
            for(int i=0;i<word.length();i++){
                //char[i] as pivot
                permute(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1));
            }
        }
    }

    private static void permu(String str,int l, int r){
        if(l==r){
            System.out.println(str);
        }else{
            for(int i=l;i<=r;i++){
                System.out.println("swap l "+ str.charAt(l) + " and i " +str.charAt(i));
                str = swap(str,l,i);
                System.out.println("after swap : "+str);
                permu(str,l+1,r);
                //backtrack
                System.out.println("swap back l "+ str.charAt(l) + " and i " +str.charAt(i));
                str = swap(str,l,i);
                System.out.println("after swap back: "+str);
            }
        }

    }

    private static String swap(String src,int i,int j){
        char t;
        char[] chars = src.toCharArray();
        t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
        return String.valueOf(chars);
    }
}
