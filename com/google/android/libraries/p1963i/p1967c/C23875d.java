package com.google.android.libraries.p1963i.p1967c;

import com.google.common.util.concurrent.C60872cz;

/* renamed from: com.google.android.libraries.i.c.d */
/* compiled from: PG */
final class C23875d implements Runnable {

    /* renamed from: a */
    public final Runnable f65331a;

    /* renamed from: b */
    final /* synthetic */ C23876e f65332b;

    public C23875d(C23876e eVar, Runnable runnable) {
        this.f65332b = eVar;
        this.f65331a = runnable;
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        C23876e eVar = this.f65332b;
        C60872cz d = eVar.f65337e.mo29164d(new C23874c(this, currentThread), eVar.f65335c.mo29260f(), this.f65332b.f65335c.mo29261g());
        try {
            this.f65331a.run();
        } finally {
            d.cancel(false);
        }
    }

    public final String toString() {
        return this.f65331a.toString();
    }
}
