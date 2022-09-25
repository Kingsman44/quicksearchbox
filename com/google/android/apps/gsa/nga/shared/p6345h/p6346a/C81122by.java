package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81284bo;
import com.google.android.apps.gsa.nga.shared.p6345h.C81285bp;
import com.google.android.apps.gsa.nga.shared.p6345h.C81286bq;
import com.google.android.apps.gsa.nga.shared.p6345h.C81288bs;
import com.google.android.apps.gsa.nga.shared.p6345h.C81289bt;
import com.google.android.apps.gsa.nga.shared.p6345h.C81290bu;
import com.google.android.apps.gsa.nga.shared.p6345h.C81292bw;
import com.google.android.apps.gsa.nga.shared.p6345h.C81294by;
import com.google.android.apps.gsa.nga.shared.p6345h.C81295bz;
import com.google.android.apps.gsa.nga.shared.p6345h.C81297ca;
import com.google.android.apps.gsa.nga.shared.p6345h.C81307ck;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.nga.shared.p6345h.C81317m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58512hu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import dagger.C68214a;
import java.util.Collections;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.by */
/* compiled from: PG */
public final class C81122by implements C81315k {

    /* renamed from: a */
    public final C68214a f222245a;

    /* renamed from: b */
    private final C42876ab f222246b;

    /* renamed from: c */
    private final C22871g f222247c;

    public C81122by(C68214a aVar, C42876ab abVar, C22871g gVar) {
        this.f222245a = aVar;
        this.f222246b = abVar;
        this.f222247c = gVar;
    }

    /* renamed from: ag */
    public static C81297ca m129051ag(C81297ca caVar, C81294by byVar) {
        C81295bz bzVar = (C81295bz) C81297ca.f222540b.createBuilder();
        bzVar.mo74985a(m129052ah(caVar.f222542a, byVar));
        return (C81297ca) bzVar.build();
    }

    /* renamed from: ah */
    public static C58485gu m129052ah(List list, Object obj) {
        return (C58485gu) Stream.CC.concat(Collection.EL.stream(list), Stream.CC.m71935of(obj)).skip((long) Math.max(0, list.size() - 99)).collect(C58370cn.f155946a);
    }

    /* renamed from: ai */
    private final C81237ab m129053ai() {
        return ((C81174dw) this.f222245a.mo27525b()).mo74932a();
    }

    /* renamed from: A */
    public final C60870cx mo74853A(String str, String str2) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81090at(str, str2), C60826bg.f164896a), "[NGA] EducationPreferences.recordHomescreenImpression", new C81091au(this));
    }

    /* renamed from: B */
    public final C60870cx mo74854B() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81222m.f222364a, C60826bg.f164896a), "[NGA] EducationPreferences.recordInvocation", new C81223n(this));
    }

    /* renamed from: C */
    public final C60870cx mo74855C() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81116bs.f222238a, C60826bg.f164896a), "[NGA] EducationPreferences.recordInvocationCountSinceLastBlockingOOBE", new C81117bt(this));
    }

    /* renamed from: D */
    public final C60870cx mo74856D(String str) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81217h(str), C60826bg.f164896a), "[NGA] EducationPreferences.recordLockscreenImpression", new C81218i(this));
    }

    /* renamed from: E */
    public final C60870cx mo74857E() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81082al.f222201a, C60826bg.f164896a), "[NGA] EducationPreferences.recordLongPressPowerEducationAcknowledged", new C81083am(this));
    }

    /* renamed from: F */
    public final C60870cx mo74858F() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81227r.f222369a, C60826bg.f164896a), "[NGA] EducationPreferences.recordLongPressPowerEducationCount", new C81228s(this));
    }

    /* renamed from: G */
    public final C60870cx mo74859G() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81235z.f222377a, C60826bg.f164896a), "[NGA] EducationPreferences.recordLongPressPowerInvocation", new C81071aa(this));
    }

    /* renamed from: H */
    public final C60870cx mo74860H() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81096az.f222216a, C60826bg.f164896a), "[NGA] EducationPreferences.recordLongPressPowerCountSinceLastEducation", new C81098ba(this));
    }

    /* renamed from: I */
    public final C60870cx mo74861I() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81072ab.f222190a, C60826bg.f164896a), "[NGA] EducationPreferences.recordLongPressPowerSuggestionImpressionCount", new C81073ac(this));
    }

    /* renamed from: J */
    public final C60870cx mo74862J(String str) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81074ad(str), C60826bg.f164896a), "[NGA] EducationPreferences.recordMultiStepExecutedQuery", new C81075ae(this));
    }

    /* renamed from: K */
    public final C60870cx mo74863K(int i) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81084an(i), C60826bg.f164896a), "[NGA] EducationPreferences.recordPieAggressiveQuerySuggestion", new C81085ao(this));
    }

    /* renamed from: L */
    public final C60870cx mo74864L(Instant instant) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81099bb(instant), C60826bg.f164896a), "[NGA] EducationPreferences.recordPieAssistantInitTimestamp", new C81100bc(this));
    }

    /* renamed from: M */
    public final C60870cx mo74865M(Instant instant, int i, boolean z) {
        instant.getEpochSecond();
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81102be(instant, i, z), C60826bg.f164896a), "[NGA] EducationPreferences.recordPieFlowCompletion", new C81103bf(this));
    }

    /* renamed from: N */
    public final C60870cx mo74866N(Instant instant, e eVar, boolean z) {
        instant.getEpochSecond();
        C81285bp bpVar = (C81285bp) C81286bq.f222518d.createBuilder();
        long epochMilli = instant.toEpochMilli();
        bpVar.copyOnWrite();
        C81286bq bqVar = (C81286bq) bpVar.instance;
        bqVar.f222520a |= 1;
        bqVar.f222521b = epochMilli;
        bpVar.copyOnWrite();
        C81286bq bqVar2 = (C81286bq) bpVar.instance;
        bqVar2.f222522c = eVar.ca;
        bqVar2.f222520a |= 2;
        C81286bq bqVar3 = (C81286bq) bpVar.build();
        if (z) {
            return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81124c(bqVar3), C60826bg.f164896a), "[NGA] EducationPreferences.recordPieInvocation", new C81221l(this));
        }
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81232w(bqVar3), C60826bg.f164896a), "[NGA] EducationPreferences.recordPieInvocation", new C81078ah(this));
    }

    /* renamed from: O */
    public final C60870cx mo74867O(Instant instant, int i, boolean z) {
        instant.getEpochSecond();
        C81289bt btVar = (C81289bt) C81290bu.f222527d.createBuilder();
        long epochMilli = instant.toEpochMilli();
        btVar.copyOnWrite();
        C81290bu buVar = (C81290bu) btVar.instance;
        buVar.f222529a |= 1;
        buVar.f222530b = epochMilli;
        btVar.copyOnWrite();
        C81290bu buVar2 = (C81290bu) btVar.instance;
        buVar2.f222529a |= 2;
        buVar2.f222531c = i;
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81120bw(z, (C81290bu) btVar.build()), C60826bg.f164896a), "[NGA] EducationPreferences.recordPieNotificationDisplay", new C81121bx(this));
    }

    /* renamed from: P */
    public final C60870cx mo74868P(long j) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81104bg(j), C60826bg.f164896a), "[NGA] EducationPreferences.recordQueryExecution", new C81105bh(this));
    }

    /* renamed from: Q */
    public final C60870cx mo74869Q() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81094ax.f222214a, C60826bg.f164896a), "[NGA] EducationPreferences.recordScreenContextExplanationShown", new C81095ay(this));
    }

    /* renamed from: R */
    public final C60870cx mo74870R(C81307ck ckVar) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81108bk(ckVar), C60826bg.f164896a), "[NGA] EducationPreferences.recordVoiceMatchOnboardingStatus", new C81109bl(this));
    }

    /* renamed from: S */
    public final C60870cx mo74871S() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81114bq.f222236a, C60826bg.f164896a), "[NGA] EducationPreferences.recordVoiceQueryExecution", new C81115br(this));
    }

    /* renamed from: T */
    public final C60870cx mo74872T() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81229t.f222371a, C60826bg.f164896a), "[NGA] EducationPreferences.resetHomescreenImpressions", new C81230u(this));
    }

    /* renamed from: U */
    public final C60870cx mo74873U() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81089as.f222208a, C60826bg.f164896a), "[NGA] EducationPreferences.resetInvocationsSinceLastSuggestion", new C81101bd(this));
    }

    /* renamed from: V */
    public final C60870cx mo74874V() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81106bi.f222227a, C60826bg.f164896a), "[NGA] EducationPreferences.resetLockscreenImpressions", new C81107bj(this));
    }

    /* renamed from: W */
    public final C60870cx mo74875W() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81092av.f222212a, C60826bg.f164896a), "[NGA] EducationPreferences.clearQueryExecutions", new C81093aw(this));
    }

    /* renamed from: X */
    public final Optional mo74876X() {
        long j = m129053ai().f222393l;
        if (j <= 0) {
            return Optional.empty();
        }
        return Optional.m71637of(Instant.ofEpochMilli(j));
    }

    /* renamed from: Y */
    public final Optional mo74877Y(String str) {
        return Optional.ofNullable((C81317m) Collections.unmodifiableMap(m129053ai().f222386e).get(str)).map(C81110bm.f222231a);
    }

    /* renamed from: Z */
    public final Optional mo74878Z() {
        long j = m129053ai().f222398q;
        if (j <= 0) {
            return Optional.empty();
        }
        return Optional.m71637of(Instant.ofEpochMilli(j));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.apps.gsa.nga.shared.h.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo74879a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.google.android.apps.gsa.nga.shared.h.ab r0 = r3.m129053ai()
            com.google.android.apps.gsa.nga.shared.h.e r1 = com.google.android.apps.gsa.nga.shared.p6345h.C81309e.f222570b
            r4.getClass()
            com.google.protobuf.dn r0 = r0.f222385d
            boolean r2 = r0.containsKey(r4)
            if (r2 == 0) goto L_0x0018
            java.lang.Object r4 = r0.get(r4)
            r1 = r4
            com.google.android.apps.gsa.nga.shared.h.e r1 = (com.google.android.apps.gsa.nga.shared.p6345h.C81309e) r1
        L_0x0018:
            r5.getClass()
            com.google.protobuf.dn r4 = r1.f222572a
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            return r4
        L_0x002e:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81122by.mo74879a(java.lang.String, java.lang.String):int");
    }

    /* renamed from: aa */
    public final boolean mo74880aa() {
        return m129053ai().f222399r;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.apps.gsa.nga.shared.h.ca} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ab */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo74881ab(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.google.android.apps.gsa.nga.shared.h.ab r0 = r3.m129053ai()
            com.google.android.apps.gsa.nga.shared.h.ca r1 = com.google.android.apps.gsa.nga.shared.p6345h.C81297ca.f222540b
            r4.getClass()
            com.google.protobuf.dn r0 = r0.f222384c
            boolean r2 = r0.containsKey(r4)
            if (r2 == 0) goto L_0x0018
            java.lang.Object r4 = r0.get(r4)
            r1 = r4
            com.google.android.apps.gsa.nga.shared.h.ca r1 = (com.google.android.apps.gsa.nga.shared.p6345h.C81297ca) r1
        L_0x0018:
            com.google.protobuf.cq r4 = r1.f222542a
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.gsa.nga.shared.h.a.v r0 = new com.google.android.apps.gsa.nga.shared.h.a.v
            r0.<init>(r5)
            boolean r4 = r4.anyMatch(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81122by.mo74881ab(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: ac */
    public final boolean mo74882ac(String str) {
        C81297ca caVar = m129053ai().f222383b;
        if (caVar == null) {
            caVar = C81297ca.f222540b;
        }
        return Collection.EL.stream(caVar.f222542a).anyMatch(new C81076af(str));
    }

    /* renamed from: ad */
    public final boolean mo74883ad(String str) {
        C81297ca caVar = m129053ai().f222387f;
        if (caVar == null) {
            caVar = C81297ca.f222540b;
        }
        return Collection.EL.stream(caVar.f222542a).anyMatch(new C81216g(str));
    }

    /* renamed from: ae */
    public final boolean mo74884ae() {
        return m129053ai().f222402u;
    }

    /* renamed from: af */
    public final C58485gu mo74885af(int i) {
        C81284bo boVar = m129053ai().f222396o;
        if (boVar == null) {
            boVar = C81284bo.f222515b;
        }
        return (C58485gu) Collection.EL.stream(boVar.f222517a).filter(new C81225p(i)).map(C81226q.f222368a).map(C81205f.f222344a).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final int mo74886b() {
        return m129053ai().f222406y;
    }

    /* renamed from: c */
    public final int mo74887c() {
        C81297ca caVar = m129053ai().f222383b;
        if (caVar == null) {
            caVar = C81297ca.f222540b;
        }
        return caVar.f222542a.size();
    }

    /* renamed from: d */
    public final int mo74888d(String str) {
        C81237ab ai = m129053ai();
        C81297ca caVar = C81297ca.f222540b;
        str.getClass();
        C62995dn dnVar = ai.f222384c;
        if (dnVar.containsKey(str)) {
            caVar = (C81297ca) dnVar.get(str);
        }
        int size = caVar.f222542a.size();
        str.getClass();
        C62995dn dnVar2 = ai.f222388g;
        return size + (dnVar2.containsKey(str) ? ((Integer) dnVar2.get(str)).intValue() : 0);
    }

    /* renamed from: e */
    public final int mo74889e() {
        return m129053ai().f222407z;
    }

    /* renamed from: f */
    public final int mo74890f() {
        return m129053ai().f222392k;
    }

    /* renamed from: g */
    public final int mo74891g() {
        return m129053ai().f222403v;
    }

    /* renamed from: h */
    public final int mo74892h() {
        return m129053ai().f222401t;
    }

    /* renamed from: i */
    public final int mo74893i() {
        return m129053ai().f222405x;
    }

    /* renamed from: j */
    public final int mo74894j() {
        return m129053ai().f222404w;
    }

    /* renamed from: k */
    public final int mo74895k() {
        return m129053ai().f222389h;
    }

    /* renamed from: l */
    public final int mo74896l() {
        return m129053ai().f222390i;
    }

    /* renamed from: m */
    public final C81307ck mo74897m() {
        C81307ck ckVar = m129053ai().f222381A;
        return ckVar == null ? C81307ck.f222564d : ckVar;
    }

    /* renamed from: n */
    public final C58485gu mo74898n() {
        C81297ca caVar = m129053ai().f222383b;
        if (caVar == null) {
            caVar = C81297ca.f222540b;
        }
        return (C58485gu) Collection.EL.stream(caVar.f222542a).map(C81224o.f222366a).collect(C58370cn.f155946a);
    }

    /* renamed from: o */
    public final C58485gu mo74899o() {
        return C58485gu.m89842j(m129053ai().f222400s);
    }

    /* renamed from: p */
    public final C58485gu mo74900p() {
        return C58485gu.m89842j(m129053ai().f222397p);
    }

    /* renamed from: q */
    public final C58485gu mo74901q(int i, boolean z) {
        C62971cq cqVar;
        if (z) {
            C81292bw bwVar = m129053ai().f222394m;
            if (bwVar == null) {
                bwVar = C81292bw.f222532c;
            }
            cqVar = bwVar.f222535b;
        } else {
            C81292bw bwVar2 = m129053ai().f222394m;
            if (bwVar2 == null) {
                bwVar2 = C81292bw.f222532c;
            }
            cqVar = bwVar2.f222534a;
        }
        return (C58485gu) Collection.EL.stream(cqVar).filter(new C81151d(i)).map(C81178e.f222317a).map(C81205f.f222344a).collect(C58370cn.f155946a);
    }

    /* renamed from: r */
    public final C58485gu mo74902r() {
        return (C58485gu) Collection.EL.stream(m129053ai().f222391j).map(C81118bu.f222240a).collect(C58370cn.f155946a);
    }

    /* renamed from: s */
    public final C58495hd mo74903s() {
        return (C58495hd) Collection.EL.stream(Collections.unmodifiableMap(m129053ai().f222384c).entrySet()).collect(C58370cn.m89403c(C81086ap.f222205a, C81087aq.f222206a, C81088ar.f222207a));
    }

    /* renamed from: t */
    public final C58512hu mo74904t(boolean z) {
        C62971cq<C81286bq> cqVar;
        C58506ho hoVar = new C58506ho();
        if (z) {
            C81288bs bsVar = m129053ai().f222395n;
            if (bsVar == null) {
                bsVar = C81288bs.f222523c;
            }
            cqVar = bsVar.f222525a;
        } else {
            C81288bs bsVar2 = m129053ai().f222395n;
            if (bsVar2 == null) {
                bsVar2 = C81288bs.f222523c;
            }
            cqVar = bsVar2.f222526b;
        }
        for (C81286bq bqVar : cqVar) {
            e a = e.a(bqVar.f222522c);
            if (a == null) {
                a = e.a;
            }
            hoVar.mo55456j(a, Instant.ofEpochMilli(bqVar.f222521b));
        }
        return hoVar.mo55453g();
    }

    /* renamed from: u */
    public final C60870cx mo74905u(String str) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81077ag(str), C60826bg.f164896a), "[NGA] EducationPreferences.clearInAppQueriesShownList", new C81079ai(this));
    }

    /* renamed from: v */
    public final C60870cx mo74906v(String str, String str2) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81080aj(str, str2), C60826bg.f164896a), "[NGA] EducationPreferences.recordAppControlInAppImpression", new C81081ak(this));
    }

    /* renamed from: w */
    public final C60870cx mo74907w() {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(C81233x.f222375a, C60826bg.f164896a), "[NGA] EducationPreferences.recordBlockingOOBEImpressionCount", new C81234y(this));
    }

    /* renamed from: x */
    public final C60870cx mo74908x(Instant instant) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81219j(instant), C60826bg.f164896a), "[NGA] EducationPreferences.recordFirstInvocationTimestamp", new C81220k(this));
    }

    /* renamed from: y */
    public final C60870cx mo74909y(String str, Instant instant) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81111bn(str, instant), C60826bg.f164896a), "[NGA] EducationPreferences.recordHandsFreeImpression", new C81113bp(this));
    }

    /* renamed from: z */
    public final C60870cx mo74910z(String str) {
        return this.f222247c.mo28210j(this.f222246b.mo46039a(new C81112bo(str), C60826bg.f164896a), "[NGA] EducationPreferences.recordHomescreenImpression", new C81119bv(this));
    }
}
