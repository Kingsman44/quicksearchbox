package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.apps.gsa.search.core.service.p6859i.p6860a.C86750a;
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
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87710as;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87712au;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.C89957y;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.logger.p7050a.C89835a;
import com.google.android.apps.gsa.shared.p7066m.C89996bb;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90500h;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.p7138b.C90488d;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
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

/* renamed from: com.google.android.apps.gsa.search.core.state.fn */
/* compiled from: PG */
public final class C87052fn extends C86898ct implements C86795j {

    /* renamed from: a */
    public static final C59071e f235141a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.fn");

    /* renamed from: y */
    private static final C58528ij f235142y = C58528ij.m90015O("debug_search_scheme_override", "debug_search_domain_override", "debug_js_injection_enabled", "debug_js_server_address", C90507o.f253011a, C90507o.f253013c, C90507o.f253014d, "safe_search", "gservices_overrides");

    /* renamed from: A */
    private final C68214a f235143A;

    /* renamed from: E */
    private final C68214a f235144E;

    /* renamed from: F */
    private final C68214a f235145F;

    /* renamed from: G */
    private final C68214a f235146G;

    /* renamed from: H */
    private final C68214a f235147H;

    /* renamed from: I */
    private final C68214a f235148I;

    /* renamed from: L */
    private final C68214a f235149L;

    /* renamed from: M */
    private final C68214a f235150M;

    /* renamed from: N */
    private final C68214a f235151N;

    /* renamed from: O */
    private final C68214a f235152O;

    /* renamed from: P */
    private final C68214a f235153P;

    /* renamed from: Q */
    private final C68214a f235154Q;

    /* renamed from: R */
    private final C87541c f235155R;

    /* renamed from: S */
    private final C89835a f235156S;

    /* renamed from: T */
    private final C68214a f235157T;

    /* renamed from: U */
    private final C22871g f235158U;

    /* renamed from: V */
    private final C90476a f235159V;

    /* renamed from: W */
    private final C58833ax f235160W;

    /* renamed from: X */
    private final C85232a f235161X;

    /* renamed from: Y */
    private final C85171a f235162Y;

    /* renamed from: Z */
    private Query f235163Z = Query.f252741b;

    /* renamed from: aa */
    private boolean f235164aa;

    /* renamed from: ab */
    private final Queue f235165ab = new C58781rt(new C58425eo(3));

    /* renamed from: b */
    public final C68214a f235166b;

    /* renamed from: c */
    public final C68214a f235167c;

    /* renamed from: d */
    public final C68214a f235168d;

    /* renamed from: e */
    public final C68214a f235169e;

    /* renamed from: f */
    public final C68214a f235170f;

    /* renamed from: g */
    public final C68214a f235171g;

    /* renamed from: h */
    public final C68214a f235172h;

    /* renamed from: i */
    public final C86124t f235173i;

    /* renamed from: j */
    public long f235174j;

    /* renamed from: k */
    public boolean f235175k;

    /* renamed from: l */
    public Query f235176l;

    /* renamed from: m */
    public Query f235177m;

    /* renamed from: n */
    public Query f235178n;

    /* renamed from: o */
    public Query f235179o;

    /* renamed from: p */
    public Query f235180p = Query.f252741b;

    /* renamed from: q */
    public boolean f235181q;

    /* renamed from: r */
    final List f235182r = new ArrayList();

    /* renamed from: s */
    public Bundle f235183s;

    /* renamed from: t */
    public final C87051fm f235184t;

    /* renamed from: u */
    public boolean f235185u;

    /* renamed from: v */
    public boolean f235186v;

    /* renamed from: w */
    public boolean f235187w;

    /* renamed from: x */
    public C58833ax f235188x = C58836b.f156633a;

    /* renamed from: z */
    private final C68214a f235189z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87052fn(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C68214a aVar16, C68214a aVar17, C68214a aVar18, C68214a aVar19, C68214a aVar20, C86124t tVar, C87541c cVar, C89835a aVar21, C85232a aVar22, C85171a aVar23, C68214a aVar24, C22871g gVar, C90476a aVar25, C58833ax axVar) {
        super(aVar, 50);
        C58976aa aaVar = C58975e.f156826a;
        this.f235189z = aVar;
        this.f235143A = aVar2;
        this.f235166b = aVar3;
        this.f235167c = aVar4;
        this.f235144E = aVar5;
        this.f235145F = aVar6;
        this.f235146G = aVar7;
        this.f235147H = aVar8;
        this.f235148I = aVar9;
        this.f235149L = aVar10;
        this.f235168d = aVar11;
        this.f235169e = aVar12;
        this.f235150M = aVar13;
        this.f235154Q = aVar17;
        this.f235151N = aVar14;
        this.f235152O = aVar15;
        this.f235153P = aVar16;
        this.f235170f = aVar18;
        this.f235171g = aVar19;
        this.f235172h = aVar20;
        this.f235173i = tVar;
        this.f235155R = cVar;
        Query u = Query.f252741b.mo84259V().mo84493u();
        this.f235177m = u;
        this.f235176l = u.mo84262Z();
        this.f235178n = Query.f252741b;
        this.f235179o = Query.f252741b;
        this.f235184t = new C87051fm(aVar7);
        this.f235156S = aVar21;
        this.f235161X = aVar22;
        this.f235162Y = aVar23;
        this.f235157T = aVar24;
        this.f235158U = gVar;
        this.f235159V = aVar25;
        this.f235160W = axVar;
    }

    /* renamed from: a */
    public static ActionData m140609a(Bundle bundle) {
        return (ActionData) bundle.getParcelable("velvet:query_state:action_data");
    }

    /* renamed from: ad */
    private final LatencyEvents m140610ad() {
        return C89838ab.m146259c((long) ((int) this.f235173i.mo79743a(C89996bb.f246776f)));
    }

    /* renamed from: ae */
    private final Query m140611ae(Query query) {
        C87087gj gjVar = (C87087gj) this.f235152O.mo27525b();
        return query.mo84343bb(C87087gj.m140725a(query));
    }

    /* renamed from: af */
    private static void m140612af(C91006f fVar, String str, Query query) {
        if (query.equals(Query.f252741b)) {
            fVar.mo85279c(str).mo85276a(C90752i.m148229c("EMPTY"));
        } else {
            fVar.mo85288o(str, query);
        }
    }

    /* renamed from: ah */
    private static void m140613ah(Collection collection, boolean z, Object obj) {
        if (z) {
            collection.add(obj);
        }
    }

    /* renamed from: ai */
    private final void m140614ai() {
        m140615aj(false, this.f235182r);
        this.f235178n = Query.f252741b;
    }

    /* renamed from: aj */
    private final void m140615aj(boolean z, List list) {
        boolean z2;
        C87171z zVar = (C87171z) this.f235166b.mo27525b();
        boolean z3 = false;
        if (this.f235177m.mo84420dA() || this.f235177m.mo84369cB()) {
            ActionData actionData = zVar.f235555j;
            if (!this.f235177m.mo84391cX() && !this.f235177m.mo84371cD() && ((!zVar.mo80781M(this.f235177m) || (actionData != null && actionData.mo81098i())) && !z)) {
                z2 = false;
                boolean z4 = z2 & (!this.f235177m.mo84322bG());
                if (!this.f235177m.mo84420dA() || this.f235177m.mo84391cX()) {
                    z3 = z4;
                }
                if (!m140616ak(this.f235177m) && z3) {
                    C58976aa aaVar = C58975e.f156826a;
                    list.add(((C86831a) this.f235189z.mo27525b()).mo80527i(this.f235177m));
                }
                return;
            }
        }
        z2 = true;
        boolean z42 = z2 & (!this.f235177m.mo84322bG());
        z3 = z42;
        if (!m140616ak(this.f235177m)) {
            C58976aa aaVar2 = C58975e.f156826a;
            list.add(((C86831a) this.f235189z.mo27525b()).mo80527i(this.f235177m));
        }
    }

    /* renamed from: ak */
    private static boolean m140616ak(Query query) {
        return query.mo84434dO() && !query.mo84403cj() && query.mo84340bY();
    }

    /* renamed from: k */
    public static Query m140617k(Bundle bundle) {
        return (Query) bundle.getParcelable("velvet:query_state:query");
    }

    /* renamed from: A */
    public final void mo80684A(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        Query n = mo80712n(query);
        this.f235177m = n;
        this.f235176l = n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo80685B() {
        C87171z zVar = (C87171z) this.f235166b.mo27525b();
        return this.f235177m.mo84468dv() && zVar.mo80791X() && !zVar.mo80784Q() && ((C86893co) this.f235146G.mo27525b()).f234656d == null && !this.f235177m.mo84435dP() && mo80689G();
    }

    /* renamed from: C */
    public final boolean mo80454C(Query query) {
        return this.f235184t.mo80680j(query) && this.f235184t.f235139e;
    }

    /* renamed from: D */
    public final boolean mo80686D(Query query) {
        if (query.mo84338bW() && this.f235176l.mo84385cR() && this.f235176l.mo84363bw("android.opa.extra.RECOGNITION_CANCEL_BY_NGA")) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        mo80700V(query);
        Query ea = this.f235176l.mo84473ea();
        this.f235176l = ea;
        Query aJ = ea.mo84273aJ(this.f235173i.mo79746e(C90014bt.f247776nY));
        this.f235176l = aJ;
        if (!this.f235164aa) {
            this.f235176l = aJ.mo84277aN().mo84265aB();
        }
        if (this.f235176l.mo84420dA() || this.f235176l.mo84369cB()) {
            this.f235176l = this.f235176l.mo84483l(m140610ad());
        }
        if (TextUtils.isEmpty(this.f235176l.mo84355bn())) {
            Query query2 = this.f235176l;
            C89835a aVar = this.f235156S;
            String str = aVar.f243162a;
            this.f235176l = query2.mo84275aL(aVar.f243162a);
        }
        if (mo80702Y(this.f235176l)) {
            this.f235188x = C58833ax.m90834k(this.f235176l);
            return true;
        } else if (!this.f235176l.mo84362bu()) {
            return false;
        } else {
            m140614ai();
            Query aK = this.f235176l.mo84274aK(((C86812ai) this.f235167c.mo27525b()).f234471a.f236953f);
            this.f235176l = aK;
            Query u = aK.mo84493u();
            mo80720z(u);
            this.f235176l = u;
            if (u.mo84392cY()) {
                this.f235165ab.add(this.f235176l.f252768g.toString());
            }
            this.f235187w = true;
            this.f235155R.mo81656r(this.f235177m);
            this.f235186v = false;
            if (this.f235181q) {
                this.f235181q = false;
            }
            mo80697R();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean mo80687E() {
        C87051fm fmVar = this.f235184t;
        return fmVar.mo80680j(this.f235177m) && fmVar.f235135a == 4;
    }

    /* renamed from: F */
    public final boolean mo80688F() {
        return !this.f235178n.equals(Query.f252741b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo80689G() {
        C87171z zVar = (C87171z) this.f235166b.mo27525b();
        ActionData actionData = zVar.f235555j;
        return this.f235177m.mo84369cB() && zVar.mo80781M(this.f235177m) && actionData != null && !actionData.mo81098i();
    }

    /* renamed from: H */
    public final boolean mo80455H() {
        if (this.f235177m.mo84385cR()) {
            return false;
        }
        if (this.f235177m.mo84383cP(this.f235184t.f235136b)) {
            return this.f235184t.mo80679i(this.f235177m);
        }
        return true;
    }

    /* renamed from: I */
    public final boolean mo80690I() {
        return !this.f235177m.mo84383cP(this.f235176l);
    }

    /* renamed from: J */
    public final boolean mo80456J() {
        return mo80710j() == null && this.f235176l.mo84385cR();
    }

    /* renamed from: K */
    public final boolean mo80457K() {
        return ((C86883ce) this.f235145F.mo27525b()).mo80546e();
    }

    /* renamed from: L */
    public final boolean mo80691L(Query query) {
        return this.f235184t.mo80682l(query) || mo80692M(query);
    }

    /* renamed from: M */
    public final boolean mo80692M(Query query) {
        C87051fm fmVar = this.f235184t;
        if (fmVar.mo80680j(query) && fmVar.f235135a == 5) {
            return true;
        }
        SearchError a = ((C86893co) this.f235146G.mo27525b()).mo80548a(query);
        boolean z = a != null && a.f236024h == 7;
        if (!this.f235177m.mo84383cP(query) || !z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo80693N() {
        return this.f235177m.mo84385cR() && !((C86812ai) this.f235167c.mo27525b()).f234471a.mo81894l();
    }

    /* renamed from: O */
    public final boolean mo80694O(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        return !this.f235179o.equals(Query.f252741b) && this.f235179o.mo84383cP(query);
    }

    /* renamed from: P */
    public final boolean mo80695P() {
        return this.f235176l.f252768g.toString().isEmpty();
    }

    /* renamed from: Q */
    public final boolean mo80696Q() {
        C87171z zVar = (C87171z) this.f235166b.mo27525b();
        boolean t = ((TtsState) this.f235169e.mo27525b()).mo80419t(zVar.mo80808g());
        boolean z = zVar.mo80791X() || this.f235177m.mo84374cG();
        boolean I = mo80690I();
        if (this.f235178n.equals(Query.f252741b) || !t || !z || I) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (!this.f235173i.mo79746e(C90014bt.f247150bi) || !mo80702Y(this.f235178n)) {
            C58838bb.m90883r(zVar.mo80781M(this.f235177m));
            Query query = this.f235178n;
            m140614ai();
            if (this.f235173i.mo79746e(C89996bb.f246771a)) {
                mo80720z(query.mo84483l(m140610ad()).mo84493u());
            } else {
                mo80720z(query.mo84483l(m140610ad()));
            }
            this.f235187w = true;
            this.f235176l = this.f235176l.mo84482k(this.f235177m);
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            this.f235188x = C58833ax.m90834k(this.f235178n);
            this.f235178n = Query.f252741b;
            return true;
        }
    }

    /* renamed from: R */
    public final boolean mo80697R() {
        boolean z;
        if (!this.f235185u && !this.f235177m.mo84385cR() && !this.f235177m.equals(Query.f252741b)) {
            if (!this.f235177m.mo84427dH() || !this.f235177m.mo84426dG()) {
                C87171z zVar = (C87171z) this.f235166b.mo27525b();
                if (zVar.mo80781M(this.f235177m) && zVar.mo80791X()) {
                    if (zVar.mo80784Q()) {
                        z = this.f235177m.mo84427dH();
                        this.f235185u = z;
                    } else {
                        z = this.f235177m.mo84426dG();
                        this.f235185u = z;
                    }
                    if (z) {
                        mo80705ab((C86812ai) this.f235167c.mo27525b());
                    }
                    return this.f235185u;
                }
            } else {
                this.f235185u = true;
                mo80705ab((C86812ai) this.f235167c.mo27525b());
                return true;
            }
        }
        return false;
    }

    /* renamed from: S */
    public final boolean mo80458S() {
        return (this.f235177m.mo84420dA() && !this.f235177m.mo84397cd() && this.f235177m.f252770i.isEmpty()) || this.f235177m.mo84369cB();
    }

    /* renamed from: T */
    public final boolean mo80698T(Query query, boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        boolean z5 = this.f235177m.mo84383cP(query) && this.f235184t.mo80679i(query);
        C58976aa aaVar = C58975e.f156826a;
        if (!z5) {
            return false;
        }
        if (query.mo84420dA() || query.mo84369cB()) {
            C87055fq fqVar = (C87055fq) this.f235149L.mo27525b();
            if (!((C86812ai) this.f235167c.mo27525b()).f234471a.mo81902t() && fqVar.mo80721a()) {
                z4 = true;
            }
            if ((z2 || z3 || !query.mo84338bW()) && (z || z4)) {
                VoiceAction f = ((C87171z) this.f235166b.mo27525b()).mo80807f();
                if (f != null) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 159;
                    int i = f.mo81066g().f146230cP;
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    ufVar2.f164093a |= 256;
                    ufVar2.f164264s = i;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                }
                mo80699U(true);
            } else if (z2) {
                this.f235184t.mo80677g(6);
            } else {
                this.f235184t.mo80677g(5);
                C87171z zVar = (C87171z) this.f235166b.mo27525b();
                zVar.mo80773E();
                zVar.f235530A = query;
                zVar.mo80802aj(true);
                zVar.mo80591ar();
            }
        } else {
            this.f235184t.mo80675e();
        }
        if (!z) {
            query = Query.f252741b;
        }
        this.f235163Z = query;
        return true;
    }

    /* renamed from: U */
    public final boolean mo80699U(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C87171z zVar = (C87171z) this.f235166b.mo27525b();
        ActionData actionData = zVar.mo80781M(this.f235177m) ? zVar.f235555j : null;
        C87050fl flVar = new C87050fl();
        if (actionData != null && (actionData.mo81089a() > 0 || actionData.f236001k > 0)) {
            mo80706ac(flVar);
            List list = this.f235182r;
            ActionData a = m140609a((Bundle) list.get(list.size() - 1));
            if (!this.f235182r.isEmpty() && a != null && a.mo81099j()) {
                List list2 = this.f235182r;
                list2.remove(list2.size() - 1);
            }
        }
        mo80706ac(flVar);
        int size = this.f235182r.size() - 1;
        if (size < 0) {
            ((C86831a) this.f235189z.mo27525b()).mo80526b((Bundle) null);
            return false;
        }
        Bundle bundle = (Bundle) this.f235182r.remove(size);
        C89949q.m146526k(C89957y.m146538a());
        Query k = m140617k(bundle);
        Query J = z ? k.mo84247J() : k.mo84499z();
        if (this.f235185u) {
            J = J.mo84277aN().mo84265aB();
        }
        if (this.f235175k) {
            J = J.mo84239B();
        }
        mo80720z(J);
        this.f235176l = J;
        C87051fm fmVar = this.f235184t;
        fmVar.f235139e = true;
        fmVar.mo80675e();
        ActionData a2 = m140609a(bundle);
        if (a2 != null) {
            C87028ev evVar = (C87028ev) this.f235147H.mo27525b();
            evVar.f235077f = this.f235177m;
            if (!a2.mo81102m()) {
                a2 = ActionData.f235991b;
            }
            evVar.f235078g = a2;
        }
        this.f235187w = true;
        this.f235183s = bundle;
        return true;
    }

    /* renamed from: V */
    public final boolean mo80700V(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (query == this.f235176l) {
            return false;
        }
        this.f235176l = m140611ae(query);
        return true;
    }

    /* renamed from: W */
    public final boolean mo80701W(Query query) {
        C58838bb.m90883r(!query.mo84385cR());
        if (!this.f235177m.mo84383cP(query)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } else if (this.f235163Z.f252780s == query.f252780s) {
            this.f235163Z = Query.f252741b;
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: X */
    public final boolean mo80459X() {
        return ((C87126hu) this.f235150M.mo27525b()).mo80749i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r7.mo84263a("android.opa.extra.TRIGGERED_BY");
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80702Y(com.google.android.apps.gsa.shared.search.Query r7) {
        /*
            r6 = this;
            boolean r0 = r7.mo84393cZ()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "android.opa.extra.TRIGGERED_BY"
            int r0 = r7.mo84263a(r0)
            r3 = 54
            if (r0 == r3) goto L_0x0016
            r3 = 48
            if (r0 != r3) goto L_0x0022
        L_0x0016:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f235173i
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247447hN
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.apps.gsa.search.core.i.t r3 = r6.f235173i
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90018bx.f248050a
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = "android.opa.extra.HANDOVER_FROM_APA"
            boolean r3 = r7.mo84363bw(r3)
            if (r3 == 0) goto L_0x0037
            r3 = 1
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            com.google.android.apps.gsa.search.core.i.t r4 = r6.f235173i
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247449hP
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x0085
            com.google.common.base.ax r4 = r6.f235160W
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x0085
            com.google.common.base.ax r4 = r6.f235160W
            java.lang.Object r4 = r4.mo56107c()
            dagger.a r4 = (dagger.C68214a) r4
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.nga.api.bp r4 = (com.google.android.apps.gsa.nga.api.C74715bp) r4
            boolean r4 = r4.mo71084e()
            if (r4 == 0) goto L_0x0085
            java.lang.String r4 = "android.opa.extra.QUERY_INITIATED_BY_NGA"
            boolean r4 = r7.mo84363bw(r4)
            if (r4 != 0) goto L_0x0085
            if (r0 != 0) goto L_0x006e
            boolean r7 = r7.mo84422dC()
            if (r7 == 0) goto L_0x0085
        L_0x006e:
            if (r3 != 0) goto L_0x0085
            dagger.a r7 = r6.f235167c
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.state.ai r7 = (com.google.android.apps.gsa.search.core.state.C86812ai) r7
            com.google.android.apps.gsa.search.shared.service.ClientConfig r7 = r7.f234471a
            java.lang.String r7 = r7.f236953f
            java.lang.String r0 = "opa"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87052fn.mo80702Y(com.google.android.apps.gsa.shared.search.Query):boolean");
    }

    /* renamed from: Z */
    public final boolean mo80703Z() {
        C58976aa aaVar = C58975e.f156826a;
        if (mo80690I()) {
            return false;
        }
        if (((C87171z) this.f235166b.mo27525b()).mo80782N()) {
            Query q = this.f235176l.mo84488q();
            this.f235176l = q;
            this.f235176l = m140611ae(q);
        }
        this.f235176l = this.f235176l.mo84262Z().mo84484m().mo84483l(m140610ad());
        return true;
    }

    /* renamed from: aa */
    public final boolean mo80704aa(Query query) {
        if (this.f235181q || !this.f235177m.mo84383cP(query) || this.f235177m.mo84391cX() || ((C87171z) this.f235166b.mo27525b()).mo80781M(this.f235177m)) {
            return false;
        }
        this.f235181q = true;
        return true;
    }

    /* renamed from: ab */
    public final boolean mo80705ab(C86812ai aiVar) {
        boolean z = aiVar.f234471a.mo81881K() && !this.f235185u;
        if (z == this.f235164aa) {
            return false;
        }
        this.f235164aa = z;
        return true;
    }

    /* renamed from: ac */
    public final void mo80706ac(C58839bc bcVar) {
        int size = this.f235182r.size();
        while (true) {
            size--;
            if (size > 0 && !bcVar.mo5941a(this.f235182r.get(size))) {
                this.f235182r.remove(size);
            } else {
                return;
            }
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.UNDOABLE_INTERACTION_NOT_HANDLED, C87739bu.STOP_LISTENING, C87739bu.QUERY_SET, C87739bu.QUERY_EDIT, C87739bu.CANCEL, C87739bu.GO_BACK, C87739bu.QUERY_COMMIT};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final ActionData mo80707e() {
        C87051fm fmVar = this.f235184t;
        Query query = this.f235177m;
        ActionData actionData = fmVar.f235138d;
        if (actionData == null || fmVar.f235136b.f252780s != query.f252780s) {
            return null;
        }
        return actionData;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final SearchError mo80708g() {
        return this.f235184t.mo80673a(this.f235177m);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("QueryState");
        ArrayList arrayList = new ArrayList();
        m140613ah(arrayList, this.f235181q, "stop-listening-pending");
        m140613ah(arrayList, this.f235185u, "session-solidified");
        m140613ah(arrayList, this.f235186v, "recognition-paused-on-demand");
        if (!arrayList.isEmpty()) {
            fVar.mo85292s(C90752i.m148229c(new C58827ar(", ").mo56097d(arrayList)));
        }
        m140612af(fVar, "Query", this.f235176l);
        m140612af(fVar, "Committed query", this.f235177m);
        m140612af(fVar, "Pending follow-on query", this.f235178n);
        m140612af(fVar, "Cancel recognition pending query", this.f235163Z);
        Query query = this.f235176l;
        if (query != null) {
            if (query.mo84392cY()) {
                fVar.mo85278b("How text was entered").mo85276a(C90752i.m148229c("text"));
            } else if (query.mo84420dA()) {
                fVar.mo85278b("How text was entered").mo85276a(C90752i.m148229c("voice"));
            }
            fVar.mo85278b("Last text entered").mo85276a(C90752i.m148233g(this.f235176l.f252768g));
            fVar.mo85278b("Last 3 queries").mo85276a(C90752i.m148233g(this.f235165ab.toString()));
            if (this.f235176l.mo84438dS()) {
                fVar.mo85284k("Last query native", "true");
            } else {
                fVar.mo85284k("Last query native", "false");
            }
        }
        fVar.mo85290q("Network action state", this.f235184t);
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Backstack");
        int size = this.f235182r.size();
        while (true) {
            size--;
            if (size >= 0) {
                Bundle bundle = (Bundle) this.f235182r.get(size);
                C91006f e2 = e.mo85281e((Object) null);
                e2.mo85291r(String.valueOf(size));
                e2.mo85285l(m140617k(bundle));
                e2.mo85285l(m140609a(bundle));
            } else {
                return;
            }
        }
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        ((C86237bt) this.f235144E.mo27525b()).mo79905b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hm */
    public final void mo80709hm(Query query, Bundle bundle) {
        bundle.putParcelable("velvet:query_state:query", this.f235177m);
        C87171z zVar = (C87171z) this.f235166b.mo27525b();
        bundle.putParcelable("velvet:query_state:action_data", zVar.f235555j);
        List list = zVar.f235556k;
        if (list != null) {
            bundle.putParcelableArrayList("velvet:query_state:voice_actions", new ArrayList(list));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList(this.f235182r);
        m140615aj(true, arrayList);
        C87066a aVar = (C87066a) C87067b.f235250e.createBuilder();
        boolean z = this.f235185u;
        aVar.copyOnWrite();
        C87067b bVar = (C87067b) aVar.instance;
        bVar.f235253a |= 2;
        bVar.f235256d = z;
        Query query = this.f235176l;
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
        return (String[]) f235142y.toArray(new String[0]);
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
        this.f235178n = Query.f252741b;
        this.f235182r.clear();
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
                    this.f235182r.add(bundle);
                }
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            Query[] queryArr = {Query.f252741b.mo84259V().mo84493u(), b};
            for (int i3 = 0; i3 < 2; i3++) {
                Query query = queryArr[i3];
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("velvet:query_state:query", query);
                bundle2.setClassLoader(getClass().getClassLoader());
                this.f235182r.add(bundle2);
            }
        }
        mo80699U(false);
        if (!m140616ak(b)) {
            this.f235176l = b;
        }
        this.f235185u = bVar.f235256d;
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
            z = mo80699U(false);
        } else if (ordinal != 36) {
            if (ordinal != 38) {
                if (ordinal != 47) {
                    switch (ordinal) {
                        case 43:
                            Query j2 = ((Query) clientEventData.mo81912b(Query.class)).mo84481j(this.f235176l);
                            C58976aa aaVar = C58975e.f156826a;
                            if (mo80700V(j2)) {
                                mo80591ar();
                                return;
                            }
                            return;
                        case 44:
                            C58976aa aaVar2 = C58975e.f156826a;
                            if (mo80700V(((Query) clientEventData.mo81912b(Query.class)).mo84481j(this.f235176l).mo84485n()) && mo80703Z()) {
                                mo80591ar();
                                return;
                            }
                            return;
                        case 45:
                            Query query = (Query) clientEventData.mo81912b(Query.class);
                            if (!((C86812ai) this.f235167c.mo27525b()).f234471a.mo81884b() || !query.mo84392cY()) {
                                mo80462q(query);
                                return;
                            }
                            C90873ag agVar = new C90873ag(this.f235162Y.mo78763c(query), this.f235158U, "SearchboxWork.fillRootStatsAndAddProtoToQuery", new C87046fh(this));
                            agVar.mo85224b(C86750a.class, new C87047fi(this, query));
                            agVar.mo85223a(new C87048fj(this, query));
                            mo80591ar();
                            return;
                        default:
                            return;
                    }
                } else {
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
                    C58976aa aaVar3 = C58975e.f156826a;
                    if (z2) {
                        return;
                    }
                }
            }
            mo80461o();
            return;
        } else {
            z = mo80704aa(this.f235177m);
        }
        if (z) {
            mo80591ar();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        this.f235178n = Query.f252741b;
        mo80720z(Query.f252741b.mo84259V().mo84493u());
        mo80700V(this.f235177m);
        this.f235182r.clear();
        this.f235185u = false;
        this.f235183s = null;
    }

    /* renamed from: i */
    public final Query mo80460i() {
        return this.f235177m;
    }

    /* renamed from: j */
    public final Query mo80710j() {
        Bundle bundle = (Bundle) C58557jl.m90132m(this.f235182r, (Object) null);
        if (bundle != null) {
            return m140617k(bundle);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r4.mo84326bK() != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.shared.search.Query mo80711m(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.apps.gsa.shared.search.Query r0 = r3.f235177m
            boolean r0 = r0.mo84468dv()
            r1 = 0
            if (r0 != 0) goto L_0x0011
            com.google.android.apps.gsa.shared.search.Query r0 = r3.f235177m
            boolean r0 = r0.mo84322bG()
            if (r0 == 0) goto L_0x001b
        L_0x0011:
            com.google.android.apps.gsa.shared.search.Query r0 = r3.f235177m
            boolean r0 = r0.mo84374cG()
            if (r0 != 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0074
            java.lang.String r2 = "voicesearch"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x002f
            com.google.android.apps.gsa.shared.search.Query r2 = r3.f235177m
            boolean r2 = r2.mo84389cV()
            if (r2 != 0) goto L_0x002f
            r0 = 0
        L_0x002f:
            java.lang.String r2 = "assistanttextsearch"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0050
            com.google.android.apps.gsa.shared.search.Query r2 = r3.f235177m
            boolean r2 = r2.mo84403cj()
            if (r2 == 0) goto L_0x004f
            com.google.android.apps.gsa.shared.search.Query r2 = r3.f235177m
            boolean r2 = r2.mo84392cY()
            if (r2 != 0) goto L_0x0050
            com.google.android.apps.gsa.shared.search.Query r2 = r3.f235177m
            boolean r2 = r2.mo84385cR()
            if (r2 != 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            java.lang.String r2 = "clockwork"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x006e
            dagger.a r4 = r3.f235151N
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.state.bw r4 = (com.google.android.apps.gsa.search.core.state.C86854bw) r4
            com.google.android.apps.gsa.shared.search.Query r4 = r3.f235177m
            boolean r2 = r4.mo84391cX()
            if (r2 == 0) goto L_0x006f
            boolean r4 = r4.mo84326bK()
            if (r4 == 0) goto L_0x006f
        L_0x006e:
            r1 = r0
        L_0x006f:
            if (r1 != 0) goto L_0x0073
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0073:
            r0 = r1
        L_0x0074:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r0 == 0) goto L_0x0095
            com.google.android.apps.gsa.search.core.state.fm r4 = r3.f235184t
            com.google.android.apps.gsa.shared.search.Query r4 = r4.f235136b
            com.google.android.apps.gsa.shared.search.Query r0 = r3.f235177m
            boolean r4 = r0.mo84383cP(r4)
            if (r4 != 0) goto L_0x0095
            com.google.common.f.ad r4 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r0 = "stack size"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r4, r0)
            com.google.android.apps.gsa.shared.search.Query r4 = r3.f235177m
            com.google.android.apps.gsa.search.core.state.fm r0 = r3.f235184t
            r0.mo80674c(r4)
            com.google.android.apps.gsa.shared.search.Query r4 = r3.f235177m
            return r4
        L_0x0095:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87052fn.mo80711m(java.lang.String):com.google.android.apps.gsa.shared.search.Query");
    }

    /* renamed from: n */
    public final Query mo80712n(Query query) {
        return (!query.mo84392cY() || ((C86966r) this.f235154Q.mo27525b()).f234900a.mo83040a()) ? query : query.mo84238A();
    }

    /* renamed from: o */
    public final C60870cx mo80461o() {
        boolean z;
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (!mo80690I() || mo80685B()) {
            C87171z zVar = (C87171z) this.f235166b.mo27525b();
            VoiceAction f = zVar.mo80807f();
            ActionData actionData = zVar.f235555j;
            if (!(actionData == null || f == null || f.mo81052B())) {
                ((C86925as) zVar.f235550e.mo27525b()).mo80575g(actionData, 32);
            }
            this.f235178n = Query.f252741b;
            Query query = this.f235177m;
            z = false;
            if (mo80699U(false)) {
                C87059fu fuVar = (C87059fu) this.f235148I.mo27525b();
                C60537to toVar = C60537to.BACK_PRESSED;
                ((C87042fd) fuVar.f235200a.mo27525b()).mo80664e(fuVar.f235202c, toVar);
                fuVar.f235201b.mo80165a();
                this.f235174j = query.f252749G;
            }
            if (!z || mo80693N()) {
                this.f235161X.mo78810e();
                mo80591ar();
            }
            return C60856cj.m92900i(Boolean.valueOf(z));
        } else if (!this.f235176l.mo84384cQ()) {
            this.f235176l = this.f235177m;
        } else {
            this.f235176l = this.f235176l.mo84481j(this.f235177m);
        }
        mo80591ar();
        z = true;
        this.f235161X.mo78810e();
        mo80591ar();
        return C60856cj.m92900i(Boolean.valueOf(z));
    }

    /* renamed from: p */
    public final List mo80713p(ActionData actionData) {
        Bundle bundle = this.f235183s;
        if (bundle == null || !actionData.equals(m140609a(bundle))) {
            return null;
        }
        try {
            return this.f235183s.getParcelableArrayList("velvet:query_state:voice_actions");
        } catch (Exception unused) {
            ((C89911f) this.f235157T.mo27525b()).mo83755a((Throwable) null, 27243104, 29).mo83721a();
            return null;
        }
    }

    /* renamed from: q */
    public final void mo80462q(Query query) {
        if (mo80686D(query)) {
            mo80591ar();
        }
    }

    /* renamed from: r */
    public final void mo80463r() {
        mo80591ar();
    }

    /* renamed from: s */
    public final void mo80714s(Query query, SearchError searchError) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f235177m.mo84383cP(query)) {
            mo80715t(searchError);
            mo80591ar();
        }
    }

    /* renamed from: t */
    public final void mo80715t(SearchError searchError) {
        C87038e.m140569c(searchError, this.f235177m, ((C86966r) this.f235154Q.mo27525b()).f234900a);
        if (!searchError.mo81138R(1) || this.f235177m.mo84428dI()) {
            C58976aa aaVar = C58975e.f156826a;
            C87051fm fmVar = this.f235184t;
            SearchError searchError2 = fmVar.f235137c;
            if (searchError2 == null || !searchError2.f236022f.equals(searchError.f236022f) || fmVar.f235135a != 4) {
                fmVar.f235137c = searchError;
                fmVar.mo80677g(4);
                return;
            }
            return;
        }
        if (!this.f235177m.mo84391cX()) {
            C59104x d = f235141a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "QueryState");
            ((C59052c) ((C59052c) d).mo56372aa(8819)).mo56386p("SRP Auth failure for search type without SRP.");
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 203;
        String b = C39191a.m68623b(this.f235177m.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a = 4 | ufVar2.f164093a;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        Query y = this.f235177m.mo84498y();
        C58976aa aaVar2 = C58975e.f156826a;
        this.f235177m = mo80712n(y);
        this.f235176l = y;
        this.f235187w = true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f235176l);
        String valueOf2 = String.valueOf(this.f235177m);
        String obj = this.f235184t.toString();
        String obj2 = this.f235182r.toString();
        return "QS[\n\t\tQ:" + valueOf + "\n\t\tCQ:" + valueOf2 + "\n\t\tAS:" + obj + "\n\t\tBS:" + obj2;
    }

    /* renamed from: v */
    public final void mo80717v(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f235177m.mo84383cP(query)) {
            C87038e.m140570d(query, this.f235171g, this.f235173i);
            C87051fm fmVar = this.f235184t;
            if (!fmVar.mo80678h()) {
                fmVar.f235139e = true;
                mo80591ar();
            }
        }
    }

    /* renamed from: x */
    public final void mo80718x(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90868c(query.mo84468dv());
        if (this.f235177m.mo84383cP(query)) {
            mo80720z(query.mo84493u());
            this.f235176l = this.f235177m;
            this.f235187w = true;
            mo80591ar();
        }
    }

    /* renamed from: y */
    public final void mo80719y(Query query, C58833ax axVar) {
        if (this.f235177m.mo84383cP(query) && !this.f235184t.mo80681k(this.f235177m)) {
            ActionData actionData = ActionData.f235991b;
            if (this.f235177m.mo84433dN()) {
                C87038e.m140567a(this.f235177m, axVar);
                if (axVar.mo56113h()) {
                    actionData = (ActionData) axVar.mo56107c();
                }
            }
            this.f235184t.mo80676f(actionData);
            if (axVar.mo56113h()) {
                mo80591ar();
            }
        }
    }

    /* renamed from: z */
    public final void mo80720z(Query query) {
        long j = query.f252749G;
        if (j == 0 || j == this.f235177m.f252749G) {
            C59104x d = f235141a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "QueryState");
            ((C59052c) ((C59052c) d).mo56372aa(8822)).mo56386p("Commit without new request id. This shouldn't happen.");
        }
        if (!query.mo84385cR()) {
            C87038e.m140572f(query, ((C86792g) this.f235143A.mo27525b()).mo80446e(), this.f235153P, this.f235154Q, this.f235171g, this.f235172h, this.f235173i);
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f235177m = mo80712n(query);
    }
}
