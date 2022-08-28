package com.srk.jossaseatpredictor;

import java.util.ArrayList;

public class Branch {
    private String name;
    private int RankOpen;
    private int RankOBC;
    private int RankEWS;
    private int RankSc;
    private int RankSt;
    private String course;
    public Branch (String name,int RankOpen ,int RankEWS,int RankOBC,int RankSc,int RankSt,String course ){
        this.name=name;
        this.RankOpen=RankOpen;
        this.RankEWS=RankEWS;
        this.RankOBC=RankOBC;
        this.RankSc=RankSt;
        this.RankSt=RankSt;
        this.course=course;
    }
    public static final String[] branches={"CSE","Engineering and Computational Mechanics","IT","EC","Electrical","Mechanical","Civil","AeroSpace",
            "Agri","Architecture","Bio Engineering","Bio Medical","Bio Chemical","Biological","BioTechnology","Ceramic","Chemical","Chemistry","Earth Sciences","Economics","Electronics","Energy Engineering" ,
            "Engineering Design","Engineering Science","Enviromental","Food Tech","Geological","Geology","Geophysics"};
    public String toString(){
        return name;
    }
    public String getName(){
        return name;
    }
    public int getRankOpen(){
        return RankOpen;
    }
    public int getRankOBC(){
        return RankOBC;
    }
    public int getRankEWS(){
        return RankEWS;
    }
    public int getRankSc() {
        return RankSc;
    }

    public int getRankSt() {
        return RankSt;
    }

    public String getCourse() {
        return course;
    }
}



/*
<string name="CSE">CSE</string>
<string name="Engineering_and_Computational_Mechanics">Engineering and Computational Mechanics</string>
<string name="IT">IT</string>
<string name="EC">EC</string>
<string name="Electrical">Electrical</string>
<string name="Mechanical">Mechanical</string>
<string name="Civil">Civil</string>
<string name="AeroSpace">AeroSpace</string>
<string name="Agri">Agri</string>
<string name="Architecture">Architecture</string>
<string name="Bio_Engineering">Bio Engineering</string>
<string name="Bio_Medical">Bio Medical</string>
<string name="Bio_Chemical">Bio Chemical</string>
<string name="Biological">Biological</string>
<string name="BioTechnology">BioTechnology</string>
<string name="Ceramic">Ceramic</string>
<string name="Chemical">Chemical</string>
<string name="Chemistry">Chemistry</string>
<string name="Earth_Sciences">Earth Sciences</string>
<string name="Economics">Economics</string>
<string name="Electronics">Electronics</string>
<string name="Energy_Engineering">Energy Engineering</string>
<string name="Engineering_Design">Engineering Design</string>
<string name="Engineering_Science">Engineering Science</string>
<string name="Enviromental">Enviromental</string>
<string name="Food_Tech">Food Tech</string>
<string name="Geological">Geological</string>
<string name="Geology">Geology</string>
<string name="Geophysics">Geophysics</string>
<string name="Industrial">Industrial</string>
<string name="Instrumentation">Instrumentation</string>
<string name="Life_Science">Life Science</string>
<string name="Maths">Maths</string>
<string name="Metallurgical">Metallurgical</string>
<string name="Mineral_Engineering">Mineral Engineering</string>
<string name="Mining">Mining</string>
<string name="Naval_Arch_Ocean_Engineering"></string>
<string name="Petroleaum">Petroleaum</string>
<string name="Pharmaceutical">Pharmaceutical</string>
<string name="Physics">Physics</string>
<string name="Planning">Planning</string>
<string name="Production">Production</string>
<string name="Textile">Textile</string>
<string name="Material_Engineering">Material Engineering</string>

 */