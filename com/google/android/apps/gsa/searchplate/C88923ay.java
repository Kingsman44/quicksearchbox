package com.google.android.apps.gsa.searchplate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87638l;
import com.google.android.apps.gsa.shared.util.p7187ui.ClosedCallbackSpinner;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.searchplate.ay */
/* compiled from: PG */
public final class C88923ay extends ArrayAdapter {

    /* renamed from: a */
    public final List f240878a = new ArrayList();

    /* renamed from: b */
    public final List f240879b = new ArrayList();

    /* renamed from: c */
    public final Context f240880c;

    /* renamed from: d */
    public final List f240881d = new ArrayList();

    /* renamed from: e */
    public ClosedCallbackSpinner f240882e;

    /* renamed from: f */
    public boolean f240883f = false;

    /* renamed from: g */
    public boolean f240884g = false;

    /* renamed from: h */
    public boolean f240885h = false;

    /* renamed from: i */
    public String f240886i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public boolean f240887j = false;

    /* renamed from: k */
    public int f240888k = -1;

    /* renamed from: l */
    public boolean f240889l = false;

    /* renamed from: m */
    C88922ax f240890m;

    /* renamed from: n */
    public C87638l f240891n;

    /* renamed from: o */
    private final LayoutInflater f240892o;

    /* renamed from: p */
    private List f240893p = new ArrayList();

    public C88923ay(Context context) {
        super(context, 0, C58485gu.m89845m());
        this.f240880c = context;
        this.f240892o = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final int mo82796a(String str) {
        return this.f240881d.indexOf(str);
    }

    /* renamed from: b */
    public final String getItem(int i) {
        return (String) this.f240893p.get(i);
    }

    /* renamed from: c */
    public final String mo82798c() {
        if (this.f240882e.getSelectedItemPosition() >= this.f240881d.size()) {
            return (this.f240882e.getSelectedItemPosition() != this.f240881d.size() || !this.f240884g) ? this.f240886i : this.f240880c.getResources().getString(R.string.language_switcher_auto_option);
        }
        return (String) this.f240881d.get(this.f240882e.getSelectedItemPosition());
    }

    /* renamed from: d */
    public final void mo82799d(String str, List list) {
        this.f240886i = str;
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        treeSet.addAll(list);
        this.f240881d.clear();
        this.f240881d.addAll(treeSet);
        this.f240893p.clear();
        List list2 = (List) Collection.EL.stream(this.f240881d).map(new C88915aq(this, (Map) Collection.EL.stream(this.f240881d).collect(Collectors.groupingBy(C88914ap.f240867a, Collectors.counting())))).collect(Collectors.toList());
        this.f240893p = list2;
        if (this.f240884g) {
            list2.add(this.f240880c.getResources().getString(R.string.language_switcher_auto_option));
        }
        if (this.f240887j) {
            this.f240893p.add(this.f240880c.getResources().getString(R.string.settings_entrypoint));
            int i = this.f240888k;
            if (i >= 0 && i != mo82796a(str)) {
                this.f240889l = true;
                this.f240888k = -1;
            }
        }
        notifyDataSetChanged();
        if (this.f240885h) {
            this.f240882e.setSelection(this.f240881d.size(), false);
        } else if (mo82796a(str) != this.f240882e.getSelectedItemPosition()) {
            this.f240882e.setSelection(mo82796a(str), false);
        }
    }

    public final int getCount() {
        return this.f240893p.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View view2;
        int size = this.f240881d.size() - 1;
        if (this.f240884g) {
            size++;
        }
        if (!this.f240887j || i != size + 1) {
            view2 = this.f240892o.inflate(R.layout.spinner_dropdown_item, viewGroup, false);
            RadioButton radioButton = (RadioButton) view2.findViewById(R.id.dropdown_radio);
            if ((i == this.f240882e.getSelectedItemPosition() && !radioButton.isChecked()) || (i != this.f240882e.getSelectedItemPosition() && radioButton.isChecked())) {
                radioButton.setChecked(true);
            }
            radioButton.setText(getItem(i));
        } else {
            view2 = this.f240892o.inflate(R.layout.spinner_settings_item, viewGroup, false);
            view2.setOnClickListener(new C88918at(this));
        }
        view2.addOnLayoutChangeListener(new C88917as(this));
        if (i == 0) {
            view2.setPadding(view2.getPaddingLeft(), this.f240880c.getResources().getDimensionPixelSize(R.dimen.switcher_dropdown_top_bottom_padding), view2.getPaddingRight(), view2.getPaddingBottom());
        } else if ((i == getCount() - 2 && this.f240887j) || (i == getCount() - 1 && !this.f240887j)) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), this.f240880c.getResources().getDimensionPixelSize(R.dimen.switcher_dropdown_top_bottom_padding));
        }
        return view2;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f240892o.inflate(R.layout.spinner_main_item, viewGroup, false);
        }
        int selectedItemPosition = this.f240882e.getSelectedItemPosition();
        ((TextView) view.findViewById(R.id.spinner_display_text)).setText(getItem(selectedItemPosition));
        view.setContentDescription(this.f240880c.getString(R.string.switcher_language_description, new Object[]{getItem(selectedItemPosition)}));
        return view;
    }
}
