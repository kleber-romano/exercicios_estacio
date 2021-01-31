import javax.swing.*;

public class Main {
   /* private  int v;


    public void Descoberta(int  p)    { v= p+1;  }


    public void faz(int p)           {v = v + p; }


    public void  exec()  {

        System.out.print("   " + v);      }

}
*/

    public static void main(String args[]) {

        String a = "3";
        int saida = 0;
        try {
            int i = Integer.parseInt(a);
            saida = i;
        } catch (Exception e) {
            saida = -1;
        } finally {
            saida = 10;
        }

        System.out.println(saida);
    
}



}