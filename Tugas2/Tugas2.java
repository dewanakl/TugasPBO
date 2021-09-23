package Tugas2;

class Teknisi {
    protected String nama;
    protected boolean statusTeknisi;
    protected boolean statusPerbaikan;

    public Teknisi(String nama, boolean statusTeknisi) {
        this.nama = nama;
        this.statusTeknisi = statusTeknisi;
    }

    public boolean menerimaLaporan(String alamat) {
        if (this.statusTeknisi) {
            this.statusPerbaikan = true;
        } else {
            this.statusPerbaikan = false;
        }
        System.out.println(this.nama + " sedang memperbaiki di tempat " + alamat);
        return this.statusPerbaikan;
    }
}

class Pelanggan {
    protected String nama;
    protected String alamat;
    protected boolean statusPerbaikan;

    public Pelanggan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void membuatLaporan(Teknisi teknisi) {
        this.statusPerbaikan = teknisi.menerimaLaporan(this.alamat);
    }

    public String lihatLaporan() {
        if (this.statusPerbaikan) {
            return "Perbaikan berhasil";
        } else {
            return "Masih dalam perbaikan";
        }
    }
}

public class Tugas2 {
    public static void main(String[] args) {
        Pelanggan budi = new Pelanggan("budi", "jalan indonesia merdeka");
        // true ketika kosong/tidak dalam mengerjakan dari pelanggan lain
        Teknisi maspras = new Teknisi("maspras", true);

        budi.membuatLaporan(maspras);
        System.out.println(budi.lihatLaporan());
    }
}
