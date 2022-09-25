package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8587h;

import androidx.slice.Slice;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.e */
/* compiled from: PG */
public final /* synthetic */ class C113493e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C113495g f314233a;

    /* renamed from: b */
    public final /* synthetic */ Slice f314234b;

    public /* synthetic */ C113493e(C113495g gVar, Slice slice) {
        this.f314233a = gVar;
        this.f314234b = slice;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.g r0 = r12.f314233a
            androidx.slice.Slice r1 = r12.f314234b
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r2 = r1.f13090f
            android.net.Uri r2 = android.net.Uri.parse(r2)
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            androidx.slice.SliceItem[] r1 = r1.f13088d
            java.util.List r1 = java.util.Arrays.asList(r1)
            r4.addAll(r1)
            r1 = 0
            r5 = 0
        L_0x0021:
            boolean r6 = r4.isEmpty()
            r7 = 1
            if (r6 != 0) goto L_0x008a
            java.lang.Object r6 = r4.poll()
            androidx.slice.SliceItem r6 = (androidx.slice.SliceItem) r6
            if (r6 == 0) goto L_0x0021
            java.lang.String r8 = r6.f13092b
            int r9 = r8.hashCode()
            r10 = -1422950858(0xffffffffab2f7e36, float:-6.234764E-13)
            r11 = 2
            if (r9 == r10) goto L_0x005b
            r10 = 3556653(0x36452d, float:4.983932E-39)
            if (r9 == r10) goto L_0x0051
            r10 = 109526418(0x6873d92, float:5.0871825E-35)
            if (r9 == r10) goto L_0x0047
            goto L_0x0065
        L_0x0047:
            java.lang.String r9 = "slice"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0065
            r8 = 2
            goto L_0x0066
        L_0x0051:
            java.lang.String r9 = "text"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0065
            r8 = 0
            goto L_0x0066
        L_0x005b:
            java.lang.String r9 = "action"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0065
            r8 = 1
            goto L_0x0066
        L_0x0065:
            r8 = -1
        L_0x0066:
            if (r8 == 0) goto L_0x007e
            if (r8 == r7) goto L_0x007b
            if (r8 == r11) goto L_0x006d
            goto L_0x0021
        L_0x006d:
            androidx.slice.Slice r6 = r6.mo8596d()
            androidx.slice.SliceItem[] r6 = r6.f13088d
            java.util.List r6 = java.util.Arrays.asList(r6)
            r4.addAll(r6)
            goto L_0x0021
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x0021
        L_0x007e:
            java.lang.Object r6 = r6.f13094d
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r6 = r6.toString()
            r3.mo55395g(r6)
            goto L_0x0021
        L_0x008a:
            com.google.common.b.gu r3 = r3.mo55394f()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.a r4 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.a
            r4.<init>(r3, r5)
            java.lang.Object r3 = r0.f314240d
            monitor-enter(r3)
            java.util.Map r5 = r0.f314239c     // Catch:{ all -> 0x00fc }
            r5.put(r2, r4)     // Catch:{ all -> 0x00fc }
            monitor-exit(r3)     // Catch:{ all -> 0x00fc }
            java.util.Map r3 = r0.f314239c
            int r3 = r3.size()
            dagger.a r4 = r0.f314246j
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.p r4 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111591p) r4
            com.google.common.b.ij r4 = r4.f310327b
            int r4 = r4.size()
            if (r3 != r4) goto L_0x00ef
            java.util.concurrent.atomic.AtomicLong r3 = r0.f314243g
            long r3 = r3.get()
            r5 = -1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00ef
            com.google.android.libraries.f.a r3 = r0.f314242f
            long r3 = r3.mo26870b()
            java.util.concurrent.atomic.AtomicLong r8 = r0.f314243g
            long r8 = r8.get()
            long r3 = r3 - r8
            com.google.android.apps.gsa.search.core.i.t r8 = r0.f314247k
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249319bL
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x00ea
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.k r8 = r0.f314241e
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.r r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r.LATENCY
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7[r1] = r3
            java.lang.String r1 = "Slices content inspection e2e latency: %d ms"
            java.lang.String r1 = java.lang.String.format(r1, r7)
            r8.mo99076a(r9, r1)
        L_0x00ea:
            java.util.concurrent.atomic.AtomicLong r1 = r0.f314243g
            r1.set(r5)
        L_0x00ef:
            com.google.android.libraries.gsa.k.g r1 = r0.f314244h
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.d r3 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.d
            r3.<init>(r0, r2)
            java.lang.String r0 = "stop observing"
            r1.mo28212l(r0, r3)
            return
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fc }
            goto L_0x0100
        L_0x00ff:
            throw r0
        L_0x0100:
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8587h.C113493e.run():void");
    }
}
