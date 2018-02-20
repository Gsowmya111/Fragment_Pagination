package edison.deepakraoj.fragment_pagination;

/**
 * Created by sowmyaram on 6/19/2017.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class CustomPagerAdapter extends PagerAdapter {
    private Context mContext;
    LayoutInflater mLayoutInflater;
   // private int[] mResources;

       int layoutes[]={R.layout.fragment_switch_board_1,R.layout.fragment_switch_board_12,R.layout.fragment_switch_board_2,R.layout.fragment_switch_board_2plus1,R.layout.fragment_switch_board_3,R.layout.fragment_switch_board_5plus1,R.layout.fragment_switch_board_8};


    public CustomPagerAdapter(Context context, int[] resources) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      layoutes=resources;
        //  mResources = resources;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Context context = null;
        mLayoutInflater=(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View one=mLayoutInflater.inflate(R.layout.fragment_switch_board_1,container,false);
        View two=mLayoutInflater.inflate(R.layout.fragment_switch_board_12,container,false);
        View thre=mLayoutInflater.inflate(R.layout.fragment_switch_board_2,container,false);
        View four=mLayoutInflater.inflate(R.layout.fragment_switch_board_2plus1,container,false);
        View five=mLayoutInflater.inflate(R.layout.fragment_switch_board_3,container,false);
        View six=mLayoutInflater.inflate(R.layout.fragment_switch_board_5plus1,container,false);
        View seve=mLayoutInflater.inflate(R.layout.fragment_switch_board_8,container,false);

        View viewarr[]={one,two,thre,four,five,six,seve};
        container.addView(viewarr[position]);
        return viewarr[position];

    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return layoutes.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}