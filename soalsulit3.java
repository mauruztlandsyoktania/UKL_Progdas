import java.util.HashMap; 
public class soalsulit3 {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        // Gunakan HashMap untuk menyimpan elemen sebagai kunci dan frekuensinya sebagai nilai
        HashMap<Integer, Integer> frekuensiMap = new HashMap<>();

        // Loop untuk menghitung frekuensi setiap elemen
        for (int elemen : array) {
            // Jika elemen sudah ada dalam HashMap, tambahkan 1 ke frekuensinya
            frekuensiMap.put(elemen, frekuensiMap.getOrDefault(elemen, 0) + 1);
        }
        
        // Cetak frekuensi untuk setiap elemen
        for (int elemen : frekuensiMap.keySet()) {
            System.out.println(elemen + " muncul " + frekuensiMap.get(elemen) + " kali");
        }
    }
}

