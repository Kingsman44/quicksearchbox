package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6859i.p6860a.C86750a;
import com.google.android.apps.gsa.search.core.state.C86978dd;
import com.google.android.apps.gsa.search.core.state.C87087gj;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.core.state.p6864a.C86795j;
import com.google.android.apps.gsa.search.core.state.p6865b.C86831a;
import com.google.android.apps.gsa.search.core.state.p6872d.C86925as;
import com.google.android.apps.gsa.search.core.state.p6872d.C86966r;
import com.google.android.apps.gsa.search.core.state.p6874f.C87038e;
import com.google.android.apps.gsa.search.core.state.p6875g.C87066a;
import com.google.android.apps.gsa.search.core.state.p6875g.C87067b;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87710as;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87712au;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.C89957y;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.logger.p7050a.C89835a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C89996bb;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.C90500h;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.p7138b.C90488d;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60537to;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gk */
/* compiled from: PG */
public final class C116735gk extends C116780ib implements C86795j {

    /* renamed from: E */
    private static final C58528ij f323732E = C58528ij.m90015O("debug_search_scheme_override", "debug_search_domain_override", "debug_js_injection_enabled", "debug_js_server_address", C90507o.f253011a, C90507o.f253013c, C90507o.f253014d, "safe_search", "gservices_overrides");

    /* renamed from: F */
    private static final C58528ij f323733F = C58528ij.m90012L("and.gsa.launcher.homescreen.appssearch", "and.gsa.launcher.allapps.appssearch", "and.gsa.launcher.shelf.appssearch");

    /* renamed from: a */
    public static final C59071e f323734a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.gk");

    /* renamed from: A */
    public boolean f323735A;

    /* renamed from: B */
    public boolean f323736B;

    /* renamed from: C */
    public boolean f323737C;

    /* renamed from: D */
    public boolean f323738D;

    /* renamed from: G */
    private final C68214a f323739G;

    /* renamed from: H */
    private final C68214a f323740H;

    /* renamed from: L */
    private final C68214a f323741L;

    /* renamed from: M */
    private final C68214a f323742M;

    /* renamed from: N */
    private final C68214a f323743N;

    /* renamed from: O */
    private final C68214a f323744O;

    /* renamed from: P */
    private final C68214a f323745P;

    /* renamed from: Q */
    private final C68214a f323746Q;

    /* renamed from: R */
    private final C68214a f323747R;

    /* renamed from: S */
    private final C68214a f323748S;

    /* renamed from: T */
    private final C68214a f323749T;

    /* renamed from: U */
    private final C68214a f323750U;

    /* renamed from: V */
    private final C68214a f323751V;

    /* renamed from: W */
    private final C68214a f323752W;

    /* renamed from: X */
    private final C68214a f323753X;

    /* renamed from: Y */
    private final C68214a f323754Y;

    /* renamed from: Z */
    private final C87541c f323755Z;

    /* renamed from: aa */
    private final C89835a f323756aa;

    /* renamed from: ab */
    private final C68214a f323757ab;

    /* renamed from: ac */
    private final C22871g f323758ac;

    /* renamed from: ad */
    private final C90476a f323759ad;

    /* renamed from: ae */
    private final C85171a f323760ae;

    /* renamed from: af */
    private final C21370a f323761af;

    /* renamed from: ag */
    private boolean f323762ag;

    /* renamed from: ah */
    private Query f323763ah = Query.f252741b;

    /* renamed from: ai */
    private boolean f323764ai;

    /* renamed from: aj */
    private boolean f323765aj;

    /* renamed from: ak */
    private boolean f323766ak;

    /* renamed from: al */
    private final Queue f323767al = new C58781rt(new C58425eo(3));

    /* renamed from: am */
    private boolean f323768am;

    /* renamed from: an */
    private boolean f323769an;

    /* renamed from: b */
    public final C68214a f323770b;

    /* renamed from: c */
    public final C68214a f323771c;

    /* renamed from: d */
    public final C68214a f323772d;

    /* renamed from: e */
    public final C68214a f323773e;

    /* renamed from: f */
    public final C68214a f323774f;

    /* renamed from: g */
    public final C68214a f323775g;

    /* renamed from: h */
    public final C68214a f323776h;

    /* renamed from: i */
    public final C68214a f323777i;

    /* renamed from: j */
    public final C68214a f323778j;

    /* renamed from: k */
    public final C86124t f323779k;

    /* renamed from: l */
    public final C68214a f323780l;

    /* renamed from: m */
    public final C85232a f323781m;

    /* renamed from: n */
    public long f323782n;

    /* renamed from: o */
    public Query f323783o;

    /* renamed from: p */
    public Query f323784p;

    /* renamed from: q */
    public Query f323785q;

    /* renamed from: r */
    public Query f323786r;

    /* renamed from: s */
    public Query f323787s = Query.f252741b;

    /* renamed from: t */
    public boolean f323788t;

    /* renamed from: u */
    final List f323789u = new ArrayList();

    /* renamed from: v */
    public Bundle f323790v;

    /* renamed from: w */
    public final C116734gj f323791w;

    /* renamed from: x */
    public boolean f323792x;

    /* renamed from: y */
    public boolean f323793y;

    /* renamed from: z */
    public boolean f323794z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116735gk(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C68214a aVar16, C68214a aVar17, C68214a aVar18, C68214a aVar19, C68214a aVar20, C68214a aVar21, C68214a aVar22, C68214a aVar23, C68214a aVar24, C68214a aVar25, C86124t tVar, C87541c cVar, C89835a aVar26, C85232a aVar27, C85171a aVar28, C68214a aVar29, C68214a aVar30, C22871g gVar, C90476a aVar31, C21370a aVar32) {
        super(aVar, 150);
        C58976aa aaVar = C58975e.f156826a;
        this.f323739G = aVar;
        this.f323740H = aVar2;
        this.f323741L = aVar3;
        this.f323770b = aVar4;
        this.f323771c = aVar5;
        this.f323742M = aVar6;
        this.f323743N = aVar7;
        this.f323744O = aVar8;
        this.f323745P = aVar9;
        this.f323746Q = aVar10;
        this.f323747R = aVar11;
        this.f323772d = aVar12;
        this.f323748S = aVar13;
        this.f323773e = aVar14;
        this.f323774f = aVar15;
        this.f323749T = aVar16;
        this.f323775g = aVar17;
        this.f323753X = aVar22;
        this.f323776h = aVar20;
        this.f323750U = aVar18;
        this.f323751V = aVar19;
        this.f323752W = aVar21;
        this.f323754Y = aVar23;
        this.f323777i = aVar24;
        this.f323778j = aVar25;
        this.f323779k = tVar;
        this.f323755Z = cVar;
        Query u = Query.f252741b.mo84259V().mo84493u();
        this.f323784p = u;
        this.f323783o = u.mo84262Z();
        this.f323785q = Query.f252741b;
        this.f323786r = Query.f252741b;
        this.f323791w = new C116734gj(aVar9);
        this.f323756aa = aVar26;
        this.f323781m = aVar27;
        this.f323760ae = aVar28;
        this.f323780l = aVar29;
        this.f323757ab = aVar30;
        this.f323758ac = gVar;
        this.f323759ad = aVar31;
        this.f323761af = aVar32;
    }

    /* renamed from: aA */
    private static void m193752aA(C91006f fVar, String str, Query query) {
        if (query.equals(Query.f252741b)) {
            fVar.mo85279c(str).mo85276a(C90752i.m148229c("EMPTY"));
        } else {
            fVar.mo85288o(str, query);
        }
    }

    /* renamed from: aB */
    private final void m193753aB(boolean z, List list) {
        C116836z zVar = (C116836z) this.f323770b.mo27525b();
        ActionData actionData = zVar.f324250j;
        boolean z2 = false;
        boolean z3 = true;
        if ((this.f323784p.mo84420dA() || this.f323784p.mo84369cB()) && !this.f323784p.mo84391cX() && !this.f323784p.mo84371cD() && ((!zVar.mo102986P(this.f323784p) || (actionData != null && actionData.mo81098i())) && !z)) {
            z3 = false;
        }
        if (actionData != null && !actionData.mo81098i() && zVar.mo102986P(this.f323784p) && ((this.f323784p.mo84420dA() && this.f323779k.mo79746e(C90139r.f251862j)) || (this.f323784p.mo84392cY() && this.f323779k.mo79746e(C90139r.f251861i)))) {
            z3 = false;
        }
        if (!this.f323784p.mo84420dA() || this.f323784p.mo84391cX()) {
            z2 = z3;
        }
        if (!m193756aE(this.f323784p) && z2) {
            C58976aa aaVar = C58975e.f156826a;
            list.add(((C86831a) this.f323739G.mo27525b()).mo80527i(this.f323784p));
        }
    }

    /* renamed from: aC */
    private final void m193754aC() {
        if (this.f323765aj) {
            this.f323765aj = false;
            this.f323766ak = true;
            this.f323769an = true;
        }
    }

    /* renamed from: aD */
    private final void m193755aD(Query query) {
        mo102870I(query);
        this.f323783o = this.f323784p;
    }

    /* renamed from: aE */
    private static boolean m193756aE(Query query) {
        return query.mo84434dO() && query.mo84340bY();
    }

    /* renamed from: aF */
    private final boolean m193757aF(Query query) {
        if (this.f323788t || !this.f323784p.mo84383cP(query) || this.f323784p.mo84391cX() || ((C116836z) this.f323770b.mo27525b()).mo102986P(this.f323784p)) {
            return false;
        }
        this.f323788t = true;
        return true;
    }

    /* renamed from: av */
    public static final void m193758av(Collection collection, boolean z, Object obj) {
        if (z) {
            collection.add(obj);
        }
    }

    /* renamed from: aw */
    private final LatencyEvents m193759aw() {
        return C89838ab.m146259c(this.f323779k.mo79743a(C89996bb.f246776f));
    }

    /* renamed from: ax */
    private final Query m193760ax(Query query) {
        C87087gj gjVar = (C87087gj) this.f323751V.mo27525b();
        return query.mo84343bb(C87087gj.m140725a(query));
    }

    /* renamed from: az */
    private final Query m193761az(Query query) {
        return (!query.mo84392cY() || ((C86966r) this.f323753X.mo27525b()).f234900a.mo83040a()) ? query : query.mo84238A();
    }

    /* renamed from: g */
    public static ActionData m193762g(Bundle bundle) {
        return (ActionData) bundle.getParcelable("velvet:query_state:action_data");
    }

    /* renamed from: m */
    public static Query m193763m(Bundle bundle) {
        return (Query) bundle.getParcelable("velvet:query_state:query");
    }

    /* renamed from: A */
    public final void mo102864A(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f323784p.mo84383cP(query)) {
            C87038e.m140570d(query, this.f323777i, this.f323779k);
            C116734gj gjVar = this.f323791w;
            if (!gjVar.mo102857h()) {
                gjVar.f323729d = true;
                mo80591ar();
            }
        }
    }

    /* renamed from: B */
    public final void mo102865B() {
        this.f323762ag = true;
        mo102889af(false);
        this.f323762ag = false;
        mo80591ar();
    }

    /* renamed from: C */
    public final boolean mo80454C(Query query) {
        return this.f323791w.mo102859j(query) && this.f323791w.f323729d;
    }

    /* renamed from: D */
    public final void mo102866D() {
        this.f323765aj = false;
        this.f323766ak = false;
        this.f323769an = false;
    }

    /* renamed from: E */
    public final void mo102867E(Query query) {
        if (mo102891ai(query)) {
            mo80591ar();
        }
    }

    /* renamed from: F */
    public final void mo102868F(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo102892aj(query)) {
            mo80591ar();
        }
    }

    /* renamed from: G */
    public final void mo102869G(Query query, C58833ax axVar) {
        if (this.f323784p.mo84383cP(query) && !this.f323791w.mo102860k(this.f323784p)) {
            ActionData actionData = ActionData.f235991b;
            if (this.f323784p.mo84433dN()) {
                C87038e.m140567a(this.f323784p, axVar);
                if (axVar.mo56113h()) {
                    actionData = (ActionData) axVar.mo56107c();
                }
            }
            this.f323791w.mo102862m(actionData);
            if (axVar.mo56113h()) {
                mo80591ar();
            }
        }
    }

    /* renamed from: H */
    public final boolean mo80455H() {
        if (this.f323784p.mo84385cR()) {
            return false;
        }
        if (this.f323784p.mo84383cP(this.f323791w.f323727b)) {
            return this.f323791w.mo102858i(this.f323784p);
        }
        return true;
    }

    /* renamed from: I */
    public final void mo102870I(Query query) {
        long j = query.f252749G;
        if (j == 0 || j == this.f323784p.f252749G) {
            C59104x d = f323734a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S_QueryState");
            ((C59052c) ((C59052c) d).mo56372aa(32150)).mo56386p("Commit without new request id. This shouldn't happen.");
        }
        long f = query.mo84476f("text-search-timestamp");
        long f2 = query.mo84476f("suggestion-click-timestamp");
        long f3 = query.mo84476f("googleapp-qsubts-override");
        if (f > 0) {
            C90498f i = query.mo84280aQ(C21383f.m40448a(this.f323761af, f)).mo84279aP(f).mo84480i();
            i.mo84574f("text-search-timestamp");
            query = i.mo84568a();
        } else if (f2 > 0) {
            C90498f i2 = query.mo84280aQ(C21383f.m40448a(this.f323761af, f2)).mo84279aP(f2).mo84480i();
            i2.mo84574f("suggestion-click-timestamp");
            query = i2.mo84568a();
        } else if (f3 > 0) {
            C90498f i3 = query.mo84280aQ(C21383f.m40448a(this.f323761af, f3)).mo84279aP(f3).mo84480i();
            i3.mo84574f("googleapp-qsubts-override");
            query = i3.mo84568a();
        }
        if (query.mo84388cU() && !this.f323768am) {
            C58976aa aaVar = C58975e.f156826a;
            ((C116802ix) this.f323754Y.mo27525b()).mo102952e(C86724d.SEARCH_TEXT);
        }
        if (!query.mo84385cR()) {
            C87038e.m140572f(query, ((C86792g) this.f323741L.mo27525b()).mo80446e(), this.f323752W, this.f323753X, this.f323777i, this.f323778j, this.f323779k);
            if (this.f323779k.mo79746e(C90085ej.f250161al) && !TextUtils.isEmpty(query.mo84352bk())) {
                ((SharedPreferences) this.f323780l.mo27525b()).edit().putString("previous_query", query.mo84352bk()).putLong("previous_query_ms", query.f252745C).apply();
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C58838bb.m90883r(!query.mo84403cj());
        this.f323784p = m193761az(query);
    }

    /* renamed from: J */
    public final boolean mo80456J() {
        return mo102900k() == null && this.f323783o.mo84385cR();
    }

    /* renamed from: K */
    public final boolean mo80457K() {
        return ((C116599bj) this.f323744O.mo27525b()).mo102793e();
    }

    /* renamed from: L */
    public final void mo102871L(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo102892aj(query.mo84481j(this.f323783o).mo84485n()) && !mo102879U()) {
            m193754aC();
            if (((C116836z) this.f323770b.mo27525b()).mo102987Q()) {
                Query q = this.f323783o.mo84488q();
                this.f323783o = q;
                this.f323783o = m193760ax(q);
            }
            this.f323783o = this.f323783o.mo84262Z().mo84484m().mo84483l(m193759aw());
            mo80591ar();
        }
    }

    /* renamed from: M */
    public final void mo102872M(Query query) {
        if (m193757aF(query)) {
            mo80591ar();
        }
    }

    /* renamed from: N */
    public final void mo102873N(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90883r(!query.mo84403cj());
        this.f323784p = m193761az(query);
    }

    /* renamed from: O */
    public final boolean mo102874O() {
        return this.f323791w.mo102860k(this.f323784p);
    }

    /* renamed from: P */
    public final boolean mo102875P(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        C58838bb.m90883r(!query.mo84403cj());
        if (query.mo84378cK()) {
            C90498f i = query.mo84480i();
            i.mo84572d(268435456, 0);
            query = i.mo84568a();
        }
        mo102892aj(query);
        Query ea = this.f323783o.mo84473ea();
        this.f323783o = ea;
        Query aJ = ea.mo84273aJ(this.f323779k.mo79746e(C90014bt.f247776nY));
        this.f323783o = aJ;
        if (!this.f323764ai) {
            this.f323783o = aJ.mo84277aN().mo84265aB();
        }
        if (this.f323783o.mo84420dA() || this.f323783o.mo84369cB()) {
            this.f323783o = this.f323783o.mo84483l(m193759aw());
        }
        if (TextUtils.isEmpty(this.f323783o.mo84355bn())) {
            Query query2 = this.f323783o;
            C89835a aVar = this.f323756aa;
            String str = aVar.f243162a;
            this.f323783o = query2.mo84275aL(aVar.f243162a);
        }
        if (!this.f323783o.mo84362bu()) {
            return false;
        }
        mo102906v();
        Query aK = this.f323783o.mo84274aK("search");
        this.f323783o = aK;
        m193755aD(aK.mo84493u());
        if (this.f323783o.mo84392cY()) {
            this.f323767al.add(this.f323783o.f252768g.toString());
        }
        this.f323737C = true;
        m193754aC();
        this.f323755Z.mo81656r(this.f323784p);
        this.f323794z = false;
        this.f323736B = false;
        if (this.f323788t) {
            this.f323788t = false;
        }
        mo102887ad();
        return true;
    }

    /* renamed from: Q */
    public final boolean mo102876Q(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo102879U() || this.f323783o.mo84378cK()) {
            if (this.f323784p.mo84418cy() && !z) {
                return false;
            }
            ClientConfig clientConfig = ((C116569ag) this.f323771c.mo27525b()).f323267a;
            Query k = mo102900k();
            if (this.f323789u.size() == 1 && k != null && k.mo84385cR() && clientConfig.mo81888f()) {
                ((C86978dd) this.f323740H.mo27525b()).mo80617b(((C116572aj) this.f323742M.mo27525b()).f323290a);
            }
            C116836z zVar = (C116836z) this.f323770b.mo27525b();
            VoiceAction f = zVar.mo80807f();
            ActionData actionData = zVar.f324250j;
            if (!(actionData == null || f == null || f.mo81052B())) {
                ((C86925as) zVar.f324245e.mo27525b()).mo80575g(actionData, 32);
            }
            this.f323785q = Query.f252741b;
            Query query = this.f323784p;
            if (!mo102889af(false)) {
                return false;
            }
            ((C116742gr) this.f323772d.mo27525b()).mo102921n(C60537to.BACK_PRESSED);
            this.f323782n = query.f252749G;
        } else if (!this.f323783o.mo84384cQ()) {
            this.f323783o = this.f323784p;
        } else {
            this.f323783o = this.f323783o.mo84481j(this.f323784p);
        }
        mo80591ar();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final boolean mo102877R() {
        C116734gj gjVar = this.f323791w;
        return gjVar.mo102859j(this.f323784p) && gjVar.f323726a == 4;
    }

    /* renamed from: S */
    public final boolean mo80458S() {
        return (this.f323784p.mo84420dA() && !this.f323784p.mo84397cd() && this.f323784p.f252770i.isEmpty()) || this.f323784p.mo84369cB();
    }

    /* renamed from: T */
    public final boolean mo102878T() {
        return !this.f323785q.equals(Query.f252741b);
    }

    /* renamed from: U */
    public final boolean mo102879U() {
        return !this.f323784p.mo84383cP(this.f323783o);
    }

    /* renamed from: V */
    public final boolean mo102880V(Query query) {
        return this.f323791w.mo102861l(query) || mo102881W(query);
    }

    /* renamed from: W */
    public final boolean mo102881W(Query query) {
        C116734gj gjVar = this.f323791w;
        if (gjVar.mo102859j(query) && gjVar.f323726a == 5) {
            return true;
        }
        SearchError e = ((C116611bv) this.f323745P.mo27525b()).mo102795e(query);
        boolean z = e != null && e.f236024h == 7;
        if (!this.f323784p.mo84383cP(query) || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final boolean mo80459X() {
        return ((C116800iv) this.f323775g.mo27525b()).mo102948g();
    }

    /* renamed from: Y */
    public final boolean mo102882Y() {
        return this.f323784p.mo84385cR() && !((C116569ag) this.f323771c.mo27525b()).f323267a.mo81894l();
    }

    /* renamed from: Z */
    public final boolean mo102883Z(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        return !this.f323786r.equals(Query.f252741b) && this.f323786r.mo84383cP(query);
    }

    /* renamed from: aa */
    public final boolean mo102884aa() {
        return ((SharedPreferences) this.f323780l.mo27525b()).getLong("agsa_legacy_voice_search_punt_count", 0) >= this.f323779k.mo79743a(C90110fh.f250665bJ);
    }

    /* renamed from: ab */
    public final boolean mo102885ab() {
        return this.f323783o.f252768g.toString().isEmpty();
    }

    /* renamed from: ac */
    public final boolean mo102886ac() {
        C116836z zVar = (C116836z) this.f323770b.mo27525b();
        boolean s = ((TtsState) this.f323774f.mo27525b()).mo102763s(zVar.mo103015j());
        boolean z = zVar.mo102998ac() || this.f323784p.mo84374cG();
        boolean U = mo102879U();
        if (this.f323785q.equals(Query.f252741b) || !s || !z || U) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        C58838bb.m90883r(zVar.mo102986P(this.f323784p));
        Query query = this.f323785q;
        mo102906v();
        mo102870I(query.mo84483l(m193759aw()));
        this.f323737C = true;
        this.f323783o = this.f323783o.mo84482k(this.f323784p);
        C58976aa aaVar2 = C58975e.f156826a;
        return true;
    }

    /* renamed from: ad */
    public final boolean mo102887ad() {
        boolean z;
        if (!this.f323735A && !this.f323784p.mo84385cR() && !this.f323784p.equals(Query.f252741b)) {
            if (!this.f323784p.mo84427dH() || !this.f323784p.mo84426dG()) {
                C116836z zVar = (C116836z) this.f323770b.mo27525b();
                if (zVar.mo102986P(this.f323784p) && zVar.mo102998ac()) {
                    if (zVar.mo102990U()) {
                        z = this.f323784p.mo84427dH();
                        this.f323735A = z;
                    } else {
                        z = this.f323784p.mo84426dG();
                        this.f323735A = z;
                    }
                    if (z) {
                        mo102897au((C116569ag) this.f323771c.mo27525b());
                    }
                    return this.f323735A;
                }
            } else {
                this.f323735A = true;
                mo102897au((C116569ag) this.f323771c.mo27525b());
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r7.mo81098i() == false) goto L_0x008f;
     */
    /* renamed from: ae */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo102888ae(com.google.android.apps.gsa.shared.search.Query r5, boolean r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            com.google.android.apps.gsa.shared.search.Query r0 = r4.f323784p
            boolean r0 = r0.mo84383cP(r5)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            com.google.android.apps.gsa.staticplugins.search.session.state.gj r0 = r4.f323791w
            boolean r0 = r0.mo102858i(r5)
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r0 != 0) goto L_0x001a
            return r1
        L_0x001a:
            boolean r0 = r5.mo84420dA()
            if (r0 == 0) goto L_0x00ed
            dagger.a r0 = r4.f323748S
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gp r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116740gp) r0
            dagger.a r3 = r4.f323771c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r3 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r3
            com.google.android.apps.gsa.search.shared.service.ClientConfig r3 = r3.f323267a
            boolean r3 = r3.mo81902t()
            if (r3 != 0) goto L_0x0045
            boolean r3 = r0.mo102912i()
            if (r3 != 0) goto L_0x0044
            boolean r0 = r0.mo102914k()
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            if (r7 != 0) goto L_0x004f
            if (r8 != 0) goto L_0x004f
            boolean r8 = r5.mo84338bW()
            if (r8 != 0) goto L_0x0054
        L_0x004f:
            if (r6 != 0) goto L_0x00a3
            if (r1 == 0) goto L_0x0054
            goto L_0x00a3
        L_0x0054:
            if (r7 == 0) goto L_0x005e
            com.google.android.apps.gsa.staticplugins.search.session.state.gj r7 = r4.f323791w
            r8 = 6
            r7.mo102856g(r8)
            goto L_0x00f2
        L_0x005e:
            com.google.android.apps.gsa.staticplugins.search.session.state.gj r7 = r4.f323791w
            r8 = 5
            r7.mo102856g(r8)
            com.google.android.apps.gsa.search.core.i.t r7 = r4.f323779k
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250663bH
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x008f
            dagger.a r7 = r4.f323770b
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r7
            boolean r7 = r7.mo102986P(r5)
            if (r7 == 0) goto L_0x00f2
            dagger.a r7 = r4.f323770b
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r7
            com.google.android.apps.gsa.search.shared.actions.ActionData r7 = r7.f324250j
            r7.getClass()
            boolean r7 = r7.mo81098i()
            if (r7 != 0) goto L_0x00f2
        L_0x008f:
            dagger.a r7 = r4.f323770b
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r7
            r7.mo102978H()
            r7.f324249i = r5
            r7.mo103010aw(r2)
            r7.mo80591ar()
            goto L_0x00f2
        L_0x00a3:
            dagger.a r7 = r4.f323770b
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r7
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r7 = r7.mo80807f()
            if (r7 == 0) goto L_0x00e9
            com.google.common.o.uf r8 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.common.o.tz r8 = (com.google.common.p4552o.C60548tz) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            int r1 = r0.f164093a
            r1 = r1 | 2
            r0.f164093a = r1
            r1 = 159(0x9f, float:2.23E-43)
            r0.f164258m = r1
            com.google.bb.a.x r7 = r7.mo81066g()
            int r7 = r7.f146230cP
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            int r1 = r0.f164093a
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.f164093a = r1
            r0.f164264s = r7
            com.google.protobuf.bv r7 = r8.build()
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7
            r8 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r7, r8, r8, r8)
        L_0x00e9:
            r4.mo102889af(r2)
            goto L_0x00f2
        L_0x00ed:
            com.google.android.apps.gsa.staticplugins.search.session.state.gj r7 = r4.f323791w
            r7.mo102855f()
        L_0x00f2:
            if (r6 != 0) goto L_0x00f6
            com.google.android.apps.gsa.shared.search.Query r5 = com.google.android.apps.gsa.shared.search.Query.f252741b
        L_0x00f6:
            r4.f323763ah = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk.mo102888ae(com.google.android.apps.gsa.shared.search.Query, boolean, boolean, boolean):boolean");
    }

    /* renamed from: af */
    public final boolean mo102889af(boolean z) {
        Query query;
        C58976aa aaVar = C58975e.f156826a;
        C116836z zVar = (C116836z) this.f323770b.mo27525b();
        ActionData actionData = zVar.mo102986P(this.f323784p) ? zVar.f324250j : null;
        C116732gh ghVar = new C116732gh(this);
        if (actionData != null && (actionData.mo81089a() > 0 || actionData.f236001k > 0)) {
            mo102890ah(ghVar);
            List list = this.f323789u;
            ActionData g = m193762g((Bundle) list.get(list.size() - 1));
            if (!this.f323789u.isEmpty() && g != null && g.mo81099j()) {
                List list2 = this.f323789u;
                list2.remove(list2.size() - 1);
            }
        }
        mo102890ah(ghVar);
        int size = this.f323789u.size() - 1;
        if (size < 0) {
            ((C86831a) this.f323739G.mo27525b()).mo80526b((Bundle) null);
            return false;
        }
        Bundle bundle = (Bundle) this.f323789u.remove(size);
        C89949q.m146526k(C89957y.m146538a());
        Query m = m193763m(bundle);
        if (z) {
            query = m.mo84247J();
        } else {
            query = m.mo84499z();
        }
        if (this.f323735A) {
            query = query.mo84277aN().mo84265aB();
        }
        if (this.f323762ag) {
            query = query.mo84239B();
        }
        m193755aD(query);
        C116734gj gjVar = this.f323791w;
        gjVar.f323729d = true;
        gjVar.mo102855f();
        ActionData g2 = m193762g(bundle);
        if (g2 != null) {
            C116714fq fqVar = (C116714fq) this.f323746Q.mo27525b();
            fqVar.f323678b = this.f323784p;
            if (!g2.mo81102m()) {
                g2 = ActionData.f235991b;
            }
            fqVar.f323679c = g2;
        }
        this.f323737C = true;
        this.f323790v = bundle;
        return true;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.UNDOABLE_INTERACTION_NOT_HANDLED, C87739bu.STOP_LISTENING, C87739bu.QUERY_SET, C87739bu.QUERY_EDIT, C87739bu.CANCEL, C87739bu.GO_BACK, C87739bu.RELOAD_QUERY_STATE, C87739bu.QUERY_COMMIT, C87739bu.MANUAL_CORRECTION_ON_VOICE_PLATE, C87739bu.LANGUAGE_SWITCHER_TAPPED};
    }

    /* renamed from: ah */
    public final boolean mo102890ah(C58839bc bcVar) {
        int size = this.f323789u.size() - 1;
        boolean z = false;
        while (size > 0 && !bcVar.mo5941a(this.f323789u.get(size))) {
            this.f323789u.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public final boolean mo102891ai(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90868c(query.mo84468dv());
        if (!this.f323784p.mo84383cP(query)) {
            return false;
        }
        mo102870I(query.mo84493u());
        this.f323783o = this.f323784p;
        this.f323737C = true;
        return true;
    }

    /* renamed from: aj */
    public final boolean mo102892aj(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (query == this.f323783o) {
            return false;
        }
        this.f323783o = m193760ax(query);
        return true;
    }

    /* renamed from: ak */
    public final boolean mo102893ak(Query query) {
        C58838bb.m90883r(!query.mo84385cR());
        if (!this.f323784p.mo84383cP(query)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } else if (this.f323763ah.f252780s == query.f252780s) {
            this.f323763ah = Query.f252741b;
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            return false;
        }
    }

    @Deprecated
    /* renamed from: al */
    public final boolean mo102894al() {
        return mo102879U() || this.f323784p.mo84468dv();
    }

    /* renamed from: as */
    public final boolean mo102895as(Query query, Query query2) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f323784p.mo84383cP(query)) {
            return false;
        }
        if (query2.mo84338bW()) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 224;
            String b = C39191a.m68623b(this.f323784p.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            this.f323785q = query2.mo84493u();
            mo102886ac();
        } else {
            if (query2.mo84384cQ()) {
                C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar2.copyOnWrite();
                C60555uf ufVar3 = (C60555uf) tzVar2.instance;
                ufVar3.f164093a |= 2;
                ufVar3.f164258m = 225;
                String b2 = C39191a.m68623b(this.f323784p.f252749G);
                tzVar2.copyOnWrite();
                C60555uf ufVar4 = (C60555uf) tzVar2.instance;
                b2.getClass();
                ufVar4.f164093a |= 4;
                ufVar4.f164259n = b2;
                C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
                mo102873N(query2);
            } else {
                C60548tz tzVar3 = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar3.copyOnWrite();
                C60555uf ufVar5 = (C60555uf) tzVar3.instance;
                ufVar5.f164093a |= 2;
                ufVar5.f164258m = 226;
                String b3 = C39191a.m68623b(this.f323784p.f252749G);
                tzVar3.copyOnWrite();
                C60555uf ufVar6 = (C60555uf) tzVar3.instance;
                b3.getClass();
                ufVar6.f164093a |= 4;
                ufVar6.f164259n = b3;
                C89949q.m146525j((C60555uf) tzVar3.build(), (C60321oe) null, (C63196b) null, (String) null);
                mo102870I(query2.mo84493u());
            }
            this.f323783o = this.f323784p;
            this.f323785q = Query.f252741b;
            this.f323737C = true;
        }
        return true;
    }

    /* renamed from: at */
    public final boolean mo102896at() {
        boolean z = this.f323766ak;
        this.f323766ak = false;
        return z;
    }

    /* renamed from: au */
    public final boolean mo102897au(C116569ag agVar) {
        boolean z = agVar.f323267a.mo81881K() && !this.f323735A;
        if (z == this.f323764ai) {
            return false;
        }
        this.f323764ai = z;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo102898e(Query query) {
        Bundle bundle = this.f323790v;
        if (bundle != null && query.mo84383cP(m193763m(bundle))) {
            return this.f323790v.getLong("velvet:query_state:search_result_id");
        }
        if (query.mo84452df()) {
            for (Bundle bundle2 : this.f323789u) {
                Query m = m193763m(bundle2);
                long j = m.f252752J;
                long j2 = query.f252752J;
                if (j2 != 0 && j != 0 && j2 == j && query.mo84346be().equals(m.mo84346be())) {
                    return bundle2.getLong("velvet:query_state:search_result_id");
                }
            }
        }
        return 0;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("QueryState");
        ArrayList arrayList = new ArrayList();
        m193758av(arrayList, this.f323788t, "stop-listening-pending");
        m193758av(arrayList, this.f323792x, "browser-dimensions-available");
        m193758av(arrayList, this.f323793y, "web-corpora-available");
        m193758av(arrayList, this.f323794z, "intent-corpus-handled");
        m193758av(arrayList, this.f323735A, "session-solidified");
        m193758av(arrayList, this.f323765aj, "session-needs-clear-web-view");
        m193758av(arrayList, this.f323766ak, "session-awaiting-clear-web-view");
        m193758av(arrayList, this.f323736B, "recognition-paused-on-demand");
        if (!arrayList.isEmpty()) {
            fVar.mo85292s(C90752i.m148229c(new C58827ar(", ").mo56097d(arrayList)));
        }
        m193752aA(fVar, "Query", this.f323783o);
        m193752aA(fVar, "Committed query", this.f323784p);
        m193752aA(fVar, "Pending follow-on query", this.f323785q);
        m193752aA(fVar, "Cancel recognition pending query", this.f323763ah);
        Query query = this.f323783o;
        if (query != null) {
            if (query.mo84392cY()) {
                fVar.mo85278b("How text was entered").mo85276a(C90752i.m148229c("text"));
            } else if (query.mo84420dA()) {
                fVar.mo85278b("How text was entered").mo85276a(C90752i.m148229c("voice"));
            }
            fVar.mo85278b("Last text entered").mo85276a(C90752i.m148233g(this.f323783o.f252768g));
            fVar.mo85278b("Last 3 queries").mo85276a(C90752i.m148233g(this.f323767al.toString()));
            if (this.f323783o.mo84438dS()) {
                fVar.mo85284k("Last query native", "true");
            } else {
                fVar.mo85284k("Last query native", "false");
            }
        }
        fVar.mo85290q("Network action state", this.f323791w);
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Backstack");
        int size = this.f323789u.size();
        while (true) {
            size--;
            if (size >= 0) {
                Bundle bundle = (Bundle) this.f323789u.get(size);
                C91006f e2 = e.mo85281e((Object) null);
                e2.mo85291r(String.valueOf(size));
                e2.mo85285l(m193763m(bundle));
                e2.mo85285l(m193762g(bundle));
            } else {
                return;
            }
        }
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        ((C86237bt) this.f323743N.mo27525b()).mo79905b();
        mo102903s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hm */
    public final void mo80709hm(Query query, Bundle bundle) {
        bundle.putParcelable("velvet:query_state:query", this.f323784p);
        C116836z zVar = (C116836z) this.f323770b.mo27525b();
        bundle.putParcelable("velvet:query_state:action_data", zVar.f324250j);
        List list = zVar.f324251k;
        if (list != null) {
            bundle.putParcelableArrayList("velvet:query_state:voice_actions", new ArrayList(list));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList(this.f323789u);
        m193753aB(true, arrayList);
        C87066a aVar = (C87066a) C87067b.f235250e.createBuilder();
        boolean z = this.f323735A;
        aVar.copyOnWrite();
        C87067b bVar = (C87067b) aVar.instance;
        bVar.f235253a |= 2;
        bVar.f235256d = z;
        Query query = this.f323783o;
        if (query != null) {
            C90488d a = C90500h.m147585a(query);
            aVar.copyOnWrite();
            C87067b bVar2 = (C87067b) aVar.instance;
            a.getClass();
            bVar2.f235254b = a;
            bVar2.f235253a = 1 | bVar2.f235253a;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aVar.mo80731a(C90772bp.m148305m((Bundle) arrayList.get(i)));
        }
        bcVar.mo58885m(C87067b.f235251f, (C87067b) aVar.build());
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return (String[]) f323732E.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hq */
    public final void mo80407hq(C88433bd bdVar, int i) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C87067b.f235251f);
        bdVar.mo58887l(r0);
        Object l = bdVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C87067b bVar = (C87067b) obj;
        this.f323785q = Query.f252741b;
        this.f323789u.clear();
        C90488d dVar = bVar.f235254b;
        if (dVar == null) {
            dVar = C90488d.f252873g;
        }
        Query b = C90500h.m147586b(dVar, i);
        if (i == 1) {
            C58976aa aaVar = C58975e.f156826a;
            for (C63088z i2 : bVar.f235255c) {
                Bundle bundle = (Bundle) C90772bp.m148301i(i2, Bundle.CREATOR);
                if (bundle != null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                    this.f323789u.add(bundle);
                }
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            Query[] queryArr = {Query.f252741b.mo84259V().mo84493u(), b};
            for (int i3 = 0; i3 < 2; i3++) {
                Query query = queryArr[i3];
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("velvet:query_state:query", query);
                bundle2.putLong("velvet:query_state:search_result_id", 0);
                bundle2.setClassLoader(getClass().getClassLoader());
                this.f323789u.add(bundle2);
            }
        }
        this.f323768am = !this.f323769an;
        ActionData a = this.f323791w.mo102852a(b);
        mo102889af(false);
        if (this.f323768am && b.mo84435dP()) {
            this.f323791w.mo102854e(b);
            C116740gp gpVar = (C116740gp) this.f323748S.mo27525b();
            if (((C116735gk) gpVar.f323805a.mo27525b()).f323784p.mo84383cP(b) && !gpVar.f323812h) {
                gpVar.f323812h = true;
                boolean o = gpVar.mo102917o();
                ((C116625ci) gpVar.f323806b.mo27525b()).mo102803e();
                if (o) {
                    gpVar.mo80591ar();
                }
            }
            gpVar.mo102910e(b, true);
            if (a != null) {
                this.f323791w.mo102862m(a);
                ((C116836z) this.f323770b.mo27525b()).mo102981K(b, a);
            }
        }
        if (!m193756aE(b)) {
            this.f323783o = b;
        }
        this.f323735A = bVar.f235256d;
        this.f323765aj = false;
        this.f323766ak = false;
        if (this.f323768am) {
            this.f323768am = false;
            this.f323738D = true;
            mo80591ar();
        }
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        boolean z;
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        boolean z2 = false;
        if (ordinal == 22) {
            z = mo102889af(false);
        } else if (ordinal != 36) {
            if (ordinal != 38) {
                if (ordinal == 47) {
                    C62940bt btVar = C87710as.f237179a;
                    C87741bw bwVar = clientEventData.f236955a;
                    C62940bt r4 = C62942bv.checkIsLite(btVar);
                    bwVar.mo58887l(r4);
                    if (bwVar.f169962ag.mo58857o(r4.f169971d)) {
                        C62940bt btVar2 = C87710as.f237179a;
                        C87741bw bwVar2 = clientEventData.f236955a;
                        C62940bt r42 = C62942bv.checkIsLite(btVar2);
                        bwVar2.mo58887l(r42);
                        Object l = bwVar2.f169962ag.mo58854l(r42.f169971d);
                        if (l == null) {
                            obj = r42.f169969b;
                        } else {
                            obj = r42.mo58889c(l);
                        }
                        if (((C87712au) obj).f237183b) {
                            z2 = true;
                        }
                    }
                    C58976aa aaVar = C58975e.f156826a;
                    if (z2) {
                        return;
                    }
                } else if (ordinal == 144) {
                    mo102903s();
                    return;
                } else if (ordinal == 239) {
                    Query query = (Query) clientEventData.mo81912b(Query.class);
                    C58976aa aaVar2 = C58975e.f156826a;
                    if (this.f323784p.mo84420dA()) {
                        this.f323785q = Query.f252741b;
                        ((C116742gr) this.f323772d.mo27525b()).mo102921n(C60537to.MANUAL_CORRECTION_ON_VOICE_PLATE);
                        mo102871L(query);
                        return;
                    }
                    return;
                } else if (ordinal != 244) {
                    switch (ordinal) {
                        case 43:
                            mo102868F(((Query) clientEventData.mo81912b(Query.class)).mo84481j(this.f323783o));
                            return;
                        case 44:
                            mo102871L((Query) clientEventData.mo81912b(Query.class));
                            return;
                        case 45:
                            Query query2 = (Query) clientEventData.mo81912b(Query.class);
                            if (!((C116569ag) this.f323771c.mo27525b()).f323267a.mo81884b() || !query2.mo84392cY()) {
                                mo80462q(query2);
                                return;
                            }
                            C90873ag agVar = new C90873ag(this.f323760ae.mo78763c(query2), this.f323758ac, "SearchboxWork.fillRootStatsAndAddProtoToQuery", new C116725ga(this));
                            agVar.mo85224b(C86750a.class, new C116726gb(this, query2));
                            agVar.mo85223a(new C116727gc(this, query2));
                            mo80591ar();
                            return;
                        default:
                            return;
                    }
                } else if (this.f323784p.mo84420dA() && this.f323779k.mo79746e(C90110fh.f250695by)) {
                    this.f323785q = Query.f252741b;
                    ((C116742gr) this.f323772d.mo27525b()).mo102921n(C60537to.LANGUAGE_SWITCHER_TAPPED);
                    ((C116755hd) this.f323747R.mo27525b()).mo102926j(5);
                    mo80591ar();
                    return;
                } else {
                    return;
                }
            }
            mo80461o();
            return;
        } else {
            z = m193757aF(this.f323784p);
        }
        if (z) {
            mo80591ar();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        this.f323785q = Query.f252741b;
        mo102870I(Query.f252741b.mo84259V().mo84493u());
        mo102892aj(this.f323784p);
        this.f323789u.clear();
        this.f323735A = false;
        this.f323790v = null;
        this.f323765aj = true;
    }

    /* renamed from: i */
    public final Query mo80460i() {
        return this.f323784p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final ActionData mo102899j() {
        return this.f323791w.mo102852a(this.f323784p);
    }

    /* renamed from: k */
    public final Query mo102900k() {
        Bundle bundle = (Bundle) C58557jl.m90132m(this.f323789u, (Object) null);
        if (bundle != null) {
            return m193763m(bundle);
        }
        return null;
    }

    /* renamed from: n */
    public final Query mo102901n(String str) {
        boolean z = false;
        boolean z2 = this.f323784p.mo84438dS() && !this.f323784p.mo84388cU() && !this.f323784p.mo84369cB() && !this.f323784p.mo84420dA() && !this.f323784p.mo84373cF() && !this.f323784p.mo84469dx() && !this.f323784p.mo84376cI();
        boolean z3 = this.f323784p.mo84468dv() && (!this.f323784p.mo84391cX() || (this.f323793y || this.f323784p.mo84435dP())) && ((!this.f323784p.mo84346be().equals("web.isch") || this.f323792x) && !this.f323784p.mo84374cG());
        if (z3) {
            if (str.equals("voicesearch") && !this.f323784p.mo84389cV()) {
                z3 = false;
            }
            boolean equals = (true ^ str.equals("assistanttextsearch")) & z3;
            if (str.equals("clockwork")) {
                C116593bd bdVar = (C116593bd) this.f323750U.mo27525b();
                Query query = this.f323784p;
                if (!query.mo84391cX() || !query.mo84326bK()) {
                    equals = false;
                }
            }
            if (str.equals("textsearch") && !this.f323784p.mo84388cU()) {
                equals = false;
            }
            if (str.equals("nonsearchpage") && !this.f323784p.mo84373cF()) {
                equals = false;
            }
            if (str.equals("voice_access_to_srp_transition") && !this.f323784p.mo84469dx()) {
                equals = false;
            }
            if (!str.equals("opatosrptransition") || this.f323784p.mo84376cI()) {
                z = equals;
            }
            if (!z) {
                C58976aa aaVar = C58975e.f156826a;
            }
            z3 = z;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        if (z3) {
            if (!this.f323784p.mo84383cP(this.f323791w.f323727b)) {
                if (z2) {
                    C89886e b = ((C89911f) this.f323757ab.mo27525b()).mo83756b(new C90452a(29, C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
                    b.f246282c = 80538920;
                    b.f246283d = "Module id = ".concat(str);
                    b.mo83721a();
                    return null;
                }
                C59081b.m91349a(C58979ad.FULL, "stack size");
                this.f323791w.mo102854e(this.f323784p);
                return this.f323784p;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final C60870cx mo80461o() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (mo102879U()) {
            cxVar = C60856cj.m92900i(Boolean.valueOf(mo102876Q(false)));
        } else {
            C22871g gVar = this.f323758ac;
            C116819jn jnVar = (C116819jn) this.f323776h.mo27525b();
            if (jnVar.f324184t) {
                cxVar2 = jnVar.f324175k.mo78960a(jnVar.mo102956i(jnVar.f324151N));
            } else {
                cxVar2 = C60856cj.m92900i(false);
            }
            cxVar = gVar.mo28209i(cxVar2, "QueryStateGoBackCallback", new C116728gd(this));
        }
        new C90873ag(cxVar, this.f323758ac, "WebViewBackCallback", new C116729ge(this)).mo85223a(C116730gf.f323723a);
        return cxVar;
    }

    /* renamed from: p */
    public final List mo102902p(ActionData actionData) {
        Bundle bundle = this.f323790v;
        if (bundle == null || !actionData.equals(m193762g(bundle))) {
            return null;
        }
        try {
            return this.f323790v.getParcelableArrayList("velvet:query_state:voice_actions");
        } catch (Exception unused) {
            ((C89911f) this.f323757ab.mo27525b()).mo83755a((Throwable) null, 27243104, 29).mo83721a();
            return null;
        }
    }

    /* renamed from: q */
    public final void mo80462q(Query query) {
        if (mo102875P(query)) {
            mo80591ar();
            if (!((C84486a) this.f323749T.mo27525b()).mo78208o()) {
                return;
            }
            if (query.mo84392cY() && !f323733F.contains(query.mo84355bn())) {
                C89886e b = ((C89911f) this.f323757ab.mo27525b()).mo83756b(new C90452a(29, C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
                b.f246282c = 170793999;
                String format = String.format("Text search query from source %s fails to commit to TNG when TNG flags are on", new Object[]{query.mo84355bn()});
                format.getClass();
                b.f246283d = format;
                b.mo83721a();
            } else if (query.mo84420dA() && !f323733F.contains(query.mo84355bn())) {
                C89886e b2 = ((C89911f) this.f323757ab.mo27525b()).mo83756b(new C90452a(29, C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
                b2.f246282c = 173564533;
                String format2 = String.format("Voice search query from source %s fails to commit to TNG when TNG flags are on", new Object[]{query.mo84355bn()});
                format2.getClass();
                b2.f246283d = format2;
                b2.mo83721a();
            }
        }
    }

    /* renamed from: r */
    public final void mo80463r() {
        mo80591ar();
    }

    /* renamed from: s */
    public final void mo102903s() {
        if (this.f323784p.mo84391cX() && this.f323793y) {
            Query query = this.f323784p;
            C58838bb.m90883r(!query.mo84369cB());
            C58838bb.m90883r(!query.f252770i.isEmpty());
            C90498f i = query.mo84480i();
            i.mo84576h();
            i.mo84562U(0);
            i.mo84579k();
            i.mo84578j();
            i.mo84570ab();
            i.mo84558Q(SystemClock.elapsedRealtime());
            i.mo84543B(query.f252772k);
            i.mo84569aa();
            i.mo84572d(0, 36028797018963968L);
            Query a = i.mo84568a();
            if (!mo102879U()) {
                this.f323783o = a;
            }
            mo102870I(a);
            this.f323785q = Query.f252741b;
            this.f323737C = true;
            mo80591ar();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo102904t(SearchError searchError) {
        C87038e.m140569c(searchError, this.f323784p, ((C86966r) this.f323753X.mo27525b()).f234900a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f323783o);
        String valueOf2 = String.valueOf(this.f323784p);
        String obj = this.f323791w.toString();
        String obj2 = this.f323789u.toString();
        return "QS[\n\t\tQ:" + valueOf + "\n\t\tCQ:" + valueOf2 + "\n\t\tAS:" + obj + "\n\t\tBS:" + obj2;
    }

    /* renamed from: v */
    public final void mo102906v() {
        m193753aB(false, this.f323789u);
        this.f323785q = Query.f252741b;
    }

    /* renamed from: x */
    public final void mo102907x(Query query, SearchError searchError) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f323784p.mo84383cP(query)) {
            mo102908y(searchError);
            mo80591ar();
        }
    }

    /* renamed from: y */
    public final void mo102908y(SearchError searchError) {
        mo102904t(searchError);
        if (!searchError.mo81138R(1) || this.f323784p.mo84428dI()) {
            C58976aa aaVar = C58975e.f156826a;
            C116734gj gjVar = this.f323791w;
            SearchError searchError2 = gjVar.f323728c;
            if (searchError2 == null || !searchError2.f236022f.equals(searchError.f236022f) || gjVar.f323726a != 4) {
                gjVar.f323728c = searchError;
                gjVar.mo102856g(4);
                return;
            }
            return;
        }
        if (!this.f323784p.mo84391cX()) {
            C59104x d = f323734a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S_QueryState");
            ((C59052c) ((C59052c) d).mo56372aa(32147)).mo56386p("SRP Auth failure for search type without SRP.");
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 203;
        String b = C39191a.m68623b(this.f323784p.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a = 4 | ufVar2.f164093a;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        Query y = this.f323784p.mo84498y();
        mo102873N(y);
        this.f323783o = y;
        this.f323737C = true;
    }

    /* renamed from: z */
    public final void mo102909z(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo102888ae(query, false, this.f323736B, false)) {
            mo80591ar();
        }
    }
}
