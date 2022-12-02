
package com.hussain.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList11 {

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




		createCategoryForWebsite("দিনাজপুর জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1RhM-n4GBmfzSb3XKKOxyAjSgdV6vj6wX/view?usp=sharing");

		createCategoryForWebsite("গাইবান্ধা জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1_C1WNsBMHQowjVdwWuybAGsYPvvg4xCM/view?usp=sharing");

		createCategoryForWebsite("কুড়িগ্রাম জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1ZqWniT3H7S1r05RTe2YrcTMPVjptU659/view?usp=sharing");

		createCategoryForWebsite("লালমনিরহাট জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1a9ATRNPaHEpzS6gQUOMX0zZrWCXdf4IW/view?usp=sharing");

		createCategoryForWebsite("নীলফামারী জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1yLMbbQoNNItB8KYO7E60S-HO4yPsQhMk/view?usp=sharing");

		createCategoryForWebsite("পঞ্চগড় জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1sL-wWBOfJxhV4ko-lMoZ749tFqAfRrKN/view?usp=sharing");

		createCategoryForWebsite("রংপুর জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1Vgpzi7B19QZE5OJDZoZF8JqNcxyPejJX/view?usp=sharing");

		createCategoryForWebsite("ঠাকুরগাঁও জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1im4QgCPU5Fad1BiJHIuJflEY4tvJGS5o/view?usp=sharing");

















	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

