package com.google.android.libraries.onegoogle.accountmanagement;

import android.util.Log;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2347c.C30168b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.j */
/* compiled from: PG */
public final class C30281j implements C30283l, C30253a {

    /* renamed from: e */
    private static final String f81879e = "j";

    /* renamed from: a */
    public final CopyOnWriteArrayList f81880a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public C58833ax f81881b = C58836b.f156633a;

    /* renamed from: c */
    public boolean f81882c;

    /* renamed from: d */
    public C30168b f81883d;

    /* renamed from: f */
    private final Object f81884f = new Object();

    /* renamed from: g */
    private final Map f81885g = new HashMap();

    /* renamed from: h */
    private final C30158c f81886h;

    /* renamed from: i */
    private C58485gu f81887i = C58485gu.m89845m();

    public C30281j(C30158c cVar) {
        this.f81886h = cVar;
    }

    /* renamed from: c */
    public static Object m56319c(C30168b bVar) {
        if (bVar != null) {
            return bVar.mo35573c();
        }
        return null;
    }

    /* renamed from: f */
    private static void m56320f(String str) {
        String str2 = f81879e;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, str);
        }
    }

    /* renamed from: g */
    private final void m56321g() {
        Iterator it = this.f81880a.iterator();
        while (it.hasNext()) {
            ((C30282k) it.next()).mo18106c(m56319c(this.f81883d));
        }
    }

    /* renamed from: h */
    private final void m56322h() {
        if (!this.f81882c) {
            this.f81882c = true;
            Iterator it = this.f81880a.iterator();
            while (it.hasNext()) {
                ((C30282k) it.next()).mo18104a();
            }
        }
    }

    /* renamed from: a */
    public final Object mo35765a() {
        return m56319c(this.f81883d);
    }

    /* renamed from: b */
    public final C58485gu mo35794b() {
        C58485gu f;
        C58480gp gpVar = new C58480gp(4);
        synchronized (this.f81884f) {
            C58801sm G = this.f81887i.listIterator(0);
            while (G.hasNext()) {
                gpVar.mo55395g(((C30168b) G.next()).mo35573c());
            }
            f = gpVar.mo55394f();
        }
        return f;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* renamed from: d */
    public final void mo35795d(com.google.common.p4522b.C58485gu r15) {
        /*
            r14 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.common.b.gu r2 = r14.mo35794b()
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r15.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "setAvailableAccounts() %d -> %d."
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            m56320f(r0)
            com.google.android.libraries.onegoogle.account.a.c r0 = r14.f81886h
            com.google.common.b.gp r1 = new com.google.common.b.gp
            r2 = 4
            r1.<init>(r2)
            java.util.Iterator r15 = r15.iterator()
        L_0x0034:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r15.next()
            com.google.android.libraries.onegoogle.account.c.b r2 = com.google.android.libraries.onegoogle.account.p2347c.C30168b.m56044b(r2, r0)
            r1.mo55395g(r2)
            goto L_0x0034
        L_0x0046:
            com.google.common.b.gu r15 = r1.mo55394f()
            java.lang.Object r0 = r14.f81884f
            monitor-enter(r0)
            com.google.common.b.gu r1 = r14.f81887i     // Catch:{ all -> 0x015e }
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r15)     // Catch:{ all -> 0x015e }
            monitor-exit(r0)     // Catch:{ all -> 0x015e }
            if (r1 == 0) goto L_0x005f
            java.lang.String r15 = "availableAccounts hasn't changed, returning."
            m56320f(r15)
            r14.m56322h()
            return
        L_0x005f:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r15
            com.google.common.b.pq r1 = (com.google.common.p4522b.C58724pq) r1
            int r1 = r1.f156474d
            r2 = 0
        L_0x006a:
            if (r2 >= r1) goto L_0x0082
            java.lang.Object r5 = r15.get(r2)
            com.google.android.libraries.onegoogle.account.c.b r5 = (com.google.android.libraries.onegoogle.account.p2347c.C30168b) r5
            com.google.android.libraries.onegoogle.account.a.c r6 = r14.f81886h
            java.lang.Object r7 = r5.mo35573c()
            java.lang.String r6 = r6.mo35552c(r7)
            r0.put(r6, r5)
            int r2 = r2 + 1
            goto L_0x006a
        L_0x0082:
            com.google.android.libraries.onegoogle.account.c.b r1 = r14.f81883d
            if (r1 == 0) goto L_0x00a0
            com.google.android.libraries.onegoogle.account.a.c r2 = r14.f81886h
            java.lang.Object r5 = r1.mo35573c()
            java.lang.String r2 = r2.mo35552c(r5)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.libraries.onegoogle.account.c.b r2 = (com.google.android.libraries.onegoogle.account.p2347c.C30168b) r2
            r14.f81883d = r2
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a0
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            java.lang.Object r2 = r14.f81884f
            monitor-enter(r2)
            r14.mo35794b()     // Catch:{ all -> 0x015b }
            java.util.Map r5 = r14.f81885g     // Catch:{ all -> 0x015b }
            com.google.android.libraries.onegoogle.accountmanagement.i r6 = com.google.android.libraries.onegoogle.accountmanagement.C30280i.f81876a     // Catch:{ all -> 0x015b }
            boolean r7 = r6.f81877b     // Catch:{ all -> 0x015b }
            r8 = -1
            r10 = 0
            if (r7 == 0) goto L_0x00b3
            goto L_0x00c7
        L_0x00b3:
            long r11 = r6.f81878c     // Catch:{ all -> 0x015b }
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00f3
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x015b }
            long r6 = r6.f81878c     // Catch:{ all -> 0x015b }
            long r11 = r11 - r6
            r6 = 5000(0x1388, double:2.4703E-320)
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x00c7
            goto L_0x00f3
        L_0x00c7:
            int r6 = r0.size()     // Catch:{ all -> 0x015b }
            int r7 = r5.size()     // Catch:{ all -> 0x015b }
            int r7 = r7 + r4
            if (r6 == r7) goto L_0x00d3
            goto L_0x00f3
        L_0x00d3:
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x015b }
            r6.<init>(r0)     // Catch:{ all -> 0x015b }
            java.util.Set r7 = r6.keySet()     // Catch:{ all -> 0x015b }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x015b }
            r7.removeAll(r5)     // Catch:{ all -> 0x015b }
            int r5 = r6.size()     // Catch:{ all -> 0x015b }
            if (r5 == r4) goto L_0x00ea
            goto L_0x00f3
        L_0x00ea:
            java.util.Collection r5 = r6.values()     // Catch:{ all -> 0x015b }
            java.lang.Object r5 = com.google.common.p4522b.C58557jl.m90133n(r5)     // Catch:{ all -> 0x015b }
            goto L_0x00f4
        L_0x00f3:
            r5 = r10
        L_0x00f4:
            com.google.android.libraries.onegoogle.account.c.b r5 = (com.google.android.libraries.onegoogle.account.p2347c.C30168b) r5     // Catch:{ all -> 0x015b }
            if (r5 == 0) goto L_0x0115
            com.google.common.base.ax r6 = r14.f81881b     // Catch:{ all -> 0x015b }
            boolean r6 = r6.mo56113h()     // Catch:{ all -> 0x015b }
            if (r6 == 0) goto L_0x0115
            com.google.common.base.ax r6 = r14.f81881b     // Catch:{ all -> 0x015b }
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ all -> 0x015b }
            com.google.android.libraries.onegoogle.accountmanagement.a.a r6 = (com.google.android.libraries.onegoogle.accountmanagement.p2349a.C30254a) r6     // Catch:{ all -> 0x015b }
            com.google.android.libraries.onegoogle.account.c.d r6 = r6.f81803a     // Catch:{ all -> 0x015b }
            java.lang.Object r7 = r5.mo35573c()     // Catch:{ all -> 0x015b }
            boolean r6 = r6.mo35583a(r7)     // Catch:{ all -> 0x015b }
            if (r6 == 0) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r10 = r5
        L_0x0116:
            r14.f81887i = r15     // Catch:{ all -> 0x015b }
            java.util.Map r15 = r14.f81885g     // Catch:{ all -> 0x015b }
            r15.clear()     // Catch:{ all -> 0x015b }
            java.util.Map r15 = r14.f81885g     // Catch:{ all -> 0x015b }
            r15.putAll(r0)     // Catch:{ all -> 0x015b }
            monitor-exit(r2)     // Catch:{ all -> 0x015b }
            if (r10 == 0) goto L_0x012e
            r14.f81883d = r10
            com.google.android.libraries.onegoogle.accountmanagement.i r15 = com.google.android.libraries.onegoogle.accountmanagement.C30280i.f81876a
            r15.f81878c = r8
            r15.f81877b = r3
            goto L_0x012f
        L_0x012e:
            r4 = r1
        L_0x012f:
            r14.m56322h()
            java.util.concurrent.CopyOnWriteArrayList r15 = r14.f81880a
            java.util.Iterator r15 = r15.iterator()
        L_0x0138:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x015a
            java.lang.Object r0 = r15.next()
            com.google.android.libraries.onegoogle.accountmanagement.k r0 = (com.google.android.libraries.onegoogle.accountmanagement.C30282k) r0
            com.google.common.b.gu r1 = r14.mo35794b()
            r0.mo35797e()
            r0.mo35784f(r1)
            if (r4 == 0) goto L_0x0138
            com.google.android.libraries.onegoogle.account.c.b r1 = r14.f81883d
            java.lang.Object r1 = m56319c(r1)
            r0.mo18106c(r1)
            goto L_0x0138
        L_0x015a:
            return
        L_0x015b:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x015b }
            throw r15
        L_0x015e:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x015e }
            goto L_0x0162
        L_0x0161:
            throw r15
        L_0x0162:
            goto L_0x0161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmanagement.C30281j.mo35795d(com.google.common.b.gu):void");
    }

    /* renamed from: e */
    public final void mo35796e(Object obj) {
        C30168b bVar;
        if (obj != null) {
            C30168b bVar2 = this.f81883d;
            String c = this.f81886h.mo35552c(obj);
            synchronized (this.f81884f) {
                bVar = (C30168b) this.f81885g.get(c);
            }
            C58838bb.m90869d(bVar != null, "Selected account must be an available account");
            this.f81883d = bVar;
            if (!bVar.equals(bVar2)) {
                m56321g();
            }
        } else if (this.f81883d != null) {
            this.f81883d = null;
            m56321g();
        }
    }
}
