package com.google.android.apps.gsa.speech.p7295k.p7296a;

import com.google.android.apps.gsa.p6487s3.producers.C84314m;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59317ae;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.speech.k.a.g */
/* compiled from: PG */
public final class C92443g implements C57981b {

    /* renamed from: e */
    private static final C59071e f257813e = C59071e.m91332i("com.google.android.apps.gsa.speech.k.a.g");

    /* renamed from: a */
    public final List f257814a;

    /* renamed from: b */
    public final Object f257815b = new Object();

    /* renamed from: c */
    public final Set f257816c = C58758qx.m90653k();

    /* renamed from: d */
    public boolean f257817d = false;

    /* renamed from: f */
    private final C90931ca f257818f;

    /* renamed from: g */
    private C92441e f257819g;

    public C92443g(C90931ca caVar, Iterable iterable) {
        this.f257818f = caVar;
        this.f257814a = C58597ky.m90211b(iterable);
    }

    /* renamed from: c */
    public final void mo87123c(boolean z) {
        synchronized (this.f257815b) {
            for (C84314m a : this.f257814a) {
                C59317ae.m92163a(a);
            }
            this.f257814a.clear();
            this.f257816c.clear();
            C92441e eVar = this.f257819g;
            if (eVar != null) {
                eVar.mo54583c(C118919a.m197405c());
                this.f257819g.mo54584d(z);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final void mo87124d() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f257815b
            monitor-enter(r0)
            boolean r1 = r10.f257817d     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x001e
            com.google.common.f.e r1 = f257813e     // Catch:{ all -> 0x00cb }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x00cb }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00cb }
            r2 = 12781(0x31ed, float:1.791E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x00cb }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00cb }
            java.lang.String r2 = "Already polling"
            r1.mo56386p(r2)     // Catch:{ all -> 0x00cb }
            int r1 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x00cb }
        L_0x001e:
            r1 = 1
            r10.f257817d = r1     // Catch:{ all -> 0x00cb }
        L_0x0021:
            com.google.android.apps.gsa.speech.k.a.e r1 = r10.f257819g     // Catch:{ all -> 0x00cb }
            r2 = 0
            if (r1 == 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f155044c     // Catch:{ all -> 0x00cb }
            boolean r1 = r1.get()     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x00c7
        L_0x002e:
            java.lang.Object r1 = r10.f257815b     // Catch:{ o -> 0x00a1 }
            monitor-enter(r1)     // Catch:{ o -> 0x00a1 }
            java.util.List r3 = r10.f257814a     // Catch:{ all -> 0x009e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x009e }
        L_0x0037:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.s3.producers.m r4 = (com.google.android.apps.gsa.p6487s3.producers.C84314m) r4     // Catch:{ all -> 0x009e }
            boolean r5 = r4.mo77850b()     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x004b
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            goto L_0x007b
        L_0x004b:
            boolean r5 = r4 instanceof com.google.android.apps.gsa.p6487s3.producers.C84309h     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x0037
            com.google.android.apps.gsa.s3.producers.h r4 = (com.google.android.apps.gsa.p6487s3.producers.C84309h) r4     // Catch:{ all -> 0x009e }
            java.util.Set r5 = r10.f257816c     // Catch:{ all -> 0x009e }
            boolean r5 = r5.contains(r4)     // Catch:{ all -> 0x009e }
            if (r5 != 0) goto L_0x0037
            com.google.common.util.concurrent.cx r5 = r4.mo77852e()     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.util.c.ca r6 = r10.f257818f     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.speech.k.a.d r7 = new com.google.android.apps.gsa.speech.k.a.d     // Catch:{ all -> 0x009e }
            r7.<init>(r5)     // Catch:{ all -> 0x009e }
            r8 = 10000(0x2710, double:4.9407E-320)
            r6.mo85137b(r7, r8)     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.util.c.ca r6 = r10.f257818f     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.speech.k.a.f r7 = new com.google.android.apps.gsa.speech.k.a.f     // Catch:{ all -> 0x009e }
            r7.<init>(r10, r4)     // Catch:{ all -> 0x009e }
            r6.mo85142g(r5, r7)     // Catch:{ all -> 0x009e }
            java.util.Set r5 = r10.f257816c     // Catch:{ all -> 0x009e }
            r5.add(r4)     // Catch:{ all -> 0x009e }
            goto L_0x0037
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            r4 = 0
        L_0x007b:
            if (r4 != 0) goto L_0x0089
            java.util.Set r1 = r10.f257816c     // Catch:{ o -> 0x00a1 }
            boolean r1 = r1.isEmpty()     // Catch:{ o -> 0x00a1 }
            if (r1 == 0) goto L_0x00c7
            r10.mo87123c(r2)     // Catch:{ o -> 0x00a1 }
            goto L_0x00c7
        L_0x0089:
            com.google.speech.h.ce r1 = r4.mo77855hj()     // Catch:{ o -> 0x00a1 }
            if (r1 == 0) goto L_0x0095
            com.google.android.apps.gsa.speech.k.a.e r3 = r10.f257819g     // Catch:{ o -> 0x00a1 }
            r3.mo54583c(r1)     // Catch:{ o -> 0x00a1 }
            goto L_0x0021
        L_0x0095:
            com.google.common.p4541l.C59317ae.m92163a(r4)     // Catch:{ o -> 0x00a1 }
            java.util.List r1 = r10.f257814a     // Catch:{ o -> 0x00a1 }
            r1.remove(r4)     // Catch:{ o -> 0x00a1 }
            goto L_0x0021
        L_0x009e:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            throw r3     // Catch:{ o -> 0x00a1 }
        L_0x00a1:
            r1 = move-exception
            com.google.android.apps.gsa.speech.k.a.e r3 = r10.f257819g     // Catch:{ all -> 0x00cb }
            r3.mo54585e(r1)     // Catch:{ all -> 0x00cb }
            java.util.List r1 = r10.f257814a     // Catch:{ all -> 0x00cb }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00cb }
        L_0x00ad:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00cb }
            com.google.android.apps.gsa.s3.producers.m r3 = (com.google.android.apps.gsa.p6487s3.producers.C84314m) r3     // Catch:{ all -> 0x00cb }
            com.google.common.p4541l.C59317ae.m92163a(r3)     // Catch:{ all -> 0x00cb }
            goto L_0x00ad
        L_0x00bd:
            java.util.List r1 = r10.f257814a     // Catch:{ all -> 0x00cb }
            r1.clear()     // Catch:{ all -> 0x00cb }
            java.util.Set r1 = r10.f257816c     // Catch:{ all -> 0x00cb }
            r1.clear()     // Catch:{ all -> 0x00cb }
        L_0x00c7:
            r10.f257817d = r2     // Catch:{ all -> 0x00cb }
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            return
        L_0x00cb:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00ce:
            throw r1
        L_0x00cf:
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7295k.p7296a.C92443g.mo87124d():void");
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C92441e eVar = new C92441e(this, aVar);
        aVar.mo20338d(eVar);
        synchronized (this.f257815b) {
            if (this.f257819g != null) {
                eVar.mo21018g();
                C57979e eVar2 = eVar.f155043b;
                return eVar2;
            }
            this.f257819g = eVar;
            mo87124d();
            return eVar.f155043b;
        }
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        synchronized (this.f257815b) {
            C92441e eVar = this.f257819g;
            if (eVar != null) {
                eVar.mo21018g();
            }
        }
    }

    public C92443g(C90931ca caVar, C84314m... mVarArr) {
        this.f257818f = caVar;
        this.f257814a = C58597ky.m90212c(mVarArr);
    }
}
