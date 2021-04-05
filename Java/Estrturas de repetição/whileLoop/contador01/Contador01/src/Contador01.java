public class Contador01 {
    public static void main(String[] args) throws Exception {
        int cc = 1;

        while(cc <= 10){
            cc++;
            if((cc % 2) != 0){
                continue;
            }
            System.out.println("Cambalhota! " + cc);
            
        }
        
    }
}
