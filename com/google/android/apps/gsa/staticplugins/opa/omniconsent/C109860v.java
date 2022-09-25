package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.v */
/* compiled from: PG */
public final /* synthetic */ class C109860v implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f306108a;

    public /* synthetic */ C109860v(SettableFuture settableFuture) {
        this.f306108a = settableFuture;
    }

    public final void run() {
        this.f306108a.cancel(true);
    }
}
