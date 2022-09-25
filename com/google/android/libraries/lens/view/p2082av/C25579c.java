package com.google.android.libraries.lens.view.p2082av;

import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26865h;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.lens.view.av.c */
/* compiled from: PG */
public final class C25579c {

    /* renamed from: a */
    private static final C58974d f69604a = C58974d.m91135i("SyncRendering");

    /* renamed from: b */
    private C25578b f69605b;

    /* renamed from: c */
    private int f69606c;

    /* renamed from: d */
    private boolean f69607d;

    /* renamed from: e */
    private C26865h f69608e;

    public C25579c() {
        mo30664d();
    }

    /* renamed from: j */
    private final synchronized void m47173j() {
        this.f69606c = 0;
        this.f69607d = false;
    }

    /* renamed from: a */
    public final synchronized int mo30661a() {
        int size;
        C25577a aVar = this.f69605b.f69603a;
        size = aVar.f69599b.size();
        Iterator it = aVar.f69599b.keySet().iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            C28097c cVar = (C28097c) aVar.f69599b.get(l);
            cVar.getClass();
            Integer valueOf = Integer.valueOf(cVar.f76486d);
            it.remove();
            aVar.f69600c.remove(valueOf);
            aVar.f69601d.remove(l);
        }
        C58838bb.m90883r(aVar.f69599b.isEmpty());
        return size;
    }

    /* renamed from: b */
    public final synchronized C28097c mo30662b(long j) {
        return (C28097c) this.f69605b.f69603a.f69599b.get(Long.valueOf(j));
    }

    /* renamed from: c */
    public final synchronized void mo30663c(C28097c cVar) {
        C25577a aVar = this.f69605b.f69603a;
        long j = cVar.f76484b;
        int i = cVar.f76486d;
        if (aVar.f69599b.size() < 6) {
            TreeMap treeMap = aVar.f69599b;
            Long valueOf = Long.valueOf(j);
            if (!treeMap.containsKey(valueOf) && !aVar.f69599b.containsValue(cVar)) {
                HashSet hashSet = aVar.f69600c;
                Integer valueOf2 = Integer.valueOf(i);
                if (!hashSet.contains(valueOf2)) {
                    Long l = aVar.f69599b.isEmpty() ? null : (Long) aVar.f69599b.lastKey();
                    if (l != null) {
                        if (j <= l.longValue()) {
                            throw new IllegalArgumentException(String.format("*****SyncRendering:put[%d] BAD ts: %d last: %d (%s)", new Object[]{valueOf2, valueOf, l, aVar.f69599b}));
                        }
                    }
                    TreeMap treeMap2 = aVar.f69599b;
                    Long valueOf3 = Long.valueOf(j);
                    treeMap2.put(valueOf3, cVar);
                    aVar.f69600c.add(valueOf2);
                    aVar.f69601d.put(valueOf3, Long.valueOf(System.nanoTime()));
                }
            }
        }
        throw new IllegalStateException(String.format("*****SyncRendering:put OVERFLOW/COLLISION] ts: (%d, %d) (%s)", new Object[]{Long.valueOf(j), Integer.valueOf(i), aVar.f69599b}));
    }

    /* renamed from: d */
    public final synchronized void mo30664d() {
        this.f69605b = new C25578b();
        m47173j();
    }

    /* renamed from: e */
    public final synchronized boolean mo30665e(long j) {
        boolean z;
        C25577a aVar = this.f69605b.f69603a;
        z = aVar.f69599b.size() >= 6;
        if (z) {
            ((C58970a) ((C58970a) C25577a.f69598a.mo56224b()).mo56372aa(50176)).mo56359L("*****SyncRendering:NO_SPACE_LEFT[%d] OVERFLOW with %d (%s)", Integer.valueOf(aVar.f69602e), Long.valueOf(j), aVar.f69599b.keySet());
            aVar.f69602e++;
        }
        return z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: f */
    public final synchronized boolean mo30666f(com.google.android.libraries.lens.view.p2173u.C28097c r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.libraries.lens.view.av.b r0 = r8.f69605b     // Catch:{ all -> 0x00d1 }
            com.google.android.libraries.lens.view.av.a r0 = r0.f69603a     // Catch:{ all -> 0x00d1 }
            java.util.TreeMap r1 = r0.f69599b     // Catch:{ all -> 0x00d1 }
            long r2 = r9.f76484b     // Catch:{ all -> 0x00d1 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00d1 }
            com.google.android.libraries.lens.view.u.c r1 = (com.google.android.libraries.lens.view.p2173u.C28097c) r1     // Catch:{ all -> 0x00d1 }
            r2 = 0
            if (r1 != 0) goto L_0x0017
            goto L_0x0068
        L_0x0017:
            r3 = 1
            if (r1 != r9) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            com.google.common.base.C58838bb.m90883r(r1)     // Catch:{ all -> 0x00d1 }
            long r4 = r9.f76484b     // Catch:{ all -> 0x00d1 }
            java.util.TreeMap r1 = r0.f69599b     // Catch:{ all -> 0x00d1 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00d1 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x00d1 }
            if (r1 == 0) goto L_0x00bc
            java.util.TreeMap r1 = r0.f69599b     // Catch:{ all -> 0x00d1 }
            java.util.SortedMap r1 = r1.headMap(r4)     // Catch:{ all -> 0x00d1 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x00d1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d1 }
        L_0x003c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d1 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x00d1 }
            java.util.TreeMap r4 = r0.f69599b     // Catch:{ all -> 0x00d1 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x00d1 }
            com.google.android.libraries.lens.view.u.c r4 = (com.google.android.libraries.lens.view.p2173u.C28097c) r4     // Catch:{ all -> 0x00d1 }
            r4.getClass()
            int r4 = r4.f76486d     // Catch:{ all -> 0x00d1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00d1 }
            r1.remove()     // Catch:{ all -> 0x00d1 }
            java.util.HashSet r5 = r0.f69600c     // Catch:{ all -> 0x00d1 }
            r5.remove(r4)     // Catch:{ all -> 0x00d1 }
            java.util.HashMap r4 = r0.f69601d     // Catch:{ all -> 0x00d1 }
            r4.remove(r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x003c
        L_0x0067:
            r2 = 1
        L_0x0068:
            if (r2 == 0) goto L_0x00ba
            long r0 = r9.f76484b     // Catch:{ all -> 0x00d1 }
            monitor-enter(r8)     // Catch:{ all -> 0x00d1 }
            com.google.android.libraries.lens.view.h.h.a.h r9 = r8.f69608e     // Catch:{ all -> 0x00b7 }
            if (r9 != 0) goto L_0x0073
            monitor-exit(r8)     // Catch:{ all -> 0x00b7 }
            goto L_0x00ba
        L_0x0073:
            com.google.android.libraries.lens.view.av.b r3 = r8.f69605b     // Catch:{ all -> 0x00b7 }
            com.google.android.libraries.lens.view.av.a r3 = r3.f69603a     // Catch:{ all -> 0x00b7 }
            java.util.HashMap r4 = r3.f69601d     // Catch:{ all -> 0x00b7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.Object r1 = r4.get(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x00b7 }
            if (r1 != 0) goto L_0x0088
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x00b7 }
            goto L_0x00a3
        L_0x0088:
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00b7 }
            long r6 = r1.longValue()     // Catch:{ all -> 0x00b7 }
            java.util.HashMap r1 = r3.f69601d     // Catch:{ all -> 0x00b7 }
            r1.remove(r0)     // Catch:{ all -> 0x00b7 }
            long r4 = r4 - r6
            float r0 = (float) r4     // Catch:{ all -> 0x00b7 }
            r1 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x00b7 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ all -> 0x00b7 }
        L_0x00a3:
            monitor-exit(r8)     // Catch:{ all -> 0x00b7 }
            com.google.android.libraries.lens.view.h.h.a.u r9 = r9.f73186a     // Catch:{ all -> 0x00d1 }
            boolean r1 = r0.mo56113h()     // Catch:{ all -> 0x00d1 }
            if (r1 == 0) goto L_0x00b1
            com.google.android.libraries.lens.view.h.e.ah r1 = r9.f73237Z     // Catch:{ all -> 0x00d1 }
            r1.mo32146a(r0)     // Catch:{ all -> 0x00d1 }
        L_0x00b1:
            com.google.android.libraries.lens.view.h.e.ah r9 = r9.f73237Z     // Catch:{ all -> 0x00d1 }
            r9.mo32147b()     // Catch:{ all -> 0x00d1 }
            goto L_0x00ba
        L_0x00b7:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00b7 }
            throw r9     // Catch:{ all -> 0x00d1 }
        L_0x00ba:
            monitor-exit(r8)
            return r2
        L_0x00bc:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d1 }
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00d1 }
            r1[r2] = r4     // Catch:{ all -> 0x00d1 }
            java.util.TreeMap r0 = r0.f69599b     // Catch:{ all -> 0x00d1 }
            r1[r3] = r0     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "*****SyncRendering:release ts: %d not found (%s)"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x00d1 }
            r9.<init>(r0)     // Catch:{ all -> 0x00d1 }
            throw r9     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x00d5
        L_0x00d4:
            throw r9
        L_0x00d5:
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2082av.C25579c.mo30666f(com.google.android.libraries.lens.view.u.c):boolean");
    }

    /* renamed from: g */
    public final synchronized boolean mo30667g() {
        if (this.f69607d) {
            boolean z = this.f69606c < 0;
            this.f69607d = z;
            if (!z) {
                ((C58970a) ((C58970a) f69604a.mo56224b()).mo56372aa(50179)).mo56386p("***** skippingSyncRendering DISABLED");
            }
        }
        return this.f69607d;
    }

    /* renamed from: h */
    public final synchronized void mo30668h(C26865h hVar) {
        this.f69608e = hVar;
    }

    /* renamed from: i */
    public final synchronized void mo30669i() {
        this.f69606c++;
    }
}
