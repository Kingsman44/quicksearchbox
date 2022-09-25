package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.engine.geniefm.C76095a;
import com.google.android.apps.gsa.nga.engine.p6026f.C75981a;
import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6137s.C77910h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.understanding.C78979af;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.v */
/* compiled from: PG */
public final class C79039v implements C78979af {

    /* renamed from: a */
    public static final C58974d f217352a = C58974d.m91134h("GenieRewriter");

    /* renamed from: b */
    public final C76095a f217353b;

    /* renamed from: c */
    public final Set f217354c;

    /* renamed from: d */
    public final C79851ai f217355d;

    /* renamed from: e */
    public final C22871g f217356e;

    /* renamed from: f */
    public final C79863k f217357f;

    /* renamed from: g */
    private final C77910h f217358g;

    /* renamed from: h */
    private final C91142g f217359h;

    /* renamed from: i */
    private final C79018ai f217360i;

    /* renamed from: j */
    private final C79012ac f217361j;

    /* renamed from: k */
    private final C22871g f217362k;

    /* renamed from: l */
    private final C79853ak f217363l;

    /* renamed from: m */
    private final C79030m f217364m;

    /* renamed from: n */
    private final C75981a f217365n;

    /* renamed from: o */
    private final C76092h f217366o;

    public C79039v(C76095a aVar, C77910h hVar, Set set, C91142g gVar, C79851ai aiVar, C79018ai aiVar2, C79012ac acVar, C22871g gVar2, C22871g gVar3, C79863k kVar, C79853ak akVar, C79030m mVar, C76092h hVar2, C75981a aVar2) {
        this.f217353b = aVar;
        this.f217358g = hVar;
        this.f217354c = set;
        this.f217359h = gVar;
        this.f217355d = aiVar;
        this.f217360i = aiVar2;
        this.f217361j = acVar;
        this.f217356e = gVar2;
        this.f217362k = gVar3;
        this.f217357f = kVar;
        this.f217363l = akVar;
        this.f217364m = mVar;
        this.f217366o = hVar2;
        this.f217365n = aVar2;
    }

    /* renamed from: a */
    public final C80517f mo73736a() {
        return C80517f.GENIE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01c3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo73737b(com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n r13, com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n r14) {
        /*
            r12 = this;
            com.google.android.apps.gsa.shared.util.v.g r0 = r12.f217359h
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251219eg
            boolean r0 = r0.mo85405j(r1)
            if (r0 != 0) goto L_0x0013
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            return r13
        L_0x0013:
            com.google.android.apps.gsa.nga.engine.f.a r0 = r12.f217365n
            java.lang.String r1 = r13.mo71164r()
            com.google.android.apps.gsa.nga.shared.aa.n.f r2 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.GENIE
            com.google.android.apps.gsa.nga.engine.b.c.j r3 = r13.mo71150c()
            com.google.android.apps.gsa.nga.shared.v.io r3 = r3.c()
            boolean r0 = r0.mo71992c(r1, r2, r3)
            if (r0 == 0) goto L_0x0032
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            return r13
        L_0x0032:
            com.google.android.apps.gsa.nga.engine.x.k r0 = r12.f217357f
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_GENIE_REWRITING_START
            com.google.android.apps.gsa.nga.shared.v.io r2 = r14.mo71336k()
            r0.mo74237c(r1, r2)
            com.google.android.apps.gsa.nga.engine.s.h r0 = r12.f217358g
            com.google.android.apps.gsa.nga.engine.b.c.j r1 = r13.mo71150c()
            com.google.android.apps.gsa.nga.shared.v.io r1 = r1.c()
            java.util.List r0 = r0.mo72886k(r1)
            int r1 = r0.size()
            r2 = 2
            if (r1 <= r2) goto L_0x0057
            r1 = 0
            java.util.List r0 = r0.subList(r1, r2)
        L_0x0057:
            com.google.android.apps.gsa.shared.util.v.g r1 = r12.f217359h
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251217ee
            boolean r1 = r1.mo85405j(r3)
            if (r1 != 0) goto L_0x0099
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0069:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r0.next()
            com.google.android.apps.gsa.nga.shared.aa.g.ae r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r3
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.apps.gsa.nga.shared.aa.g.ad r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80412ad) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r4
            r5 = 0
            r4.f220696g = r5
            int r5 = r4.f220690a
            r5 = r5 & -17
            r4.f220690a = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.gsa.nga.shared.aa.g.ae r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r3
            r1.mo55395g(r3)
            goto L_0x0069
        L_0x0095:
            com.google.common.b.gu r0 = r1.mo55394f()
        L_0x0099:
            com.google.android.apps.gsa.nga.shared.aa.g.ae r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae.f220688p
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.g.ad r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80412ad) r1
            java.lang.String r3 = r13.mo71164r()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r4
            r3.getClass()
            int r5 = r4.f220690a
            r2 = r2 | r5
            r4.f220690a = r2
            r4.f220692c = r3
            j$.util.Optional r2 = r13.mo71158k()
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89845m()
            java.lang.Object r2 = r2.orElse(r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r1.mo74324a(r2)
            com.google.android.apps.gsa.nga.engine.x.ak r2 = r12.f217363l
            com.google.android.apps.gsa.nga.engine.b.c.j r3 = r13.mo71150c()
            com.google.android.apps.gsa.nga.shared.v.io r3 = r3.c()
            java.lang.String r2 = r2.mo74223h(r3)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r3
            r2.getClass()
            int r4 = r3.f220690a
            r4 = r4 | 64
            r3.f220690a = r4
            r3.f220698i = r2
            j$.time.Instant r2 = r13.mo71155h()
            long r2 = r2.toEpochMilli()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r4
            int r5 = r4.f220690a
            r5 = r5 | 4
            r4.f220690a = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r5
            r4.f220694e = r2
            j$.util.Optional r2 = r14.mo71340o()
            java.lang.String r3 = ""
            java.lang.Object r2 = r2.orElse(r3)
            java.lang.String r2 = (java.lang.String) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.g.ae r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r4
            r2.getClass()
            int r5 = r4.f220690a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r4.f220690a = r5
            r4.f220699j = r2
            com.google.protobuf.bv r1 = r1.build()
            r8 = r1
            com.google.android.apps.gsa.nga.shared.aa.g.ae r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae) r8
            com.google.android.apps.gsa.nga.engine.understanding.c.ai r1 = r12.f217360i
            boolean r1 = r1.mo73780a()
            java.lang.String r2 = "com.google.android.apps.photos"
            if (r1 == 0) goto L_0x01a8
            com.google.android.apps.gsa.nga.engine.understanding.c.ac r1 = r12.f217361j
            boolean r1 = r1.mo73779a()
            if (r1 != 0) goto L_0x013a
            goto L_0x014b
        L_0x013a:
            j$.util.Optional r1 = r14.mo71340o()
            java.lang.Object r1 = r1.orElse(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x014b
            goto L_0x01a8
        L_0x014b:
            r13.mo71154g()
            com.google.android.apps.gsa.nga.shared.aa.g.u r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80441u.NOT_SET
            com.google.android.apps.gsa.nga.shared.aa.g.u r1 = r13.mo71154g()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x015e
            r4 = 1
            if (r1 == r4) goto L_0x0178
            goto L_0x01a8
        L_0x015e:
            com.google.android.apps.gsa.nga.engine.understanding.c.m r1 = r12.f217364m
            com.google.android.apps.gsa.nga.shared.v.io r4 = r14.mo71336k()
            java.util.Locale r5 = r14.mo71342q()
            com.google.android.apps.gsa.nga.engine.understanding.c.l r1 = r1.mo73787a(r8, r0, r4, r5)
            com.google.android.apps.gsa.nga.engine.understanding.c.b r1 = (com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79019b) r1
            com.google.android.apps.gsa.nga.shared.aa.g.u r1 = r1.f217309a
            com.google.android.apps.gsa.nga.shared.aa.g.u r4 = com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80441u.SCREEN_NEEDED
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01a8
        L_0x0178:
            com.google.android.libraries.gsa.k.g r1 = r12.f217362k
            com.google.android.apps.gsa.nga.engine.understanding.c.ai r4 = r12.f217360i
            boolean r5 = r4.mo73780a()
            if (r5 != 0) goto L_0x018b
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92900i(r4)
            goto L_0x019d
        L_0x018b:
            com.google.android.libraries.gsa.k.g r4 = r4.f217307a
            com.google.android.apps.gsa.nga.engine.am.u.o r5 = r14.mo71332g()
            com.google.common.util.concurrent.cx r5 = r5.mo71352c()
            java.lang.String r6 = "[NGA] UniversalGenie.getScreenContext"
            com.google.android.apps.gsa.nga.engine.understanding.c.ad r7 = com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79013ad.f217302a
            com.google.common.util.concurrent.cx r4 = r4.mo28209i(r5, r6, r7)
        L_0x019d:
            java.lang.Class<java.lang.Exception> r5 = java.lang.Exception.class
            com.google.android.apps.gsa.nga.engine.understanding.c.q r6 = com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79034q.f217335a
            java.lang.String r7 = "[NGA] GenieRewriter.universalGenieFallback"
            com.google.common.util.concurrent.cx r1 = r1.mo28205e(r4, r7, r5, r6)
            goto L_0x01b0
        L_0x01a8:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x01b0:
            com.google.android.libraries.gsa.k.g r4 = r12.f217362k
            com.google.android.apps.gsa.nga.engine.understanding.c.ac r5 = r12.f217361j
            boolean r6 = r5.mo73779a()
            if (r6 != 0) goto L_0x01c3
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x01ef
        L_0x01c3:
            j$.util.Optional r6 = r14.mo71340o()
            java.lang.Object r3 = r6.orElse(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01da
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x01ef
        L_0x01da:
            com.google.android.libraries.gsa.k.g r2 = r5.f217299a
            com.google.android.apps.gsa.nga.engine.am.u.o r3 = r14.mo71332g()
            com.google.common.util.concurrent.cx r3 = r3.mo71351b()
            com.google.android.apps.gsa.nga.engine.understanding.c.w r6 = new com.google.android.apps.gsa.nga.engine.understanding.c.w
            r6.<init>(r5, r14)
            java.lang.String r5 = "[NGA] SearchBoxContext.getSearchBoxContext.fromAssistData"
            com.google.common.util.concurrent.cx r2 = r2.mo28210j(r3, r5, r6)
        L_0x01ef:
            com.google.android.apps.gsa.nga.engine.understanding.c.r r3 = com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79035r.f217336a
            java.lang.String r5 = "[NGA] GenieRewriter.searchBoxFallback"
            java.lang.Class<java.lang.Exception> r6 = java.lang.Exception.class
            com.google.common.util.concurrent.cx r6 = r4.mo28205e(r2, r5, r6, r3)
            com.google.android.apps.gsa.shared.util.v.g r2 = r12.f217359h
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251540kj
            boolean r10 = r2.mo85405j(r3)
            com.google.android.apps.gsa.nga.shared.aa.g.l r2 = com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80432l.f220749e
            com.google.protobuf.bn r2 = r2.createBuilder()
            r7 = r2
            com.google.android.apps.gsa.nga.shared.aa.g.k r7 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80431k) r7
            r7.mo74327a(r0)
            com.google.android.libraries.gsa.k.g r0 = r12.f217362k
            com.google.android.apps.gsa.nga.engine.understanding.c.s r2 = new com.google.android.apps.gsa.nga.engine.understanding.c.s
            r4 = r2
            r5 = r12
            r9 = r14
            r11 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = "[NGA] GenieRewriter.chainUniversalGenieAndSearchBoxContext"
            com.google.common.util.concurrent.cx r13 = r0.mo28210j(r1, r13, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79039v.mo73737b(com.google.android.apps.gsa.nga.engine.ab.a.n, com.google.android.apps.gsa.nga.engine.am.u.n):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final boolean mo73738c() {
        C76090f b = this.f217366o.mo72021b();
        return b.mo72041f() && C81451b.m129570a(b.mo72039e(), this.f217359h.mo85403h(C90126fx.f251552kv));
    }
}
