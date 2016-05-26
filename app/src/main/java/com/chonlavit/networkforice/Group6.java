package com.chonlavit.networkforice;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

import com.nineoldandroids.view.ViewHelper;


public class Group6 extends AppCompatActivity {

   // static final int TOTAL_PAGES = 7;


    private VideoView myVideoView;
  //  ViewPager pager;
  //  PagerAdapter pagerAdapter;
  //  LinearLayout circles;
  //  Button btnSkip;
   // Button btnDone;
    //ImageButton btnNext;
   // boolean isOpaque = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       Window window = getWindow();
      window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        myVideoView = (VideoView) findViewById(R.id.videoView);



     //  myVideoView.setVideoPath("android.resource:http://ice.pbru.ac.th/ICE56/SakrapeeS/PictureFiber/video/fiber3cutfiber.mp4");

        //controll
      /*  MediaController objMediaController = new MediaController(this);
        objMediaController.setAnchorView(myVideoView);
        myVideoView.setMediaController(objMediaController);
        myVideoView.start();*/
        myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.fiber1work));

        myVideoView.setMediaController(new MediaController(this));

        myVideoView.requestFocus();

        myVideoView.start();

     //   setContentView(R.layout.home_group5);
     //   btnSkip = Button.class.cast(findViewById(R.id.btn_skip));
      //  btnSkip.setOnClickListener(new View.OnClickListener() {
      //      @Override
      //      public void onClick(View v) {
       //         endTutorial();
       //     }
      //  });
/*
        btnNext = ImageButton.class.cast(findViewById(R.id.btn_next));
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() + 1, true);
            }
        });

        btnDone = Button.class.cast(findViewById(R.id.done));
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endTutorial();
            }
        });

        pager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new ScreenSlideAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        pager.setPageTransformer(true, new CrossfadePageTransformer());
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position == TOTAL_PAGES - 2 && positionOffset > 0) {
                    if (isOpaque) {
                        pager.setBackgroundColor(Color.TRANSPARENT);
                        isOpaque = false;
                    }
                } else {
                    if (!isOpaque) {
                        pager.setBackgroundColor(getResources().getColor(R.color.primary_material_light));
                        isOpaque = true;
                    }
                }
            }

            @Override
            public void onPageSelected(int position) {
                setIndicator(position);
                if (position == TOTAL_PAGES - 2) {
                    btnSkip.setVisibility(View.GONE);
                    btnNext.setVisibility(View.GONE);
                    btnDone.setVisibility(View.VISIBLE);
                } else if (position < TOTAL_PAGES - 2) {
                    btnSkip.setVisibility(View.VISIBLE);
                    btnNext.setVisibility(View.VISIBLE);
                    btnDone.setVisibility(View.GONE);
                } else if (position == TOTAL_PAGES - 1) {
                    endTutorial();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        buildCircles();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (pager != null) {
            pager.clearOnPageChangeListeners();
        }
    }

    private void buildCircles() {
        circles = LinearLayout.class.cast(findViewById(R.id.circles));

        float scale = getResources().getDisplayMetrics().density;
        int padding = (int) (5 * scale + 0.5f);

        for (int i = 0; i < TOTAL_PAGES - 1; i++) {
            ImageView circle = new ImageView(this);
            circle.setImageResource(R.drawable.ic_checkbox_blank_circle_white_18dp);
            circle.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            circle.setAdjustViewBounds(true);
            circle.setPadding(padding, 0, padding, 0);
            circles.addView(circle);
        }

        setIndicator(0);
    }

    private void setIndicator(int index) {
        if (index < TOTAL_PAGES) {
            for (int i = 0; i < TOTAL_PAGES - 1; i++) {
                ImageView circle = (ImageView) circles.getChildAt(i);
                if (i == index) {
                    circle.setColorFilter(getResources().getColor(R.color.text_selected));
                } else {
                    circle.setColorFilter(getResources().getColor(R.color.transparent_bg));
                }
            }
        }
    }

    private void endTutorial() {
        finish();
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
    }

    @Override
    public void onBackPressed() {
        if (pager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            pager.setCurrentItem(pager.getCurrentItem() - 1);
        }
    }

    private class ScreenSlideAdapter extends FragmentStatePagerAdapter {

        public ScreenSlideAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Group6Fragment group6Fragment = null;
            switch (position) {
                case 0:
                    group6Fragment = Group6Fragment.newInstance(R.layout.group6_content_1);
                    break;
                case 1:
                    group6Fragment = Group6Fragment.newInstance(R.layout.group6_content_2);
                    break;
                case 2:
                    group6Fragment = Group6Fragment.newInstance(R.layout.group6_content_3);
                    break;
                case 3:
                    group6Fragment = Group6Fragment.newInstance(R.layout.group6_content_4);
                    break;
                case 4:
                    group6Fragment = Group6Fragment.newInstance(R.layout.group6_content_5);
                    break;
                case 5:
                    group6Fragment = Group6Fragment.newInstance(R.layout.group5_content6);
                    break;

                case 6:
                    group6Fragment = Group6Fragment.newInstance(R.layout.group6_content_7);
                    break;
            }

            return group6Fragment;
        }

        @Override
        public int getCount() {
            return TOTAL_PAGES;
        }
    }

    public class CrossfadePageTransformer implements ViewPager.PageTransformer {

        @Override
        public void transformPage(View page, float position) {
            int pageWidth = page.getWidth();

            View backgroundView = page.findViewById(R.id.welcome_fragment);
            View text_head = page.findViewById(R.id.screen_heading);
            View text_content = page.findViewById(R.id.screen_desc);
            View text_content1 = page.findViewById(R.id.screen_desc1);
            if (0 <= position && position < 1) {
                ViewHelper.setTranslationX(page, pageWidth * -position);
            }
            if (-1 < position && position < 0) {
                ViewHelper.setTranslationX(page, pageWidth * -position);
            }

            if (position <= -1.0f || position >= 1.0f) {

            } else if (position == 0.0f) {
            } else {
                if (backgroundView != null) {
                    ViewHelper.setAlpha(backgroundView, 1.0f - Math.abs(position));

                }
                if (text_head != null) {
                    ViewHelper.setTranslationX(text_head, pageWidth * position);
                    ViewHelper.setAlpha(text_head, 1.0f - Math.abs(position));
                }

                if (text_content != null) {
                    ViewHelper.setTranslationX(text_content, pageWidth * position);
                    ViewHelper.setAlpha(text_content, 1.0f - Math.abs(position));
                }
                if (text_content1 != null) {
                    ViewHelper.setTranslationX(text_content1, pageWidth * position);
                    ViewHelper.setAlpha(text_content1, 1.0f - Math.abs(position));
                }
            }
        }

        }*/
    }
}

