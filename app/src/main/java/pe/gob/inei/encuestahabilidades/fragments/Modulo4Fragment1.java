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
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo4Fragment1 extends Fragment {

    //Declarar variables

    private LinearLayout lytFragment;
    private CheckBox ckMismoInformante;
    private EditText edtNombYApellidos;
    private EditText edtEspecifiqueCargo;
    private Spinner spCargo;
    private LinearLayout lytFondoSpinner;
    private RadioGroup mod4_p1_rgb;
    private RadioGroup mod4_p2_rgb;
    private RadioGroup mod4_p3_rgb;
    private RadioGroup mod4_p4_rgb;
    private LinearLayout lytPregunta1;
    private LinearLayout lytPregunta2;
    private LinearLayout lytPregunta3;
    private LinearLayout lytPregunta4;







    public Modulo4Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo4_fragment1, container, false);
        lytFragment = (LinearLayout) rootView.findViewById(R.id.mod4_layoutFragment1);
        //Amarrar variables con 'id' de XML
        ckMismoInformante = (CheckBox) rootView.findViewById(R.id.mod4_cab_ckMismoInformante);
        edtNombYApellidos = (EditText)rootView.findViewById(R.id.mod4_cab_edtApeYNom);
        spCargo = (Spinner) rootView.findViewById(R.id.mod4_cab_spCargo);
        edtEspecifiqueCargo = (EditText) rootView.findViewById(R.id.mod4_cab_edtEspecifiqueCargo);
        lytFondoSpinner = (LinearLayout) rootView.findViewById(R.id.mod4_cab_lytFondoSpinner);
        mod4_p1_rgb  = (RadioGroup) rootView.findViewById(R.id.mod4_p1_rgb);
        mod4_p2_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p2_rgb);
        mod4_p3_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p3_rgb);
        mod4_p4_rgb = (RadioGroup) rootView.findViewById(R.id.mod4_p4_rgb);
        lytPregunta1 = (LinearLayout) rootView.findViewById(R.id.mod4_p1_ly);
        lytPregunta2 = (LinearLayout) rootView.findViewById(R.id.mod4_p2_ly);
        lytPregunta3 = (LinearLayout) rootView.findViewById(R.id.mod4_p3_ly);
        lytPregunta4 = (LinearLayout) rootView.findViewById(R.id.mod4_p4_ly);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
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
                    mod4_p1_rgb.requestFocus();
                    mod4_p1_rgb.setBackgroundResource(R.drawable.cajas_de_texto);
                    mod4_p1_rgb.setBackgroundColor(Color.CYAN);

                }else{
                    edtNombYApellidos.setText("");
                    spCargo.setSelection(0);
                    edtNombYApellidos.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtNombYApellidos.setEnabled(true);
                    lytFondoSpinner.setBackgroundResource(R.drawable.cajas_de_texto);
                    spCargo.setEnabled(true);
                    edtNombYApellidos.requestFocus();
                    mod4_p1_rgb.setBackgroundColor(Color.TRANSPARENT);

                }
            }
        });
        edtNombYApellidos.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    lytFondoSpinner.requestFocus();
                    lytFondoSpinner.setBackgroundColor(Color.CYAN);
                    //mod4_p1_rgb.requestFocus();
                   // mod4_p1_rgb.setBackgroundColor(Color.CYAN);
                    //ocultarTeclado();
                    return true;
                }
                return false;
            }
        });

        spCargo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo.setVisibility(View.GONE);
                switch (pos){
                    case 0:
                        break;
                    case 1:

                        mod4_p1_rgb.requestFocus();
                        mod4_p1_rgb.setBackgroundColor(Color.CYAN);
                        break;
                    case 2:
                        mod4_p1_rgb.requestFocus();
                        mod4_p1_rgb.setBackgroundColor(Color.CYAN);
                        break;
                    case 3:
                        mod4_p1_rgb.requestFocus();
                        mod4_p1_rgb.setBackgroundColor(Color.CYAN);
                        break;
                    case 4:

                        edtEspecifiqueCargo.setVisibility(View.VISIBLE);
                        break;
                }
                if(pos == 4)
                    edtEspecifiqueCargo.requestFocus();

                else if (pos > 0 && pos <4)
                    mod4_p1_rgb.requestFocus();
                    //mod4_p1_rgb.setBackgroundColor(Color.CYAN);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        mod4_p1_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //lytespecifiqueOrg.setVisibility(View.GONE);
                switch (i){
                    case R.id.mod4_p1_rgb1:break;
                    case R.id.mod4_p1_rgb2:break;
                    case R.id.mod4_p1_rgb3:break;
                    case R.id.mod4_p1_rgb4:break;
                    case R.id.mod4_p1_rgb5:break;
                    //case R.id.mod1_p3_rb7:
                        //lytespecifiqueOrg.setVisibility(View.VISIBLE);
                        //edtEspecifiqueOrg.requestFocus();
                       // break;
                }
                mod4_p1_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p3_rgb.setBackgroundColor(Color.TRANSPARENT);
                mod4_p2_rgb.requestFocus();
                mod4_p2_rgb.setBackgroundColor(Color.CYAN);

                //if(i !=R.id.mod4_p1_rgb2)
                //{   lytPregunta2.requestFocus();
                 //   lytPregunta2.setBackgroundColor(Color.CYAN);
               // }
                //else{}
            }
        });

        mod4_p2_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                switch (i){
                    case R.id.mod4_p2_rgb1:break;
                    case R.id.mod4_p2_rgb2:break;
                    case R.id.mod4_p2_rgb3:break;
                    case R.id.mod4_p2_rgb4:break;
                    case R.id.mod4_p2_rgb5:break;

                }
                        mod4_p2_rgb.setBackgroundColor(Color.TRANSPARENT);
                        mod4_p3_rgb.requestFocus();
                        mod4_p3_rgb.setBackgroundColor(Color.CYAN);

            }
        });

        mod4_p3_rgb .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                switch (i){
                    case R.id.mod4_p3_rgb1:break;
                    case R.id.mod4_p3_rgb2:break;
                    case R.id.mod4_p3_rgb3:break;
                    case R.id.mod4_p3_rgb4:break;
                    case R.id.mod4_p3_rgb5:break;

                }
                mod4_p3_rgb.setBackgroundColor(Color.TRANSPARENT);

            }
        });



    }
    public void ocultarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        if (imm.isAcceptingText()) {
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        }

    }

}
