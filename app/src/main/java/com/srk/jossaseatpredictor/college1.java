package com.srk.jossaseatpredictor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.app.ListActivity;
import androidx.appcompat.app.AppCompatActivity;
public class college1 {
    private String collegeName;
    private String branch;
    private String category;
    private String gender;
    private int opRank;
    private int clRank;
    public static ArrayList<String> collegeNameList = new ArrayList<>();
    public static ArrayList<String> collegeBranchList = new ArrayList<>();
    public static ArrayList<String> branchNameList = new ArrayList<>();
    public static ArrayList<String> categoryList = new ArrayList<>();
    public static ArrayList<String> genderList = new ArrayList<>();
    public static ArrayList<Integer> openingRankList = new ArrayList<>();
    public static ArrayList<Integer> closingRankList = new ArrayList<>();
    public static ArrayList<String> colleges = new ArrayList<>();
    public static ArrayList<String> stringOfClosingRanks=new ArrayList<>();
    public static ArrayList<String> quota=new ArrayList<>();
    public static int i=0;

    public static ArrayList<String> getDataOf(InputStream a) throws IOException {
        ArrayList<String> b = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(a));
        while (reader.ready()) {
            b.add(reader.readLine());
        }
        return b;
    }

    public static ArrayList<Integer> getDataOfInteger(InputStream a) throws IOException {
        ArrayList<Integer> b = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(a));
        int i=0;
        while (reader.ready()) {
            String s = reader.readLine();
            if (s.charAt(s.length() - 1) != 'P') {
                b.add(Integer.parseInt(s));
            }
            else {
                b.add(Integer.parseInt(s.substring(0, s.length() - 1)));
               // collegeBranchList.set(i,collegeBranchList.get(i)+"(Preparatory course)");


            }
            i++;

        }
        return b;
    }
    public static ArrayList<String> changeForPreparatory(InputStream b)throws IOException {
        ArrayList<String> a=new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(b));
        int i=0;
        while(reader.ready()){
            String s=reader.readLine();
            a.add(s);
            if(s.charAt(s.length()-1)=='P'){
                collegeBranchList.set(i, collegeBranchList.get(i).concat("(Preparatory Course)"));
            }
            i++;
        }
        return a;
    }
    public static void changePreparatory() {
        int i=0;
        for(String a:stringOfClosingRanks){
            if(a.charAt(a.length()-1)=='P'){
                collegeBranchList.set(i, collegeBranchList.get(i).concat("(Preparatory Course)"));
            }
            i++;
        }
    }





    public String getCollegeName() {
        return collegeName;
    }

    public String toString() {
        return collegeName;
    }

    public String getBranch() {
        return branch;
    }

    public String getCategory() {
        return category;
    }

    public String getGender() {
        return gender;
    }

    public int getOpRank() {
        return opRank;
    }

    public int getClRank() {
        return clRank;
    }

    public static ArrayList<String> classifyBydata(String examName, String category, int rank, String collegeType, String seatPool) {
        ArrayList<String> a=new ArrayList<>();
        if((examName.equals("JEE ADVANCED"))&&(collegeType.equals("All")||collegeType.equals("IITs"))){
            for(int i=0;i<2693;i++){
                if((closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+collegeBranchList.get(i)+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 1)")&&collegeType.equals("All")){
            for(int i=2693;i<9177;i++ ){
                if(!collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")&&!collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)")&&closingRankList.get(i)>rank&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+collegeBranchList.get(i)+" "+"("+quota.get(i)+")"+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 1)")&&collegeType.equals("NITs")){
            for(int i=2693;i<7875;i++){
                if(!collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")&&!collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)")&&(closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+collegeBranchList.get(i)+" "+"("+quota.get(i)+")"+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 1)")&&collegeType.equals("IIITs")){
            for(int i=7875;i<8425;i++){
                if(!collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")&&!collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)")&&(closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+collegeBranchList.get(i)+" "+"("+quota.get(i)+")"+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 1)")&&collegeType.equals("GFTIs and Other")){
            for(int i=8425;i<9178;i++){
                if(!collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")&&!collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)")&&(closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+collegeBranchList.get(i)+" "+"("+quota.get(i)+")"+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }

        }
        else if(examName.equals("JEE MAINS (paper 2)")&&collegeType.equals("All")){
            for(int i=2693;i<9177;i++ ){
                if((collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")||collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)"))&&closingRankList.get(i)>rank&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+collegeBranchList.get(i)+" "+"("+quota.get(i)+")"+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 2)")&&collegeType.equals("NITs")){
            for(int i=2693;i<7875;i++){
                if((collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")||collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)"))&&(closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+collegeBranchList.get(i)+" "+"("+quota.get(i)+")"+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 2)")&&collegeType.equals("IIITs")){
            for(int i=7875;i<8425;i++){
                if((collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")||collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)"))&&(closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+collegeBranchList.get(i)+" "+"("+quota.get(i)+")"+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 2)")&&collegeType.equals("GFTIs and Other")){
            for(int i=8425;i<9178;i++){
                if((collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")||collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)"))&&(closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+collegeBranchList.get(i)+" "+"("+quota.get(i)+")"+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }

        }
        return a;


    }

    public static ArrayList<String> classifyByBranch(String examName,String category,int rank,String collegeType,String seatPool,String branch){
        ArrayList<String> a=new ArrayList<>();
        if((examName.equals("JEE ADVANCED"))&&(collegeType.equals("All")||collegeType.equals("IITs"))){
            for(int i=0;i<2693;i++){
                if(collegeBranchList.get(i).equals(branch)&&(closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))) {
                    a.add(colleges.get(i) + "\n" +quota.get(i)+"\n"+ String.valueOf(openingRankList.get(i)) + "\n" + String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 1)")&&collegeType.equals("All")){
            for(int i=2693;i<9177;i++ ){
                if(!collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")&&!collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)")&&(collegeBranchList.get(i).equals(branch)&&closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+quota.get(i)+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 1)")&&collegeType.equals("NITs")){
            for(int i=2693;i<7875;i++){
                if(!collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")&&!collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)")&&(collegeBranchList.get(i).equals(branch)&&closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+quota.get(i)+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 1)")&&collegeType.equals("IIITs")){
            for(int i=7875;i<8425;i++){
                if(!collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")&&!collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)")&&(collegeBranchList.get(i).equals(branch)&&closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+quota.get(i)+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 1)")&&collegeType.equals("GFTIs and Other")){
            for(int i=8425;i<9178;i++){
                if(!collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")&&!collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)")&&(collegeBranchList.get(i).equals(branch)&&closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+quota.get(i)+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }

        }
        else if(examName.equals("JEE MAINS (paper 2)")&&collegeType.equals("All")){
            for(int i=2693;i<9177;i++ ){
                if((collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")||collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)"))&&(collegeBranchList.get(i).equals(branch)&&closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+quota.get(i)+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 2)")&&collegeType.equals("NITs")){
            for(int i=2693;i<7875;i++){
                if((collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")||collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)"))&&(collegeBranchList.get(i).equals(branch)&&closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+quota.get(i)+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 2)")&&collegeType.equals("IIITs")){
            for(int i=7875;i<8425;i++){
                if((collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")||collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)"))&&(collegeBranchList.get(i).equals(branch)&&closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+quota.get(i)+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }
        }
        else if(examName.equals("JEE MAINS (paper 2)")&&collegeType.equals("GFTIs and other")){
            for(int i=8425;i<9178;i++){
                if((collegeBranchList.get(i).equals("Architecture (5 Years, Bachelor of Architecture)")||collegeBranchList.get(i).equals("Planning (4 Years, Bachelor of Planning)"))&&(collegeBranchList.get(i).equals(branch)&&closingRankList.get(i)>rank)&&(categoryList.get(i).equals(category))&&(genderList.get(i).equals(seatPool))){
                    a.add(colleges.get(i)+"\n"+quota.get(i)+"\n"+String.valueOf(openingRankList.get(i))+"\n"+String.valueOf(closingRankList.get(i)));
                }
            }

        }
        return a;

    }

    public static void Sort(ArrayList<String> a,int l,int h){
        if(l<h){
        int j=partition(a,l,h);
        Sort(a,l,j-1);
        Sort(a,j+1,h);}

    }


    private static int partition(ArrayList<String> a,int l,int h){
        int pivot=0;
        int k=0;
        int v=0;
        int ve=0;
        if(a.get(0).split("\n").length==4){
            k=3;
        pivot=Integer.parseInt(a.get(h).split("\n")[3]);}
        else{
            k=2;
            pivot=Integer.parseInt(a.get(h).split("\n")[2]);
        }


        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(Integer.parseInt(a.get(j).split("\n")[k])<pivot){
                i++;
                String temp=a.get(i);

                a.set(i,a.get(j));
                a.set(j,temp);
            }
        }
        String gh=a.get(i+1);
        a.set(i+1,a.get(h));
        a.set(h,gh);
        return i+1;

       /*(int i=l;
        int j=h;
        while(i<j){



            do{
                i++;
                String[] strings=a.get(i).split("\n");
                v=Integer.parseInt(strings[g]);



            }
            while(v<=pivot);//finding the correct index of the  pivot element using the do while loop

            do{
                j--;
                String[] strings1=a.get(j).split("\n");
                ve=Integer.parseInt(strings1[g]);


            }
            while(ve>pivot);
            if(i<j){
                String temp=a.get(i);
                a.set(i,a.get(j));
                a.set(j,temp);

            }



        }

        String temp=a.get(l);
        a.set(l,a.get(j));
        a.set(j,temp);
        return j;*/
    }

    public static ArrayList<String> collegeDetails(String collegeName,String gender,String category){
        ArrayList<String> b=new ArrayList<>();


            for(int i=0;i<9178;i++){
                if(colleges.get(i).equals(collegeName)&&genderList.get(i).equals(gender)&&categoryList.get(i).equals(category)){
                    b.add(collegeBranchList.get(i)+"\n"+quota.get(i)+"\n"+openingRankList.get(i)+"\n"+closingRankList.get(i));
                }
            }

        return b;
    }


}

