import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        Staff stff = new Staff();
        Scanner sc =  new Scanner(System.in);

        System.out.println("Masukkan nama NIP dosen : ");
        dsn.setNip(sc.nextInt());
        System.out.println("Masukkan NIDN Dosen : ");
        dsn.setNidn(sc.nextInt());
        System.out.println("Masukkan Nama Dosen : ");
        dsn.setNama(sc.next());
        System.out.println("Masukkan Alamat Dosen : ");
        dsn.setAlamat(sc.next());
        System.out.println("Masukkan Tanggal Lahir Dosen : ");
        dsn.setTl(sc.next());
        System.out.println("Masukkan Jenis Kelamin Dosen : ");
        dsn.setJk(sc.next());
        System.out.println("Masukkan Tahun Masuk Dosen : ");
        dsn.setThn_masuk(sc.nextInt());
        System.out.println("Masukkan Jurusan Dosen : ");
        dsn.setJurusan(sc.next());
        System.out.println("Masukkan SKS lebih : ");
        dsn.setSks(sc.nextInt());

        System.out.println("Masukkan nama NIP Staff : ");
        stff.setNip(sc.nextInt());
        System.out.println("Masukkan Nama Staff : ");
        stff.setNama(sc.next());
        System.out.println("Masukkan Alamat Staff : ");
        stff.setAlamat(sc.next());
        System.out.println("Masukkan Tanggal Lahir Staff : ");
        stff.setTl(sc.next());
        System.out.println("Masukkan Jenis Kelamin Staff : ");
        stff.setJk(sc.next());
        System.out.println("Masukkan Tahun Masuk Staff : ");
        stff.setThn_masuk(sc.nextInt());
        System.out.println("Masukkan Lama Lembur(jam) : ");
        stff.setJam(sc.nextInt());

        System.out.println("NIP dosen : " + dsn.getNip());
        System.out.println("NIDN Dosen : " + dsn.getNidn());
        System.out.println("Nama Dosen : " + dsn.getNama());
        System.out.println("Alamat Dosen : " + dsn.getAlamat());
        System.out.println("Tanggal Lahir Dosen : " + dsn.getTl());
        System.out.println("Jenis Kelamin Dosen : " + dsn.getJk());
        System.out.println("Tahun Masuk Dosen : " + dsn.getThn_masuk());
        System.out.println("Jurusan Dosen : " + dsn.getJurusan());
        System.out.println("SKS lebih : " + dsn.getSks());
        System.out.println("Total Gaji : " + dsn.ttl_gajidsn());

        System.out.println("nama NIP Staff : " + stff.getNip());
        System.out.println("Nama Staff : " + stff.getNama());
        System.out.println("Alamat Staff : " + stff.getAlamat());
        System.out.println("Tanggal Lahir Staff : " + stff.getTl());
        System.out.println("Jenis Kelamin Staff : " + stff.getJk());
        System.out.println("Tahun Masuk Staff : " + stff.getThn_masuk());
        System.out.println("Lama Lembur(jam) : " + stff.getJam());
        System.out.println("Total Gaji : " + stff.ttl_gajistff());
    }
}