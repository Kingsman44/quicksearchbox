package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.o */
/* compiled from: PG */
public final /* synthetic */ class C110555o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110559s f308214a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f308215b;

    public /* synthetic */ C110555o(C110559s sVar, SettableFuture settableFuture) {
        this.f308214a = sVar;
        this.f308215b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110559s sVar = this.f308214a;
        SettableFuture settableFuture = this.f308215b;
        ((C58970a) ((C58970a) ((C58970a) sVar.f308227f.mo56225c()).mo56382g((Exception) obj)).mo56372aa(26550)).mo56386p("Failed to write local agenda data to OpaStore.");
        settableFuture.mo57356n(C58836b.f156633a);
    }
}
