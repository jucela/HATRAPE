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
import android.widget.EditText;
import android.widget.RadioGroup;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment2 extends Fragment {
    //VARIABLES
    private RadioGroup mod7_p5_rgb;
    private EditText   mod7_p6_edt1;
    private EditText   mod7_p6_edt2;
    private RadioGroup mod7_p7_rgb;
    private EditText   mod7_p7_edt;


    public Modulo7Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment2, container, false);
        mod7_p5_rgb  = (RadioGroup) rootView.findViewById(R.id.mod7_p5_rgb);
        mod7_p6_edt1 = (EditText)rootView.findViewById(R.id.mod7_p6_edt1);
        mod7_p6_edt2 = (EditText)rootView.findViewById(R.id.mod7_p6_edt2);
        mod7_p7_rgb  = (RadioGroup) rootView.findViewById(R.id.mod7_p7_rgb);
        mod7_p7_edt = (EditText)rootView.findViewById(R.id.mod7_p7_edt);
        return  rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RadioGroup[] radioGroups = {
                mod7_p5_rgb,mod7_p7_rgb
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
        //PREGUNTA 5
        mod7_p5_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p5_rb1:
                        break;
                    case R.id.mod7_p5_rb2:
                        break;
                    case R.id.mod7_p5_rb3:
                        break;
                    case R.id.mod7_p5_rb4:
                        break;
                    case R.id.mod7_p5_rb5:
                        break;

                }
                mod7_p6_edt1.requestFocus();
                mod7_p6_edt1.setBackgroundResource(R.drawable.caja_texto_enabled);
            }
        });
        //PREGUNTA 7
        mod7_p7_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p7_rb1:
                        mod7_p7_edt.setVisibility(View.GONE);
                        break;
                    case R.id.mod7_p7_rb2:
                        mod7_p7_edt.setVisibility(View.GONE);
                        break;
                    case R.id.mod7_p7_rb3:
                        mod7_p7_edt.setVisibility(View.GONE);
                        break;
                    case R.id.mod7_p7_rb4:
                        mod7_p7_edt.setVisibility(View.GONE);
                        break;
                    case R.id.mod7_p7_rb5:
                        mod7_p7_edt.setVisibility(View.VISIBLE);
                        mod7_p7_edt.requestFocus();
                        mod7_p7_edt.setBackgroundResource(R.drawable.caja_texto_enabled);
                        break;

                }
                //mod7_p6_edt1.requestFocus();
                //mod7_p6_edt1.setBackgroundResource(R.drawable.caja_texto_enabled);
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
