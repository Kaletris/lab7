import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            String[] line = scanner.nextLine().split(";");
            String caesar = m.caesarCode(line[0], line[1].charAt(0));
            System.out.println(caesar);
        }
         */
        CaesarFrame caesarFrame = new CaesarFrame();
        caesarFrame.setVisible(true);
    }

    private String caesarCode(String input, char offset){
        char[] caesar = input.toUpperCase().toCharArray();
        offset = (char)(Character.toUpperCase(offset) - 'A');
        for(int i = 0; i < caesar.length; i++){
            if(caesar[i] != ' ') {
                if (caesar[i] + offset > 'Z') {
                    caesar[i] = (char) (caesar[i] + offset + 'A' - 'Z' - 1);
                } else {
                    caesar[i] = (char) (caesar[i] + offset);
                }
            }
        }

        return new String(caesar);
    }
}