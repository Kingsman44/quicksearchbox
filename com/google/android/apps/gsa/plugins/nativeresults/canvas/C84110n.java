package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.n */
/* compiled from: PG */
public final /* synthetic */ class C84110n implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87680ah f229036a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f229037b;

    /* renamed from: c */
    public final /* synthetic */ C84112p f229038c;

    public /* synthetic */ C84110n(C87680ah ahVar, C22871g gVar, C84112p pVar) {
        this.f229036a = ahVar;
        this.f229037b = gVar;
        this.f229038c = pVar;
    }

    public final void run() {
        C87680ah ahVar = this.f229036a;
        C22871g gVar = this.f229037b;
        C84111o oVar = new C84111o(this.f229038c);
        C88244um[] umVarArr = {C88244um.CANVAS_WORKER_BINDER_RESPONSE};
        C58838bb.m90883r(C84070ag.m133982a());
        ahVar.mo81959a(new C84069af(gVar, ahVar, umVarArr, oVar), umVarArr);
        ahVar.mo81961c(new C88489j(C87739bu.CANVAS_WORKER_BINDER_REQUEST).mo82013a());
    }
}
