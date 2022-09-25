package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.ah */
/* compiled from: PG */
public final /* synthetic */ class C95221ah implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95225al f266403a;

    public /* synthetic */ C95221ah(C95225al alVar) {
        this.f266403a = alVar;
    }

    public final void run() {
        C95225al alVar = this.f266403a;
        synchronized (alVar) {
            SettableFuture settableFuture = alVar.f266412f;
            if (settableFuture != null) {
                settableFuture.cancel(false);
                alVar.f266412f = null;
            }
        }
    }
}
