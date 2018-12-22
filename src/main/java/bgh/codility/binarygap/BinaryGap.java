package bgh.codility.binarygap;

import org.springframework.stereotype.Component;

@Component
public class BinaryGap {

    public int findGap (int input) {
        int max = 0;

        String binaryStr = Integer.toBinaryString(input);
        System.out.println("binary string: " + binaryStr);

        StringBuilder stringBuilder = new StringBuilder("");

        for (char ch: binaryStr.toCharArray()) {
            if (ch == '0') {
                stringBuilder.append(ch);
            } else {
                if (stringBuilder.toString().length() > 0) {
                    max = (max > stringBuilder.toString().length() ? max : stringBuilder.toString().length());
                    //System.out.println("zero string: " + stringBuilder.toString());
                    stringBuilder.delete(0, stringBuilder.toString().length());
                }
            }
        }

        System.out.println("Max zero string has " + max + " zeros");
        return max;
    }
}
