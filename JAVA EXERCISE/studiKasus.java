import java.util.*;
/*  inputDataMenu();
bandingHarga(int min, int max);
    }
//data menu makanan
public static void inputDataMenu()    */
public class studiKasus {
//main method
public static void main(String[] args) {
int[][] menu = inputDataMenu();
bandingHarga(menu);
    }
//data menu makanan
public static int[][] inputDataMenu(){
Scanner sc = new Scanner(System.in);
int [][] menu = new int [3][3];    
String [] namaMenu = {"Makanan berat","Minuman","cemilan"};
System.out.println("===Harga Menu===");
int sum=0;
 //input harga menu
for(int i=0;i<menu.length;i++){
System.out.println("harga untuk "+namaMenu[i]);
    for(int j=0;j<menu[i].length;j++){
    System.out.print(namaMenu[i]+(j+1)+": ");
    menu[i][j] = sc.nextInt();
    sum += menu[i][j];
    }
    
}
 //output harga menu
for(int i=0;i<menu.length;i++){
System.out.println("harga untuk "+namaMenu[i]+":");
    for(int j=0;j<menu[i].length;j++){
    System.out.println(namaMenu[i]+" "+(j+1)+":"+menu[i][j]);
    }
 //total harga
}
System.out.println("total kalau beli semua masing masing 1 adalah: "+sum);

return menu;
    }
public static void bandingHarga(int[][] menu){
    int min=menu[0][0];
    int max=menu[0][0];
    for(int i=0;i<menu.length;i++){
        for(int j=0;j<menu[i].length;j++){
            if(menu[i][j]<min){
                min=menu[i][j];
            }
            if(menu[i][j]>max){
                max=menu[i][j];
            }
        }
    }
System.out.println("harga termurah adalah: "+min);
System.out.println("harga termahal adalah: "+max);



}
}