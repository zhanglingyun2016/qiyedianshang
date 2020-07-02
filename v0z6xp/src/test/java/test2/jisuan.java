package test2;

public class jisuan {
    public static void main(String[] args) {
        suan();
    }


    public static void suan(){
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                if (i*i+j*j==130 && i+j==16){
                    System.out.println("x = "+i+"    "+"y = "+j);
                }
            }
        }


    }
}
