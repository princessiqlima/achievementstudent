package com.edicoding.picodiploma.recyclerview.model;

import java.util.ArrayList;

public class StudentsData {
    public static String[][] data = new String[][]{
            {"a", "1", "http://www.asliindonesia.net/wp-content/uploads/2015/12/doraemon-1.png", "huh"},
            {"b", "2", "http://www.asliindonesia.net/wp-content/uploads/2015/12/doraemon-1.png", "hudh"},
            {"c", "3", "http://www.asliindonesia.net/wp-content/uploads/2015/12/doraemon-1.png", "hdudh"},
            {"d", "4", "http://www.asliindonesia.net/wp-content/uploads/2015/12/doraemon-1.png", "hudddh"},
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
