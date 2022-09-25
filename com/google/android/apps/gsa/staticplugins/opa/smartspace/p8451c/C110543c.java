package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.c */
/* compiled from: PG */
public final /* synthetic */ class C110543c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110547g f308181a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f308182b;

    public /* synthetic */ C110543c(C110547g gVar, SettableFuture settableFuture) {
        this.f308181a = gVar;
        this.f308182b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110547g gVar = this.f308181a;
        SettableFuture settableFuture = this.f308182b;
        ((C58970a) ((C58970a) ((C58970a) gVar.f308197j.mo56225c()).mo56382g((Exception) obj)).mo56372aa(26531)).mo56386p("Failed to load calendar events from on-device ContentProvider.");
        settableFuture.mo57356n(C118826c.f331422a);
    }
}
