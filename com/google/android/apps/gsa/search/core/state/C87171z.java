package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84773a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86803r;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87399b;
import com.google.android.apps.gsa.search.shared.actions.C87401c;
import com.google.android.apps.gsa.search.shared.actions.C87412e;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.C87424l;
import com.google.android.apps.gsa.search.shared.actions.C87478u;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.ButtonAction;
import com.google.android.apps.gsa.search.shared.actions.core.PromoAction;
import com.google.android.apps.gsa.search.shared.actions.errors.C87413a;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.ImageInfo;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.util.PromptSegment;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87754ci;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87756ck;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87772d;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87826f;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87934j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87988l;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88201sx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88206tb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88208td;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88209te;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88213ti;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88215tk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88224tt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88226tv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88227tw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88229ty;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55263lx;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55354pg;
import com.google.p4152bb.p4153a.C55355ph;
import com.google.p4152bb.p4153a.C55360pm;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: com.google.android.apps.gsa.search.core.state.z */
/* compiled from: PG */
public final class C87171z extends C86898ct implements C87401c {

    /* renamed from: a */
    public static final C59071e f235529a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.z");

    /* renamed from: A */
    public Query f235530A;

    /* renamed from: E */
    private final C68214a f235531E;

    /* renamed from: F */
    private final C68214a f235532F;

    /* renamed from: G */
    private final C68214a f235533G;

    /* renamed from: H */
    private final C68214a f235534H;

    /* renamed from: I */
    private final C68214a f235535I;

    /* renamed from: L */
    private final C68214a f235536L;

    /* renamed from: M */
    private final C68214a f235537M;

    /* renamed from: N */
    private final C68214a f235538N;

    /* renamed from: O */
    private final C87170y f235539O = new C87170y();

    /* renamed from: P */
    private final C86372a f235540P;

    /* renamed from: Q */
    private final C86355a f235541Q;

    /* renamed from: R */
    private List f235542R;

    /* renamed from: S */
    private VoiceAction f235543S;

    /* renamed from: T */
    private C87423k f235544T;

    /* renamed from: U */
    private C60870cx f235545U;

    /* renamed from: V */
    private C87424l f235546V;

    /* renamed from: b */
    public final C68214a f235547b;

    /* renamed from: c */
    public final C68214a f235548c;

    /* renamed from: d */
    public final C68214a f235549d;

    /* renamed from: e */
    public final C68214a f235550e;

    /* renamed from: f */
    public final C68214a f235551f;

    /* renamed from: g */
    public final BitFlags f235552g;

    /* renamed from: h */
    public final C86124t f235553h;

    /* renamed from: i */
    public Query f235554i;

    /* renamed from: j */
    public ActionData f235555j;

    /* renamed from: k */
    public List f235556k;

    /* renamed from: l */
    public C55421x f235557l;

    /* renamed from: m */
    public boolean f235558m;

    /* renamed from: n */
    public int f235559n;

    /* renamed from: o */
    public final Stack f235560o;

    /* renamed from: p */
    public Query f235561p;

    /* renamed from: q */
    public Query f235562q;

    /* renamed from: r */
    public CardDecision f235563r;

    /* renamed from: s */
    public int f235564s;

    /* renamed from: t */
    public boolean f235565t;

    /* renamed from: u */
    public long f235566u;

    /* renamed from: v */
    public final C84809b f235567v;

    /* renamed from: w */
    public final C22871g f235568w;

    /* renamed from: x */
    public VoiceAction f235569x;

    /* renamed from: y */
    public C60870cx f235570y;

    /* renamed from: z */
    public boolean f235571z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87171z(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C86124t tVar, C84809b bVar, C22871g gVar, C86372a aVar15, C86355a aVar16) {
        super(aVar, 51);
        C68214a aVar17 = aVar;
        BitFlags bitFlags = new BitFlags(getClass(), "FLAG_", 0);
        this.f235552g = bitFlags;
        this.f235554i = Query.f252741b;
        this.f235555j = null;
        this.f235557l = C55421x.UNKNOWN_ACTION_TYPE;
        this.f235558m = false;
        this.f235542R = new ArrayList();
        this.f235564s = 0;
        this.f235565t = true;
        this.f235569x = null;
        this.f235530A = null;
        this.f235547b = aVar2;
        this.f235532F = aVar3;
        this.f235531E = aVar4;
        this.f235548c = aVar5;
        this.f235536L = aVar8;
        this.f235549d = aVar9;
        this.f235533G = aVar10;
        this.f235534H = aVar11;
        this.f235550e = aVar6;
        this.f235535I = aVar7;
        this.f235551f = aVar12;
        this.f235537M = aVar13;
        this.f235538N = aVar14;
        this.f235553h = tVar;
        this.f235567v = bVar;
        this.f235568w = gVar;
        this.f235560o = new Stack();
        bitFlags.mo85049c(0, 128);
        this.f235540P = aVar15;
        this.f235541Q = aVar16;
    }

    /* renamed from: O */
    public static boolean m140903O(C55244le leVar) {
        if (leVar.f145469b.size() <= 0 || (((C55365pr) leVar.f145469b.get(0)).f145878a & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: aA */
    private final boolean m140904aA(ActionData actionData) {
        if (!C58832aw.m90831a(actionData, this.f235555j)) {
            return false;
        }
        List list = this.f235556k;
        if (list != null && list.isEmpty()) {
            return false;
        }
        this.f235556k = Collections.emptyList();
        m140913aw((CardDecision) null, true);
        this.f235567v.mo78497q((C87541c) this.f235551f.mo27525b());
        return true;
    }

    /* renamed from: aB */
    private final boolean m140905aB(ActionData actionData, List list) {
        if (!C58832aw.m90831a(actionData, this.f235555j)) {
            return false;
        }
        C90748e.m148225c(list);
        this.f235556k = list;
        m140913aw((CardDecision) null, true);
        this.f235552g.mo85049c(0, 4096);
        mo80775G();
        mo80801ai();
        mo80820t();
        mo80774F();
        mo80773E();
        mo80806e().mo81201a(this.f235555j, mo80807f(), this.f235554i);
        mo80819s();
        return true;
    }

    /* renamed from: aC */
    private final boolean m140906aC(ActionData actionData) {
        return actionData != null && actionData.f235998h != null && this.f235553h.mo79745c(C90014bt.f247823oj).contains(actionData.f235998h.name()) && C87399b.m141527a(actionData);
    }

    /* renamed from: aD */
    private final void m140907aD(ActionData actionData, List list) {
        if (m140905aB(actionData, list)) {
            mo80591ar();
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: ae */
    public static boolean m140908ae(ActionData actionData, Query query) {
        return query.mo84435dP() && !query.mo84422dC() && !ActionData.m141430o(actionData);
    }

    /* renamed from: as */
    private static Query m140909as(String str) {
        return Query.f252741b.mo84275aL("and.opa").mo84245H(0, true, (QueryTriggerType) null).mo84268aE(str, false).mo84494v();
    }

    /* renamed from: at */
    private final void m140910at(VoiceAction voiceAction) {
        this.f235552g.mo85049c(0, 4);
        if (mo80806e().mo81205e((voiceAction == null || !voiceAction.mo81083v()) ? 3 : 4)) {
            m140911au();
        }
        if (voiceAction != null) {
            this.f235567v.mo78506z(voiceAction);
        }
    }

    /* renamed from: au */
    private final void m140911au() {
        this.f235567v.mo78500t(mo80807f(), this.f235555j, mo80808g(), mo80806e(), ((C87052fn) this.f235549d.mo27525b()).f235177m);
    }

    /* renamed from: av */
    private final void m140912av(C87423k kVar) {
        int a;
        if (kVar == null || (a = C87478u.m141962a(kVar.f236087b)) == 0 || a != 8) {
            this.f235544T = kVar;
        }
    }

    /* renamed from: aw */
    private final void m140913aw(CardDecision cardDecision, boolean z) {
        this.f235563r = cardDecision;
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (z) {
            this.f235564s = 0;
        }
        mo80801ai();
        if (mo80808g().f236254h) {
            mo80809h().mo81654p();
        }
        if (this.f235571z) {
            this.f235571z = false;
            new C90873ag(this.f235567v.mo78487f(mo80808g(), mo80804b(), this.f235559n, this.f235560o.contains(Integer.valueOf(C89885b.ACTION_ERROR_NO_PROGRESS_VALUE))), this.f235568w, "Create ShowPromptEventData", new C86905d(this)).mo85223a(C87001e.f234987a);
        }
    }

    /* renamed from: ax */
    private final boolean m140914ax(VoiceAction voiceAction, int i) {
        return this.f235539O.mo80767a(voiceAction, i);
    }

    /* renamed from: ay */
    private final boolean m140915ay(int i, int i2, C87423k kVar) {
        boolean z;
        int a;
        int i3;
        int a2;
        int a3;
        int a4;
        boolean z2;
        C58976aa aaVar = C58975e.f156826a;
        m140912av(kVar);
        boolean c = this.f235552g.mo85049c(0, 134217728);
        if (mo80788U()) {
            c = c | this.f235552g.mo85049c(0, 65536) | this.f235552g.mo85049c(0, 34359738368L);
        }
        if (!mo80788U() || i != 2) {
            c |= this.f235552g.mo85049c(0, 128);
            if (i == 1) {
                z2 = this.f235552g.mo85049c(131072, 0);
            } else {
                z = c;
                if (kVar != null && (((a2 = C87478u.m141962a(i3)) != 0 && a2 == 11) || ((a4 = C87478u.m141962a(i3)) != 0 && a4 == 12))) {
                    a3 = C87478u.m141962a(i3);
                    if (a3 != 0 && a3 == 11) {
                        ((C87052fn) this.f235549d.mo27525b()).mo80462q(m140909as("Okay"));
                    } else {
                        int a5 = C87478u.m141962a(i3);
                        if (a5 != 0 && a5 == 12) {
                            ((C87052fn) this.f235549d.mo27525b()).mo80462q(m140909as(kVar.f236089d));
                        }
                    }
                }
                if (i2 == 3 && this.f235552g.mo85049c(0, 32768)) {
                    mo80775G();
                    z = true;
                }
                mo80802aj(true);
                if (kVar != null && (((a = C87478u.m141962a(kVar.f236087b)) == 0 || a != 8) && mo80806e().mo81205e(1))) {
                    m140911au();
                }
                return z;
            }
        } else {
            z2 = this.f235552g.mo85049c(0, 131072);
        }
        z = z2 | c;
        i3 = kVar.f236087b;
        a3 = C87478u.m141962a(i3);
        if (a3 != 0) {
            ((C87052fn) this.f235549d.mo27525b()).mo80462q(m140909as("Okay"));
            mo80775G();
            z = true;
            mo80802aj(true);
            m140911au();
            return z;
        }
        int a52 = C87478u.m141962a(i3);
        ((C87052fn) this.f235549d.mo27525b()).mo80462q(m140909as(kVar.f236089d));
        mo80775G();
        z = true;
        mo80802aj(true);
        m140911au();
        return z;
    }

    /* renamed from: az */
    private final boolean m140916az(ActionData actionData, Query query) {
        if (!C58832aw.m90831a(actionData, this.f235555j)) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f235561p = query;
        return mo80791X();
    }

    /* renamed from: A */
    public final void mo80769A(VoiceAction voiceAction) {
        if (voiceAction == mo80807f() && voiceAction.mo81065f() != null) {
            this.f235552g.mo85049c(0, 524288);
            new C90873ag(this.f235567v.mo78485c(voiceAction, ((C87052fn) this.f235549d.mo27525b()).f235177m), this.f235568w, String.format("[%s] On matching provider info created", new Object[]{"ActionState"}), new C87033f(this, voiceAction)).mo85223a(C87065g.f235249a);
        }
    }

    /* renamed from: B */
    public final void mo80770B(ActionData actionData) {
        if (!C58832aw.m90831a(this.f235555j, actionData)) {
            this.f235555j = actionData;
            C84809b bVar = this.f235567v;
            if (actionData == null) {
                actionData = ActionData.f235991b;
            }
            bVar.mo78476D(actionData);
        }
    }

    /* renamed from: C */
    public final void mo80771C(VoiceAction voiceAction, CardDecision cardDecision) {
        if (voiceAction == mo80807f()) {
            boolean c = this.f235552g.mo85049c(2048, 0);
            if (!C58832aw.m90831a(cardDecision, this.f235563r) || this.f235552g.mo85049c(8589934592L, 0)) {
                CardDecision cardDecision2 = this.f235563r;
                m140913aw(cardDecision, false);
                C58976aa aaVar = C58975e.f156826a;
                if (cardDecision.f236256j) {
                    voiceAction.mo81055E();
                }
                if (this.f235564s == 0 && cardDecision2 == null) {
                    mo80817q();
                }
                if (!cardDecision.f236252f && !cardDecision.f236254h && !mo80796ab() && !mo80789V() && !voiceAction.mo81080s() && !this.f235554i.mo84326bK() && !this.f235554i.mo84419cz()) {
                    this.f235552g.mo85049c(0, 34359738368L);
                    this.f235552g.mo85049c(0, 128);
                }
                mo80820t();
                c = true;
                if (mo80806e().mo81204d(cardDecision, mo80807f(), mo80788U())) {
                    m140911au();
                }
            }
            if (this.f235552g.mo85049c(16384, 0) || c) {
                this.f235552g.mo85049c(0, 8);
                mo80591ar();
            }
        }
    }

    /* renamed from: D */
    public final void mo80772D(ActionData actionData) {
        if (m140904aA(actionData)) {
            mo80775G();
            mo80801ai();
            mo80591ar();
        }
    }

    /* renamed from: E */
    public final void mo80773E() {
        C87052fn fnVar = (C87052fn) this.f235549d.mo27525b();
        C60870cx p = this.f235567v.mo78496p(this.f235555j, mo80804b(), this.f235559n, mo80799af(), fnVar.mo80692M(fnVar.f235177m), mo80809h());
        this.f235570y = p;
        new C90873ag(p, this.f235568w, "On actions errors updated", new C87160o(this)).mo85223a(C87161p.f235512a);
    }

    /* renamed from: F */
    public final void mo80774F() {
        ClientConfig clientConfig = ((C86812ai) this.f235532F.mo27525b()).f234471a;
        Query query = ((C87052fn) this.f235549d.mo27525b()).f235177m;
        ActionData actionData = this.f235555j;
        VoiceAction f = mo80807f();
        CardDecision g = mo80808g();
        C55421x xVar = this.f235557l;
        this.f235557l = C55421x.UNKNOWN_ACTION_TYPE;
        this.f235567v.mo78480H((C87541c) this.f235551f.mo27525b(), clientConfig, query, actionData, f, g, xVar, ((C87052fn) this.f235549d.mo27525b()).mo80692M(((C87052fn) this.f235549d.mo27525b()).f235177m));
    }

    /* renamed from: G */
    public final void mo80775G() {
        PromoAction promoAction;
        VoiceAction f;
        ModularAction modularAction;
        C55244le a;
        Object obj;
        if (mo80795aa()) {
            m140914ax(ButtonAction.f236040f, 1);
        } else {
            this.f235539O.mo80767a((VoiceAction) null, 1);
        }
        VoiceAction f2 = mo80807f();
        if ((f2 instanceof ModularAction) && f2.mo81084w() && (a = (modularAction = (ModularAction) f2).f235985a.mo81111a(modularAction.mo81219Z())) != null) {
            Iterator it = a.f145474g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C55365pr prVar = (C55365pr) it.next();
                C62940bt r4 = C62942bv.checkIsLite(C55263lx.f145543j);
                prVar.mo58887l(r4);
                Object l = prVar.f169962ag.mo58854l(r4.f169971d);
                if (l == null) {
                    obj = r4.f169969b;
                } else {
                    obj = r4.mo58889c(l);
                }
                C55263lx lxVar = (C55263lx) obj;
                C55136he heVar = prVar.f145879b;
                if (heVar == null) {
                    heVar = C55136he.f145130j;
                }
                if (!heVar.f145133b.isEmpty() && lxVar.f145552g.size() > 0 && !((C55136he) lxVar.f145552g.get(0)).f145133b.isEmpty() && !lxVar.f145549d.isEmpty()) {
                    promoAction = new PromoAction(prVar);
                    break;
                }
            }
        }
        promoAction = null;
        if (!(promoAction == null || !m140914ax(promoAction, 2) || (f = mo80807f()) == null)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 619;
            int i = f.mo81066g().f146230cP;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164093a |= 256;
            ufVar2.f164264s = i;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        ArrayList arrayList = new ArrayList();
        this.f235542R = arrayList;
        List list = this.f235556k;
        if (list != null) {
            arrayList.addAll(list);
        }
        List list2 = this.f235542R;
        C87170y yVar = this.f235539O;
        ArrayList arrayList2 = new ArrayList();
        VoiceAction voiceAction = (VoiceAction) yVar.f235528a.get(1);
        if (voiceAction != null) {
            arrayList2.add(voiceAction);
        }
        VoiceAction voiceAction2 = (VoiceAction) yVar.f235528a.get(2);
        if (voiceAction2 != null) {
            arrayList2.add(voiceAction2);
        }
        list2.addAll(arrayList2);
        this.f235552g.mo85055h(1024, true ^ this.f235542R.isEmpty());
    }

    /* renamed from: H */
    public final void mo80776H(Query query, ActionData actionData) {
        List p = ((C87052fn) this.f235549d.mo27525b()).mo80713p(actionData);
        if (p != null) {
            mo80812k(query, actionData, p);
        } else {
            mo80813m(query, actionData);
        }
        mo80775G();
        mo80801ai();
        mo80591ar();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean mo80777I() {
        boolean J = mo80778J(true);
        if (J) {
            mo80775G();
            mo80774F();
            mo80591ar();
        }
        return J;
    }

    /* renamed from: J */
    public final boolean mo80778J(boolean z) {
        VoiceAction f = mo80807f();
        if (f == null || !f.mo81055E()) {
            return false;
        }
        if (z) {
            mo80800ah();
        }
        this.f235552g.mo85049c(0, 8);
        m140910at(f);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean mo80779K(Query query) {
        return mo80781M(query) && mo80783P(this.f235555j) && mo80807f() != null;
    }

    /* renamed from: L */
    public final boolean mo80780L() {
        VoiceAction f = mo80807f();
        if (f == null) {
            return false;
        }
        if (this.f235543S != null || (f.mo81133M() && mo80808g().f236255i && f.mo81051A())) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean mo80781M(Query query) {
        return (this.f235555j == null || query == null || !query.mo84383cP(this.f235554i)) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo80782N() {
        ActionData actionData = this.f235555j;
        return actionData != null && actionData.mo81099j() && this.f235555j.mo81089a() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean mo80783P(ActionData actionData) {
        return actionData != null && C58832aw.m90831a(actionData, this.f235555j) && BitFlags.m148144f(this.f235552g.f253762b, 4096);
    }

    /* renamed from: Q */
    public final boolean mo80784Q() {
        return BitFlags.m148144f(this.f235552g.f253762b, 1024);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = r0.f236266t.size();
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80785R() {
        /*
            r3 = this;
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r3.f235563r
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.List r0 = r0.f236266t
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0016
            int r2 = r3.f235564s
            int r0 = r0 + -1
            if (r2 != r0) goto L_0x0016
            r0 = 1
            return r0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87171z.mo80785R():boolean");
    }

    /* renamed from: S */
    public final boolean mo80786S() {
        return BitFlags.m148144f(this.f235552g.f253762b, 4294967296L);
    }

    /* renamed from: T */
    public final boolean mo80787T() {
        return !mo80788U();
    }

    /* renamed from: U */
    public final boolean mo80788U() {
        return (!BitFlags.m148144f(this.f235552g.f253762b, 128) || ((C86812ai) this.f235532F.mo27525b()).f234471a.f236953f.equals("clockwork")) && !m140906aC(this.f235555j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final boolean mo80789V() {
        return BitFlags.m148144f(this.f235552g.f253762b, 4194304);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final boolean mo80790W(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        Query query2 = this.f235562q;
        return query2 != null && query2.mo84383cP(query);
    }

    /* renamed from: X */
    public final boolean mo80791X() {
        return BitFlags.m148144f(this.f235552g.f253762b, 2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f235530A;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80792Y(com.google.android.apps.gsa.shared.search.Query r2) {
        /*
            r1 = this;
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r1.f235555j
            if (r0 == 0) goto L_0x0021
            com.google.android.apps.gsa.shared.search.Query r0 = r1.f235530A
            if (r0 == 0) goto L_0x0021
            boolean r2 = r0.mo84383cP(r2)
            if (r2 == 0) goto L_0x0021
            java.util.Stack r2 = r1.f235560o
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0021
            int r2 = r1.mo80804b()
            r0 = 1114114(0x110002, float:1.561206E-39)
            if (r2 != r0) goto L_0x0021
            r2 = 1
            return r2
        L_0x0021:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87171z.mo80792Y(com.google.android.apps.gsa.shared.search.Query):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final boolean mo80793Z() {
        return BitFlags.m148144f(this.f235552g.f253762b, 2048);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo80794a() {
        CardDecision cardDecision;
        if (mo80807f() == null || (cardDecision = this.f235563r) == null || cardDecision.mo81420e(this.f235564s) == null) {
            return -1;
        }
        return this.f235564s;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r4.f235556k;
     */
    /* renamed from: aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80795aa() {
        /*
            r4 = this;
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r4.f235555j
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.mo81099j()
            if (r0 != 0) goto L_0x0043
            java.util.List r0 = r4.f235556k
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0043
            com.google.android.apps.gsa.shared.util.BitFlags r0 = r4.f235552g
            long r0 = r0.f253762b
            r2 = 32768(0x8000, double:1.61895E-319)
            boolean r0 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r0, r2)
            if (r0 != 0) goto L_0x0043
            dagger.a r0 = r4.f235549d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r0 = (com.google.android.apps.gsa.search.core.state.C87052fn) r0
            com.google.android.apps.gsa.shared.search.Query r0 = r0.f235177m
            boolean r0 = r0.mo84318bC()
            if (r0 != 0) goto L_0x0043
            com.google.android.apps.gsa.shared.search.Query r0 = r4.f235554i
            boolean r0 = r0.mo84369cB()
            if (r0 != 0) goto L_0x0043
            com.google.android.apps.gsa.shared.search.Query r0 = r4.f235554i
            boolean r0 = r0.mo84331bP()
            if (r0 != 0) goto L_0x0043
            r0 = 1
            return r0
        L_0x0043:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87171z.mo80795aa():boolean");
    }

    /* renamed from: ab */
    public final boolean mo80796ab() {
        CardDecision cardDecision = this.f235563r;
        return (cardDecision == null || cardDecision.mo81420e(this.f235564s) == null) ? false : true;
    }

    /* renamed from: ac */
    public final boolean mo80797ac() {
        VoiceAction f = mo80807f();
        if (!(f instanceof ModularAction)) {
            return false;
        }
        ModularAction modularAction = (ModularAction) f;
        boolean ak = modularAction.mo81231ak(((ModularActionMatchingProviderInfo) modularAction.f235986b).f236115a);
        CardDecision cardDecision = this.f235563r;
        if (cardDecision == null || f.mo81054D() || !cardDecision.f236255i || cardDecision.f236257k != 0 || !ak || !modularAction.mo81232al() || this.f235554i.mo84423dD() || this.f235554i.mo84466dt()) {
            return false;
        }
        return true;
    }

    /* renamed from: ad */
    public final boolean mo80798ad() {
        int i;
        VoiceAction f = mo80807f();
        boolean z = f != null && (f.mo81083v() || f.mo81084w());
        if (f == null) {
            i = -1;
        } else {
            i = f.mo81067ht();
        }
        Query query = ((C87052fn) this.f235549d.mo27525b()).f235177m;
        if (!query.mo84337bV() && !mo80797ac() && i != 101) {
            if (!query.mo84403cj()) {
                return false;
            }
            if (i == 1 || z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: af */
    public final boolean mo80799af() {
        return BitFlags.m148144f(this.f235552g.f253762b, 131072);
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.CONTACT_SELECTED_EXTERNALLY, C87739bu.ACTION_CHANGED_EXTERNALLY, C87739bu.ACTION_COUNTDOWN_CANCELED, C87739bu.ESCAPE_HATCH_CLICKED, C87739bu.HANDLE_ACTIONS_BACK_PRESS, C87739bu.SAVE_USER_INTERACTION, C87739bu.ACTION_USER_INTERACTION, C87739bu.REMOTE_ACTION_TRIGGERED, C87739bu.CLEAR_VOICE_ACTIONS, C87739bu.REQUEST_EXECUTE_ACTION, C87739bu.REQUEST_CANCEL_ACTION_EXECUTION, C87739bu.SAVE_ENTRY_LOCATION, C87739bu.SAVE_RELATIONSHIP};
    }

    /* renamed from: ah */
    public final void mo80800ah() {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo80793Z()) {
            VoiceAction f = mo80807f();
            ActionData actionData = this.f235555j;
            if (f != null && actionData != null) {
                C87413a aVar = (mo80804b() == 0 || this.f235559n <= 0) ? null : new C87413a(mo80804b(), this.f235559n, this.f235560o.size());
                Query query = ((C87052fn) this.f235549d.mo27525b()).f235177m;
                boolean z = ((C86803r) this.f235533G.mo27525b()).mo80509n() && !query.mo84423dD() && !query.mo84337bV() && !query.mo84363bw("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN") && (!query.mo84326bK() || !query.mo84332bQ());
                boolean z2 = mo80786S() || actionData.mo81104p();
                C84809b bVar = this.f235567v;
                ClientConfig clientConfig = ((C86812ai) this.f235532F.mo27525b()).f234471a;
                boolean U = mo80788U();
                long j = this.f235552g.f253762b;
                C60870cx K = bVar.mo78483K(f, actionData, query, aVar, clientConfig, U, BitFlags.m148144f(j, 4), mo80799af(), BitFlags.m148144f(j, 134217728), z, z2);
                this.f235552g.mo85049c(0, 2048);
                new C90873ag(K, this.f235568w, String.format("[%s] On create cardDecision", new Object[]{"ActionState"}), new C87164s(this, f)).mo85223a(C87165t.f235519a);
            }
        }
    }

    /* renamed from: aj */
    public final void mo80802aj(boolean z) {
        if (mo80807f() != null) {
            if (z) {
                this.f235552g.mo85049c(0, 16384);
            }
            mo80800ah();
        }
    }

    /* renamed from: ak */
    public final boolean mo80803ak(ActionData actionData, C87412e eVar, MatchingProviderInfo matchingProviderInfo) {
        C55305nl nlVar;
        C55240la laVar;
        Object obj;
        ActionData actionData2 = actionData;
        MatchingProviderInfo matchingProviderInfo2 = matchingProviderInfo;
        Query a = eVar.mo81177a();
        ClientConfig clientConfig = ((C86812ai) this.f235532F.mo27525b()).f234471a;
        if (a != null && !clientConfig.mo81908x() && m140916az(actionData2, a)) {
            mo80591ar();
        }
        List b = eVar.mo81178b();
        if (mo80806e().mo81203c(b == null || b.isEmpty() || (b.get(0) instanceof PuntAction))) {
            m140911au();
        }
        if (b == null) {
            mo80772D(actionData);
            return false;
        } else if (!b.isEmpty()) {
            VoiceAction voiceAction = (VoiceAction) b.get(0);
            if (matchingProviderInfo2 != null) {
                if (matchingProviderInfo.mo81435e() && this.f235553h.mo79746e(C90086ek.f250380bz) && ((C86812ai) this.f235532F.mo27525b()).f234471a.mo81901s() && (voiceAction instanceof ModularAction) && (nlVar = (C55305nl) C58557jl.m90130k(((ModularAction) voiceAction).f236103i.f236312a, (Object) null)) != null && (laVar = (C55240la) C58557jl.m90130k(nlVar.f145692b, (Object) null)) != null) {
                    C62940bt r9 = C62942bv.checkIsLite(C55208jw.f145316z);
                    laVar.mo58887l(r9);
                    if (laVar.f169962ag.mo58857o(r9.f169971d)) {
                        C62940bt r92 = C62942bv.checkIsLite(C55208jw.f145316z);
                        laVar.mo58887l(r92);
                        Object l = laVar.f169962ag.mo58854l(r92.f169971d);
                        if (l == null) {
                            obj = r92.f169969b;
                        } else {
                            obj = r92.mo58889c(l);
                        }
                        C55208jw jwVar = (C55208jw) obj;
                        int i = jwVar.f145318a;
                        if (!((i & 16) == 0 || (i & 8) == 0)) {
                            C55136he heVar = jwVar.f145324g;
                            if (heVar == null) {
                                heVar = C55136he.f145130j;
                            }
                            if ((heVar.f145132a & 1) != 0 && heVar.f145133b.contains("maps.google.com")) {
                                C55136he heVar2 = jwVar.f145322e;
                                if (heVar2 == null) {
                                    heVar2 = C55136he.f145130j;
                                }
                                if ((heVar2.f145132a & 1) != 0) {
                                    String str = heVar2.f145133b;
                                    C55360pm pmVar = (C55360pm) C55361pn.f145866g.createBuilder();
                                    int i2 = laVar.f145452b;
                                    pmVar.copyOnWrite();
                                    C55361pn pnVar = (C55361pn) pmVar.instance;
                                    pnVar.f145868a |= 2;
                                    pnVar.f145870c = i2;
                                    C55354pg pgVar = (C55354pg) C55355ph.f145852e.createBuilder();
                                    pgVar.copyOnWrite();
                                    C55355ph phVar = (C55355ph) pgVar.instance;
                                    str.getClass();
                                    phVar.f145855a |= 1;
                                    phVar.f145856b = str;
                                    pmVar.mo58885m(C55355ph.f145853f, (C55355ph) pgVar.build());
                                    C55361pn pnVar2 = (C55361pn) pmVar.build();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(pnVar2);
                                    MatchingProviderInfo matchingProviderInfo3 = new MatchingProviderInfo(arrayList, pnVar2, false);
                                    C55240la laVar2 = (C55240la) C58557jl.m90130k(nlVar.f145693c, (Object) null);
                                    C55244le leVar = nlVar.f145696f;
                                    if (leVar == null) {
                                        leVar = C55244le.f145466h;
                                    }
                                    C55240la laVar3 = (C55240la) C58557jl.m90130k(leVar.f145470c, (Object) null);
                                    C55244le leVar2 = nlVar.f145694d;
                                    if (leVar2 == null) {
                                        leVar2 = C55244le.f145466h;
                                    }
                                    C55240la laVar4 = (C55240la) C58557jl.m90130k(leVar2.f145470c, (Object) null);
                                    C55244le leVar3 = nlVar.f145697g;
                                    if (leVar3 == null) {
                                        leVar3 = C55244le.f145466h;
                                    }
                                    C55240la laVar5 = (C55240la) C58557jl.m90130k(leVar3.f145470c, (Object) null);
                                    C55244le leVar4 = nlVar.f145695e;
                                    if (leVar4 == null) {
                                        leVar4 = C55244le.f145466h;
                                    }
                                    ModularActionMatchingProviderInfo modularActionMatchingProviderInfo = r10;
                                    ModularActionMatchingProviderInfo modularActionMatchingProviderInfo2 = new ModularActionMatchingProviderInfo(matchingProviderInfo3, laVar, laVar2, laVar3, laVar4, laVar5, (C55240la) C58557jl.m90130k(leVar4.f145470c, (Object) null));
                                    voiceAction.mo81076o(modularActionMatchingProviderInfo);
                                    m140907aD(actionData2, b);
                                    return true;
                                }
                            }
                        }
                    }
                }
                voiceAction.mo81076o(matchingProviderInfo2);
            }
            ClientConfig clientConfig2 = ((C86812ai) this.f235532F.mo27525b()).f234471a;
            if (matchingProviderInfo2 == null || (matchingProviderInfo.mo81435e() && !clientConfig2.mo81892j() && !actionData.mo81096h())) {
                C59104x d = f235529a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ActionState");
                ((C59052c) ((C59052c) d).mo56372aa(8642)).mo56389s("Action suppressed due to no matching apps: %s", voiceAction);
                if (mo80806e().mo81203c(true)) {
                    m140911au();
                }
                m140907aD(actionData2, new ArrayList());
                return false;
            }
            m140907aD(actionData2, b);
            return true;
        } else {
            m140907aD(actionData2, b);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo80804b() {
        if (this.f235560o.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f235560o.peek()).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.search.shared.actions.ActionData mo80805c(com.google.android.apps.gsa.search.core.state.C87028ev r9, com.google.android.apps.gsa.search.core.state.C87052fn r10) {
        /*
            r8 = this;
            com.google.android.apps.gsa.shared.search.Query r0 = r10.f235177m
            java.lang.String r1 = "android.speech.extra.ACTION_DATA"
            boolean r2 = r0.mo84364bx(r1)
            if (r2 == 0) goto L_0x0013
            android.os.Bundle r9 = r0.f252786y
            android.os.Parcelable r9 = r9.getParcelable(r1)
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = (com.google.android.apps.gsa.search.shared.actions.ActionData) r9
            return r9
        L_0x0013:
            boolean r1 = r0.mo84433dN()
            if (r1 != 0) goto L_0x001c
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            return r9
        L_0x001c:
            boolean r1 = r0.mo84374cG()
            if (r1 != 0) goto L_0x00c2
            boolean r1 = r0.mo84419cz()
            if (r1 == 0) goto L_0x002a
            goto L_0x00c2
        L_0x002a:
            com.google.android.apps.gsa.search.shared.actions.ActionData r1 = r10.mo80707e()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0038
            boolean r1 = r1.f235997g
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            android.os.Bundle r4 = r10.f235183s
            r5 = 0
            if (r4 == 0) goto L_0x0057
            com.google.android.apps.gsa.search.shared.actions.ActionData r4 = com.google.android.apps.gsa.search.core.state.C87052fn.m140609a(r4)
            android.os.Bundle r6 = r10.f235183s
            com.google.android.apps.gsa.shared.search.Query r6 = com.google.android.apps.gsa.search.core.state.C87052fn.m140617k(r6)
            com.google.android.apps.gsa.shared.search.Query r7 = r10.f235177m
            boolean r6 = r7.mo84383cP(r6)
            if (r6 == 0) goto L_0x0057
            if (r4 == 0) goto L_0x0057
            if (r1 != 0) goto L_0x0057
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0058
        L_0x0057:
            r4 = r5
        L_0x0058:
            if (r4 == 0) goto L_0x005b
            return r4
        L_0x005b:
            com.google.android.apps.gsa.search.shared.actions.ActionData r1 = r10.mo80707e()
            if (r1 == 0) goto L_0x0067
            boolean r4 = r1.f235997g
            if (r4 == 0) goto L_0x0067
            r4 = 1
            goto L_0x0068
        L_0x0067:
            r4 = 0
        L_0x0068:
            boolean r6 = r8.mo80781M(r0)
            if (r6 == 0) goto L_0x0076
            if (r4 != 0) goto L_0x0076
            com.google.android.apps.gsa.search.shared.actions.ActionData r6 = r8.f235555j
            if (r6 != 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            return r6
        L_0x0076:
            com.google.android.apps.gsa.search.shared.actions.ActionData r6 = r9.mo80642a(r0)
            com.google.android.apps.gsa.search.shared.actions.SearchError r10 = r10.mo80708g()
            if (r10 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r2 = 0
        L_0x0082:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r4 == 0) goto L_0x0087
            return r1
        L_0x0087:
            if (r6 == 0) goto L_0x0095
            if (r2 == 0) goto L_0x0095
            com.google.android.apps.gsa.search.shared.actions.ActionData r10 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            boolean r10 = com.google.common.base.C58832aw.m90831a(r6, r10)
            if (r10 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            return r6
        L_0x0095:
            boolean r10 = r0.mo84412cs()
            if (r10 == 0) goto L_0x00a9
            if (r6 == 0) goto L_0x00a9
            if (r2 != 0) goto L_0x00a8
            com.google.android.apps.gsa.search.shared.actions.ActionData r10 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            boolean r10 = com.google.common.base.C58832aw.m90831a(r6, r10)
            if (r10 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            return r6
        L_0x00a9:
            if (r1 == 0) goto L_0x00ac
            return r1
        L_0x00ac:
            boolean r9 = r9.mo80644g(r0)
            if (r9 != 0) goto L_0x00b8
            if (r2 != 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            return r9
        L_0x00b8:
            boolean r9 = r0.mo84385cR()
            if (r9 == 0) goto L_0x00c1
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            return r9
        L_0x00c1:
            return r5
        L_0x00c2:
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87171z.mo80805c(com.google.android.apps.gsa.search.core.state.ev, com.google.android.apps.gsa.search.core.state.fn):com.google.android.apps.gsa.search.shared.actions.ActionData");
    }

    /* renamed from: e */
    public final C87424l mo80806e() {
        if (this.f235546V == null) {
            this.f235546V = new C87424l();
        }
        return this.f235546V;
    }

    /* renamed from: f */
    public final VoiceAction mo80807f() {
        List list = this.f235556k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (VoiceAction) this.f235556k.get(0);
    }

    /* renamed from: g */
    public final CardDecision mo80808g() {
        CardDecision cardDecision;
        if (mo80807f() == null || (cardDecision = this.f235563r) == null) {
            return CardDecision.f236248b;
        }
        return cardDecision;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* renamed from: gS */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17602gS(com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ActionState"
            r7.mo85291r(r0)
            java.lang.String r0 = "Flags"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r7.mo85279c(r0)
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r6.f235552g
            java.lang.String r1 = r1.mo85048b()
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r1)
            r0.mo85276a(r1)
            java.lang.String r0 = "CurrentQuery"
            com.google.android.apps.gsa.shared.search.Query r1 = r6.f235554i
            r7.mo85288o(r0, r1)
            java.lang.String r0 = "ActionData"
            com.google.android.apps.gsa.search.shared.actions.ActionData r1 = r6.f235555j
            r7.mo85288o(r0, r1)
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r6.f235555j
            r1 = 0
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.mo81108t()
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r6.f235555j
            com.google.android.speech.embedded.TaggerResult r0 = r0.f235994d
            if (r0 == 0) goto L_0x008d
        L_0x0037:
            java.lang.String r0 = "Last card displayed"
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r7.mo85278b(r0)
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = r6.mo80807f()
            boolean r3 = r2 instanceof com.google.android.apps.gsa.search.shared.actions.modular.ModularAction
            if (r3 == 0) goto L_0x005b
            r3 = r2
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r3 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r3
            com.google.bb.a.nl r3 = r3.mo81219Z()
            int r4 = r3.f145691a
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x005b
            com.google.bb.a.he r3 = r3.f145700j
            if (r3 != 0) goto L_0x0058
            com.google.bb.a.he r3 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0058:
            java.lang.String r3 = r3.f145133b
            goto L_0x005c
        L_0x005b:
            r3 = r1
        L_0x005c:
            r4 = 1
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r4 != r5) goto L_0x0065
            java.lang.String r3 = "UNKNOWN"
        L_0x0065:
            if (r2 == 0) goto L_0x0086
            com.google.bb.a.x r2 = r2.mo81066g()
            int r2 = r2.f146230cP
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "["
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "]"
            r4.append(r2)
            java.lang.String r3 = r4.toString()
        L_0x0086:
            com.google.android.apps.gsa.shared.util.b.i r2 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r3)
            r0.mo85276a(r2)
        L_0x008d:
            java.lang.String r0 = "ModifiedCommit"
            com.google.android.apps.gsa.shared.search.Query r2 = r6.f235561p
            r7.mo85288o(r0, r2)
            java.lang.String r0 = "VoiceQueryWithFollowOn"
            com.google.android.apps.gsa.shared.search.Query r2 = r6.f235562q
            r7.mo85288o(r0, r2)
            java.util.List r0 = r6.f235556k
            java.lang.String r2 = "VoiceActions"
            if (r0 != 0) goto L_0x00af
            com.google.android.apps.gsa.shared.util.debug.a.e r0 = r7.mo85279c(r2)
            java.lang.String r1 = "null"
            com.google.android.apps.gsa.shared.util.b.i r1 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r1)
            r0.mo85276a(r1)
            goto L_0x00ca
        L_0x00af:
            com.google.android.apps.gsa.shared.util.debug.a.f r1 = r7.mo85281e(r1)
            r1.mo85291r(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x00ba:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r0.next()
            com.google.android.apps.gsa.shared.util.debug.a.g r2 = (com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g) r2
            r1.mo85287n(r2)
            goto L_0x00ba
        L_0x00ca:
            java.lang.String r0 = "Action to be executed"
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r1 = r6.f235543S
            r7.mo85288o(r0, r1)
            java.lang.String r0 = "Extra cards state"
            com.google.android.apps.gsa.search.core.state.y r1 = r6.f235539O
            r7.mo85290q(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87171z.mo17602gS(com.google.android.apps.gsa.shared.util.debug.a.f):void");
    }

    @Deprecated
    /* renamed from: h */
    public final C87541c mo80809h() {
        return (C87541c) this.f235551f.mo27525b();
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal != 5) {
            boolean z4 = false;
            if (ordinal == 8) {
                VoiceAction voiceAction = ((ParcelableVoiceAction) clientEventData.mo81912b(ParcelableVoiceAction.class)).f236008a;
                if (voiceAction != null) {
                    C62940bt btVar = C87772d.f237543a;
                    C87741bw bwVar = clientEventData.f236955a;
                    C62940bt r11 = C62942bv.checkIsLite(btVar);
                    bwVar.mo58887l(r11);
                    if (bwVar.f169962ag.mo58857o(r11.f169971d)) {
                        C62940bt btVar2 = C87772d.f237543a;
                        C87741bw bwVar2 = clientEventData.f236955a;
                        C62940bt r112 = C62942bv.checkIsLite(btVar2);
                        bwVar2.mo58887l(r112);
                        Object l = bwVar2.f169962ag.mo58854l(r112.f169971d);
                        if (l == null) {
                            obj2 = r112.f169969b;
                        } else {
                            obj2 = r112.mo58889c(l);
                        }
                        C87826f fVar = (C87826f) obj2;
                        boolean z5 = fVar.f237634b;
                        boolean z6 = fVar.f237635c;
                        z = fVar.f237636d;
                        z2 = z6;
                        z3 = z5;
                    } else {
                        z3 = false;
                        z2 = false;
                        z = false;
                    }
                    mo80822u(voiceAction, (C87423k) null, z3, z2, z);
                    return;
                }
                C59104x c = f235529a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ActionState");
                ((C59052c) ((C59052c) c).mo56372aa(8580)).mo56386p("handleGenericClientEvent(): Action changed externally, but none supplied");
            } else if (ordinal == 35) {
                C62940bt btVar3 = C88201sx.f238422a;
                C87741bw bwVar3 = clientEventData.f236955a;
                C62940bt r113 = C62942bv.checkIsLite(btVar3);
                bwVar3.mo58887l(r113);
                if (bwVar3.f169962ag.mo58857o(r113.f169971d)) {
                    C62940bt btVar4 = C88201sx.f238422a;
                    C87741bw bwVar4 = clientEventData.f236955a;
                    C62940bt r114 = C62942bv.checkIsLite(btVar4);
                    bwVar4.mo58887l(r114);
                    Object l2 = bwVar4.f169962ag.mo58854l(r114.f169971d);
                    if (l2 == null) {
                        obj3 = r114.f169969b;
                    } else {
                        obj3 = r114.mo58889c(l2);
                    }
                    C88206tb tbVar = (C88206tb) obj3;
                    if (tbVar != null && (tbVar.f238426a & 2) != 0) {
                        new C90873ag(this.f235567v.mo78495n(tbVar), this.f235568w, "Process remote action request data", new C87155j(this, tbVar)).mo85223a(new C87156k(this));
                        return;
                    }
                    return;
                }
                C59104x c2 = f235529a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "ActionState");
                ((C59052c) ((C59052c) c2).mo56372aa(8582)).mo56386p("REMOTE_ACTION_TRIGGERED event data without expected extension");
            } else if (ordinal == 14) {
                m140910at(mo80807f());
                mo80591ar();
            } else if (ordinal != 15) {
                C87423k kVar = null;
                if (ordinal == 18) {
                    C62940bt btVar5 = C87934j.f237849a;
                    C87741bw bwVar5 = clientEventData.f236955a;
                    C62940bt r115 = C62942bv.checkIsLite(btVar5);
                    bwVar5.mo58887l(r115);
                    if (bwVar5.f169962ag.mo58857o(r115.f169971d)) {
                        C62940bt btVar6 = C87934j.f237849a;
                        C87741bw bwVar6 = clientEventData.f236955a;
                        C62940bt r116 = C62942bv.checkIsLite(btVar6);
                        bwVar6.mo58887l(r116);
                        Object l3 = bwVar6.f169962ag.mo58854l(r116.f169971d);
                        if (l3 == null) {
                            obj4 = r116.f169969b;
                        } else {
                            obj4 = r116.mo58889c(l3);
                        }
                        C87988l lVar = (C87988l) obj4;
                        this.f235552g.mo85049c(0, 8589934592L);
                        int i = lVar.f237956b;
                        int i2 = lVar.f237957c;
                        if ((lVar.f237955a & 4) != 0 && (kVar = lVar.f237958d) == null) {
                            kVar = C87423k.f236084e;
                        }
                        mo80825y(i, i2, kVar);
                        return;
                    }
                    C59104x c3 = f235529a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "ActionState");
                    ((C59052c) ((C59052c) c3).mo56372aa(8581)).mo56386p("ACTION_USER_INTERACTION event data without expected extension");
                } else if (ordinal == 19) {
                    C62940bt btVar7 = C88227tw.f238468a;
                    C87741bw bwVar7 = clientEventData.f236955a;
                    C62940bt r117 = C62942bv.checkIsLite(btVar7);
                    bwVar7.mo58887l(r117);
                    Object l4 = bwVar7.f169962ag.mo58854l(r117.f169971d);
                    if (l4 == null) {
                        obj5 = r117.f169969b;
                    } else {
                        obj5 = r117.mo58889c(l4);
                    }
                    C88229ty tyVar = (C88229ty) obj5;
                    if ((tyVar.f238471a & 1) != 0 && (kVar = tyVar.f238472b) == null) {
                        kVar = C87423k.f236084e;
                    }
                    m140912av(kVar);
                } else if (ordinal == 23) {
                    mo80772D(this.f235555j);
                } else if (ordinal == 24) {
                    m140913aw((CardDecision) null, true);
                    VoiceAction f = mo80807f();
                    if (f == null) {
                        this.f235544T = null;
                    } else {
                        if (!f.mo81077p()) {
                            this.f235544T = null;
                        }
                        C87423k kVar2 = this.f235544T;
                        if (f.mo81082u() && ((ModularAction) f).f236111q) {
                            z4 = true;
                        }
                        if (kVar2 == null || z4) {
                            ActionData actionData = this.f235555j;
                            if (actionData != null && actionData.f235997g) {
                                mo80811j();
                            } else if (this.f235554i.mo84403cj()) {
                                mo80825y(1, 4, (C87423k) null);
                                mo80777I();
                            } else if (this.f235552g.mo85049c(0, 16777216)) {
                                mo80591ar();
                            }
                        } else {
                            if (mo80788U()) {
                                this.f235560o.clear();
                                this.f235560o.push(Integer.valueOf(C89885b.ACTION_ERROR_NO_PROGRESS_VALUE));
                                this.f235559n = 1;
                                this.f235552g.mo85049c(0, 131072);
                            }
                            int a2 = C87478u.m141962a(kVar2.f236087b);
                            if (a2 != 0 && a2 == 9) {
                                this.f235544T = null;
                                if (((C86833bb) this.f235531E.mo27525b()).f234529g) {
                                    if (this.f235552g.mo85049c(0, 67108864)) {
                                        mo80591ar();
                                    }
                                } else if (this.f235552g.mo85049c(0, 33554432)) {
                                    mo80591ar();
                                }
                            }
                        }
                        C87423k kVar3 = this.f235544T;
                        this.f235544T = null;
                        kVar = kVar3;
                    }
                    if (kVar != null) {
                        this.f235567v.mo78498r(kVar);
                    }
                } else if (ordinal == 48) {
                    C62940bt btVar8 = C88213ti.f238443a;
                    C87741bw bwVar8 = clientEventData.f236955a;
                    C62940bt r118 = C62942bv.checkIsLite(btVar8);
                    bwVar8.mo58887l(r118);
                    Object l5 = bwVar8.f169962ag.mo58854l(r118.f169971d);
                    if (l5 == null) {
                        obj6 = r118.f169969b;
                    } else {
                        obj6 = r118.mo58889c(l5);
                    }
                    C88215tk tkVar = (C88215tk) obj6;
                    VoiceAction voiceAction2 = ((ParcelableVoiceAction) clientEventData.mo81912b(ParcelableVoiceAction.class)).f236008a;
                    int i3 = tkVar.f238447b;
                    boolean z7 = tkVar.f238448c;
                    C58976aa aaVar = C58975e.f156826a;
                    boolean c4 = this.f235552g.mo85049c(0, 4294967296L) | this.f235552g.mo85049c(4, 0);
                    if (mo80806e().mo81202b(!z7, this.f235563r)) {
                        m140911au();
                    }
                    if (z7) {
                        c4 |= m140915ay(2, 3, (C87423k) null);
                        if (voiceAction2 != null) {
                            mo80826z(voiceAction2, i3);
                            mo80815o();
                        }
                    } else {
                        mo80816p();
                    }
                    if (c4) {
                        mo80591ar();
                    }
                } else if (ordinal == 49) {
                    m140910at(((ParcelableVoiceAction) clientEventData.mo81912b(ParcelableVoiceAction.class)).f236008a);
                    mo80591ar();
                } else if (ordinal == 127) {
                    C84809b bVar = this.f235567v;
                    C62940bt btVar9 = C88224tt.f238461a;
                    C87741bw bwVar9 = clientEventData.f236955a;
                    C62940bt r12 = C62942bv.checkIsLite(btVar9);
                    bwVar9.mo58887l(r12);
                    Object l6 = bwVar9.f169962ag.mo58854l(r12.f169971d);
                    if (l6 == null) {
                        obj7 = r12.f169969b;
                    } else {
                        obj7 = r12.mo58889c(l6);
                    }
                    bVar.mo78474B((C88226tv) obj7);
                } else if (ordinal == 128) {
                    this.f235567v.mo78475C((PersonDisambiguation) clientEventData.mo81912b(PersonDisambiguation.class), ((C87052fn) this.f235549d.mo27525b()).f235177m);
                }
            } else {
                ActionData actionData2 = this.f235555j;
                if (actionData2 != null && actionData2.f235997g) {
                    mo80811j();
                } else if (mo80795aa()) {
                    mo80811j();
                    C87052fn fnVar = (C87052fn) this.f235549d.mo27525b();
                    while (fnVar.f235177m.f252770i.isEmpty() && !fnVar.f235182r.isEmpty()) {
                        fnVar.mo80699U(false);
                    }
                    if (!fnVar.f235177m.f252770i.isEmpty()) {
                        fnVar.mo80718x(fnVar.f235177m.mo84497x());
                    }
                } else {
                    mo80777I();
                }
            }
        } else {
            VoiceAction f2 = mo80807f();
            ActionData actionData3 = this.f235555j;
            if (f2 != null && actionData3 != null) {
                C62940bt btVar10 = C87754ci.f237512a;
                C87741bw bwVar10 = clientEventData.f236955a;
                C62940bt r2 = C62942bv.checkIsLite(btVar10);
                bwVar10.mo58887l(r2);
                Object l7 = bwVar10.f169962ag.mo58854l(r2.f169971d);
                if (l7 == null) {
                    obj = r2.f169969b;
                } else {
                    obj = r2.mo58889c(l7);
                }
                C87756ck ckVar = (C87756ck) obj;
                if (ckVar == null) {
                    return;
                }
                if ((1 & ckVar.f237515a) != 0) {
                    C87456t e = f2.mo81064e();
                    if (e != null) {
                        C90875ai.m148465b(new C87104h(this), this.f235567v.mo78490i(actionData3, ckVar, e, ((C87052fn) this.f235549d.mo27525b()).f235177m), this.f235568w, "Handle contact selection").mo85223a(C87132i.f235420a);
                        return;
                    }
                    return;
                }
                C59104x c5 = f235529a.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "ActionState");
                ((C59052c) ((C59052c) c5).mo56372aa(8579)).mo56386p("Event data for the CONTACT_SELECTED_EXTERNALLY event missing expected id.");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        mo80813m(Query.f252741b, (ActionData) null);
        this.f235567v.mo78497q((C87541c) this.f235551f.mo27525b());
    }

    /* renamed from: i */
    public final List mo80810i() {
        if (this.f235556k != null || !this.f235542R.isEmpty()) {
            return this.f235542R;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo80811j() {
        if (mo80778J(false) || m140904aA(this.f235555j)) {
            mo80775G();
            mo80801ai();
            mo80774F();
            mo80591ar();
        }
    }

    /* renamed from: k */
    public final void mo80812k(Query query, ActionData actionData, List list) {
        mo80770B(actionData);
        this.f235554i = query;
        this.f235561p = null;
        this.f235562q = null;
        this.f235556k = list;
        m140913aw((CardDecision) null, true);
        C58976aa aaVar = C58975e.f156826a;
        this.f235552g.mo85057i(true != mo80799af() ? 0 : 131200);
        this.f235552g.mo85049c(0, 4608);
        if (!mo80799af()) {
            this.f235552g.mo85049c(0, 128);
        }
        mo80800ah();
        mo80806e().mo81201a(this.f235555j, mo80807f(), this.f235554i);
        mo80819s();
    }

    /* renamed from: m */
    public final void mo80813m(Query query, ActionData actionData) {
        this.f235552g.mo85057i(128);
        this.f235556k = null;
        m140913aw((CardDecision) null, true);
        this.f235560o.clear();
        this.f235559n = 0;
        mo80770B(actionData);
        this.f235554i = query;
        this.f235561p = null;
        this.f235530A = null;
        this.f235562q = null;
        this.f235544T = null;
        if (actionData != null) {
            if (actionData.mo81098i()) {
                mo80774F();
            }
            mo80818r(actionData, query);
        }
    }

    /* renamed from: n */
    public final void mo80814n(Query query) {
        if (mo80781M(query)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 194;
            String b = C39191a.m68623b(this.f235554i.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }

    /* renamed from: o */
    public final void mo80815o() {
        VoiceAction voiceAction = this.f235543S;
        if (voiceAction == null || !voiceAction.mo81088z() || BitFlags.m148144f(this.f235552g.f253762b, 524288)) {
            voiceAction = null;
        } else {
            voiceAction.mo81058H();
        }
        if (voiceAction != null) {
            C58976aa aaVar = C58975e.f156826a;
            new C90873ag(this.f235567v.mo78488g(voiceAction, ((C87052fn) this.f235549d.mo27525b()).f235177m, C58833ax.m90834k(this)), this.f235568w, "executionResult callback", new C87166u(this, voiceAction)).mo85223a(C87167v.f235522a);
        }
    }

    /* renamed from: p */
    public final void mo80816p() {
        VoiceAction f = mo80807f();
        CardDecision g = mo80808g();
        ClientConfig clientConfig = ((C86812ai) this.f235532F.mo27525b()).f234471a;
        Query query = ((C87052fn) this.f235549d.mo27525b()).f235177m;
        boolean z = false;
        int i = 1;
        boolean z2 = clientConfig.mo81890h() && !mo80786S();
        boolean j = ((C87126hu) this.f235538N.mo27525b()).mo80750j(query);
        if (!((TtsState) this.f235534H.mo27525b()).mo80419t(g) && !((TtsState) this.f235534H.mo27525b()).mo80399A()) {
            z = true;
        }
        if (clientConfig.mo81908x()) {
            return;
        }
        if ((!mo80797ac() && (j || z2)) || z || query.mo84326bK() || clientConfig.f236953f.equals("clockwork")) {
            return;
        }
        if (!query.mo84337bV() && !query.mo84363bw("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN") && ((C84516aa) this.f235537M.mo27525b()).mo78228b()) {
            return;
        }
        if (f == null || !f.mo81051A() || !g.f236255i || g.f236254h) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        ActionData actionData = this.f235555j;
        if (actionData == null) {
            actionData = ActionData.f235991b;
        }
        f.mo81071hx(286, query != null ? Long.valueOf(query.f252749G) : null, g, actionData.f235998h);
        if (m140906aC(actionData)) {
            mo80826z(f, 1);
            mo80823v(f, C87421i.f236079a, 1);
            return;
        }
        if (f.mo81082u() && actionData.mo81095g()) {
            i = 101;
        }
        mo80826z(f, i);
        mo80815o();
    }

    /* renamed from: q */
    public final void mo80817q() {
        PromptSegment e;
        CardDecision cardDecision = this.f235563r;
        if (cardDecision != null && (e = cardDecision.mo81420e(this.f235564s)) != null) {
            String str = e.f236271a;
            ImageInfo imageInfo = e.f236273c;
            if (!TextUtils.isEmpty(str) || !ImageInfo.m141972a(imageInfo)) {
                ActionData actionData = this.f235555j;
                String str2 = actionData != null ? actionData.f236000j : null;
                VoiceAction f = mo80807f();
                boolean z = false;
                if (mo80785R() && f != null && (f.mo81084w() || f.mo81083v())) {
                    z = true;
                }
                new C90873ag(this.f235567v.mo78486e(e, str2, z), this.f235568w, "Create ShowDisplaySegmentEventData", new C86785a(this)).mo85223a(C87157l.f235508a);
            }
            if (!TtsRequest.m141979c(e.f236272b)) {
                this.f235552g.mo85049c(0, 256);
            }
        }
    }

    /* renamed from: r */
    public final void mo80818r(ActionData actionData, Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f235545U;
        if ((cxVar == null || cxVar.isDone()) && !actionData.mo81098i() && !m140908ae(actionData, this.f235554i)) {
            mo80814n(query);
            if (!query.mo84435dP() || query.mo84422dC()) {
                C84809b bVar = this.f235567v;
                C86982dh dhVar = (C86982dh) this.f235535I.mo27525b();
                PlaybackStatus playbackStatus = dhVar.f234934e;
                dhVar.f234934e = null;
                C60870cx k = bVar.mo78492k(query, actionData, playbackStatus, this.f235541Q, this.f235540P);
                new C90873ag(k, this.f235568w, "Handle action", new C87162q(this, query, actionData)).mo85223a(C87163r.f235516a);
                this.f235545U = C118826c.m197213c(k);
                return;
            }
            C84809b bVar2 = this.f235567v;
            C86982dh dhVar2 = (C86982dh) this.f235535I.mo27525b();
            PlaybackStatus playbackStatus2 = dhVar2.f234934e;
            dhVar2.f234934e = null;
            this.f235545U = bVar2.mo78493l(query, actionData, playbackStatus2, this.f235541Q, this.f235540P);
        }
    }

    /* renamed from: s */
    public final void mo80819s() {
        VoiceAction f = mo80807f();
        if (f != null && f.mo81082u() && !mo80789V()) {
            List ac = ((ModularAction) f).mo81223ac();
            if (!ac.isEmpty()) {
                Argument argument = (Argument) ac.get(0);
                if (this.f235552g.mo85049c(0, 4194304)) {
                    mo80591ar();
                }
                C90875ai.m148465b(new C86830b(this, argument), this.f235567v.mo78494m(argument), this.f235568w, "On top argument in ModularAction processed").mo85223a(C86858c.f234580a);
            }
        }
    }

    /* renamed from: t */
    public final void mo80820t() {
        CardDecision cardDecision;
        ClientConfig clientConfig = ((C86812ai) this.f235532F.mo27525b()).f234471a;
        C87052fn fnVar = (C87052fn) this.f235549d.mo27525b();
        if (this.f235554i.mo84361bt() && mo80808g().f236254h) {
            if ((mo80785R() || (cardDecision = this.f235563r) == null || cardDecision.f236266t.isEmpty()) && !fnVar.mo80688F() && this.f235554i.mo84383cP(fnVar.f235177m)) {
                C58976aa aaVar = C58975e.f156826a;
                if (this.f235554i.mo84430dK()) {
                    ((C87042fd) this.f235536L.mo27525b()).mo80669m(this.f235554i);
                }
                if (clientConfig.mo81909y()) {
                    this.f235562q = this.f235554i;
                    return;
                }
                ActionData actionData = this.f235555j;
                if (actionData != null) {
                    m140916az(actionData, this.f235554i.mo84292ad());
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Action{");
        int identityHashCode = System.identityHashCode(this);
        sb.append("Identity=" + identityHashCode + " ");
        sb.append(" Flags=");
        sb.append(this.f235552g.mo85048b());
        sb.append(" ActionDataQuery=");
        Query query = this.f235554i;
        sb.append(query.mo84360bs(query.f252768g));
        sb.append(" ExtraCards=");
        sb.append(this.f235539O.toString());
        sb.append(" ");
        ActionData actionData = this.f235555j;
        sb.append(actionData == null ? "null data" : actionData.toString());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void mo80822u(VoiceAction voiceAction, C87423k kVar, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        C58976aa aaVar = C58975e.f156826a;
        boolean z4 = false;
        if (z2 && voiceAction != null) {
            List list = this.f235556k;
            if (list == null || list.isEmpty()) {
                arrayList = C58597ky.m90212c(voiceAction);
            } else {
                arrayList = C58597ky.m90211b(this.f235556k);
                arrayList.set(0, voiceAction);
            }
            ActionData actionData = this.f235555j;
            if (actionData != null) {
                z4 = m140905aB(actionData, arrayList);
            }
        }
        if (z3) {
            z4 |= m140915ay(2, 3, kVar);
        }
        if (voiceAction != null && z) {
            mo80769A(voiceAction);
        }
        if (z4) {
            mo80591ar();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80823v(com.google.android.apps.gsa.search.shared.actions.VoiceAction r8, com.google.android.apps.gsa.search.shared.actions.C87421i r9, int r10) {
        /*
            r7 = this;
            com.google.android.apps.gsa.shared.util.BitFlags r0 = r7.f235552g
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            r3 = 0
            r0.mo85049c(r1, r3)
            com.google.android.apps.gsa.search.core.al.b.b r0 = r7.f235567v
            r0.mo78505y(r9)
            com.google.android.apps.gsa.search.core.al.b.b r0 = r7.f235567v
            r0.mo78473A()
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r7.f235543S
            if (r0 == r8) goto L_0x002f
            com.google.common.f.e r8 = f235529a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = "ActionState"
            r8.mo56378ag(r9, r10)
            java.lang.String r9 = "#onExecutionError for unrecognized action."
            r10 = 8613(0x21a5, float:1.207E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
            return
        L_0x002f:
            boolean r8 = r9.mo81197b()
            r1 = 2
            if (r8 == 0) goto L_0x003f
            r8 = 106(0x6a, float:1.49E-43)
            if (r10 == r8) goto L_0x003d
            r8 = 105(0x69, float:1.47E-43)
            goto L_0x0055
        L_0x003d:
            r10 = 106(0x6a, float:1.49E-43)
        L_0x003f:
            boolean r8 = r9.mo81199d()
            if (r8 == 0) goto L_0x0048
            r8 = 103(0x67, float:1.44E-43)
            goto L_0x0055
        L_0x0048:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r8 = r0.mo81065f()
            boolean r8 = r8.mo81438h()
            if (r8 == 0) goto L_0x0054
            r8 = 2
            goto L_0x0055
        L_0x0054:
            r8 = r10
        L_0x0055:
            r0.mo81072hy()
            r10 = 1
            if (r8 == r1) goto L_0x00c6
            switch(r8) {
                case 102: goto L_0x00c2;
                case 103: goto L_0x00c6;
                case 104: goto L_0x00be;
                case 105: goto L_0x00ba;
                case 106: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x00b2
        L_0x005f:
            boolean r2 = r0.mo81082u()
            if (r2 == 0) goto L_0x00b2
            r2 = r0
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r2 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r2
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r5 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r5 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r5
            com.google.bb.a.ln r5 = r5.mo81239b()
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r6 = r2.f235985a
            boolean r6 = r6.mo81118g()
            if (r6 != 0) goto L_0x0080
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r6 = r2.f235985a
            boolean r6 = r6.mo81117f()
            if (r6 == 0) goto L_0x00c9
        L_0x0080:
            if (r5 == 0) goto L_0x0099
            boolean r6 = r9.mo81198c()
            if (r6 == 0) goto L_0x0099
            int r6 = r5.f145509a
            r6 = r6 & r10
            if (r6 == 0) goto L_0x0099
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r1 = r2.f235985a
            com.google.bb.a.le r2 = r5.f145511c
            if (r2 != 0) goto L_0x0095
            com.google.bb.a.le r2 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x0095:
            r1.mo81112b(r2)
            goto L_0x00c9
        L_0x0099:
            if (r5 == 0) goto L_0x00b2
            boolean r6 = r9.mo81197b()
            if (r6 == 0) goto L_0x00b2
            int r6 = r5.f145509a
            r1 = r1 & r6
            if (r1 == 0) goto L_0x00b2
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r1 = r2.f235985a
            com.google.bb.a.le r2 = r5.f145512d
            if (r2 != 0) goto L_0x00ae
            com.google.bb.a.le r2 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x00ae:
            r1.mo81112b(r2)
            goto L_0x00c9
        L_0x00b2:
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r1 = r7.f235543S
            if (r1 == 0) goto L_0x00c9
            r1.mo81057G()
            goto L_0x00c9
        L_0x00ba:
            r0.mo81059I()
            goto L_0x00c9
        L_0x00be:
            r0.mo81055E()
            goto L_0x00c9
        L_0x00c2:
            r0.mo81057G()
            goto L_0x00c9
        L_0x00c6:
            r0.mo81061K()
        L_0x00c9:
            r1 = 0
            r7.f235543S = r1
            r7.mo80775G()
            r1 = 0
            r7.mo80802aj(r1)
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r7.f235552g
            r5 = 8
            r1.mo85049c(r3, r5)
            r7.mo80774F()
            boolean r9 = r9.mo81198c()
            if (r9 == 0) goto L_0x0102
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = r7.f235555j
            if (r9 == 0) goto L_0x0102
            boolean r9 = r9.mo81095g()
            if (r9 != 0) goto L_0x0102
            com.google.android.apps.gsa.shared.search.Query r9 = r7.f235554i
            boolean r9 = r9.mo84403cj()
            if (r9 != 0) goto L_0x0102
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r9 = r7.mo80807f()
            if (r9 != r0) goto L_0x0102
            com.google.android.apps.gsa.shared.util.BitFlags r9 = r7.f235552g
            r0 = 8192(0x2000, double:4.0474E-320)
            r9.mo85049c(r3, r0)
        L_0x0102:
            if (r8 == r10) goto L_0x0108
            r9 = 101(0x65, float:1.42E-43)
            if (r8 != r9) goto L_0x010a
        L_0x0108:
            r7.f235558m = r10
        L_0x010a:
            r7.mo80591ar()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87171z.mo80823v(com.google.android.apps.gsa.search.shared.actions.VoiceAction, com.google.android.apps.gsa.search.shared.actions.i, int):void");
    }

    /* renamed from: x */
    public final void mo80824x() {
        C84809b bVar = this.f235567v;
        C88208td tdVar = (C88208td) C88209te.f238431e.createBuilder();
        tdVar.copyOnWrite();
        C88209te teVar = (C88209te) tdVar.instance;
        teVar.f238433a |= 1;
        teVar.f238434b = 3;
        bVar.mo78478F((C88209te) tdVar.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo80825y(int i, int i2, C87423k kVar) {
        if (m140915ay(i, i2, kVar)) {
            mo80591ar();
        }
    }

    /* renamed from: z */
    public final void mo80826z(VoiceAction voiceAction, int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f235544T = null;
        if (this.f235543S != null) {
            C59104x d = f235529a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ActionState");
            ((C59052c) ((C59052c) d).mo56372aa(8618)).mo56386p("requestActionToBeExecuted called when an action is already executing, return.");
        } else if (voiceAction.mo81086x() || voiceAction.mo81088z()) {
            C59104x d2 = f235529a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ActionState");
            ((C59052c) ((C59052c) d2).mo56372aa(8617)).mo56386p("requestActionToBeExecuted called on an already executing action.");
        } else {
            this.f235543S = voiceAction;
            voiceAction.mo81060J(i);
        }
    }

    /* renamed from: ai */
    public final void mo80801ai() {
        List list;
        ActionData actionData = this.f235555j;
        if (actionData == null || (!actionData.mo81098i() && ((list = this.f235556k) == null || (!list.isEmpty() && (!mo80783P(this.f235555j) || this.f235563r == null))))) {
            this.f235552g.mo85049c(2, 0);
            return;
        }
        this.f235552g.mo85049c(0, 2);
        ActionData actionData2 = this.f235555j;
        Query query = ((C87052fn) this.f235549d.mo27525b()).f235177m;
        if (query != null && actionData2 != null && mo80798ad()) {
            this.f235567v.mo78503w(query, actionData2, mo80807f(), mo80808g(), (C87541c) this.f235551f.mo27525b(), (C84773a) this.f235547b.mo27525b());
        }
    }
}
