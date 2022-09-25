package com.google.android.apps.gsa.assistant.settings.features.people;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.assistant.p3861at.ahj;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.al */
/* compiled from: PG */
public final /* synthetic */ class C73361al implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ba f194289a;

    /* renamed from: b */
    public final /* synthetic */ Button f194290b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f194291c;

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f194292d;

    public /* synthetic */ C73361al(ba baVar, Button button, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f194289a = baVar;
        this.f194290b = button;
        this.f194291c = viewGroup;
        this.f194292d = viewGroup2;
    }

    public final void onClick(View view) {
        ba baVar = this.f194289a;
        Button button = this.f194290b;
        ViewGroup viewGroup = this.f194291c;
        ViewGroup viewGroup2 = this.f194292d;
        baVar.m.d = null;
        button.setVisibility(0);
        viewGroup.setVisibility(8);
        viewGroup2.setVisibility(8);
        if (baVar.B == null) {
            db dbVar = baVar.J;
            dbVar.copyOnWrite();
            dl dlVar = dbVar.instance;
            dl dlVar2 = dl.M;
            dlVar.o = null;
            dlVar.a &= -129;
            return;
        }
        db dbVar2 = baVar.J;
        ahj ahj = ahj.f129309e;
        dbVar2.copyOnWrite();
        dl dlVar3 = dbVar2.instance;
        dl dlVar4 = dl.M;
        ahj.getClass();
        dlVar3.o = ahj;
        dlVar3.a |= 128;
    }
}
