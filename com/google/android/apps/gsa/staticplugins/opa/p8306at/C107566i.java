package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.assistant.p3897e.p3921j.C52236kg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.i */
/* compiled from: PG */
public final /* synthetic */ class C107566i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C107571n f299232a;

    /* renamed from: b */
    public final /* synthetic */ C107572o f299233b;

    /* renamed from: c */
    public final /* synthetic */ int f299234c;

    public /* synthetic */ C107566i(C107571n nVar, C107572o oVar, int i) {
        this.f299232a = nVar;
        this.f299233b = oVar;
        this.f299234c = i;
    }

    public final void onClick(View view) {
        C107571n nVar = this.f299232a;
        C107572o oVar = this.f299233b;
        int i = this.f299234c;
        nVar.f299272c.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        nVar.f299272c.mo96219b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
        nVar.mo96032i(oVar.mo96033g(), 5, (C52236kg) null, i);
        nVar.mo96028e(oVar, new C107561d(oVar.f299285c, oVar.f299286d, oVar.f299287e, oVar.f299290h));
    }
}
