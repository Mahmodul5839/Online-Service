
package com.hussain.myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList12 {

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


		createCategoryForWebsite("বাগেরহাট জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1lu-9_Ulcr50KnouXWHRlodLuNlBY5Cz2/view?usp=sharing");

		createCategoryForWebsite("চুয়াডাঙ্গা জেলা সকল হসপিটাল ", R.drawable.doctorr, "https://drive.google.com/file/d/1tNCJg2OX0mv0QVDCPjTMxVWRCRMbFIjQ/view?usp=sharing");

		createCategoryForWebsite("যশোর জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/12r2cdN1uShN_6fronzWYSuapjbZCxT5X/view?usp=sharing");

		createCategoryForWebsite("ঝিনাইদহ জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1r_mIz6Qvo6NH2_eP33e_mtc3D2vzMkLr/view?usp=sharing");

		createCategoryForWebsite("খুলনা জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1Gk8ABQeiUgX7inKxZS9325fU-RCAr5RY/view?usp=sharing");

		createCategoryForWebsite("কুষ্টিয়া জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/15q-20c5LWWLGsXjfrIYYvogf6PhXfTfO/view?usp=sharing");

		createCategoryForWebsite("মাগুরা জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/14sZOeegRx5L_FYyvnA5Db--I-cd3cWIZ/view?usp=sharing");

		createCategoryForWebsite("মেহেরপুর জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/130D89kAiEBHWuxrJmLc_vxyBIhViLB_d/view?usp=sharing");

		createCategoryForWebsite("নারাইল জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1HctoclmezPWEhwgGElX2Fpdu1eY2uU0y/view?usp=sharing");

		createCategoryForWebsite("সাতক্ষীরা জেলা সকল হসপিটাল", R.drawable.doctorr, "https://drive.google.com/file/d/1EH41kkPx-gepQTbKeTcXA2fL7Dx7CpYL/view?usp=sharing");
















	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

