package com.example.usuario.inteco01;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BusquedaFragment extends Fragment {

    public static final String EXTRA_TEXT = "EXTRA_TEXT";
    private static String msg;



    public static Fragment newInstace(String s) {
        BusquedaFragment b = new BusquedaFragment();
        Bundle bdl = new Bundle(1);
        bdl.putString(EXTRA_TEXT, msg);
        b.setArguments(bdl);
        return b;
    }
    public BusquedaFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        if (getArguments() !=null ){
            msg = getArguments().getString(EXTRA_TEXT, "");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_busqueda, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        final TextView messageTextView = (TextView) view.findViewById(R.id.msg_txt);
        messageTextView.setText(msg);

    }

}
