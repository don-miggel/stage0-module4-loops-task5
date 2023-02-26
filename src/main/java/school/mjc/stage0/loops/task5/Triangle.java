package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {

        for(int count = 1; count <= cathetusLength; count++){
            String output = "8".repeat(count);
            int offset = cathetusLength - count;
            String spaces = " ".repeat(offset);
            System.out.println(output+spaces);
        }

    }
}
