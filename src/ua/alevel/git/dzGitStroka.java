package ua.alevel.git;

public class dzGitStroka {
    public static void main(String[] args) {
        String str = new String("Wake up Neo wW");
        System.out.println(str);
        str = str.replaceAll(" ","");
        System.out.println(str);
        boolean isPoleandrom=true;
        for (int i = 0; i < str.length()/2; i++) {
            //System.out.print(str.charAt(i));
            if(str.charAt(i)!=str.charAt((str.length()-1-i))){
                isPoleandrom=false;
            }
        }
        System.out.println();
        System.out.println(str+" polyandrom is "+isPoleandrom);
    }
}
