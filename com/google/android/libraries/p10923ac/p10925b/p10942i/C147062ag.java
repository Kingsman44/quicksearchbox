package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.base.C58838bb;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.libraries.ac.b.i.ag */
/* compiled from: PG */
abstract class C147062ag implements C147070ao, C147077av {

    /* renamed from: a */
    final Set f397086a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b */
    final Set f397087b = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: c */
    final Set f397088c = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: d */
    final Set f397089d = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: e */
    protected volatile SQLiteDatabase f397090e;

    /* renamed from: f */
    protected volatile boolean f397091f;

    /* renamed from: g */
    final /* synthetic */ C147073ar f397092g;

    public C147062ag(C147073ar arVar) {
        this.f397092g = arVar;
    }

    /* renamed from: a */
    public final C147073ar mo123887a() {
        return this.f397092g;
    }

    /* renamed from: b */
    public final void mo123888b(C147076au auVar) {
        C58838bb.m90884s(!this.f397091f, "Transaction is closed");
        synchronized (this.f397088c) {
            this.f397088c.add(auVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    final void mo123889c(java.util.Set r6) {
        /*
            r5 = this;
            monitor-enter(r6)
            java.util.Iterator r0 = r6.iterator()     // Catch:{ all -> 0x003c }
        L_0x0005:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            com.google.android.libraries.ac.b.i.a r1 = (com.google.android.libraries.p10923ac.p10925b.p10942i.C147055a) r1     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r1.f397054a     // Catch:{ RuntimeException -> 0x001c }
            monitor-enter(r2)     // Catch:{ RuntimeException -> 0x001c }
            r1.mo123867m()     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            goto L_0x0005
        L_0x0019:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r1     // Catch:{ RuntimeException -> 0x001c }
        L_0x001c:
            r1 = move-exception
            com.google.android.libraries.ac.b.i.ar r2 = r5.f397092g     // Catch:{ all -> 0x003c }
            dagger.a r2 = r2.f397112b     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x003c }
            com.google.android.libraries.ac.d.b.b.d.m r2 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r2     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "Close listeners failed"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x003c }
            r2.mo124063f(r3, r1, r4)     // Catch:{ all -> 0x003c }
            com.google.android.libraries.ac.b.i.ar r1 = r5.f397092g     // Catch:{ all -> 0x003c }
            dagger.a r1 = r1.f397115e     // Catch:{ all -> 0x003c }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x003c }
            com.google.android.libraries.ac.d.b.b.d.a r1 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a) r1     // Catch:{ all -> 0x003c }
            goto L_0x0005
        L_0x003a:
            monitor-exit(r6)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003f:
            throw r0
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10942i.C147062ag.mo123889c(java.util.Set):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo123890d(Set set) {
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    ((C147076au) it.next()).mo123792a();
                } catch (RuntimeException e) {
                    ((C147256m) this.f397092g.f397112b.mo27525b()).mo124063f("Close listeners failed", e, new Object[0]);
                    C147244a aVar = (C147244a) this.f397092g.f397115e.mo27525b();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo123891e(C147055a aVar) {
        C58838bb.m90884s(!this.f397091f, "Transaction is closed");
        synchronized (this.f397087b) {
            this.f397087b.add(aVar);
        }
    }
}
