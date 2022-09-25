package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.ak */
/* compiled from: PG */
public final /* synthetic */ class C95333ak implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f266723a;

    public /* synthetic */ C95333ak(SettableFuture settableFuture) {
        this.f266723a = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        SettableFuture settableFuture = this.f266723a;
        if (!((Boolean) obj).booleanValue()) {
            settableFuture.mo57357o(new C95351bb("failed to send device request"));
        }
    }
}
