package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6983ah.C89147d;
import com.google.android.apps.gsa.shared.p6983ah.C89150g;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90042cu;
import com.google.android.apps.gsa.shared.p7066m.C90046cy;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108204ab;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108236bg;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108436iq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108453jg;
import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.C109291b;
import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.ChatUiHelpController;
import com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106062r;
import com.google.android.apps.gsa.staticplugins.opa.p8311aw.C107623a;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107659as;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113916t;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110014a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8566n.C112986b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8566n.C112987c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.apps.gsa.staticplugins.opa.util.C113793bi;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.util.C113869cx;
import com.google.android.apps.gsa.staticplugins.opa.util.C113892w;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.android.libraries.gsa.conversation.p1855h.C22717u;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19629c;
import com.google.assistant.p3897e.p3898a.C50865a;
import com.google.assistant.p3897e.p3898a.C50869e;
import com.google.assistant.p3897e.p3898a.C50870f;
import com.google.assistant.p3897e.p3899b.p3901b.C50890q;
import com.google.assistant.p3897e.p3899b.p3901b.C50891r;
import com.google.assistant.p3897e.p3902c.p3907c.C51073fj;
import com.google.assistant.p3897e.p3902c.p3907c.C51075fl;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52340oc;
import com.google.assistant.p3897e.p3921j.C52353op;
import com.google.assistant.p3897e.p3921j.p3926e.C51865bz;
import com.google.assistant.p3897e.p3921j.p3926e.C51874ch;
import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.assistant.p3897e.p3921j.p3926e.C51893d;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.assistant.p3897e.p3921j.p3926e.C51994gt;
import com.google.assistant.p3897e.p3921j.p3926e.C52032id;
import com.google.assistant.p3897e.p3921j.p3926e.C52036ih;
import com.google.assistant.p3897e.p3921j.p3926e.C52040il;
import com.google.assistant.p3897e.p3921j.p3926e.C52042in;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62971cq;
import dagger.p5294a.C68221g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.o */
/* compiled from: PG */
public final class C109753o implements C113892w {

    /* renamed from: d */
    private static final C59071e f305772d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.o");

    /* renamed from: a */
    public final C109040fj f305773a;

    /* renamed from: b */
    public final C107698i f305774b;

    /* renamed from: c */
    public final C108436iq f305775c;

    /* renamed from: e */
    private final Context f305776e;

    /* renamed from: f */
    private final ViewGroup f305777f;

    /* renamed from: g */
    private final String f305778g;

    /* renamed from: h */
    private final C86124t f305779h;

    /* renamed from: i */
    private final C22871g f305780i;

    /* renamed from: j */
    private final C109042fl f305781j;

    /* renamed from: k */
    private final C108230ba f305782k;

    /* renamed from: l */
    private final C109065gb f305783l;

    /* renamed from: m */
    private final C108303dt f305784m;

    /* renamed from: n */
    private final C107623a f305785n;

    /* renamed from: o */
    private final C107659as f305786o;

    /* renamed from: p */
    private final SharedPreferences f305787p;

    /* renamed from: q */
    private final C109738nl f305788q;

    /* renamed from: r */
    private final boolean f305789r;

    /* renamed from: s */
    private final C106062r f305790s;

    /* renamed from: t */
    private final C113916t f305791t;

    /* renamed from: u */
    private final C113793bi f305792u;

    /* renamed from: v */
    private final C89150g f305793v;

    /* renamed from: w */
    private final C108429ij f305794w;

    public C109753o(C109040fj fjVar, Context context, ViewGroup viewGroup, String str, C86124t tVar, C22871g gVar, C109042fl flVar, C108230ba baVar, C107698i iVar, C109065gb gbVar, C108436iq iqVar, C108303dt dtVar, C107623a aVar, C107659as asVar, SharedPreferences sharedPreferences, C109738nl nlVar, boolean z, C106062r rVar, C113916t tVar2, C113793bi biVar, C89150g gVar2, C108429ij ijVar) {
        this.f305773a = fjVar;
        this.f305776e = context;
        this.f305777f = viewGroup;
        this.f305778g = str;
        this.f305779h = tVar;
        this.f305780i = gVar;
        this.f305781j = flVar;
        this.f305782k = baVar;
        this.f305774b = iVar;
        this.f305783l = gbVar;
        this.f305775c = iqVar;
        this.f305784m = dtVar;
        this.f305785n = aVar;
        this.f305786o = asVar;
        this.f305787p = sharedPreferences;
        this.f305788q = nlVar;
        this.f305789r = z;
        this.f305790s = rVar;
        this.f305791t = tVar2;
        this.f305792u = biVar;
        this.f305793v = gVar2;
        this.f305794w = ijVar;
    }

    /* renamed from: A */
    public final void mo98066A(long j) {
        if (j > 0) {
            C58976aa aaVar = C58975e.f156826a;
            this.f305773a.mo97507bQ();
            C108303dt dtVar = this.f305784m;
            if (dtVar != null) {
                dtVar.mo96757t(j);
                return;
            }
            return;
        }
        C108303dt dtVar2 = this.f305784m;
        if (dtVar2 != null && dtVar2.mo96742c() > 0) {
            this.f305784m.mo96742c();
            C58976aa aaVar2 = C58975e.f156826a;
            this.f305773a.mo97507bQ();
        }
    }

    /* renamed from: B */
    public final void mo98067B() {
        C109040fj fjVar = this.f305773a;
        C58976aa aaVar = C58975e.f156826a;
        fjVar.f303295bB = true;
    }

    /* renamed from: C */
    public final void mo98068C(int i, byte[] bArr, C22869e eVar) {
        if (!this.f305773a.f303284ar) {
            C59104x c = f305772d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AnswerRendererCallback");
            ((C59052c) ((C59052c) c).mo56372aa(22573)).mo56386p("#onWaitForDeviceAuthenticationReceived: not triggered from lockscreen");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C109040fj fjVar = this.f305773a;
        fjVar.f303340bu = bArr;
        if (!fjVar.f303245aE) {
            if (fjVar.mo97519bk()) {
                this.f305773a.mo97505bO(false, i, eVar);
                return;
            }
            if (this.f305773a.mo97524bq()) {
                this.f305773a.mo97505bO(true, i, eVar);
            }
            this.f305782k.mo95415az();
            this.f305773a.mo97440aB();
        }
    }

    /* renamed from: a */
    public final C60870cx mo98069a(C51885cs csVar, String str) {
        C60870cx cxVar = C60866ct.f164955a;
        if (!this.f305790s.mo95240v()) {
            C109722n nVar = new C109722n(this, csVar);
            C109262i iVar = new C109262i(this);
            C106062r rVar = this.f305790s;
            C109040fj fjVar = this.f305773a;
            cxVar = rVar.mo95223e(csVar, fjVar.f303289aw, str, nVar, iVar, new C109011ex(fjVar), fjVar.f303309bP);
            ((FrameLayout) this.f305782k.mo95419h().findViewById(R.id.immersive_view_container)).addView((View) this.f305790s.mo95221c().mo56107c(), 0, new ViewGroup.LayoutParams(-1, -1));
            C58833ax b = this.f305790s.mo95220b();
            if (b.mo56113h()) {
                ((C108436iq) b.mo56107c()).mo95252d().setOnClickListener(new C109304j(this, csVar));
            }
            this.f305773a.mo97510bb(true, true);
        } else {
            C51874ch chVar = csVar.f136097p;
            if (chVar == null) {
                chVar = C51874ch.f136059d;
            }
            if (!chVar.f136061a.isEmpty()) {
                C106062r rVar2 = this.f305790s;
                C51874ch chVar2 = csVar.f136097p;
                if (chVar2 == null) {
                    chVar2 = C51874ch.f136059d;
                }
                rVar2.mo95231m(chVar2);
            } else {
                if (this.f305790s.mo95239u()) {
                    this.f305790s.mo95237s();
                    this.f305773a.mo97510bb(true, true);
                }
                cxVar = this.f305790s.mo95222d(csVar);
            }
        }
        int a = C51865bz.m86402a(csVar.f136092k);
        if (a != 0 && a == 3) {
            this.f305788q.mo98058b(TimeUnit.MINUTES.toMillis(1), TimeUnit.MINUTES.toMillis(this.f305779h.mo79743a(C90046cy.f248754a)));
        } else {
            long a2 = this.f305779h.mo79743a(C90014bt.f247408gb);
            this.f305788q.mo98058b(a2, a2);
        }
        C60870cx g = C60922j.m93044g(cxVar, C109336k.f304557a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: b */
    public final void mo98070b() {
        C109040fj fjVar = this.f305773a;
        if (fjVar.f303295bB && !fjVar.f303278al) {
            double m = fjVar.f303455t.mo79747m(C90014bt.f247076aN);
            double e = (double) fjVar.mo97533e();
            Double.isNaN(e);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{fjVar.f303450o.mo95420i().getLayoutParams().height, Math.max((int) (m * e), fjVar.f303234T.mo95357c())});
            ofInt.addUpdateListener(new C108111bw(fjVar));
            ofInt.addListener(new C108786dt(fjVar));
            ofInt.setDuration(200);
            ofInt.setInterpolator(fjVar.f303241aA);
            fjVar.f303277ak = ofInt;
            fjVar.f303277ak.start();
            fjVar.f303278al = true;
            fjVar.mo97490az(false);
            C110014a aVar = fjVar.f303265aY;
            if (aVar != null) {
                aVar.mo98291a();
            }
        }
    }

    /* renamed from: c */
    public final void mo98071c() {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        C109040fj fjVar = this.f305773a;
        fjVar.f303300bG = false;
        this.f305793v.mo83140n(fjVar.mo97523bp());
        if (this.f305789r) {
            this.f305781j.mo95151b();
            return;
        }
        C109040fj fjVar2 = this.f305773a;
        if (!fjVar2.f303299bF && ((!C109040fj.m181378bx(fjVar2.f303450o) || !((C113989h) ((C113988g) fjVar2.f303450o).mo100833bf().mo56107c()).mo100910dn()) && ((SharedPreferences) fjVar2.f303251aK.mo27525b()).getInt("opa_deferred_match_post_query_chip_tap_count", 0) < 5 && fjVar2.f303275ai == C109026ey.MODE_CONVERSATION && fjVar2.f303393cy.f315214a.equals("and.opa.untrained.hotword"))) {
            C108262cf cfVar = new C108262cf(1, 4);
            C108453jg jgVar = new C108453jg(fjVar2.f303456u, fjVar2.f303251aK);
            cfVar.f301174d = fjVar2.mo97534f().getString(R.string.opa_voice_match_promo_button_message);
            jgVar.f301668a = fjVar2.mo97534f().getString(R.string.opa_voice_match_promo_button_text);
            fjVar2.f303450o.mo95430s(cfVar);
            fjVar2.f303450o.mo95430s(jgVar);
            fjVar2.f303299bF = true;
        }
        if (this.f305773a.mo97529bw() && C109040fj.m181378bx(this.f305782k)) {
            ((C113989h) ((C113988g) this.f305782k).mo100833bf().mo56107c()).mo100863bp(true);
        }
        C109040fj fjVar3 = this.f305773a;
        if (!((C113191cv) fjVar3.f303380cl.mo27525b()).mo99907c() || !fjVar3.f303238X.mo96174az()) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = fjVar3.f303448m.mo28209i(C60922j.m93044g(((C112987c) fjVar3.f303381cm.mo27525b()).f313112a.mo46042d(), C112986b.f313111a, C60826bg.f164896a), "maybeShowTapasPromo", new C108091bk(fjVar3));
        }
        new C90873ag(cxVar, fjVar3.f303448m, "maybeShowTapasPromo", new C107972be(fjVar3)).mo85223a(new C108104bp(fjVar3));
    }

    /* renamed from: d */
    public final void mo98072d(C52042in inVar) {
        int i = inVar.f136594a;
        if (i == 2) {
            C52040il ilVar = (C52040il) inVar.f136595b;
            if (!ilVar.f136588b.isEmpty()) {
                if (this.f305775c.mo95254f() != null) {
                    View f = this.f305775c.mo95254f();
                    f.getClass();
                    f.setVisibility(8);
                }
                String str = ilVar.f136588b;
                C62971cq cqVar = ilVar.f136589c;
                C109040fj fjVar = this.f305773a;
                C50865a aVar = (C50865a) C50870f.f132446g.createBuilder();
                aVar.copyOnWrite();
                C50870f fVar = (C50870f) aVar.instance;
                fVar.f132452e = 1;
                fVar.f132448a |= 4;
                aVar.copyOnWrite();
                C50870f fVar2 = (C50870f) aVar.instance;
                str.getClass();
                fVar2.f132448a = 1 | fVar2.f132448a;
                fVar2.f132449b = str;
                fjVar.f303289aw = (C50870f) aVar.build();
                if ((2 & ilVar.f136587a) != 0) {
                    this.f305775c.mo95252d().setOnClickListener(new C109454m(this, ilVar));
                } else {
                    this.f305775c.mo95252d().setVisibility(8);
                }
                this.f305773a.mo97466ab(str, cqVar);
            }
        } else if (i == 3) {
            this.f305773a.mo97484at();
        }
    }

    /* renamed from: e */
    public final void mo98073e() {
        this.f305782k.mo95365G();
    }

    /* renamed from: f */
    public final void mo98074f(String str) {
        if (this.f305779h.mo79746e(C90029ch.f248221aH) && C109040fj.m181378bx(this.f305782k)) {
            ((C113989h) this.f305782k).mo100857bY();
        }
        QueryTriggerType queryTriggerType = QueryTriggerType.OPA_FEEDBACK_SURVEY;
        Bundle bundle = new Bundle();
        bundle.putInt("android.opa.extra.CLIENT_MODALITY", this.f305786o.mo96177e());
        bundle.putInt("android.opa.extra.TRIGGERED_BY", QueryTriggerType.OPA_PROACTIVE_NOTIFICATION.ordinal());
        this.f305773a.mo97501bK(str, queryTriggerType, bundle, BuildConfig.FLAVOR, (C51994gt) null, false);
    }

    /* renamed from: g */
    public final void mo98075g() {
        this.f305782k.mo95365G();
    }

    /* renamed from: h */
    public final void mo98076h(C51885cs csVar, String str) {
        this.f305788q.mo98057a();
        this.f305773a.mo97417E(csVar.f136093l);
        this.f305773a.mo97485au();
        this.f305773a.mo97510bb(false, true);
        if (!C58837ba.m90859h(str)) {
            C108262cf cfVar = new C108262cf();
            C109040fj fjVar = this.f305773a;
            C50870f fVar = fjVar.f303289aw;
            if (fVar != null) {
                cfVar.f301045a = fVar.f132450c;
                cfVar.f301046b = (C91189au) fjVar.f303288av.mo27525b();
            }
            cfVar.f301174d = str;
            this.f305782k.mo95430s(cfVar);
            this.f305782k.mo95411av();
        }
    }

    /* renamed from: i */
    public final void mo98077i() {
        this.f305788q.mo98057a();
        if (this.f305790s.mo95240v()) {
            this.f305773a.mo97510bb(false, true);
            this.f305782k.mo95383Y(false);
            this.f305782k.mo95382X(false);
        }
    }

    /* renamed from: j */
    public final void mo98078j() {
        if (this.f305790s.mo95240v() && !this.f305790s.mo95239u()) {
            this.f305790s.mo95234p();
            this.f305773a.mo97510bb(false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = (com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107383g) r5.f305773a.f303319bZ.mo56107c();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98079k(android.view.View r6) {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r5.f305773a
            boolean r0 = r0.mo97527bu()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r5.f305773a
            com.google.common.base.ax r0 = r0.f303319bZ
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.aq.g r0 = (com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107383g) r0
            com.google.android.apps.gsa.staticplugins.opa.aq.f r1 = r0.mo95997a()
            com.google.android.apps.gsa.staticplugins.opa.aq.f r2 = com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107382f.DISMISSED
            if (r1 == r2) goto L_0x009a
            com.google.android.apps.gsa.staticplugins.opa.aq.f r2 = com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107382f.DISMISSING
            if (r1 != r2) goto L_0x0021
            goto L_0x009a
        L_0x0021:
            com.google.android.apps.gsa.staticplugins.opa.ui.ThinkingIndicator r1 = r0.f298867d
            r1.mo100564c()
            com.google.android.apps.gsa.staticplugins.opa.ui.ThinkingIndicator r1 = r0.f298867d
            r2 = 8
            r1.setVisibility(r2)
            android.view.ViewGroup r1 = r0.f298866c
            r2 = 2131436681(0x7f0b2489, float:1.849524E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = r0.f298870g
            android.accounts.Account r2 = r2.mo79668a()
            if (r2 == 0) goto L_0x0052
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r3 = r0.f298869f
            boolean r3 = r3.mo98131m(r2)
            if (r3 != 0) goto L_0x0052
            r0.mo95998b(r1)
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r1 = r0.f298869f
            r3 = 3
            r1.mo98129k(r2, r3)
            goto L_0x0070
        L_0x0052:
            if (r2 != 0) goto L_0x0070
            android.content.SharedPreferences r2 = r0.f298868e
            r3 = 0
            java.lang.String r4 = "opa_has_shown_tos_and_pp"
            boolean r2 = r2.getBoolean(r4, r3)
            if (r2 != 0) goto L_0x0070
            r0.mo95998b(r1)
            android.content.SharedPreferences r1 = r0.f298868e
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r4, r2)
            r1.apply()
        L_0x0070:
            android.view.ViewGroup r1 = r0.f298866c
            r2 = 2131435520(0x7f0b2000, float:1.8492884E38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.ViewParent r2 = r6.getParent()
            if (r2 == 0) goto L_0x008a
            android.view.ViewParent r2 = r6.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.removeView(r6)
        L_0x008a:
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r1.addView(r6, r2)
            androidx.lifecycle.ag r6 = r0.f298871h
            com.google.android.apps.gsa.staticplugins.opa.aq.f r0 = com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107382f.RENDERED
            r6.mo5708l(r0)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109753o.mo98079k(android.view.View):void");
    }

    /* renamed from: l */
    public final void mo98080l() {
        this.f305773a.mo97543p(BuildConfig.FLAVOR, false, true);
    }

    /* renamed from: m */
    public final void mo98081m(long j, String str, String str2, String str3) {
        C58976aa aaVar = C58975e.f156826a;
        this.f305773a.f303244aD = true;
        this.f305782k.mo95368J(j, str, str3);
        this.f305773a.mo97479ao(j);
        if (str2 != null) {
            this.f305787p.edit().putString("opa_auto_trigger_url_".concat(String.valueOf(this.f305778g)), str2).putInt("opa_auto_trigger_url_attempt_count_".concat(String.valueOf(this.f305778g)), 1).apply();
            this.f305780i.mo28213m("Fire auto trigger intent", 400, new C109364l(this, str2));
        }
    }

    /* renamed from: n */
    public final void mo98082n(long j) {
        this.f305773a.f303297bD = true;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f305779h.mo79746e(C90014bt.f247206cl) && C109040fj.m181378bx(this.f305782k)) {
            ((C113989h) ((C113988g) this.f305782k).mo100833bf().mo56107c()).mo100869bx();
        }
        this.f305782k.mo95389aE();
        C109040fj fjVar = this.f305773a;
        if (!fjVar.f303455t.mo79746e(C90037cp.f248561cj)) {
            fjVar.mo97486av();
        }
        fjVar.f303304bK = true;
        fjVar.f303238X.mo96171aw(false);
        if (fjVar.f303262aV.mo95240v()) {
            fjVar.f303262aV.mo95235q();
            C58833ax axVar = fjVar.f303320ba.f315395e;
            if (axVar != null && axVar.mo56113h()) {
                Query query = (Query) axVar.mo56107c();
                if (query.mo84392cY()) {
                    fjVar.f303383co = query.f252768g;
                }
            }
        } else {
            fjVar.f303383co = BuildConfig.FLAVOR;
        }
        if (!fjVar.f303259aS && fjVar.f303455t.mo79746e(C90014bt.f247625kg)) {
            fjVar.f303444i.mo95154e();
        }
        if (fjVar.f303371cc) {
            fjVar.f303376ch.mo83145s(C58833ax.m90834k(Long.valueOf(j)), 4);
        }
    }

    /* renamed from: o */
    public final void mo98083o(long j, C52340oc ocVar) {
        if (this.f305779h.mo79746e(C90014bt.f247180cL) && ocVar != null) {
            C109040fj fjVar = this.f305773a;
            Long valueOf = Long.valueOf(j);
            C109291b bVar = fjVar.f303461z;
            C108516cw cwVar = new C108516cw(fjVar);
            C58833ax axVar = (C58833ax) bVar.f304461a.mo17428b();
            axVar.getClass();
            C0167am amVar = (C0167am) ((C68221g) bVar.f304462b).f184583a;
            amVar.getClass();
            SharedPreferences sharedPreferences = (SharedPreferences) bVar.f304463c.mo17428b();
            sharedPreferences.getClass();
            C113863cr crVar = (C113863cr) bVar.f304464d.mo17428b();
            crVar.getClass();
            C107698i iVar = (C107698i) bVar.f304465e.mo17428b();
            iVar.getClass();
            C113869cx cxVar = (C113869cx) bVar.f304466f.mo17428b();
            cxVar.getClass();
            fjVar.f303460y = new ChatUiHelpController(axVar, amVar, sharedPreferences, crVar, iVar, cxVar, cwVar, ocVar);
            ChatUiHelpController chatUiHelpController = fjVar.f303460y;
            chatUiHelpController.f304453n = valueOf.longValue();
            chatUiHelpController.f304450k = 0;
            chatUiHelpController.f304449j = chatUiHelpController.mo97748d();
            chatUiHelpController.mo97746b();
        }
    }

    /* renamed from: p */
    public final void mo98084p(C51986gl glVar) {
        if (!this.f305790s.mo95240v()) {
            C59104x d = f305772d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AnswerRendererCallback");
            ((C59052c) ((C59052c) d).mo56372aa(22569)).mo56386p("Show suggestion chips on immersive failed because the controller is not available");
            return;
        }
        this.f305790s.mo95225g();
        this.f305790s.mo95224f(this.f305794w.mo96872b(glVar, e.A, Optional.empty()));
    }

    /* renamed from: q */
    public final void mo98085q() {
        C108303dt dtVar = this.f305784m;
        if (dtVar != null) {
            dtVar.mo96757t(0);
        }
        this.f305782k.mo95434w(512);
    }

    /* renamed from: r */
    public final void mo98086r(C52032id idVar) {
        C109040fj fjVar = this.f305773a;
        fjVar.f303309bP = fjVar.f303249aI;
        fjVar.mo97445aG(fjVar.f303309bP);
        this.f305773a.mo97485au();
        if (!idVar.f136566a.isEmpty()) {
            this.f305782k.mo95430s(new C108204ab(idVar.f136566a, this.f305783l));
        }
        if (this.f305790s.mo95240v()) {
            this.f305773a.mo97510bb(false, true);
        }
    }

    /* renamed from: s */
    public final void mo98087s(C50870f fVar, boolean z) {
        int a;
        if (fVar != null) {
            this.f305773a.f303289aw = fVar;
        }
        if (fVar == null || (fVar.f132448a & 4) == 0 || ((a = C50869e.m85974a(fVar.f132452e)) != 0 && a == 1)) {
            this.f305773a.mo97485au();
            this.f305773a.f303289aw = null;
            return;
        }
        this.f305773a.mo97467ac();
        int a2 = C50869e.m85974a(fVar.f132452e);
        if (a2 == 0 || a2 != 3 || this.f305775c.mo95249a() != 0) {
            return;
        }
        if (!z || this.f305786o.mo96177e() == 1) {
            this.f305773a.mo97485au();
            return;
        }
        this.f305782k.mo95415az();
        this.f305775c.mo95252d().setOnClickListener(new C108112bx(this.f305773a));
    }

    /* renamed from: t */
    public final void mo98088t(C52036ih ihVar, boolean z) {
        C51075fl flVar;
        C51075fl flVar2;
        C51075fl flVar3;
        List list;
        C109040fj fjVar = this.f305773a;
        if (fjVar.f303390cv != 2) {
            C50865a aVar = (C50865a) C50870f.f132446g.createBuilder();
            aVar.copyOnWrite();
            C50870f fVar = (C50870f) aVar.instance;
            fVar.f132452e = 1;
            fVar.f132448a |= 4;
            C51098gh ghVar = ihVar.f136578c;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b == 3) {
                flVar = (C51075fl) ghVar.f133013c;
            } else {
                flVar = C51075fl.f132982e;
            }
            String str = flVar.f132986c;
            aVar.copyOnWrite();
            C50870f fVar2 = (C50870f) aVar.instance;
            str.getClass();
            fVar2.f132448a = 1 | fVar2.f132448a;
            fVar2.f132449b = str;
            C51098gh ghVar2 = ihVar.f136578c;
            if (ghVar2 == null) {
                ghVar2 = C51098gh.f133009e;
            }
            if (ghVar2.f133012b == 3) {
                flVar2 = (C51075fl) ghVar2.f133013c;
            } else {
                flVar2 = C51075fl.f132982e;
            }
            String str2 = flVar2.f132985b;
            aVar.copyOnWrite();
            C50870f fVar3 = (C50870f) aVar.instance;
            str2.getClass();
            fVar3.f132448a = 2 | fVar3.f132448a;
            fVar3.f132450c = str2;
            C51098gh ghVar3 = ihVar.f136578c;
            if (ghVar3 == null) {
                ghVar3 = C51098gh.f133009e;
            }
            if (ghVar3.f133012b == 3) {
                flVar3 = (C51075fl) ghVar3.f133013c;
            } else {
                flVar3 = C51075fl.f132982e;
            }
            C51073fj fjVar2 = flVar3.f132987d;
            if (fjVar2 == null) {
                fjVar2 = C51073fj.f132977d;
            }
            aVar.copyOnWrite();
            C50870f fVar4 = (C50870f) aVar.instance;
            fjVar2.getClass();
            fVar4.f132453f = fjVar2;
            fVar4.f132448a |= 8;
            this.f305773a.f303289aw = (C50870f) aVar.build();
            this.f305773a.mo97460aV();
            if (ihVar.f136581f.size() != 0) {
                list = ihVar.f136581f;
            } else {
                list = this.f305773a.mo97539l((C50870f) null, ihVar.f136580e);
            }
            if (this.f305779h.mo79746e(C90014bt.f247727mc) && !this.f305773a.mo97518bj()) {
                C109040fj fjVar3 = this.f305773a;
                C51073fj fjVar4 = ((C50870f) aVar.instance).f132453f;
                if (fjVar4 == null) {
                    fjVar4 = C51073fj.f132977d;
                }
                C86124t tVar = this.f305779h;
                Context context = this.f305776e;
                C108237bh bhVar = fjVar3.f303249aI;
                if ((fjVar4.f132979a & 4) != 0) {
                    C108236bg W = bhVar.mo96650W();
                    C52353op opVar = fjVar4.f132980b;
                    if (opVar == null) {
                        opVar = C52353op.f137398e;
                    }
                    int argb = Color.argb((int) (opVar.f137403d * 255.0f), (int) (opVar.f137400a * 255.0f), (int) (opVar.f137401b * 255.0f), (int) (opVar.f137402c * 255.0f));
                    W.mo96624l(argb);
                    W.mo96619g(argb);
                    W.mo96625m(argb);
                    W.mo96627o(argb);
                    if (tVar.mo79746e(C90029ch.f248203Q)) {
                        W.mo96621i(C1878d.m5128a(context, R.color.opa_header_background));
                        W.mo96615c(C1878d.m5128a(context, R.color.opa_header_background));
                    } else {
                        W.mo96621i(argb);
                        W.mo96615c(argb);
                    }
                    bhVar = W.mo96613a();
                }
                fjVar3.f303309bP = bhVar;
                fjVar3.mo97445aG(fjVar3.f303309bP);
            }
            this.f305773a.mo97468ad(ihVar.f136577b, ihVar.f136579d, list);
            if (C109040fj.m181378bx(this.f305782k) && z) {
                C50870f fVar5 = (C50870f) aVar.instance;
                ((C113989h) ((C113988g) this.f305782k).mo100833bf().mo56107c()).mo100892cj(fVar5.f132449b, fVar5.f132450c);
                return;
            }
            return;
        }
        fjVar.mo97417E(true);
    }

    /* renamed from: u */
    public final void mo98089u(C50891r rVar) {
        if (this.f305790s.mo95240v()) {
            C106062r rVar2 = this.f305790s;
            C50890q qVar = rVar.f132502a;
            if (qVar == null) {
                qVar = C50890q.f132493e;
            }
            rVar2.mo95230l(qVar);
        }
    }

    /* renamed from: v */
    public final void mo98090v(long j, C51893d dVar) {
        if (this.f305773a.mo97528bv() && this.f305779h.mo79746e(C90029ch.f248282bp)) {
            if (dVar != null) {
                C109040fj fjVar = this.f305773a;
                C114528y yVar = new C114528y(j, dVar);
                C58976aa aaVar = C58975e.f156826a;
                fjVar.f303337br = C58833ax.m90833j(yVar);
                return;
            }
            throw new NullPointerException("Null dismissArgs");
        }
    }

    /* renamed from: w */
    public final void mo98091w(boolean z, long j, C58833ax axVar) {
        this.f305773a.f303260aT.mo97729o(2);
        if (z) {
            if (!this.f305779h.mo79746e(C90029ch.f248282bp)) {
                this.f305792u.mo100643c(this.f305777f, false);
            }
            C58976aa aaVar = C58975e.f156826a;
            this.f305773a.mo97415C();
            if (this.f305785n.mo95358d() == 2) {
                this.f305773a.mo97498bH(false, false, false, 2);
            }
            this.f305773a.mo97487aw();
            this.f305773a.mo97490az(false);
            C110014a aVar = this.f305773a.f303265aY;
            if (aVar != null) {
                aVar.mo98291a();
            }
        }
        if (axVar.mo56113h()) {
            C22717u uVar = (C22717u) axVar.mo56107c();
            if (uVar.mo27832b() == 1) {
                this.f305773a.mo97435W(new C19623a(7), new C19629c(uVar.mo27836c()));
            } else if (uVar.mo27832b() == 2) {
                this.f305773a.mo97435W(new C19623a(7), new C19629c(uVar.mo27831a()));
            }
        }
        this.f305782k.mo95369K(z, j, axVar);
        this.f305782k.mo95411av();
        C109040fj fjVar = this.f305773a;
        if (fjVar.f303371cc) {
            C89150g gVar = fjVar.f303376ch;
            gVar.f241691g.mo28212l("onResponseStateUiUpdated", new C89147d(gVar, z, j));
        }
        this.f305791t.mo100767k();
    }

    /* renamed from: x */
    public final void mo98092x(String str) {
        this.f305773a.f303318bY = str;
    }

    /* renamed from: y */
    public final void mo98093y(C11300h hVar, boolean z) {
        boolean z2;
        int i = 0;
        this.f305792u.mo100643c(this.f305777f, false);
        C109040fj fjVar = this.f305773a;
        fjVar.f303310bQ = hVar;
        if (fjVar.mo97523bp()) {
            this.f305773a.mo97498bH(false, false, false, 2);
            if (this.f305779h.mo79746e(C90042cu.f248715p)) {
                C109040fj fjVar2 = this.f305773a;
                C58976aa aaVar = C58975e.f156826a;
                if (C109040fj.m181378bx(fjVar2.f303450o)) {
                    ((C113989h) ((C113988g) fjVar2.f303450o).mo100833bf().mo56107c()).mo100847bH();
                }
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.f305773a.mo97504bN(z2);
        if (z) {
            C109040fj fjVar3 = this.f305773a;
            boolean bh = fjVar3.mo97516bh();
            ViewGroup h = fjVar3.f303450o.mo95419h();
            View findViewById = h.findViewById(R.id.valyrian_container);
            int i2 = true != bh ? 0 : 8;
            findViewById.setVisibility(i2);
            h.findViewById(R.id.opa_search_plate_container).setVisibility(i2);
            View findViewById2 = h.findViewById(R.id.immersive_freeform_action_container);
            if (true != bh) {
                i = 8;
            }
            findViewById2.setVisibility(i);
            fjVar3.f303376ch.mo83140n(fjVar3.mo97523bp());
        }
        if (!this.f305773a.mo97516bh()) {
            this.f305773a.mo97484at();
        }
    }

    /* renamed from: z */
    public final boolean mo98094z() {
        return this.f305773a.mo97519bk();
    }
}
