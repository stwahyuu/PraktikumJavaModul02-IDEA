package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    private String npm;
    private String nama;
    private Date tanggalLahir;

    final String POLA_TANGGAL = "dd-MM-yyyy";
    final SimpleDateFormat SDF = new SimpleDateFormat(POLA_TANGGAL);

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa() {
        System.out.println("ini dari constructor");
    }

    public Mahasiswa(String npm, String nama, Date tanggalLahir) {
        this.npm = npm;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    void tampilkanAtribut() {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);
        try {
            tanggalLahir = simpleDateFormat.parse("27-09-2001");

            System.out.println("Nama \t\t\t : " + nama);
            System.out.println("Npm \t\t\t : " + npm);
            System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(tanggalLahir));
        } catch (ParseException e) {
            System.err.println("Format Tanggal Salah");
        }
    }

    int hitungUsia() {
        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggalLahir);
        Calendar hariIni = Calendar.getInstance();

        int selisihTahun = hariIni.get(Calendar.YEAR) - tanggalLahir.get(Calendar.YEAR);

        if (hariIni.get(Calendar.MONTH) < tanggalLahir.get(Calendar.MONTH)) {
            selisihTahun--;
        } else {
            if (hariIni.get(Calendar.MONTH) == tanggalLahir.get(Calendar.MONTH)
                    &&
                    hariIni.get(Calendar.DAY_OF_MONTH) < tanggalLahir.get(Calendar.DAY_OF_MONTH)) {
                selisihTahun--;
            }
        }
        return selisihTahun;
    }
}
