public class StringOfSubstring {


    public static boolean stringOfSubstring(String s1, String s2){
        int j =0;
        //convert both the strings to array
        char [] str1 = s1.toCharArray();
        char [] str2 = s2.toCharArray();
        int n = s1.length();


        // increment the count of the j only when it finds its match in the str1
        //else make j=0 everytime to restart the count
        // and when length of j becomes the length of required substring which means it exists in str1

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
