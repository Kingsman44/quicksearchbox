package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.Locale;

/* renamed from: com.google.android.gms.cast.internal.an */
/* compiled from: PG */
public final class C143575an {

    /* renamed from: a */
    public static final Object f389301a = new Object();

    /* renamed from: e */
    private static final C143566ae f389302e = new C143566ae("RequestTracker");

    /* renamed from: b */
    long f389303b = -1;

    /* renamed from: c */
    C143573al f389304c;

    /* renamed from: d */
    Runnable f389305d;

    /* renamed from: f */
    private final long f389306f;

    /* renamed from: g */
    private final Handler f389307g = new C144861c(Looper.getMainLooper());

    public C143575an(long j) {
        this.f389306f = j;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: f */
    private final void m233204f(int r4, java.lang.Object r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.cast.internal.ae r0 = f389302e
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.mo118884b(r6, r1)
            java.lang.Object r6 = f389301a
            monitor-enter(r6)
            com.google.android.gms.cast.internal.al r0 = r3.f389304c     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0014
            long r1 = r3.f389303b     // Catch:{ all -> 0x002f }
            r0.mo118753a(r1, r4, r5)     // Catch:{ all -> 0x002f }
        L_0x0014:
            r4 = -1
            r3.f389303b = r4     // Catch:{ all -> 0x002f }
            r4 = 0
            r3.f389304c = r4     // Catch:{ all -> 0x002f }
            monitor-enter(r6)     // Catch:{ all -> 0x002f }
            java.lang.Runnable r5 = r3.f389305d     // Catch:{ all -> 0x002c }
            if (r5 != 0) goto L_0x0022
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x0022:
            android.os.Handler r0 = r3.f389307g     // Catch:{ all -> 0x002c }
            r0.removeCallbacks(r5)     // Catch:{ all -> 0x002c }
            r3.f389305d = r4     // Catch:{ all -> 0x002c }
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            throw r4     // Catch:{ all -> 0x002f }
        L_0x002f:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.internal.C143575an.m233204f(int, java.lang.Object, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo118905a(long j, C143573al alVar) {
        C143573al alVar2;
        long j2;
        Object obj = f389301a;
        synchronized (obj) {
            alVar2 = this.f389304c;
            j2 = this.f389303b;
            this.f389303b = j;
            this.f389304c = alVar;
        }
        if (alVar2 != null) {
            alVar2.mo118754b(j2);
        }
        synchronized (obj) {
            Runnable runnable = this.f389305d;
            if (runnable != null) {
                this.f389307g.removeCallbacks(runnable);
            }
            C143574am amVar = new C143574am(this);
            this.f389305d = amVar;
            this.f389307g.postDelayed(amVar, this.f389306f);
        }
    }

    /* renamed from: b */
    public final boolean mo118906b() {
        boolean z;
        synchronized (f389301a) {
            z = this.f389303b != -1;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo118907c(long j) {
        boolean z;
        synchronized (f389301a) {
            long j2 = this.f389303b;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: d */
    public final void mo118908d(int i) {
        synchronized (f389301a) {
            if (this.f389303b != -1) {
                m233204f(i, (Object) null, String.format(Locale.ROOT, "clearing request %d", new Object[]{Long.valueOf(this.f389303b)}));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118909e(long r7, int r9, java.lang.Object r10) {
        /*
            r6 = this;
            java.lang.Object r0 = f389301a
            monitor-enter(r0)
            long r1 = r6.f389303b     // Catch:{ all -> 0x0028 }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0026
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0026
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch:{ all -> 0x0028 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0028 }
            r8 = 0
            r2[r8] = r7     // Catch:{ all -> 0x0028 }
            java.lang.String r7 = "request %d completed"
            java.lang.String r7 = java.lang.String.format(r1, r7, r2)     // Catch:{ all -> 0x0028 }
            r6.m233204f(r9, r10, r7)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.internal.C143575an.mo118909e(long, int, java.lang.Object):void");
    }
}
