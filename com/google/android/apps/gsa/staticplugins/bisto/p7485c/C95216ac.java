package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.ac */
/* compiled from: PG */
public final /* synthetic */ class C95216ac implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95225al f266398a;

    public /* synthetic */ C95216ac(C95225al alVar) {
        this.f266398a = alVar;
    }

    public final void run() {
        C95225al alVar = this.f266398a;
        synchronized (alVar) {
            SettableFuture settableFuture = alVar.f266413g;
            if (settableFuture != null) {
                settableFuture.cancel(false);
                alVar.f266413g = null;
            }
        }
    }
}
