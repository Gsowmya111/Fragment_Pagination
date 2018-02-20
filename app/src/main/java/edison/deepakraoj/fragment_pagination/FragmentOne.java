package edison.deepakraoj.fragment_pagination;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentOne extends Fragment {
   @Override
   public View onCreateView(LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
      
       //Inflate the layout for this fragment


       
   /*   return inflater.inflate(
    		  R.layout.fragment_one, container, false);*/

       View view = inflater.inflate(R.layout.fragment_switch_board_1,
               container, false);

       return view;

   }
}
