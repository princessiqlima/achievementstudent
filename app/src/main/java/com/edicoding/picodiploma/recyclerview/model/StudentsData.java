package com.edicoding.picodiploma.recyclerview.model;

import java.util.ArrayList;

public class StudentsData {
    public static String[][] data = new String[][]{
            {"Aan Yanuar", "XI RPL 2", "https://smanegeri1pseksu.files.wordpress.com/2017/10/dsc_0010.jpg",
                    "1. Juara 1 LKS Tk. Nasional Bidang Web Desain\n2. Juara 1 LKS Tk. Prov. Jateng Bidang Web Desain\n" +
                            "3. Juara 1 LKS Tk. Kab. Banyumas Bidang Web Desain"},
            {"Denanda Rachel", "X RPL 1", "https://ervinahestiutami.files.wordpress.com/2011/11/1.jpg",
                    "1. Juara 1 Taekwondo 50 kg Tk. Provinsi\n2. Juara 1 Taekwondo 50 kg Tk. Kab. Banyumas"},
            {"Efendi Dimas Setiawan", "X TKJ 4",
                    "http://smktelkom-pwt.sch.id/wp-content/uploads/2018/10/ade-alumni-smk-telkom-purwokerto-2-334x385.jpg",
                    "1. Juara Harapan 2 Popda Renang 100 M Gaya Bebas Tk. Provinsi\n 2. Juara 1 Popda Renang 100 M Gaya Bebas Tk. Kab. Banyumas\n" +
                            "3. Juara 3 Popda Renang 200 M Gaya Bebas Tk. Kab Banyumas"},
            {"Eka Dirgantara", "XI RPL 2",
                    "http://smanbulakamba.sch.id/images/foto/siswa/s1farkhan%20subekhi.jpg",
                    "1. Juara 2 Accoustik Gitar Tk. Kab. Banyumas Th 2018"},
            {"Ferdinan Bachir", "XII TJA 3",
                    "http://1.bp.blogspot.com/-u-afTpjNDKs/UKDUiQeuMRI/AAAAAAAAAAM/2sZhG6-VbCw/s1600/FAJAR+NURDARAJAT.jpg",
                    "1. Juara 2 LKS Tk. Kab Banyumas Bidang Pemrograman Web"},
            {"Herlina Nur Cahyani", "X TJA 3", "https://smanegeri1pseksu.files.wordpress.com/2017/10/dsc_0030.jpg",
                    "1. Juara 3 Kaligrafi Kab. Banyumas dalam rangka Hari Jadi Banyumas"},
            {"Nur Alif Pambudi", "XI TKJ 2", "http://smktelkom-pwt.sch.id/wp-content/uploads/2018/10/panggih-alumni-smk-telkom-purwokerto-1-512x385.jpg",
                    "1. Juara Favorit Kakang Mbokayu Banyumas 2019"},
            {"Siska Khairunissa Istiqomah", "XII TJA 1", "https://cdn.yukepo.com/content-images/listicle-images/2017/08/24/56962.jpg",
                    "1. 10 Besar Undip's Mathematics Competition 2019 Tk. Prov\n2. Juara Harapan 1 Olimpiade Matematika Tk. Kab. Banyumas 2018\n" +
                            "3. Juara 2 Olimpiade Matematika Tk. Kab Banyumas 2019"},
            {"Xander Laurentius Evan", "X RPL 2", "http://smktelkom-pwt.sch.id/wp-content/uploads/2018/10/ade-alumni-smk-telkom-purwokerto-1-512x385.jpg",
                    "1. Juara 3 Popda Futsal Tk. Provinsi Jawa Tengah\n2. Juara 1 Popda Futsal Tk. Kab Banyumas "},
            {"Zindia Lusiana", "XII TJA 4", "https://jasaduplikat.com/wp-content/uploads/2017/11/image-1.jpg",
                    "1. Juara 1 LKS Telkom Distribution Tk. Nasional 2019\n2. Juara 1 LKS Telkom Distribution Tk. Provinsi 2018\n" +
                            "3. Juara 1 LKS Telkom Distribution Tk. Kab Banyumas 2018"},
    };

    public static ArrayList<Student> getListData(){
        ArrayList<Student> list = new ArrayList<>();
        for (String[] aData : data){
            Student student = new Student();
            student.setName(aData[0]);
            student.setKelas(aData[1]);
            student.setPhoto(aData[2]);
            student.setAchievement(aData[3]);

            list.add(student);
        }
        return list;
    }
}
