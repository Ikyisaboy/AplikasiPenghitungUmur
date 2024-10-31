import java.time.LocalDate;
import java.time.Period;

public class PenghitungUmurHelper {
    public String hitungUmurDetail(LocalDate lahir,LocalDate sekarang){
        Period usia = Period.between(lahir,sekarang);
    return usia.getYears() + "tahun," + usia.getMonths() + "bulan," + usia.getDays() + "hari";
}
// Menghitung hari ulang tahun berikutnya
public LocalDate hariUlangTahunBerikutnya(LocalDate lahir, LocalDate 
sekarang) {
 LocalDate ulangTahunBerikutnya =
lahir.withYear(sekarang.getYear());
 if (!ulangTahunBerikutnya.isAfter(sekarang)) {
 ulangTahunBerikutnya = ulangTahunBerikutnya.plusYears(1);
 }
 return ulangTahunBerikutnya;
}
// Menerjemahkan teks hari ke bahasa Indonesia
public String getDayOfWeekInIndonesian(LocalDate date) {
 switch (date.getDayOfWeek()) {
 case MONDAY:
 return "Senin";
 case TUESDAY:
 return "Selasa";
 case WEDNESDAY:
 return "Rabu";
 case THURSDAY:
 return "Kamis";
 case FRIDAY:
 return "Jumat";
 case SATURDAY:
 return "Sabtu";
 case SUNDAY:
 return "Minggu";
 default:
 return "";
 }
}

    private void harireturn(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}