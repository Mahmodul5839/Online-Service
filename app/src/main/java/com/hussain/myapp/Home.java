package com.hussain.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



import de.hdodenhof.circleimageview.CircleImageView;

public class Home extends AppCompatActivity {





    /*
    >>Source Code by
    >>Jubayer Hossain [https://www.facebook.com/JubayerHossainbd]
    >>Please don't forget to put a review on my site [www.myapp.com]
    >>Share my course with your friends on Facebook
    >>Your positive words help me doing even better
     */

    //marquee**********************************
    private TextView tv;
    CircleImageView map;
    RelativeLayout exit;
    ImageView logo;
    LinearLayout banner_container;


    //marqur*********************************
    Animation myanim;
    TextView text,home;
    BottomNavigationView navigation;
    LinearLayout layImageSlider;



    AdView mAdView;
    public static int CategoryClicked = -10;
    ImageSlider imageSlider;
    ExpandableHeightGridView mainGrid;
    Intent targetActivity;

    // per app run-- do not show more than 3 fullscreen ad. [[Change it if your want]]
    int fullScreenAdMaxShowCount = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        StartAppAd.disableSplash();

        map = findViewById(R.id.map);
        layImageSlider = findViewById(R.id.layImageSlider);


        text = findViewById(R.id.text);
        myanim = AnimationUtils.loadAnimation(Home.this,R.anim.zoom_in);
        text.startAnimation(myanim);

        logo = findViewById(R.id.logo);
        myanim = AnimationUtils.loadAnimation(Home.this,R.anim.zoom_in);
        logo.startAnimation(myanim);


        myanim = AnimationUtils.loadAnimation(Home.this,R.anim.right_to_left);
        map.startAnimation(myanim);





        myanim = AnimationUtils.loadAnimation(Home.this,R.anim.left_to_right);
        layImageSlider.startAnimation(myanim);




        //marquee*********************************************
        tv = (TextView) this.findViewById(R.id.mywidget);
        tv.setSelected(true);


        //marque**********************************************//

        navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.mhome:
                        Toast.makeText(Home.this,"হোম মেনুতে আপনাকে স্বাগতম",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.mrate:

                                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                                try {
                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                                } catch (android.content.ActivityNotFoundException anfe) {
                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));

                                }
                        Toast.makeText(Home.this,"আপনাকে অনেক  ধন্যবাদ।\n অনুগ্রহ করে প্লে স্টোরে আমাদের  রেটিং দিবেন,\nএটা আমাদের আরও ভালো করতে সাহায্য করে। ",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.mshare:
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        String Body = "Download this App";
                        String Sub = "http://play.google.com";
                        intent.putExtra(Intent.EXTRA_TEXT,Body);
                        intent.putExtra(Intent.EXTRA_TEXT,Sub);
                        startActivity(Intent.createChooser(intent,"Share using"));
                        Toast.makeText(Home.this,"অ্যাপসটি যদি আপনার ভালো লাগে তাহলে\nঅনুগ্রহ করে প্রিয়জনের কাছে শেয়ার করে দেন।",Toast.LENGTH_LONG).show();
                        return true;


                    case R.id.mmore:
                        Intent nine = new Intent(Intent.ACTION_VIEW);
                        nine.setData(Uri.parse("https://play.google.com/store/apps/details?id="+"com.hasan.newsapp"));
                        startActivity(nine);
                        Toast.makeText(Home.this,"আমাদের আরো অ্যাপসের সেবা পেতে প্লে স্টোর থেকে অ্যাপসটি ডাউনলোড করতে পারেন।",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.mcontac:
                        Intent name = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("sms","01736685839",null));
                        name.putExtra("sms","Hello Dear....");
                        startActivity(name);
                        Toast.makeText(Home.this,"অ্যাপসটিতে নতুন কোনো সেবা যোগ করার জন্য আমাদেরকে মেসেজ করোন।",Toast.LENGTH_LONG).show();
                        return true;







                }






                return false;
            }
        });









        exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Home.this)
                        .setTitle("Confirm Exit?")
                        .setMessage("Do you really want to exit?")
                        .setIcon(R.drawable.denger)
                        .setNegativeButton("No,thanks", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();

                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                finishAndRemoveTask();

                            }
                        })
                        .show();

            }
        });





        mAdView = findViewById(R.id.adView);
        imageSlider = findViewById(R.id.image_slider);
        mainGrid = findViewById(R.id.mainGrid);
        mAdView.setVisibility(View.GONE);

        if (getString(R.string.show_admob_ad).contains("ON")){
            initAdmobAd();
            //loadBannerAd();
            loadFullscreenAd();
        }

        createSlider();
        MakeVideoList.createMyAlbums();

        MyAdapter adapter = new MyAdapter();
        mainGrid.setExpanded(true);
        mainGrid.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    } //------------------------------onCreate (bundle) ENDS here






    // ================================================================
    // ================================================================
    // ================================================================

    private void createSlider(){

        ArrayList<SlideModel> imageList = new ArrayList<>();
        //imageList.add(new SlideModel(R.drawable.slide_1, null));


        imageList.add(new SlideModel(R.drawable.emergincy_service,"Emergency myapp Bangladesh", null));

        imageList.add(new SlideModel(R.drawable.resultall,"All Examination Result Bangladesh", null));

        imageList.add(new SlideModel(R.drawable.universityimage,"Online Collage Admission",  null));

        imageList.add(new SlideModel(R.drawable.desigen,"Online Birth Registation Service", null));

        imageList.add(new SlideModel(R.drawable.railway,"Online Railway Ticket Service", null));

        imageList.add(new SlideModel(R.drawable.onlinebus,"Online Bus Ticket Service", null));

        imageList.add(new SlideModel(R.drawable.rrrrr,"Bangladesh Launch Service", null));

        imageList.add(new SlideModel(R.drawable.airlines,"Bangladesh Airlines Ticket Service " , null));

        imageList.add(new SlideModel(R.drawable.sebaa,"বাংলাদেশ প্রাণী সম্পদ অধিদপ্তরের সকল সেবা", null));


        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);

    }


    // ================================================================
    // ================================================================
    // ================================================================



    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public  MyAdapter(){
            this.inflater = (LayoutInflater) Home.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return MakeVideoList.catArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);


            ImageView imgIcon = convertView.findViewById(R.id.imgIcon);
            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            LinearLayout layItem = convertView.findViewById(R.id.layItem);
//animation---------------------------------------------------------------------------
            myanim = AnimationUtils.loadAnimation(Home.this,R.anim.right_to_left);
            tvTitle.startAnimation(myanim);

            myanim = AnimationUtils.loadAnimation(Home.this,R.anim.zoom_in);
            imgIcon.startAnimation(myanim);


            //animation------------------------------------------------------------------


            HashMap<String, String> mHashMap = MakeVideoList.catArrayList.get(position);
            String catName = mHashMap.get("category_name");
            String img = mHashMap.get("img");
            String url = mHashMap.get("url");
            String pdfAssetName = mHashMap.get("pdfAssetName");



            if (tvTitle!=null) tvTitle.setText(catName);
            if (imgIcon!=null && img!=null) {
                int drawable = Integer.parseInt(img);
                imgIcon.setImageResource( drawable );
            }

            Animation animation = AnimationUtils.loadAnimation(Home.this, R.anim.anim_grid);
            animation.setStartOffset(position*300);
            convertView.startAnimation(animation);



            if (layItem!=null){
                layItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //We are tracking the category postion. So that we can call the intent after ad loads
                        if(url=="Bangladeshi Result"){
                            Toast.makeText(Home.this,"Wilcome to Bangladeshi Examination result page",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),Home1.class);
                            startActivity(intent);
                        }
                        else if(url=="Bangladeshi Admission"){
                            Toast.makeText(Home.this,"Wilcome to Bangladesh University admission page",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),Home2.class);
                            startActivity(intent);
                        }
                        else if(url=="Birth Certificate"){
                            Toast.makeText(Home.this,"Wilcome to birth certificate page",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),Home3.class);
                            startActivity(intent);
                        }

                        else if(url=="Nid Service"){
                            Toast.makeText(Home.this,"Wilcome to NID myapp page",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),Home4.class);
                            startActivity(intent);
                        }
                        else if(url=="Imargincy Service"){
                            Toast.makeText(Home.this,"Wilcome to emergincy myapp page",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),Home5.class);
                            startActivity(intent);
                        }
                        else if(url=="Bangladesh prani"){
                            Toast.makeText(Home.this,"Wilcome to E-Service",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),Home17.class);
                            startActivity(intent);
                        }
                        else if(url=="Bangladesh Railway"){
                            Toast.makeText(Home.this,"Wilcome to E-Service",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),Home18.class);
                            startActivity(intent);
                        }



                        // Check the item is a website link
                        else if (url!=null && url.length()>5){
                            WebBrowser2.WEBSITE_LINK = url;
                            WebBrowser2.WEBSITE_TITLE = catName;
                            //startActivity(new Intent(Home.this, WebBrowser.class));
                            targetActivity = new Intent(Home.this, WebBrowser2.class);
                            if (mInterstitialAd==null) startActivity(targetActivity);
                            else if (FULLSCREEN_AD_LOAD_COUNT>=fullScreenAdMaxShowCount) startActivity(targetActivity);
                            else mInterstitialAd.show(Home.this);

                        }

                        // Check the item is a PDF FILE OR NOT
                       else if (pdfAssetName!=null && pdfAssetName.length()>3){
                            MyPDFViewer.PDF_ASSET_NAME = pdfAssetName;
                            MyPDFViewer.PDF_TITLE = catName;
                            //startActivity(new Intent(Home.this, MyPDFViewer.class));
                            targetActivity = new Intent(Home.this, MyPDFViewer.class);
                            if (mInterstitialAd==null) startActivity(targetActivity);
                            else if (FULLSCREEN_AD_LOAD_COUNT>=fullScreenAdMaxShowCount) startActivity(targetActivity);
                            else mInterstitialAd.show(Home.this);

                        }

                       // None of the above is true. So the category is video collection type
                        else{
                            CategoryClicked = position;
                            MainActivity.arrayList = MakeVideoList.rootArrayList.get(position);
                            targetActivity = new Intent(Home.this, MainActivity.class);
                            if (mInterstitialAd==null) startActivity(targetActivity);
                            else if (FULLSCREEN_AD_LOAD_COUNT>=fullScreenAdMaxShowCount) startActivity(targetActivity);
                            else mInterstitialAd.show(Home.this);
                        }





                    }
                });
            }



            return convertView;
        }
    }




    //=============================================
    //=============================================
    //=============================================









    int BANNER_AD_CLICK_COUNT =0;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }else{
                    if(mAdView!=null) mAdView.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                BANNER_AD_CLICK_COUNT++;

                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }






    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>













    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // loadFullscreenAd method starts here.....
    InterstitialAd mInterstitialAd;
    int FULLSCREEN_AD_LOAD_COUNT=0;
    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        FULLSCREEN_AD_LOAD_COUNT++;
                        loadFullscreenAd();

                        if (targetActivity!=null) startActivity(targetActivity);

                    }

                }); // FullScreen Callback Ends here


            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }


    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    private void initAdmobAd(){

        if (getString(R.string.device_id).length()>12){
            //Adding your device id -- to avoid invalid activity from your device
            List<String> testDeviceIds = Arrays.asList(getString(R.string.device_id));
            RequestConfiguration configuration =
                    new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
            MobileAds.setRequestConfiguration(configuration);
        }




        //Init Admob Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



    ///====================================================
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button


                new AlertDialog.Builder(Home.this)
                        .setTitle("Confirm Exit?")
                        .setMessage("Do you really want to exit?")
                        .setIcon(R.drawable.denger)
                        .setNegativeButton("No,thanks", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();

                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                finishAndRemoveTask();

                            }
                        })
                        .show();

            }






    } // end of onBackpressed method

    //#############################################################################################





