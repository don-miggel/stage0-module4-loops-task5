package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        int offset = 0;
        for(int i = height,  j = 0; i > 1; i -= 2, j++){
            String output = "8".repeat(i);
            String spaces = " ".repeat(j);
            System.out.print(spaces+output+spaces+"\n");
            offset = j;
        }
        int startWith = (height % 2 == 0) ? 2 : 1;
        int newOffset = (startWith == 2) ? offset : offset+1;
        for(int i =  startWith,  j = newOffset; i <= height ; i += 2, j--){
            String output = "8".repeat(i);
            String spaces = " ".repeat(j);
            System.out.print(spaces+output+spaces+"\n");
        }

    }
}
