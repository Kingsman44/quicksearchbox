package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b;

import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138476f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.silk.p3162a.p3172j.C40604a;
import com.google.android.libraries.web.coordinator.C43737c;
import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.apps.tiktok.cache.C46401p;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.b.r */
/* compiled from: PG */
public final class C138423r implements C40604a {

    /* renamed from: a */
    public final C138413h f376533a;

    /* renamed from: b */
    private final C21370a f376534b;

    /* renamed from: c */
    private final C46401p f376535c;

    /* renamed from: d */
    private final C138476f f376536d;

    /* renamed from: e */
    private final C60887da f376537e;

    /* renamed from: f */
    private final String f376538f;

    /* renamed from: g */
    private final boolean f376539g;

    /* renamed from: h */
    private final boolean f376540h;

    /* renamed from: i */
    private final boolean f376541i;

    /* renamed from: j */
    private final C43737c f376542j;

    public C138423r(C21370a aVar, C138476f fVar, C44077a aVar2, C138413h hVar, String str, boolean z, boolean z2, C60887da daVar, C43737c cVar, boolean z3) {
        this.f376534b = aVar;
        this.f376536d = fVar;
        this.f376533a = hVar;
        this.f376535c = aVar2.f114747a.mo50325a("search_query_name", C137542d.f374085g);
        this.f376537e = daVar;
        this.f376538f = str;
        this.f376539g = z;
        this.f376540h = z2;
        this.f376542j = cVar;
        this.f376541i = z3;
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42544a(com.google.p395al.p417d.p418a.C8575bc r6) {
        /*
            r5 = this;
            boolean r0 = r5.f376539g
            if (r0 == 0) goto L_0x0108
            boolean r0 = r5.f376540h
            r1 = 0
            if (r0 == 0) goto L_0x0013
            com.google.protobuf.cq r0 = r6.f29694c
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0013
            goto L_0x00df
        L_0x0013:
            com.google.android.apps.search.googleapp.search.k.a.d r0 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d.f374085g
            boolean r0 = r5.f376541i
            if (r0 == 0) goto L_0x0026
            com.google.android.libraries.web.coordinator.c r0 = r5.f376542j
            java.lang.Object r0 = r0.mo5768a()
            com.google.android.apps.search.googleapp.search.k.b r0 = (com.google.android.apps.search.googleapp.search.p10420k.C137543b) r0
            com.google.android.apps.search.googleapp.search.k.a.d r0 = r0.mo113804a()
            goto L_0x0036
        L_0x0026:
            com.google.apps.tiktok.cache.p r0 = r5.f376535c
            com.google.protobuf.at r2 = com.google.protobuf.C62912at.f169862a
            com.google.apps.tiktok.cache.ah r0 = r0.mo50378a(r2)
            if (r0 != 0) goto L_0x0032
            goto L_0x00df
        L_0x0032:
            java.lang.Object r0 = r0.f121384a
            com.google.android.apps.search.googleapp.search.k.a.d r0 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r0
        L_0x0036:
            int r2 = r0.f374087a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x00df
            com.google.android.apps.search.googleapp.search.e.g r2 = r0.f374092f
            if (r2 != 0) goto L_0x0042
            com.google.android.apps.search.googleapp.search.e.g r2 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x0042:
            java.lang.String r2 = r2.f373771c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x004c
            goto L_0x00df
        L_0x004c:
            com.google.android.apps.search.googleapp.search.e.g r0 = r0.f374092f
            if (r0 != 0) goto L_0x0052
            com.google.android.apps.search.googleapp.search.e.g r0 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x0052:
            java.lang.String r0 = r0.f373770b
            java.lang.String r0 = r0.trim()
            com.google.android.apps.search.googleapp.search.suggest.o r1 = com.google.android.apps.search.googleapp.search.suggest.C138133o.f375822o
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.n r1 = (com.google.android.apps.search.googleapp.search.suggest.C138132n) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.o r2 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r2
            r0.getClass()
            int r3 = r2.f375824a
            r3 = r3 | 1
            r2.f375824a = r3
            r2.f375825b = r0
            int r0 = r0.length()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.o r2 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r2
            int r3 = r2.f375824a
            r3 = r3 | 8
            r2.f375824a = r3
            r2.f375828e = r0
            com.google.android.libraries.f.a r0 = r5.f376534b
            long r2 = r0.mo26871c()
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.o r0 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r0
            int r4 = r0.f375824a
            r4 = r4 | 16
            r0.f375824a = r4
            r0.f375829f = r2
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.SEARCH_RESULTS
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.o r2 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r2
            int r0 = r0.f379715p
            r2.f375830g = r0
            int r0 = r2.f375824a
            r0 = r0 | 32
            r2.f375824a = r0
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.o r0 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r0
            r6.getClass()
            r0.f375831h = r6
            int r2 = r0.f375824a
            r2 = r2 | 64
            r0.f375824a = r2
            com.google.protobuf.cq r0 = r6.f29694c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00d8
            java.lang.String r0 = r5.f376538f
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.o r2 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r2
            int r3 = r2.f375824a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r2.f375824a = r3
            r2.f375835l = r0
        L_0x00d8:
            com.google.protobuf.bv r0 = r1.build()
            r1 = r0
            com.google.android.apps.search.googleapp.search.suggest.o r1 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r1
        L_0x00df:
            if (r1 == 0) goto L_0x0108
            java.lang.String r6 = com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b.C138413h.m224824b(r6)
            java.lang.String r0 = "ofp"
            com.google.common.b.hd r6 = com.google.common.p4522b.C58495hd.m89900n(r0, r6)
            com.google.android.apps.search.googleapp.search.suggest.sources.a.f r0 = r5.f376536d
            com.google.common.util.concurrent.cx r6 = r0.mo114290a(r1, r6)
            com.google.android.apps.search.googleapp.search.suggest.sources.a.b.q r0 = new com.google.android.apps.search.googleapp.search.suggest.sources.a.b.q
            r0.<init>(r5, r1)
            com.google.common.util.concurrent.da r1 = r5.f376537e
            com.google.common.util.concurrent.s r0 = com.google.apps.tiktok.tracing.C47810es.m84966f(r0)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60922j.m93045h(r6, r0, r1)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Failed to fetch and cache On Focus response."
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r6, r1, r0)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b.C138423r.mo42544a(com.google.al.d.a.bc):void");
    }
}
