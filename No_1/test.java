// Untuk kode lama sebelum modifikasi

public class test {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        r.harga_makanan[0] = 100000;
        r.nama_makanan[0] = "Pizza";
        r.stok[0] = 20;
        Restaurant.id = 3;// id bertipe statis bisa diakses tanpa membuat objek

        System.out.println(r.harga_makanan[0]);
        System.out.println(r.nama_makanan[0]);
        System.out.println(r.stok[0]);
        System.out.println(Restaurant.id);
    }
}
