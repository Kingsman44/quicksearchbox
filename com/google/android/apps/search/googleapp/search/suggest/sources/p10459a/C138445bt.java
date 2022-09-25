package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137940a;
import com.google.android.apps.search.googleapp.search.suggest.settings.C138360p;
import com.google.android.apps.search.googleapp.search.suggest.sources.C138366a;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a.C138374g;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a.C138378k;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b.C138409d;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b.C138413h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.p3644h.C47117b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bt */
/* compiled from: PG */
public final class C138445bt implements C138366a {

    /* renamed from: a */
    public static final C58974d f376578a = C58974d.m91134h("CompleteServerSource");

    /* renamed from: b */
    public static final C58485gu f376579b = C58485gu.m89847o(C64369b.SUBTYPE_PROACTIVE_ZPS, C64369b.SUBTYPE_HIVEMIND);

    /* renamed from: c */
    public final AccountId f376580c;

    /* renamed from: d */
    public final C47117b f376581d;

    /* renamed from: e */
    public final C138476f f376582e;

    /* renamed from: f */
    public final C60887da f376583f;

    /* renamed from: g */
    public final C60888db f376584g;

    /* renamed from: h */
    public final C137940a f376585h;

    /* renamed from: i */
    public final C138378k f376586i;

    /* renamed from: j */
    public final C21370a f376587j;

    /* renamed from: k */
    public final boolean f376588k;

    /* renamed from: l */
    public final C138374g f376589l;

    /* renamed from: m */
    public final Duration f376590m;

    /* renamed from: n */
    public final Duration f376591n;

    /* renamed from: o */
    public final long f376592o;

    /* renamed from: p */
    public final List f376593p;

    /* renamed from: q */
    private final C60888db f376594q;

    /* renamed from: r */
    private final C138471cs f376595r;

    /* renamed from: s */
    private final C138396ar f376596s;

    /* renamed from: t */
    private final boolean f376597t;

    /* renamed from: u */
    private final C138360p f376598u;

    /* renamed from: v */
    private final C46723bg f376599v;

    /* renamed from: w */
    private final C138413h f376600w;

    /* renamed from: x */
    private final long f376601x;

    /* renamed from: y */
    private final Set f376602y;

    public C138445bt(AccountId accountId, C47117b bVar, C138476f fVar, Set set, List list, C138471cs csVar, C138396ar arVar, C137940a aVar, C138378k kVar, C21370a aVar2, C138374g gVar, C138360p pVar, C46723bg bgVar, C138413h hVar, C60888db dbVar, C60887da daVar, C60888db dbVar2, long j, boolean z, C62910ar arVar2, C62910ar arVar3, long j2, boolean z2) {
        this.f376580c = accountId;
        this.f376581d = bVar;
        this.f376582e = fVar;
        this.f376602y = set;
        this.f376595r = csVar;
        this.f376596s = arVar;
        this.f376585h = aVar;
        this.f376586i = kVar;
        this.f376587j = aVar2;
        this.f376593p = list;
        this.f376600w = hVar;
        this.f376594q = dbVar;
        this.f376583f = daVar;
        this.f376584g = dbVar2;
        this.f376601x = j;
        this.f376597t = z;
        this.f376590m = C62950b.m95473d(arVar2);
        this.f376591n = C62950b.m95473d(arVar3);
        this.f376592o = j2;
        this.f376588k = z2;
        this.f376589l = gVar;
        this.f376598u = pVar;
        this.f376599v = bgVar;
    }

    /* renamed from: a */
    public final C138034az mo114248a() {
        return C138034az.COMPLETE_SERVER;
    }

    /* renamed from: b */
    public final C60870cx mo114249b() {
        C138396ar arVar = this.f376596s;
        C138413h hVar = this.f376600w;
        return C47638k.m84753d(arVar.f376492b.mo46039a(C138384af.f376476a, arVar.f376497g), this.f376596s.mo114271c(), C47633f.m84733g(hVar.f376514a.mo50343c()).mo51516i(new C138409d(hVar), hVar.f376515b)).mo51520a(C138443br.f376574a, this.f376583f);
    }

    /* renamed from: c */
    public final C60870cx mo114250c(C138133o oVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        if (oVar.f375825b.isEmpty() && (oVar.f375824a & 128) != 0) {
            return C47633f.m84733g(mo114284i(oVar)).mo51517j(this.f376601x, TimeUnit.MILLISECONDS, this.f376584g);
        }
        if (oVar.f375825b.isEmpty()) {
            cxVar = C47633f.m84733g(this.f376596s.mo114272d()).mo51516i(new C138441bp(this), this.f376583f);
        } else {
            C138396ar arVar = this.f376596s;
            C60870cx e = arVar.f376493c.mo50345e(C138396ar.m224806b(oVar));
            C138388aj ajVar = C138388aj.f376481a;
            cxVar = C60922j.m93044g(e, C47810es.m84963c(ajVar), arVar.f376497g);
        }
        C47633f j = C47633f.m84733g(cxVar).mo51516i(new C138429bd(this, oVar), this.f376583f).mo51517j(this.f376601x, TimeUnit.MILLISECONDS, this.f376584g);
        if (!this.f376597t) {
            cxVar2 = C60856cj.m92900i(false);
        } else if (oVar.f375825b.isEmpty()) {
            cxVar2 = C60856cj.m92900i(false);
        } else {
            cxVar2 = this.f376599v.mo50750c(this.f376598u.mo114247a(), C46788de.DONT_CARE);
        }
        return C47633f.m84733g(cxVar2).mo51516i(new C138430be(this, oVar, j), this.f376583f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (new com.google.protobuf.C62963cj(r4.f375542e, com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f).contains(com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PERSONAL) == false) goto L_0x0057;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo114251d(com.google.android.apps.search.googleapp.search.suggest.C138030av r4) {
        /*
            r3 = this;
            int r0 = r4.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r0 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r0)
            if (r0 != 0) goto L_0x000a
            com.google.android.apps.search.googleapp.search.suggest.au r0 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x000a:
            com.google.android.apps.search.googleapp.search.suggest.au r1 = com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_QUERY
            if (r0 == r1) goto L_0x002d
            int r0 = r4.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r0 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r0)
            if (r0 != 0) goto L_0x0018
            com.google.android.apps.search.googleapp.search.suggest.au r0 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x0018:
            com.google.android.apps.search.googleapp.search.suggest.au r1 = com.google.android.apps.search.googleapp.search.suggest.C138029au.PERSONALIZED_NAVIGATION
            if (r0 == r1) goto L_0x002d
            com.google.protobuf.cj r0 = new com.google.protobuf.cj
            com.google.protobuf.ch r1 = r4.f375542e
            com.google.protobuf.ci r2 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r0.<init>(r1, r2)
            com.google.protos.ba.a.b r1 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PERSONAL
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0057
        L_0x002d:
            com.google.at.h.d.a.aq r0 = r4.f375543g
            if (r0 != 0) goto L_0x0033
            com.google.at.h.d.a.aq r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54228aq.f142328w
        L_0x0033:
            com.google.at.h.d.a.ae r0 = r0.f142334f
            if (r0 != 0) goto L_0x0039
            com.google.at.h.d.a.ae r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0039:
            int r0 = r0.f142290a
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0057
            com.google.android.apps.search.googleapp.search.suggest.sources.a.bf r0 = new com.google.android.apps.search.googleapp.search.suggest.sources.a.bf
            r0.<init>(r3, r4)
            com.google.common.base.cr r4 = com.google.apps.tiktok.tracing.C47810es.m84964d(r0)
            com.google.common.n.c.h r0 = new com.google.common.n.c.h
            r1 = 2
            r0.<init>(r1)
            com.google.android.apps.search.googleapp.search.suggest.sources.a.bg r1 = com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138432bg.f376556a
            com.google.common.util.concurrent.db r2 = r3.f376594q
            com.google.common.n.c.y r4 = com.google.common.p4543n.p4546c.C59417y.m92319e(r4, r0, r1, r2)
            return r4
        L_0x0057:
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92900i(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138445bt.mo114251d(com.google.android.apps.search.googleapp.search.suggest.av):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final C60870cx mo114252e() {
        for (C138399au b : this.f376593p) {
            b.mo114275b();
        }
        return this.f376596s.mo114271c();
    }

    /* renamed from: f */
    public final boolean mo114253f(C138133o oVar) {
        for (C138495y b : this.f376602y) {
            if (b.mo114277b(oVar) == 2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final /* synthetic */ boolean mo114254g() {
        return true;
    }

    /* renamed from: h */
    public final void mo114255h() {
        C138471cs csVar = this.f376595r;
        C46459k.m82829b(C47633f.m84733g(csVar.f376648d.mo50251a()).mo51516i(new C138469cq(csVar), csVar.f376649e).mo51516i(new C138470cr(csVar), csVar.f376649e), "Failed to enqueue the periodic zero-prefix cache refresh background task.", new Object[0]);
    }

    /* renamed from: i */
    public final C60870cx mo114284i(C138133o oVar) {
        C60870cx cxVar;
        String str = oVar.f375825b;
        HashMap hashMap = new HashMap();
        for (C138495y a : this.f376602y) {
            a.mo114276a(oVar, hashMap);
        }
        C60870cx a2 = this.f376582e.mo114290a(oVar, C58495hd.m89898l(hashMap));
        if (!str.isEmpty()) {
            C138396ar arVar = this.f376596s;
            C138387ai aiVar = C138387ai.f376480a;
            cxVar = arVar.f376493c.mo50346f(C138396ar.m224806b(oVar), C60922j.m93044g(a2, C47810es.m84963c(aiVar), arVar.f376497g));
        } else if ((oVar.f375824a & 128) != 0) {
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = this.f376596s.mo114273e(a2, 3);
        }
        C138434bi biVar = new C138434bi(a2);
        return C60922j.m93045h(cxVar, C47810es.m84966f(biVar), this.f376583f);
    }
}
