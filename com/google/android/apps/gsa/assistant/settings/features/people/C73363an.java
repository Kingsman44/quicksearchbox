package com.google.android.apps.gsa.assistant.settings.features.people;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.assistant.p3861at.ahj;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.an */
/* compiled from: PG */
public final /* synthetic */ class C73363an implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ba f194297a;

    /* renamed from: b */
    public final /* synthetic */ Button f194298b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f194299c;

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f194300d;

    public /* synthetic */ C73363an(ba baVar, Button button, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f194297a = baVar;
        this.f194298b = button;
        this.f194299c = viewGroup;
        this.f194300d = viewGroup2;
    }

    public final void onClick(View view) {
        ba baVar = this.f194297a;
        Button button = this.f194298b;
        ViewGroup viewGroup = this.f194299c;
        ViewGroup viewGroup2 = this.f194300d;
        ds dsVar = baVar.m;
        dsVar.d = dsVar.f;
        button.setVisibility(8);
        viewGroup.setVisibility(8);
        viewGroup2.setVisibility(0);
        ahj ahj = baVar.D;
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
