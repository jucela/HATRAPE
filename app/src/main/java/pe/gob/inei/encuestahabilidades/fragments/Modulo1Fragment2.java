package pe.gob.inei.encuestahabilidades.fragments;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment2 extends Fragment {

    private LinearLayout lytPregunta5;
    private RadioGroup rgP5;

    private LinearLayout lytPregunta6;
    private AutoCompleteTextView autoCompleteTextView;

    private LinearLayout lytPregunta7;
    private RadioGroup rg1P7;
    private RadioGroup rg2P7;
    private RadioGroup rgP7Sp1;
    private RadioGroup rgP7Sp2;
    private LinearLayout lytP7Sp1;
    private LinearLayout lytP7Sp2;



    public Modulo1Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo1_fragment2, container, false);
        lytPregunta5 = (LinearLayout) rootView.findViewById(R.id.mod1_p5_lytPregunta5);
        rgP5 = (RadioGroup) rootView.findViewById(R.id.mod1_p5_rg);

        lytPregunta6 = (LinearLayout) rootView.findViewById(R.id.mod1_p6_lytPregunta6);
        autoCompleteTextView = (AutoCompleteTextView) rootView.findViewById(R.id.mod1_p6_autotxtPaises);

        lytPregunta7 = (LinearLayout) rootView.findViewById(R.id.mod1_p7_lytPregunta7);
        rg1P7 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rg1);
        rg2P7 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rg2);
        rgP7Sp1 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rgSp1);
        rgP7Sp2 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rgSp2);
        lytP7Sp1 = (LinearLayout) rootView.findViewById(R.id.mod1_p7_lytSp1);
        lytP7Sp2 = (LinearLayout) rootView.findViewById(R.id.mod1_p7_lytSp2);

        lytPregunta5.requestFocus();
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rgP5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case 0:break;
                    case 1:break;
                }
                autoCompleteTextView.requestFocus();
                mostrarTeclado();
            }
        });

        String[] paises = getResources().getStringArray(R.array.paises);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(),R.layout.lista_item,R.id.item,paises);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ocultarTeclado();
                lytPregunta7.requestFocus();
            }
        });

        rg1P7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p7_rg1_rbSi:
                        lytP7Sp1.setVisibility(View.VISIBLE);
                        break;
                    case R.id.mod1_p7_rg1_rbNo:
                        rgP7Sp1.clearCheck();
                        lytP7Sp1.setVisibility(View.GONE);
                        break;
                }
            }
        });
        rg2P7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p7_rg2_rbSi:
                        lytP7Sp2.setVisibility(View.VISIBLE);
                        break;
                    case R.id.mod1_p7_rg2_rbNo:
                        rgP7Sp2.clearCheck();
                        lytP7Sp2.setVisibility(View.GONE);
                        break;
                }
            }
        });

    }

    public void ocultarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        if (imm.isAcceptingText()) {
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        }

    }

    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }
}
