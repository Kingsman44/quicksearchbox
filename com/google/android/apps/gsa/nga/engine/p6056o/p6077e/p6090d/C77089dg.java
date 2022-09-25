package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.ag.af;
import com.google.android.apps.gsa.nga.engine.aj.av;
import com.google.android.apps.gsa.nga.engine.aj.q;
import com.google.android.apps.gsa.nga.engine.aj.r;
import com.google.android.apps.gsa.nga.engine.am.d.g;
import com.google.android.apps.gsa.nga.engine.am.h.bf;
import com.google.android.apps.gsa.nga.engine.am.h.ct;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74847ad;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83007p;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83008q;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83009r;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83010s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.dg */
/* compiled from: PG */
public final class C77089dg {

    /* renamed from: a */
    public static final C58974d f212747a = C58974d.m91136j();

    /* renamed from: b */
    public final C58495hd f212748b;

    /* renamed from: c */
    public final bf f212749c;

    /* renamed from: d */
    public final g f212750d;

    /* renamed from: e */
    public final ct f212751e;

    /* renamed from: f */
    public final C22871g f212752f;

    /* renamed from: g */
    private final C58495hd f212753g;

    /* renamed from: h */
    private final af f212754h;

    /* renamed from: i */
    private final C83334w f212755i;

    public C77089dg(q qVar, C74847ad adVar, av avVar, bf bfVar, af afVar, g gVar, ct ctVar, C22871g gVar2, C83334w wVar) {
        this.f212748b = (C58495hd) Collection.EL.stream(C58485gu.m89848p(qVar, adVar, avVar)).collect(C58370cn.m89403c(C77066ck.f212694a, C77067cl.f212695a, C77068cm.f212696a));
        this.f212753g = C58495hd.m89902p("/m/0gwzvs1", avVar, "/m/0k3msl2", adVar, "/g/11c5h52jgd", qVar);
        this.f212749c = bfVar;
        this.f212754h = afVar;
        this.f212750d = gVar;
        this.f212751e = ctVar;
        this.f212752f = gVar2;
        this.f212755i = wVar;
    }

    /* renamed from: f */
    public static C60870cx m123751f(C77131l lVar, C77086dd ddVar, C80399l lVar2, C80303ay ayVar) {
        return ddVar.mo72388a(lVar.mo72433a(), lVar.mo72435c(), lVar2, ayVar);
    }

    /* renamed from: h */
    public static void m123752h(C77140u uVar, C82835ce ceVar) {
        uVar.mo72409e().ifPresent(new C77046br(uVar, ceVar));
    }

    /* renamed from: k */
    private final C58485gu m123753k(C77140u uVar) {
        Predicate predicate;
        C58485gu b = uVar.mo72406b();
        if (!b.isEmpty()) {
            C58485gu guVar = (C58485gu) Collection.EL.stream(b).map(C77038bj.f212636a).map(new C77039bk(this, uVar)).filter(C77040bl.f212639a).map(C77042bn.f212643a).collect(C58370cn.f155946a);
            if (!guVar.isEmpty()) {
                return guVar;
            }
            ((C58970a) ((C58970a) f212747a.mo56226d()).mo56372aa(3814)).mo56389s("Application (provided by package) is not supported: %s", b);
            if (uVar.mo72409e().isPresent()) {
                ((C83216f) uVar.mo72409e().get()).mo76648a(uVar.mo72412h(), C82835ce.APPLICATION_NOT_SUPPORTED, new C77043bo(b));
            }
            return C58485gu.m89845m();
        } else if (!uVar.mo72408d().isPresent()) {
            return mo72415a(uVar.mo72411g());
        } else {
            String str = (String) uVar.mo72408d().get();
            boolean g = uVar.mo72411g();
            Optional ofNullable = Optional.ofNullable((com.google.android.apps.gsa.nga.engine.aj.af) this.f212753g.get(str));
            if (g) {
                predicate = C77032bd.f212617a;
            } else {
                predicate = C77033be.f212618a;
            }
            Optional filter = ofNullable.filter(predicate);
            if (filter.isPresent()) {
                return C58485gu.m89846n((com.google.android.apps.gsa.nga.engine.aj.af) filter.get());
            }
            ((C58970a) ((C58970a) f212747a.mo56226d()).mo56372aa(3813)).mo56389s("Application (provided by mid) is not supported: %s", str);
            if (uVar.mo72409e().isPresent()) {
                ((C83216f) uVar.mo72409e().get()).mo76648a(uVar.mo72412h(), C82835ce.APPLICATION_BY_MID_NOT_SUPPORTED, new C77044bp(str));
            }
            return C58485gu.m89845m();
        }
    }

    /* renamed from: a */
    public final C58485gu mo72415a(boolean z) {
        Predicate predicate;
        Stream stream = Collection.EL.stream(this.f212748b.values());
        if (z) {
            predicate = C77032bd.f212617a;
        } else {
            predicate = C77033be.f212618a;
        }
        return (C58485gu) stream.filter(predicate).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final C60870cx mo72416b(C77140u uVar, C80303ay ayVar) {
        Optional f = uVar.mo72410f();
        if (!f.isPresent()) {
            ((C58970a) ((C58970a) f212747a.mo56225c()).mo56372aa(3815)).mo56386p("SendMessageHelper.send is called without person parameter");
            return C60856cj.m92900i(Optional.empty());
        }
        df dfVar = (df) f.get();
        C58485gu k = m123753k(uVar);
        if (k.isEmpty()) {
            m123752h(uVar, C82835ce.NO_POSSIBLE_CLIENT);
            return C60856cj.m92900i(Optional.empty());
        }
        C80303ay ayVar2 = ayVar;
        df dfVar2 = dfVar;
        C80913i g = C80913i.m128777f(this.f212752f, C80905at.m128759c(dfVar.a(), new C77064ci(k))).mo74712g("[NGA] disambiguate contact", new C77075ct(this, uVar, ayVar2, dfVar2, k));
        C80913i g2 = g.mo74712g("[NGA] filter providers", new C77079cx(uVar, k)).mo74712g("[NGA] disambiguate contact app", new C77080cy(this, g, uVar, ayVar)).mo74712g("[NGA] wrap disambiguated contact app", new C77081cz(this, uVar));
        return g2.mo74712g("[NGA] disambiguate endpoint", new C77083da(this, uVar, ayVar2, dfVar2, g)).mo74713h("[NGA] wrap with message params", new C77084db(g, g2));
    }

    /* renamed from: c */
    public final C60870cx mo72417c(C77140u uVar) {
        Optional f = uVar.mo72410f();
        if (!f.isPresent()) {
            ((C58970a) ((C58970a) f212747a.mo56225c()).mo56372aa(3817)).mo56386p("SendMessageHelper.getProviderCandidates is called without person parameter.");
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        C58485gu a = ((df) f.get()).a();
        if (a.isEmpty()) {
            ((C58970a) ((C58970a) f212747a.mo56225c()).mo56372aa(3816)).mo56386p("SendMessageHelper.getProviderCandidates is called with zero contactId.");
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        C58485gu k = m123753k(uVar);
        if (k.isEmpty()) {
            m123752h(uVar, C82835ce.NO_POSSIBLE_CLIENT);
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        ArrayList arrayList = new ArrayList(a.size());
        int size = a.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C80905at.m128759c(k, new C77071cp(((Long) a.get(i)).longValue())));
        }
        return C60856cj.m92892a(arrayList).mo57334a(new C77072cq(a, arrayList), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo72418d(long j, df dfVar, com.google.android.apps.gsa.nga.engine.aj.af afVar, C77140u uVar, C80303ay ayVar) {
        long j2 = j;
        C77140u uVar2 = uVar;
        int w = afVar.w();
        int i = w - 1;
        if (w == 0) {
            throw null;
        } else if (i == 0) {
            return C60856cj.m92900i(Optional.m71637of(new r(j2)));
        } else {
            if (i != 1) {
                return C60856cj.m92900i(Optional.empty());
            }
            C80913i f = C80913i.m128777f(this.f212752f, afVar.E(j2));
            long j3 = j;
            df dfVar2 = dfVar;
            com.google.android.apps.gsa.nga.engine.aj.af afVar2 = afVar;
            C77140u uVar3 = uVar;
            C80303ay ayVar2 = ayVar;
            return f.mo74712g("[NGA] get phone infos", new C77034bf(this, j2, uVar2)).mo74712g("[NGA] disambiguate phone label", new C77035bg(this, j3, dfVar2, afVar2, uVar3, ayVar2, f)).mo74712g("[NGA] disambiguate phone number", new C77036bh(this, j3, dfVar2, afVar2, uVar3, ayVar2)).mo74713h("[NGA] wrap phone number", new C77037bi(uVar2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C60870cx mo72419e(long j, df dfVar, com.google.android.apps.gsa.nga.engine.aj.af afVar, C80399l lVar, C80303ay ayVar, C77140u uVar, C77085dc dcVar) {
        return this.f212752f.mo28209i(mo72418d(j, dfVar, afVar, uVar, ayVar), "[NGA] post getSingleContactEndpoint", new C77077cv(dcVar, lVar));
    }

    /* renamed from: g */
    public final Optional mo72420g(Optional optional, boolean z) {
        Predicate predicate;
        C58495hd hdVar = this.f212748b;
        Objects.requireNonNull(hdVar);
        Optional map = optional.map(new C77051bw(hdVar));
        if (z) {
            predicate = C77032bd.f212617a;
        } else {
            predicate = C77033be.f212618a;
        }
        return map.filter(predicate);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo72421i(C74965n nVar) {
        C83007p pVar = (C83007p) C83010s.f226522b.createBuilder();
        C58800sl lA = this.f212748b.keySet().iterator();
        while (lA.hasNext()) {
            String str = (String) lA.next();
            C83008q qVar = (C83008q) C83009r.f226516e.createBuilder();
            qVar.copyOnWrite();
            C83009r rVar = (C83009r) qVar.instance;
            str.getClass();
            rVar.f226518a |= 1;
            rVar.f226519b = str;
            this.f212754h.g(str).ifPresent(new C77052bx(qVar));
            pVar.copyOnWrite();
            C83010s sVar = (C83010s) pVar.instance;
            C83009r rVar2 = (C83009r) qVar.build();
            rVar2.getClass();
            sVar.mo76643a();
            sVar.f226524a.add(rVar2);
        }
        C83334w wVar = this.f212755i;
        C82887ec ecVar = C82887ec.APPLICATION_INFO;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C83010s sVar2 = (C83010s) pVar.build();
        sVar2.getClass();
        eaVar.f225980b = sVar2;
        eaVar.f225979a = 40;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), nVar.mo71336k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo72422j(C77140u uVar) {
        return mo72420g(uVar.mo72414j(), false).isPresent();
    }
}
