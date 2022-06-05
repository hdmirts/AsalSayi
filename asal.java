public class asal {
    public static void main(String[] args){
       
        System.out.println("2\n");     
        int sayac=0;
        for(int k=2;k<100;k++){
            for(int i=2; i<k; i++){
                if(k%i!=0){
                    sayac++;
                    if(sayac== (k-2)){
                        System.out.println(k + "\n");
                        sayac =0;
                    
                    }
    
                }else{
                    sayac=0;
                    break;
                }
            }

        }

        
    }
    
}
