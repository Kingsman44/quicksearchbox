package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107781g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.C107839n;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.s */
/* compiled from: PG */
public final class C107822s implements C107839n {

    /* renamed from: a */
    private final C68214a f300047a;

    public C107822s(C68214a aVar) {
        this.f300047a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final void mo96297b(C107504e eVar, C58833ax axVar, C107944s sVar) {
        C107502c a = C107502c.m178394a(eVar.f299118b);
        if (a == null) {
            a = C107502c.UNDEFINED;
        }
        if (a == C107502c.OPA_UI_READY_FOR_NGA) {
            C107781g gVar = (C107781g) this.f300047a.mo27525b();
            if (gVar.f299914d.mo56113h()) {
                gVar.mo96282a((SearchError) gVar.f299914d.mo56107c());
            }
        }
    }
}
