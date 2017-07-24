package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RadioGroup;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo8Fragment9 extends Fragment {
    //VARIABLES PREGUNTA 9
    private RadioGroup mod8_p9_rgb1;
    private RadioGroup mod8_p9_rgb2;
    private RadioGroup mod8_p9_rgb3;
    private RadioGroup mod8_p9_rgb4;
    private RadioGroup mod8_p9_rgb5;
    private RadioGroup mod8_p9_rgb6;


    public Modulo8Fragment9() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo8_fragment9, container, false);
        //AMARRE DE VARIABLES DE modulo8_pregunta9.xml
        mod8_p9_rgb1 = (RadioGroup) rootView.findViewById(R.id.mod8_p9_rgb1);
        mod8_p9_rgb2 = (RadioGroup) rootView.findViewById(R.id.mod8_p9_rgb2);
        mod8_p9_rgb3 = (RadioGroup) rootView.findViewById(R.id.mod8_p9_rgb3);
        mod8_p9_rgb4 = (RadioGroup) rootView.findViewById(R.id.mod8_p9_rgb4);
        mod8_p9_rgb5 = (RadioGroup) rootView.findViewById(R.id.mod8_p9_rgb5);
        mod8_p9_rgb6 = (RadioGroup) rootView.findViewById(R.id.mod8_p9_rgb6);
        return  rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //PREGUNTA 9
        RadioGroup[] radioGroups = {
                mod8_p9_rgb1,mod8_p9_rgb2,mod8_p9_rgb3,
                mod8_p9_rgb4,mod8_p9_rgb5,mod8_p9_rgb6
        };
        for (int i = 0; i < radioGroups.length; i++) {
            final RadioGroup radioGroup = radioGroups[i];
            radioGroup.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        ocultarTeclado(radioGroup);
                        radioGroup.setBackgroundColor(Color.CYAN);
                    }
                    else if(view.isEnabled()){
                        radioGroup.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            });
        }
        //PREGUNTA 9.1
        mod8_p9_rgb1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p9_rb1_1:
                        break;
                    case R.id.mod8_p9_rb1_2:
                        break;
                    case R.id.mod8_p9_rb1_3:
                        break;
                    case R.id.mod8_p9_rb1_4:
                        break;


                }
                mod8_p9_rgb2.requestFocus();
            }
        });

        //PREGUNTA 9.2
        mod8_p9_rgb2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p9_rb2_1:
                        break;
                    case R.id.mod8_p9_rb2_2:
                        break;
                    case R.id.mod8_p9_rb2_3:
                        break;
                    case R.id.mod8_p9_rb2_4:
                        break;


                }
                mod8_p9_rgb3.requestFocus();
            }
        });
        //PREGUNTA 9.3
        mod8_p9_rgb3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p9_rb3_1:
                        break;
                    case R.id.mod8_p9_rb3_2:
                        break;
                    case R.id.mod8_p9_rb3_3:
                        break;
                    case R.id.mod8_p9_rb3_4:
                        break;

                }
                mod8_p9_rgb4.requestFocus();
            }
        });
        //PREGUNTA 9.4
        mod8_p9_rgb4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p9_rb4_1:
                        break;
                    case R.id.mod8_p9_rb4_2:
                        break;
                    case R.id.mod8_p9_rb4_3:
                        break;
                    case R.id.mod8_p9_rb4_4:
                        break;


                }
                mod8_p9_rgb5.requestFocus();
            }
        });
        //PREGUNTA 9.5
        mod8_p9_rgb5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p9_rb5_1:
                        break;
                    case R.id.mod8_p9_rb5_2:
                        break;
                    case R.id.mod8_p9_rb5_3:
                        break;
                    case R.id.mod8_p9_rb5_4:
                        break;


                }
                mod8_p9_rgb6.requestFocus();
            }
        });





    }

    //METODOS
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        if (!imm.isAcceptingText()) {
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        }
    }

}
