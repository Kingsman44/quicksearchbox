package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import android.support.p033v7.widget.C0516an;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.l */
/* compiled from: PG */
public final /* synthetic */ class C130652l implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0516an f357797a;

    /* renamed from: b */
    public final /* synthetic */ TextView f357798b;

    /* renamed from: c */
    public final /* synthetic */ Spinner f357799c;

    public /* synthetic */ C130652l(C0516an anVar, TextView textView, Spinner spinner) {
        this.f357797a = anVar;
        this.f357798b = textView;
        this.f357799c = spinner;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C0516an anVar = this.f357797a;
        TextView textView = this.f357798b;
        Spinner spinner = this.f357799c;
        int i2 = i == anVar.getId() ? 0 : 8;
        textView.setVisibility(i2);
        spinner.setVisibility(i2);
    }
}
