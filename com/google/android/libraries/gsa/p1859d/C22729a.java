package com.google.android.libraries.gsa.p1859d;

import android.os.Looper;

/* renamed from: com.google.android.libraries.gsa.d.a */
/* compiled from: PG */
final class C22729a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C22781c f62551a;

    public C22729a(C22781c cVar) {
        this.f62551a = cVar;
    }

    public final void run() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f62551a.mo28114a(false);
            return;
        }
        throw new IllegalStateException("Must be called on the main thread.");
    }
}
