package com.google.android.libraries.lens.p1995c.p1996a;

import android.os.AsyncTask;

/* renamed from: com.google.android.libraries.lens.c.a.b */
/* compiled from: PG */
final class C24074b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C24075c f65760a;

    public C24074b(C24075c cVar) {
        this.f65760a = cVar;
    }

    public final void run() {
        if (this.f65760a.getStatus() != AsyncTask.Status.FINISHED) {
            this.f65760a.cancel(true);
            this.f65760a.mo29466a(15, 15);
        }
    }
}
