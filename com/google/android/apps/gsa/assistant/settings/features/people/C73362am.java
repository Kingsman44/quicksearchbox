package com.google.android.apps.gsa.assistant.settings.features.people;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.assistant.p3861at.ahj;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.am */
/* compiled from: PG */
public final /* synthetic */ class C73362am implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ba f194293a;

    /* renamed from: b */
    public final /* synthetic */ Button f194294b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f194295c;

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f194296d;

    public /* synthetic */ C73362am(ba baVar, Button button, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f194293a = baVar;
        this.f194294b = button;
        this.f194295c = viewGroup;
        this.f194296d = viewGroup2;
    }

    public final void onClick(View view) {
        ba baVar = this.f194293a;
        Button button = this.f194294b;
        ViewGroup viewGroup = this.f194295c;
        ViewGroup viewGroup2 = this.f194296d;
        ds dsVar = baVar.m;
        dsVar.d = dsVar.e;
        button.setVisibility(8);
        viewGroup.setVisibility(0);
        viewGroup2.setVisibility(8);
        ahj ahj = baVar.C;
        if (ahj != null) {
            db dbVar = baVar.J;
            dbVar.copyOnWrite();
            dl dlVar = dbVar.instance;
            dl dlVar2 = dl.M;
            dlVar.o = ahj;
            dlVar.a |= 128;
        }
    }
}
