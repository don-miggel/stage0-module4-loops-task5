package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        int offset = sideLength/2;
        int middleSize = Math.round((float) sideLength/2);
        String spaces = " ".repeat(offset);
        for(int i = 1; i <= sideLength; i++){
            if (i == middleSize){
                String output = "8".repeat(sideLength);
                System.out.println(output);

            }
            else
                System.out.println(spaces+"8"+spaces);
        }

    }
}
