public class StringOfSubstring {


    public static boolean stringOfSubstring(String s1, String s2){
        int count =0, j =0, k=0;
        char [] str1 = s1.toCharArray();
        char [] str2 = s2.toCharArray();
        int n = s1.length();
        int m= s2.length();


        for(int i=0; i<n; i++){
            if(str1[i] == str2[j]){
                j++;

            } else{
                j=0;

            }
            if(j== str2.length){

                return true;
            }

        }return false;
    }
    public static void main(String[] args) {

        System.out.println(stringOfSubstring("Kunal kheeva the great", "khe"));
    }
}
