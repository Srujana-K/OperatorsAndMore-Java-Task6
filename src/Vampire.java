import java.util.Arrays;

public class Vampire {
    public void getVampireNumbers(int count){
        String[] s1,s2;
        int product=1,res=0;
        for(int i=10;i<1000;i++){
            for(int j=10;j<1000;j++){
                if(res >= count){
                    return;
                }
                product = i*j;
                s1 = String.valueOf(product).split("");
                s2 = (String.valueOf(i)+j).split("");
                Arrays.sort(s1);
                Arrays.sort(s2);
                if(Arrays.equals(s1,s2)){
                    res++;
                    System.err.println(" "+res+". vampire number: "+product);
                }
            }
        }
    }
}
