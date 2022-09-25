package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.p8270a;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.e.a.g */
/* compiled from: PG */
public final /* synthetic */ class C107055g implements AutoCloseable {

    /* renamed from: a */
    public final /* synthetic */ Lock f298101a;

    public /* synthetic */ C107055g(Lock lock) {
        this.f298101a = lock;
    }

    public final void close() {
        this.f298101a.unlock();
    }
}
