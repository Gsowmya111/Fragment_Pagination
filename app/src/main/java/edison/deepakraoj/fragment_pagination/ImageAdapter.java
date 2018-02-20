package edison.deepakraoj.fragment_pagination;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    ImageView imageView;

    public Integer[] images={R.drawable.switch1,R.drawable.rgb,R.drawable.dimmer,R.drawable.pir,R.drawable.geyser,R.drawable.projctr,R.drawable.doorlock,
            R.drawable.fm,R.drawable.sprinkler, R.drawable.dog,R.drawable.curtain, R.drawable.cam,R.drawable.bell,R.drawable.ac

    };

    public ImageAdapter(Context c)
    {
        context=c;
    }

    @Override
    public int getCount() {

        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

  //  @Override
    /*public View getView(int position, View convertView, ViewGroup parent) {





        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
       *//* imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));*//*
        return imageView;
    }*/

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(context);
            grid = inflater.inflate(R.layout.single_grid_item, null);
         //   TextView textView = (TextView) grid.findViewById(R.id.grid_text);
           imageView = (ImageView)grid.findViewById(R.id.grid_image);
           // textView.setText(images[position]);
            imageView.setImageResource(images[position]);
        } else {
            grid = (View) convertView;
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fr = null;
               if( position==0){

                   fr = new FragmentOne();
                /*  Bundle bundle = new Bundle();
                    bundle.putString("Id", "1");
                  fr.setArguments(bundle);
                */   FragmentManager fragmentManager =  ((Activity) context).getFragmentManager();
                   fragmentManager.beginTransaction()
                           .replace(R.id.fragment_place, fr).addToBackStack(null).commit();

               }
                if( position==1){

                    fr = new FragmentTwo();
                 FragmentManager fragmentManager =  ((Activity) context).getFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_place, fr).addToBackStack(null).commit();

                }
            }
        });


        return grid;
    }
}
