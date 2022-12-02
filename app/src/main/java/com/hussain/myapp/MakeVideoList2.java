
package com.hussain.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList2 {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		/*
		//========================Video Item Category
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("hegsoEcow8Q", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("kLHCDZeTVJk", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayListForVideo("Funny Dog", R.drawable.category_1);

		//=========================Category for website loader
		createCategoryForWebsite("Prothom Alo", R.drawable.category_2, "https://www.prothomalo.com/");

		//=========================Category for website loader
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");

		//===========================Category for PDF Viewer
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*
		 */



		//=========================
		createCategoryForWebsite("বাংলাদেশ সকল শিক্ষা বোর্ড ", R.drawable.jsc, "https://bangladesh.gov.bd/site/page/9b530194-c516-4108-9d17-2482f749bd7e");


		createCategoryForWebsite("মাধ্যমিক ও উচ্চশিক্ষা অধিদপ্তর সকল নোটিশ ", R.drawable.jsc, "http://www.dshe.gov.bd/site/view/notices");


		createCategoryForWebsite("বাংলাদেশ কারিগরি শিক্ষা বোর্ড নোটিশ ", R.drawable.bteb, "http://www.bteb.gov.bd/site/view/notices");


		createCategoryForWebsite("XI Class Admission System ", R.drawable.admission, "http://www.xiclassadmission.gov.bd/");

		createCategoryForWebsite("BTEB Admission System", R.drawable.bteb, "http://btebadmission.gov.bd/website/");

		createCategoryForWebsite("Dhaka University", R.drawable.university1, "https://www.du.ac.bd/");

		createCategoryForWebsite("University of Rajshahi", R.drawable.university1, "www.ru.ac.bd");

		createCategoryForWebsite("Bangladesh Agricultural University", R.drawable.university1, "www.bau.edu.bd");

		createCategoryForWebsite("University of Chittagong", R.drawable.university1, "  www.cu.ac.bd ");

		createCategoryForWebsite(" Jahangirnagar University", R.drawable.university1, " www.juniv.edu");

		createCategoryForWebsite(" Jagannath University", R.drawable.university1, "www.jnu.ac.bd");

		createCategoryForWebsite("Comilla University", R.drawable.university1, " www.cou.ac.bd");

		createCategoryForWebsite("University of Barishal", R.drawable.university1, " www.bu.ac.bd");

		createCategoryForWebsite(" Islamic University", R.drawable.university1, " www.iu.ac.bd");

		createCategoryForWebsite("Shahjalal University ", R.drawable.university1, " www.sust.edu");

		createCategoryForWebsite(" National University", R.drawable.university1, " www.nu.edu.bd");

		createCategoryForWebsite("Bangladesh Open University", R.drawable.university1, "www.bou.ac.bd");










	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

