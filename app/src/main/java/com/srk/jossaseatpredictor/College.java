package com.srk.jossaseatpredictor;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class College {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();
    private int imageid;

    public College(){}

    public String getName() {
        return name;
    }
    public void setName(String k){
        name=k;
    }
    public void setBranches(ArrayList<Branch> a){
        branches=a;
    }
    public void setImageid(int i){
        imageid=i;
    }

    public int getImageId() {
        return imageid;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }


    public String toString() {
        return name;
    }

    public static ArrayList<String> setClosingRanks(College college,String category){
        ArrayList<Branch> branch=college.getBranches();
        ArrayList<String> closingRanks=new ArrayList<String>();
        for(Branch a:branch){
            if(category.equals("Open")){
                closingRanks.add(a.getName()+"\nClosing Rank : "+a.getRankOpen());
            }
            else if(category.equals("EWS")){
                closingRanks.add(a.getName()+"\nClosing Rank : "+a.getRankEWS());
            }
            else if(category.equals("OBC-NCL")){
                closingRanks.add(a.getName()+"\nClosing Rank : "+a.getRankOBC());
            }
            else if(category.equals("SC")){
                closingRanks.add(a.getName()+"\nClosing Rank : "+a.getRankSc());
            }
            else{
                closingRanks.add(a.getName()+"\nClosing Rank : "+a.getRankSt());
            }

        }
        return closingRanks;

    }




















   public static College[] colleges = {
            new College("IIT Bhilai", 0, new Branch("CSE", 5845, 874, 2189, 1284, 637, "BTECH"), new Branch("Electrical", 9330, 1354, 3845, 2094, 925, "BTECH"), new Branch("Data Science and Artificial Intelligence", 5738, 881, 2348, 1405, 713, "BTECH"), new Branch("Mechanical", 11419, 1764, 4453, 2533, 0, "BTECH")),
            new College("IIT Tirupati", 0, new Branch("CSE", 4117, 503, 1663, 1081, 535, "BTECH"), new Branch("Electrical", 7289, 1043, 2982, 1742, 853, "BTECH"), new Branch("Mechanical", 8971, 1497, 3948, 2248, 943, "BTECH"), new Branch("Civil", 13585, 2100, 4726, 1081, 943, "BTECH"), new Branch("Chemical", 13227, 2120, 4761, 2796, 0, "BTECH")),
            new College("IIT Goa", 0, new Branch("CSE", 4277, 711, 1846, 989, 510, "BTECH"), new Branch("Electrical", 8523, 1489, 3713, 2030, 903, "BTECH"), new Branch("Mathematics and Computing", 5695, 885, 2520, 1470, 872, "BTECH"), new Branch("Mechanical", 10293, 1531, 4264, 2450, 868, "BTECH")),
            new College("IIT Dharwad", 0, new Branch("CSE", 5157, 845, 2035, 1308, 753, "BTECH"), new Branch("Electrical", 9130, 1397, 3816, 2181, 962, "BTECH"), new Branch("Mechanical", 11226, 1840, 4472, 2614, 0, "BTECH")),
            new College("IIT Palakkad", 0, new Branch("CSE", 4854, 828, 2321, 1221, 662, "BTECH"), new Branch("Electrical", 8873, 1398, 3529, 2158, 0, "BTECH"), new Branch("Mechanical", 10249, 1679, 4067, 2627, 0, "BTECH"), new Branch("Civil", 13782, 2040, 4723, 2466, 840, "BTECH")),
            new College("IIT Jammu", 0, new Branch("CSE", 5218, 873, 2557, 1397, 697, "BTECH"), new Branch("Electrical", 8961, 1490, 3977, 2138, 947, "BTECH"), new Branch("Mechanical", 12121, 1746, 4561, 2588, 0, "BTECH"), new Branch("Civil", 14300, 2304, 4823, 2611, 820, "BTECH"), new Branch("Chemical", 14385, 2271, 5213, 2839, 0, "BTECH"), new Branch("Material Science", 14703, 2327, 4561, 3007, 0, "BTECH")),
            new College("IIT Gandhinagar", 0, new Branch("CSE", 1448, 216, 767, 528, 226, "BTECH"), new Branch("Electrical", 3615, 564, 2211, 1213, 592, "BTECH"), new Branch("Mechanical", 5579, 958, 3035, 1752, 734, "BTECH"), new Branch("Chemical", 7986, 1522, 3610, 2478, 0, "BTECH"), new Branch("Civil", 9012, 1688, 3827, 2046, 541, "BTECH"), new Branch("Material Science", 10495, 958, 4663, 2668, 0, "BTECH")),
            new College("IIT Mandi", 0, new Branch("CSE", 2941, 447, 1258, 727, 385, "BTECH"), new Branch("Electrical", 6204, 967, 2602, 1592, 818, "BTECH"), new Branch("Mechanical", 8266, 1410, 3456, 1993, 879, "BTECH"), new Branch("Civil", 10428, 1757, 4155, 2083, 607, "BTECH"), new Branch("Data Science and Engineering ", 3651, 618, 1589, 941, 655, "BTECH"), new Branch("Physics", 9467, 1937, 4441, 2605, 0, "BTECH"), new Branch("Bio Engineering", 14732, 2347, 5595, 2889, 0, "MTECH Dual")),
            new College("IIT Ropar", 0, new Branch("CSE", 1943, 322, 1004, 458, 359, "BTECH"), new Branch("Electrical", 5101, 791, 2372, 1218, 696, "BTECH"), new Branch("Mechanical", 7159, 1413, 3260, 1860, 890, "BTECH"), new Branch("Civil", 9713, 1796, 4046, 1976, 572, "BTECH"), new Branch("Chemical", 10142, 1898, 3980, 2416, 0, "BTECH"), new Branch("Mathematics and Computing", 3173, 377, 1377, 871, 439, "BTECH"), new Branch("Metallurgy and Material Science", 12809, 2053, 4962, 2560, 0, "BTECH")),
            new College("IIT Indore", 0, new Branch("CSE", 1222, 147, 498, 262, 150, "BTECH"), new Branch("Electrical", 3404, 509, 1524, 839, 461, "BTECH"), new Branch("Mechanical", 6212, 1014, 2612, 1231, 647, "BTECH"), new Branch("Civil", 8464, 1404, 3492, 1554, 491, "BTECH"), new Branch("Metallurgical and Material Science", 9878, 1975, 4237, 2408, 0, "BTECH")),
            new College("IIT Patna", 0, new Branch("CSE", 2719, 427, 1108, 696, 524, "BTECH"), new Branch("Electrical and Electronics", 6796, 1050, 2733, 1594, 816, "BTECH"), new Branch("Mechanical", 8760, 1517, 3528, 2041, 927, "BTECH"), new Branch("Civil", 12184, 1852, 4234, 2162, 693, "BTECH"), new Branch("Chemical", 12130, 1890, 4557, 2603, 0, "BTECH"), new Branch("Metallurgy and Material Science", 14550, 2180, 5226, 2870, 0, "BTECH")),
            new College("IIT Hyderabad", 0, new Branch("CSE", 584, 93, 228, 170, 96, "BTECH"), new Branch("Electrical", 1910, 372, 901, 483, 237, "BTECH"), new Branch("Mechanical", 4262, 665, 1712, 996, 494, "BTECH"), new Branch("Civil", 7388, 1364, 2873, 1477, 436, "BTECH"), new Branch("Chemical", 5848, 1085, 2881, 1668, 775, "BTECH"), new Branch("Metallurgy and Material Science", 7886, 1381, 3369, 2058, 936, "BTECH"), new Branch("Engineering Science", 3167, 515, 1493, 1445, 488, "BTECH"), new Branch("Mathematics and Computing", 925, 183, 443, 419, 247, "BTECH"), new Branch("Artificial Intelligence", 645, 143, 294, 306, 99, "BTECH")),
            new College("IIT Jodhpur", 0, new Branch("CSE", 2818, 464, 1184, 703, 505, "BTECH"), new Branch("Electrical", 6180, 1068, 2711, 703, 621, "BTECH"), new Branch("Mechanical", 8343, 1420, 3594, 2185, 870, "BTECH"), new Branch("Civil", 12045, 1823, 4294, 2314, 819, "BTECH"), new Branch("Chemical", 11088, 1844, 4589, 2424, 0, "BTECH"), new Branch("Materials Engineering ", 14448, 2141, 5286, 2945, 0, "BTECH"), new Branch("Bio Engineering", 14260, 2330, 5462, 2821, 0, "BTECH"), new Branch("Artificial Intelligence and Data Science", 3335, 498, 1466, 910, 548, "BTECH")),
            new College("IIT Guwahati", 0, new Branch("CSE", 588, 102, 302, 166, 95, "BTECH"), new Branch("Electronics and Electrical", 2067, 351, 976, 641, 311, "BTECH"), new Branch("Mechanical", 4143, 697, 1890, 1055, 518, "BTECH"), new Branch("Civil", 7094, 1289, 2947, 1422, 440, "BTECH"), new Branch("Chemical", 5722, 1015, 2833, 1584, 774, "BTECH"), new Branch("Chemical Science and Technology", 7433, 1298, 3500, 2021, 908, "BTECH"), new Branch("EC", 1701, 286, 817, 547, 274, "BTECH"), new Branch("Mathematics and Computing", 977, 171, 474, 414, 265, "BTECH"), new Branch("Physics", 5552, 1198, 3083, 1994, 0, "BTECH"), new Branch("Biosciences and Bioengineering", 8994, 2062, 4328, 2656, 0, "BTECH")),


            new College("NIT Agartala, Tripura", 0, new Branch("CSE",18351,3240,5828,3905,1440 ,"BTECH"), new Branch("Electrical",33853,5734,10653,6542,2360, "BTECH"), new Branch("Mechanical", 37614,6587,11952,7125,2554, "BTECH"), new Branch("Civil", 45385,7572,13264,7140,2069, "BTECH"), new Branch("Chemical", 44090,7646,13904,8604,3100, "BTECH"), new Branch("Physics (Dual Degree)",38352,8216,16504,9574,3546 , "MSc"), new Branch("Biotechnology and Biochemical",50010,8387,15659,8708,3521 , "BTECH"), new Branch("EC",24809,4143,7942,5011,2252 , "BTECH"),new Branch("Electronics and Instrumentation",37122,6418,12016,6884,2936 , "BTECH"),new Branch("Production",49420,8629,15723,9207,3445, "BTECH"),new Branch("Physics",40229,7523,14665,5986,0 , "MTech (Dual Degree)"),new Branch("Chemistry (Dual Degree)",51170,8792,16589,9882,0 , "MSc"),new Branch("Mathematics and Computing (Dual Degree)",30596,5293,12010,6700,2777 , "MSc")),
            new College("NIT Allahabad", 0, new Branch("CSE", 3073, 534, 1097, 825, 346, "BTECH"), new Branch("Electrical", 10628, 1906, 3780, 2861, 895, "BTECH"), new Branch("Chemical", 20185, 3429, 6878, 5348, 1584, "BTECH"), new Branch("Mechanical", 15485, 2794, 5269, 3589, 1180, "BTECH"), new Branch("EC", 7138, 1263, 2790, 2267, 1003, "BTECH"), new Branch("Civil", 23668, 4276, 7241, 3638, 635, "BTECH"), new Branch("Bio Technology", 33790, 6684, 13638, 7846, 2418, "BTECH"), new Branch("IT", 4119, 763, 1683, 1311, 604, "BTECH"), new Branch("Production and Industrial Engineering", 28715, 4843, 10773, 6210, 604, "BTECH")),
            new College("NIT Andhra Pradesh", 0, new Branch("CSE", 16653, 0, 5496, 2924, 1242, "BTECH"), new Branch("Electrical and Electronics", 32683, 0, 10014, 5874, 1476, "BTECH"), new Branch("Chemical", 40462, 0, 13458, 6451, 2136, "BTECH"), new Branch("Mechanical", 35842, 0, 11272, 5708, 1880, "BTECH"), new Branch("EC", 26069, 0, 7682, 4355, 1710, "BTECH"), new Branch("Civil", 43098, 0, 13080, 6351, 1638, "BTECH"), new Branch("Bio Technology", 46483, 0, 14212, 7715, 2401, "BTECH"), new Branch("Metallurgical and Materials", 47207, 0, 14902, 8450, 2400, "BTECH")),
            new College("NIT Arunachal Pradesh", 0, new Branch("CSE", 27307, 0, 7923, 3397, 1847, "BTECH"), new Branch("Electrical", 40190, 0, 12234, 7457, 2671, "BTECH"), new Branch("Mechanical", 44834, 0, 12756, 7919, 2956, "BTECH"), new Branch("Civil", 48956, 0, 13799, 7563, 2213, "BTECH"), new Branch("EC", 34073, 0, 10982, 5456, 2073, "BTECH")),
            new College("NIT Bhopal, Madhya Pradesh", 0, new Branch("CSE", 6509, 1096, 2607, 1511, 584, "BTECH"), new Branch("Electrical", 18017, 2958, 5985, 3942, 1635, "BTECH"), new Branch("Mechanical", 23421, 4294, 7918, 4979, 1918, "BTECH"), new Branch("Civil", 31719, 5532, 10048, 5099, 662, "BTECH"), new Branch("Chemical", 30093, 5159, 10939, 6631, 2223, "BTECH"), new Branch("Metallurgy and Material Science", 41286, 6990, 13699, 8144, 2804, "BTECH"), new Branch("EC", 12496, 2196, 4545, 3267, 1280, "BTECH"), new Branch("Planning", 747, 224, 475, 288, 40, "BPlanning"), new Branch("Architecture", 1104, 242, 605, 374, 173, "BTECH")),
            new College("NIT Calicut, Kerala", 0, new Branch("CSE", 3682,627,1095,558,278,"BTECH"), new Branch("Material Science",31721,5568,10924,5962,2361, "BTECH"), new Branch("Mechanical",15509 ,2955,4598,2923,973, "BTECH"), new Branch("Civil",26286,4697,7828,3370,905 , "BTECH"), new Branch("Chemical",24301,4105,8018,5438,1612 , "BTECH"), new Branch("Physics",16548, 3346,4774,3377,1966,"BTECH"), new Branch("Bio Technology",36408,6851,12212,5979,289, "BTECH"), new Branch("EC",6864,1152,2285,1509,467 , "BTECH"),new Branch("Electrical and Electronics",11805,2113,3787,2231,778 , "BTECH"),new Branch("Production",31696,5866,11828,7274,2006, "BTECH"),new Branch("Architecture",599,144,418,137,66, "BARCH")),
            new College("NIT Delhi", 0, new Branch("CSE", 6983, 0, 2616, 1161, 411, "BTECH"), new Branch("EC", 13102, 0, 4636, 2173, 554, "BTECH"), new Branch("Electrical and Electronics", 18291, 0, 6035, 3371, 348, "BTECH")),
            new College("NIT Durgapur, West Bengal",0, new Branch("CSE",8215,1376,2691,1499,471 ,"BTECH"), new Branch("Electrical",18653,3234,5839,4067,1449, "BTECH"), new Branch("Mechanical",25161,4408,7594,4749,1489, "BTECH"), new Branch("Civil",34012,5742,9755,5037,1040 , "BTECH"), new Branch("Chemical",33349,5872,11341,6622,2449 , "BTECH"), new Branch("Metallurgy and Material Science",41685,7314,14009,7840,2917,"BTECH"), new Branch("Bio Technology",43940,7788,14444,8074,3153, "BTECH"), new Branch("EC",13191,2269,3951,2802,1100 , "BTECH"),new Branch("Chemistry (Integrated)",45405,8150,14375,8264,3680 , "MSc"),new Branch("Biotechnology",34220,0,13788,0,0, "MTech (Dual Degree)"),new Branch("Chemical",35217,0,11766,0,0, "MTech (Dual degree)")),
            new College("NIT Goa", 0, new Branch("CSE", 10323, 1897, 3779, 5384, 636, "BTECH"), new Branch("Electrical and Electronics", 21121, 3809, 7234, 4132, 1752, "BTECH"), new Branch("Mechanical", 26295, 4784, 8879, 5053, 1654, "BTECH"), new Branch("EC", 16711, 2902, 5567, 3067, 1703, "BTECH"), new Branch("Civil", 35494, 5852, 10969, 5384, 1791, "BTECH")),
            new College("NIT Hazratbal, Srinagar, Jammu", 0, new Branch("CSE", 23555, 3856, 7593, 4205, 2086, "BTECH"), new Branch("Electrical", 41365, 7272, 12644, 7357, 2267, "BTECH"), new Branch("Mechanical", 44152, 7740, 13716, 8186, 3043, "BTECH"), new Branch("Civil", 49716, 8602, 15254, 8384, 2797, "BTECH"), new Branch("Chemical", 48711, 8835, 15528, 8578, 3303, "BTECH"), new Branch("Metallurgy and Material Science", 50871, 8801, 16005, 9578, 3624, "BTECH"), new Branch("EC", 36006, 6281, 11380, 6998, 3025, "BTECH"), new Branch("IT", 29485, 4979, 10209, 5387, 3110, "BTECH")),
            new College("NIT Jaipur, Rajasthan", 0, new Branch("CSE", 3789, 676, 1573, 973, 349, "BTECH"), new Branch("Electrical", 13406, 2330, 4638, 2728, 1223, "BTECH"), new Branch("Mechanical", 17090, 3358, 5736, 3795, 1421, "BTECH"), new Branch("Civil", 28391, 5072, 8764, 4255, 1248, "BTECH"), new Branch("Chemical", 24475, 4568, 8563, 5836, 2580, "BTECH"), new Branch("Metallurgy and Material Science", 36000, 6343, 12704, 6783, 2774, "BTECH"), new Branch("EC", 8747, 1475, 3250, 2259, 1015, "BTECH"), new Branch("Architecture", 930, 273, 573, 345, 202, "BARCH")),
            new College("NIT Jamshedpur, Jharkhand", 0, new Branch("CSE", 8968, 1402, 3063, 1993, 765, "BTECH"), new Branch("Electrical", 20295, 3571, 6261, 4654, 2042, "BTECH"), new Branch("Mechanical", 26506, 4540, 8198, 5290, 2065, "BTECH"), new Branch("Civil", 35441, 6226, 11111, 6113, 1759, "BTECH"), new Branch("EC", 14358, 2439, 4737, 3354, 1560, "BTECH"), new Branch("Metallurgy and Material Science", 42481, 7766, 13823, 8455, 3257, "BTECH"), new Branch("Production and Industrial Engineering", 41208, 7508, 13302, 8484, 3382, "BTECH")),
            new College("NIT Kurukshetra, Haryana", 0, new Branch("CSE", 5457, 913, 2273, 1192, 454, "BTECH"), new Branch("Electrical", 17207, 2976, 5176, 3583, 1045, "BTECH"), new Branch("Mechanical", 20179, 3688, 6439, 4017, 1452, "BTECH"), new Branch("Civil", 30397, 5448, 9372, 4663, 1749, "BTECH"), new Branch("EC", 11559, 1978, 3845, 2584, 1088, "BTECH"), new Branch("Production and Industrial Engineering", 39726, 7286, 12468, 7670, 3144, "BTECH"), new Branch("IT", 6679, 1119, 2703, 1568, 1029, "BTECH")),
            new College("NIT Manipur", 0, new Branch("CSE", 28003, 0, 8349, 4317, 1798, "BTECH"), new Branch("Electrical", 39742, 0, 11152, 5775, 2447, "BTECH"), new Branch("Mechanical", 42845, 0, 12922, 7630, 2340, "BTECH"), new Branch("Civil", 47701, 0, 14024, 7200, 0, "BTECH"), new Branch("EC", 33641, 0, 978, 5675, 2173, "BTECH")),
            new College("NIT Meghalaya", 0, new Branch("CSE", 17848, 0, 6910, 2835, 842, "BTECH"), new Branch("Electrical and Electronics", 31730, 0, 10920, 6029, 2514, "BTECH"), new Branch("Mechanical", 41558, 0, 11718, 7524, 2505, "BTECH"), new Branch("Civil", 45277, 0, 12744, 6881, 1464, "BTECH"), new Branch("EC", 27791, 0, 7764, 4152, 2406, "BTECH")),
            new College("NIT Mizoram", 0, new Branch("CSE", 29040, 0, 9343, 4453, 0, "BTECH"), new Branch("Electrical and Electronics", 44843, 0, 13262, 6888, 3052, "BTECH"), new Branch("Mechanical", 45287, 0, 13987, 8137, 3001, "BTECH"), new Branch("Civil", 49757, 0, 14730, 8376, 2975, "BTECH"), new Branch("EC", 38178, 0, 11647, 6303, 2563, "BTECH")),
            new College("NIT Nagaland", 0, new Branch("CSE", 28779, 4932, 9632, 5044, 1878, "BTECH"), new Branch("Electrical and Electronics", 44122, 7673, 12830, 7496, 2930, "BTECH"), new Branch("Mechanical", 44827, 7849, 13920, 7765, 2863, "BTECH"), new Branch("Civil", 49455, 8580, 14905, 7900, 2509, "BTECH"), new Branch("EC", 36482, 6718, 11792, 6184, 2642, "BTECH"), new Branch("Electronics and Instrumentation", 46353, 8007, 15340, 8641, 3086, "BTECH")),
            new College("NIT Nagpur", 0, new Branch("CSE", 4708, 803, 1500, 811, 298, "BTECH"), new Branch("Electrical and Electronics", 13164, 2309, 4172, 2607, 815, "BTECH"), new Branch("Mechanical", 17283, 3154, 5330, 3058, 1016, "BTECH"), new Branch("Civil", 27159, 4984, 7993, 3826, 964, "BTECH"), new Branch("Chemical", 26802, 4685, 9458, 6291, 1800, "BTECH"), new Branch("Metallurgy and Material Science", 35208, 6748, 11966, 6407, 2253, "BTECH"), new Branch("EC", 8647, 1442, 2756, 1795, 646, "BTECH"), new Branch("Mining", 41353, 7367, 13243, 7321, 2134, "BTECH"), new Branch("Architecture", 1183, 261, 622, 343, 200, "BTECH")),
            new College("NIT Patna, Bihar", 0, new Branch("CSE", 14010, 2480, 4713, 2821, 1494, "BTECH"), new Branch("Electrical", 27452, 4825, 8601, 5454, 2090, "BTECH"), new Branch("Mechanical", 34111, 5763, 10157, 6192, 2307, "BTECH"), new Branch("EC", 20301, 3513, 6257, 4498, 2085, "BTECH"), new Branch("Civil", 40491, 6987, 12702, 6274, 1863, "BTECH"), new Branch("Architecture", 1454, 366, 713, 384, 203, "BTECH")),
            new College("NIT Raipur, Chattisgarh", 0, new Branch("CSE",10405,1850,3327,2071,919,"BTECH"), new Branch("Electrical",24936,4139,7282,4662,1851, "BTECH"), new Branch("Mechanical",28571,4924,8813,5461,2106 , "BTECH"), new Branch("Civil",37275,6527,12862,5760,1794 , "BTECH"), new Branch("Chemical",38111,6723,12862,7267,2456, "BTECH"), new Branch("Bio Medical",49678,8401,15612,8970,3471, "BTECH"), new Branch("Bio Technology",46896,8096,14996,8907,3246 , "BTECH"), new Branch("EC",17069,2831,5156,3767,1578 , "BTECH"),new Branch("Metallurgy and Material Science",45641,7908,14572,8572,2991, "BTECH"),new Branch("IT",13154,2225,4488,3159,1323, "BTECH"),new Branch("Mining",48959,8230,15247,7965,2763 , "BTECH"),new Branch("Architecture",1415,356,717,358,196 , "BARCH")),
            new College("NIT Puducherry", 0, new Branch("CSE", 15467, 2575, 5044, 2751, 483, "BTECH"), new Branch("Electrical and Electronics", 29855, 5569, 8730, 5144, 1741, "BTECH"), new Branch("Mechanical", 31275, 5635, 9626, 5420, 2132, "BTECH"), new Branch("Civil", 40644, 6721, 12187, 6271, 1843, "BTECH"), new Branch("EC", 20722, 3493, 6684, 4166, 1385, "BTECH")),
            new College("NIT Sikkim", 0, new Branch("CSE", 26007, 0, 7402, 4741, 1818, "BTECH"), new Branch("Electrical and Electronics", 37939, 0, 11918, 7388, 2334, "BTECH"), new Branch("Mechanical", 42791, 0, 13096, 5955, 0, "BTECH"), new Branch("Civil", 47412, 0, 13352, 7360, 2472, "BTECH"), new Branch("EC", 32053, 0, 10096, 6684, 2692, "BTECH")),
            new College("NIT Silchar, Assam", 0, new Branch("CSE", 11127, 1828, 3934, 2146, 848, "BTECH"), new Branch("Electrical", 25411, 4410, 7348, 4876, 1811, "BTECH"), new Branch("Mechanical", 30500, 5461, 9273, 5626, 2023, "BTECH"), new Branch("Civil", 39263, 7015, 11840, 6215, 1672, "BTECH"), new Branch("EC", 16959, 2833, 5289, 3710, 1275, "BTECH"), new Branch("Electronics and Instrumentation", 27769, 4707, 8373, 5433, 2408, "BTECH")),
            new College("NIT Surat", 0, new Branch("CSE", 5227, 932, 2189, 1152, 369, "BTECH"), new Branch("Electrical", 15976, 2909, 5222, 3001, 1197, "BTECH"), new Branch("Mechanical", 21407, 3825, 6888, 4389, 1561, "BTECH"), new Branch("Civil", 31202, 5530, 9174, 4667, 782, "BTECH"), new Branch("Chemical", 29659, 5245, 9659, 6825, 2417, "BTECH"), new Branch("Chemistry (Integrated)", 49321, 8601, 16453, 9338, 3842, "MSc"), new Branch("Physics (Integrated)", 36204, 8046, 16475, 9403, 3743, "MSc"), new Branch("Mathematics (Integrated)", 39706, 8000, 16513, 8558, 2726, "MSc"), new Branch("EC", 11663, 2000, 3996, 3001, 1264, "BTECH")),
            new College("NIT Surathkal, Karnataka", 0, new Branch("CSE", 1324, 212, 448, 302, 101, "BTECH"), new Branch("Electrical and Electronics", 6392, 1158, 2242, 1545, 458, "BTECH"), new Branch("Mechanical", 9668, 1675, 3371, 1866, 865, "BTECH"), new Branch("Civil", 18602, 3337, 5613, 2476, 448, "BTECH"), new Branch("Chemical", 13407, 2748, 4841, 3123, 980, "BTECH"), new Branch("Metallurgy and Material Science", 21751, 3941, 7897, 4511, 1608, "BTECH"), new Branch("Mining", 27128, 4904, 9602, 6728, 2040, "BTECH"), new Branch("IT", 2838, 479, 837, 658, 353, "BTECH"), new Branch("EC", 4151, 673, 1305, 683, 338, "BTECH")),
            new College("NIT Tiruchirapalli, Tamil Nadu", 0, new Branch("CSE", 781, 153, 242, 198, 51, "BTECH"), new Branch("Electrical and Electronics", 5381, 985, 1717, 593, 402, "BTECH"), new Branch("Mechanical", 6591, 1250, 2139, 1068, 512, "BTECH"), new Branch("Civil", 13159, 2808, 4391, 1679, 389, "BTECH"), new Branch("Chemical", 12056, 2435, 4207, 2351, 915, "BTECH"), new Branch("Metallurgy and Material Science", 20809, 3834, 6908, 4144, 1490, "BTECH"), new Branch("Production", 22234, 4109, 7496, 4934, 1817, "BTECH"), new Branch("IC", 13902, 2632, 4866, 3711, 1272, "BTECH"), new Branch("EC", 3022, 621, 1011, 486, 239, "BTECH"), new Branch("Architecture", 422, 96, 251, 130, 65, "BTECH")),
            new College("NIT Uttarakhand", 0, new Branch("CSE", 15550, 0, 5352, 2968, 1737, "BTECH"), new Branch("Electrical and Electronics", 20028, 0, 9642, 0, 0, "BTECH"), new Branch("Mechanical", 34529, 0, 10001, 5723, 2211, "BTECH"), new Branch("Civil", 40993, 0, 11798, 4204, 0, "BTECH"), new Branch("EC", 20028, 0, 7109, 4926, 2133, "BTECH")),
            new College("NIT Warangal", 0, new Branch("CSE", 1541, 236, 594, 341, 146, "BTECH"), new Branch("Electrical and Electronics", 6985, 1359, 2343, 1516, 720, "BTECH"), new Branch("Mechanical", 9961, 1866, 3173, 1958, 830, "BTECH"), new Branch("Civil", 19088, 3192, 6018, 2808, 625, "BTECH"), new Branch("Chemical", 16030, 2894, 5869, 3821, 1402, "BTECH"), new Branch("Metallurgy and Material Science", 24034, 4056, 8409, 5543, 2290, "BTECH"), new Branch("Bio Technology", 25417, 5154, 9543, 6727, 2536, "BTECH"), new Branch("EC", 4671, 767, 1571, 903, 410, "BTECH")),



            new College("IIIT Bhagalpur", 0, new Branch("CSE", 39089, 6753, 15168, 10231, 5493, "BTECH"), new Branch("EC", 44226, 7645, 16233, 10973, 5972, "BTECH"), new Branch("Mechatronics", 46587, 8351, 16682, 11133, 5993, "BTECH")),
            new College("IIIT Agartala, Tripura", 0, new Branch("CSE", 39147, 7001, 14775, 10226, 5360, "BTECH")),
            new College("IIIT Allahabad", 0, new Branch("IT", 4960, 1013, 2356, 1564, 977, "BTECH"), new Branch("EC", 9250, 1820, 3802, 2786, 1472, "BTECH"), new Branch("Information Technology Business Informatics", 5537, 1132, 2629, 1773, 1108, "BTECH")),
            new College("IIIT Bhopal", 0, new Branch("IT", 33254, 5805, 14417, 10161, 5584, "BTECH"), new Branch("EC", 37310, 6854, 15501, 10513, 5641, "BTECH"), new Branch("CSE", 28443, 5713, 13118, 7799, 3900, "BTECH")),
            new College("IIIT Dharwad", 0, new Branch("CSE", 34219, 6540, 14055, 9297, 4450, "BTECH"), new Branch("EC", 39697, 7023, 15280, 9921, 4961, "BTECH"), new Branch("Data Science and Artificial Intelligence", 34218, 6255, 14558, 9715, 4542, "BTECH")),
            new College("IIIT Guwahati", 0, new Branch("CSE", 21096, 0, 7936, 6279, 3333, "BTECH"), new Branch("EC", 30601, 0, 12019, 8369, 3652, "BTECH")),
            new College("IIIT Kalyani, West Bengal", 0, new Branch("CSE", 36362, 6435, 14063, 8988, 4431, "BTECH")),
            new College("IIIT Kilohard, Haryana", 0, new Branch("CSE", 17628, 3293, 8053, 5650, 3732, "BTECH"), new Branch("IT", 22358, 3953, 10064, 7106, 4795, "BTECH")),
            new College("IIIT Kota", 0, new Branch("CSE", 22320, 4233, 10000, 7250, 3562, "BTECH"), new Branch("EC", 29813, 5583, 13230, 9063, 4962, "BTECH")),
            new College("IIIT Kottayam", 0, new Branch("CSE", 35429, 6635, 14151, 9971, 5319, "BTECH"), new Branch("EC", 41058, 7038, 14871, 10242, 5511, "BTECH")),
            new College("IIIT Kurnool", 0, new Branch("CSE", 32039, 6010, 12774, 5957, 3081, "BTECH"), new Branch("EC in Design and Manufacturing", 40410, 7151, 14237, 7292, 3725, "BTECH"), new Branch("Mechanical in Design and Manufacturing", 46542, 8153, 15083, 8993, 3850, "BTECH"), new Branch("Artificial Intelligence and Data Science", 31799, 6207, 13083, 6618, 2867, "BTECH")),
            new College("IIIT Lucknow", 0, new Branch("IT", 11521, 2039, 5116, 4053, 3177, "BTECH"), new Branch("CSE", 10613, 1902, 4810, 3427, 2523, "BTECH"), new Branch("Computer Science and Artificial Intelligence", 9826, 1737, 4666, 3409, 2279, "BTECH")),
            new College("IIIT Manipur", 0, new Branch("CSE", 41632, 7026, 15500, 9951, 5231, "BTECH"), new Branch("EC", 45452, 7916, 16565, 10709, 6065, "BTECH")),
            new College("IIIT Pune", 0, new Branch("CSE", 20999, 4275, 8936, 6297, 3520, "BTECH"), new Branch("EC", 25897, 5508, 11942, 9117, 4413, "BTECH")),
            new College("IIIT Raichur", 0, new Branch("CSE", 23511, 4671, 10030, 6300, 1681, "BTECH")),
            new College("IIIT Ranchi", 0, new Branch("CSE", 32673, 6033, 12876, 9565, 5010, "BTECH"), new Branch("EC", 40209, 7028, 15577, 10559, 5882, "BTECH")),
            new College("IIIT Sri City, Andhra Pradesh", 0, new Branch("CSE", 28394, 5687, 11360, 8889, 4363, "BTECH"), new Branch("EC", 35758, 6551, 13960, 9746, 4775, "BTECH")),
            new College("IIIT Srirangam, Tiruchirapalli", 0, new Branch("CSE", 21358, 3976, 9325, 6097, 2899, "BTECH"), new Branch("EC", 33355, 5969, 12900, 7072, 3619, "BTECH")),
            new College("IIIT Surat", 0, new Branch("CSE", 22325, 4383, 10042, 7665, 3218, "BTECH"), new Branch("EC", 31143, 6056, 13564, 9867, 4749, "BTECH")),
            new College("IIIT Una, Himachal Pradesh", 0, new Branch("IT", 35683, 6451, 14661, 9967, 5621, "BTECH"), new Branch("EC", 41291, 7114, 15738, 10382, 5872, "BTECH"), new Branch("CSE", 30776, 6172, 12513, 9208, 4799, "BTECH")),
            new College("IIIT Vadodara, Gujarat", 0, new Branch("CSE", 21250, 3938, 8841, 6905, 3605, "BTECH"), new Branch("IT", 23610, 4242, 10139, 7358, 3797, "BTECH")),
            new College("IIITDM Jabalpur, Madhya Pradesh", 0, new Branch("CSE", 15413, 2847, 5892, 3816, 2359, "BTECH"), new Branch("EC", 24558, 4606, 8438, 5229, 2997, "BTECH"), new Branch("Mechanical", 35762, 6589, 12471, 6320, 3041, "BTECH"), new Branch("Smart Manufacturing", 45516, 8221, 16100, 9947, 4159, "BTECH")),
            new College("IIITDM Kancheepuram, Tamil Nadu", 0, new Branch("CSE", 17414, 3207, 6794, 4093, 2162, "BTECH"), new Branch("EC", 26675, 5271, 10481, 6499, 3067, "BTECH"), new Branch("Mechanical", 39524, 6878, 13620, 6793, 3208, "BTECH"), new Branch("Smart Manufacturing", 43973, 8090, 16111, 9986, 3867, "BTECH")),
            new College("IIITM Gwalior, Madhya Pradesh", 0, new Branch("IT", 13461, 2440, 5251, 3224, 2775, "MTECH"), new Branch("IT(MBA)", 18264, 3743, 7017, 4687, 3122, "BTECH"), new Branch("CSE", 8722, 1692, 3292, 2191, 1465, "BTECH")),
            new College("IIITVICD Vadodara", 0, new Branch("CSE", 30298, 5888, 12241, 10040, 4793, "BTECH"))

    };

    public static  College[] iitColleges = {
            new College("IIT Bhilai", 0, new Branch("CSE", 5845, 874, 2189, 1284, 637, "BTECH"), new Branch("Electrical", 9330, 1354, 3845, 2094, 925, "BTECH"), new Branch("Data Science and Artificial Intelligence", 5738, 881, 2348, 1405, 713, "BTECH"), new Branch("Mechanical", 11419, 1764, 4453, 2533, 0, "BTECH")),
            new College("IIT Tirupati", 0, new Branch("CSE", 4117, 503, 1663, 1081, 535, "BTECH"), new Branch("Electrical", 7289, 1043, 2982, 1742, 853, "BTECH"), new Branch("Mechanical", 8971, 1497, 3948, 2248, 943, "BTECH"), new Branch("Civil", 13585, 2100, 4726, 1081, 943, "BTECH"), new Branch("Chemical", 13227, 2120, 4761, 2796, 0, "BTECH")),
            new College("IIT Goa", 0, new Branch("CSE", 4277, 711, 1846, 989, 510, "BTECH"), new Branch("Electrical", 8523, 1489, 3713, 2030, 903, "BTECH"), new Branch("Mathematics and Computing", 5695, 885, 2520, 1470, 872, "BTECH"), new Branch("Mechanical", 10293, 1531, 4264, 2450, 868, "BTECH")),
            new College("IIT Dharwad", 0, new Branch("CSE", 5157, 845, 2035, 1308, 753, "BTECH"), new Branch("Electrical", 9130, 1397, 3816, 2181, 962, "BTECH"), new Branch("Mechanical", 11226, 1840, 4472, 2614, 0, "BTECH")),
            new College("IIT Palakkad", 0, new Branch("CSE", 4854, 828, 2321, 1221, 662, "BTECH"), new Branch("Electrical", 8873, 1398, 3529, 2158, 0, "BTECH"), new Branch("Mechanical", 10249, 1679, 4067, 2627, 0, "BTECH"), new Branch("Civil", 13782, 2040, 4723, 2466, 840, "BTECH")),
            new College("IIT Jammu", 0, new Branch("CSE", 5218, 873, 2557, 1397, 697, "BTECH"), new Branch("Electrical", 8961, 1490, 3977, 2138, 947, "BTECH"), new Branch("Mechanical", 12121, 1746, 4561, 2588, 0, "BTECH"), new Branch("Civil", 14300, 2304, 4823, 2611, 820, "BTECH"), new Branch("Chemical", 14385, 2271, 5213, 2839, 0, "BTECH"), new Branch("Material Science", 14703, 2327, 4561, 3007, 0, "BTECH")),
            new College("IIT Gandhinagar", 0, new Branch("CSE", 1448, 216, 767, 528, 226, "BTECH"), new Branch("Electrical", 3615, 564, 2211, 1213, 592, "BTECH"), new Branch("Mechanical", 5579, 958, 3035, 1752, 734, "BTECH"), new Branch("Chemical", 7986, 1522, 3610, 2478, 0, "BTECH"), new Branch("Civil", 9012, 1688, 3827, 2046, 541, "BTECH"), new Branch("Material Science", 10495, 958, 4663, 2668, 0, "BTECH")),
            new College("IIT Mandi", 0, new Branch("CSE", 2941, 447, 1258, 727, 385, "BTECH"), new Branch("Electrical", 6204, 967, 2602, 1592, 818, "BTECH"), new Branch("Mechanical", 8266, 1410, 3456, 1993, 879, "BTECH"), new Branch("Civil", 10428, 1757, 4155, 2083, 607, "BTECH"), new Branch("Data Science and Engineering ", 3651, 618, 1589, 941, 655, "BTECH"), new Branch("Physics", 9467, 1937, 4441, 2605, 0, "BTECH"), new Branch("Bio Engineering", 14732, 2347, 5595, 2889, 0, "MTECH Dual")),
            new College("IIT Ropar", 0, new Branch("CSE", 1943, 322, 1004, 458, 359, "BTECH"), new Branch("Electrical", 5101, 791, 2372, 1218, 696, "BTECH"), new Branch("Mechanical", 7159, 1413, 3260, 1860, 890, "BTECH"), new Branch("Civil", 9713, 1796, 4046, 1976, 572, "BTECH"), new Branch("Chemical", 10142, 1898, 3980, 2416, 0, "BTECH"), new Branch("Mathematics and Computing", 3173, 377, 1377, 871, 439, "BTECH"), new Branch("Metallurgy and Material Science", 12809, 2053, 4962, 2560, 0, "BTECH")),
            new College("IIT Indore", 0, new Branch("CSE", 1222, 147, 498, 262, 150, "BTECH"), new Branch("Electrical", 3404, 509, 1524, 839, 461, "BTECH"), new Branch("Mechanical", 6212, 1014, 2612, 1231, 647, "BTECH"), new Branch("Civil", 8464, 1404, 3492, 1554, 491, "BTECH"), new Branch("Metallurgical and Material Science", 9878, 1975, 4237, 2408, 0, "BTECH")),
            new College("IIT Patna", 0, new Branch("CSE", 2719, 427, 1108, 696, 524, "BTECH"), new Branch("Electrical and Electronics", 6796, 1050, 2733, 1594, 816, "BTECH"), new Branch("Mechanical", 8760, 1517, 3528, 2041, 927, "BTECH"), new Branch("Civil", 12184, 1852, 4234, 2162, 693, "BTECH"), new Branch("Chemical", 12130, 1890, 4557, 2603, 0, "BTECH"), new Branch("Metallurgy and Material Science", 14550, 2180, 5226, 2870, 0, "BTECH")),
            new College("IIT Hyderabad", 0, new Branch("CSE", 584, 93, 228, 170, 96, "BTECH"), new Branch("Electrical", 1910, 372, 901, 483, 237, "BTECH"), new Branch("Mechanical", 4262, 665, 1712, 996, 494, "BTECH"), new Branch("Civil", 7388, 1364, 2873, 1477, 436, "BTECH"), new Branch("Chemical", 5848, 1085, 2881, 1668, 775, "BTECH"), new Branch("Metallurgy and Material Science", 7886, 1381, 3369, 2058, 936, "BTECH"), new Branch("Engineering Science", 3167, 515, 1493, 1445, 488, "BTECH"), new Branch("Mathematics and Computing", 925, 183, 443, 419, 247, "BTECH"), new Branch("Artificial Intelligence", 645, 143, 294, 306, 99, "BTECH")),
            new College("IIT Jodhpur", 0, new Branch("CSE", 2818, 464, 1184, 703, 505, "BTECH"), new Branch("Electrical", 6180, 1068, 2711, 703, 621, "BTECH"), new Branch("Mechanical", 8343, 1420, 3594, 2185, 870, "BTECH"), new Branch("Civil", 12045, 1823, 4294, 2314, 819, "BTECH"), new Branch("Chemical", 11088, 1844, 4589, 2424, 0, "BTECH"), new Branch("Materials Engineering ", 14448, 2141, 5286, 2945, 0, "BTECH"), new Branch("Bio Engineering", 14260, 2330, 5462, 2821, 0, "BTECH"), new Branch("Artificial Intelligence and Data Science", 3335, 498, 1466, 910, 548, "BTECH")),
            new College("IIT Guwahati", 0, new Branch("CSE", 588, 102, 302, 166, 95, "BTECH"), new Branch("Electronics and Electrical", 2067, 351, 976, 641, 311, "BTECH"), new Branch("Mechanical", 4143, 697, 1890, 1055, 518, "BTECH"), new Branch("Civil", 7094, 1289, 2947, 1422, 440, "BTECH"), new Branch("Chemical", 5722, 1015, 2833, 1584, 774, "BTECH"), new Branch("Chemical Science and Technology", 7433, 1298, 3500, 2021, 908, "BTECH"), new Branch("EC", 1701, 286, 817, 547, 274, "BTECH"), new Branch("Mathematics and Computing", 977, 171, 474, 414, 265, "BTECH"), new Branch("Physics", 5552, 1198, 3083, 1994, 0, "BTECH"), new Branch("Biosciences and Bioengineering", 8994, 2062, 4328, 2656, 0, "BTECH")),
           // new College("IIT BHU", 0, new Branch("CSE",,"BTECH"), new Branch("Electrical", "BTECH"), new Branch("Mechanical", , "BTECH"), new Branch("Civil",, "BTECH"), new Branch("Chemical", , "BTECH"), new Branch("Physics (Dual Degree)", , "MSc"), new Branch("Biotechnology and Biochemical",, "BTECH"), new Branch("EC",, "BTECH"),new Branch("Electronics and Instrumentation", , "BTECH"),new Branch("Production",, "BTECH"),new Branch("Physics",, "MTech (Dual Degree)"),new Branch("Chemistry (Dual Degree)", , "MSc"),new Branch("Mathematics and Computing (Dual Degree)", , "MSc"),new Branch("Production",, "BTECH"),new Branch("Production",, "BTECH"),new Branch("Production",, "BTECH"),new Branch("Production",, "BTECH"),new Branch("Production",, "BTECH"),new Branch("Production",, "BTECH"),new Branch("Production",, "BTECH"),new Branch("Production",, "BTECH"),new Branch("Production",, "BTECH"),new Branch("Production",, "BTECH"),new Branch("Industrial Chemistry",13428,2259,4929,2968,0, "MTech (Dual Degree)"),new Branch("Pharmaceutical",14723,2349,5544,2750,0, "MTech (Dual Degree)")),


    };

    public static  College[] nitIiitColleges = {
            new College("NIT Agartala, Tripura", 0, new Branch("CSE",18351,3240,5828,3905,1440 ,"BTECH"), new Branch("Electrical",33853,5734,10653,6542,2360, "BTECH"), new Branch("Mechanical", 37614,6587,11952,7125,2554, "BTECH"), new Branch("Civil", 45385,7572,13264,7140,2069, "BTECH"), new Branch("Chemical", 44090,7646,13904,8604,3100, "BTECH"), new Branch("Physics (Dual Degree)",38352,8216,16504,9574,3546 , "MSc"), new Branch("Biotechnology and Biochemical",50010,8387,15659,8708,3521 , "BTECH"), new Branch("EC",24809,4143,7942,5011,2252 , "BTECH"),new Branch("Electronics and Instrumentation",37122,6418,12016,6884,2936 , "BTECH"),new Branch("Production",49420,8629,15723,9207,3445, "BTECH"),new Branch("Physics",40229,7523,14665,5986,0 , "MTech (Dual Degree)"),new Branch("Chemistry (Dual Degree)",51170,8792,16589,9882,0 , "MSc"),new Branch("Mathematics and Computing (Dual Degree)",30596,5293,12010,6700,2777 , "MSc")),
            new College("NIT Allahabad", 0, new Branch("CSE", 3073, 534, 1097, 825, 346, "BTECH"), new Branch("Electrical", 10628, 1906, 3780, 2861, 895, "BTECH"), new Branch("Chemical", 20185, 3429, 6878, 5348, 1584, "BTECH"), new Branch("Mechanical", 15485, 2794, 5269, 3589, 1180, "BTECH"), new Branch("EC", 7138, 1263, 2790, 2267, 1003, "BTECH"), new Branch("Civil", 23668, 4276, 7241, 3638, 635, "BTECH"), new Branch("Bio Technology", 33790, 6684, 13638, 7846, 2418, "BTECH"), new Branch("IT", 4119, 763, 1683, 1311, 604, "BTECH"), new Branch("Production and Industrial Engineering", 28715, 4843, 10773, 6210, 604, "BTECH")),
            new College("NIT Andhra Pradesh", 0, new Branch("CSE", 16653, 0, 5496, 2924, 1242, "BTECH"), new Branch("Electrical and Electronics", 32683, 0, 10014, 5874, 1476, "BTECH"), new Branch("Chemical", 40462, 0, 13458, 6451, 2136, "BTECH"), new Branch("Mechanical", 35842, 0, 11272, 5708, 1880, "BTECH"), new Branch("EC", 26069, 0, 7682, 4355, 1710, "BTECH"), new Branch("Civil", 43098, 0, 13080, 6351, 1638, "BTECH"), new Branch("Bio Technology", 46483, 0, 14212, 7715, 2401, "BTECH"), new Branch("Metallurgical and Materials", 47207, 0, 14902, 8450, 2400, "BTECH")),
            new College("NIT Arunachal Pradesh", 0, new Branch("CSE", 27307, 0, 7923, 3397, 1847, "BTECH"), new Branch("Electrical", 40190, 0, 12234, 7457, 2671, "BTECH"), new Branch("Mechanical", 44834, 0, 12756, 7919, 2956, "BTECH"), new Branch("Civil", 48956, 0, 13799, 7563, 2213, "BTECH"), new Branch("EC", 34073, 0, 10982, 5456, 2073, "BTECH")),
            new College("NIT Bhopal, Madhya Pradesh", 0, new Branch("CSE", 6509, 1096, 2607, 1511, 584, "BTECH"), new Branch("Electrical", 18017, 2958, 5985, 3942, 1635, "BTECH"), new Branch("Mechanical", 23421, 4294, 7918, 4979, 1918, "BTECH"), new Branch("Civil", 31719, 5532, 10048, 5099, 662, "BTECH"), new Branch("Chemical", 30093, 5159, 10939, 6631, 2223, "BTECH"), new Branch("Metallurgy and Material Science", 41286, 6990, 13699, 8144, 2804, "BTECH"), new Branch("EC", 12496, 2196, 4545, 3267, 1280, "BTECH"), new Branch("Planning", 747, 224, 475, 288, 40, "BPlanning"), new Branch("Architecture", 1104, 242, 605, 374, 173, "BTECH")),
            new College("NIT Calicut, Kerala", 0, new Branch("CSE", 3682,627,1095,558,278,"BTECH"), new Branch("Material Science",31721,5568,10924,5962,2361, "BTECH"), new Branch("Mechanical",15509 ,2955,4598,2923,973, "BTECH"), new Branch("Civil",26286,4697,7828,3370,905 , "BTECH"), new Branch("Chemical",24301,4105,8018,5438,1612 , "BTECH"), new Branch("Physics",16548, 3346,4774,3377,1966,"BTECH"), new Branch("Bio Technology",36408,6851,12212,5979,289, "BTECH"), new Branch("EC",6864,1152,2285,1509,467 , "BTECH"),new Branch("Electrical and Electronics",11805,2113,3787,2231,778 , "BTECH"),new Branch("Production",31696,5866,11828,7274,2006, "BTECH"),new Branch("Architecture",599,144,418,137,66, "BARCH")),
            new College("NIT Delhi", 0, new Branch("CSE", 6983, 0, 2616, 1161, 411, "BTECH"), new Branch("EC", 13102, 0, 4636, 2173, 554, "BTECH"), new Branch("Electrical and Electronics", 18291, 0, 6035, 3371, 348, "BTECH")),
            new College("NIT Durgapur, West Bengal",0, new Branch("CSE",8215,1376,2691,1499,471 ,"BTECH"), new Branch("Electrical",18653,3234,5839,4067,1449, "BTECH"), new Branch("Mechanical",25161,4408,7594,4749,1489, "BTECH"), new Branch("Civil",34012,5742,9755,5037,1040 , "BTECH"), new Branch("Chemical",33349,5872,11341,6622,2449 , "BTECH"), new Branch("Metallurgy and Material Science",41685,7314,14009,7840,2917,"BTECH"), new Branch("Bio Technology",43940,7788,14444,8074,3153, "BTECH"), new Branch("EC",13191,2269,3951,2802,1100 , "BTECH"),new Branch("Chemistry (Integrated)",45405,8150,14375,8264,3680 , "MSc"),new Branch("Biotechnology",34220,0,13788,0,0, "MTech (Dual Degree)"),new Branch("Chemical",35217,0,11766,0,0, "MTech (Dual degree)")),
            new College("NIT Goa", 0, new Branch("CSE", 10323, 1897, 3779, 5384, 636, "BTECH"), new Branch("Electrical and Electronics", 21121, 3809, 7234, 4132, 1752, "BTECH"), new Branch("Mechanical", 26295, 4784, 8879, 5053, 1654, "BTECH"), new Branch("EC", 16711, 2902, 5567, 3067, 1703, "BTECH"), new Branch("Civil", 35494, 5852, 10969, 5384, 1791, "BTECH")),
            new College("NIT Hazratbal, Srinagar, Jammu", 0, new Branch("CSE", 23555, 3856, 7593, 4205, 2086, "BTECH"), new Branch("Electrical", 41365, 7272, 12644, 7357, 2267, "BTECH"), new Branch("Mechanical", 44152, 7740, 13716, 8186, 3043, "BTECH"), new Branch("Civil", 49716, 8602, 15254, 8384, 2797, "BTECH"), new Branch("Chemical", 48711, 8835, 15528, 8578, 3303, "BTECH"), new Branch("Metallurgy and Material Science", 50871, 8801, 16005, 9578, 3624, "BTECH"), new Branch("EC", 36006, 6281, 11380, 6998, 3025, "BTECH"), new Branch("IT", 29485, 4979, 10209, 5387, 3110, "BTECH")),
            new College("NIT Jaipur, Rajasthan", 0, new Branch("CSE", 3789, 676, 1573, 973, 349, "BTECH"), new Branch("Electrical", 13406, 2330, 4638, 2728, 1223, "BTECH"), new Branch("Mechanical", 17090, 3358, 5736, 3795, 1421, "BTECH"), new Branch("Civil", 28391, 5072, 8764, 4255, 1248, "BTECH"), new Branch("Chemical", 24475, 4568, 8563, 5836, 2580, "BTECH"), new Branch("Metallurgy and Material Science", 36000, 6343, 12704, 6783, 2774, "BTECH"), new Branch("EC", 8747, 1475, 3250, 2259, 1015, "BTECH"), new Branch("Architecture", 930, 273, 573, 345, 202, "BARCH")),
            new College("NIT Jamshedpur, Jharkhand", 0, new Branch("CSE", 8968, 1402, 3063, 1993, 765, "BTECH"), new Branch("Electrical", 20295, 3571, 6261, 4654, 2042, "BTECH"), new Branch("Mechanical", 26506, 4540, 8198, 5290, 2065, "BTECH"), new Branch("Civil", 35441, 6226, 11111, 6113, 1759, "BTECH"), new Branch("EC", 14358, 2439, 4737, 3354, 1560, "BTECH"), new Branch("Metallurgy and Material Science", 42481, 7766, 13823, 8455, 3257, "BTECH"), new Branch("Production and Industrial Engineering", 41208, 7508, 13302, 8484, 3382, "BTECH")),
            new College("NIT Kurukshetra, Haryana", 0, new Branch("CSE", 5457, 913, 2273, 1192, 454, "BTECH"), new Branch("Electrical", 17207, 2976, 5176, 3583, 1045, "BTECH"), new Branch("Mechanical", 20179, 3688, 6439, 4017, 1452, "BTECH"), new Branch("Civil", 30397, 5448, 9372, 4663, 1749, "BTECH"), new Branch("EC", 11559, 1978, 3845, 2584, 1088, "BTECH"), new Branch("Production and Industrial Engineering", 39726, 7286, 12468, 7670, 3144, "BTECH"), new Branch("IT", 6679, 1119, 2703, 1568, 1029, "BTECH")),
            new College("NIT Manipur", 0, new Branch("CSE", 28003, 0, 8349, 4317, 1798, "BTECH"), new Branch("Electrical", 39742, 0, 11152, 5775, 2447, "BTECH"), new Branch("Mechanical", 42845, 0, 12922, 7630, 2340, "BTECH"), new Branch("Civil", 47701, 0, 14024, 7200, 0, "BTECH"), new Branch("EC", 33641, 0, 978, 5675, 2173, "BTECH")),
            new College("NIT Meghalaya", 0, new Branch("CSE", 17848, 0, 6910, 2835, 842, "BTECH"), new Branch("Electrical and Electronics", 31730, 0, 10920, 6029, 2514, "BTECH"), new Branch("Mechanical", 41558, 0, 11718, 7524, 2505, "BTECH"), new Branch("Civil", 45277, 0, 12744, 6881, 1464, "BTECH"), new Branch("EC", 27791, 0, 7764, 4152, 2406, "BTECH")),
            new College("NIT Mizoram", 0, new Branch("CSE", 29040, 0, 9343, 4453, 0, "BTECH"), new Branch("Electrical and Electronics", 44843, 0, 13262, 6888, 3052, "BTECH"), new Branch("Mechanical", 45287, 0, 13987, 8137, 3001, "BTECH"), new Branch("Civil", 49757, 0, 14730, 8376, 2975, "BTECH"), new Branch("EC", 38178, 0, 11647, 6303, 2563, "BTECH")),
            new College("NIT Nagaland", 0, new Branch("CSE", 28779, 4932, 9632, 5044, 1878, "BTECH"), new Branch("Electrical and Electronics", 44122, 7673, 12830, 7496, 2930, "BTECH"), new Branch("Mechanical", 44827, 7849, 13920, 7765, 2863, "BTECH"), new Branch("Civil", 49455, 8580, 14905, 7900, 2509, "BTECH"), new Branch("EC", 36482, 6718, 11792, 6184, 2642, "BTECH"), new Branch("Electronics and Instrumentation", 46353, 8007, 15340, 8641, 3086, "BTECH")),
            new College("NIT Nagpur", 0, new Branch("CSE", 4708, 803, 1500, 811, 298, "BTECH"), new Branch("Electrical and Electronics", 13164, 2309, 4172, 2607, 815, "BTECH"), new Branch("Mechanical", 17283, 3154, 5330, 3058, 1016, "BTECH"), new Branch("Civil", 27159, 4984, 7993, 3826, 964, "BTECH"), new Branch("Chemical", 26802, 4685, 9458, 6291, 1800, "BTECH"), new Branch("Metallurgy and Material Science", 35208, 6748, 11966, 6407, 2253, "BTECH"), new Branch("EC", 8647, 1442, 2756, 1795, 646, "BTECH"), new Branch("Mining", 41353, 7367, 13243, 7321, 2134, "BTECH"), new Branch("Architecture", 1183, 261, 622, 343, 200, "BTECH")),
            new College("NIT Patna, Bihar", 0, new Branch("CSE", 14010, 2480, 4713, 2821, 1494, "BTECH"), new Branch("Electrical", 27452, 4825, 8601, 5454, 2090, "BTECH"), new Branch("Mechanical", 34111, 5763, 10157, 6192, 2307, "BTECH"), new Branch("EC", 20301, 3513, 6257, 4498, 2085, "BTECH"), new Branch("Civil", 40491, 6987, 12702, 6274, 1863, "BTECH"), new Branch("Architecture", 1454, 366, 713, 384, 203, "BTECH")),
            new College("NIT Raipur, Chattisgarh", 0, new Branch("CSE",10405,1850,3327,2071,919,"BTECH"), new Branch("Electrical",24936,4139,7282,4662,1851, "BTECH"), new Branch("Mechanical",28571,4924,8813,5461,2106 , "BTECH"), new Branch("Civil",37275,6527,12862,5760,1794 , "BTECH"), new Branch("Chemical",38111,6723,12862,7267,2456, "BTECH"), new Branch("Bio Medical",49678,8401,15612,8970,3471, "BTECH"), new Branch("Bio Technology",46896,8096,14996,8907,3246 , "BTECH"), new Branch("EC",17069,2831,5156,3767,1578 , "BTECH"),new Branch("Metallurgy and Material Science",45641,7908,14572,8572,2991, "BTECH"),new Branch("IT",13154,2225,4488,3159,1323, "BTECH"),new Branch("Mining",48959,8230,15247,7965,2763 , "BTECH"),new Branch("Architecture",1415,356,717,358,196 , "BARCH")),
            new College("NIT Puducherry", 0, new Branch("CSE", 15467, 2575, 5044, 2751, 483, "BTECH"), new Branch("Electrical and Electronics", 29855, 5569, 8730, 5144, 1741, "BTECH"), new Branch("Mechanical", 31275, 5635, 9626, 5420, 2132, "BTECH"), new Branch("Civil", 40644, 6721, 12187, 6271, 1843, "BTECH"), new Branch("EC", 20722, 3493, 6684, 4166, 1385, "BTECH")),
            new College("NIT Sikkim", 0, new Branch("CSE", 26007, 0, 7402, 4741, 1818, "BTECH"), new Branch("Electrical and Electronics", 37939, 0, 11918, 7388, 2334, "BTECH"), new Branch("Mechanical", 42791, 0, 13096, 5955, 0, "BTECH"), new Branch("Civil", 47412, 0, 13352, 7360, 2472, "BTECH"), new Branch("EC", 32053, 0, 10096, 6684, 2692, "BTECH")),
            new College("NIT Silchar, Assam", 0, new Branch("CSE", 11127, 1828, 3934, 2146, 848, "BTECH"), new Branch("Electrical", 25411, 4410, 7348, 4876, 1811, "BTECH"), new Branch("Mechanical", 30500, 5461, 9273, 5626, 2023, "BTECH"), new Branch("Civil", 39263, 7015, 11840, 6215, 1672, "BTECH"), new Branch("EC", 16959, 2833, 5289, 3710, 1275, "BTECH"), new Branch("Electronics and Instrumentation", 27769, 4707, 8373, 5433, 2408, "BTECH")),
            new College("NIT Surat", 0, new Branch("CSE", 5227, 932, 2189, 1152, 369, "BTECH"), new Branch("Electrical", 15976, 2909, 5222, 3001, 1197, "BTECH"), new Branch("Mechanical", 21407, 3825, 6888, 4389, 1561, "BTECH"), new Branch("Civil", 31202, 5530, 9174, 4667, 782, "BTECH"), new Branch("Chemical", 29659, 5245, 9659, 6825, 2417, "BTECH"), new Branch("Chemistry (Integrated)", 49321, 8601, 16453, 9338, 3842, "MSc"), new Branch("Physics (Integrated)", 36204, 8046, 16475, 9403, 3743, "MSc"), new Branch("Mathematics (Integrated)", 39706, 8000, 16513, 8558, 2726, "MSc"), new Branch("EC", 11663, 2000, 3996, 3001, 1264, "BTECH")),
            new College("NIT Surathkal, Karnataka", 0, new Branch("CSE", 1324, 212, 448, 302, 101, "BTECH"), new Branch("Electrical and Electronics", 6392, 1158, 2242, 1545, 458, "BTECH"), new Branch("Mechanical", 9668, 1675, 3371, 1866, 865, "BTECH"), new Branch("Civil", 18602, 3337, 5613, 2476, 448, "BTECH"), new Branch("Chemical", 13407, 2748, 4841, 3123, 980, "BTECH"), new Branch("Metallurgy and Material Science", 21751, 3941, 7897, 4511, 1608, "BTECH"), new Branch("Mining", 27128, 4904, 9602, 6728, 2040, "BTECH"), new Branch("IT", 2838, 479, 837, 658, 353, "BTECH"), new Branch("EC", 4151, 673, 1305, 683, 338, "BTECH")),
            new College("NIT Tiruchirapalli, Tamil Nadu", 0, new Branch("CSE", 781, 153, 242, 198, 51, "BTECH"), new Branch("Electrical and Electronics", 5381, 985, 1717, 593, 402, "BTECH"), new Branch("Mechanical", 6591, 1250, 2139, 1068, 512, "BTECH"), new Branch("Civil", 13159, 2808, 4391, 1679, 389, "BTECH"), new Branch("Chemical", 12056, 2435, 4207, 2351, 915, "BTECH"), new Branch("Metallurgy and Material Science", 20809, 3834, 6908, 4144, 1490, "BTECH"), new Branch("Production", 22234, 4109, 7496, 4934, 1817, "BTECH"), new Branch("IC", 13902, 2632, 4866, 3711, 1272, "BTECH"), new Branch("EC", 3022, 621, 1011, 486, 239, "BTECH"), new Branch("Architecture", 422, 96, 251, 130, 65, "BTECH")),
            new College("NIT Uttarakhand", 0, new Branch("CSE", 15550, 0, 5352, 2968, 1737, "BTECH"), new Branch("Electrical and Electronics", 20028, 0, 9642, 0, 0, "BTECH"), new Branch("Mechanical", 34529, 0, 10001, 5723, 2211, "BTECH"), new Branch("Civil", 40993, 0, 11798, 4204, 0, "BTECH"), new Branch("EC", 20028, 0, 7109, 4926, 2133, "BTECH")),
            new College("NIT Warangal", 0, new Branch("CSE", 1541, 236, 594, 341, 146, "BTECH"), new Branch("Electrical and Electronics", 6985, 1359, 2343, 1516, 720, "BTECH"), new Branch("Mechanical", 9961, 1866, 3173, 1958, 830, "BTECH"), new Branch("Civil", 19088, 3192, 6018, 2808, 625, "BTECH"), new Branch("Chemical", 16030, 2894, 5869, 3821, 1402, "BTECH"), new Branch("Metallurgy and Material Science", 24034, 4056, 8409, 5543, 2290, "BTECH"), new Branch("Bio Technology", 25417, 5154, 9543, 6727, 2536, "BTECH"), new Branch("EC", 4671, 767, 1571, 903, 410, "BTECH")),


            new College("IIIT Bhagalpur", 0, new Branch("CSE", 39089, 6753, 15168, 10231, 5493, "BTECH"), new Branch("EC", 44226, 7645, 16233, 10973, 5972, "BTECH"), new Branch("Mechatronics", 46587, 8351, 16682, 11133, 5993, "BTECH")),
            new College("IIIT Agartala, Tripura", 0, new Branch("CSE", 39147, 7001, 14775, 10226, 5360, "BTECH")),
            new College("IIIT Allahabad", 0, new Branch("IT", 4960, 1013, 2356, 1564, 977, "BTECH"), new Branch("EC", 9250, 1820, 3802, 2786, 1472, "BTECH"), new Branch("Information Technology Business Informatics", 5537, 1132, 2629, 1773, 1108, "BTECH")),
            new College("IIIT Bhopal", 0, new Branch("IT", 33254, 5805, 14417, 10161, 5584, "BTECH"), new Branch("EC", 37310, 6854, 15501, 10513, 5641, "BTECH"), new Branch("CSE", 28443, 5713, 13118, 7799, 3900, "BTECH")),
            new College("IIIT Dharwad", 0, new Branch("CSE", 34219, 6540, 14055, 9297, 4450, "BTECH"), new Branch("EC", 39697, 7023, 15280, 9921, 4961, "BTECH"), new Branch("Data Science and Artificial Intelligence", 34218, 6255, 14558, 9715, 4542, "BTECH")),
            new College("IIIT Guwahati", 0, new Branch("CSE", 21096, 0, 7936, 6279, 3333, "BTECH"), new Branch("EC", 30601, 0, 12019, 8369, 3652, "BTECH")),
            new College("IIIT Kalyani, West Bengal", 0, new Branch("CSE", 36362, 6435, 14063, 8988, 4431, "BTECH")),
            new College("IIIT Kilohard, Haryana", 0, new Branch("CSE", 17628, 3293, 8053, 5650, 3732, "BTECH"), new Branch("IT", 22358, 3953, 10064, 7106, 4795, "BTECH")),
            new College("IIIT Kota", 0, new Branch("CSE", 22320, 4233, 10000, 7250, 3562, "BTECH"), new Branch("EC", 29813, 5583, 13230, 9063, 4962, "BTECH")),
            new College("IIIT Kottayam", 0, new Branch("CSE", 35429, 6635, 14151, 9971, 5319, "BTECH"), new Branch("EC", 41058, 7038, 14871, 10242, 5511, "BTECH")),
            new College("IIIT Kurnool", 0, new Branch("CSE", 32039, 6010, 12774, 5957, 3081, "BTECH"), new Branch("EC in Design and Manufacturing", 40410, 7151, 14237, 7292, 3725, "BTECH"), new Branch("Mechanical in Design and Manufacturing", 46542, 8153, 15083, 8993, 3850, "BTECH"), new Branch("Artificial Intelligence and Data Science", 31799, 6207, 13083, 6618, 2867, "BTECH")),
            new College("IIIT Lucknow", 0, new Branch("IT", 11521, 2039, 5116, 4053, 3177, "BTECH"), new Branch("CSE", 10613, 1902, 4810, 3427, 2523, "BTECH"), new Branch("Computer Science and Artificial Intelligence", 9826, 1737, 4666, 3409, 2279, "BTECH")),
            new College("IIIT Manipur", 0, new Branch("CSE", 41632, 7026, 15500, 9951, 5231, "BTECH"), new Branch("EC", 45452, 7916, 16565, 10709, 6065, "BTECH")),
            new College("IIIT Pune", 0, new Branch("CSE", 20999, 4275, 8936, 6297, 3520, "BTECH"), new Branch("EC", 25897, 5508, 11942, 9117, 4413, "BTECH")),
            new College("IIIT Raichur", 0, new Branch("CSE", 23511, 4671, 10030, 6300, 1681, "BTECH")),
            new College("IIIT Ranchi", 0, new Branch("CSE", 32673, 6033, 12876, 9565, 5010, "BTECH"), new Branch("EC", 40209, 7028, 15577, 10559, 5882, "BTECH")),
            new College("IIIT Sri City, Andhra Pradesh", 0, new Branch("CSE", 28394, 5687, 11360, 8889, 4363, "BTECH"), new Branch("EC", 35758, 6551, 13960, 9746, 4775, "BTECH")),
            new College("IIIT Srirangam, Tiruchirapalli", 0, new Branch("CSE", 21358, 3976, 9325, 6097, 2899, "BTECH"), new Branch("EC", 33355, 5969, 12900, 7072, 3619, "BTECH")),
            new College("IIIT Surat", 0, new Branch("CSE", 22325, 4383, 10042, 7665, 3218, "BTECH"), new Branch("EC", 31143, 6056, 13564, 9867, 4749, "BTECH")),
            new College("IIIT Una, Himachal Pradesh", 0, new Branch("IT", 35683, 6451, 14661, 9967, 5621, "BTECH"), new Branch("EC", 41291, 7114, 15738, 10382, 5872, "BTECH"), new Branch("CSE", 30776, 6172, 12513, 9208, 4799, "BTECH")),
            new College("IIIT Vadodara, Gujarat", 0, new Branch("CSE", 21250, 3938, 8841, 6905, 3605, "BTECH"), new Branch("IT", 23610, 4242, 10139, 7358, 3797, "BTECH")),
            new College("IIITDM Jabalpur, Madhya Pradesh", 0, new Branch("CSE", 15413, 2847, 5892, 3816, 2359, "BTECH"), new Branch("EC", 24558, 4606, 8438, 5229, 2997, "BTECH"), new Branch("Mechanical", 35762, 6589, 12471, 6320, 3041, "BTECH"), new Branch("Smart Manufacturing", 45516, 8221, 16100, 9947, 4159, "BTECH")),
            new College("IIITDM Kancheepuram, Tamil Nadu", 0, new Branch("CSE", 17414, 3207, 6794, 4093, 2162, "BTECH"), new Branch("EC", 26675, 5271, 10481, 6499, 3067, "BTECH"), new Branch("Mechanical", 39524, 6878, 13620, 6793, 3208, "BTECH"), new Branch("Smart Manufacturing", 43973, 8090, 16111, 9986, 3867, "BTECH")),
            new College("IIITM Gwalior, Madhya Pradesh", 0, new Branch("IT", 13461, 2440, 5251, 3224, 2775, "MTECH"), new Branch("IT(MBA)", 18264, 3743, 7017, 4687, 3122, "BTECH"), new Branch("CSE", 8722, 1692, 3292, 2191, 1465, "BTECH")),
            new College("IIITVICD Vadodara", 0, new Branch("CSE", 30298, 5888, 12241, 10040, 4793, "BTECH"))
    };


    public static College[] nits = {
            new College("NIT Agartala, Tripura", 0, new Branch("CSE",18351,3240,5828,3905,1440 ,"BTECH"), new Branch("Electrical",33853,5734,10653,6542,2360, "BTECH"), new Branch("Mechanical", 37614,6587,11952,7125,2554, "BTECH"), new Branch("Civil", 45385,7572,13264,7140,2069, "BTECH"), new Branch("Chemical", 44090,7646,13904,8604,3100, "BTECH"), new Branch("Physics (Dual Degree)",38352,8216,16504,9574,3546 , "MSc"), new Branch("Biotechnology and Biochemical",50010,8387,15659,8708,3521 , "BTECH"), new Branch("EC",24809,4143,7942,5011,2252 , "BTECH"),new Branch("Electronics and Instrumentation",37122,6418,12016,6884,2936 , "BTECH"),new Branch("Production",49420,8629,15723,9207,3445, "BTECH"),new Branch("Physics",40229,7523,14665,5986,0 , "MTech (Dual Degree)"),new Branch("Chemistry (Dual Degree)",51170,8792,16589,9882,0 , "MSc"),new Branch("Mathematics and Computing (Dual Degree)",30596,5293,12010,6700,2777 , "MSc")),
            new College("NIT Allahabad", 0, new Branch("CSE", 3073, 534, 1097, 825, 346, "BTECH"), new Branch("Electrical", 10628, 1906, 3780, 2861, 895, "BTECH"), new Branch("Chemical", 20185, 3429, 6878, 5348, 1584, "BTECH"), new Branch("Mechanical", 15485, 2794, 5269, 3589, 1180, "BTECH"), new Branch("EC", 7138, 1263, 2790, 2267, 1003, "BTECH"), new Branch("Civil", 23668, 4276, 7241, 3638, 635, "BTECH"), new Branch("Bio Technology", 33790, 6684, 13638, 7846, 2418, "BTECH"), new Branch("IT", 4119, 763, 1683, 1311, 604, "BTECH"), new Branch("Production and Industrial Engineering", 28715, 4843, 10773, 6210, 604, "BTECH")),
            new College("NIT Andhra Pradesh", 0, new Branch("CSE", 16653, 0, 5496, 2924, 1242, "BTECH"), new Branch("Electrical and Electronics", 32683, 0, 10014, 5874, 1476, "BTECH"), new Branch("Chemical", 40462, 0, 13458, 6451, 2136, "BTECH"), new Branch("Mechanical", 35842, 0, 11272, 5708, 1880, "BTECH"), new Branch("EC", 26069, 0, 7682, 4355, 1710, "BTECH"), new Branch("Civil", 43098, 0, 13080, 6351, 1638, "BTECH"), new Branch("Bio Technology", 46483, 0, 14212, 7715, 2401, "BTECH"), new Branch("Metallurgical and Materials", 47207, 0, 14902, 8450, 2400, "BTECH")),
            new College("NIT Arunachal Pradesh", 0, new Branch("CSE", 27307, 0, 7923, 3397, 1847, "BTECH"), new Branch("Electrical", 40190, 0, 12234, 7457, 2671, "BTECH"), new Branch("Mechanical", 44834, 0, 12756, 7919, 2956, "BTECH"), new Branch("Civil", 48956, 0, 13799, 7563, 2213, "BTECH"), new Branch("EC", 34073, 0, 10982, 5456, 2073, "BTECH")),
            new College("NIT Bhopal, Madhya Pradesh", 0, new Branch("CSE", 6509, 1096, 2607, 1511, 584, "BTECH"), new Branch("Electrical", 18017, 2958, 5985, 3942, 1635, "BTECH"), new Branch("Mechanical", 23421, 4294, 7918, 4979, 1918, "BTECH"), new Branch("Civil", 31719, 5532, 10048, 5099, 662, "BTECH"), new Branch("Chemical", 30093, 5159, 10939, 6631, 2223, "BTECH"), new Branch("Metallurgy and Material Science", 41286, 6990, 13699, 8144, 2804, "BTECH"), new Branch("EC", 12496, 2196, 4545, 3267, 1280, "BTECH"), new Branch("Planning", 747, 224, 475, 288, 40, "BPlanning"), new Branch("Architecture", 1104, 242, 605, 374, 173, "BTECH")),
            new College("NIT Calicut, Kerala", 0, new Branch("CSE", 3682,627,1095,558,278,"BTECH"), new Branch("Material Science",31721,5568,10924,5962,2361, "BTECH"), new Branch("Mechanical",15509 ,2955,4598,2923,973, "BTECH"), new Branch("Civil",26286,4697,7828,3370,905 , "BTECH"), new Branch("Chemical",24301,4105,8018,5438,1612 , "BTECH"), new Branch("Physics",16548, 3346,4774,3377,1966,"BTECH"), new Branch("Bio Technology",36408,6851,12212,5979,289, "BTECH"), new Branch("EC",6864,1152,2285,1509,467 , "BTECH"),new Branch("Electrical and Electronics",11805,2113,3787,2231,778 , "BTECH"),new Branch("Production",31696,5866,11828,7274,2006, "BTECH"),new Branch("Architecture",599,144,418,137,66, "BARCH")),
            new College("NIT Delhi", 0, new Branch("CSE", 6983, 0, 2616, 1161, 411, "BTECH"), new Branch("EC", 13102, 0, 4636, 2173, 554, "BTECH"), new Branch("Electrical and Electronics", 18291, 0, 6035, 3371, 348, "BTECH")),
            new College("NIT Durgapur, West Bengal",0, new Branch("CSE",8215,1376,2691,1499,471 ,"BTECH"), new Branch("Electrical",18653,3234,5839,4067,1449, "BTECH"), new Branch("Mechanical",25161,4408,7594,4749,1489, "BTECH"), new Branch("Civil",34012,5742,9755,5037,1040 , "BTECH"), new Branch("Chemical",33349,5872,11341,6622,2449 , "BTECH"), new Branch("Metallurgy and Material Science",41685,7314,14009,7840,2917,"BTECH"), new Branch("Bio Technology",43940,7788,14444,8074,3153, "BTECH"), new Branch("EC",13191,2269,3951,2802,1100 , "BTECH"),new Branch("Chemistry (Integrated)",45405,8150,14375,8264,3680 , "MSc"),new Branch("Biotechnology",34220,0,13788,0,0, "MTech (Dual Degree)"),new Branch("Chemical",35217,0,11766,0,0, "MTech (Dual degree)")),
            new College("NIT Goa", 0, new Branch("CSE", 10323, 1897, 3779, 5384, 636, "BTECH"), new Branch("Electrical and Electronics", 21121, 3809, 7234, 4132, 1752, "BTECH"), new Branch("Mechanical", 26295, 4784, 8879, 5053, 1654, "BTECH"), new Branch("EC", 16711, 2902, 5567, 3067, 1703, "BTECH"), new Branch("Civil", 35494, 5852, 10969, 5384, 1791, "BTECH")),
            new College("NIT Hazratbal, Srinagar, Jammu", 0, new Branch("CSE", 23555, 3856, 7593, 4205, 2086, "BTECH"), new Branch("Electrical", 41365, 7272, 12644, 7357, 2267, "BTECH"), new Branch("Mechanical", 44152, 7740, 13716, 8186, 3043, "BTECH"), new Branch("Civil", 49716, 8602, 15254, 8384, 2797, "BTECH"), new Branch("Chemical", 48711, 8835, 15528, 8578, 3303, "BTECH"), new Branch("Metallurgy and Material Science", 50871, 8801, 16005, 9578, 3624, "BTECH"), new Branch("EC", 36006, 6281, 11380, 6998, 3025, "BTECH"), new Branch("IT", 29485, 4979, 10209, 5387, 3110, "BTECH")),
            new College("NIT Jaipur, Rajasthan", 0, new Branch("CSE", 3789, 676, 1573, 973, 349, "BTECH"), new Branch("Electrical", 13406, 2330, 4638, 2728, 1223, "BTECH"), new Branch("Mechanical", 17090, 3358, 5736, 3795, 1421, "BTECH"), new Branch("Civil", 28391, 5072, 8764, 4255, 1248, "BTECH"), new Branch("Chemical", 24475, 4568, 8563, 5836, 2580, "BTECH"), new Branch("Metallurgy and Material Science", 36000, 6343, 12704, 6783, 2774, "BTECH"), new Branch("EC", 8747, 1475, 3250, 2259, 1015, "BTECH"), new Branch("Architecture", 930, 273, 573, 345, 202, "BARCH")),
            new College("NIT Jamshedpur, Jharkhand", 0, new Branch("CSE", 8968, 1402, 3063, 1993, 765, "BTECH"), new Branch("Electrical", 20295, 3571, 6261, 4654, 2042, "BTECH"), new Branch("Mechanical", 26506, 4540, 8198, 5290, 2065, "BTECH"), new Branch("Civil", 35441, 6226, 11111, 6113, 1759, "BTECH"), new Branch("EC", 14358, 2439, 4737, 3354, 1560, "BTECH"), new Branch("Metallurgy and Material Science", 42481, 7766, 13823, 8455, 3257, "BTECH"), new Branch("Production and Industrial Engineering", 41208, 7508, 13302, 8484, 3382, "BTECH")),
            new College("NIT Kurukshetra, Haryana", 0, new Branch("CSE", 5457, 913, 2273, 1192, 454, "BTECH"), new Branch("Electrical", 17207, 2976, 5176, 3583, 1045, "BTECH"), new Branch("Mechanical", 20179, 3688, 6439, 4017, 1452, "BTECH"), new Branch("Civil", 30397, 5448, 9372, 4663, 1749, "BTECH"), new Branch("EC", 11559, 1978, 3845, 2584, 1088, "BTECH"), new Branch("Production and Industrial Engineering", 39726, 7286, 12468, 7670, 3144, "BTECH"), new Branch("IT", 6679, 1119, 2703, 1568, 1029, "BTECH")),
            new College("NIT Manipur", 0, new Branch("CSE", 28003, 0, 8349, 4317, 1798, "BTECH"), new Branch("Electrical", 39742, 0, 11152, 5775, 2447, "BTECH"), new Branch("Mechanical", 42845, 0, 12922, 7630, 2340, "BTECH"), new Branch("Civil", 47701, 0, 14024, 7200, 0, "BTECH"), new Branch("EC", 33641, 0, 978, 5675, 2173, "BTECH")),
            new College("NIT Meghalaya", 0, new Branch("CSE", 17848, 0, 6910, 2835, 842, "BTECH"), new Branch("Electrical and Electronics", 31730, 0, 10920, 6029, 2514, "BTECH"), new Branch("Mechanical", 41558, 0, 11718, 7524, 2505, "BTECH"), new Branch("Civil", 45277, 0, 12744, 6881, 1464, "BTECH"), new Branch("EC", 27791, 0, 7764, 4152, 2406, "BTECH")),
            new College("NIT Mizoram", 0, new Branch("CSE", 29040, 0, 9343, 4453, 0, "BTECH"), new Branch("Electrical and Electronics", 44843, 0, 13262, 6888, 3052, "BTECH"), new Branch("Mechanical", 45287, 0, 13987, 8137, 3001, "BTECH"), new Branch("Civil", 49757, 0, 14730, 8376, 2975, "BTECH"), new Branch("EC", 38178, 0, 11647, 6303, 2563, "BTECH")),
            new College("NIT Nagaland", 0, new Branch("CSE", 28779, 4932, 9632, 5044, 1878, "BTECH"), new Branch("Electrical and Electronics", 44122, 7673, 12830, 7496, 2930, "BTECH"), new Branch("Mechanical", 44827, 7849, 13920, 7765, 2863, "BTECH"), new Branch("Civil", 49455, 8580, 14905, 7900, 2509, "BTECH"), new Branch("EC", 36482, 6718, 11792, 6184, 2642, "BTECH"), new Branch("Electronics and Instrumentation", 46353, 8007, 15340, 8641, 3086, "BTECH")),
            new College("NIT Nagpur", 0, new Branch("CSE", 4708, 803, 1500, 811, 298, "BTECH"), new Branch("Electrical and Electronics", 13164, 2309, 4172, 2607, 815, "BTECH"), new Branch("Mechanical", 17283, 3154, 5330, 3058, 1016, "BTECH"), new Branch("Civil", 27159, 4984, 7993, 3826, 964, "BTECH"), new Branch("Chemical", 26802, 4685, 9458, 6291, 1800, "BTECH"), new Branch("Metallurgy and Material Science", 35208, 6748, 11966, 6407, 2253, "BTECH"), new Branch("EC", 8647, 1442, 2756, 1795, 646, "BTECH"), new Branch("Mining", 41353, 7367, 13243, 7321, 2134, "BTECH"), new Branch("Architecture", 1183, 261, 622, 343, 200, "BTECH")),
            new College("NIT Patna, Bihar", 0, new Branch("CSE", 14010, 2480, 4713, 2821, 1494, "BTECH"), new Branch("Electrical", 27452, 4825, 8601, 5454, 2090, "BTECH"), new Branch("Mechanical", 34111, 5763, 10157, 6192, 2307, "BTECH"), new Branch("EC", 20301, 3513, 6257, 4498, 2085, "BTECH"), new Branch("Civil", 40491, 6987, 12702, 6274, 1863, "BTECH"), new Branch("Architecture", 1454, 366, 713, 384, 203, "BTECH")),
            new College("NIT Raipur, Chattisgarh", 0, new Branch("CSE",10405,1850,3327,2071,919,"BTECH"), new Branch("Electrical",24936,4139,7282,4662,1851, "BTECH"), new Branch("Mechanical",28571,4924,8813,5461,2106 , "BTECH"), new Branch("Civil",37275,6527,12862,5760,1794 , "BTECH"), new Branch("Chemical",38111,6723,12862,7267,2456, "BTECH"), new Branch("Bio Medical",49678,8401,15612,8970,3471, "BTECH"), new Branch("Bio Technology",46896,8096,14996,8907,3246 , "BTECH"), new Branch("EC",17069,2831,5156,3767,1578 , "BTECH"),new Branch("Metallurgy and Material Science",45641,7908,14572,8572,2991, "BTECH"),new Branch("IT",13154,2225,4488,3159,1323, "BTECH"),new Branch("Mining",48959,8230,15247,7965,2763 , "BTECH"),new Branch("Architecture",1415,356,717,358,196 , "BARCH")),
            new College("NIT Puducherry", 0, new Branch("CSE", 15467, 2575, 5044, 2751, 483, "BTECH"), new Branch("Electrical and Electronics", 29855, 5569, 8730, 5144, 1741, "BTECH"), new Branch("Mechanical", 31275, 5635, 9626, 5420, 2132, "BTECH"), new Branch("Civil", 40644, 6721, 12187, 6271, 1843, "BTECH"), new Branch("EC", 20722, 3493, 6684, 4166, 1385, "BTECH")),
            new College("NIT Sikkim", 0, new Branch("CSE", 26007, 0, 7402, 4741, 1818, "BTECH"), new Branch("Electrical and Electronics", 37939, 0, 11918, 7388, 2334, "BTECH"), new Branch("Mechanical", 42791, 0, 13096, 5955, 0, "BTECH"), new Branch("Civil", 47412, 0, 13352, 7360, 2472, "BTECH"), new Branch("EC", 32053, 0, 10096, 6684, 2692, "BTECH")),
            new College("NIT Silchar, Assam", 0, new Branch("CSE", 11127, 1828, 3934, 2146, 848, "BTECH"), new Branch("Electrical", 25411, 4410, 7348, 4876, 1811, "BTECH"), new Branch("Mechanical", 30500, 5461, 9273, 5626, 2023, "BTECH"), new Branch("Civil", 39263, 7015, 11840, 6215, 1672, "BTECH"), new Branch("EC", 16959, 2833, 5289, 3710, 1275, "BTECH"), new Branch("Electronics and Instrumentation", 27769, 4707, 8373, 5433, 2408, "BTECH")),
            new College("NIT Surat", 0, new Branch("CSE", 5227, 932, 2189, 1152, 369, "BTECH"), new Branch("Electrical", 15976, 2909, 5222, 3001, 1197, "BTECH"), new Branch("Mechanical", 21407, 3825, 6888, 4389, 1561, "BTECH"), new Branch("Civil", 31202, 5530, 9174, 4667, 782, "BTECH"), new Branch("Chemical", 29659, 5245, 9659, 6825, 2417, "BTECH"), new Branch("Chemistry (Integrated)", 49321, 8601, 16453, 9338, 3842, "MSc"), new Branch("Physics (Integrated)", 36204, 8046, 16475, 9403, 3743, "MSc"), new Branch("Mathematics (Integrated)", 39706, 8000, 16513, 8558, 2726, "MSc"), new Branch("EC", 11663, 2000, 3996, 3001, 1264, "BTECH")),
            new College("NIT Surathkal, Karnataka", 0, new Branch("CSE", 1324, 212, 448, 302, 101, "BTECH"), new Branch("Electrical and Electronics", 6392, 1158, 2242, 1545, 458, "BTECH"), new Branch("Mechanical", 9668, 1675, 3371, 1866, 865, "BTECH"), new Branch("Civil", 18602, 3337, 5613, 2476, 448, "BTECH"), new Branch("Chemical", 13407, 2748, 4841, 3123, 980, "BTECH"), new Branch("Metallurgy and Material Science", 21751, 3941, 7897, 4511, 1608, "BTECH"), new Branch("Mining", 27128, 4904, 9602, 6728, 2040, "BTECH"), new Branch("IT", 2838, 479, 837, 658, 353, "BTECH"), new Branch("EC", 4151, 673, 1305, 683, 338, "BTECH")),
            new College("NIT Tiruchirapalli, Tamil Nadu", 0, new Branch("CSE", 781, 153, 242, 198, 51, "BTECH"), new Branch("Electrical and Electronics", 5381, 985, 1717, 593, 402, "BTECH"), new Branch("Mechanical", 6591, 1250, 2139, 1068, 512, "BTECH"), new Branch("Civil", 13159, 2808, 4391, 1679, 389, "BTECH"), new Branch("Chemical", 12056, 2435, 4207, 2351, 915, "BTECH"), new Branch("Metallurgy and Material Science", 20809, 3834, 6908, 4144, 1490, "BTECH"), new Branch("Production", 22234, 4109, 7496, 4934, 1817, "BTECH"), new Branch("IC", 13902, 2632, 4866, 3711, 1272, "BTECH"), new Branch("EC", 3022, 621, 1011, 486, 239, "BTECH"), new Branch("Architecture", 422, 96, 251, 130, 65, "BTECH")),
            new College("NIT Uttarakhand", 0, new Branch("CSE", 15550, 0, 5352, 2968, 1737, "BTECH"), new Branch("Electrical and Electronics", 20028, 0, 9642, 0, 0, "BTECH"), new Branch("Mechanical", 34529, 0, 10001, 5723, 2211, "BTECH"), new Branch("Civil", 40993, 0, 11798, 4204, 0, "BTECH"), new Branch("EC", 20028, 0, 7109, 4926, 2133, "BTECH")),
            new College("NIT Warangal", 0, new Branch("CSE", 1541, 236, 594, 341, 146, "BTECH"), new Branch("Electrical and Electronics", 6985, 1359, 2343, 1516, 720, "BTECH"), new Branch("Mechanical", 9961, 1866, 3173, 1958, 830, "BTECH"), new Branch("Civil", 19088, 3192, 6018, 2808, 625, "BTECH"), new Branch("Chemical", 16030, 2894, 5869, 3821, 1402, "BTECH"), new Branch("Metallurgy and Material Science", 24034, 4056, 8409, 5543, 2290, "BTECH"), new Branch("Bio Technology", 25417, 5154, 9543, 6727, 2536, "BTECH"), new Branch("EC", 4671, 767, 1571, 903, 410, "BTECH")),


    };


    public static  College[] iiits = {
            new College("IIIT Bhagalpur", 0, new Branch("CSE", 39089, 6753, 15168, 10231, 5493, "BTECH"), new Branch("EC", 44226, 7645, 16233, 10973, 5972, "BTECH"), new Branch("Mechatronics", 46587, 8351, 16682, 11133, 5993, "BTECH")),
            new College("IIIT Agartala, Tripura", 0, new Branch("CSE", 39147, 7001, 14775, 10226, 5360, "BTECH")),
            new College("IIIT Allahabad", 0, new Branch("IT", 4960, 1013, 2356, 1564, 977, "BTECH"), new Branch("EC", 9250, 1820, 3802, 2786, 1472, "BTECH"), new Branch("Information Technology Business Informatics", 5537, 1132, 2629, 1773, 1108, "BTECH")),
            new College("IIIT Bhopal", 0, new Branch("IT", 33254, 5805, 14417, 10161, 5584, "BTECH"), new Branch("EC", 37310, 6854, 15501, 10513, 5641, "BTECH"), new Branch("CSE", 28443, 5713, 13118, 7799, 3900, "BTECH")),
            new College("IIIT Dharwad", 0, new Branch("CSE", 34219, 6540, 14055, 9297, 4450, "BTECH"), new Branch("EC", 39697, 7023, 15280, 9921, 4961, "BTECH"), new Branch("Data Science and Artificial Intelligence", 34218, 6255, 14558, 9715, 4542, "BTECH")),
            new College("IIIT Guwahati", 0, new Branch("CSE", 21096, 0, 7936, 6279, 3333, "BTECH"), new Branch("EC", 30601, 0, 12019, 8369, 3652, "BTECH")),
            new College("IIIT Kalyani, West Bengal", 0, new Branch("CSE", 36362, 6435, 14063, 8988, 4431, "BTECH")),
            new College("IIIT Kilohard, Haryana", 0, new Branch("CSE", 17628, 3293, 8053, 5650, 3732, "BTECH"), new Branch("IT", 22358, 3953, 10064, 7106, 4795, "BTECH")),
            new College("IIIT Kota", 0, new Branch("CSE", 22320, 4233, 10000, 7250, 3562, "BTECH"), new Branch("EC", 29813, 5583, 13230, 9063, 4962, "BTECH")),
            new College("IIIT Kottayam", 0, new Branch("CSE", 35429, 6635, 14151, 9971, 5319, "BTECH"), new Branch("EC", 41058, 7038, 14871, 10242, 5511, "BTECH")),
            new College("IIIT Kurnool", 0, new Branch("CSE", 32039, 6010, 12774, 5957, 3081, "BTECH"), new Branch("EC in Design and Manufacturing", 40410, 7151, 14237, 7292, 3725, "BTECH"), new Branch("Mechanical in Design and Manufacturing", 46542, 8153, 15083, 8993, 3850, "BTECH"), new Branch("Artificial Intelligence and Data Science", 31799, 6207, 13083, 6618, 2867, "BTECH")),
            new College("IIIT Lucknow", 0, new Branch("IT", 11521, 2039, 5116, 4053, 3177, "BTECH"), new Branch("CSE", 10613, 1902, 4810, 3427, 2523, "BTECH"), new Branch("Computer Science and Artificial Intelligence", 9826, 1737, 4666, 3409, 2279, "BTECH")),
            new College("IIIT Manipur", 0, new Branch("CSE", 41632, 7026, 15500, 9951, 5231, "BTECH"), new Branch("EC", 45452, 7916, 16565, 10709, 6065, "BTECH")),
            new College("IIIT Pune", 0, new Branch("CSE", 20999, 4275, 8936, 6297, 3520, "BTECH"), new Branch("EC", 25897, 5508, 11942, 9117, 4413, "BTECH")),
            new College("IIIT Raichur", 0, new Branch("CSE", 23511, 4671, 10030, 6300, 1681, "BTECH")),
            new College("IIIT Ranchi", 0, new Branch("CSE", 32673, 6033, 12876, 9565, 5010, "BTECH"), new Branch("EC", 40209, 7028, 15577, 10559, 5882, "BTECH")),
            new College("IIIT Sri City, Andhra Pradesh", 0, new Branch("CSE", 28394, 5687, 11360, 8889, 4363, "BTECH"), new Branch("EC", 35758, 6551, 13960, 9746, 4775, "BTECH")),
            new College("IIIT Srirangam, Tiruchirapalli", 0, new Branch("CSE", 21358, 3976, 9325, 6097, 2899, "BTECH"), new Branch("EC", 33355, 5969, 12900, 7072, 3619, "BTECH")),
            new College("IIIT Surat", 0, new Branch("CSE", 22325, 4383, 10042, 7665, 3218, "BTECH"), new Branch("EC", 31143, 6056, 13564, 9867, 4749, "BTECH")),
            new College("IIIT Una, Himachal Pradesh", 0, new Branch("IT", 35683, 6451, 14661, 9967, 5621, "BTECH"), new Branch("EC", 41291, 7114, 15738, 10382, 5872, "BTECH"), new Branch("CSE", 30776, 6172, 12513, 9208, 4799, "BTECH")),
            new College("IIIT Vadodara, Gujarat", 0, new Branch("CSE", 21250, 3938, 8841, 6905, 3605, "BTECH"), new Branch("IT", 23610, 4242, 10139, 7358, 3797, "BTECH")),
            new College("IIITDM Jabalpur, Madhya Pradesh", 0, new Branch("CSE", 15413, 2847, 5892, 3816, 2359, "BTECH"), new Branch("EC", 24558, 4606, 8438, 5229, 2997, "BTECH"), new Branch("Mechanical", 35762, 6589, 12471, 6320, 3041, "BTECH"), new Branch("Smart Manufacturing", 45516, 8221, 16100, 9947, 4159, "BTECH")),
            new College("IIITDM Kancheepuram, Tamil Nadu", 0, new Branch("CSE", 17414, 3207, 6794, 4093, 2162, "BTECH"), new Branch("EC", 26675, 5271, 10481, 6499, 3067, "BTECH"), new Branch("Mechanical", 39524, 6878, 13620, 6793, 3208, "BTECH"), new Branch("Smart Manufacturing", 43973, 8090, 16111, 9986, 3867, "BTECH")),
            new College("IIITM Gwalior, Madhya Pradesh", 0, new Branch("IT", 13461, 2440, 5251, 3224, 2775, "MTECH"), new Branch("IT(MBA)", 18264, 3743, 7017, 4687, 3122, "BTECH"), new Branch("CSE", 8722, 1692, 3292, 2191, 1465, "BTECH")),
            new College("IIITVICD Vadodara", 0, new Branch("CSE", 30298, 5888, 12241, 10040, 4793, "BTECH"))
    };

    public static College findCollege(@NonNull String name, @NonNull String Type, @NonNull String seatPool){
        College b=new College();
        if(seatPool.equals("Gender Nuetral")){
            if(Type.equals("All")){
                for(College a: colleges){
                    if(a.getName().equals(name)){
                        b.setName(a.getName());
                        b.setBranches(a.getBranches());
                        b.setImageid(a.getImageId());
                    }
                }
            }
            else if(Type.equals("IITs")){
                for(College a: iitColleges){
                    if(a.getName().equals(name)){
                        b.setName(a.getName());
                        b.setBranches(a.getBranches());
                        b.setImageid(a.getImageId());
                    }
                }
            }
            else if(Type.equals("NITs")){
                for(College a: nits){
                    if(a.getName().equals(name)){
                        b.setName(a.getName());
                        b.setBranches(a.getBranches());
                        b.setImageid(a.getImageId());
                    }
                }
            }
            else if(Type.equals("IIITs")){
                for(College a: iiits){
                    if(a.getName().equals(name)){
                        b.setName(a.getName());
                        b.setBranches(a.getBranches());
                        b.setImageid(a.getImageId());
                    }
                }
            }}
        return b;

    }



    @NonNull
    public static College findsCollege(@NonNull String name, @NonNull String Type){
        College b=new College();

        if(Type.equals("All")){
            for(College a: College.colleges){
                if(a.getName().equals(name)){
                    b.setName(a.getName());
                    b.setBranches(a.getBranches());
                    b.setImageid(a.getImageId());
                }
            }
        }
        else if(Type.equals("IITs")){
            for(College a: College.iitColleges){
                if(a.getName().equals(name)){
                    b.setName(a.getName());
                    b.setBranches(a.getBranches());
                    b.setImageid(a.getImageId());
                }
            }
        }
        else if(Type.equals("NITs")){
            for(College a: College.nits){
                if(a.getName().equals(name)){
                    b.setName(a.getName());
                    b.setBranches(a.getBranches());
                    b.setImageid(a.getImageId());
                }
            }
        }
        else if(Type.equals("IIITs")){
            for(College a: College.iiits){
                if(a.getName().equals(name)){
                    b.setName(a.getName());
                    b.setBranches(a.getBranches());
                    b.setImageid(a.getImageId());
                }
            }
        }

        return b;
    }















    public static ArrayList<String> classifyByBranch(String Branch, String examName, String category, int rank, String collegeType, String seatPool) {
        ArrayList<String> avaBranch = new ArrayList<String>();
        if (examName.equals("JEE ADVANCED") && (collegeType.equals("All") || collegeType.equals("IITs")) && seatPool.equals("Gender Nuetral")) {
            if (category.equals("Open")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOpen()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankOpen());
                        }
                    }
                }
            } else if (category.equals("OBC-NCL")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankOBC());
                        }
                    }
                }
            } else if (category.equals("EWS")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankEWS());
                        }
                    }
                }
            } else if (category.equals("SC")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankSc()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankSc());
                        }
                    }
                }
            } else if (category.equals("ST")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankSt()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankSt());
                        }
                    }
                }
            }
        } else if (examName.equals("JEE MAINS Paper-I") && collegeType.equals("All") && seatPool.equals("Gender Nuetral")) {
            if (category.equals("Open")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOpen()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankOpen());
                        }
                    }
                }
            } else if (category.equals("OBC-NCL")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankOBC());
                        }
                    }
                }
            } else if (category.equals("EWS")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankEWS());
                        }
                    }
                }
            } else if (category.equals("SC")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankSc()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankSc());
                        }
                    }
                }
            } else if (category.equals("ST")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankSt()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankSt());
                        }
                    }
                }
            }
        } else if (examName.equals("JEE MAINS Paper-I") && collegeType.equals("NITs") && seatPool.equals("Gender Nuetral")) {
            if (category.equals("Open")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOpen()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankOpen());
                        }
                    }
                }
            } else if (category.equals("OBC-NCL")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankOBC());
                        }
                    }
                }
            } else if (category.equals("EWS")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankEWS());
                        }
                    }
                }
            } else if (category.equals("SC")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankSc()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankSc());
                        }
                    }
                }
            } else if (category.equals("ST")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankSt()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankSt());
                        }
                    }
                }
            }

        } else if (examName.equals("JEE MAINS Paper-I") && collegeType.equals("IIITs") && seatPool.equals("Gender Nuetral")) {
            if (category.equals("Open")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOpen()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankOpen());
                        }
                    }
                }
            } else if (category.equals("OBC-NCL")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankOBC());
                        }
                    }
                }
            } else if (category.equals("EWS")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankEWS());
                        }
                    }
                }
            } else if (category.equals("SC")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankSc()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankSc());
                        }
                    }
                }
            } else if (category.equals("ST")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (b.toString().equals(Branch) && rank < b.getRankSt()) {
                            avaBranch.add(a.toString() + "\nClosing Rank : " + b.getRankSt());
                        }
                    }
                }
            }

        }


        return avaBranch;
    }


    public static ArrayList<String> classifyBydata(String examName, String category, int rank, String collegeType, String seatPool) {
        ArrayList<String> avaBranch = new ArrayList<String>();
        if (examName.equals("JEE ADVANCED") && (collegeType.equals("All") || collegeType.equals("IITs")) && seatPool.equals("Gender Nuetral")) {
            if (category.equals("Open")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOpen()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankOpen());
                        }
                    }
                }
            } else if (category.equals("OBC-NCL")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankOBC());
                        }
                    }
                }
            } else if (category.equals("EWS")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankEWS());
                        }
                    }
                }
            } else if (category.equals("SC")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankSc()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankSc());
                        }
                    }
                }
            } else if (category.equals("ST")) {
                for (College a : iitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankSt()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankSt());
                        }
                    }
                }
            }
        } else if (examName.equals("JEE MAINS Paper-I") && collegeType.equals("All") && seatPool.equals("Gender Nuetral")) {
            if (category.equals("Open")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOpen()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankOpen());
                        }
                    }
                }
            } else if (category.equals("OBC-NCL")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankOBC());
                        }
                    }
                }
            } else if (category.equals("EWS")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankEWS());
                        }
                    }
                }
            } else if (category.equals("SC")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankSc()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankSc());
                        }
                    }
                }
            } else if (category.equals("ST")) {
                for (College a : nitIiitColleges) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankSt()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankSt());
                        }
                    }
                }
            }
        } else if (examName.equals("JEE MAINS Paper-I") && collegeType.equals("NITs") && seatPool.equals("Gender Nuetral")) {
            if (category.equals("Open")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOpen()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankOpen());
                        }
                    }
                }
            } else if (category.equals("OBC-NCL")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankOBC());
                        }
                    }
                }
            } else if (category.equals("EWS")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankEWS());
                        }
                    }
                }
            } else if (category.equals("SC")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankSc()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankSc());
                        }
                    }
                }
            } else if (category.equals("ST")) {
                for (College a : nits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankSt()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankSt());
                        }
                    }
                }
            }

        } else if (examName.equals("JEE MAINS Paper-I") && collegeType.equals("IIITs") && seatPool.equals("Gender Nuetral")) {
            if (category.equals("Open")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOpen()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankOpen());
                        }
                    }
                }
            } else if (category.equals("OBC-NCL")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankOBC());
                        }
                    }
                }
            } else if (category.equals("EWS")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankOBC()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankEWS());
                        }
                    }
                }
            } else if (category.equals("SC")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankSc()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankSc());
                        }
                    }
                }
            } else if (category.equals("ST")) {
                for (College a : iiits) {
                    ArrayList<Branch> k = a.getBranches();
                    for (Branch b : k) {
                        if (rank < b.getRankSt()) {
                            avaBranch.add(a.toString() + "\nBranch : " + b.toString() + "\nClosing Rank : " + b.getRankSt());
                        }
                    }
                }
            }

        }


        return avaBranch;
    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16, Branch b17, Branch b18, Branch b19, Branch b20, Branch b21, Branch b22, Branch b23, Branch b24, Branch b25) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);


    }

    public College(String name, int imageid, Branch b1) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);

    }

    public College(String name, int imageid, Branch b1, Branch b2) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);

    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);

    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);
        this.branches.add(b9);
    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);
        this.branches.add(b9);
        this.branches.add(b10);
    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);
        this.branches.add(b9);
        this.branches.add(b10);
        this.branches.add(b11);
    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);
        this.branches.add(b9);
        this.branches.add(b10);
        this.branches.add(b11);
        this.branches.add(b12);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);
        this.branches.add(b9);
        this.branches.add(b10);
        this.branches.add(b11);
        this.branches.add(b12);
        this.branches.add(b13);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);
        this.branches.add(b9);
        this.branches.add(b10);
        this.branches.add(b11);
        this.branches.add(b12);
        this.branches.add(b13);
        this.branches.add(b14);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);
        this.branches.add(b9);
        this.branches.add(b10);
        this.branches.add(b11);
        this.branches.add(b12);
        this.branches.add(b13);
        this.branches.add(b14);
        this.branches.add(b15);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);
        this.branches.add(b9);
        this.branches.add(b10);
        this.branches.add(b11);
        this.branches.add(b12);
        this.branches.add(b13);
        this.branches.add(b14);
        this.branches.add(b15);
        this.branches.add(b16);

    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16, Branch b17) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b2);
        this.branches.add(b3);
        this.branches.add(b4);
        this.branches.add(b5);
        this.branches.add(b6);
        this.branches.add(b7);
        this.branches.add(b8);
        this.branches.add(b9);
        this.branches.add(b10);
        this.branches.add(b11);
        this.branches.add(b12);
        this.branches.add(b13);
        this.branches.add(b14);
        this.branches.add(b15);
        this.branches.add(b16);
        this.branches.add(b17);

    }

    /*public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16, Branch b17, Branch b18, Branch b19, Branch b20, Branch b21, Branch b22, Branch b23, Branch b24, Branch b25) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16, Branch b17, Branch b18, Branch b19, Branch b20, Branch b21, Branch b22, Branch b23, Branch b24, Branch b25) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16, Branch b17, Branch b18, Branch b19, Branch b20, Branch b21, Branch b22, Branch b23, Branch b24, Branch b25) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16, Branch b17, Branch b18, Branch b19, Branch b20, Branch b21, Branch b22, Branch b23, Branch b24, Branch b25) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16, Branch b17, Branch b18, Branch b19, Branch b20, Branch b21, Branch b22, Branch b23, Branch b24, Branch b25) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16, Branch b17, Branch b18, Branch b19, Branch b20, Branch b21, Branch b22, Branch b23, Branch b24, Branch b25) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);


    }

    public College(String name, int imageid, Branch b1, Branch b2, Branch b3, Branch b4, Branch b5, Branch b6, Branch b7, Branch b8, Branch b9, Branch b10, Branch b11, Branch b12, Branch b13, Branch b14, Branch b15, Branch b16, Branch b17, Branch b18, Branch b19, Branch b20, Branch b21, Branch b22, Branch b23, Branch b24, Branch b25) {
        this.name = name;
        this.imageid = imageid;
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);
        this.branches.add(b1);


    }*/


}