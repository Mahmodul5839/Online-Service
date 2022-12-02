
package com.hussain.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList8 {

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



		createCategoryForWebsite("ঢাকা জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1rdOBXxEYuiJtxp9hmD12jxcdPTtshAQi/view?usp=sharing");

		createCategoryForWebsite("ফরিদপুর জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/11MW7I0QUn1ElAo20_dXp5eB9G83xu5kw/view?usp=sharing");

		createCategoryForWebsite("গাজীপুর জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1d88ccyc70gY0E5IDP7k6Rx2b0RBBTDeR/view?usp=sharing");

		createCategoryForWebsite("গোপালগঞ্জ জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1Q2-MgZZn3j7AyT-mJDTT1WfEyR7wg05w/view?usp=sharing");

		createCategoryForWebsite("কিশোরগঞ্জ জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1dBIJ87wZR_IyTSXnGQBy6_sR-9pHeK6h/view?usp=sharing");

		createCategoryForWebsite("মাদারীপুর জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/127D8xYLNaP8T2MXVBLQVniqhru-2t8iz/view?usp=sharing");

		createCategoryForWebsite("মানিকগঞ্জ জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1umL4yJBB5NCbGVo8iLWsjMUiDzLT_Ynh/view?usp=sharing");

		createCategoryForWebsite("মুন্সীগঞ্জ জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/13WhF0hMFzVxazo1ff1GKAhaoHa0J3qRN/view?usp=sharing");

		createCategoryForWebsite("নারায়ণগঞ্জ জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1TSTTyEk4nHR9-C5eu5_r46QxHZZnxd-O/view?usp=sharing");

		createCategoryForWebsite("নরসিংদী জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1fo5B1WyCcpY80fWpbXLaquo8ia6rfi8Q/view?usp=sharing");

		createCategoryForWebsite("রাজবাড়ি জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1ME0SawRzGLZp_DynQGxbtCqSz1enV2Kw/view?usp=sharing");

		createCategoryForWebsite("শরীয়তপুর জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1YFFWE9TWq-RRO2RCFobNp3Yr_M9Wpp17/view?usp=sharing");

		createCategoryForWebsite("টাঙ্গাইল জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1uP4BTnnpmyNyNwY4nwohTBftKQphNfTk/view?usp=sharing");










	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

