package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.i */
/* compiled from: PG */
public final /* synthetic */ class C110549i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110559s f308203a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f308204b;

    public /* synthetic */ C110549i(C110559s sVar, SettableFuture settableFuture) {
        this.f308203a = sVar;
        this.f308204b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110559s sVar = this.f308203a;
        SettableFuture settableFuture = this.f308204b;
        ((C58970a) ((C58970a) ((C58970a) sVar.f308227f.mo56225c()).mo56382g((Exception) obj)).mo56372aa(26552)).mo56386p("Failed to load calendar events from on-device ContentProvider.");
        settableFuture.mo57356n(C58836b.f156633a);
    }
}
