package com.dicoding.antreyuk;

import java.util.ArrayList;

public class CompanyData {
    private static String[] compNames ={
        "Bank I",
        "Bank II",
        "Bank III",
        "K. Imigrasi I",
        "K. Imigrasi II",
        "K. Imigrasi III",
        "Klinik I",
        "Klinik II",
        "Klinik III",
        "Samsat I",
        "Samsat II",
        "Samsat III"
    };

    private static String[] compService = {
        "1. Penarikan uang\n" +
                "2. Setor Uang\n" +
                "3. Buka Rekening\n" +
                "4. Transfer\n" +
                "5. Deposit\n" +
                "6. Keluhan/pengaduan",
            "1. Penarikan uang\n" +
                    "2. Setor Uang\n" +
                    "3. Buka Rekening\n" +
                    "4. Transfer\n" +
                    "5. Deposit\n" +
                    "6. Keluhan/pengaduan",
            "1. Penarikan uang\n" +
                    "2. Setor Uang\n" +
                    "3. Buka Rekening\n" +
                    "4. Transfer\n" +
                    "5. Deposit\n" +
                    "6. Keluhan/pengaduan",
        "1. Buat Passport\n" +
                "2. Pelayanan WNA\n" +
                "3. Pemberian Surat Keterangan Keimigrasian\n" +
                "4. Layanan Pemberian ITAS Baru\n" +
                "5. Pendaftaran Kewarganegaraan Ganda Terbatas\n" +
                "6. Keluhan/Pengaduan",
            "1. Buat Passport\n" +
                    "2. Pelayanan WNA\n" +
                    "3. Pemberian Surat Keterangan Keimigrasian\n" +
                    "4. Layanan Pemberian ITAS Baru\n" +
                    "5. Pendaftaran Kewarganegaraan Ganda Terbatas\n" +
                    "6. Keluhan/Pengaduan",
            "1. Buat Passport\n" +
                    "2. Pelayanan WNA\n" +
                    "3. Pemberian Surat Keterangan Keimigrasian\n" +
                    "4. Layanan Pemberian ITAS Baru\n" +
                    "5. Pendaftaran Kewarganegaraan Ganda Terbatas\n" +
                    "6. Keluhan/Pengaduan",
        "1. Pelayanan Kesehatan Tingkat Pertama (Puskesmas, Klinik Kesehatan, dan Dokter Umum)\n" +
                "2. Pelayanan Kesehatan Rujukan Tingkat Lanjutan (Rumah Sakit)\n" +
                "3. Pelayanan Ambulans Daran dan/atau Air\n" +
                "4. Pengaduan",
            "1. Pelayanan Kesehatan Tingkat Pertama (Puskesmas, Klinik Kesehatan, dan Dokter Umum)\n" +
                    "2. Pelayanan Kesehatan Rujukan Tingkat Lanjutan (Rumah Sakit)\n" +
                    "3. Pelayanan Ambulans Daran dan/atau Air\n" +
                    "4. Pengaduan",
            "1. Pelayanan Kesehatan Tingkat Pertama (Puskesmas, Klinik Kesehatan, dan Dokter Umum)\n" +
                    "2. Pelayanan Kesehatan Rujukan Tingkat Lanjutan (Rumah Sakit)\n" +
                    "3. Pelayanan Ambulans Daran dan/atau Air\n" +
                    "4. Pengaduan",
        "1. Samsat Induk\n" +
                "2. Samsat Drive Thru\n" +
                "3. Samsat Keliling\n" +
                "4. Gerai Samsat\n" +
                "5. Samsat Keccamatan\n" +
                "6. Pengaduan",
            "1. Samsat Induk\n" +
                    "2. Samsat Drive Thru\n" +
                    "3. Samsat Keliling\n" +
                    "4. Gerai Samsat\n" +
                    "5. Samsat Keccamatan\n" +
                    "6. Pengaduan",
            "1. Samsat Induk\n" +
                    "2. Samsat Drive Thru\n" +
                    "3. Samsat Keliling\n" +
                    "4. Gerai Samsat\n" +
                    "5. Samsat Keccamatan\n" +
                    "6. Pengaduan"
    };

    private static int[] compImages = {
        R.drawable.bank,
        R.drawable.bank2,
        R.drawable.bank3,
        R.drawable.k_imigrasi,
        R.drawable.k_imigrasi2,
        R.drawable.k_imigrasi3,
        R.drawable.bpjs,
        R.drawable.bpjs2,
        R.drawable.bpjs3,
        R.drawable.samsat,
        R.drawable.samsat2,
        R.drawable.samsat3
    };

    private static String[] compAddress = {
            "Jl. Buah Batu No.162, Cijagra, Kec. Lengkong, Kota Bandung, Jawa Barat 40265",
            "Jl. Arcamanik Endah B No.50, Sukamiskin, Kec. Arcamanik, Kota Bandung, Jawa Barat 40293",
            "Jl. A.H. Nasution No.94 B, Sukamiskin, Kec. Arcamanik, Kota Bandung, Jawa Barat 40293",
            "Jl. Surapati No.82, Cihaur Geulis, Kec. Cibeunying Kaler, Kota Bandung, Jawa Barat 40122",
            "Gedung Binacitra, Jl. Soekarno-Hatta No.162, Kb. Lega, Kec. Bojongloa Kidul, Kota Bandung, Jawa Barat 40235",
            "Jl. Nasional III No.65, Bojong, Karangtengah, Kabupaten Cianjur, Jawa Barat 43281",
            "Jl. Taruna No.2A, Sindang Jaya, Kec. Mandalajati, Kota Bandung, Jawa Barat 40293",
            "Jl. A.H. Nasution Jl. Cijambe No.57, Pasir Endah, Kec. Ujung Berung, Kota Bandung, Jawa Barat 40619",
            "Cluster Pesona Pasir Endah, Jl. Kosar, Pasir Endah, Kec. Ujung Berung, Kota Bandung, Jawa Barat 40619",
            "Jl. Kawaluyaan Raya, Jatisari, Kec. Buahbatu, Kota Bandung, Jawa Barat 40286",
            "Jl. Soekarno-Hatta No.528A, Sekejati, Kec. Buahbatu, Kota Bandung, Jawa Barat 40286",
            "Jl. Talaga Bodas No.40, Lkr. Sel., Kec. Lengkong, Kota Bandung, Jawa Barat 40261"
    };

    private static String[] compTips = {
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan KTP, kartu ATM, serta buku rekening\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan KTP, kartu ATM, serta buku rekening\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan KTP, kartu ATM, serta buku rekening\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan dokumen-dokumen lengkap\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan dokumen-dokumen lengkap\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan dokumen-dokumen lengkap\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan KTP (atau kartu identitas lain) serta kartu layanan kesehatan\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan KTP (atau kartu identitas lain) serta kartu layanan kesehatan\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan KTP (atau kartu identitas lain) serta kartu layanan kesehatan\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan STNK lama dan KTP pemilik kendaraan\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan STNK lama dan KTP pemilik kendaraan\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
            "1. Wajib Pakai Masker\n" +
                    "2. Siapkan STNK lama dan KTP pemilik kendaraan\n" +
                    "3. Hadir 10 menit sebelum Antrean\n" +
                    "4. Kontak : 08xxxxxxxxxx",
    };

    private static String[] compQueue = {
            "AX00","AY00","AZ00","BX00","BY00","BZ00","CX00","CY00","CZ00","DX00","DY00","DZ00"
    };

    static ArrayList<Company> getListData() {
        ArrayList<Company> list = new ArrayList<>();
        for (int idx = 0; idx < compNames.length; idx++) {
        Company company = new Company();
        company.setCompany(compNames[idx]);
        company.setDetail(compService[idx]);
        company.setBrand(compImages[idx]);
        company.setAddress(compAddress[idx]);
        company.setTips(compTips[idx]);
        company.setQueue(compQueue[idx]);
        list.add(company);
        }
        return list;
    }
}
