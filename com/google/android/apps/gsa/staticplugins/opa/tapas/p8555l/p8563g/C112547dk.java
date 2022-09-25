package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48632bu;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dk */
/* compiled from: PG */
final class C112547dk {

    /* renamed from: a */
    final C112473ar f312122a;

    /* renamed from: b */
    final C48634bw f312123b;

    /* renamed from: c */
    C48635bx f312124c = C48635bx.f125704d;

    /* renamed from: d */
    C60870cx f312125d = null;

    /* renamed from: e */
    long f312126e;

    /* renamed from: f */
    boolean f312127f = false;

    /* renamed from: g */
    final /* synthetic */ C112548dl f312128g;

    public C112547dk(C112548dl dlVar, C48634bw bwVar, C112473ar arVar) {
        this.f312128g = dlVar;
        this.f312123b = bwVar;
        this.f312122a = arVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C48635bx mo99571a() {
        return this.f312124c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C60870cx mo99572b() {
        return this.f312125d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo99573c() {
        C121537f fVar = C112548dl.f312129a;
        String name = this.f312123b.name();
        fVar.mo105241j("cancelFetch_".concat(String.valueOf(name)), new C112546dj(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo99574d() {
        C60870cx cxVar = this.f312125d;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f312125d = null;
        }
        this.f312126e = 0;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    final synchronized void mo99575e(com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x004c }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dl r0 = r4.f312128g     // Catch:{ all -> 0x0049 }
            com.google.android.libraries.f.a r0 = r0.f312134f     // Catch:{ all -> 0x0049 }
            long r0 = r0.mo26870b()     // Catch:{ all -> 0x0049 }
            long r2 = r4.f312126e     // Catch:{ all -> 0x0049 }
            long r0 = r0 - r2
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0049 }
            com.google.assistant.ad.d.b.a.bw r2 = r4.f312123b     // Catch:{ all -> 0x0049 }
            r2.name()     // Catch:{ all -> 0x0049 }
            r4.f312124c = r5     // Catch:{ all -> 0x0049 }
            r5 = 0
            r4.f312125d = r5     // Catch:{ all -> 0x0049 }
            r2 = 0
            r4.f312126e = r2     // Catch:{ all -> 0x0049 }
            r5 = 0
            r4.f312127f = r5     // Catch:{ all -> 0x0049 }
            monitor-exit(r4)     // Catch:{ all -> 0x0049 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dl r5 = r4.f312128g     // Catch:{ all -> 0x004c }
            com.google.android.libraries.gsa.k.g r5 = r5.f312135g     // Catch:{ all -> 0x004c }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.db r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.db     // Catch:{ all -> 0x004c }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "logEvent"
            com.google.common.util.concurrent.cx r5 = r5.mo28207g(r0, r2)     // Catch:{ all -> 0x004c }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dl r0 = r4.f312128g     // Catch:{ all -> 0x004c }
            com.google.android.libraries.gsa.k.g r0 = r0.f312135g     // Catch:{ all -> 0x004c }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dc r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dc     // Catch:{ all -> 0x004c }
            r1.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "report logEvent success"
            com.google.android.apps.gsa.shared.util.c.ag r5 = com.google.android.apps.gsa.shared.util.p7159c.C90875ai.m148465b(r1, r5, r0, r2)     // Catch:{ all -> 0x004c }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dd r0 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dd     // Catch:{ all -> 0x004c }
            r0.<init>(r4)     // Catch:{ all -> 0x004c }
            r5.mo85223a(r0)     // Catch:{ all -> 0x004c }
            monitor-exit(r4)
            return
        L_0x0049:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0049 }
            throw r5     // Catch:{ all -> 0x004c }
        L_0x004c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112547dk.mo99575e(com.google.assistant.ad.d.b.a.bx):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo99576f() {
        this.f312127f = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo99577g(C48635bx bxVar) {
        this.f312124c = bxVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized void mo99578h(C48632bu buVar, long j) {
        C121537f fVar = C112548dl.f312129a;
        String name = this.f312123b.name();
        fVar.mo105241j("startFetch_".concat(String.valueOf(name)), new C112541de(this, buVar, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final synchronized void mo99579i(C48632bu buVar, long j) {
        C60870cx b = this.f312128g.f312135g.mo28202b("fetchSignal", new C112543dg(this));
        this.f312125d = b;
        this.f312126e = j;
        new C90873ag(b, this.f312128g.f312135g, "startFetch", new C112544dh(this)).mo85223a(new C112545di(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo99580j() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.common.util.concurrent.cx r0 = r1.f312125d     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x000e:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112547dk.mo99580j():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return true;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo99581k(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.assistant.ad.d.b.a.bx r0 = r5.f312124c     // Catch:{ all -> 0x001d }
            long r0 = r0.f125708c     // Catch:{ all -> 0x001d }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001a
            long r6 = r6 - r0
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.ar r0 = r5.f312122a     // Catch:{ all -> 0x001d }
            long r0 = r0.mo99046m()     // Catch:{ all -> 0x001d }
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x001a:
            monitor-exit(r5)
            r6 = 1
            return r6
        L_0x001d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112547dk.mo99581k(long):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return true;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo99582l(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f312127f     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001e
            com.google.assistant.ad.d.b.a.bx r0 = r5.f312124c     // Catch:{ all -> 0x0021 }
            long r0 = r0.f125708c     // Catch:{ all -> 0x0021 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001e
            long r6 = r6 - r0
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.ar r0 = r5.f312122a     // Catch:{ all -> 0x0021 }
            long r0 = r0.mo99043a()     // Catch:{ all -> 0x0021 }
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x001b
            goto L_0x001e
        L_0x001b:
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x001e:
            monitor-exit(r5)
            r6 = 1
            return r6
        L_0x0021:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112547dk.mo99582l(long):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return false;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo99583m(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mo99580j()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0013
            long r0 = r3.f312126e     // Catch:{ all -> 0x0016 }
            long r4 = r4 - r0
            long r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112548dl.f312131c     // Catch:{ all -> 0x0016 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0013
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x0013:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0016:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112547dk.mo99583m(long):boolean");
    }
}
