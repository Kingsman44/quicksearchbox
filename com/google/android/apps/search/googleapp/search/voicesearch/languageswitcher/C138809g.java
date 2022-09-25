package com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher;

import android.content.Context;
import android.support.p033v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.g */
/* compiled from: PG */
public final class C138809g extends ArrayAdapter {

    /* renamed from: a */
    public final Context f377565a;

    /* renamed from: b */
    public final List f377566b = new ArrayList();

    /* renamed from: c */
    public final boolean f377567c;

    /* renamed from: d */
    public List f377568d = new ArrayList();

    /* renamed from: e */
    public AppCompatSpinner f377569e;

    /* renamed from: f */
    public boolean f377570f = false;

    /* renamed from: g */
    private final LayoutInflater f377571g;

    public C138809g(Context context, boolean z) {
        super(context, 0, C58485gu.m89845m());
        this.f377565a = context;
        this.f377571g = LayoutInflater.from(context);
        this.f377567c = z;
    }

    /* renamed from: a */
    public final int mo114539a(String str) {
        return this.f377566b.indexOf(str);
    }

    /* renamed from: b */
    public final String getItem(int i) {
        return (String) this.f377568d.get(i);
    }

    public final int getCount() {
        return this.f377568d.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f377571g.inflate(R.layout.googleapp_spinner_dropdown_item, viewGroup, false);
        RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.googleapp_dropdown_radio);
        if ((i == this.f377569e.getSelectedItemPosition() && !radioButton.isChecked()) || (i != this.f377569e.getSelectedItemPosition() && radioButton.isChecked())) {
            radioButton.setChecked(true);
        }
        radioButton.setText(getItem(i));
        inflate.addOnLayoutChangeListener(new C138808f(this));
        return inflate;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f377571g.inflate(R.layout.googleapp_spinner_main_item, viewGroup, false);
        }
        int selectedItemPosition = this.f377569e.getSelectedItemPosition();
        ((TextView) view.findViewById(R.id.googleapp_spinner_display_text)).setText(getItem(selectedItemPosition));
        view.setContentDescription(this.f377565a.getString(R.string.googleapp_switcher_language_description, new Object[]{getItem(selectedItemPosition)}));
        return view;
    }
}
