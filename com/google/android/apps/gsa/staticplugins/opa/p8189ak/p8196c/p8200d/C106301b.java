package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.d.b */
/* compiled from: PG */
public final /* synthetic */ class C106301b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106304e f296574a;

    /* renamed from: b */
    public final /* synthetic */ C106286n f296575b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f296576c;

    public /* synthetic */ C106301b(C106304e eVar, C106286n nVar, Bundle bundle) {
        this.f296574a = eVar;
        this.f296575b = nVar;
        this.f296576c = bundle;
    }

    public final void run() {
        C106304e eVar = this.f296574a;
        C106286n nVar = this.f296575b;
        Bundle bundle = this.f296576c;
        if (!((C107705p) eVar.f296580b.mo27525b()).mo96237j()) {
            ((C107705p) eVar.f296580b.mo27525b()).mo96230c();
            ((C107705p) eVar.f296580b.mo27525b()).mo96235h();
            ((C107705p) eVar.f296580b.mo27525b()).mo96233f(new C106302c(eVar), C88244um.OPA_SESSION_SERVICE_EVENT);
        }
        int i = eVar.f296582d;
        eVar.f296582d = i + 1;
        eVar.f296581c.add(Integer.valueOf(i));
        ((C107705p) eVar.f296580b.mo27525b()).mo96232e(C106304e.m177068a(nVar, bundle, i));
    }
}
