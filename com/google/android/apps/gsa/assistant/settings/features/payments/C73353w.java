package com.google.android.apps.gsa.assistant.settings.features.payments;

import android.view.View;
import android.widget.RadioButton;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.assistant.p3861at.C50411wb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.payments.w */
/* compiled from: PG */
public final /* synthetic */ class C73353w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ab f194275a;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f194276b;

    /* renamed from: c */
    public final /* synthetic */ C50411wb f194277c;

    public /* synthetic */ C73353w(ab abVar, RadioButton radioButton, C50411wb wbVar) {
        this.f194275a = abVar;
        this.f194276b = radioButton;
        this.f194277c = wbVar;
    }

    public final void onClick(View view) {
        ab abVar = this.f194275a;
        RadioButton radioButton = this.f194276b;
        C50411wb wbVar = this.f194277c;
        abVar.g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        abVar.a(radioButton, wbVar);
    }
}
