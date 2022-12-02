
package com.hussain.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList9 {

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



		createCategoryForWebsite("বান্দরবান জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/15JbqtW8f18FJsulosQGIdc0HLi95PXXE/view?usp=sharing");

		createCategoryForWebsite("ব্রাহ্মণবাড়িয়া জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1FuHV5WZXFIiVsP0kkHbnXylccXF1TVeH/view?usp=sharing");

		createCategoryForWebsite("চাঁদপুর জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1lYVM9ts9JyC5p2c9dfR7-IaayVywM0m7/view?usp=sharing");

		createCategoryForWebsite("চট্রগ্রাম জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/10taJsboLW4jpg8Q6bihQCw4UIpc1eBz4/view?usp=sharing");

		createCategoryForWebsite("কুমিল্লা জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1a-Rt9iosii-2z6gb47MQ3aYipJrlaOrM/view?usp=sharing");

		createCategoryForWebsite("কক্সবাজার", R.drawable.doctorr, "https://drive.google.com/file/d/1AddkzLXbfphasTYm3yczrGn8OXIRCUXK/view?usp=sharing");

		createCategoryForWebsite("ফেনী জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1jjGdqBqh5nnrgLhzgcVV3EhBIKSQ0QG6/view?usp=sharing");

		createCategoryForWebsite("খাগড়াছড়ি জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1kF_RDXH0XaHLcULvTYDJOErle-iN8629/view?usp=sharing");

		createCategoryForWebsite("লাক্সিমপুর জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1h5d-5oM6vWPJqfChbNa2BHryCeBUu3_Y/view?usp=sharing");

		createCategoryForWebsite("নোয়াখালী জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1PTmbx1WJV0cvJiCD8WeIABphqLTwQo6E/view?usp=sharing");

		createCategoryForWebsite("রাঙ্গামাটি জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1iuQajYP6GHs63St9ziH6e4maJEZBCOXM/view?usp=sharing");











	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

