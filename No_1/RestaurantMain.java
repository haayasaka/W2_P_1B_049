public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        menu.nextId();

        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        menu.nextId();

        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        menu.nextId();

        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);

        System.out.println("=== Menu Makanan ===");
        menu.tampilMenuMakanan();

        menu.pesanMakanan((byte) 0, 1L);
        menu.pesanMakanan((byte) 1, 1L);
        menu.pesanMakanan((byte) 2, 1L);
        menu.pesanMakanan((byte) 3, 1L);

        System.out.println("\n=== Pesanan Makanan ===");
        menu.tampilkanPesanan();

        System.out.println("\n=== Testing Setters & Getters ===");

        menu.setId((byte) 3);
        menu.setNama_makanan("Chicken Steak Deluxe");
        menu.setHarga_makanan(50000.0);
        menu.setStok(15);
        menu.setPesanan_pcs(2);
        menu.setPesanan_total_harga(100000.0);

        System.out.println("ID: " + menu.getId());
        System.out.println("Nama Makanan: " + menu.getNama_makanan());
        System.out.println("Harga Makanan: " + menu.getHarga_makanan());
        System.out.println("Stok: " + menu.getStok());
        System.out.println("Pesanan Pcs: " + menu.getPesanan_pcs());
        System.out.println("Total Harga Pesanan: " + menu.getPesanan_total_harga());

        System.out.println("\n=== Testing Validasi Stok ===");
        System.out.print("Input Stok Negatif (Misal: -5): ");
        menu.nextId();
        menu.tambahMenuMakanan("Menu Invalid", 10000, -5);
    }
}
