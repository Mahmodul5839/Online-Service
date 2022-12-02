
package com.hussain.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList10 {

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



		createCategoryForWebsite("বগুড়া জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1jYFi9OAK72rBARzmbZ-h6_vGSvD65MGJ/view?usp=sharing");

		createCategoryForWebsite("চাঁপাইনবাবগঞ্জ জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1RTodW5lc3UImh2dKI01GTGnZ5UNFv4rn/view?usp=sharing");

		createCategoryForWebsite("জয়পুরহাট  জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1a8XCMaabCSmhSby7NTehSvSoL3_KwxsF/view?usp=sharing");

		createCategoryForWebsite("নওগাঁ  জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1FItpd9kfw24YWnCZMagn2PVdFhZTpBjs/view?usp=sharing");

		createCategoryForWebsite("নাটোর  জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1cKuucO9tBYEnb1OpsN32sgO7OSRfweLB/view?usp=sharing");

		createCategoryForWebsite("পাবনা  জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1Xh8vN8dQxRE_8xnEpZfSDaydxh00nOBG/view?usp=sharing");

		createCategoryForWebsite("রাজশাহী  জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1k14r1fWtfuHdJ8AXxQni8phep07p1oJM/view?usp=sharing");

		createCategoryForWebsite("সিরাজগঞ্জ  জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1KIeT20v_jZTKQe7Yu6FfqceTssEnFfWm/view?usp=sharing");














	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

