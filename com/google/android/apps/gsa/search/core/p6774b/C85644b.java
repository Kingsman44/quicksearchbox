package com.google.android.apps.gsa.search.core.p6774b;

import com.google.android.apps.gsa.search.core.p6519al.p6686d.C85273a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58162n;
import com.google.p4500cm.p4518d.C58177a;
import com.google.p4500cm.p4518d.C58186c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.b.b */
/* compiled from: PG */
public final class C85644b {

    /* renamed from: a */
    private static final Comparator f231483a = C85643a.f231482a;

    /* renamed from: b */
    private final List f231484b = new ArrayList();

    /* renamed from: c */
    private C58186c f231485c;

    /* renamed from: d */
    private final C85273a f231486d;

    /* renamed from: e */
    private final Object f231487e = new Object();

    public C85644b(C85273a aVar) {
        this.f231486d = aVar;
    }

    /* renamed from: e */
    private static boolean m137427e(C58177a aVar) {
        return ((C58186c) aVar.instance).f155572f.size() > 0;
    }

    /* renamed from: a */
    public final int mo79121a() {
        int size;
        synchronized (this.f231487e) {
            size = this.f231484b.size();
        }
        return size;
    }

    /* renamed from: b */
    public final void mo79122b(C58177a aVar, boolean z, boolean z2) {
        if (z) {
            mo79123c();
        }
        synchronized (this.f231487e) {
            this.f231484b.add(aVar);
        }
        C58186c cVar = (C58186c) aVar.instance;
        if ((cVar.f155567a & 1024) != 0) {
            C58162n nVar = cVar.f155574h;
            if (nVar == null) {
                nVar = C58162n.f155498e;
            }
            if (nVar.f155503d == 33 && z2) {
                mo79123c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019c, code lost:
        if (r0.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019e, code lost:
        r2 = r1.f231486d;
        r3 = (com.google.p4500cm.p4518d.C58189f) com.google.p4500cm.p4518d.C58190g.f155597d.createBuilder();
        r3.copyOnWrite();
        r4 = (com.google.p4500cm.p4518d.C58190g) r3.instance;
        r4.mo54680a();
        com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r4.f155601c);
        r2.mo78837c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79123c() {
        /*
            r18 = this;
            r1 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r2 = r1.f231487e
            monitor-enter(r2)
            java.util.List r3 = r1.f231484b     // Catch:{ all -> 0x01bb }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x01bb }
            if (r3 != 0) goto L_0x0197
            java.lang.Object r3 = r1.f231487e     // Catch:{ all -> 0x01bb }
            monitor-enter(r3)     // Catch:{ all -> 0x01bb }
            java.util.List r4 = r1.f231484b     // Catch:{ all -> 0x0194 }
            java.util.Comparator r5 = f231483a     // Catch:{ all -> 0x0194 }
            java.util.Collections.sort(r4, r5)     // Catch:{ all -> 0x0194 }
            java.util.List r4 = r1.f231484b     // Catch:{ all -> 0x0194 }
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0194 }
            com.google.cm.d.a r4 = (com.google.p4500cm.p4518d.C58177a) r4     // Catch:{ all -> 0x0194 }
            boolean r4 = m137427e(r4)     // Catch:{ all -> 0x0194 }
            if (r4 != 0) goto L_0x0070
            java.util.List r4 = r1.f231484b     // Catch:{ all -> 0x0194 }
            int r4 = r4.size()     // Catch:{ all -> 0x0194 }
            r7 = 1
        L_0x0032:
            if (r7 >= r4) goto L_0x0050
            java.util.List r8 = r1.f231484b     // Catch:{ all -> 0x0194 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ all -> 0x0194 }
            com.google.cm.d.a r8 = (com.google.p4500cm.p4518d.C58177a) r8     // Catch:{ all -> 0x0194 }
            boolean r9 = m137427e(r8)     // Catch:{ all -> 0x0194 }
            if (r9 == 0) goto L_0x004d
            java.util.List r4 = r1.f231484b     // Catch:{ all -> 0x0194 }
            r4.remove(r7)     // Catch:{ all -> 0x0194 }
            java.util.List r4 = r1.f231484b     // Catch:{ all -> 0x0194 }
            r4.add(r5, r8)     // Catch:{ all -> 0x0194 }
            goto L_0x0050
        L_0x004d:
            int r7 = r7 + 1
            goto L_0x0032
        L_0x0050:
            java.util.List r4 = r1.f231484b     // Catch:{ all -> 0x0194 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0194 }
            com.google.cm.d.a r4 = (com.google.p4500cm.p4518d.C58177a) r4     // Catch:{ all -> 0x0194 }
            boolean r4 = m137427e(r4)     // Catch:{ all -> 0x0194 }
            if (r4 != 0) goto L_0x0070
            com.google.cm.d.c r4 = r1.f231485c     // Catch:{ all -> 0x0194 }
            if (r4 != 0) goto L_0x0065
            monitor-exit(r3)     // Catch:{ all -> 0x0194 }
            goto L_0x0161
        L_0x0065:
            java.util.List r7 = r1.f231484b     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bn r4 = r4.toBuilder()     // Catch:{ all -> 0x0194 }
            com.google.cm.d.a r4 = (com.google.p4500cm.p4518d.C58177a) r4     // Catch:{ all -> 0x0194 }
            r7.add(r5, r4)     // Catch:{ all -> 0x0194 }
        L_0x0070:
            java.util.List r4 = r1.f231484b     // Catch:{ all -> 0x0194 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0194 }
            com.google.cm.d.a r4 = (com.google.p4500cm.p4518d.C58177a) r4     // Catch:{ all -> 0x0194 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r7 = (com.google.p4500cm.p4518d.C58186c) r7     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r8 = com.google.p4500cm.p4518d.C58186c.f155565i     // Catch:{ all -> 0x0194 }
            int r8 = r7.f155567a     // Catch:{ all -> 0x0194 }
            r8 = r8 & -9
            r7.f155567a = r8     // Catch:{ all -> 0x0194 }
            r8 = 0
            r7.f155571e = r8     // Catch:{ all -> 0x0194 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r7 = (com.google.p4500cm.p4518d.C58186c) r7     // Catch:{ all -> 0x0194 }
            r8 = 0
            r7.f155574h = r8     // Catch:{ all -> 0x0194 }
            int r8 = r7.f155567a     // Catch:{ all -> 0x0194 }
            r8 = r8 & -1025(0xfffffffffffffbff, float:NaN)
            r7.f155567a = r8     // Catch:{ all -> 0x0194 }
            long r8 = r7.f155570d     // Catch:{ all -> 0x0194 }
            long r10 = r7.f155569c     // Catch:{ all -> 0x0194 }
            java.util.List r7 = r1.f231484b     // Catch:{ all -> 0x0194 }
            int r7 = r7.size()     // Catch:{ all -> 0x0194 }
            r12 = 1
        L_0x00a6:
            if (r12 >= r7) goto L_0x0158
            java.util.List r13 = r1.f231484b     // Catch:{ all -> 0x0194 }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ all -> 0x0194 }
            com.google.cm.d.a r13 = (com.google.p4500cm.p4518d.C58177a) r13     // Catch:{ all -> 0x0194 }
            long r14 = (long) r12     // Catch:{ all -> 0x0194 }
            long r14 = r14 + r8
            r13.copyOnWrite()     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r5 = r13.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r5 = (com.google.p4500cm.p4518d.C58186c) r5     // Catch:{ all -> 0x0194 }
            int r6 = r5.f155567a     // Catch:{ all -> 0x0194 }
            r6 = r6 | 4
            r5.f155567a = r6     // Catch:{ all -> 0x0194 }
            r5.f155570d = r14     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r5 = (com.google.p4500cm.p4518d.C58186c) r5     // Catch:{ all -> 0x0194 }
            long r5 = r5.f155570d     // Catch:{ all -> 0x0194 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r14 = (com.google.p4500cm.p4518d.C58186c) r14     // Catch:{ all -> 0x0194 }
            int r15 = r14.f155567a     // Catch:{ all -> 0x0194 }
            r15 = r15 | 8
            r14.f155567a = r15     // Catch:{ all -> 0x0194 }
            r14.f155571e = r5     // Catch:{ all -> 0x0194 }
            com.google.cm.a.c.a.a.n r5 = r14.f155574h     // Catch:{ all -> 0x0194 }
            if (r5 != 0) goto L_0x00dc
            com.google.cm.a.c.a.a.n r5 = com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58162n.f155498e     // Catch:{ all -> 0x0194 }
        L_0x00dc:
            if (r5 == 0) goto L_0x012e
            int r6 = r5.f155502c     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r14 = r4.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r14 = (com.google.p4500cm.p4518d.C58186c) r14     // Catch:{ all -> 0x0194 }
            com.google.protobuf.cq r14 = r14.f155572f     // Catch:{ all -> 0x0194 }
            int r14 = r14.size()     // Catch:{ all -> 0x0194 }
            if (r6 < 0) goto L_0x0100
            if (r6 >= r14) goto L_0x0100
            com.google.protobuf.bv r14 = r4.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r14 = (com.google.p4500cm.p4518d.C58186c) r14     // Catch:{ all -> 0x0194 }
            com.google.protobuf.cq r14 = r14.f155572f     // Catch:{ all -> 0x0194 }
            java.lang.Object r6 = r14.get(r6)     // Catch:{ all -> 0x0194 }
            com.google.cm.a.c.a.a.p r6 = (com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58164p) r6     // Catch:{ all -> 0x0194 }
            int r6 = r6.f155507b     // Catch:{ all -> 0x0194 }
            int r14 = r5.f155501b     // Catch:{ all -> 0x0194 }
            if (r6 == r14) goto L_0x012e
        L_0x0100:
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ all -> 0x0194 }
            com.google.cm.a.c.a.a.m r5 = (com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58161m) r5     // Catch:{ all -> 0x0194 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.a.c.a.a.n r6 = (com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58162n) r6     // Catch:{ all -> 0x0194 }
            int r14 = r6.f155500a     // Catch:{ all -> 0x0194 }
            r14 = r14 | 2
            r6.f155500a = r14     // Catch:{ all -> 0x0194 }
            r14 = -1
            r6.f155502c = r14     // Catch:{ all -> 0x0194 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r6 = r13.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r6 = (com.google.p4500cm.p4518d.C58186c) r6     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x0194 }
            com.google.cm.a.c.a.a.n r5 = (com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58162n) r5     // Catch:{ all -> 0x0194 }
            r5.getClass()     // Catch:{ all -> 0x0194 }
            r6.f155574h = r5     // Catch:{ all -> 0x0194 }
            int r5 = r6.f155567a     // Catch:{ all -> 0x0194 }
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r6.f155567a = r5     // Catch:{ all -> 0x0194 }
        L_0x012e:
            boolean r5 = m137427e(r13)     // Catch:{ all -> 0x0194 }
            r6 = 1
            if (r6 != r5) goto L_0x0136
            r4 = r13
        L_0x0136:
            com.google.protobuf.bv r5 = r13.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r5 = (com.google.p4500cm.p4518d.C58186c) r5     // Catch:{ all -> 0x0194 }
            long r14 = r5.f155569c     // Catch:{ all -> 0x0194 }
            r16 = 1
            long r10 = r10 + r16
            long r10 = java.lang.Math.max(r14, r10)     // Catch:{ all -> 0x0194 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0194 }
            com.google.protobuf.bv r5 = r13.instance     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r5 = (com.google.p4500cm.p4518d.C58186c) r5     // Catch:{ all -> 0x0194 }
            int r13 = r5.f155567a     // Catch:{ all -> 0x0194 }
            r13 = r13 | 2
            r5.f155567a = r13     // Catch:{ all -> 0x0194 }
            r5.f155569c = r10     // Catch:{ all -> 0x0194 }
            int r12 = r12 + 1
            r5 = 0
            goto L_0x00a6
        L_0x0158:
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0194 }
            com.google.cm.d.c r4 = (com.google.p4500cm.p4518d.C58186c) r4     // Catch:{ all -> 0x0194 }
            r1.f231485c = r4     // Catch:{ all -> 0x0194 }
            monitor-exit(r3)     // Catch:{ all -> 0x0194 }
        L_0x0161:
            java.util.List r3 = r1.f231484b     // Catch:{ all -> 0x01bb }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x01bb }
            com.google.cm.d.a r3 = (com.google.p4500cm.p4518d.C58177a) r3     // Catch:{ all -> 0x01bb }
            boolean r3 = m137427e(r3)     // Catch:{ all -> 0x01bb }
            if (r3 != 0) goto L_0x0172
            monitor-exit(r2)     // Catch:{ all -> 0x01bb }
            return
        L_0x0172:
            java.util.List r3 = r1.f231484b     // Catch:{ all -> 0x01bb }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x01bb }
        L_0x0178:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01bb }
            if (r4 == 0) goto L_0x018e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01bb }
            com.google.cm.d.a r4 = (com.google.p4500cm.p4518d.C58177a) r4     // Catch:{ all -> 0x01bb }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x01bb }
            com.google.cm.d.c r4 = (com.google.p4500cm.p4518d.C58186c) r4     // Catch:{ all -> 0x01bb }
            r0.add(r4)     // Catch:{ all -> 0x01bb }
            goto L_0x0178
        L_0x018e:
            java.util.List r3 = r1.f231484b     // Catch:{ all -> 0x01bb }
            r3.clear()     // Catch:{ all -> 0x01bb }
            goto L_0x0197
        L_0x0194:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0194 }
            throw r0     // Catch:{ all -> 0x01bb }
        L_0x0197:
            monitor-exit(r2)     // Catch:{ all -> 0x01bb }
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01ba
            com.google.android.apps.gsa.search.core.al.d.a r2 = r1.f231486d
            com.google.cm.d.g r3 = com.google.p4500cm.p4518d.C58190g.f155597d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.cm.d.f r3 = (com.google.p4500cm.p4518d.C58189f) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.cm.d.g r4 = (com.google.p4500cm.p4518d.C58190g) r4
            r4.mo54680a()
            com.google.protobuf.cq r4 = r4.f155601c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r4)
            r2.mo78837c(r3)
        L_0x01ba:
            return
        L_0x01bb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01bb }
            goto L_0x01bf
        L_0x01be:
            throw r0
        L_0x01bf:
            goto L_0x01be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6774b.C85644b.mo79123c():void");
    }

    /* renamed from: d */
    public final boolean mo79124d() {
        boolean isEmpty;
        synchronized (this.f231487e) {
            isEmpty = this.f231484b.isEmpty();
        }
        return isEmpty;
    }
}
