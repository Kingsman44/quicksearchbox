package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.tasks.an */
/* compiled from: PG */
final class C146018an implements C146019ao {

    /* renamed from: a */
    public final CountDownLatch f394714a = new CountDownLatch(1);

    /* renamed from: a */
    public final void mo119879a() {
        this.f394714a.countDown();
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        this.f394714a.countDown();
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        this.f394714a.countDown();
    }
}
