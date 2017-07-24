package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment12 extends Fragment {

    private LinearLayout mod7_layoutfragment12;
    private LinearLayout mod7_p28_lyt;

    private CheckBox mod7_p28_ck1;
    private CheckBox mod7_p28_ck2;
    private CheckBox mod7_p28_ck3;
    private CheckBox mod7_p28_ck4;
    private CheckBox mod7_p28_ck5;

    private EditText mod7_p28_edt4;

    public Modulo7Fragment12() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment12, container, false);
        mod7_layoutfragment12 = (LinearLayout) rootView.findViewById(R.id.mod7_layoutfragment12);

        mod7_p28_lyt = (LinearLayout) rootView.findViewById(R.id.mod7_p28_lyt);
        mod7_p28_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck1);
        mod7_p28_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck2);
        mod7_p28_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck3);
        mod7_p28_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck4);
        mod7_p28_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p28_ck5);

        mod7_p28_edt4 = (EditText) rootView.findViewById(R.id.mod7_p28_edt4);
        
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mod7_layoutfragment12.requestFocus();

        mod7_p28_edt4.setVisibility(View.GONE);
        mod7_p28_edt4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    mod7_p28_edt4.setBackgroundResource(R.drawable.caja_texto_enabled);
                    mostrarTeclado();
                }
                else if(view.isEnabled()){
                    mod7_p28_edt4.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });

        mod7_p28_ck4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p28_edt4.setVisibility(View.VISIBLE);
                    mod7_p28_edt4.requestFocus();
                } else {
                    mod7_p28_edt4.setText("");
                    mod7_p28_edt4.setVisibility(View.GONE);
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
