package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.apps.gsa.s3.producers.t */
/* compiled from: PG */
public abstract class C84321t implements C84309h, C84326y {

    /* renamed from: a */
    private final Object f229473a = new Object();

    /* renamed from: b */
    private final Queue f229474b = new LinkedBlockingQueue();

    /* renamed from: c */
    private SettableFuture f229475c = null;

    /* renamed from: d */
    private boolean f229476d = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo77848a(C66606cd cdVar, Object obj);

    /* renamed from: b */
    public final boolean mo77850b() {
        synchronized (this.f229473a) {
            if (this.f229476d) {
                return true;
            }
            boolean z = !this.f229474b.isEmpty();
            return z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo77849c();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        mo77849c();
        r1 = r3.f229473a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r3.f229475c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        if (r0 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        r0.mo57356n(com.google.android.apps.gsa.p8883x.C118826c.f331422a);
        r3.f229475c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f229473a
            monitor-enter(r0)
            boolean r1 = r3.f229476d     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000b
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x000b:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0028 }
            r1 = 1
            r3.f229476d = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            r3.mo77849c()
            java.lang.Object r1 = r3.f229473a
            monitor-enter(r1)
            com.google.common.util.concurrent.SettableFuture r0 = r3.f229475c     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0023
            com.google.android.apps.gsa.x.c r2 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x0025 }
            r0.mo57356n(r2)     // Catch:{ all -> 0x0025 }
            r0 = 0
            r3.f229475c = r0     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r0
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.producers.C84321t.close():void");
    }

    /* renamed from: e */
    public final C60870cx mo77852e() {
        synchronized (this.f229473a) {
            if (mo77850b()) {
                C60870cx cxVar = C118826c.f331423b;
                return cxVar;
            }
            if (this.f229475c == null) {
                this.f229475c = new SettableFuture();
            }
            SettableFuture settableFuture = this.f229475c;
            return settableFuture;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77845f(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f229473a
            monitor-enter(r0)
            boolean r1 = r3.f229476d     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x000b
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0026 }
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x000b:
            java.util.Queue r1 = r3.f229474b     // Catch:{ all -> 0x0026 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0026 }
            java.util.Queue r2 = r3.f229474b     // Catch:{ all -> 0x0026 }
            r2.add(r4)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0024
            com.google.common.util.concurrent.SettableFuture r4 = r3.f229475c     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0024
            com.google.android.apps.gsa.x.c r1 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x0026 }
            r4.mo57356n(r1)     // Catch:{ all -> 0x0026 }
            r4 = 0
            r3.f229475c = r4     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.producers.C84321t.mo77845f(java.lang.Object):void");
    }

    /* renamed from: hj */
    public final C66607ce mo77855hj() {
        synchronized (this.f229473a) {
            if (this.f229474b.isEmpty()) {
                C58976aa aaVar = C58975e.f156826a;
                return null;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            C66606cd a = C118919a.m197403a();
            mo77848a(a, this.f229474b.poll());
            C66607ce ceVar = (C66607ce) a.build();
            return ceVar;
        }
    }

    /* renamed from: hk */
    public void mo77847hk() {
        close();
    }
}
