package com.google.android.apps.gsa.searchbox.p6944c;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.c.f */
/* compiled from: PG */
public final /* synthetic */ class C88602f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C88607k f239445a;

    /* renamed from: b */
    public final /* synthetic */ C41642a f239446b;

    /* renamed from: c */
    public final /* synthetic */ List f239447c;

    /* renamed from: d */
    public final /* synthetic */ boolean f239448d;

    public /* synthetic */ C88602f(C88607k kVar, C41642a aVar, List list, boolean z) {
        this.f239445a = kVar;
        this.f239446b = aVar;
        this.f239447c = list;
        this.f239448d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            com.google.android.apps.gsa.searchbox.c.k r2 = r1.f239445a
            com.google.android.libraries.searchbox.shared.b.a r0 = r1.f239446b
            java.util.List r3 = r1.f239447c
            boolean r4 = r1.f239448d
            java.util.List r5 = r2.f239474f
            boolean r5 = r5.isEmpty()
            r7 = -1
            r8 = 1
            if (r5 != 0) goto L_0x00c3
            monitor-enter(r2)
            java.util.Map r5 = r2.f239471c     // Catch:{ all -> 0x00c0 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x00c0 }
            if (r5 == 0) goto L_0x0038
            java.util.Map r5 = r2.f239471c     // Catch:{ all -> 0x00c0 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x00c0 }
            com.google.android.apps.gsa.searchbox.c.j r5 = (com.google.android.apps.gsa.searchbox.p6944c.C88606j) r5     // Catch:{ all -> 0x00c0 }
            com.google.android.libraries.searchbox.root.a r16 = new com.google.android.libraries.searchbox.root.a     // Catch:{ all -> 0x00c0 }
            java.util.List r11 = r5.mo82259a()     // Catch:{ all -> 0x00c0 }
            android.os.Bundle r12 = r5.f239460b     // Catch:{ all -> 0x00c0 }
            r13 = 0
            boolean r14 = r5.f239463e     // Catch:{ all -> 0x00c0 }
            com.google.at.h.d.a.at r15 = r5.f239465g     // Catch:{ all -> 0x00c0 }
            r10 = r16
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00c0 }
            goto L_0x003a
        L_0x0038:
            r16 = 0
        L_0x003a:
            r5 = r16
            monitor-exit(r2)     // Catch:{ all -> 0x00c0 }
            if (r5 == 0) goto L_0x00c3
            java.util.List r10 = r2.f239474f
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x0046:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00c4
            java.lang.Object r12 = r10.next()
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.g r12 = (com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a.C116998g) r12
            com.google.android.apps.gsa.search.core.i.t r13 = r12.f324797a
            com.google.android.apps.gsa.shared.m.f r14 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250814af
            long r13 = r13.mo79743a(r14)
            int r14 = (int) r13
            com.google.android.apps.gsa.search.core.i.t r13 = r12.f324797a
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250117U
            boolean r13 = r13.mo79746e(r15)
            if (r13 == 0) goto L_0x007e
            r13 = r0
            com.google.android.apps.gsa.searchbox.c.t r13 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r13
            android.os.Bundle r15 = r13.f239561f
            java.lang.String r9 = "cs::on_focus"
            boolean r9 = r15.getBoolean(r9)
            if (r9 != 0) goto L_0x007c
            android.os.Bundle r9 = r13.f239561f
            java.lang.String r13 = "cs::on_focus_fallback"
            boolean r9 = r9.getBoolean(r13)
            if (r9 == 0) goto L_0x007e
        L_0x007c:
            r9 = 1
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            if (r14 == 0) goto L_0x00b8
            if (r9 == 0) goto L_0x0084
            goto L_0x00b8
        L_0x0084:
            java.util.List r9 = r5.f108836a
            java.util.Iterator r9 = r9.iterator()
            r13 = 0
        L_0x008b:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x00a2
            java.lang.Object r15 = r9.next()
            com.google.android.libraries.searchbox.root.RootSuggestion r15 = (com.google.android.libraries.searchbox.root.RootSuggestion) r15
            int r15 = r15.f108910k
            if (r15 == 0) goto L_0x009f
            r6 = 35
            if (r15 != r6) goto L_0x008b
        L_0x009f:
            int r13 = r13 + 1
            goto L_0x008b
        L_0x00a2:
            if (r13 < r14) goto L_0x00b8
            com.google.android.apps.gsa.searchbox.c.a.c r6 = r12.f324799c
            r6.mo82196p(r0)
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.d r6 = r12.f324798b
            monitor-enter(r6)
            boolean r9 = r6.f324795a     // Catch:{ all -> 0x00b5 }
            monitor-exit(r6)     // Catch:{ all -> 0x00b5 }
            if (r8 == r9) goto L_0x00b3
            r6 = 1
            goto L_0x00b9
        L_0x00b3:
            r6 = 2
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b5 }
            throw r0
        L_0x00b8:
            r6 = -1
        L_0x00b9:
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r11 = java.lang.Math.max(r11, r6)
            goto L_0x0046
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c0 }
            throw r0
        L_0x00c3:
            r11 = 0
        L_0x00c4:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r11 != 0) goto L_0x00f0
            r4 = r0
            com.google.android.apps.gsa.searchbox.c.t r4 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r4
            com.google.android.apps.gsa.shared.search.Query r4 = r4.f239556a
            java.lang.String r4 = r4.mo84352bk()
            int r4 = r4.length()
            int r5 = r2.f239478j
            if (r4 >= r5) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r8 = 0
        L_0x00db:
            com.google.android.libraries.gsa.k.g r4 = r2.f239475g
            if (r8 == 0) goto L_0x00e2
            int r5 = r2.f239481m
            goto L_0x00e4
        L_0x00e2:
            int r5 = r2.f239482n
        L_0x00e4:
            long r5 = (long) r5
            com.google.android.apps.gsa.searchbox.c.g r7 = new com.google.android.apps.gsa.searchbox.c.g
            r7.<init>(r2, r0, r3, r8)
            java.lang.String r0 = "LongTimeoutRequest"
            r4.mo28213m(r0, r5, r7)
            return
        L_0x00f0:
            if (r11 != r7) goto L_0x00fd
            if (r4 == 0) goto L_0x00f7
            int r4 = r2.f239483o
            goto L_0x00f9
        L_0x00f7:
            int r4 = r2.f239484p
        L_0x00f9:
            r2.mo82264m(r0, r3, r4)
            return
        L_0x00fd:
            r5 = 2
            if (r11 != r5) goto L_0x010c
            boolean r3 = com.google.android.apps.gsa.searchbox.p6944c.C88607k.m143219n(r3)
            if (r3 == 0) goto L_0x010b
            com.google.android.apps.gsa.searchbox.c.a.c r2 = r2.f239473e
            r2.mo82192l(r0)
        L_0x010b:
            return
        L_0x010c:
            if (r4 == 0) goto L_0x0111
            int r4 = r2.f239479k
            goto L_0x0113
        L_0x0111:
            int r4 = r2.f239480l
        L_0x0113:
            r2.mo82264m(r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.C88602f.run():void");
    }
}
