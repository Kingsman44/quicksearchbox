package com.google.android.libraries.p3329t.p3331b;

import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.t.b.f */
/* compiled from: PG */
final class C43183f extends C43180c implements C43182e {

    /* renamed from: e */
    public C58881cr f112899e = null;

    /* renamed from: f */
    private SettableFuture f112900f = new SettableFuture();

    /* renamed from: a */
    public final synchronized C60870cx mo46247a() {
        C60870cx cxVar;
        SettableFuture settableFuture = this.f112900f;
        if (settableFuture == null) {
            cxVar = C60856cj.m92900i(((C43184g) this.f112899e).f112902b.get());
        } else {
            cxVar = C60856cj.m92901j(settableFuture);
        }
        return cxVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo46248b(C58881cr crVar) {
        this.f112899e = crVar;
        SettableFuture settableFuture = this.f112900f;
        if (settableFuture != null) {
            settableFuture.mo57356n(((C43184g) crVar).f112902b.get());
            this.f112900f = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo46249c() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.common.util.concurrent.SettableFuture r0 = r1.f112900f     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x000f:
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p3329t.p3331b.C43183f.mo46249c():boolean");
    }
}
