package edison.deepakraoj.fragment_pagination;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    ListView list;
    String name;

    String[] web = {
            "BEDROOM",
            "CONFERENCE",
            "RECEPTION",
            "DINNING ROOM",
            "ENTRANCE",
            "LIVING ROOM",
            "KITCHEN",
            "PLAY ROOM",
            "STUDY ROOM",

    };
    Integer[] imageId = {
            R.drawable.tbedroom01,
            R.drawable.tconference01,
            R.drawable.treception01,
            R.drawable.tdiningroom01,
            R.drawable.tentrance01,
            R.drawable.tlivingroom01,
            R.drawable.tkitchen01,
            R.drawable.tplayroom01,
            R.drawable.tstudyroom01,


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combined_frag);

         CustomList adapter = new
                CustomList(MainActivity.this, web, imageId);
        list = (ListView) findViewById(R.id.lv_edit);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();
                if("entrance".equals(web[position]))
                {
                  /* *//**//* Intent i=new Intent(MainActivity.this,Entranse.class);
                    startActivity(i);
                    finish();*//**//**/
                }

               switch (position){

               }


            }
        });








        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

       /* gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fr = null;
                switch(position){
                    case 0:

                        Toast.makeText(MainActivity.this, "Position"+position, Toast.LENGTH_SHORT).show();

                         name = new String("Fragment1");
                       *//* fr = new FragmentTwo();
                        FragmentManager fm = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fm.beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_place, fr);

                        fragmentTransaction.commit();
                        // Get tracker.
                        *//*//*
                                break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Position"+position, Toast.LENGTH_SHORT).show();
                        fr = new Fragmentthree();
                        FragmentManager fm1 = getFragmentManager();
                        FragmentTransaction fragmentTransaction1 = fm1.beginTransaction();
                        fragmentTransaction1.replace(R.id.fragment_place, fr);

                        fragmentTransaction1.commit();





                }

            }
        });*/








    }

    @Override
    protected void onResume() {
        super.onResume();
     //   Log.i(TAG, "Setting screen name: " + name);

    }
  /*  public void selectFrag(View view) {
        Fragment fr = null;

        if(view == findViewById(R.id.b1)) {
            fr = new FragmentOne();

        }else if(view == findViewById(R.id.b2))
        {
            fr = new FragmentTwo();
        }
        else if(view == findViewById(R.id.b3))
        {
            fr = new Fragmentthree();
        }
        else if(view == findViewById(R.id.b4))
        {
            fr = new Fragmentfour();
        }

        FragmentManager fm = getFragmentManager();

        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);

        fragmentTransaction.commit();

    }*/
   /* @Override
    public void onClick(View v) {

        switch1 (v.getId())
        {
            case R.id.b1:

                fr = new Fragment1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_place, fr);
                fragmentTransaction.commit();
                break;
            case R.id.b2:

                fr = new Fragment2();
                FragmentManager fm1 = getFragmentManager();
                FragmentTransaction fragmentTransaction1 = fm1.beginTransaction();
                fragmentTransaction1.replace(R.id.fragment_place, fr);
                fragmentTransaction1.commit();

                break;
            case R.id.b3:

                break;
            case R.id.b4:

                break;
        }

    }*/
}
