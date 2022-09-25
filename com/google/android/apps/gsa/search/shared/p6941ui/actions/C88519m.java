package com.google.android.apps.gsa.search.shared.p6941ui.actions;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.actions.m */
/* compiled from: PG */
public final class C88519m extends DialogFragment {

    /* renamed from: a */
    public NumberPicker f239236a;

    /* renamed from: b */
    public NumberPicker f239237b;

    /* renamed from: c */
    public NumberPicker f239238c;

    /* renamed from: d */
    public C88518l f239239d;

    /* renamed from: e */
    private int f239240e;

    /* renamed from: f */
    private int f239241f;

    /* renamed from: g */
    private int f239242g;

    /* renamed from: h */
    private TextView f239243h;

    public C88519m() {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.f239236a.setValue(bundle.getInt("hours"));
            this.f239237b.setValue(bundle.getInt("minutes"));
            this.f239238c.setValue(bundle.getInt("seconds"));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().requestFeature(1);
        View inflate = layoutInflater.inflate(R.layout.time_duration_picker_dialog, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.hour_picker);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.minute_picker);
        ViewGroup viewGroup4 = (ViewGroup) inflate.findViewById(R.id.second_picker);
        this.f239236a = (NumberPicker) viewGroup2.findViewById(R.id.number_picker);
        this.f239237b = (NumberPicker) viewGroup3.findViewById(R.id.number_picker);
        this.f239238c = (NumberPicker) viewGroup4.findViewById(R.id.number_picker);
        ((TextView) viewGroup2.findViewById(R.id.element_title)).setText(R.string.hours);
        ((TextView) viewGroup3.findViewById(R.id.element_title)).setText(R.string.minutes);
        ((TextView) viewGroup4.findViewById(R.id.element_title)).setText(R.string.seconds);
        this.f239243h = (TextView) inflate.findViewById(R.id.time_set_button);
        this.f239236a.setMinValue(0);
        this.f239236a.setMaxValue(23);
        this.f239236a.setValue(this.f239240e);
        this.f239237b.setMinValue(0);
        this.f239237b.setMaxValue(59);
        this.f239237b.setValue(this.f239241f);
        this.f239238c.setMinValue(0);
        this.f239238c.setMaxValue(59);
        this.f239238c.setValue(this.f239242g);
        this.f239243h.setOnClickListener(new C88517k(this));
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("hours", this.f239236a.getValue());
        bundle.putInt("minutes", this.f239237b.getValue());
        bundle.putInt("seconds", this.f239238c.getValue());
    }

    public C88519m(C88518l lVar, int i, int i2, int i3) {
        this.f239239d = lVar;
        this.f239240e = i;
        this.f239241f = i2;
        this.f239242g = i3;
    }
}
