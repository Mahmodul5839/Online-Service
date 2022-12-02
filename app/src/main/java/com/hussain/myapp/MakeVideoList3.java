
package com.hussain.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList3 {

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
		createCategoryForWebsite("নতুন জন্ম নিবন্ধনের জন্য আবেদন", R.drawable.certificate, "https://bdris.gov.bd/br/application?fbclid=IwAR2kLU22BzGjSeyP5E0dzjwomZEO06WNU8iQ8fp6ywB6L2bdZNtTE8980SM");

		createCategoryForWebsite("জন্ম নিবন্ধন তথ্য সংশোধন আবেদন", R.drawable.certificate, "https://bdris.gov.bd/br/correction?fbclid=IwAR3F_FtxiepHhoP1M5HLidUuRAMwQ_yY-Ff0N4pr1ihGPGNpVv_8KlIu4jg");

		createCategoryForWebsite("জন্ম নিবন্ধন তথ্য অনুসন্ধান", R.drawable.certificate, "https://bdris.gov.bd/br/search?fbclid=IwAR1zeCHtAcNdDe70OSzk9m8AltIyLQBNBh2f5jtYB9OwcmPihG176HzS4Ro");

		createCategoryForWebsite("জন্ম নিবন্ধন আবেদনের বর্তমান অবস্থা", R.drawable.certificate, "https://bdris.gov.bd/br/application/status?fbclid=IwAR1ROBGqYHL0_e4i7IaigH63-ABREOklcWGTm0ft-QaG70H85OZhPjjVi4Y");

		createCategoryForWebsite("জন্ম নিবন্ধন আবেদন পত্র প্রিন্ট", R.drawable.certificate, "https://bdris.gov.bd/application/print?fbclid=IwAR3F_FtxiepHhoP1M5HLidUuRAMwQ_yY-Ff0N4pr1ihGPGNpVv_8KlIu4jg");

		createCategoryForWebsite("জন্ম নিবন্ধন সনদ পুনঃ মুদ্রন", R.drawable.certificate, "https://bdris.gov.bd/br/reprint/add?fbclid=IwAR1ROBGqYHL0_e4i7IaigH63-ABREOklcWGTm0ft-QaG70H85OZhPjjVi4Y");













	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

