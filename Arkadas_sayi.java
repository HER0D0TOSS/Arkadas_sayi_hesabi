public class Main {

    public static void main(String[] args) {

        int sayi1 = 220;
        int sayi2 = 284;

        int hesap1=0;
        int hesap2 =0;


        for(int i=1;i<sayi1;i++){
           // System.out.println(i);
            if(sayi1 % i==0){
                //System.out.println(i);
                hesap1 += i;
            }
            }
        for(int j =1;j<sayi2;j++){
            if(sayi2 % j ==0){
                //System.out.println(j);
                hesap2 += j;
            }
        }
        if(hesap1 ==sayi2 && hesap2==sayi1){
            System.out.println("Bu sayılar arkadaş sayıdır");
        }
        else{
            System.out.println("Bu sayılar arkadaş değildir");
        }
    }
}

