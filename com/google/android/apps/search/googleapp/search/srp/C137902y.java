package com.google.android.apps.search.googleapp.search.srp;

import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.SearchRequestHandler$getParamsAndStartNetworkRequestAsync$1", mo61344c = "SearchRequestHandler.kt", mo61345d = "invokeSuspend", mo61346e = {76, 77})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.y */
/* compiled from: PG */
final class C137902y extends C69572j implements C69630p {

    /* renamed from: a */
    Object f375214a;

    /* renamed from: b */
    int f375215b;

    /* renamed from: c */
    final /* synthetic */ C137750aa f375216c;

    /* renamed from: d */
    final /* synthetic */ C137542d f375217d;

    /* renamed from: e */
    final /* synthetic */ boolean f375218e;

    /* renamed from: f */
    final /* synthetic */ C137903z f375219f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137902y(C137750aa aaVar, C137542d dVar, boolean z, C137903z zVar, C69577g gVar) {
        super(2, gVar);
        this.f375216c = aaVar;
        this.f375217d = dVar;
        this.f375218e = z;
        this.f375219f = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137902y) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r9 != r0) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007d A[LOOP:0: B:11:0x0077->B:13:0x007d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a3 A[LOOP:1: B:15:0x009d->B:17:0x00a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00eb  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f375215b
            r2 = 1
            if (r1 == 0) goto L_0x0013
            if (r1 == r2) goto L_0x000f
            java.lang.Object r0 = r8.f375214a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0046
        L_0x000f:
            p5462h.C69714l.m101134b(r9)
            goto L_0x002a
        L_0x0013:
            p5462h.C69714l.m101134b(r9)
            com.google.android.apps.search.googleapp.search.srp.e.aa r1 = r8.f375216c
            com.google.android.apps.search.googleapp.search.k.a.d r9 = r8.f375217d
            boolean r3 = r8.f375218e
            r8.f375215b = r2
            r4 = 0
            r5 = 0
            r7 = 28
            r2 = r9
            r6 = r8
            java.lang.Object r9 = com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa.m223912c(r1, r2, r3, r4, r5, r6, r7)
            if (r9 == r0) goto L_0x00f3
        L_0x002a:
            com.google.android.libraries.web.base.h r9 = (com.google.android.libraries.web.base.C43257h) r9
            com.google.android.apps.search.googleapp.search.srp.z r1 = r8.f375219f
            com.google.android.apps.search.googleapp.config.d r1 = r1.f375222c
            com.google.common.util.concurrent.cx r1 = r1.mo111320a()
            java.lang.String r2 = "userAgentHelper.userAgent"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r8.f375214a = r9
            r2 = 2
            r8.f375215b = r2
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r8)
            if (r1 == r0) goto L_0x00f3
            r0 = r9
            r9 = r1
        L_0x0046:
            java.lang.String r9 = (java.lang.String) r9
            com.google.common.b.gv r1 = new com.google.common.b.gv
            r1.<init>()
            java.lang.String r2 = "User-Agent"
            com.google.frameworks.client.data.android.ad r2 = com.google.frameworks.client.data.android.C61362ad.m93870b(r2)
            r1.mo55419c(r2, r9)
            r9 = r0
            com.google.android.libraries.web.base.h r9 = (com.google.android.libraries.web.base.C43257h) r9
            com.google.common.b.hd r2 = r9.mo46353d()
            java.lang.String r3 = "loadUrlParams.additionalHttpHeaders()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r4 = r2.size()
            int r4 = p5462h.p5463a.C69505av.m100860b(r4)
            r3.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0077:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0095
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            com.google.frameworks.client.data.android.ad r5 = com.google.frameworks.client.data.android.C61362ad.m93870b(r5)
            java.lang.Object r4 = r4.getValue()
            r3.put(r5, r4)
            goto L_0x0077
        L_0x0095:
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x009d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00b5
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r1.mo55456j(r4, r3)
            goto L_0x009d
        L_0x00b5:
            com.google.common.b.gw r1 = r1.mo55417a()
            java.lang.String r2 = "builder<HttpHeaderKey, S…     )\n          .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.apps.search.googleapp.search.srp.z r2 = r8.f375219f
            com.google.android.apps.search.googleapp.search.srp.x r3 = new com.google.android.apps.search.googleapp.search.srp.x
            java.lang.String r4 = r9.mo46356f()
            java.lang.String r5 = "loadUrlParams.url()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.android.apps.search.googleapp.search.srp.z r5 = r8.f375219f
            com.google.android.apps.search.googleapp.search.i.ae r5 = r5.f375220a
            java.lang.String r9 = r9.mo46356f()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            com.google.android.apps.search.googleapp.search.srp.z r6 = r8.f375219f
            com.google.android.libraries.web.base.t r6 = r6.f375221b
            com.google.android.libraries.web.profile.Profile r6 = r6.mo46386d()
            com.google.common.util.concurrent.ay r9 = r5.mo113780b(r9, r1, r6)
            if (r9 == 0) goto L_0x00eb
            r3.<init>(r4, r9)
            r2.f375224e = r3
            return r0
        L_0x00eb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r9.<init>(r0)
            throw r9
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.C137902y.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137902y(this.f375216c, this.f375217d, this.f375218e, this.f375219f, gVar);
    }
}
