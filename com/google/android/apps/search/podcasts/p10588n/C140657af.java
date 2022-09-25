package com.google.android.apps.search.podcasts.p10588n;

import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.n.af */
/* compiled from: PG */
final class C140657af extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C60870cx f382029a;

    /* renamed from: b */
    final /* synthetic */ C140659ah f382030b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140657af(C60870cx cxVar, C140659ah ahVar) {
        super(1);
        this.f382029a = cxVar;
        this.f382030b = ahVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.google.protos.ac.a.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo5761a(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r0 = "result"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            com.google.common.util.concurrent.cx r0 = r8.f382029a
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.apps.search.podcasts.n.ah r1 = r8.f382030b
            com.google.android.apps.search.podcasts.a.c r1 = r1.f382032a
            java.lang.String r2 = "queuedEpisodeIds"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0021:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.google.android.apps.gsa.staticplugins.cl.b.j r5 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j) r5
            java.lang.String r6 = r5.f273429b
            java.lang.Object r6 = r9.get(r6)
            com.google.at.j.a.da r6 = (com.google.p4017at.p4082j.p4083a.C54402da) r6
            r7 = 0
            if (r6 == 0) goto L_0x004a
            com.google.protobuf.dn r6 = r6.f142892c
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            if (r6 == 0) goto L_0x004a
            java.lang.String r5 = r5.f273431d
            java.lang.Object r5 = r6.get(r5)
            r7 = r5
            com.google.protos.ac.a.j r7 = (com.google.protos.p4757ac.p4758a.C63111j) r7
        L_0x004a:
            if (r7 == 0) goto L_0x0021
            r2.add(r4)
            goto L_0x0021
        L_0x0050:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p5462h.p5463a.C69540x.m100804k(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x005f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00bf
            java.lang.Object r4 = r2.next()
            com.google.android.apps.gsa.staticplugins.cl.b.j r4 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j) r4
            java.lang.String r5 = r4.f273429b
            java.lang.Object r5 = r9.get(r5)
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            com.google.at.j.a.da r5 = (com.google.p4017at.p4082j.p4083a.C54402da) r5
            com.google.protobuf.dn r5 = r5.f142892c
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            java.lang.String r6 = r4.f273431d
            java.lang.Object r5 = r5.get(r6)
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            com.google.protos.ac.a.j r5 = (com.google.protos.p4757ac.p4758a.C63111j) r5
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.protos.ac.a.i r5 = (com.google.protos.p4757ac.p4758a.C63110i) r5
            java.lang.String r4 = r4.f273429b
            java.lang.Object r4 = r9.get(r4)
            p5462h.p5473f.p5475b.C69664n.m101058d(r4)
            com.google.at.j.a.da r4 = (com.google.p4017at.p4082j.p4083a.C54402da) r4
            com.google.protos.ac.a.l r4 = r4.f142891b
            if (r4 != 0) goto L_0x009e
            com.google.protos.ac.a.l r4 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x009e:
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.protos.ac.a.j r6 = (com.google.protos.p4757ac.p4758a.C63111j) r6
            r4.getClass()
            r6.f170360k = r4
            int r4 = r6.f170350a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r6.f170350a = r4
            com.google.protobuf.bv r4 = r5.build()
            java.lang.String r5 = "result[it.feedUrl]!!.epi…\n                .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.protos.ac.a.j r4 = (com.google.protos.p4757ac.p4758a.C63111j) r4
            r3.add(r4)
            goto L_0x005f
        L_0x00bf:
            com.google.common.util.concurrent.cx r9 = r1.mo115362b(r3)
            com.google.android.apps.search.podcasts.n.ae r1 = new com.google.android.apps.search.podcasts.n.ae
            com.google.android.apps.search.podcasts.n.ah r2 = r8.f382030b
            r1.<init>(r0, r2)
            com.google.common.util.concurrent.cx r9 = com.google.android.apps.search.podcasts.p10601r.C140989k.m228948f(r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10588n.C140657af.mo5761a(java.lang.Object):java.lang.Object");
    }
}
