import java.util.HashMap;
class revString {
    public static void main(String[] args) {
        String str1 = "Hello !How Are You";
        String str = "hello how are you";
        revStr(str);
        up(str);
        lc(str1);
        firstLetterOfEveryWordUpperrCase(str);
        vowelup(str);
        replaceVowelWithNextUpperCaseVowel(str);

    }
    static void revStr(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed String: " + new String(arr));
    }
    static void lc(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                arr[i] = (char)(arr[i] + 32);
            }
        }
        System.out.println("Lowercase String: " + new String(arr));
    }
     static void up(String str) {
        char[] arr1 = str.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 97 && arr1[i] <= 122) {
                arr1[i] = (char)(arr1[i]-32);
     }
        }
        System.out.println("UPPERCASE  LETTER:"+ new String (arr1));
     }
     static void firstLetterOfEveryWordUpperrCase(String str) {
        char[] arr2 = str.toCharArray();
        // if(arr2[0]>=97 && arr2[0]<=122){
        //     arr2[0]=(char)(arr2[0]-32);
        // }
        for (int i = 0; i < arr2.length; i++) {
            // if (i == 0 && arr2[i] >= 97 && arr2[i] <= 122) {
            //     arr2[i] = (char)(arr2[i] - 32);
            // } else if (arr2[i] == ' ' && i + 1 < arr2.length && arr2[i + 1] >= 97 && arr2[i + 1] <= 122) {
            //     arr2[i + 1] = (char)(arr2[i + 1] - 32);
            // }
            if((i==0 || arr2[i-1]==' ') && arr2[i]>=97 && arr2[i]<=122){
                arr2[i]=(char)(arr2[i]-32);
            }
        }
        System.out.println("First Letter of Every Word Uppercase: " + new String(arr2));
     }
     static void vowelup(String str){
        char[] arr3 = str.toCharArray();
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == 'a' || arr3[i] == 'e' || arr3[i] == 'i' || arr3[i] == 'o' || arr3[i] == 'u') {
                arr3[i] = (char)(arr3[i] - 32);
            }
        }
        System.out.println("Vowels in Uppercase: " + new String(arr3));
     }  
     static void replaceVowelWithNextUpperCaseVowel(String str){
         char[] arr4 = str.toCharArray();
        // for (int i = 0; i < arr4.length; i++) {
        //     if (arr4[i] == 'a') {
        //         arr4[i] = 'E';
        //     } else if (arr4[i] == 'e') {
        //         arr4[i] = 'I';
        //     } else if (arr4[i] == 'i') {
        //         arr4[i] = 'O';
        //     } else if (arr4[i] == 'o') {
        //         arr4[i] = 'U';
        //     } else if (arr4[i] == 'u') {
        //         arr4[i] = 'A';
        //     }
        // }
        // switch(arr4[i]){
        //     case 'a':
        //         arr4[i]='E';
        //         break;
        //     case 'e':
        //         arr4[i]='I';
        //         break;
        //     case 'i':
        //         arr4[i]='O';
        //         break;
        //     case 'o':
        //         arr4[i]='U';
        //         break;
        //     case 'u':
        //         arr4[i]='A';
        //         break;
        // }
        HashMap<Character, Character> vowelMap = new HashMap<>();
        vowelMap.put('a', 'E');
        vowelMap.put('e', 'I');
        vowelMap.put('i', 'O');
        vowelMap.put('o', 'U');
        vowelMap.put('u', 'A');
        for (int i = 0; i < arr4.length; i++) {
        if(vowelMap.containsKey(arr4[i])){
            arr4[i]=vowelMap.get(arr4[i]);
        }
    }
        System.out.println("Vowels Replaced with Next Uppercase Vowel: " + new String(arr4));
     }     

}