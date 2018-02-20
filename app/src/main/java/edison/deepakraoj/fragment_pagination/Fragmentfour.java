package edison.deepakraoj.fragment_pagination;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Deepak Rao J on 6/19/2017.
 */

public class Fragmentfour extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        /*return inflater.inflate(
                R.layout.fragmentfour, container, false);*/
        View view = inflater.inflate(R.layout.fragmentfour,
                container, false);
        Button button = (Button) view.findViewById(R.id.b44);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                Toast.makeText(getActivity(),"frag 4",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
