package com.google.apps.tiktok.concurrent;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.apps.tiktok.concurrent.h */
/* compiled from: PG */
public final /* synthetic */ class C46456h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46459k f121556a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f121557b;

    /* renamed from: c */
    public final /* synthetic */ int f121558c;

    public /* synthetic */ C46456h(C46459k kVar, C60870cx cxVar, int i) {
        this.f121556a = kVar;
        this.f121557b = cxVar;
        this.f121558c = i;
    }

    public final void run() {
        SettableFuture settableFuture;
        C46459k kVar = this.f121556a;
        C60870cx cxVar = this.f121557b;
        int i = this.f121558c;
        C46460l lVar = kVar.f121565b;
        lVar.f121580e.remove(cxVar);
        while (true) {
            long j = lVar.f121578c.get();
            int i2 = (int) (j >> 32);
            int i3 = (int) (4294967295L & j);
            if (i3 != i) {
                synchronized (lVar.f121579d) {
                    lVar.f121582g.remove(i);
                }
                return;
            } else if (i2 == 1) {
                if (lVar.f121578c.compareAndSet(j, (long) i3)) {
                    synchronized (lVar.f121579d) {
                        settableFuture = (SettableFuture) lVar.f121582g.get(i3);
                        if (settableFuture == null) {
                            settableFuture = (SettableFuture) lVar.f121581f.get(i3);
                            settableFuture.getClass();
                            lVar.f121581f.put(i3, C46460l.f121577b);
                        } else {
                            lVar.f121582g.remove(i3);
                        }
                    }
                    settableFuture.mo57356n((Object) null);
                    return;
                }
            } else if (i2 <= 0) {
                throw new IllegalStateException("Can't decrement at zero or less refcount: " + i2);
            } else if (lVar.f121578c.compareAndSet(j, C46460l.m82834a(i2 - 1, j))) {
                return;
            }
        }
    }
}
