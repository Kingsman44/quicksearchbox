package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.assistant.p3897e.p3921j.C52236kg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.e */
/* compiled from: PG */
public final /* synthetic */ class C107562e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C107571n f299219a;

    /* renamed from: b */
    public final /* synthetic */ C107572o f299220b;

    /* renamed from: c */
    public final /* synthetic */ int f299221c;

    public /* synthetic */ C107562e(C107571n nVar, C107572o oVar, int i) {
        this.f299219a = nVar;
        this.f299220b = oVar;
        this.f299221c = i;
    }

    public final void onClick(View view) {
        C107571n nVar = this.f299219a;
        C107572o oVar = this.f299220b;
        int i = this.f299221c;
        nVar.f299272c.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        nVar.f299272c.mo96219b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
        nVar.mo96032i(oVar.mo96033g(), 1, (C52236kg) null, i);
    }
}
