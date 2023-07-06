
public class Main {
    public static void main(String[] args) {
        char [] hi = {'h','e','l','l','o'};
        int i=0;
        int j = hi.length-1;

        while (i<j){
            char current = hi[i];
            hi[i] = hi[j];
            hi[j] = current;
            i++;
            j--;
        }
        System.out.println(hi);

    }
}
