import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int l=1;
        int r=3;
        for(int i=0;i<5;i++){
            System.out.println(l+r);
            l=r;
            r=l+r;
        }
        
    }
}