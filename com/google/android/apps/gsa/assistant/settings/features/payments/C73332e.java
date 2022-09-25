package com.google.android.apps.gsa.assistant.settings.features.payments;

import android.view.View;
import android.widget.RadioButton;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.assistant.p3861at.C50397vo;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.payments.e */
/* compiled from: PG */
public final /* synthetic */ class C73332e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ h f194232a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f194233b;

    /* renamed from: c */
    public final /* synthetic */ C50397vo f194234c;

    public /* synthetic */ C73332e(h hVar, RadioButton radioButton, C50397vo voVar) {
        this.f194232a = hVar;
        this.f194233b = radioButton;
        this.f194234c = voVar;
    }

    public final void onClick(View view) {
        h hVar = this.f194232a;
        RadioButton radioButton = this.f194233b;
        C50397vo voVar = this.f194234c;
        hVar.e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        hVar.a(radioButton, voVar);
    }
}
