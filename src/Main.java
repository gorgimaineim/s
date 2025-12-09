import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String string = "book";
        String string1 = "";

        for (int i = 0; i < string.length(); i++){

            string1 = string.charAt(i) + string1;
        }
        System.out.println(string1);

        int[] arr = new int[4];
        arr[0] = 66;
        arr[1] = 79;
        arr[2] = 79;
        arr[3] = 75;
        System.out.println(amocana1(arr));
    }

    public static String amocana1(int[] number){
        String ret = "";
        for (int i = 0; i < number.length; i++) {
            ret += (char)number[i];

        }
        return ret;
    }

    public static String codedWriting(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                if((c >= 'X' && c <= 'Z') || c >= 'x'){ c -= 23;}
                else c+=3;
            }
            result += c;

        }
        return result;


    }

}














































































//        Iphone iphone = new Iphone(4322, 2025, "orange");
//        iphone.call(591302233);
//        iphone.alarm(10);
//        iphone.charge(59);
//
//        Samsung s24 = new Samsung(1000,2025,"black");
//        s24.call(12645174);
//        s24.alarm(12645174);
//        s24.charge(12645174);
//        s24.photoEdit();
//        s24.photoGenerate();
//        s24.systemInfoAndroid();
//        s24.wirelessCharging();}
//
//    static int[]amocana(int length){
//        int[][] arr = new int[length][length];
//        Random random = new Random();
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                arr[i][j] = random.nextInt(3,21);
//            }
//        }
//        if (length%2==0){
//            int[] arr2 = new int[4];
//            arr2[0] = arr[length/2-1][length/2-1];
//            arr2[1] = arr[length/2-1][length/2+1];
//            arr2[2] = arr[length/2+1][length/2-1];
//            arr2[3] = arr[length/2+1][length/2+1];
//            return arr2;
//        }
//        else{
//            int[] arr2 = new int[1];
//            arr2[0] = arr[length/2][length/2];
//            return arr2;
//        }
//    }
//
//
//
//}