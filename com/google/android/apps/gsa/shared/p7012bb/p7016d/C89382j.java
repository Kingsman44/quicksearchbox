package com.google.android.apps.gsa.shared.p7012bb.p7016d;

import com.google.p4449cd.p4453d.C57958d;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.j */
/* compiled from: PG */
public abstract class C89382j extends C89391s {

    /* renamed from: a */
    private final Object f242329a = new Object();

    /* renamed from: b */
    private int f242330b = 0;

    /* renamed from: c */
    private boolean f242331c = true;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo83299c();

    /* renamed from: d */
    public final void mo20645d(C57958d dVar, Throwable th, long j) {
        int i;
        boolean z;
        synchronized (this.f242329a) {
            i = this.f242330b - 1;
            this.f242330b = i;
            z = this.f242331c;
        }
        if (i == 0 && z) {
            mo83299c();
        }
    }

    /* renamed from: e */
    public final void mo54570e(long j) {
        int i;
        synchronized (this.f242329a) {
            this.f242331c = true;
            i = this.f242330b;
        }
        if (i == 0) {
            mo83299c();
        }
    }

    /* renamed from: f */
    public void mo20646f(C57958d dVar, long j) {
        synchronized (this.f242329a) {
            this.f242330b++;
            this.f242331c = false;
        }
    }
}
