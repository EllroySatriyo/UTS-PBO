public class Dosen extends Karyawan{
    private int nidn;
    private String jurusan;
    private int bonus;
    private int sks;

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int ttl_gajidsn(){
        int totaldsn;
        bonus = 100000;
        totaldsn = getGaji() + (bonus * sks);
        return totaldsn;
    }
}
