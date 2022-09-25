package com.google.android.apps.search.podcasts.autodownload;

import com.google.android.apps.search.podcasts.p10576l.C140450al;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.k */
/* compiled from: PG */
final class C139975k extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140450al f380462a;

    /* renamed from: b */
    final /* synthetic */ C139977m f380463b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139975k(C140450al alVar, C139977m mVar) {
        super(1);
        this.f380462a = alVar;
        this.f380463b = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r0.f380474j.f178301a.contains(java.lang.Integer.valueOf(r0.f380473i.getSimCarrierId())) != false) goto L_0x007a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo5761a(java.lang.Object r5) {
        /*
            r4 = this;
            com.google.android.apps.search.podcasts.b.g.x r5 = (com.google.android.apps.search.podcasts.p10550b.p10557g.C140160x) r5
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            java.util.Map r0 = r5.f380824a
            java.util.Collection r0 = r0.values()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0017
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0017
            goto L_0x00b1
        L_0x0017:
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b1
            java.lang.Object r1 = r0.next()
            com.google.android.apps.gsa.staticplugins.cl.b.s r1 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s) r1
            boolean r1 = r1.f273465m
            if (r1 == 0) goto L_0x001b
            com.google.android.apps.search.podcasts.l.al r0 = r4.f380462a
            com.google.android.apps.search.podcasts.l.t r0 = r0.f381525k
            if (r0 != 0) goto L_0x0033
            com.google.android.apps.search.podcasts.l.t r0 = com.google.android.apps.search.podcasts.p10576l.C140508t.f381626c
        L_0x0033:
            boolean r0 = r0.f381629b
            if (r0 == 0) goto L_0x007a
            com.google.android.apps.search.podcasts.autodownload.m r0 = r4.f380463b
            android.net.ConnectivityManager r1 = r0.f380467c
            boolean r1 = r1.isActiveNetworkMetered()
            if (r1 == 0) goto L_0x007a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L_0x0070
            android.net.ConnectivityManager r1 = r0.f380467c
            android.net.Network r2 = r1.getActiveNetwork()
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r2)
            if (r1 == 0) goto L_0x0070
            r2 = 25
            boolean r1 = r1.hasCapability(r2)
            if (r1 == 0) goto L_0x0070
            com.google.protos.m.a.b r1 = r0.f380474j
            com.google.protobuf.ch r1 = r1.f178301a
            android.telephony.TelephonyManager r0 = r0.f380473i
            int r0 = r0.getSimCarrierId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0070
            goto L_0x007a
        L_0x0070:
            androidx.work.y r5 = new androidx.work.y
            r5.<init>()
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            goto L_0x00bc
        L_0x007a:
            com.google.android.apps.search.podcasts.autodownload.m r0 = r4.f380463b
            java.util.Map r5 = r5.f380824a
            com.google.android.apps.search.podcasts.b.b.ao r1 = r0.f380471g
            com.google.apps.tiktok.concurrent.aj r1 = r1.f380561d
            com.google.common.util.concurrent.cx r1 = r1.mo50395b()
            com.google.android.apps.search.podcasts.autodownload.d r2 = new com.google.android.apps.search.podcasts.autodownload.d
            r2.<init>(r0)
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228945c(r1, r2)
            java.util.concurrent.Executor r2 = r0.f380466b
            com.google.android.apps.search.podcasts.autodownload.f r3 = new com.google.android.apps.search.podcasts.autodownload.f
            r3.<init>(r0)
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228947e(r1, r2, r3)
            java.util.concurrent.Executor r2 = r0.f380466b
            com.google.android.apps.search.podcasts.autodownload.g r3 = new com.google.android.apps.search.podcasts.autodownload.g
            r3.<init>(r0)
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228947e(r1, r2, r3)
            java.util.concurrent.Executor r2 = r0.f380466b
            com.google.android.apps.search.podcasts.autodownload.i r3 = new com.google.android.apps.search.podcasts.autodownload.i
            r3.<init>(r0, r5)
            com.google.common.util.concurrent.cx r5 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228947e(r1, r2, r3)
            goto L_0x00bc
        L_0x00b1:
            androidx.work.z r5 = new androidx.work.z
            androidx.work.m r0 = androidx.work.C4632m.f14549a
            r5.<init>(r0)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
        L_0x00bc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.autodownload.C139975k.mo5761a(java.lang.Object):java.lang.Object");
    }
}
