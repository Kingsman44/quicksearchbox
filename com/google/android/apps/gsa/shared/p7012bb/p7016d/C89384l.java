package com.google.android.apps.gsa.shared.p7012bb.p7016d;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4449cd.p4452c.C57942b;
import com.google.p4449cd.p4452c.C57951k;
import com.google.p4449cd.p4453d.C57958d;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.l */
/* compiled from: PG */
public final class C89384l extends C57951k implements C89390r {

    /* renamed from: a */
    public final boolean f242344a;

    /* renamed from: b */
    public final boolean f242345b;

    /* renamed from: c */
    public final boolean f242346c;

    /* renamed from: d */
    private final C118575h f242347d;

    /* renamed from: e */
    private final long f242348e;

    /* renamed from: g */
    private int f242349g = 0;

    /* renamed from: h */
    private boolean f242350h = true;

    /* renamed from: i */
    private C58833ax f242351i;

    /* renamed from: j */
    private C58833ax f242352j;

    /* renamed from: k */
    private C58833ax f242353k;

    /* renamed from: l */
    private C57942b f242354l;

    /* renamed from: m */
    private C57942b f242355m;

    public C89384l(C118575h hVar, C21370a aVar, C89387o oVar) {
        super(aVar);
        boolean z = false;
        C58836b bVar = C58836b.f156633a;
        this.f242351i = bVar;
        this.f242352j = bVar;
        this.f242353k = bVar;
        this.f242354l = null;
        this.f242355m = null;
        this.f242347d = hVar;
        this.f242348e = aVar.mo26870b();
        int i = oVar.f242361a;
        this.f242344a = (i & 9) != 0;
        this.f242345b = (i & 12) != 0;
        this.f242346c = (i & 10) != 0 ? true : z;
    }

    /* renamed from: a */
    public final void mo54557a(long j) {
        if (this.f242344a) {
            super.mo54557a(j);
        }
    }

    /* renamed from: e */
    public final void mo54570e(long j) {
        if (this.f242344a) {
            synchronized (this.f154982f) {
                this.f242350h = true;
                if (this.f242349g == 0) {
                    this.f242352j = C58833ax.m90834k(Long.valueOf(j));
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo20646f(C57958d dVar, long j) {
        if (this.f242344a || this.f242345b) {
            synchronized (this.f154982f) {
                if (this.f242344a) {
                    this.f242353k = C58836b.f156633a;
                    if (this.f242349g == 0 && this.f242350h) {
                        this.f242350h = false;
                        this.f242351i = C58833ax.m90834k(Long.valueOf(j));
                        this.f242352j = C58836b.f156633a;
                    }
                    this.f242349g++;
                }
                if (this.f242345b) {
                    super.mo20646f(dVar, j);
                }
            }
        }
    }

    /* renamed from: g */
    public final C89383k mo83318g() {
        C89383k kVar;
        synchronized (this.f154982f) {
            kVar = new C89383k(this.f242347d, super.mo54561k(), this.f242348e, this.f242351i, this.f242352j, this.f242353k, this.f242354l, this.f242355m);
        }
        return kVar;
    }

    /* renamed from: h */
    public final void mo54558h(C57958d dVar, long j) {
        if (this.f242345b) {
            super.mo54558h(dVar, j);
        }
    }

    /* renamed from: i */
    public final void mo54559i(C57958d dVar, long j) {
        if (this.f242345b) {
            super.mo54559i(dVar, j);
        }
    }

    /* renamed from: j */
    public final void mo54560j(C57958d dVar, long j) {
        if (this.f242345b) {
            super.mo54560j(dVar, j);
        }
    }

    /* renamed from: l */
    public final void mo83313l(MessageLite messageLite, long j) {
        if (this.f242346c) {
            C89374b bVar = new C89374b(j, messageLite);
            synchronized (this.f154982f) {
                this.f242355m = C57942b.m88596b(bVar, this.f242355m);
            }
        }
    }

    /* renamed from: m */
    public final void mo83314m(int i, int i2, long j) {
        if (this.f242346c) {
            C89363a aVar = new C89363a(j, i, i2);
            synchronized (this.f154982f) {
                this.f242354l = C57942b.m88596b(aVar, this.f242354l);
            }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final void mo20645d(com.google.p4449cd.p4453d.C57958d r4, java.lang.Throwable r5, long r6) {
        /*
            r3 = this;
            boolean r0 = r3.f242344a
            if (r0 != 0) goto L_0x000a
            boolean r0 = r3.f242345b
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            return
        L_0x000a:
            if (r5 == 0) goto L_0x0015
            com.google.android.apps.gsa.shared.q.c r0 = com.google.android.apps.gsa.shared.p7012bb.p7014b.C89357a.m145329a(r5)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0017
        L_0x0015:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0017:
            java.lang.Object r1 = r3.f154982f
            monitor-enter(r1)
            boolean r2 = r3.f242344a     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0036
            int r2 = r3.f242349g     // Catch:{ all -> 0x003f }
            int r2 = r2 + -1
            r3.f242349g = r2     // Catch:{ all -> 0x003f }
            if (r2 != 0) goto L_0x0036
            r3.f242353k = r0     // Catch:{ all -> 0x003f }
            boolean r0 = r3.f242350h     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0036
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x003f }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ all -> 0x003f }
            r3.f242352j = r0     // Catch:{ all -> 0x003f }
        L_0x0036:
            boolean r0 = r3.f242345b     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            super.mo20645d(r4, r5, r6)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7012bb.p7016d.C89384l.mo20645d(com.google.cd.d.d, java.lang.Throwable, long):void");
    }
}
