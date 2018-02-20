package edison.deepakraoj.fragment_pagination;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class FragmentTwo extends Fragment implements ViewPager.OnPageChangeListener, View.OnClickListener {
   int layoutes[]={R.layout.fragment_switch_board_1,R.layout.fragment_switch_board_5plus1};


   ViewPager mViewPager;
   private CustomPagerAdapter mAdapter;
   private LinearLayout pager_indicator;
   private int dotsCount;
   private ImageView[] dots;
   String roomnamesdb[];
   @Override
   public View onCreateView(LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
      /**
       * Inflate the layout for this fragment
       */
     /* return inflater.inflate(
      R.layout.fragment_two, container, false);*/
      View view = inflater.inflate(R.layout.fragment_two,
              container, false);

      mViewPager = (ViewPager)view. findViewById(R.id.viewpager);
      pager_indicator = (LinearLayout) view.findViewById(R.id.viewPagerCountDots);
      //  mAdapter = new CustomPagerAdapter(this, mResources);
      mAdapter = new CustomPagerAdapter(getActivity(),layoutes);
      mViewPager.setAdapter(mAdapter);
      mViewPager.setCurrentItem(0);
      mViewPager.setOnPageChangeListener(this);


      setPageViewIndicator();


      return view;
   }

   private void setPageViewIndicator() {



      Log.d("###setPageViewIndicator", " : called");



      dotsCount = mAdapter.getCount();
      dots = new ImageView[dotsCount];

      for (int i = 0; i < dotsCount; i++) {
         dots[i] = new ImageView(getActivity());
         dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditem));

         LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                 LinearLayout.LayoutParams.WRAP_CONTENT,
                 LinearLayout.LayoutParams.WRAP_CONTENT
         );

         params.setMargins(4, 0, 4, 0);

         final int presentPosition = i;
         dots[presentPosition].setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
               mViewPager.setCurrentItem(presentPosition);
               return true;
            }

         });


         pager_indicator.addView(dots[i], params);
      }

      dots[0].setImageDrawable(getResources().getDrawable(R.drawable.selecteditemdot));
   }


   @Override
   public void onClick(View v) {

      Log.d("TAG", "onClick");
    //  Toast.makeText(getActivity(),"onClick",Toast.LENGTH_LONG).show();
   }

   @Override
   public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
      Log.d("TAG", "onPageScrolled");
      //Toast.makeText(getActivity(),"onPageScrolled "+position,Toast.LENGTH_LONG).show();
   }

   @Override
   public void onPageSelected(int position) {

      //  Intent i11 =new Intent(MainActivity.this,One.class);
      //  startActivity(i11);
      Log.d("TAG", "onPageSelected");
     // Toast.makeText(getActivity(),"onPageSelected",Toast.LENGTH_LONG).show();
      Log.d("###onPageSelected, pos ", String.valueOf(position));
      for (int i = 0; i < dotsCount; i++) {
         dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditem));
      }

      dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selecteditemdot));

      if (position + 1 == dotsCount) {

      } else {

      }
   }

   @Override
   public void onPageScrollStateChanged(int state) {
      Log.d("TAG", "onPageScrollStateChanged");
     // Toast.makeText(getActivity(),"onPageScrollStateChanged "+state ,Toast.LENGTH_LONG).show();

   }
}
