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
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment4 extends Fragment {

    private CheckBox mod7_p9_ck1;
    private CheckBox mod7_p9_ck2;
    private CheckBox mod7_p9_ck3;
    private CheckBox mod7_p9_ck4;
    private CheckBox mod7_p9_ck5;
    private CheckBox mod7_p9_ck6;
    private CheckBox mod7_p9_ck7;
    private CheckBox mod7_p9_ck8;
    private CheckBox mod7_p9_ck9;
    private CheckBox mod7_p9_ck10;
    private CheckBox mod7_p9_ck11;
    private CheckBox mod7_p9_ck12;
    private CheckBox mod7_p9_ck13;
    private CheckBox mod7_p9_ck14;
    private CheckBox mod7_p9_ck15;
    private CheckBox mod7_p9_ck16;
    private CheckBox mod7_p9_ck17;
    private CheckBox mod7_p9_ck18;
    private CheckBox mod7_p9_ck19;
    private CheckBox mod7_p9_ck20;

    private LinearLayout mod7_p9_ly1;
    private LinearLayout mod7_p9_ly2;
    private LinearLayout mod7_p9_ly3;
    private LinearLayout mod7_p9_ly4;
    private LinearLayout mod7_p9_ly5;
    private LinearLayout mod7_p9_ly6;
    private LinearLayout mod7_p9_ly7;
    private LinearLayout mod7_p9_ly8;
    private LinearLayout mod7_p9_ly9;
    private LinearLayout mod7_p9_ly10;
    private LinearLayout mod7_p9_ly11;
    private LinearLayout mod7_p9_ly12;
    private LinearLayout mod7_p9_ly13;
    private LinearLayout mod7_p9_ly14;
    private LinearLayout mod7_p9_ly15;
    private LinearLayout mod7_p9_ly16;
    private LinearLayout mod7_p9_ly17;
    private LinearLayout mod7_p9_ly18;
    private LinearLayout mod7_p9_ly19;


    private Spinner mod7_p9_sp1;
    private Spinner mod7_p9_sp2;
    private Spinner mod7_p9_sp3;
    private Spinner mod7_p9_sp4;
    private Spinner mod7_p9_sp5;
    private Spinner mod7_p9_sp6;
    private Spinner mod7_p9_sp7;
    private Spinner mod7_p9_sp8;
    private Spinner mod7_p9_sp9;
    private Spinner mod7_p9_sp10;
    private Spinner mod7_p9_sp11;
    private Spinner mod7_p9_sp12;
    private Spinner mod7_p9_sp13;
    private Spinner mod7_p9_sp14;
    private Spinner mod7_p9_sp15;
    private Spinner mod7_p9_sp16;
    private Spinner mod7_p9_sp17;
    private Spinner mod7_p9_sp18;
    private Spinner mod7_p9_sp19;


    private EditText mod7_p9_edt19;


    public Modulo7Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment4, container, false);
        mod7_p9_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck1);
        mod7_p9_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck2);
        mod7_p9_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck3);
        mod7_p9_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck4);
        mod7_p9_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck5);
        mod7_p9_ck6 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck6);
        mod7_p9_ck7 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck7);
        mod7_p9_ck8 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck8);
        mod7_p9_ck9 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck9);
        mod7_p9_ck10 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck10);
        mod7_p9_ck11 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck11);
        mod7_p9_ck12 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck12);
        mod7_p9_ck13 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck13);
        mod7_p9_ck14 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck14);
        mod7_p9_ck15 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck15);
        mod7_p9_ck16 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck16);
        mod7_p9_ck17 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck17);
        mod7_p9_ck18 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck18);
        mod7_p9_ck19 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck19);
        mod7_p9_ck20 = (CheckBox) rootView.findViewById(R.id.mod7_p9_ck20);

        mod7_p9_ly1 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly1);
        mod7_p9_ly2 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly2);
        mod7_p9_ly3 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly3);
        mod7_p9_ly4 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly4);
        mod7_p9_ly5 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly5);
        mod7_p9_ly6 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly6);
        mod7_p9_ly7 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly7);
        mod7_p9_ly8 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly8);
        mod7_p9_ly9 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly9);
        mod7_p9_ly10 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly10);
        mod7_p9_ly11 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly11);
        mod7_p9_ly12 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly12);
        mod7_p9_ly13 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly13);
        mod7_p9_ly14 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly14);
        mod7_p9_ly15 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly15);
        mod7_p9_ly16 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly16);
        mod7_p9_ly17 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly17);
        mod7_p9_ly18 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly18);
        mod7_p9_ly19 = (LinearLayout) rootView.findViewById(R.id.mod7_p9_ly19);


        mod7_p9_sp1 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp1);
        mod7_p9_sp2 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp2);
        mod7_p9_sp3 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp3);
        mod7_p9_sp4 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp4);
        mod7_p9_sp5 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp5);
        mod7_p9_sp6 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp6);
        mod7_p9_sp7 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp7);
        mod7_p9_sp8 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp8);
        mod7_p9_sp9 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp9);
        mod7_p9_sp10 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp10);
        mod7_p9_sp11 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp11);
        mod7_p9_sp12 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp12);
        mod7_p9_sp13 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp13);
        mod7_p9_sp14 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp14);
        mod7_p9_sp15 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp15);
        mod7_p9_sp16 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp16);
        mod7_p9_sp17 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp17);
        mod7_p9_sp18 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp18);
        mod7_p9_sp19 = (Spinner) rootView.findViewById(R.id.mod7_p9_sp19);


        mod7_p9_edt19 = (EditText) rootView.findViewById(R.id.mod7_p9_edt19);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mod7_p9_ck1.requestFocus();
        //9.1
        mod7_p9_ly1.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly1.setEnabled(false);
        mod7_p9_sp1.setEnabled(false);
        mod7_p9_ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly1.setEnabled(true);
                    mod7_p9_sp1.setEnabled(true);
                    mod7_p9_sp1.setSelection(0);
                    mod7_p9_ly1.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly1.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly1.setEnabled(false);
                    mod7_p9_sp1.setEnabled(false);
                    mod7_p9_sp1.setSelection(0);

                }
            }
        });
        //9.2
        mod7_p9_ly2.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly2.setEnabled(false);
        mod7_p9_sp2.setEnabled(false);
        mod7_p9_ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly2.setEnabled(true);
                    mod7_p9_sp2.setEnabled(true);
                    mod7_p9_sp2.setSelection(0);
                    mod7_p9_ly2.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly2.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly2.setEnabled(false);
                    mod7_p9_sp2.setEnabled(false);
                    mod7_p9_sp2.setSelection(0);

                }
            }
        });
        //9.3
        mod7_p9_ly3.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly3.setEnabled(false);
        mod7_p9_sp3.setEnabled(false);
        mod7_p9_ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly3.setEnabled(true);
                    mod7_p9_sp3.setEnabled(true);
                    mod7_p9_sp3.setSelection(0);
                    mod7_p9_ly3.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly3.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly3.setEnabled(false);
                    mod7_p9_sp3.setEnabled(false);
                    mod7_p9_sp3.setSelection(0);

                }
            }
        });
        //9.4
        mod7_p9_ly4.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly4.setEnabled(false);
        mod7_p9_sp4.setEnabled(false);
        mod7_p9_ck4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly4.setEnabled(true);
                    mod7_p9_sp4.setEnabled(true);
                    mod7_p9_sp4.setSelection(0);
                    mod7_p9_ly4.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly4.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly4.setEnabled(false);
                    mod7_p9_sp4.setEnabled(false);
                    mod7_p9_sp4.setSelection(0);

                }
            }
        });
        //9.5
        mod7_p9_ly5.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly5.setEnabled(false);
        mod7_p9_sp5.setEnabled(false);
        mod7_p9_ck5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly5.setEnabled(true);
                    mod7_p9_sp5.setEnabled(true);
                    mod7_p9_sp5.setSelection(0);
                    mod7_p9_ly5.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly5.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly5.setEnabled(false);
                    mod7_p9_sp5.setEnabled(false);
                    mod7_p9_sp5.setSelection(0);

                }
            }
        });
        //9.6
        mod7_p9_ly6.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly6.setEnabled(false);
        mod7_p9_sp6.setEnabled(false);
        mod7_p9_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly6.setEnabled(true);
                    mod7_p9_sp6.setEnabled(true);
                    mod7_p9_sp6.setSelection(0);
                    mod7_p9_ly6.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly6.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly6.setEnabled(false);
                    mod7_p9_sp6.setEnabled(false);
                    mod7_p9_sp6.setSelection(0);

                }
            }
        });
        //9.7
        mod7_p9_ly7.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly7.setEnabled(false);
        mod7_p9_sp7.setEnabled(false);
        mod7_p9_ck7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly7.setEnabled(true);
                    mod7_p9_sp7.setEnabled(true);
                    mod7_p9_sp7.setSelection(0);
                    mod7_p9_ly7.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly7.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly7.setEnabled(false);
                    mod7_p9_sp7.setEnabled(false);
                    mod7_p9_sp7.setSelection(0);

                }
            }
        });
        //9.8
        mod7_p9_ly8.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly8.setEnabled(false);
        mod7_p9_sp8.setEnabled(false);
        mod7_p9_ck8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly8.setEnabled(true);
                    mod7_p9_sp8.setEnabled(true);
                    mod7_p9_sp8.setSelection(0);
                    mod7_p9_ly8.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly8.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly8.setEnabled(false);
                    mod7_p9_sp8.setEnabled(false);
                    mod7_p9_sp8.setSelection(0);

                }
            }
        });
        //9.9
        mod7_p9_ly9.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly9.setEnabled(false);
        mod7_p9_sp9.setEnabled(false);
        mod7_p9_ck9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly9.setEnabled(true);
                    mod7_p9_sp9.setEnabled(true);
                    mod7_p9_sp9.setSelection(0);
                    mod7_p9_ly9.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly9.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly9.setEnabled(false);
                    mod7_p9_sp9.setEnabled(false);
                    mod7_p9_sp9.setSelection(0);

                }
            }
        });
        //9.10
        mod7_p9_ly10.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly10.setEnabled(false);
        mod7_p9_sp10.setEnabled(false);
        mod7_p9_ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly10.setEnabled(true);
                    mod7_p9_sp10.setEnabled(true);
                    mod7_p9_sp10.setSelection(0);
                    mod7_p9_ly10.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly10.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly10.setEnabled(false);
                    mod7_p9_sp10.setEnabled(false);
                    mod7_p9_sp10.setSelection(0);

                }
            }
        });
        //9.11
        mod7_p9_ly11.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly11.setEnabled(false);
        mod7_p9_sp11.setEnabled(false);
        mod7_p9_ck11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly11.setEnabled(true);
                    mod7_p9_sp11.setEnabled(true);
                    mod7_p9_sp11.setSelection(0);
                    mod7_p9_ly11.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly11.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly11.setEnabled(false);
                    mod7_p9_sp11.setEnabled(false);
                    mod7_p9_sp11.setSelection(0);

                }
            }
        });
        //9.12
        mod7_p9_ly12.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly12.setEnabled(false);
        mod7_p9_sp12.setEnabled(false);
        mod7_p9_ck12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly12.setEnabled(true);
                    mod7_p9_sp12.setEnabled(true);
                    mod7_p9_sp12.setSelection(0);
                    mod7_p9_ly12.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly12.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly12.setEnabled(false);
                    mod7_p9_sp12.setEnabled(false);
                    mod7_p9_sp12.setSelection(0);

                }
            }
        });
        //9.13
        mod7_p9_ly13.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly13.setEnabled(false);
        mod7_p9_sp13.setEnabled(false);
        mod7_p9_ck13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly13.setEnabled(true);
                    mod7_p9_sp13.setEnabled(true);
                    mod7_p9_sp13.setSelection(0);
                    mod7_p9_ly13.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly13.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly13.setEnabled(false);
                    mod7_p9_sp13.setEnabled(false);
                    mod7_p9_sp13.setSelection(0);

                }
            }
        });
        //9.14
        mod7_p9_ly14.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly14.setEnabled(false);
        mod7_p9_sp14.setEnabled(false);
        mod7_p9_ck14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly14.setEnabled(true);
                    mod7_p9_sp14.setEnabled(true);
                    mod7_p9_sp14.setSelection(0);
                    mod7_p9_ly14.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly14.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly14.setEnabled(false);
                    mod7_p9_sp14.setEnabled(false);
                    mod7_p9_sp14.setSelection(0);

                }
            }
        });
        //9.15
        mod7_p9_ly15.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly15.setEnabled(false);
        mod7_p9_sp15.setEnabled(false);
        mod7_p9_ck15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly15.setEnabled(true);
                    mod7_p9_sp15.setEnabled(true);
                    mod7_p9_sp15.setSelection(0);
                    mod7_p9_ly15.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly15.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly15.setEnabled(false);
                    mod7_p9_sp15.setEnabled(false);
                    mod7_p9_sp15.setSelection(0);

                }
            }
        });
        //9.16
        mod7_p9_ly16.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly16.setEnabled(false);
        mod7_p9_sp16.setEnabled(false);
        mod7_p9_ck16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly16.setEnabled(true);
                    mod7_p9_sp16.setEnabled(true);
                    mod7_p9_sp16.setSelection(0);
                    mod7_p9_ly16.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly16.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly16.setEnabled(false);
                    mod7_p9_sp16.setEnabled(false);
                    mod7_p9_sp16.setSelection(0);

                }
            }
        });
        //9.17
        mod7_p9_ly17.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly17.setEnabled(false);
        mod7_p9_sp17.setEnabled(false);
        mod7_p9_ck17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly17.setEnabled(true);
                    mod7_p9_sp17.setEnabled(true);
                    mod7_p9_sp17.setSelection(0);
                    mod7_p9_ly17.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly17.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly17.setEnabled(false);
                    mod7_p9_sp17.setEnabled(false);
                    mod7_p9_sp17.setSelection(0);

                }
            }
        });
        //9.8
        mod7_p9_ly18.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly18.setEnabled(false);
        mod7_p9_sp18.setEnabled(false);
        mod7_p9_ck18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_ly18.setEnabled(true);
                    mod7_p9_sp18.setEnabled(true);
                    mod7_p9_sp18.setSelection(0);
                    mod7_p9_ly18.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_ly18.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly18.setEnabled(false);
                    mod7_p9_sp18.setEnabled(false);
                    mod7_p9_sp18.setSelection(0);

                }
            }
        });
        //9.19
        mod7_p9_ly19.setBackgroundResource(R.drawable.spinner_disabled);
        mod7_p9_ly19.setEnabled(false);
        mod7_p9_sp19.setEnabled(false);
        mod7_p9_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p9_edt19.setVisibility(View.VISIBLE);
                    mod7_p9_edt19.setBackgroundResource(R.drawable.spinner_enabled);
                    mod7_p9_ly19.setEnabled(true);
                    mod7_p9_sp19.setEnabled(true);
                    mod7_p9_sp19.setSelection(0);
                    mod7_p9_ly19.setBackgroundResource(R.drawable.spinner_enabled);

                } else {
                    mod7_p9_edt19.setVisibility(View.GONE);
                    mod7_p9_edt19.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly19.setBackgroundResource(R.drawable.spinner_disabled);
                    mod7_p9_ly19.setEnabled(false);
                    mod7_p9_sp19.setEnabled(false);
                    mod7_p9_sp19.setSelection(0);

                }
            }
        });
        //9.20

        final CheckBox[] listacheck ={
                mod7_p9_ck1,mod7_p9_ck2,mod7_p9_ck3,mod7_p9_ck4,mod7_p9_ck5,
                mod7_p9_ck6,mod7_p9_ck7,mod7_p9_ck8,mod7_p9_ck9,mod7_p9_ck10,
                mod7_p9_ck11,mod7_p9_ck12,mod7_p9_ck13,mod7_p9_ck14,mod7_p9_ck15,
                mod7_p9_ck16,mod7_p9_ck17,mod7_p9_ck18,mod7_p9_ck19
        };

        mod7_p9_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck.length; i++) {
                        final CheckBox checkBox = listacheck[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck.length; i++) {
                        final CheckBox checkBox = listacheck[i];
                        checkBox.setEnabled(true);


                    }
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
