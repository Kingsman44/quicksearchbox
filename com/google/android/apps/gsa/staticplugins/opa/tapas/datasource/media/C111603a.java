package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media;

import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a.C111625o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a.C111626p;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a */
/* compiled from: PG */
public final /* synthetic */ class C111603a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113405ep f310346a;

    public /* synthetic */ C111603a(C113405ep epVar) {
        this.f310346a = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C113405ep epVar = this.f310346a;
        C111626p pVar = (C111626p) obj;
        int i = TapasMediaSource.f310338d;
        C58838bb.m90884s(pVar.f310386d, "#connect not yet called since initialization or last disconnect");
        epVar.mo100033p();
        return pVar.f310385c.mo28210j(pVar.mo99196c(), "fetch suggestions from connected media browser", new C111625o(pVar, epVar));
    }
}
