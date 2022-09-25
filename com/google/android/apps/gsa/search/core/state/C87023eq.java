package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6618bt.C85017a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86249d;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.p6816p.C86254i;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88076og;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88080ok;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88111po;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88114pr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88115ps;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88131qh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88134qk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88135ql;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88283vy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88284vz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88286wa;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.search.core.state.eq */
/* compiled from: PG */
public final class C87023eq extends C86898ct {

    /* renamed from: a */
    public static final C59071e f235022a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.eq");

    /* renamed from: A */
    public boolean f235023A = false;

    /* renamed from: E */
    public boolean f235024E;

    /* renamed from: F */
    public boolean f235025F;

    /* renamed from: G */
    int f235026G = 1;

    /* renamed from: H */
    public int f235027H;

    /* renamed from: I */
    public int f235028I = 1;

    /* renamed from: L */
    private final C68214a f235029L;

    /* renamed from: M */
    private final C68214a f235030M;

    /* renamed from: N */
    private final C68214a f235031N;

    /* renamed from: O */
    private final C68214a f235032O;

    /* renamed from: P */
    private final C68214a f235033P;

    /* renamed from: Q */
    private boolean f235034Q;

    /* renamed from: R */
    private final List f235035R = new ArrayList();

    /* renamed from: S */
    private C60870cx f235036S;

    /* renamed from: b */
    public final C86124t f235037b;

    /* renamed from: c */
    public final C68214a f235038c;

    /* renamed from: d */
    public final C68214a f235039d;

    /* renamed from: e */
    public final C68214a f235040e;

    /* renamed from: f */
    public final C68214a f235041f;

    /* renamed from: g */
    public final C68214a f235042g;

    /* renamed from: h */
    public final C85005h f235043h;

    /* renamed from: i */
    public final C85017a f235044i;

    /* renamed from: j */
    public final C22871g f235045j;

    /* renamed from: k */
    public final Queue f235046k = new ArrayDeque();

    /* renamed from: l */
    public C51195j f235047l;

    /* renamed from: m */
    public C90456c f235048m;

    /* renamed from: n */
    public boolean f235049n;

    /* renamed from: o */
    public boolean f235050o;

    /* renamed from: p */
    public boolean f235051p = true;

    /* renamed from: q */
    public boolean f235052q;

    /* renamed from: r */
    public boolean f235053r;

    /* renamed from: s */
    public Query f235054s = Query.f252741b;

    /* renamed from: t */
    public C86251f f235055t;

    /* renamed from: u */
    public boolean f235056u;

    /* renamed from: v */
    public Query f235057v = Query.f252741b;

    /* renamed from: w */
    public C60870cx f235058w = C60856cj.m92900i(C118826c.f331422a);

    /* renamed from: x */
    public byte[] f235059x;

    /* renamed from: y */
    public final List f235060y = new ArrayList();

    /* renamed from: z */
    public boolean f235061z = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87023eq(C68214a aVar, C86124t tVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C85005h hVar, C85017a aVar10, C22871g gVar, C68214a aVar11, C68214a aVar12) {
        super(aVar, 69);
        C68214a aVar13 = aVar;
        this.f235037b = tVar;
        this.f235038c = aVar2;
        this.f235039d = aVar3;
        this.f235040e = aVar4;
        this.f235029L = aVar5;
        this.f235041f = aVar6;
        this.f235030M = aVar7;
        this.f235031N = aVar8;
        this.f235042g = aVar9;
        this.f235043h = hVar;
        this.f235044i = aVar10;
        this.f235045j = gVar;
        this.f235032O = aVar11;
        this.f235033P = aVar12;
    }

    /* renamed from: q */
    private final void m140503q(Query query, C22869e eVar, C86251f fVar) {
        if (this.f235037b.mo79746e(C90014bt.f247236dO) && query.mo84363bw("android.opa.extra.BLOCK_RESPONSE_EXECUTION_ON_UI") && !this.f235049n) {
            this.f235035R.add(new C87022ep(query, eVar, fVar));
        } else {
            m140504r(query, eVar, fVar);
        }
    }

    /* renamed from: r */
    private final void m140504r(Query query, C22869e eVar, C86251f fVar) {
        if (!mo80640o(query)) {
            C22872h.m42743c(C86593a.class);
            eVar.run();
            return;
        }
        new C90873ag(C60922j.m93044g(fVar.f233152k, new C86249d(), C60826bg.f164896a), this.f235045j, "boolean future in dispatchAssistantResult", new C87011ee(this, query, eVar)).mo85223a(new C87012ef(this, query, eVar));
    }

    /* renamed from: s */
    private final void m140505s(Query query, C51195j jVar) {
        C60537to toVar;
        C60870cx cxVar;
        SettableFuture settableFuture;
        C60870cx cxVar2;
        this.f235026G = 3;
        mo80591ar();
        if (this.f235055t != null) {
            if ((jVar.f133266a & 128) == 0) {
                this.f235043h.mo78616L(jVar);
                C88284vz vzVar = (C88284vz) C88286wa.f238774c.createBuilder();
                vzVar.copyOnWrite();
                C88286wa waVar = (C88286wa) vzVar.instance;
                waVar.f238777b = jVar;
                waVar.f238776a |= 1;
                C87684al alVar = new C87684al(C88244um.SHOW_ASSISTANT_RESPONSE);
                alVar.mo81965b(C88283vy.f238773a, (C88286wa) vzVar.build());
                alVar.mo81966c(query);
                this.f235043h.mo78609E(alVar.mo81964a());
            } else {
                mo80639n(true);
                C87684al alVar2 = new C87684al(C88244um.ASSISTANT_REQUEST_ID);
                alVar2.mo81966c(query);
                this.f235043h.mo78609E(alVar2.mo81964a());
                ((C89859i) this.f235033P.mo27525b()).mo83702b(C89849ae.OPA_STATE_CCL_ASSISTANT_REQUEST_ID);
                C85005h hVar = this.f235043h;
                C58833ax k = C58833ax.m90834k(jVar);
                TtsState ttsState = (TtsState) this.f235039d.mo27525b();
                Query query2 = ((C87052fn) this.f235038c.mo27525b()).f235177m;
                if (!((C87052fn) ttsState.f234420a.mo27525b()).f235177m.mo84383cP(query2)) {
                    cxVar = C60856cj.m92900i(C58836b.f156633a);
                } else {
                    if (((C87052fn) ttsState.f234420a.mo27525b()).mo80454C(query2)) {
                        C63088z zVar = ttsState.f234427h;
                        cxVar2 = zVar != null ? C60856cj.m92900i(C58833ax.m90834k(zVar)) : C60856cj.m92900i(C58836b.f156633a);
                    } else {
                        C63088z zVar2 = ttsState.f234427h;
                        if (zVar2 != null) {
                            cxVar2 = C60856cj.m92900i(C58833ax.m90834k(zVar2));
                        } else {
                            SettableFuture settableFuture2 = new SettableFuture();
                            ttsState.f234428i = settableFuture2;
                            settableFuture = settableFuture2;
                            if (ttsState.mo80421v()) {
                                ttsState.mo80591ar();
                                settableFuture = settableFuture2;
                            }
                            cxVar = settableFuture;
                        }
                    }
                    ttsState.mo80412m();
                    settableFuture = cxVar2;
                    cxVar = settableFuture;
                }
                C86251f fVar = this.f235055t;
                fVar.getClass();
                this.f235058w = hVar.mo78623g(k, query, cxVar, fVar);
            }
            if (!this.f235053r) {
                this.f235053r = true;
                mo80591ar();
            }
        }
        C87042fd fdVar = (C87042fd) this.f235040e.mo27525b();
        if (query.mo84420dA()) {
            toVar = C60537to.NATIVE_VOICE_RENDERED;
        } else if (query.mo84392cY()) {
            toVar = C60537to.NATIVE_TEXT_RENDERED;
        } else {
            return;
        }
        fdVar.mo80667j(query, toVar);
    }

    /* renamed from: t */
    private final boolean m140506t() {
        if (this.f235055t != null) {
            return false;
        }
        this.f235055t = new C86251f();
        this.f235056u = true;
        return true;
    }

    /* renamed from: a */
    public final void mo80632a(Query query, C86251f fVar, C86232bo boVar) {
        this.f235027H = 3;
        if (fVar != null && query.mo84403cj() && !query.mo84397cd()) {
            new C90873ag(fVar.f233143b, this.f235045j, "assistantResponseFuture", new C87015ei(this, query)).mo85223a(new C87016ej(this, query));
        }
        ((C87085gh) this.f235032O.mo27525b()).mo80732a(query, boVar);
        if (boVar instanceof C86254i) {
            C60870cx c = ((C86254i) boVar).mo79951c();
            if (this.f235037b.mo79746e(C90086ek.f250345bQ)) {
                new C90873ag(c, this.f235045j, "isAssistantOfflineFuture", new C87013eg(this)).mo85223a(C87014eh.f235004a);
            }
        }
        if (query.mo84393cZ()) {
            ((C87100gw) this.f235030M.mo27525b()).mo80734e(((C87052fn) this.f235038c.mo27525b()).f235176l);
            this.f235045j.mo28211k(boVar.mo79865A(), "Maybe update zero typing suggest", new C87020en(this, boVar));
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.OPA_INPUT_MODE, C87739bu.OPA_UI_MODE, C87739bu.START_OPA_ACTIVITY_FOR_L_ASSIST, C87739bu.OPA_ACTIVITY_LIFECYCLE_STATE};
    }

    /* renamed from: e */
    public final void mo80633e(Query query) {
        if (this.f235047l != null && this.f235026G == 2) {
            if (!((C87171z) this.f235029L.mo27525b()).mo80791X() || !((C87171z) this.f235029L.mo27525b()).mo80781M(query)) {
                C51195j jVar = this.f235047l;
                if (jVar != null && (jVar.f133266a & 1) == 0 && query.mo84412cs() && this.f235037b.mo79746e(C90086ek.f250378bx)) {
                    C51195j jVar2 = this.f235047l;
                    jVar2.getClass();
                    m140505s(query, jVar2);
                }
            } else if (((C87171z) this.f235029L.mo27525b()).mo80779K(query)) {
                this.f235026G = 4;
                mo80591ar();
            } else {
                C51195j jVar3 = this.f235047l;
                jVar3.getClass();
                m140505s(query, jVar3);
            }
        }
    }

    /* renamed from: g */
    public final void mo80634g(Query query, SearchError searchError) {
        if (((C87052fn) this.f235038c.mo27525b()).f235177m.mo84383cP(query)) {
            if (m140506t()) {
                mo80591ar();
            }
            C86251f fVar = this.f235055t;
            fVar.getClass();
            if (mo80640o(query)) {
                if (!fVar.f233148g.isDone()) {
                    fVar.f233148g.mo57356n(C58833ax.m90834k(searchError));
                } else {
                    ((C59052c) ((C59052c) C86251f.f233142a.mo56225c()).mo56372aa(7726)).mo56386p("searchErrorFuture is already set.");
                }
            }
            this.f235048m = searchError.f236022f;
            m140503q(query, new C87007ea(this, query, searchError), fVar);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaState");
        fVar.mo85279c("IsOpaChatUiMode").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f235034Q)));
        fVar.mo85279c("IsOpaVoiceInputMode").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f235051p)));
        fVar.mo85279c("UnHandledGcmMessages").mo85276a(C90752i.m148230d(Integer.valueOf(this.f235046k.size())));
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        this.f235043h.mo78640y();
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{"opa_tooltip_promo_notification_state", "opa_welcome_promo_notification_state", "opa_multi_day_upgrade_promo_notification_state"};
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        Object obj3;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        boolean z = false;
        if (ordinal == 66) {
            C62940bt btVar = C88131qh.f238245a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r3 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r3);
            if (bwVar.f169962ag.mo58857o(r3.f169971d)) {
                C62940bt btVar2 = C88131qh.f238245a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r32 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r32);
                Object l = bwVar2.f169962ag.mo58854l(r32.f169971d);
                if (l == null) {
                    obj = r32.f169969b;
                } else {
                    obj = r32.mo58889c(l);
                }
                C88134qk a2 = C88134qk.m142787a(((C88135ql) obj).f238255b);
                if (a2 == null) {
                    a2 = C88134qk.UNINITIALIZED;
                }
                if (a2 == C88134qk.MODE_CHAT) {
                    z = true;
                }
                this.f235034Q = z;
            }
            ((C87062fx) this.f235031N.mo27525b()).f235225o = true;
        } else if (ordinal == 86) {
            C62940bt btVar3 = C88111po.f238214a;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r33 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r33);
            if (bwVar3.f169962ag.mo58857o(r33.f169971d)) {
                C62940bt btVar4 = C88111po.f238214a;
                C87741bw bwVar4 = clientEventData.f236955a;
                C62940bt r34 = C62942bv.checkIsLite(btVar4);
                bwVar4.mo58887l(r34);
                Object l2 = bwVar4.f169962ag.mo58854l(r34.f169971d);
                if (l2 == null) {
                    obj2 = r34.f169969b;
                } else {
                    obj2 = r34.mo58889c(l2);
                }
                C88115ps psVar = (C88115ps) obj2;
                C85005h hVar = this.f235043h;
                int a3 = C88114pr.m142785a(psVar.f238219b);
                if (a3 == 0) {
                    a3 = 1;
                }
                hVar.mo78615K(a3 - 1);
                boolean z2 = this.f235051p;
                int a4 = C88114pr.m142785a(psVar.f238219b);
                if (a4 == 0 || a4 == 1) {
                    z = true;
                }
                this.f235051p = z;
                if (z2 && !z) {
                    this.f235052q = true;
                    mo80591ar();
                }
            }
        } else if (ordinal == 97) {
            this.f235043h.mo78612H((Bundle) clientEventData.mo81912b(Bundle.class), this.f235050o);
        } else if (ordinal == 111) {
            C62940bt btVar5 = C88076og.f238138a;
            C87741bw bwVar5 = clientEventData.f236955a;
            C62940bt r35 = C62942bv.checkIsLite(btVar5);
            bwVar5.mo58887l(r35);
            if (bwVar5.f169962ag.mo58857o(r35.f169971d)) {
                C62940bt btVar6 = C88076og.f238138a;
                C87741bw bwVar6 = clientEventData.f236955a;
                C62940bt r36 = C62942bv.checkIsLite(btVar6);
                bwVar6.mo58887l(r36);
                Object l3 = bwVar6.f169962ag.mo58854l(r36.f169971d);
                if (l3 == null) {
                    obj3 = r36.f169969b;
                } else {
                    obj3 = r36.mo58889c(l3);
                }
                C88079oj a5 = C88079oj.m142780a(((C88080ok) obj3).f238149b);
                if (a5 == null) {
                    a5 = C88079oj.UNKNOWN;
                }
                if (a5 == C88079oj.RESUMED) {
                    z = true;
                }
                this.f235049n = z;
                if (z) {
                    for (C87022ep epVar : this.f235035R) {
                        if (((C87052fn) this.f235038c.mo27525b()).f235177m.mo84383cP(epVar.f235019a)) {
                            m140504r(epVar.f235019a, epVar.f235020b, epVar.f235021c);
                        }
                    }
                    this.f235035R.clear();
                    return;
                }
                return;
            }
            this.f235049n = false;
        }
    }

    /* renamed from: i */
    public final void mo80635i(Query query, C86232bo boVar) {
        if (((C87052fn) this.f235038c.mo27525b()).f235177m.mo84383cP(query)) {
            if (boVar instanceof C86254i) {
                if (m140506t()) {
                    mo80591ar();
                }
                C86251f fVar = this.f235055t;
                fVar.getClass();
                fVar.mo79948d(boVar);
                m140503q(query, new C87019em(this, query, fVar, boVar), fVar);
                return;
            }
            mo80632a(query, (C86251f) null, boVar);
        }
    }

    /* renamed from: j */
    public final void mo80636j(Query query, C90606n nVar) {
        if (((C87052fn) this.f235038c.mo27525b()).f235177m.mo84383cP(query)) {
            if (m140506t()) {
                mo80591ar();
            }
            C86251f fVar = this.f235055t;
            fVar.getClass();
            if (mo80640o(query)) {
                if (!fVar.f233147f.isDone()) {
                    fVar.f233147f.mo57356n(C58833ax.m90834k(nVar));
                } else {
                    ((C59052c) ((C59052c) C86251f.f233142a.mo56225c()).mo56372aa(7725)).mo56386p("ttsOptionalFuture is already set.");
                }
            }
            m140503q(query, new C87008eb(this, query, nVar), fVar);
        }
    }

    /* renamed from: k */
    public final void mo80637k(Query query) {
        if (((C87052fn) this.f235038c.mo27525b()).f235177m.mo84383cP(query)) {
            if (m140506t()) {
                mo80591ar();
            }
            C86251f fVar = this.f235055t;
            fVar.getClass();
            fVar.mo79946b();
            fVar.mo79947c();
            m140503q(query, new C87010ed(this, query), fVar);
        }
    }

    /* renamed from: m */
    public final void mo80638m(C87171z zVar, Query query) {
        byte[] r;
        ActionData actionData = zVar.f235555j;
        if (actionData != null && (r = actionData.mo81106r()) != null) {
            if (this.f235061z || this.f235023A) {
                if (query.mo84412cs() || query.mo84324bI() || (query.mo84337bV() && !query.mo84457dk())) {
                    this.f235043h.mo78610F(r, query);
                    new C90873ag(this.f235043h.mo78619c(), this.f235045j, "create OPA_KEEP_SCREEN_ON ServiceEventData", new C87017ek(this)).mo85223a(C87018el.f235010a);
                } else {
                    this.f235059x = r;
                    mo80591ar();
                }
                this.f235028I = 4;
                this.f235061z = false;
            }
        }
    }

    /* renamed from: n */
    public final void mo80639n(boolean z) {
        if (mo80641p(z)) {
            mo80591ar();
        }
    }

    /* renamed from: o */
    public final boolean mo80640o(Query query) {
        return query.mo84403cj() && !query.mo84397cd() && ((C86812ai) this.f235041f.mo27525b()).f234471a.f236953f.equals("opa");
    }

    /* renamed from: p */
    public final boolean mo80641p(boolean z) {
        C60870cx cxVar = this.f235036S;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        if (z) {
            this.f235036S = this.f235045j.mo28208h("reset needAudioForCcl", (long) ((int) this.f235037b.mo79743a(C90014bt.f247622kd)), new C87009ec(this));
        }
        if (this.f235025F == z) {
            return false;
        }
        this.f235025F = z;
        return true;
    }
}
