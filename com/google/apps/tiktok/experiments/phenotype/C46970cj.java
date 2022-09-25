package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.p1963i.C23851az;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.cj */
/* compiled from: PG */
final class C46970cj extends AtomicInteger {

    /* renamed from: a */
    public final C23851az f122481a;

    /* renamed from: b */
    public final SettableFuture f122482b = new SettableFuture();

    /* renamed from: c */
    private final C46972cl f122483c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46970cj(int r2, com.google.android.libraries.p1963i.C23851az r3, com.google.apps.tiktok.experiments.phenotype.C46972cl r4) {
        /*
            r1 = this;
            java.lang.String r0 = "threadIdentifier"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            int r2 = r2 + r2
            int r2 = r2 + r2
            r1.<init>(r2)
            r1.f122481a = r3
            r1.f122483c = r4
            com.google.common.util.concurrent.SettableFuture r2 = new com.google.common.util.concurrent.SettableFuture
            r2.<init>()
            r1.f122482b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.experiments.phenotype.C46970cj.<init>(int, com.google.android.libraries.i.az, com.google.apps.tiktok.experiments.phenotype.cl):void");
    }

    /* renamed from: a */
    public final void mo50946a() {
        int i;
        boolean a;
        this.f122482b.mo57356n((Object) null);
        do {
            i = get();
            int i2 = i >> 2;
            a = (i2 + i2) | C46971ck.m83623a(i);
        } while (!compareAndSet(i, ((a ? 1 : 0) + a) | 1));
        if (C46971ck.m83623a(i)) {
            boolean z = false;
            do {
                z |= Thread.interrupted();
                LockSupport.park(this.f122483c);
            } while (C46971ck.m83623a(get()));
            if (z) {
                this.f122481a.f65295a.interrupt();
            }
        }
    }

    public final byte byteValue() {
        throw new UnsupportedOperationException();
    }

    public final short shortValue() {
        throw new UnsupportedOperationException();
    }
}
