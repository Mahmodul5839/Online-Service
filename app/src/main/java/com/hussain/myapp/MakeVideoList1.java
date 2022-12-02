
package com.hussain.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList1 {

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

		createCategoryForWebsite("BTEB Diploma Result", R.drawable.bteb, "https://bteb.biplophossain.me/?fbclid=IwAR0lFKOCSUrFnoma1iGrPNfTkkcbju01XjLfOUiOTu-l0kCjAsFCANtMIWQ");


		createCategoryForWebsite("BTEB Diploma Result", R.drawable.bteb, "http://180.211.164.133/result_arch/");


		createCategoryForWebsite("PSC/Primary Result", R.drawable.psc, "http://180.211.137.51/");

		createCategoryForWebsite("PSC/Primary Result", R.drawable.psc, "http://180.211.137.51/ResultSingle.aspx");

		createCategoryForWebsite("JSC/JDC Result", R.drawable.jsc, "http://www.educationboardresults.gov.bd/");

		createCategoryForWebsite("JSC/JDC Result", R.drawable.jsc, "https://eboardresults.com/v2/home");

		createCategoryForWebsite("SSC/Dakhil Result", R.drawable.jsc, "https://eboardresults.com/v2/home");

		createCategoryForWebsite("SSC/Dakhil Result", R.drawable.jsc, "http://www.educationboardresults.gov.bd/");

		createCategoryForWebsite("HSC/Alim Result", R.drawable.jsc, "https://eboardresults.com/v2/home");

		createCategoryForWebsite("HSC/Alim Result", R.drawable.jsc, "http://www.educationboardresults.gov.bd/");

		createCategoryForWebsite("NU/Degree/Honours/Masters Result", R.drawable.national, "https://www.nu.ac.bd/results/");

		createCategoryForWebsite("Bangladesh Open University Result", R.drawable.university, "https://www.bou.org.bd/result/");

		createCategoryForWebsite("MBBS Examination Relult", R.drawable.doctor, "https://result.dghs.gov.bd/mbbs/");

		createCategoryForWebsite("BDS Examination Result", R.drawable.school, "https://result.dghs.gov.bd/bds/");

		createCategoryForWebsite("BCPS Examination Result", R.drawable.school, "https://bcps.edu.bd/result/");
		//===========================
















	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

