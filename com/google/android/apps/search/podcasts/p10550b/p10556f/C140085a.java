package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.android.apps.search.podcasts.b.f.a */
/* compiled from: PG */
final class C140085a {

    /* renamed from: a */
    private final Deque f380698a = new ArrayDeque();

    /* renamed from: b */
    private C97908bg f380699b;

    /* renamed from: a */
    public final synchronized C97908bg mo115438a() {
        if (this.f380698a.isEmpty()) {
            this.f380699b = null;
            return null;
        }
        C97908bg bgVar = (C97908bg) this.f380698a.pop();
        this.f380699b = bgVar;
        return bgVar;
    }

    /* renamed from: b */
    public final synchronized void mo115439b() {
        this.f380699b = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r0 == 1) goto L_0x000d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo115440c(com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r3.f273367b     // Catch:{ all -> 0x0019 }
            int r0 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97907bf.m162188a(r0)     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x000a
            goto L_0x000d
        L_0x000a:
            r1 = 1
            if (r0 != r1) goto L_0x0012
        L_0x000d:
            java.util.Deque r0 = r2.f380698a     // Catch:{ all -> 0x0019 }
            r0.clear()     // Catch:{ all -> 0x0019 }
        L_0x0012:
            java.util.Deque r0 = r2.f380698a     // Catch:{ all -> 0x0019 }
            r0.addLast(r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10556f.C140085a.mo115440c(com.google.android.apps.gsa.staticplugins.cl.b.bg):void");
    }

    /* renamed from: d */
    public final synchronized boolean mo115441d() {
        return this.f380698a.isEmpty();
    }

    /* renamed from: e */
    public final synchronized boolean mo115442e() {
        return this.f380699b != null;
    }
}
