package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment2 extends Fragment {

    private LinearLayout lytPregunta5;
    private RadioGroup rgP5;

    private LinearLayout lytPregunta6;
    private AutoCompleteTextView autoCompleteTextView;
    private TextView txtPaisSeleccionado;

    private LinearLayout lytPregunta7;
    private RadioGroup rg1P7;
    private RadioGroup rg2P7;
    private RadioGroup rgP7Sp1;
    private RadioGroup rgP7Sp2;
    private LinearLayout lytP7Sp1;
    private LinearLayout lytP7Sp2;


    private RadioGroup rgP8;


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
        txtPaisSeleccionado = (TextView) rootView.findViewById(R.id.mod1_p6_txtPaisSeleccionado);

        lytPregunta7 = (LinearLayout) rootView.findViewById(R.id.mod1_p7_lytPregunta7);
        rg1P7 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rg1);
        rg2P7 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rg2);
        rgP7Sp1 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rgSp1);
        rgP7Sp2 = (RadioGroup) rootView.findViewById(R.id.mod1_p7_rgSp2);
        lytP7Sp1 = (LinearLayout) rootView.findViewById(R.id.mod1_p7_lytSp1);
        lytP7Sp2 = (LinearLayout) rootView.findViewById(R.id.mod1_p7_lytSp2);

        rgP8 = (RadioGroup) rootView.findViewById(R.id.mod1_p8_rg);


        lytPregunta5.requestFocus();
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RadioGroup[] radioGroups = {rgP5,rg1P7,rg2P7,rgP7Sp1,rgP7Sp2, rgP8};

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
        autoCompleteTextView.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        autoCompleteTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    autoCompleteTextView.setBackgroundResource(R.drawable.caja_texto_enabled);
                }
                else if(view.isEnabled()){
                    autoCompleteTextView.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                txtPaisSeleccionado.setText(autoCompleteTextView.getText().toString().toUpperCase());
                rg1P7.requestFocus();
            }
        });

        rg1P7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p7_rg1_rbSi:
                        lytP7Sp1.setVisibility(View.VISIBLE);
                        rgP7Sp1.requestFocus();
                        break;
                    case R.id.mod1_p7_rg1_rbNo:
                        rgP7Sp1.clearCheck();
                        lytP7Sp1.setVisibility(View.GONE);
                        rg2P7.requestFocus();
                        break;
                }
            }
        });
        rgP7Sp1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p7_rgSp1_rbSi:
                        break;
                    case R.id.mod1_p7_rgSp1_rbNo:
                        break;
                }
                rg2P7.requestFocus();
            }
        });
        rg2P7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p7_rg2_rbSi:
                        lytP7Sp2.setVisibility(View.VISIBLE);
                        rgP7Sp2.requestFocus();
                        break;
                    case R.id.mod1_p7_rg2_rbNo:
                        rgP7Sp2.clearCheck();
                        lytP7Sp2.setVisibility(View.GONE);
                        rgP8.requestFocus();
                        break;
                }
            }
        });
        rgP7Sp2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p7_rgSp2_rbSi:
                        break;
                    case R.id.mod1_p7_rgSp2_rbNo:
                        break;
                }
                rgP8.requestFocus();
            }
        });

    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }
}
