package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment11 extends Fragment {

    private LinearLayout mod7_layoutfragment11;
    private LinearLayout mod7_p26_lyt;

    private CheckBox mod7_p26_ck1;
    private CheckBox mod7_p26_ck2;
    private CheckBox mod7_p26_ck3;
    private CheckBox mod7_p26_ck4;
    private CheckBox mod7_p26_ck5;
    private CheckBox mod7_p26_ck6;
    private CheckBox mod7_p26_ck7;
    private CheckBox mod7_p26_ck8;
    private CheckBox mod7_p26_ck9;
    private CheckBox mod7_p26_ck10;
    private CheckBox mod7_p26_ck11;
    private CheckBox mod7_p26_ck12;
    private CheckBox mod7_p26_ck13;
    private CheckBox mod7_p26_ck14;
    private CheckBox mod7_p26_ck15;
    private CheckBox mod7_p26_ck16;
    private CheckBox mod7_p26_ck17;
    private CheckBox mod7_p26_ck18;
    private CheckBox mod7_p26_ck19;
    private CheckBox mod7_p26_ck20;
    private CheckBox mod7_p26_ck21;
    private CheckBox mod7_p26_ck22;
    
    private EditText mod7_p26_edt21;

    public Modulo7Fragment11() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment11, container, false);
        mod7_layoutfragment11 = (LinearLayout) rootView.findViewById(R.id.mod7_layoutfragment11);

        mod7_p26_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p26_lyt);
        mod7_p26_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck1);
        mod7_p26_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck2);
        mod7_p26_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck3);
        mod7_p26_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck4);
        mod7_p26_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck5);
        mod7_p26_ck6 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck6);
        mod7_p26_ck7 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck7);
        mod7_p26_ck8 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck8);
        mod7_p26_ck9 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck9);
        mod7_p26_ck10 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck10);
        mod7_p26_ck11 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck11);
        mod7_p26_ck12 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck12);
        mod7_p26_ck13 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck13);
        mod7_p26_ck14 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck14);
        mod7_p26_ck15 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck15);
        mod7_p26_ck16 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck16);
        mod7_p26_ck17 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck17);
        mod7_p26_ck18 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck18);
        mod7_p26_ck19 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck19);
        mod7_p26_ck20 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck20);
        mod7_p26_ck21 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck21);
        mod7_p26_ck22 = (CheckBox) rootView.findViewById(R.id.mod7_p26_ck22);

        mod7_p26_edt21 = (EditText) rootView.findViewById(R.id.mod7_p26_edt21);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mod7_layoutfragment11.requestFocus();

        mod7_p26_edt21.setVisibility(View.GONE);
        mod7_p26_edt21.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    mod7_p26_edt21.setBackgroundResource(R.drawable.caja_texto_enabled);
                    mostrarTeclado();
                }
                else if(view.isEnabled()){
                    mod7_p26_edt21.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });

        mod7_p26_ck21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p26_edt21.setVisibility(View.VISIBLE);
                    mod7_p26_edt21.requestFocus();
                } else {
                    mod7_p26_edt21.setText("");
                    mod7_p26_edt21.setVisibility(View.GONE);
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
