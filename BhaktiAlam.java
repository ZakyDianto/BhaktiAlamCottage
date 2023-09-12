import java.util.Scanner;

public class BhaktiAlam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("BHAKTI ALAM COTTAGE");
        System.out.println(" ");
        System.out.println("Daftar Harga                                    (Weekday)       (Weekend)        (Holiday)");
        System.out.println("-Cottage Duku dan Jeruk:                        Rp915.000       Rp1.025.000      Rp1.225.000");
        System.out.println("-Cottage Alpukat dan Jambu Air:                 Rp575.000       Rp695.000        Rp895.000");
        System.out.println("-Cottage Durian dan Melon:                      Rp595.000       Rp715.000        Rp915.000");
        System.out.println("-Cottage Belimbing, Mangga, dan Kedondong:      Rp495.000       Rp575.000        Rp755.000");
        
        System.out.println(" ");
        System.out.println("COTTAGE");
        
        System.out.println("- Duku     - Jambu Air   - Belimbing ");
        System.out.println("- Jeruk    - Durian      - Mangga");
        System.out.println("- Alpukat  - Melon       - Kedondong");
        
       System.out.println("\n               BATALKAN              \n");
        
        System.out.println("Masukkan Nama Cottage: ");
        
        
        int harga=0;
        String Cottage = input.nextLine();
        
        System.out.println("Masukkan Hari: ");
        String hari = input.nextLine();
        
        System.out.println("Jumlah Bermalam: ");
        int malam = input.nextInt();
        

        if (Cottage.equalsIgnoreCase("Duku") ){
            
            switch(hari){
                case "Weekday":
                harga = 915000;
                break;

                case "Weekend":
                harga = 1025000;
                break;

                case "Holiday":
                harga = 1225000;
                break;

                default:
                harga = 0;
            }
        }

        else if (Cottage.equalsIgnoreCase("Jeruk") ){
            
            switch(hari){
                case "Weekday":
                harga = 915000;
                break;

                case "Weekend":
                harga = 1025000;
                break;

                case "Holiday":
                harga = 1225000;
                break;

                default:
                harga = 0;
            }
        }

        else if(Cottage.equalsIgnoreCase("Alpukat")){

            switch(hari){
                case "Weekday":
                harga = 575000;
                break;

                case "Weekend":
                harga = 695000;
                break;

                case "Holiday":
                harga = 895000;
                break;

                default:
                harga = 0;
            }
        }

        else if(Cottage.equalsIgnoreCase("Jambu Air")){

            switch(hari){
                case "Weekday":
                harga = 575000;
                break;

                case "Weekend":
                harga = 695000;
                break;

                case "Holiday":
                harga = 895000;
                break;

                default:
                harga = 0;
            }
        }

        else if(Cottage.equalsIgnoreCase("Durian")){

            switch(hari){
                case "Weekday":
                harga = 595000;
                break;

                case "Weekend":
                harga = 715000;
                break;

                case "Holiday":
                harga = 915000;
                break;

                default:
                harga = 0;
            }
        }

        else if(Cottage.equalsIgnoreCase("Melon")){

            switch(hari){
                case "Weekday":
                harga = 595000;
                break;

                case "Weekend":
                harga = 715000;
                break;

                case "Holiday":
                harga = 915000;
                break;

                default:
                harga = 0;
            }
        }

        else if(Cottage.equalsIgnoreCase("Belimbing")){
            
            switch(hari){
                case "Weekday":
                harga = 495000;
                break;

                case "Weekend":
                harga = 575000;
                break;

                case "Holiday":
                harga = 755000;
                break;

                default:
                harga = 0;
            }
        }

        else if(Cottage.equalsIgnoreCase("Mangga")){
            
            switch(hari){
                case "Weekday":
                harga = 495000;
                break;

                case "Weekend":
                harga = 575000;
                break;

                case "Holiday":
                harga = 755000;
                break;

                default:
                harga = 0;
            }
        }

        else if(Cottage.equalsIgnoreCase("Kedondong")){
            
            switch(hari){
                case "Weekday":
                harga = 495000;
                break;

                case "Weekend":
                harga = 575000;
                break;

                case "Holiday":
                harga = 755000;
                break;

                default:
                harga = 0;
            }
        }

        else if(Cottage.equalsIgnoreCase("Batalkan")){
            System.out.println("Terima Kasih Sudah Berkunjung");
        }

        else{
            System.out.println("Pilih sesuai opsi");
        }



       
        System.out.println(" ");
        System.out.println("Hasil Pemesanan");
        System.out.println("Cottage yang dipilih: Cottage " +Cottage);
        System.out.println("Hari: " +hari +" untuk " +malam +" malam ");
        System.out.println("Total Harga: Rp" +harga*malam);

      
    }
}
