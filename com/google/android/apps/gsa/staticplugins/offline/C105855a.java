package com.google.android.apps.gsa.staticplugins.offline;

import android.content.Context;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.search.core.service.C86782y;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7012bb.C89401f;
import com.google.android.apps.gsa.shared.p7012bb.C89404g;
import com.google.android.apps.gsa.shared.p7012bb.C89405h;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.speech.p7312o.C92543b;
import com.google.android.apps.gsa.speech.p7312o.C92544c;
import com.google.apps.tiktok.tracing.C47535au;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4450a.C57935b;
import com.google.p4449cd.p4450a.C57936c;
import com.google.p4449cd.p4451b.C57939b;
import com.google.p4449cd.p4454e.C57968h;
import com.google.p4449cd.p4460h.p4461a.C58010af;
import com.google.p4449cd.p4460h.p4461a.C58011ag;
import com.google.p4449cd.p4460h.p4461a.C58012ah;
import com.google.p4449cd.p4460h.p4461a.C58029p;
import dagger.p5294a.C68217c;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68227m;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68249j;
import java.util.Collections;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.a */
/* compiled from: PG */
final class C105855a implements C86782y, C68249j {

    /* renamed from: A */
    private final C68283d f295382A;

    /* renamed from: B */
    private final C68283d f295383B;

    /* renamed from: C */
    private final C69464a f295384C;

    /* renamed from: D */
    private final C68283d f295385D;

    /* renamed from: E */
    private final C69464a f295386E;

    /* renamed from: F */
    private final C69464a f295387F;

    /* renamed from: G */
    private final C68283d f295388G;

    /* renamed from: H */
    private final C68283d f295389H;

    /* renamed from: I */
    private final C69464a f295390I;

    /* renamed from: J */
    private final C68283d f295391J;

    /* renamed from: K */
    private final C69464a f295392K;

    /* renamed from: L */
    private final C68283d f295393L;

    /* renamed from: M */
    private final C69464a f295394M;

    /* renamed from: N */
    private final C68283d f295395N;

    /* renamed from: O */
    private final C69464a f295396O;

    /* renamed from: P */
    private final C68283d f295397P;

    /* renamed from: Q */
    private final C68283d f295398Q;

    /* renamed from: R */
    private final C68283d f295399R;

    /* renamed from: S */
    private final C68283d f295400S;

    /* renamed from: T */
    private final C68283d f295401T;

    /* renamed from: U */
    private final C69464a f295402U;

    /* renamed from: V */
    private final C68283d f295403V;

    /* renamed from: W */
    private final C69464a f295404W;

    /* renamed from: X */
    private final C69464a f295405X;

    /* renamed from: Y */
    private final C69464a f295406Y;

    /* renamed from: Z */
    private final C69464a f295407Z;

    /* renamed from: a */
    private final C105855a f295408a = this;

    /* renamed from: aa */
    private final C69464a f295409aa;

    /* renamed from: ab */
    private final C68283d f295410ab;

    /* renamed from: ac */
    private final C69464a f295411ac;

    /* renamed from: ad */
    private final C68283d f295412ad;

    /* renamed from: ae */
    private final C69464a f295413ae;

    /* renamed from: af */
    private final C68283d f295414af;

    /* renamed from: ag */
    private final C69464a f295415ag;

    /* renamed from: ah */
    private final C68283d f295416ah;

    /* renamed from: ai */
    private final C68283d f295417ai;

    /* renamed from: b */
    private final C68283d f295418b;

    /* renamed from: c */
    private final C69464a f295419c;

    /* renamed from: d */
    private final C69464a f295420d;

    /* renamed from: e */
    private final C69464a f295421e;

    /* renamed from: f */
    private final C69464a f295422f;

    /* renamed from: g */
    private final C69464a f295423g;

    /* renamed from: h */
    private final C69464a f295424h;

    /* renamed from: i */
    private final C69464a f295425i;

    /* renamed from: j */
    private final C69464a f295426j;

    /* renamed from: k */
    private final C69464a f295427k;

    /* renamed from: l */
    private final C69464a f295428l;

    /* renamed from: m */
    private final C69464a f295429m;

    /* renamed from: n */
    private final C69464a f295430n;

    /* renamed from: o */
    private final C68283d f295431o;

    /* renamed from: p */
    private final C68283d f295432p;

    /* renamed from: q */
    private final C68283d f295433q;

    /* renamed from: r */
    private final C68283d f295434r;

    /* renamed from: s */
    private final C68283d f295435s;

    /* renamed from: t */
    private final C68283d f295436t;

    /* renamed from: u */
    private final C68283d f295437u;

    /* renamed from: v */
    private final C68283d f295438v;

    /* renamed from: w */
    private final C68283d f295439w;

    /* renamed from: x */
    private final C69464a f295440x;

    /* renamed from: y */
    private final C68283d f295441y;

    /* renamed from: z */
    private final C69464a f295442z;

    public C105855a(Context context, C90476a aVar, C90479a aVar2, String str, C86054o oVar, C86159h hVar, C89911f fVar, C91123v vVar, C89994f fVar2, C86124t tVar, C89356b bVar, C89859i iVar, Query query, C58833ax axVar, C84516aa aaVar, b bVar2, OfflineLoader offlineLoader) {
        C68220f a = C68221g.m98521a(bVar);
        this.f295419c = a;
        C89404g gVar = new C89404g(a);
        this.f295420d = gVar;
        C89405h hVar2 = new C89405h(a);
        this.f295421e = hVar2;
        C57936c cVar = new C57936c(a);
        this.f295422f = cVar;
        C58029p pVar = new C58029p(gVar, hVar2, cVar);
        this.f295423g = pVar;
        C69464a c = C68219e.m98519c(pVar);
        this.f295424h = c;
        C68220f a2 = C68221g.m98521a(this);
        this.f295425i = a2;
        C57935b bVar3 = new C57935b(a);
        this.f295426j = bVar3;
        C69464a c2 = C68219e.m98519c(new C57939b(bVar3));
        this.f295427k = c2;
        C57968h hVar3 = new C57968h(cVar, bVar3, c2);
        this.f295428l = hVar3;
        C68220f fVar3 = C68227m.f184586a;
        List c3 = C68217c.m98515c(2);
        List emptyList = Collections.emptyList();
        c3.add(C47535au.f123377a);
        c3.add(hVar3);
        C68227m mVar = new C68227m(c3, emptyList);
        this.f295429m = mVar;
        C69464a c4 = C68219e.m98519c(new C105883c(a2, mVar));
        this.f295430n = c4;
        C68283d e = C68236af.m98550e(a);
        this.f295431o = e;
        C89401f fVar4 = new C89401f(c, c4, e);
        this.f295432p = fVar4;
        C58011ag agVar = new C58011ag(c, c4, fVar4);
        this.f295433q = agVar;
        C68283d e2 = C68236af.m98550e(cVar);
        this.f295434r = e2;
        C58010af afVar = new C58010af(c, c4, agVar, e2);
        this.f295435s = afVar;
        C68283d e3 = C68236af.m98550e(hVar2);
        this.f295436t = e3;
        C68283d e4 = C68236af.m98550e(bVar3);
        this.f295437u = e4;
        C68283d e5 = C68236af.m98550e(c2);
        this.f295438v = e5;
        C69464a aVar3 = c;
        C69464a aVar4 = c4;
        C58012ah ahVar = new C58012ah(aVar3, aVar4, afVar, e3, e4, e5);
        this.f295439w = ahVar;
        C68220f a3 = C68221g.m98521a(query);
        this.f295440x = a3;
        C68283d e6 = C68236af.m98550e(a3);
        this.f295441y = e6;
        C68220f a4 = C68221g.m98521a(offlineLoader);
        this.f295442z = a4;
        C68283d e7 = C68236af.m98550e(a4);
        this.f295382A = e7;
        C58012ah ahVar2 = ahVar;
        C105903n nVar = new C105903n(aVar3, aVar4, ahVar2, e6, e7);
        this.f295383B = nVar;
        C68220f a5 = C68221g.m98521a(context);
        this.f295384C = a5;
        C68283d e8 = C68236af.m98550e(a5);
        this.f295385D = e8;
        C68220f a6 = C68221g.m98521a(fVar2);
        this.f295386E = a6;
        C92543b bVar4 = new C92543b(a3, a6);
        this.f295387F = bVar4;
        C68283d e9 = C68236af.m98550e(bVar4);
        this.f295388G = e9;
        C105903n nVar2 = nVar;
        C105902m mVar2 = r6;
        C68283d dVar = e8;
        C68283d dVar2 = e9;
        C68283d dVar3 = e8;
        C105902m mVar3 = new C105902m(aVar3, aVar4, ahVar2, nVar, dVar, e9, e7);
        this.f295389H = mVar2;
        C92544c cVar2 = new C92544c(a3, a6);
        this.f295390I = cVar2;
        C68283d e10 = C68236af.m98550e(cVar2);
        this.f295391J = e10;
        C68220f a7 = C68221g.m98521a(vVar);
        this.f295392K = a7;
        C68283d e11 = C68236af.m98550e(a7);
        C68283d dVar4 = e11;
        this.f295393L = e11;
        C68220f a8 = C68221g.m98521a(axVar);
        this.f295394M = a8;
        C68283d e12 = C68236af.m98550e(a8);
        this.f295395N = e12;
        C68220f a9 = C68221g.m98521a(tVar);
        this.f295396O = a9;
        C68283d e13 = C68236af.m98550e(a9);
        this.f295397P = e13;
        C105901l lVar = new C105901l(aVar3, aVar4, ahVar2, dVar3, e10, e11, e12, e13);
        this.f295398Q = lVar;
        C105903n nVar3 = nVar2;
        C68283d dVar5 = dVar2;
        C105900k kVar = new C105900k(aVar3, aVar4, ahVar2, nVar3, dVar3, dVar5, e7);
        this.f295399R = kVar;
        C105905p pVar2 = new C105905p(aVar3, aVar4, ahVar2, nVar3, kVar, dVar5);
        this.f295400S = pVar2;
        C105899j jVar = r6;
        C105899j jVar2 = new C105899j(aVar3, aVar4, nVar2, mVar2, lVar, pVar2);
        this.f295401T = jVar2;
        C68220f a10 = C68221g.m98521a(str);
        this.f295402U = a10;
        C68283d e14 = C68236af.m98550e(a10);
        C68283d dVar6 = e14;
        this.f295403V = e14;
        C68220f a11 = C68221g.m98521a(oVar);
        C68220f fVar5 = a11;
        this.f295404W = a11;
        C68220f a12 = C68221g.m98521a(hVar);
        C68220f fVar6 = a12;
        this.f295405X = a12;
        C68220f a13 = C68221g.m98521a(fVar);
        C68220f fVar7 = a13;
        this.f295406Y = a13;
        C68220f a14 = C68221g.m98521a(iVar);
        C68220f fVar8 = a14;
        this.f295407Z = a14;
        C68220f a15 = C68221g.m98521a(aVar);
        this.f295409aa = a15;
        C68283d e15 = C68236af.m98550e(a15);
        C68283d dVar7 = e15;
        this.f295410ab = e15;
        C68220f a16 = C68221g.m98521a(aVar2);
        this.f295411ac = a16;
        C68283d e16 = C68236af.m98550e(a16);
        C68283d dVar8 = e16;
        this.f295412ad = e16;
        C68220f a17 = C68221g.m98521a(aaVar);
        this.f295413ae = a17;
        C68283d e17 = C68236af.m98550e(a17);
        C68283d dVar9 = e17;
        this.f295414af = e17;
        C68220f a18 = C68221g.m98521a(bVar2);
        this.f295415ag = a18;
        C68283d e18 = C68236af.m98550e(a18);
        this.f295416ah = e18;
        C105904o oVar2 = new C105904o(c, c4, jVar, e8, e9, e10, dVar6, fVar5, fVar6, a9, fVar7, fVar8, dVar7, dVar8, dVar9, e18, dVar4, e7);
        this.f295417ai = oVar2;
        this.f295418b = C68236af.m98548c(oVar2, this);
    }

    /* renamed from: a */
    public final void mo29865a(boolean z) {
        C68236af.m98551f(this.f295417ai, z);
        C68236af.m98551f(this.f295416ah, z);
        C68236af.m98551f(this.f295414af, z);
        C68236af.m98551f(this.f295412ad, z);
        C68236af.m98551f(this.f295410ab, z);
        C68236af.m98551f(this.f295403V, z);
        C68236af.m98551f(this.f295401T, z);
        C68236af.m98551f(this.f295400S, z);
        C68236af.m98551f(this.f295399R, z);
        C68236af.m98551f(this.f295398Q, z);
        C68236af.m98551f(this.f295397P, z);
        C68236af.m98551f(this.f295395N, z);
        C68236af.m98551f(this.f295393L, z);
        C68236af.m98551f(this.f295391J, z);
        C68236af.m98551f(this.f295389H, z);
        C68236af.m98551f(this.f295388G, z);
        C68236af.m98551f(this.f295385D, z);
        C68236af.m98551f(this.f295383B, z);
        C68236af.m98551f(this.f295382A, z);
        C68236af.m98551f(this.f295441y, z);
        C68236af.m98551f(this.f295439w, z);
        C68236af.m98551f(this.f295438v, z);
        C68236af.m98551f(this.f295437u, z);
        C68236af.m98551f(this.f295436t, z);
        C68236af.m98551f(this.f295435s, z);
        C68236af.m98551f(this.f295434r, z);
        C68236af.m98551f(this.f295433q, z);
        C68236af.m98551f(this.f295432p, z);
        C68236af.m98551f(this.f295431o, z);
    }

    /* renamed from: b */
    public final C60870cx mo80398b() {
        return this.f295418b.mo60297gq();
    }
}
