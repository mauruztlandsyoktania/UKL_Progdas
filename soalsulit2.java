public class soalsulit2 {
    public static void main(String[] args) {
        // contoh array input
        int[] array = {1, 2, 3, 4, 2, 5};  

        // panggil method untuk mengecek elemen duplikat
        cekDuplikat(array);
     }  

     // Method untuk mengecek elemen duplikat
    public static void cekDuplikat(int[] array) {
        boolean adaDuplikat = false; // Penanda jika menemukan duplikat
        System.out.println("Array memiliki elemen duplikat");

        // Loop untuk mencari elemen duplikat
        for (int e = 0; e < array.length; e++){
            for (int j = e + 1; j < array.length; j++){
            if (array [e] == array [j]) {

                System.out.println(array[e] + " ");
                adaDuplikat = true;
                
            }
        } 

        // jika tidak ada duplikat
        if(!adaDuplikat) {
            System.out.println("Tidak ada");
        } else {
            System.out.println(); // pindah baris
        }
    }
}
}
        
    
     
    
        