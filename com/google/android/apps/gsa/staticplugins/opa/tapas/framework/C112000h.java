package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.h */
/* compiled from: PG */
final class C112000h {

    /* renamed from: a */
    public final C21370a f311148a;

    /* renamed from: b */
    public final AtomicLong f311149b = new AtomicLong(0);

    /* renamed from: c */
    public C113405ep f311150c = null;

    /* renamed from: d */
    public C60870cx f311151d = null;

    /* renamed from: e */
    private final long f311152e;

    /* renamed from: f */
    private final C22871g f311153f;

    public C112000h(long j, C21370a aVar, C22871g gVar) {
        this.f311152e = j;
        this.f311148a = aVar;
        this.f311153f = gVar;
    }

    /* renamed from: b */
    private final synchronized void m185860b() {
        C113405ep epVar = this.f311150c;
        C60870cx cxVar = this.f311151d;
        this.f311150c = null;
        this.f311151d = null;
        if (epVar != null) {
            C58976aa aaVar = C58975e.f156826a;
        }
        if (cxVar != null) {
            cxVar.cancel(false);
        }
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
    /* renamed from: a */
    final synchronized com.google.common.util.concurrent.C60870cx mo99335a(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep r7, com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111999g r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            monitor-enter(r6)     // Catch:{ all -> 0x006f }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r0 = r6.f311150c     // Catch:{ all -> 0x006c }
            r1 = 1
            if (r0 == 0) goto L_0x0015
            long r2 = r0.mo100017b()     // Catch:{ all -> 0x006c }
            long r4 = r7.mo100017b()     // Catch:{ all -> 0x006c }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            monitor-exit(r6)     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x0020
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es.f314036b     // Catch:{ all -> 0x006f }
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)     // Catch:{ all -> 0x006f }
            monitor-exit(r6)
            return r7
        L_0x0020:
            r6.m185860b()     // Catch:{ all -> 0x006f }
            com.google.android.libraries.f.a r0 = r6.f311148a     // Catch:{ all -> 0x006f }
            long r0 = r0.mo26871c()     // Catch:{ all -> 0x006f }
            java.util.concurrent.atomic.AtomicLong r2 = r6.f311149b     // Catch:{ all -> 0x006f }
            long r2 = r2.get()     // Catch:{ all -> 0x006f }
            long r4 = r6.f311152e     // Catch:{ all -> 0x006f }
            long r0 = r0 - r2
            long r4 = r4 - r0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x003a
            r4 = r0
        L_0x003a:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0054
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x006f }
            r7.mo100033p()     // Catch:{ all -> 0x006f }
            java.util.concurrent.atomic.AtomicLong r0 = r6.f311149b     // Catch:{ all -> 0x006f }
            com.google.android.libraries.f.a r1 = r6.f311148a     // Catch:{ all -> 0x006f }
            long r1 = r1.mo26871c()     // Catch:{ all -> 0x006f }
            r0.set(r1)     // Catch:{ all -> 0x006f }
            com.google.common.util.concurrent.cx r7 = r8.mo99334a(r7)     // Catch:{ all -> 0x006f }
            monitor-exit(r6)
            return r7
        L_0x0054:
            r6.f311150c = r7     // Catch:{ all -> 0x006f }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x006f }
            r7.mo100033p()     // Catch:{ all -> 0x006f }
            com.google.android.libraries.gsa.k.g r7 = r6.f311153f     // Catch:{ all -> 0x006f }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.f r0 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.f     // Catch:{ all -> 0x006f }
            r0.<init>(r6, r8)     // Catch:{ all -> 0x006f }
            java.lang.String r8 = "ProcessRequest"
            com.google.common.util.concurrent.cx r7 = r7.mo28203c(r8, r4, r0)     // Catch:{ all -> 0x006f }
            r6.f311151d = r7     // Catch:{ all -> 0x006f }
            monitor-exit(r6)
            return r7
        L_0x006c:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006c }
            throw r7     // Catch:{ all -> 0x006f }
        L_0x006f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C112000h.mo99335a(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep, com.google.android.apps.gsa.staticplugins.opa.tapas.framework.g):com.google.common.util.concurrent.cx");
    }
}
