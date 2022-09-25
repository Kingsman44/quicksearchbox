package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9951d;

import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.d.j */
/* compiled from: PG */
public final /* synthetic */ class C131174j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131175k f358698a;

    /* renamed from: b */
    public final /* synthetic */ List f358699b;

    public /* synthetic */ C131174j(C131175k kVar, List list) {
        this.f358698a = kVar;
        this.f358699b = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r13) {
        /*
            r12 = this;
            com.google.android.apps.search.assistant.verticals.ambient.p.d.k r0 = r12.f358698a
            java.util.List r1 = r12.f358699b
            android.location.Location r13 = (android.location.Location) r13
            if (r13 != 0) goto L_0x001c
            com.google.common.f.a.d r13 = r0.f358700a
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r0 = "Null location returned by Location Supplier"
            r1 = 39062(0x9896, float:5.4738E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r13).mo56372aa(r1)).mo56386p(r0)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x011b
        L_0x001c:
            com.google.android.apps.search.assistant.verticals.ambient.p.c.g r2 = r0.f358701b
            android.net.ConnectivityManager r3 = r2.f358680b
            r4 = 2
            r5 = 3
            r6 = 0
            r7 = 1
            r8 = 4
            if (r3 != 0) goto L_0x0037
            com.google.common.f.a.d r2 = r2.f358679a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Failed to retrieve network status because the ConnectivityManager is null."
            r9 = 39052(0x988c, float:5.4724E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r9)).mo56386p(r3)
        L_0x0035:
            r2 = 4
            goto L_0x0060
        L_0x0037:
            android.net.Network r3 = r3.getActiveNetwork()
            if (r3 != 0) goto L_0x003e
        L_0x003d:
            goto L_0x0035
        L_0x003e:
            android.net.ConnectivityManager r2 = r2.f358680b
            android.net.NetworkCapabilities r2 = r2.getNetworkCapabilities(r3)
            if (r2 != 0) goto L_0x0047
            goto L_0x003d
        L_0x0047:
            boolean r3 = r2.hasTransport(r6)
            if (r3 == 0) goto L_0x0059
            r3 = 18
            boolean r2 = r2.hasCapability(r3)
            if (r2 != 0) goto L_0x0057
            r2 = 2
            goto L_0x0060
        L_0x0057:
            r2 = 1
            goto L_0x0060
        L_0x0059:
            boolean r2 = r2.hasTransport(r7)
            if (r2 == 0) goto L_0x0035
            r2 = 3
        L_0x0060:
            if (r2 != r8) goto L_0x0068
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x011b
        L_0x0068:
            float r3 = r13.getSpeed()
            double r8 = (double) r3
            java.lang.Double r3 = r0.f358704e
            double r10 = r3.doubleValue()
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0081
            if (r2 == r7) goto L_0x007b
            if (r2 != r4) goto L_0x0082
        L_0x007b:
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x011b
        L_0x0081:
            r5 = r2
        L_0x0082:
            double r2 = r13.getLatitude()
            double r8 = r13.getLongitude()
            com.google.common.g.at r13 = com.google.common.p4535g.C59127at.m91610b(r2, r8)
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r1 = r1.iterator()
        L_0x0096:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00da
            java.lang.Object r3 = r1.next()
            com.google.android.libraries.mdi.download.al r3 = (com.google.android.libraries.mdi.download.C28706al) r3
            java.lang.String r4 = ":"
            com.google.common.base.cf r4 = com.google.common.base.C58869cf.m90938d(r4)
            com.google.common.base.cf r4 = r4.mo56151a()
            java.lang.String r3 = r3.f77979b
            java.lang.Iterable r3 = r4.mo56153g(r3)
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0096
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.common.g.t r4 = com.google.common.p4535g.C59226t.m91922M(r3)     // Catch:{ NumberFormatException -> 0x00ca }
            r2.mo55395g(r4)     // Catch:{ NumberFormatException -> 0x00ca }
            goto L_0x0096
        L_0x00ca:
            r4 = move-exception
            com.google.common.f.a.d r8 = r0.f358700a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r9 = "Invalid location slice id = %s"
            r10 = 39059(0x9893, float:5.4733E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56382g(r4)).mo56372aa(r10)).mo56389s(r9, r3)
            goto L_0x0096
        L_0x00da:
            int r5 = r5 + -1
            if (r5 == 0) goto L_0x00ef
            if (r5 == r7) goto L_0x00ef
            com.google.common.b.gu r1 = r2.mo55394f()
            java.lang.Long r0 = r0.f358702c
            long r2 = r0.longValue()
            com.google.common.b.gu r13 = com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9951d.C131175k.m213688a(r1, r13, r2)
            goto L_0x00fd
        L_0x00ef:
            com.google.common.b.gu r1 = r2.mo55394f()
            java.lang.Long r0 = r0.f358703d
            long r2 = r0.longValue()
            com.google.common.b.gu r13 = com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9951d.C131175k.m213688a(r1, r13, r2)
        L_0x00fd:
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            int r1 = r13.size()
        L_0x0105:
            if (r6 >= r1) goto L_0x0117
            java.lang.Object r2 = r13.get(r6)
            com.google.common.g.t r2 = (com.google.common.p4535g.C59226t) r2
            java.lang.String r2 = r2.mo56655A()
            r0.mo55395g(r2)
            int r6 = r6 + 1
            goto L_0x0105
        L_0x0117:
            com.google.common.b.gu r13 = r0.mo55394f()
        L_0x011b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9951d.C131174j.apply(java.lang.Object):java.lang.Object");
    }
}
