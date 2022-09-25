package com.google.android.gms.p10725a.p10730b;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.a.b.b */
/* compiled from: PG */
final class C142674b extends Thread {

    /* renamed from: a */
    final CountDownLatch f387154a = new CountDownLatch(1);

    /* renamed from: b */
    boolean f387155b = false;

    /* renamed from: c */
    private final WeakReference f387156c;

    /* renamed from: d */
    private final long f387157d;

    public C142674b(C142677d dVar, long j) {
        this.f387156c = new WeakReference(dVar);
        this.f387157d = j;
        start();
    }

    /* renamed from: a */
    private final void m231496a() {
        C142677d dVar = (C142677d) this.f387156c.get();
        if (dVar != null) {
            dVar.mo117456a();
            this.f387155b = true;
        }
    }

    public final void run() {
        try {
            if (!this.f387154a.await(this.f387157d, TimeUnit.MILLISECONDS)) {
                m231496a();
            }
        } catch (InterruptedException unused) {
            m231496a();
        }
    }
}
