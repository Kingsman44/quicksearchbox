package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.location.Location;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.sidekick.main.entry.C91314as;
import com.google.android.apps.gsa.sidekick.main.entry.C91317av;
import com.google.android.apps.gsa.sidekick.main.entry.C91319ax;
import com.google.android.apps.gsa.sidekick.main.entry.C91320ay;
import com.google.android.apps.gsa.sidekick.main.entry.C91321az;
import com.google.android.apps.gsa.sidekick.main.entry.C91323ba;
import com.google.android.apps.gsa.sidekick.main.entry.C91324bb;
import com.google.android.apps.gsa.sidekick.main.entry.C91329bg;
import com.google.android.apps.gsa.sidekick.main.entry.C91336bn;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;
import com.google.android.apps.gsa.sidekick.shared.util.C91955af;
import com.google.android.apps.gsa.sidekick.shared.util.C91966aq;
import com.google.android.apps.gsa.sidekick.shared.util.C92001t;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98323ae;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98325ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C7957qf;
import com.google.p375ai.p378b.C8142xb;
import com.google.p4283bv.p4354e.C57051b;
import com.google.p4283bv.p4354e.C57526k;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.cc */
/* compiled from: PG */
public final class C98102cc implements C91320ay, C91324bb, C90991b {

    /* renamed from: a */
    public static final C59071e f273879a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.a.cc");

    /* renamed from: A */
    public final C98101cb f273880A = m162423M();

    /* renamed from: B */
    public final C98101cb f273881B = m162423M();

    /* renamed from: C */
    public final C98101cb f273882C = m162423M();

    /* renamed from: D */
    public final C98101cb f273883D = m162423M();

    /* renamed from: E */
    public final C98101cb f273884E = m162423M();

    /* renamed from: F */
    public final C58881cr f273885F;

    /* renamed from: G */
    public final C84486a f273886G;

    /* renamed from: H */
    private final C21370a f273887H;

    /* renamed from: I */
    private final C90998g f273888I;

    /* renamed from: J */
    private final Queue f273889J = new C58425eo(40);

    /* renamed from: K */
    private C92001t f273890K;

    /* renamed from: L */
    private final C91336bn f273891L;

    /* renamed from: M */
    private final C98120cu f273892M;

    /* renamed from: N */
    private final C90926bw f273893N = new C90926bw(C118826c.f331422a);

    /* renamed from: b */
    public final Object f273894b = new Object();

    /* renamed from: c */
    public final Object f273895c = new Object();

    /* renamed from: d */
    public final C91314as f273896d;

    /* renamed from: e */
    public final C91319ax f273897e;

    /* renamed from: f */
    public final C91329bg f273898f;

    /* renamed from: g */
    public final C86054o f273899g;

    /* renamed from: h */
    public final C85651bb f273900h;

    /* renamed from: i */
    public final C22871g f273901i;

    /* renamed from: j */
    public final C22871g f273902j;

    /* renamed from: k */
    public final C86124t f273903k;

    /* renamed from: l */
    public final C98323ae f273904l;

    /* renamed from: m */
    public final C90998g f273905m;

    /* renamed from: n */
    public final C69464a f273906n;

    /* renamed from: o */
    public final C84474e f273907o;

    /* renamed from: p */
    public final C98127i f273908p;

    /* renamed from: q */
    C58833ax f273909q = C58836b.f156633a;

    /* renamed from: r */
    public final C98101cb f273910r = new C98101cb(C98074bb.f273843a);

    /* renamed from: s */
    public List f273911s = C58485gu.m89845m();

    /* renamed from: t */
    public List f273912t = C58485gu.m89845m();

    /* renamed from: u */
    public List f273913u = C58485gu.m89845m();

    /* renamed from: v */
    public final C98101cb f273914v = m162423M();

    /* renamed from: w */
    public final C98101cb f273915w = m162423M();

    /* renamed from: x */
    public final C98101cb f273916x = m162423M();

    /* renamed from: y */
    public long f273917y;

    /* renamed from: z */
    public final C98101cb f273918z = m162423M();

    public C98102cc(C21370a aVar, C98127i iVar, C91314as asVar, C91319ax axVar, C91329bg bgVar, C22871g gVar, C22871g gVar2, C91336bn bnVar, C86054o oVar, C85651bb bbVar, C98120cu cuVar, C86124t tVar, C98323ae aeVar, C69464a aVar2, C90998g gVar3, C90998g gVar4, C118827a aVar3, C84486a aVar4, C84474e eVar) {
        this.f273887H = aVar;
        this.f273908p = iVar;
        this.f273896d = asVar;
        this.f273897e = axVar;
        this.f273898f = bgVar;
        this.f273902j = gVar2;
        this.f273891L = bnVar;
        this.f273899g = oVar;
        this.f273900h = bbVar;
        this.f273901i = gVar;
        this.f273892M = cuVar;
        this.f273903k = tVar;
        this.f273904l = aeVar;
        this.f273906n = aVar2;
        this.f273905m = gVar3;
        this.f273888I = gVar4;
        this.f273886G = aVar4;
        this.f273907o = eVar;
        this.f273885F = C58886cw.m90973a(new C98092bt(aVar3));
    }

    /* renamed from: L */
    private final C92001t m162422L(C7744ii iiVar) {
        C92001t tVar = new C92001t(this.f273887H.mo26870b());
        tVar.mo86660l(iiVar);
        return tVar;
    }

    /* renamed from: M */
    private static C98101cb m162423M() {
        return new C98101cb(C98090br.f273863a);
    }

    /* renamed from: N */
    private final C60870cx m162424N() {
        String F = this.f273899g.mo79659F();
        return C60856cj.m92893b(mo85620j()).mo57334a(new C98073ba(this, F), C60826bg.f164896a);
    }

    /* renamed from: O */
    private final void m162425O(String str) {
        C60856cj.m92910s(mo85620j());
        C60856cj.m92910s(C60856cj.m92893b(mo85620j()).mo57335b(new C98077be(this, str), C60826bg.f164896a));
        synchronized (this.f273894b) {
            this.f273910r.mo90950a(str);
        }
    }

    /* renamed from: A */
    public final C60870cx mo90952A() {
        return this.f273901i.mo28210j(mo85620j(), "clearContentAndDeleteCache", new C98079bg(this));
    }

    /* renamed from: B */
    public final void mo90953B() {
        try {
            C90877ak.m148472f(C60856cj.m92897f(this.f273904l.mo91053g(C98325ag.f274465a), this.f273904l.mo91053g(C98325ag.f274473i), this.f273904l.mo91053g(C98325ag.f274476l), this.f273904l.mo91053g(C98325ag.f274466b), this.f273904l.mo91053g(C98325ag.f274469e), this.f273904l.mo91055i(4), this.f273904l.mo91055i(5), this.f273904l.mo91053g(C98325ag.f274467c), this.f273904l.mo91053g(C98325ag.f274470f), this.f273904l.mo91053g(C98325ag.f274472h), this.f273904l.mo91053g(C98325ag.f274471g), this.f273904l.mo91053g(C98325ag.f274468d)));
        } catch (InterruptedException | ExecutionException e) {
            C59104x c = f273879a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EntryTreeReaderWriter");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30552)).mo56386p("Exception while deleting data");
            this.f273905m.mo85270f("error deleting storage", C90996e.f254198a);
        }
    }

    /* renamed from: C */
    public final void mo90954C(List list, boolean z) {
        if (!z) {
            C60856cj.m92910s(mo85620j());
        }
        synchronized (this.f273894b) {
            this.f273911s = list;
        }
    }

    /* renamed from: D */
    public final void mo90955D(C7805kp kpVar, boolean z) {
        if (!z) {
            C60856cj.m92910s(mo85620j());
        }
        synchronized (this.f273894b) {
            this.f273916x.mo90950a(kpVar);
        }
    }

    /* renamed from: E */
    public final void mo90956E(List list) {
        synchronized (this.f273894b) {
            this.f273913u = list;
        }
    }

    /* renamed from: F */
    public final void mo90957F(List list) {
        synchronized (this.f273894b) {
            this.f273912t = list;
        }
    }

    /* renamed from: G */
    public final C98101cb mo90958G(int i) {
        synchronized (this.f273894b) {
            if (i == 1) {
                C98101cb cbVar = this.f273914v;
                return cbVar;
            }
            C98101cb cbVar2 = this.f273915w;
            return cbVar2;
        }
    }

    /* renamed from: H */
    public final C60870cx mo90959H(int i) {
        if (!this.f273886G.mo78205l() || !this.f273907o.mo78110ax()) {
            return C60922j.m93044g(m162424N(), new C98087bo(this, i), C60826bg.f164896a);
        }
        return C60922j.m93044g(mo90952A(), C98086bn.f273858a, C60826bg.f164896a);
    }

    /* renamed from: I */
    public final void mo90960I(int i, C7744ii iiVar, boolean z) {
        if (!z) {
            C60856cj.m92910s(mo85620j());
        }
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f273894b) {
            C7805kp kpVar = (C7805kp) this.f273916x.f273875a;
            Location a = kpVar != null ? C91966aq.m150921a(kpVar) : null;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f273887H.mo26870b());
            if (iiVar != null) {
                C7744ii l = this.f273891L.mo85658a().mo86655l(iiVar);
                C98120cu cuVar = this.f273892M;
                C91321az azVar = new C91321az(a, seconds, new TriggerConditionEvaluator.APriori((List) C58485gu.m89845m()), false, cuVar.f273983b);
                C7744ii j = azVar.mo86653j(l);
                if (!azVar.f254867c.isEmpty()) {
                    j = new C91317av(cuVar.f273982a, azVar.f254867c, false).mo86655l(j);
                }
                if (this.f273903k.mo79746e(C90010bp.f246937aF) && j != null) {
                    j = new C98107ch().mo86655l(j);
                }
                if (!this.f273903k.mo79746e(C90010bp.f246923S)) {
                    this.f273908p.mo90983b(j);
                } else if (i == 2) {
                    this.f273908p.mo90983b(j);
                }
                mo90958G(i).mo90950a(j);
                C90998g gVar = this.f273888I;
                String c = C58890d.m90988c(C91323ba.m149296a(i));
                String c2 = C91955af.m150906c(j);
                gVar.mo85270f(c + "EntryTree: " + c2, C90996e.f254198a);
                if (i == 2) {
                    this.f273890K = m162422L(j);
                } else {
                    this.f273889J.add(m162422L(j));
                }
            } else {
                mo90958G(i).mo90950a((Object) null);
                C90998g gVar2 = this.f273888I;
                String c3 = C58890d.m90988c(C91323ba.m149296a(i));
                String c4 = C91955af.m150906c((C7744ii) null);
                gVar2.mo85270f(c3 + "EntryTree: " + c4, C90996e.f254198a);
            }
        }
    }

    /* renamed from: J */
    public final void mo90961J(int i, C57051b bVar, boolean z) {
        C98101cb cbVar;
        if (!z) {
            C60856cj.m92910s(mo85620j());
        }
        if (this.f273903k.mo79746e(C90010bp.f247009u)) {
            synchronized (this.f273894b) {
                synchronized (this.f273894b) {
                    if (i == 1) {
                        cbVar = this.f273881B;
                    } else {
                        cbVar = this.f273882C;
                    }
                }
                cbVar.mo90950a(bVar);
            }
            this.f273888I.mo85270f(C91955af.m150905b(bVar, String.valueOf(C58890d.m90988c(C91323ba.m149296a(i))).concat("FeedId")), C90996e.f254198a);
        }
    }

    /* renamed from: K */
    public final void mo90962K(int i, C57526k kVar, boolean z) {
        C98101cb cbVar;
        if (!z) {
            C60856cj.m92910s(mo85620j());
        }
        if (this.f273903k.mo79746e(C90010bp.f247009u)) {
            synchronized (this.f273894b) {
                synchronized (this.f273894b) {
                    if (i == 1) {
                        cbVar = this.f273918z;
                    } else {
                        cbVar = this.f273880A;
                    }
                }
                cbVar.mo90950a(kVar);
            }
            this.f273888I.mo85270f(C91955af.m150907d(kVar, String.valueOf(C58890d.m90988c(C91323ba.m149296a(i))).concat("Token")), C90996e.f254198a);
        }
    }

    /* renamed from: a */
    public final C60870cx mo85612a() {
        return mo90959H(1);
    }

    /* renamed from: b */
    public final C60870cx mo85613b() {
        return C60922j.m93045h(m162424N(), new C98070ay(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo85614c(boolean z, C8142xb xbVar) {
        if (this.f273886G.mo78205l() && this.f273907o.mo78110ax()) {
            return C60922j.m93044g(mo90952A(), C98078bf.f273848a, C60826bg.f164896a);
        }
        if (!this.f273903k.mo79746e(C90010bp.f246923S)) {
            return mo90959H(1);
        }
        C58976aa aaVar = C58975e.f156826a;
        return this.f273901i.mo28209i(m162424N(), "getForegroundEntryTree", new C98080bh(this, z, xbVar));
    }

    /* renamed from: e */
    public final C60870cx mo85615e() {
        return C60922j.m93044g(m162424N(), new C98088bp(this), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo85616f() {
        return C60922j.m93044g(m162424N(), new C98089bq(this), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo85617g() {
        return C60922j.m93044g(m162424N(), new C98075bc(this), C60826bg.f164896a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("EntryTreeReaderWriter");
        this.f273905m.mo85271g(fVar, "events", (C90997f) null, true);
        this.f273888I.mo85271g(fVar, "contentHistory", (C90997f) null, true);
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("treeStats");
        e.mo85291r("foreground tree");
        if (this.f273903k.mo79746e(C90010bp.f246923S)) {
            C92001t tVar = this.f273890K;
            if (tVar == null) {
                e.mo85292s(C90752i.m148229c("none"));
            } else {
                tVar.mo17602gS(e.mo85281e((Object) null));
            }
        } else {
            e.mo85292s(C90752i.m148229c("second tree not enabled"));
        }
        e.mo85291r("background trees");
        if (this.f273889J.isEmpty()) {
            e.mo85292s(C90752i.m148229c("none"));
            return;
        }
        C58485gu lD = C58485gu.m89842j(this.f273889J).mo55401lD();
        int size = lD.size();
        for (int i = 0; i < size; i++) {
            ((C92001t) lD.get(i)).mo17602gS(e.mo85281e((Object) null));
        }
    }

    /* renamed from: h */
    public final C60870cx mo85618h() {
        return C60922j.m93044g(m162424N(), new C98076bd(this), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C60870cx mo85619i() {
        C60870cx cxVar;
        if (this.f273903k.mo79746e(C90010bp.f246923S)) {
            cxVar = mo90959H(2);
        } else {
            cxVar = mo90959H(1);
        }
        C60870cx g = C60922j.m93044g(cxVar, C98071az.f273838a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: j */
    public final C60870cx mo85620j() {
        synchronized (this.f273894b) {
            if (this.f273909q.mo56113h()) {
                C60870cx cxVar = (C60870cx) this.f273909q.mo56107c();
                return cxVar;
            }
            this.f273909q = C58833ax.m90834k(new SettableFuture());
            this.f273901i.mo28212l("EntryTreeReaderWriter#initialize", new C98069ax(this));
            C60870cx cxVar2 = (C60870cx) this.f273909q.mo56107c();
            return cxVar2;
        }
    }

    /* renamed from: k */
    public final String mo85621k() {
        return (String) ((C58833ax) C60856cj.m92910s(C60856cj.m92893b(mo85620j()).mo57334a(new C98085bm(this), C60826bg.f164896a))).mo56111f();
    }

    /* renamed from: l */
    public final C60870cx mo85626l() {
        C60870cx a;
        synchronized (this.f273894b) {
            a = this.f273893N.mo85235a(new C98091bs(this));
        }
        return a;
    }

    /* renamed from: m */
    public final void mo85627m() {
        C60856cj.m92910s(mo90952A());
    }

    /* renamed from: n */
    public final void mo85628n() {
        C60856cj.m92910s(mo85620j());
        mo90963z(C58836b.f156633a, false);
    }

    /* renamed from: o */
    public final void mo85629o(String str) {
        m162425O(str);
    }

    /* renamed from: p */
    public final void mo85630p() {
        m162425O(this.f273899g.mo79659F());
    }

    /* renamed from: q */
    public final void mo85631q(C7744ii iiVar) {
        mo90960I(1, iiVar, false);
    }

    /* renamed from: r */
    public final void mo85632r(C57051b bVar) {
        mo90961J(1, bVar, false);
    }

    /* renamed from: s */
    public final void mo85633s(C57526k kVar) {
        mo90962K(1, kVar, false);
    }

    /* renamed from: t */
    public final void mo85634t(List list) {
        mo90954C(list, false);
    }

    /* renamed from: u */
    public final void mo85635u(C7744ii iiVar) {
        mo90960I(2, iiVar, false);
    }

    /* renamed from: v */
    public final void mo85636v(C57526k kVar) {
        mo90962K(2, kVar, false);
    }

    /* renamed from: w */
    public final void mo85637w(long j) {
        C60856cj.m92910s(mo85620j());
        synchronized (this.f273894b) {
            this.f273917y = j;
        }
    }

    /* renamed from: x */
    public final void mo85638x(C7805kp kpVar) {
        mo90955D(kpVar, false);
    }

    /* renamed from: y */
    public final void mo85639y(C7957qf qfVar) {
        C60856cj.m92910s(mo85620j());
        synchronized (this.f273894b) {
            this.f273883D.mo90950a(qfVar);
        }
    }

    /* renamed from: z */
    public final C58833ax mo90963z(C58833ax axVar, boolean z) {
        C7744ii iiVar;
        C7744ii iiVar2;
        C57051b bVar;
        C57051b bVar2;
        synchronized (this.f273894b) {
            iiVar = (C7744ii) this.f273914v.f273875a;
            iiVar2 = (C7744ii) this.f273915w.f273875a;
            bVar = (C57051b) this.f273881B.f273875a;
            bVar2 = (C57051b) this.f273884E.f273875a;
        }
        if (iiVar == null || iiVar.f27069o) {
            C58976aa aaVar = C58975e.f156826a;
            this.f273905m.mo85270f("No promotion: missing background tree", C90996e.f254198a);
            return C58833ax.m90833j(iiVar2);
        }
        String c = C91955af.m150906c(iiVar2);
        String c2 = C91955af.m150906c(iiVar);
        if (c.equals(c2)) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f273905m.mo85270f("No promotion: already promoted ".concat(String.valueOf(c2)), C90996e.f254198a);
            return C58833ax.m90833j(iiVar2);
        } else if (bVar2 == null || iiVar2 == null || !bVar2.equals(bVar)) {
            mo90960I(2, iiVar, false);
            synchronized (this.f273894b) {
                mo90962K(2, (C57526k) this.f273918z.f273875a, false);
                mo90961J(2, (C57051b) this.f273881B.f273875a, false);
            }
            this.f273898f.mo85649i(c2, (C8142xb) axVar.mo56109e(C8142xb.UNKNOWN_SURFACE));
            String name = axVar.mo56113h() ? ((C8142xb) axVar.mo56107c()).name() : "background refresh";
            C58976aa aaVar3 = C58975e.f156826a;
            this.f273905m.mo85270f(String.format("Promoting %s to replace %s for %s", new Object[]{c2, c, name}), C90996e.f254198a);
            if (z) {
                C90875ai.m148465b(new C98096bx(this, c2), mo85626l(), this.f273902j, "persist").mo85223a(new C98068aw(this));
            }
            return C58833ax.m90834k(iiVar);
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            this.f273905m.mo85270f("No promotion: already discarded ".concat(String.valueOf(c2)), C90996e.f254198a);
            return C58833ax.m90833j(iiVar2);
        }
    }
}
