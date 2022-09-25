package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d;

import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107703n;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107707r;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107708s;
import com.google.android.libraries.gsa.p1876k.C22869e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.d.p */
/* compiled from: PG */
public final /* synthetic */ class C106315p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106317r f296609a;

    public /* synthetic */ C106315p(C106317r rVar) {
        this.f296609a = rVar;
    }

    public final void run() {
        C106317r rVar = this.f296609a;
        for (C107707r rVar2 : ((C107703n) rVar.f296613c.mo27525b()).f299700e) {
            if (rVar2.mo96229b() == C107708s.OPA_ACTIVITY_SEARCH_SERVICE_CLIENT_USER && rVar2.mo96228a() == C107706q.STARTED) {
                rVar.mo95488b();
                return;
            }
        }
        ((C107703n) rVar.f296613c.mo27525b()).f299705j = Optional.m71637of(new C106311l(rVar));
    }
}
