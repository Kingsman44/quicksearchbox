package com.google.android.apps.search.podcasts.p10588n;

import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.n.x */
/* compiled from: PG */
final class C140695x extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140697z f382105a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f382106b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140695x(C140697z zVar, C60870cx cxVar) {
        super(1);
        this.f382105a = zVar;
        this.f382106b = cxVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.protos.ac.a.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo5761a(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r0 = "result"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)
            com.google.android.apps.search.podcasts.n.z r0 = r7.f382105a
            com.google.android.apps.search.podcasts.a.c r0 = r0.f382108a
            com.google.common.util.concurrent.cx r1 = r7.f382106b
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r1)
            java.lang.String r2 = "getDone(recentEpisodeIdsFuture)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0050
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.google.android.apps.gsa.staticplugins.cl.b.bk r4 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk) r4
            java.lang.String r5 = r4.f273379b
            java.lang.Object r5 = r8.get(r5)
            com.google.at.j.a.da r5 = (com.google.p4017at.p4082j.p4083a.C54402da) r5
            r6 = 0
            if (r5 == 0) goto L_0x004a
            com.google.protobuf.dn r5 = r5.f142892c
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            if (r5 == 0) goto L_0x004a
            java.lang.String r4 = r4.f273381d
            java.lang.Object r4 = r5.get(r4)
            r6 = r4
            com.google.protos.ac.a.j r6 = (com.google.protos.p4757ac.p4758a.C63111j) r6
        L_0x004a:
            if (r6 == 0) goto L_0x0021
            r2.add(r3)
            goto L_0x0021
        L_0x0050:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = p5462h.p5463a.C69540x.m100804k(r2, r3)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x005f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00bf
            java.lang.Object r3 = r2.next()
            com.google.android.apps.gsa.staticplugins.cl.b.bk r3 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk) r3
            java.lang.String r4 = r3.f273379b
            java.lang.Object r4 = r8.get(r4)
            p5462h.p5473f.p5475b.C69664n.m101058d(r4)
            com.google.at.j.a.da r4 = (com.google.p4017at.p4082j.p4083a.C54402da) r4
            com.google.protobuf.dn r4 = r4.f142892c
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            java.lang.String r5 = r3.f273381d
            java.lang.Object r4 = r4.get(r5)
            p5462h.p5473f.p5475b.C69664n.m101058d(r4)
            com.google.protos.ac.a.j r4 = (com.google.protos.p4757ac.p4758a.C63111j) r4
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.protos.ac.a.i r4 = (com.google.protos.p4757ac.p4758a.C63110i) r4
            java.lang.String r3 = r3.f273379b
            java.lang.Object r3 = r8.get(r3)
            p5462h.p5473f.p5475b.C69664n.m101058d(r3)
            com.google.at.j.a.da r3 = (com.google.p4017at.p4082j.p4083a.C54402da) r3
            com.google.protos.ac.a.l r3 = r3.f142891b
            if (r3 != 0) goto L_0x009e
            com.google.protos.ac.a.l r3 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x009e:
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.protos.ac.a.j r5 = (com.google.protos.p4757ac.p4758a.C63111j) r5
            r3.getClass()
            r5.f170360k = r3
            int r3 = r5.f170350a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r5.f170350a = r3
            com.google.protobuf.bv r3 = r4.build()
            java.lang.String r4 = "result[it.feedUrl]!!.epi…\n                .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.protos.ac.a.j r3 = (com.google.protos.p4757ac.p4758a.C63111j) r3
            r1.add(r3)
            goto L_0x005f
        L_0x00bf:
            com.google.common.util.concurrent.cx r8 = r0.mo115362b(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10588n.C140695x.mo5761a(java.lang.Object):java.lang.Object");
    }
}
