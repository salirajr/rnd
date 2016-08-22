package js.rnd.hackerrank;

import java.util.Arrays;

public class JavaLoop {

    public boolean hasDuplicate(int[] arg) {
        int i = 1;
        Arrays.sort(arg);
        while (i < arg.length && arg[i - 1] != arg[i++])
			;
        return i != arg.length;
    }

    public static boolean isUnique(int[] arg) {
        System.out.println(Arrays.toString(arg));
        int i = 0, j = 0, k = 0;
        for (i = 0; i < Math.pow(arg.length, 2); i++) {

            j = new Double(Math.floor(i / arg.length)).intValue();
            k = new Double(Math.floor(i % arg.length)).intValue();
            System.out.println(j + "[" + arg[j] + "],[" + arg[k] + "]" + k);

            if (j == k) {
                continue;
            }
            if (arg[j] != arg[k]) {
                break;
            }

        }
        return i == arg.length;
    }

    public static void main(String[] args) {
        int[] datas = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("hasDuplicate: " + new JavaLoop().hasDuplicate(datas));
        System.out.println("isUnique: " + isUnique(datas));
    }
}
