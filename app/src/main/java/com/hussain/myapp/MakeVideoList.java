
package com.hussain.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

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
		createCategoryForWebsite("Emergency Service BD ??????????????? ???????????? ", R.drawable.emergincy, "Imargincy Service");

		createCategoryForWebsite("All Examination Result Bangladesh ", R.drawable.examination, "Bangladeshi Result");

		createCategoryForWebsite("BD Education System\n(?????????????????? ????????????) ", R.drawable.admission2, "Bangladeshi Admission");

		createCategoryForWebsite("Birth Certificate\n(???????????? ????????????????????? ????????????)", R.drawable.births, "Birth Certificate");

		createCategoryForWebsite("NID Service (???????????????\n????????????????????????????????? ????????????)", R.drawable.idc, "Nid Service");

		createCategoryForWebsite("Bangladesh Railway\n(?????????????????? ???-??????????????? )", R.drawable.rail, "Bangladesh Railway");

		createCategoryForWebsite("Online Bus Ticket BD\n(?????????????????? ??????????????? )", R.drawable.bus, "https://www.shohoz.com/bus-tickets");

		createCategoryForWebsite("Online Launch Ticket\nBD(?????????????????? ???????????????)", R.drawable.ship, "https://www.shohoz.com/launch/");

		createCategoryForWebsite("???????????????????????? ??????????????? ?????????????????? ??????????????? ???????????????   ", R.drawable.plane, "https://www.biman-airlines.com/#flight");

		createCategoryForWebsite("Bangladesh Passport\n(?????????????????? ???-????????????????????????)", R.drawable.pass, "https://www.epassport.gov.bd/landing");

		createCategoryForWebsite("BD(?????????????????? ???-?????????????????? ??????????????? ???????????????????????? ????????????)", R.drawable.animal, "Bangladesh prani");

		createCategoryForWebsite("BD(???????????? ????????????????????? ?????? ????????????????????????????????? ?????????????????????)", R.drawable.land, "https://ldtax.gov.bd/citizen/register");















		//===========================
















	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

