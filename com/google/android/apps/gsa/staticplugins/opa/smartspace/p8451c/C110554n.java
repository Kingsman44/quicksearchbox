package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.shared.p7041h.C89778j;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.n */
/* compiled from: PG */
public final /* synthetic */ class C110554n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110559s f308211a;

    /* renamed from: b */
    public final /* synthetic */ C89778j f308212b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f308213c;

    public /* synthetic */ C110554n(C110559s sVar, C89778j jVar, SettableFuture settableFuture) {
        this.f308211a = sVar;
        this.f308212b = jVar;
        this.f308213c = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110559s sVar = this.f308211a;
        C89778j jVar = this.f308212b;
        SettableFuture settableFuture = this.f308213c;
        String str = (String) obj;
        ((C58970a) ((C58970a) sVar.f308227f.mo56224b()).mo56372aa(26549)).mo56387q("Successfully writing %s local calendar events to OpaStore.", jVar.f242998a.size());
        settableFuture.mo57356n(C58833ax.m90834k(jVar));
    }
}
