package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import android.support.p033v7.widget.C0516an;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.k */
/* compiled from: PG */
public final /* synthetic */ class C130651k implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0516an f357794a;

    /* renamed from: b */
    public final /* synthetic */ TextView f357795b;

    /* renamed from: c */
    public final /* synthetic */ Spinner f357796c;

    public /* synthetic */ C130651k(C0516an anVar, TextView textView, Spinner spinner) {
        this.f357794a = anVar;
        this.f357795b = textView;
        this.f357796c = spinner;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C0516an anVar = this.f357794a;
        TextView textView = this.f357795b;
        Spinner spinner = this.f357796c;
        int i2 = i == anVar.getId() ? 0 : 8;
        textView.setVisibility(i2);
        spinner.setVisibility(i2);
    }
}
