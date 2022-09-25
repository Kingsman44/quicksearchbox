package com.google.android.gms.analytics.internal;

import android.os.Looper;

/* renamed from: com.google.android.gms.analytics.internal.ag */
/* compiled from: PG */
final class C142710ag implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C142711ah f387238a;

    public C142710ag(C142711ah ahVar) {
        this.f387238a = ahVar;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f387238a.f387240b.mo117542b().mo117603c(this);
            return;
        }
        boolean e = this.f387238a.mo117502e();
        this.f387238a.f387242d = 0;
        if (e) {
            this.f387238a.mo117498a();
        }
    }
}
