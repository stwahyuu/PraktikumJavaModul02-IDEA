import model.Mahasiswa;

public class main {
    public static void main(String[] args) {
        String namaDepan = "Septian";
        String namaTengah = "Tri";
        String namaBelakang = "Wahyudin";
        int usia = 19;
        int TargetTahunKuliah = 4;
        double ipk = 3.900;
        char nilaiAbjad = 'A';
        boolean tampan = true;
        System.out.println(namaDepan + namaTengah + namaBelakang);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String  uniskaString = new String(uniskaChar);
        System.out.println(uniskaChar);
        String namaLengkap = namaDepan +" "+ namaTengah +" "+ namaBelakang;
        System.out.println(namaLengkap);
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(uniskaString.indexOf("NIS"));
        System.out.println(namaLengkap.substring(8));
        System.out.println(namaLengkap.substring(8,12));

        String[] namaArray = namaLengkap.split("");
        for(String nama : namaArray)
            System.out.println(nama);


    }
}
