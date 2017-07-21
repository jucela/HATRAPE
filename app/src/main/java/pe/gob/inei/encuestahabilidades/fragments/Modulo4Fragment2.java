package pe.gob.inei.encuestahabilidades.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo4Fragment2 extends Fragment {

    private RadioGroup mod4_p4_rgb;
    private RadioGroup mod4_p5_rgb;
    private RadioGroup mod4_p6_rgb;
    private RadioGroup mod4_p7_rgb;



    public Modulo4Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_modulo4_fragment2, container, false);
        mod4_p4_rgb  = (RadioGroup) rootView.findViewById(R.id.mod4_p4_rgb);
        mod4_p5_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p5_rgb);
        mod4_p6_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p6_rgb);
        mod4_p7_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p7_rgb);
        return rootView;
        // Inflate the layout for this fragment


        };



    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mod4_p4_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //lytespecifiqueOrg.setVisibility(View.GONE);
                switch (i) {
                    case R.id.mod4_p4_rgb1:break;
                    case R.id.mod4_p4_rgb2:break;
                    case R.id.mod4_p4_rgb3:break;
                    case R.id.mod4_p4_rgb4:break;
                    case R.id.mod4_p4_rgb5:break;
                }
                mod4_p4_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p6_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p7_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p5_rgb.requestFocus();
                mod4_p5_rgb.setBackgroundColor(Color.CYAN);


        };

        });

        mod4_p5_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //lytespecifiqueOrg.setVisibility(View.GONE);
                switch (i) {
                    case R.id.mod4_p5_rgb1:break;
                    case R.id.mod4_p5_rgb2:break;
                    case R.id.mod4_p5_rgb3:break;
                    case R.id.mod4_p5_rgb4:break;
                    case R.id.mod4_p5_rgb5:break;
                }
                mod4_p4_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p5_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p7_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p6_rgb.requestFocus();
                mod4_p6_rgb.setBackgroundColor(Color.CYAN);


            };

        });

        mod4_p6_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //lytespecifiqueOrg.setVisibility(View.GONE);
                switch (i) {
                    case R.id.mod4_p6_rgb1:break;
                    case R.id.mod4_p6_rgb2:break;
                    case R.id.mod4_p6_rgb3:break;
                    case R.id.mod4_p6_rgb4:break;
                    case R.id.mod4_p6_rgb5:break;
                }
                mod4_p4_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p5_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p6_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p7_rgb.requestFocus();
                mod4_p7_rgb.setBackgroundColor(Color.CYAN);


            };

        });

        mod4_p7_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //lytespecifiqueOrg.setVisibility(View.GONE);
                switch (i) {
                    case R.id.mod4_p7_rgb1:break;
                    case R.id.mod4_p7_rgb2:break;
                    case R.id.mod4_p7_rgb3:break;
                    case R.id.mod4_p7_rgb4:break;
                    case R.id.mod4_p7_rgb5:break;
                }
                mod4_p4_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p5_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p6_rgb.setBackgroundColor(Color.TRANSPARENT);



            };

        });





}
    }