/*neptunel
/08/05/2020*/

public class AtariPuzzle {

    public static int totalGameNumCalculator(int jeton,int kredi){
       int totalGameNum=0;
        if(jeton<2&&kredi<2){//base case 
            return totalGameNum;
        }
        else {
         // en basta bir kez toplam jetonlarla oynanacak oyun sayisi jeton/2 ile bulunduktan sonra sonraki adim icin 0 olmali.Basta 0 olan kredi sayisini methodun jeton parametresi yerine vererek bu sorunu cozduk.Daha sonra jeton sayisi kredinin oyuna donen kismi ve kalan kismini da kullanarak sorunu cozuyor.
            totalGameNum= jeton/2+totalGameNumCalculator(kredi,jeton/2+kredi%2);
           
	    return totalGameNum;
        }
    }

    public static void main(String[] args) {
// Recursive method jeton sayisi n olup ciftse oynanacak oyun sayisi olarak n-1,tekse n-2 basmalidir.

        System.out.println("Oyuncunun başlangıç jeton sayısı:​ 18"+"\n"+"Oyuncunun toplam oynayabileceği oyun sayısı:       "+totalGameNumCalculator(18,0));

	System.out.println("Oyuncunun başlangıç jeton sayısı:​ 17"+"\n"+"Oyuncunun toplam oynayabileceği oyun sayısı:       "+totalGameNumCalculator(17,0));
	
	System.out.println("Oyuncunun başlangıç jeton sayısı:​ 16"+"\n"+"Oyuncunun toplam oynayabileceği oyun sayısı:       "+totalGameNumCalculator(16,0));
	
	System.out.println("Oyuncunun başlangıç jeton sayısı:​ 11"+"\n"+"Oyuncunun toplam oynayabileceği oyun sayısı:       "+totalGameNumCalculator(11,0));

	System.out.println("Oyuncunun başlangıç jeton sayısı:​ 1"+"\n"+"Oyuncunun toplam oynayabileceği oyun sayısı:       "+totalGameNumCalculator(1,0));

	System.out.println("Oyuncunun başlangıç jeton sayısı:​ 33"+"\n"+"Oyuncunun toplam oynayabileceği oyun sayısı:       "+totalGameNumCalculator(33,0));

	System.out.println("Oyuncunun başlangıç jeton sayısı:​ 323"+"\n"+"Oyuncunun toplam oynayabileceği oyun sayısı:       "+totalGameNumCalculator(323,0));

	System.out.println("Oyuncunun başlangıç jeton sayısı:​ 0"+"\n"+"Oyuncunun toplam oynayabileceği oyun sayısı:       "+totalGameNumCalculator(0,0));
    }
}
