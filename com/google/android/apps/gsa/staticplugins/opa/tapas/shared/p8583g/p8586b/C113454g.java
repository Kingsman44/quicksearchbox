package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.g */
/* compiled from: PG */
public final class C113454g {

    /* renamed from: a */
    public final C22871g f314142a;

    /* renamed from: b */
    public final C113453f f314143b;

    /* renamed from: c */
    public final long f314144c;

    /* renamed from: d */
    private final C113450c f314145d;

    /* renamed from: e */
    private final Object f314146e = new Object();

    /* renamed from: f */
    private final Optional f314147f;

    /* renamed from: g */
    private final C113456i f314148g;

    /* renamed from: h */
    private C113449b f314149h;

    public C113454g(C113450c cVar, C22871g gVar, Optional optional, C86124t tVar, C113456i iVar) {
        this.f314145d = cVar;
        this.f314142a = gVar;
        this.f314147f = optional;
        this.f314148g = iVar;
        this.f314143b = new C113453f(this);
        this.f314144c = tVar.mo79743a(C90063do.f249570fy);
    }

    /* renamed from: a */
    public final void mo100235a() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f314146e) {
            C113449b bVar = this.f314149h;
            if (bVar != null) {
                bVar.mo54589f(false);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final void mo100236b(com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye r9) {
        /*
            r8 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            long r0 = r9.f238917c
            java.lang.Object r0 = r8.f314146e
            monitor-enter(r0)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.b r1 = r8.f314149h     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.Object r3 = r1.f155059g     // Catch:{ all -> 0x0062 }
            monitor-enter(r3)     // Catch:{ all -> 0x0062 }
            boolean r1 = r1.f155061i     // Catch:{ all -> 0x0015 }
            monitor-exit(r3)     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0030
            goto L_0x0018
        L_0x0015:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0015 }
            throw r9     // Catch:{ all -> 0x0062 }
        L_0x0018:
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.i r1 = r8.f314148g     // Catch:{ all -> 0x0062 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f314154a     // Catch:{ all -> 0x0062 }
            r1.set(r2)     // Catch:{ all -> 0x0062 }
            j$.util.Optional r1 = r8.f314147f     // Catch:{ all -> 0x0062 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.d r3 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113451d.f314137a     // Catch:{ all -> 0x0062 }
            r1.ifPresent(r3)     // Catch:{ all -> 0x0062 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.c r1 = r8.f314145d     // Catch:{ all -> 0x0062 }
            long r3 = r9.f238917c     // Catch:{ all -> 0x0062 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.b r1 = r1.mo96324a(r3)     // Catch:{ all -> 0x0062 }
            r8.f314149h = r1     // Catch:{ all -> 0x0062 }
        L_0x0030:
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.b r1 = r8.f314149h     // Catch:{ all -> 0x0062 }
            r1.mo54591h(r9)     // Catch:{ all -> 0x0062 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.f r9 = r8.f314143b     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r9.f314140b     // Catch:{ all -> 0x0062 }
            monitor-enter(r1)     // Catch:{ all -> 0x0062 }
            com.google.common.util.concurrent.cx r3 = r9.f314139a     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x0049
            boolean r3 = r3.isDone()     // Catch:{ all -> 0x005f }
            if (r3 != 0) goto L_0x0049
            com.google.common.util.concurrent.cx r3 = r9.f314139a     // Catch:{ all -> 0x005f }
            r3.cancel(r2)     // Catch:{ all -> 0x005f }
        L_0x0049:
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.g r2 = r9.f314141c     // Catch:{ all -> 0x005f }
            com.google.android.libraries.gsa.k.g r3 = r2.f314142a     // Catch:{ all -> 0x005f }
            java.lang.String r4 = "End when inactive"
            long r5 = r2.f314144c     // Catch:{ all -> 0x005f }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.e r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.b.e     // Catch:{ all -> 0x005f }
            r7.<init>(r2)     // Catch:{ all -> 0x005f }
            com.google.common.util.concurrent.cx r2 = r3.mo28208h(r4, r5, r7)     // Catch:{ all -> 0x005f }
            r9.f314139a = r2     // Catch:{ all -> 0x005f }
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return
        L_0x005f:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            throw r9     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113454g.mo100236b(com.google.android.apps.gsa.search.shared.service.b.ye):void");
    }
}
