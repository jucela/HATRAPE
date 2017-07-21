package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.res.ResourcesCompat;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment1 extends Fragment {

    private LinearLayout lytFragment;

    private CheckBox ckMismoInformante;
    private EditText edtNombYApellidos;
    private EditText edtEspecifiqueCargo;

    private EditText edtActividadPrimaria;
    private EditText edtCIUPrimaria;
    private CheckBox ckNoSecundaria2;
    private EditText edtActividadSecundaria1;
    private EditText edtCIUSecundaria1;
    private EditText edtActividadSecundaria2;
    private EditText edtCIUSecundaria2;
    private Spinner spCargo;
    private LinearLayout lytFondoSpinner;
    private LinearLayout lytActividadSec2;

    private LinearLayout lytPregunta3;
    private RadioGroup rgOrgEmpresa;
    private LinearLayout lytespecifiqueOrg;
    private EditText edtEspecifiqueOrg;

    private LinearLayout lytPregunta4;
    private RadioGroup rgSP41;
    private RadioGroup rgSP42;



    public Modulo1Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_modulo1_fragment1, container, false);

        lytFragment = (LinearLayout) rootView.findViewById(R.id.mod1_layoutFragment1);

        ckMismoInformante = (CheckBox) rootView.findViewById(R.id.mod1_cab_ckMismoInformante);
        edtNombYApellidos = (EditText)rootView.findViewById(R.id.mod1_cab_edtApeYNom);
        spCargo = (Spinner) rootView.findViewById(R.id.mod1_cab_spCargo);
        edtEspecifiqueCargo = (EditText) rootView.findViewById(R.id.mod1_cab_edtEspecifiqueCargo);
        lytFondoSpinner = (LinearLayout) rootView.findViewById(R.id.mod1_cab_lytFondoSpinner);

        edtActividadPrimaria = (EditText)rootView.findViewById(R.id.mod1_p1_edtActividadPrimaria);
        edtCIUPrimaria = (EditText) rootView.findViewById(R.id.mod1_p1_edtCIUPrimaria);
        edtActividadSecundaria1 = (EditText)rootView.findViewById(R.id.mod1_p2_edtActividadSecundaria1);
        edtCIUSecundaria1 = (EditText)rootView.findViewById(R.id.mod1_p2_edtCIUSecundaria1);
        ckNoSecundaria2 = (CheckBox) rootView.findViewById(R.id.mod1_p2_ckNoActividadSec2);
        edtActividadSecundaria2 = (EditText)rootView.findViewById(R.id.mod1_p2_edtActividadSecundaria2);
        edtCIUSecundaria2 = (EditText)rootView.findViewById(R.id.mod1_p2_edtCIUSecundaria2);
        lytActividadSec2 = (LinearLayout) rootView.findViewById(R.id.mod1_p2_lytActividadSecundaria2);

        lytPregunta3 = (LinearLayout) rootView.findViewById(R.id.mod1_p3_lytPregunta3);
        rgOrgEmpresa = (RadioGroup) rootView.findViewById(R.id.mod1_p3_rgOrgEmpresa);
        lytespecifiqueOrg = (LinearLayout) rootView.findViewById(R.id.mod1_p3_lytEspecifiqueOrg);
        edtEspecifiqueOrg = (EditText) rootView.findViewById(R.id.mod1_p3_edtEspecifiqueOrg);

        lytPregunta4 = (LinearLayout) rootView.findViewById(R.id.mod1_p4_lytSubpreguntas);
        rgSP41 = (RadioGroup) rootView.findViewById(R.id.mod1_p4_rg41);
        rgSP42 = (RadioGroup) rootView.findViewById(R.id.mod1_p4_rg42);
        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText[] cajasDeTexto = {edtNombYApellidos, edtEspecifiqueOrg, edtActividadPrimaria, edtCIUPrimaria, edtActividadSecundaria1,
        edtActividadSecundaria2,edtCIUSecundaria1,edtCIUSecundaria2, edtEspecifiqueOrg};
        RadioGroup[] radioGroups = {rgOrgEmpresa,rgSP41,rgSP42};

        for (int i = 0; i < cajasDeTexto.length; i++) {
            final EditText editText = cajasDeTexto[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                        mostrarTeclado();
                    }
                    else if(view.isEnabled()){
                        editText.setBackgroundResource(R.drawable.cajas_de_texto);
                    }
                }
            });
        }

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
        lytFragment.requestFocus();
        ckMismoInformante.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    lytFondoSpinner.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    spCargo.setEnabled(false);
                    edtNombYApellidos.setText("JULIO LAVADO");
                    spCargo.setSelection(1);
                    edtNombYApellidos.setEnabled(false);
                    edtActividadPrimaria.requestFocus();
                }else{
                    edtNombYApellidos.setText("");
                    spCargo.setSelection(0);
                    edtNombYApellidos.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtNombYApellidos.setEnabled(true);
                    lytFondoSpinner.setBackgroundResource(R.drawable.cajas_de_texto);
                    spCargo.setEnabled(true);
                    edtNombYApellidos.requestFocus();
                }
            }
        });
        edtNombYApellidos.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytFondoSpinner);
                    lytFondoSpinner.requestFocus();
                    return true;
                }
                return false;
            }
        });

        lytFondoSpinner.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    lytFondoSpinner.setBackgroundResource(R.drawable.caja_texto_enabled);
                    ocultarTeclado(lytFondoSpinner);
                }
                else if(view.isEnabled()){
                    lytFondoSpinner.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        edtEspecifiqueCargo.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        spCargo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo.setVisibility(View.VISIBLE);
                        break;
                }
                if(pos == 4) edtEspecifiqueCargo.requestFocus();
                else if (pos > 0 && pos <4)edtActividadPrimaria.requestFocus();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        edtActividadPrimaria.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtCIUPrimaria.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtActividadSecundaria1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtCIUSecundaria1.setTransformationMethod(new NumericKeyBoardTransformationMethod());

        edtCIUSecundaria1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    if(ckNoSecundaria2.isChecked()){
                        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                        rgOrgEmpresa.requestFocus();
                    }
                    return true;
                }
                return false;
            }
        });
        ckNoSecundaria2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checkeado) {
                if(checkeado) {
                    lytActividadSec2.setVisibility(View.GONE);
                    rgOrgEmpresa.requestFocus();
                } else {
                    lytActividadSec2.setVisibility(View.VISIBLE);
                    edtActividadSecundaria2.setText("");
                    edtCIUSecundaria2.setText("");
                    edtActividadSecundaria2.requestFocus();
                }
            }
        });
        edtActividadSecundaria2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtCIUSecundaria2.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtCIUSecundaria2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    rgOrgEmpresa.requestFocus();
                    return true;
                }
                return false;
            }
        });

        rgOrgEmpresa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                lytespecifiqueOrg.setVisibility(View.GONE);
                switch (i){
                    case R.id.mod1_p3_rb1: break;
                    case R.id.mod1_p3_rb2: break;
                    case R.id.mod1_p3_rb3: break;
                    case R.id.mod1_p3_rb4: break;
                    case R.id.mod1_p3_rb5: break;
                    case R.id.mod1_p3_rb6: break;
                    case R.id.mod1_p3_rb7:
                        lytespecifiqueOrg.setVisibility(View.VISIBLE);
                        edtEspecifiqueOrg.requestFocus();
                        break;
                }
                if(i != R.id.mod1_p3_rb7){
                    rgSP41.requestFocus();
                }
            }
        });
        edtEspecifiqueOrg.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueOrg.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    rgSP41.requestFocus();
                    return true;
                }
                return false;
            }
        });

        rgSP41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                rgSP42.requestFocus();
                switch(i){
                    case R.id.mod1_p4_sp1_rb1:break;
                    case R.id.mod1_p4_sp1_rb2:break;
                    case R.id.mod1_p4_sp1_rb3:break;
                }
            }
        });

        rgSP42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch(i){
                    case R.id.mod1_p4_sp2_rb1:break;
                    case R.id.mod1_p4_sp2_rb2:break;
                }
            }
        });
    }

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
