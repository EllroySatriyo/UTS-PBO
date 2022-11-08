public class Staff extends Karyawan{
    private int bonus;
    private int jam;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int ttl_gajistff(){
        int totalstff;
        bonus = 50000;
        totalstff = getGaji() + (bonus * jam);
        return totalstff;
    }
}
