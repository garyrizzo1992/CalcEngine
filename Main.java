package com.garyrizzo.calcengine;

public class Main {

    public static void main(String[] args) {


        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] RightVals = {100.0d, 25.0d, 225.0d, 11.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] result = new double[opCodes.length];


        for (int i = 0; i < opCodes.length; i++)
        {


            System.out.printf("opcode: %s increment: %s Condition: IF ",Character.toString(opCodes[i]),Integer.toString(i));

            if (opCodes[i] == 'a')
                result[i] = leftVals[i] + RightVals[i];
            else if (opCodes[i] == 's')
                result[i] = leftVals[i] - RightVals[i];
            else if (opCodes[i] == 'd')
                result[i] = RightVals[i]!= 0.0d ? leftVals[i] / RightVals[i] : 0.0d;
            else if (opCodes[i] == 'm')
                result[i] = leftVals[i] * RightVals[i];
            else
                result[i] = 0.0d;

            System.out.println(result[i]);




            System.out.printf("opcode: %s increment: %s Condition: Switch ",Character.toString(opCodes[i]),Integer.toString(i));

            switch (opCodes[i]) {
                case 'a':
                    result[i] = leftVals[i] + RightVals[i];break;
                case 's':
                    result[i] = leftVals[i] - RightVals[i];break;
                case 'd':
                    result[i] = RightVals[i] != 0.0d ? leftVals[i] / RightVals[i] : 0.0d;break;
                case 'm':
                    result[i] = leftVals[i] * RightVals[i];break;
                default:
                    result[i] = 0.0d;break;


            }
            System.out.println(result[i]);
        }



        /*
        if (opCode == 'a')
            result = val1+val2;
        else if (opCode =='s')
            result = val1-val2;
        else if (opCode =='d')
            result = val2 != 0.0d ? val1/val2 : 0.0d;
        else if (opCode =='m')
            result = val1*val2;
        else {
            System.out.println("incorrect app code");
            result = 0.0d;
        }
        System.out.println(result);
*/

    }
}
