package com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8531a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.conversation.p1855h.C22697b;
import com.google.android.libraries.gsa.conversation.p1855h.C22722z;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.f.a.o */
/* compiled from: PG */
public final class C111788o extends C22697b {

    /* renamed from: a */
    public final SettableFuture f310684a = new SettableFuture();

    /* renamed from: a */
    public final void mo27813a(C22722z zVar) {
        if (!this.f310684a.isDone()) {
            this.f310684a.mo57356n(C118826c.f331422a);
            return;
        }
        throw new IllegalStateException("deltaProcessed future is already set, this should never happen");
    }
}
