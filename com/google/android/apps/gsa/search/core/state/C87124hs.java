package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7186u.C91101a;

/* renamed from: com.google.android.apps.gsa.search.core.state.hs */
/* compiled from: PG */
public final /* synthetic */ class C87124hs implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87126hu f235388a;

    /* renamed from: b */
    public final /* synthetic */ Query f235389b;

    public /* synthetic */ C87124hs(C87126hu huVar, Query query) {
        this.f235388a = huVar;
        this.f235389b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87126hu huVar = this.f235388a;
        Query query = this.f235389b;
        if (!((Boolean) obj).booleanValue()) {
            huVar.f235398h = true;
        } else if (query.mo84392cY() && query.mo84339bX()) {
            if (C91101a.m148849a(((C86812ai) huVar.f235392b.mo27525b()).f234471a)) {
                huVar.f235394d.mo78426g();
                return;
            }
            C87052fn fnVar = (C87052fn) huVar.f235393c.mo27525b();
            fnVar.f235175k = true;
            fnVar.mo80699U(false);
            fnVar.f235175k = false;
            fnVar.mo80591ar();
        }
    }
}
