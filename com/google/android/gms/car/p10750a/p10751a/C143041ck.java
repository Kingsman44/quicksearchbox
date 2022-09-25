package com.google.android.gms.car.p10750a.p10751a;

import android.os.Looper;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143146cb;
import com.google.android.gms.car.p10750a.C143082b;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.car.a.a.ck */
/* compiled from: PG */
public final class C143041ck extends C143146cb {

    /* renamed from: a */
    private volatile boolean f388113a;

    /* renamed from: b */
    private volatile int f388114b;

    /* renamed from: c */
    private final Set f388115c = new LinkedHashSet();

    /* renamed from: d */
    private final C144861c f388116d = new C144861c(Looper.getMainLooper());

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo117975a(int r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f388113a     // Catch:{ all -> 0x0063 }
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 3
            if (r0 != 0) goto L_0x0048
            r9.f388113a = r3     // Catch:{ all -> 0x0063 }
            r9.f388114b = r10     // Catch:{ all -> 0x0063 }
            java.util.Set r0 = r9.f388115c     // Catch:{ all -> 0x0063 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0063 }
        L_0x0013:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.car.a.b r5 = (com.google.android.gms.car.p10750a.C143082b) r5     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = "GH.MultiCarCxnListener"
            boolean r6 = com.google.android.gms.car.C143109au.m232164a(r6, r4)     // Catch:{ all -> 0x0063 }
            if (r6 == 0) goto L_0x003d
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0063 }
            com.google.frameworks.client.a.a.b r7 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r9)     // Catch:{ all -> 0x0063 }
            r6[r2] = r7     // Catch:{ all -> 0x0063 }
            com.google.frameworks.client.a.a.b r7 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r5)     // Catch:{ all -> 0x0063 }
            r6[r3] = r7     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = "GH.MultiCarCxnListener"
            java.lang.String r8 = "Instance %s onCarConnected() listener: %s"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r4, r7, r1, r8, r6)     // Catch:{ all -> 0x0063 }
        L_0x003d:
            com.google.android.gms.libs.d.c.c r6 = r9.f388116d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.car.a.a.ci r7 = new com.google.android.gms.car.a.a.ci     // Catch:{ all -> 0x0063 }
            r7.<init>(r5, r10)     // Catch:{ all -> 0x0063 }
            r6.post(r7)     // Catch:{ all -> 0x0063 }
            goto L_0x0013
        L_0x0048:
            java.lang.String r10 = "GH.MultiCarCxnListener"
            boolean r10 = com.google.android.gms.car.C143109au.m232164a(r10, r4)     // Catch:{ all -> 0x0063 }
            if (r10 == 0) goto L_0x0061
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x0063 }
            com.google.frameworks.client.a.a.b r0 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r9)     // Catch:{ all -> 0x0063 }
            r10[r2] = r0     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "GH.MultiCarCxnListener"
            java.lang.String r2 = "Instance %s already connected, so not calling onCarConnected() on listeners"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r4, r0, r1, r2, r10)     // Catch:{ all -> 0x0063 }
            monitor-exit(r9)
            return
        L_0x0061:
            monitor-exit(r9)
            return
        L_0x0063:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0067
        L_0x0066:
            throw r10
        L_0x0067:
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10750a.p10751a.C143041ck.mo117975a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo117976b() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f388113a     // Catch:{ all -> 0x0064 }
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 3
            if (r0 == 0) goto L_0x0049
            r9.f388113a = r3     // Catch:{ all -> 0x0064 }
            java.util.Set r0 = r9.f388115c     // Catch:{ all -> 0x0064 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0064 }
        L_0x0011:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0064 }
            if (r5 == 0) goto L_0x0062
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0064 }
            com.google.android.gms.car.a.b r5 = (com.google.android.gms.car.p10750a.C143082b) r5     // Catch:{ all -> 0x0064 }
            java.lang.String r6 = "GH.MultiCarCxnListener"
            boolean r6 = com.google.android.gms.car.C143109au.m232164a(r6, r4)     // Catch:{ all -> 0x0064 }
            if (r6 == 0) goto L_0x003b
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0064 }
            com.google.frameworks.client.a.a.b r7 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r9)     // Catch:{ all -> 0x0064 }
            r6[r3] = r7     // Catch:{ all -> 0x0064 }
            com.google.frameworks.client.a.a.b r7 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r5)     // Catch:{ all -> 0x0064 }
            r6[r2] = r7     // Catch:{ all -> 0x0064 }
            java.lang.String r7 = "GH.MultiCarCxnListener"
            java.lang.String r8 = "Instance %s onCarDisconnected() listener: %s"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r4, r7, r1, r8, r6)     // Catch:{ all -> 0x0064 }
        L_0x003b:
            com.google.android.gms.libs.d.c.c r6 = r9.f388116d     // Catch:{ all -> 0x0064 }
            p3186j$.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.car.a.a.cj r7 = new com.google.android.gms.car.a.a.cj     // Catch:{ all -> 0x0064 }
            r7.<init>(r5)     // Catch:{ all -> 0x0064 }
            r6.post(r7)     // Catch:{ all -> 0x0064 }
            goto L_0x0011
        L_0x0049:
            java.lang.String r0 = "GH.MultiCarCxnListener"
            boolean r0 = com.google.android.gms.car.C143109au.m232164a(r0, r4)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0062
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0064 }
            com.google.frameworks.client.a.a.b r2 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r9)     // Catch:{ all -> 0x0064 }
            r0[r3] = r2     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "GH.MultiCarCxnListener"
            java.lang.String r3 = "Instance %s disconnected, so not calling onCarDisconnected() on listeners"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r4, r2, r1, r3, r0)     // Catch:{ all -> 0x0064 }
            monitor-exit(r9)
            return
        L_0x0062:
            monitor-exit(r9)
            return
        L_0x0064:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0068
        L_0x0067:
            throw r0
        L_0x0068:
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10750a.p10751a.C143041ck.mo117976b():void");
    }

    /* renamed from: c */
    public final synchronized void mo117977c() {
        if (C143109au.m232164a("GH.MultiCarCxnListener", 3)) {
            C143316a.m232514d(3, "GH.MultiCarCxnListener", (Throwable) null, "Instance %s connection failure", C61301b.m93812a(this));
        }
        mo117976b();
    }

    /* renamed from: d */
    public final synchronized void mo117978d() {
        if (C143109au.m232164a("GH.MultiCarCxnListener", 3)) {
            C143316a.m232514d(3, "GH.MultiCarCxnListener", (Throwable) null, "Instance %s clearing out all listeners", C61301b.m93812a(this));
        }
        this.f388115c.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo117979e(com.google.android.gms.car.p10750a.C143082b r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "GH.MultiCarCxnListener"
            r1 = 3
            boolean r0 = com.google.android.gms.car.C143109au.m232164a(r0, r1)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0023
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0038 }
            com.google.frameworks.client.a.a.b r2 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r5)     // Catch:{ all -> 0x0038 }
            r3 = 0
            r0[r3] = r2     // Catch:{ all -> 0x0038 }
            com.google.frameworks.client.a.a.b r2 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r6)     // Catch:{ all -> 0x0038 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "GH.MultiCarCxnListener"
            java.lang.String r3 = "Instance %s registering listener %s"
            r4 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r1, r2, r4, r3, r0)     // Catch:{ all -> 0x0038 }
        L_0x0023:
            java.util.Set r0 = r5.f388115c     // Catch:{ all -> 0x0038 }
            boolean r0 = r0.add(r6)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0036
            boolean r0 = r5.f388113a     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0036
            int r0 = r5.f388114b     // Catch:{ all -> 0x0038 }
            r6.mo20043a(r0)     // Catch:{ all -> 0x0038 }
            monitor-exit(r5)
            return
        L_0x0036:
            monitor-exit(r5)
            return
        L_0x0038:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10750a.p10751a.C143041ck.mo117979e(com.google.android.gms.car.a.b):void");
    }

    /* renamed from: f */
    public final synchronized void mo117980f(C143082b bVar) {
        if (C143109au.m232164a("GH.MultiCarCxnListener", 3)) {
            C143316a.m232514d(3, "GH.MultiCarCxnListener", (Throwable) null, "Instance %s unregistering listener: %s", C61301b.m93812a(this), C61301b.m93812a(bVar));
        }
        this.f388115c.remove(bVar);
    }
}
