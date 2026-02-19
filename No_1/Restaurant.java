public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private long[] pesanan_pcs;
    private double[] pesanan_total_harga;
    private int[] stok;
    private byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        pesanan_pcs = new long[10];
        pesanan_total_harga = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;

        if (validateStock(stok)) {
            this.stok[id] = stok;
        } else {
            System.out.println("Stok tidak boleh negatif");
        }
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(i + ". " + nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
            }
        }
    }

    public void tampilkanMenuIdSekarang() {
        System.out.println(id + ". " + nama_makanan[id] + "[" + stok[id] + "]" + "\tRp. " + harga_makanan[id]);
    }

    public void pesanMakanan(byte id, long pcs) {
        if (!isOutOfStock(id) && pcs <= stok[id] && pcs > 0) {
            this.pesanan_pcs[id] = pcs;
            this.pesanan_total_harga[id] = harga_makanan[id] * pcs;
            this.stok[id] -= pcs;
        } else {
            System.out.println("Pesanan ditolak, stok tidak cukup");
        }
    }

    public void resetPesanan(byte id) {
        this.pesanan_pcs[id] = 0;
        this.pesanan_total_harga[id] = 0;
    }

    public void tampilkanPesanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(i + ". " + nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i] + "\t"
                        + pesanan_pcs[i] + "pcs\tRp. " + pesanan_total_harga[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if (stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void nextId() {
        id++;
    }

    public void resetId() {
        id = 0;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public byte getId() {
        return id;
    }

    public void setNama_makanan(String nama) {
        this.nama_makanan[id] = nama;
    }

    public void setHarga_makanan(double harga) {
        this.harga_makanan[id] = harga;
    }

    public void setStok(int stok) {
        this.stok[id] = stok;
    }

    public void setPesanan_pcs(long pesanan_pcs) {
        this.pesanan_pcs[id] = pesanan_pcs;
    }

    public void setPesanan_total_harga(double pesanan_total_harga) {
        this.pesanan_total_harga[id] = pesanan_total_harga;
    }

    public String getNama_makanan() {
        return nama_makanan[id];
    }

    public double getHarga_makanan() {
        return harga_makanan[id];
    }

    public int getStok() {
        return stok[id];
    }

    public long getPesanan_pcs() {
        return pesanan_pcs[id];
    }

    public double getPesanan_total_harga() {
        return pesanan_total_harga[id];
    }

    private boolean validateStock(long stok) {
        if (stok < 0) {
            return false;
        } else {
            return true;
        }
    }
}
