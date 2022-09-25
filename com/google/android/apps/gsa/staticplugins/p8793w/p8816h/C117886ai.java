package com.google.android.apps.gsa.staticplugins.p8793w.p8816h;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcelable;
import android.provider.Settings;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.c.l;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.p496a.p500c.C9311c;
import com.google.android.apps.gsa.p5836c.C74453e;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8839t.p8840a.C118340b;
import com.google.android.apps.gsa.search.core.carassistant.p6778b.C85685a;
import com.google.android.apps.gsa.search.core.carassistant.p6778b.C85689d;
import com.google.android.apps.gsa.search.core.carassistant.p6778b.C85693h;
import com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i;
import com.google.android.apps.gsa.search.core.carassistant.p6778b.C85695j;
import com.google.android.apps.gsa.search.core.carassistant.p6778b.C85697l;
import com.google.android.apps.gsa.search.core.carassistant.p6778b.C85698m;
import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.search.core.carassistant.p6781d.C85702a;
import com.google.android.apps.gsa.search.core.p6491a.C84347af;
import com.google.android.apps.gsa.search.core.p6491a.C84367m;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84591r;
import com.google.android.apps.gsa.search.core.p6519al.p6556ar.C84725a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6519al.p6588bg.C84839a;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6652cj.C85126a;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.p6758a.C85579b;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.p6758a.C85593p;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.search.core.service.C86637bd;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6848e.C86679b;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.search.core.state.p6872d.C86964p;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87714aw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87715ax;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87716ay;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87734bp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88247up;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88248uq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88249ur;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88303wr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88407ae;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.notificationlistening.p7120a.C90359a;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6974ae.C89092a;
import com.google.android.apps.gsa.shared.p6974ae.C89097f;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b.C117893e;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8821c.C117907d;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8822d.C117909a;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C118024cn;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C118027cq;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a.C117936f;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8825f.C118055d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.common.p916g.p917a.C13264a;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13883n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16717ae;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16718af;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16731as;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16732at;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58851bo;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.p4552o.ajy;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.ai */
/* compiled from: PG */
public final class C117886ai implements C86686h {

    /* renamed from: a */
    public static final C59071e f327159a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.h.ai");

    /* renamed from: t */
    private static final C89097f f327160t;

    /* renamed from: A */
    private final C84725a f327161A;

    /* renamed from: B */
    private final C68214a f327162B;

    /* renamed from: C */
    private final C117907d f327163C;

    /* renamed from: D */
    private final C86679b f327164D;

    /* renamed from: E */
    private final C118027cq f327165E;

    /* renamed from: F */
    private final C68214a f327166F;

    /* renamed from: G */
    private final C22871g f327167G;

    /* renamed from: H */
    private final b f327168H;

    /* renamed from: I */
    private final C89097f f327169I;

    /* renamed from: J */
    private final C86683e f327170J;

    /* renamed from: K */
    private final C60870cx f327171K;

    /* renamed from: L */
    private final C60870cx f327172L;

    /* renamed from: M */
    private final C117887aj f327173M;

    /* renamed from: N */
    private final C117893e f327174N;

    /* renamed from: O */
    private final C58833ax f327175O;

    /* renamed from: P */
    private final C85005h f327176P;

    /* renamed from: Q */
    private final C84839a f327177Q;

    /* renamed from: R */
    private final l f327178R;

    /* renamed from: S */
    private final C84809b f327179S;

    /* renamed from: T */
    private final C58833ax f327180T;

    /* renamed from: U */
    private final C89037bh f327181U;

    /* renamed from: V */
    private long f327182V;

    /* renamed from: W */
    private C58833ax f327183W;

    /* renamed from: X */
    private amo f327184X = amo.UNKNOWN;

    /* renamed from: Y */
    private final C85593p f327185Y;

    /* renamed from: Z */
    private final C85579b f327186Z;

    /* renamed from: aa */
    private final C13883n f327187aa;

    /* renamed from: ab */
    private final C91123v f327188ab;

    /* renamed from: c */
    public final Context f327189c;

    /* renamed from: d */
    public final C84347af f327190d;

    /* renamed from: e */
    public final C68214a f327191e;

    /* renamed from: f */
    public final C86124t f327192f;

    /* renamed from: g */
    public final C68214a f327193g;

    /* renamed from: h */
    public final C84352a f327194h;

    /* renamed from: i */
    public final Resources f327195i;

    /* renamed from: j */
    public final Query f327196j;

    /* renamed from: k */
    public final C86637bd f327197k;

    /* renamed from: l */
    public final C84591r f327198l;

    /* renamed from: m */
    public final C74453e f327199m;

    /* renamed from: n */
    public final C87052fn f327200n;

    /* renamed from: o */
    public final C118340b f327201o;

    /* renamed from: p */
    public final C68214a f327202p;

    /* renamed from: q */
    public final C85700a f327203q;

    /* renamed from: r */
    public final C92194i f327204r;

    /* renamed from: s */
    public final C86964p f327205s;

    /* renamed from: u */
    private final String f327206u;

    /* renamed from: v */
    private final C117909a f327207v;

    /* renamed from: w */
    private final C58833ax f327208w;

    /* renamed from: x */
    private final C85126a f327209x;

    /* renamed from: y */
    private final C84885a f327210y;

    /* renamed from: z */
    private final C58833ax f327211z;

    static {
        C89092a aVar = new C89092a();
        aVar.mo83061c();
        aVar.mo83060b();
        aVar.mo83063e();
        aVar.mo83062d();
        f327160t = aVar.mo83059a();
    }

    public C117886ai(Context context, String str, C117909a aVar, C58833ax axVar, C86964p pVar, C85126a aVar2, C58833ax axVar2, C84725a aVar3, C86124t tVar, C118027cq cqVar, C68214a aVar4, C68214a aVar5, C91123v vVar, C84885a aVar6, C84347af afVar, C22871g gVar, C68214a aVar7, C68214a aVar8, C117907d dVar, b bVar, C84352a aVar9, Resources resources, C58833ax axVar3, C86683e eVar, Query query, C85593p pVar2, C86637bd bdVar, C85579b bVar2, C84591r rVar, C74453e eVar2, C87052fn fnVar, C118340b bVar3, C60870cx cxVar, C60870cx cxVar2, C68214a aVar10, C85700a aVar11, C117887aj ajVar, C117893e eVar3, C92194i iVar, C58833ax axVar4, C85005h hVar, C84839a aVar12, l lVar, C84809b bVar4, C13883n nVar, C86679b bVar5, C58833ax axVar5, C89037bh bhVar) {
        this.f327189c = context;
        this.f327206u = str;
        this.f327207v = aVar;
        this.f327208w = axVar;
        this.f327205s = pVar;
        this.f327209x = aVar2;
        this.f327211z = axVar2;
        this.f327161A = aVar3;
        this.f327192f = tVar;
        this.f327165E = cqVar;
        this.f327193g = aVar4;
        this.f327166F = aVar5;
        this.f327188ab = vVar;
        this.f327210y = aVar6;
        this.f327190d = afVar;
        this.f327167G = gVar;
        this.f327162B = aVar7;
        this.f327191e = aVar8;
        this.f327163C = dVar;
        this.f327168H = bVar;
        this.f327194h = aVar9;
        this.f327195i = resources;
        this.f327169I = (C89097f) axVar3.mo56109e(f327160t);
        this.f327170J = eVar;
        this.f327196j = query;
        this.f327185Y = pVar2;
        this.f327197k = bdVar;
        this.f327186Z = bVar2;
        this.f327198l = rVar;
        this.f327164D = bVar5;
        this.f327199m = eVar2;
        this.f327200n = fnVar;
        this.f327201o = bVar3;
        this.f327171K = cxVar;
        this.f327172L = cxVar2;
        this.f327202p = aVar10;
        this.f327203q = aVar11;
        this.f327173M = ajVar;
        this.f327174N = eVar3;
        this.f327204r = iVar;
        this.f327175O = axVar4;
        this.f327176P = hVar;
        this.f327177Q = aVar12;
        this.f327178R = lVar;
        this.f327179S = bVar4;
        this.f327187aa = nVar;
        this.f327183W = C58836b.f156633a;
        this.f327180T = axVar5;
        this.f327181U = bhVar;
    }

    /* renamed from: t */
    private final void m195863t(boolean z) {
        C22871g gVar = this.f327167G;
        gVar.mo28212l("onCarConnectionChanged: " + z, new C118076v(this, z));
    }

    /* renamed from: u */
    private final void m195864u(boolean z) {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        C83395k.m132733d(this.f327189c);
        aas a = C90359a.m146922a(this.f327189c, this.f327169I);
        if (a != null) {
            this.f327176P.mo78617M(23, 224, a, ajy.CLIENT_GENERATED);
        } else {
            C59104x d = f327159a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CarAssistantSessCtlr");
            ((C59052c) ((C59052c) d).mo56372aa(18749)).mo56386p("Unable to post notification");
        }
        if (z) {
            i = this.f327169I.mo83066c();
        } else {
            i = this.f327169I.mo83067d();
        }
        mo103470o(i);
    }

    /* renamed from: v */
    private final void m195865v(Query query, TtsRequest ttsRequest) {
        new C90873ag(C60922j.m93045h(C60838bs.m92859i(((C118055d) this.f327191e.mo27525b()).mo103505a()), new C117867a(this, query, ttsRequest), C60826bg.f164896a), this.f327167G, "Cancel conversation after error TTS", new C118066l(this)).mo85223a(C118075u.f327697a);
    }

    /* renamed from: w */
    private final boolean m195866w() {
        if (!this.f327188ab.mo85390b() || !((C9311c) this.f327202p.mo27525b()).mo17495d(this.f327192f.mo79743a(C90086ek.f250514l))) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f327203q.mo79322d(C89849ae.ASSISTANT_AUTO_COLD_BOOT_QUERY_START);
        if (((C9311c) this.f327202p.mo27525b()).f32303b.get() > 0) {
            mo103472q(C88244um.CAR_ASSISTANT_COLD_BOOT_STILL_NOT_READY);
            mo103470o(R.string.cold_boot_still_not_ready_tts);
            ((C9311c) this.f327202p.mo27525b()).mo17493b();
            this.f327203q.mo79322d(C89849ae.ASSISTANT_AUTO_COLD_BOOT_REJECT_QUERY);
            return true;
        }
        mo103472q(C88244um.CAR_ASSISTANT_COLD_BOOT_NOT_READY);
        mo103470o(R.string.cold_boot_not_ready_tts);
        new C90873ag(this.f327167G.mo28203c("TTS system exited cold boot", Math.max(5000, this.f327192f.mo79743a(C90086ek.f250514l) - ((C9311c) this.f327202p.mo27525b()).f32302a.mo26871c()), new C118063i(this)), this.f327167G, "Play TTS system no longer in cold boot", new C118057g(this)).mo85223a(C118062h.f327682a);
        ((C9311c) this.f327202p.mo27525b()).mo17493b();
        this.f327203q.mo79322d(C89849ae.ASSISTANT_AUTO_COLD_BOOT_REJECT_QUERY);
        return true;
    }

    /* renamed from: x */
    private final boolean m195867x() {
        if (!this.f327192f.mo79746e(C90086ek.f250484dx) || !this.f327180T.mo56113h() || ((C13264a) this.f327180T.mo56107c()).f40956b.mo117124a() != 1) {
            return false;
        }
        if (!this.f327192f.mo79746e(C90086ek.f250485dy) || !this.f327181U.mo27377b().mo83040a()) {
            this.f327203q.mo79322d(C89849ae.ASSISTANT_AUTO_NO_DATA_SUBSCRIPTION);
            mo103472q(C88244um.NO_DATA_SUBSCRIPTION);
            mo103470o(R.string.no_subscription_tts);
            return true;
        }
        this.f327203q.mo79322d(C89849ae.ASSISTANT_AUTO_NO_DATA_SUBSCRIPTION_WITH_TETHERING);
        return false;
    }

    /* renamed from: y */
    private final boolean m195868y() {
        if (!this.f327192f.mo79746e(C90086ek.f250524v) || Settings.Secure.getInt(this.f327189c.getContentResolver(), "android.car.SETUP_WIZARD_IN_PROGRESS", 0) != 1) {
            return false;
        }
        mo103470o(R.string.suw_in_progress_tts);
        C87684al alVar = new C87684al(C88244um.SHOW_RECOGNITION_STATE);
        C62940bt btVar = C88302wq.f238816a;
        C88303wr wrVar = (C88303wr) C88304ws.f238817c.createBuilder();
        wrVar.copyOnWrite();
        C88304ws wsVar = (C88304ws) wrVar.instance;
        wsVar.f238819a |= 1;
        wsVar.f238820b = 5;
        alVar.mo81965b(btVar, (C88304ws) wrVar.build());
        ServiceEventData a = alVar.mo81964a();
        C87682aj ajVar = this.f327170J.f234157a;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(a);
        }
        return true;
    }

    /* renamed from: z */
    private final boolean m195869z() {
        if (!this.f327188ab.mo85390b() || !this.f327175O.mo56113h() || !((C9309a) this.f327175O.mo56107c()).f32299a.mo79346d()) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        mo103470o(R.string.language_unsupported_tts);
        return true;
    }

    /* renamed from: a */
    public final void mo103466a() {
        C58976aa aaVar = C58975e.f156826a;
        new C90873ag(this.f327172L, this.f327167G, "cancelConversation", C118064j.f327684a).mo85223a(C118065k.f327685a);
        new C90873ag(this.f327171K, this.f327167G, "cancelConversation", C118067m.f327687a).mo85223a(C118068n.f327688a);
        mo103472q(C88244um.OPA_CONVERSATION_CANCELLED);
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: c */
    public final void mo103467c(C51805du duVar, String str) {
        boolean e = this.f327192f.mo79746e(C90086ek.f250402cU);
        boolean e2 = this.f327192f.mo79746e(C90086ek.f250467dg);
        C86124t tVar = this.f327192f;
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar.getClass();
        ekVar.f136675c = duVar;
        ekVar.f136674b = 5;
        C52078ek ekVar2 = (C52078ek) ejVar.build();
        eoVar.copyOnWrite();
        C52083ep epVar = (C52083ep) eoVar.instance;
        ekVar2.getClass();
        epVar.f136693c = ekVar2;
        epVar.f136692b = 3;
        elVar.mo53786c((C52083ep) eoVar.build());
        Query ap = this.f327196j.mo84244G(true).mo84278aO("user-agent-suffix", str == null ? BuildConfig.FLAVOR : str).mo84275aL("and.opa").mo84309au().mo84445dZ().mo84304ap(((C52081en) elVar.build()).toByteArray());
        if (tVar.mo79746e(C90086ek.f250506es)) {
            ap = ap.mo84278aO("application-id-override", "gearhead");
        }
        if (e2 && e) {
            ((C118024cn) this.f327193g.mo27525b()).mo103496b(ap);
        } else if ((this.f327188ab.mo85390b() || this.f327192f.mo79746e(C90086ek.f250490ec)) && duVar != null) {
            ((C117936f) this.f327166F.mo27525b()).mo103484a(ap);
        } else {
            mo103471p(duVar, str);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80293f(long r11, com.google.android.apps.gsa.search.shared.service.ClientEventData r13, com.google.android.apps.gsa.search.core.service.p6848e.C86681c r14) {
        /*
            r10 = this;
            com.google.android.apps.gsa.search.shared.service.b.bw r11 = r13.f236955a
            int r11 = r11.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r11)
            if (r11 != 0) goto L_0x000c
            com.google.android.apps.gsa.search.shared.service.b.bu r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x000c:
            com.google.common.f.e r12 = f327159a
            com.google.common.f.x r0 = r12.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "CarAssistantSessCtlr"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "#handleGenericClientEvent: %s"
            java.lang.String r2 = r11.name()
            r3 = 18709(0x4915, float:2.6217E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r2)
            int r11 = r11.ordinal()
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r11) {
                case 12: goto L_0x0864;
                case 13: goto L_0x085d;
                case 23: goto L_0x089b;
                case 27: goto L_0x0807;
                case 33: goto L_0x0803;
                case 34: goto L_0x07ff;
                case 37: goto L_0x07fa;
                case 42: goto L_0x089b;
                case 45: goto L_0x07d4;
                case 47: goto L_0x07c6;
                case 48: goto L_0x089b;
                case 92: goto L_0x071f;
                case 115: goto L_0x06a3;
                case 126: goto L_0x069e;
                case 150: goto L_0x0673;
                case 151: goto L_0x0637;
                case 152: goto L_0x0637;
                case 153: goto L_0x05be;
                case 155: goto L_0x055c;
                case 180: goto L_0x04e9;
                case 202: goto L_0x04c7;
                case 206: goto L_0x04c2;
                case 207: goto L_0x04bd;
                case 209: goto L_0x043e;
                case 215: goto L_0x03f9;
                case 216: goto L_0x032d;
                case 224: goto L_0x02fa;
                case 225: goto L_0x00a1;
                case 229: goto L_0x009a;
                case 232: goto L_0x0095;
                case 240: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0862
        L_0x0031:
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f327192f
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250467dg
            boolean r11 = r11.mo79746e(r12)
            if (r11 != 0) goto L_0x003c
            goto L_0x002f
        L_0x003c:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87727bi.f237208a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r0 = r11.f169971d
            java.lang.Object r12 = r12.mo58854l(r0)
            if (r12 != 0) goto L_0x0054
            java.lang.Object r11 = r11.f169969b
            goto L_0x0058
        L_0x0054:
            java.lang.Object r11 = r11.mo58889c(r12)
        L_0x0058:
            com.google.android.apps.gsa.search.shared.service.b.bk r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87729bk) r11
            int r12 = r11.f237211a
            r12 = r12 & r2
            if (r12 == 0) goto L_0x0862
            int r11 = r11.f237212b
            com.google.android.apps.gsa.search.shared.service.b.bh r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh.m142759a(r11)
            if (r11 != 0) goto L_0x0069
            com.google.android.apps.gsa.search.shared.service.b.bh r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh.IDLE
        L_0x0069:
            com.google.android.apps.gsa.search.core.i.t r12 = r10.f327192f
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250505er
            boolean r12 = r12.mo79746e(r0)
            if (r12 != 0) goto L_0x0074
            goto L_0x002f
        L_0x0074:
            com.google.android.apps.gsa.search.shared.service.b.bh r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh.ONGOING
            if (r11 != r12) goto L_0x008c
            com.google.android.apps.gsa.staticplugins.w.h.b.e r11 = r10.f327174N
            long r0 = r10.f327182V
            com.google.android.apps.gsa.search.core.service.e.b r12 = r10.f327164D
            com.google.android.apps.gsa.search.shared.service.ClientConfig r12 = r12.mo80283a()
            com.google.android.apps.gsa.staticplugins.w.h.w r2 = new com.google.android.apps.gsa.staticplugins.w.h.w
            r2.<init>(r10)
            r11.mo103479a(r0, r12, r2)
            goto L_0x0862
        L_0x008c:
            com.google.android.apps.gsa.staticplugins.w.h.b.e r11 = r10.f327174N
            long r0 = r10.f327182V
            r11.mo103480b(r0)
            goto L_0x0862
        L_0x0095:
            r10.mo103474s()
            goto L_0x0862
        L_0x009a:
            com.google.android.apps.gsa.search.shared.service.b.um r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_KEEP_SCREEN_ON
            r10.mo103472q(r11)
            goto L_0x0862
        L_0x00a1:
            com.google.android.apps.gsa.shared.util.v r11 = r10.f327188ab
            boolean r11 = r11.mo85390b()
            if (r11 == 0) goto L_0x0131
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f327192f
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250352bX
            boolean r11 = r11.mo79746e(r12)
            if (r11 == 0) goto L_0x0131
            com.google.assistant.e.j.apu r11 = com.google.assistant.p3897e.p3921j.apu.f135583d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.j.aps r11 = (com.google.assistant.p3897e.p3921j.aps) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.j.apu r12 = (com.google.assistant.p3897e.p3921j.apu) r12
            r4 = 15
            r12.f135586b = r4
            int r4 = r12.f135585a
            r4 = r4 | r2
            r12.f135585a = r4
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.e.j.apu r11 = (com.google.assistant.p3897e.p3921j.apu) r11
            com.google.assistant.e.j.ka r12 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.j.jz r12 = (com.google.assistant.p3897e.p3921j.C52228jz) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r4 = r12.instance
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            int r5 = r4.f137059a
            r5 = r5 | r2
            r4.f137059a = r5
            java.lang.String r5 = "assistant.api.client_input.WarmerWelcomeInput"
            r4.f137060b = r5
            com.google.protobuf.z r11 = r11.toByteString()
            r12.copyOnWrite()
            com.google.protobuf.bv r4 = r12.instance
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            r11.getClass()
            int r5 = r4.f137059a
            r0 = r0 | r5
            r4.f137059a = r0
            r4.f137061c = r11
            com.google.protobuf.bv r11 = r12.build()
            com.google.assistant.e.j.ka r11 = (com.google.assistant.p3897e.p3921j.C52230ka) r11
            com.google.assistant.e.j.du r12 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.j.ds r12 = (com.google.assistant.p3897e.p3921j.C51803ds) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.assistant.e.j.du r0 = (com.google.assistant.p3897e.p3921j.C51805du) r0
            int r4 = r0.f135926a
            r2 = r2 | r4
            r0.f135926a = r2
            java.lang.String r2 = "warmer_welcome.TRIGGER"
            r0.f135927b = r2
            java.lang.String r0 = "warmer_welcome_input"
            r12.mo53729a(r0, r11)
            com.google.protobuf.bv r11 = r12.build()
            com.google.assistant.e.j.du r11 = (com.google.assistant.p3897e.p3921j.C51805du) r11
            r10.mo103471p(r11, r1)
            com.google.android.apps.gsa.search.shared.service.b.um r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_KEEP_SCREEN_ON
            r10.mo103472q(r11)
            goto L_0x0862
        L_0x0131:
            com.google.common.o.amo r11 = r10.f327184X
            com.google.common.o.amo r12 = com.google.common.p4552o.amo.ANDROID_AUTO_PROJECTED
            if (r11 != r12) goto L_0x0862
            com.google.android.apps.gsa.staticplugins.w.h.c.d r11 = r10.f327163C
            com.google.android.apps.gsa.search.core.carassistant.b.a r12 = r11.f327264d
            com.google.android.apps.gsa.search.core.carassistant.b.d r1 = r12.f231713e
            r4 = 5
            com.google.common.base.ax r1 = r1.mo79314a(r4)
            com.google.android.apps.gsa.search.core.i.t r5 = r12.f231714f
            com.google.android.apps.gsa.shared.m.f r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250463dc
            long r5 = r5.mo79743a(r6)
            boolean r7 = r1.mo56113h()
            if (r7 == 0) goto L_0x0214
            java.lang.Object r7 = r1.mo56107c()
            com.google.android.apps.gsa.search.core.carassistant.b.i r7 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i) r7
            int r7 = r7.f231734d
            long r7 = (long) r7
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0214
            boolean r5 = r12.mo79313b()
            if (r5 != 0) goto L_0x0165
            goto L_0x0214
        L_0x0165:
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.core.carassistant.b.i r1 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i) r1
            int r1 = r1.f231734d
            com.google.android.apps.gsa.search.core.carassistant.b.d r5 = r12.f231713e
            com.google.android.apps.gsa.search.core.carassistant.b.i r6 = com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i.f231729e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.search.core.carassistant.b.h r6 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85693h) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.search.core.carassistant.b.i r7 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i) r7
            int r8 = r7.f231731a
            r8 = r8 | r2
            r7.f231731a = r8
            int r1 = r1 + r2
            r7.f231734d = r1
            com.google.protobuf.bv r1 = r6.build()
            com.google.android.apps.gsa.search.core.carassistant.b.i r1 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i) r1
            r5.mo79315b(r4, r1)
            com.google.android.apps.gsa.search.core.i.t r1 = r12.f231714f
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250466df
            boolean r1 = r1.mo79746e(r4)
            r4 = 2132093608(0x7f152aa8, float:1.9827646E38)
            if (r1 == 0) goto L_0x01c6
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.az r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az.f48952d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ay r1 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16737ay) r1
            android.content.res.Resources r12 = r12.f231715g
            java.lang.String r12 = r12.getString(r4)
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.az r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az) r4
            r12.getClass()
            int r5 = r4.f48954a
            r5 = r5 | r2
            r4.f48954a = r5
            r4.f48956c = r12
            com.google.protobuf.bv r12 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.az r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az) r12
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x0216
        L_0x01c6:
            com.google.android.apps.gsa.search.core.i.t r1 = r12.f231714f
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250464dd
            boolean r1 = r1.mo79746e(r5)
            if (r1 == 0) goto L_0x01df
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ay r12 = r12.mo79312a()
            com.google.protobuf.bv r12 = r12.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.az r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az) r12
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x0216
        L_0x01df:
            com.google.android.apps.gsa.search.core.i.t r1 = r12.f231714f
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250465de
            boolean r1 = r1.mo79746e(r5)
            if (r1 == 0) goto L_0x0211
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ay r1 = r12.mo79312a()
            android.content.res.Resources r12 = r12.f231715g
            java.lang.String r12 = r12.getString(r4)
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.az r4 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az) r4
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.az r5 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az.f48952d
            r12.getClass()
            int r5 = r4.f48954a
            r5 = r5 | r2
            r4.f48954a = r5
            r4.f48956c = r12
            com.google.protobuf.bv r12 = r1.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.az r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az) r12
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x0216
        L_0x0211:
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x0216
        L_0x0214:
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
        L_0x0216:
            boolean r1 = r12.mo56113h()
            if (r1 != 0) goto L_0x021e
            goto L_0x002f
        L_0x021e:
            java.lang.Object r12 = r12.mo56107c()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.az r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az) r12
            int r1 = r12.f48954a
            r1 = r1 & r2
            if (r1 == 0) goto L_0x025b
            java.lang.String r1 = r12.f48956c
            com.google.android.apps.gsa.search.core.a.b.a r4 = r11.f327266f
            com.google.android.apps.gsa.shared.search.Query r5 = r11.f327265e
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r6 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r6.<init>((java.lang.String) r1, (boolean) r3)
            com.google.android.apps.gsa.staticplugins.w.h.c.a r1 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8821c.C117904a.f327258a
            com.google.common.util.concurrent.cx r1 = r4.mo77888b(r5, r6, r1)
            com.google.android.libraries.gsa.k.g r4 = r11.f327263c
            com.google.android.apps.gsa.staticplugins.w.h.c.b r5 = new com.google.android.apps.gsa.staticplugins.w.h.c.b
            r5.<init>(r11)
            com.google.android.apps.gsa.shared.util.c.ag r6 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r7 = "Cancel conversation after education TTS playback"
            r6.<init>(r1, r4, r7, r5)
            com.google.android.apps.gsa.staticplugins.w.h.c.c r1 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8821c.C117906c.f327260a
            r6.mo85223a(r1)
            com.google.android.apps.gsa.search.shared.service.al r1 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_KEEP_SCREEN_ON
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r4)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r1 = r1.mo81964a()
            r11.mo103482a(r1)
        L_0x025b:
            com.google.protobuf.cq r1 = r12.f48955b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0862
            com.google.android.apps.gsa.search.shared.service.al r1 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.CAR_ASSISTANT_DISCOVERABILITY_INFO
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r4)
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87714aw.f237185a
            com.google.android.apps.gsa.search.shared.service.b.ay r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87716ay.f237186c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ax r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87715ax) r5
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.af r6 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16718af.f48884c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ae r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16717ae) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.af r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16718af) r7
            r12.getClass()
            r7.f48887b = r12
            r12 = 3
            r7.f48886a = r12
            com.google.protobuf.bv r12 = r6.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.af r12 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16718af) r12
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.ay r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87716ay) r6
            r12.getClass()
            r6.f237189b = r12
            int r12 = r6.f237188a
            r12 = r12 | r2
            r6.f237188a = r12
            com.google.protobuf.bv r12 = r5.build()
            com.google.android.apps.gsa.search.shared.service.b.ay r12 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87716ay) r12
            r1.mo81965b(r4, r12)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r12 = r1.mo81964a()
            r11.mo103482a(r12)
            com.google.android.apps.gsa.search.core.i.t r12 = r11.f327262b
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250474dn
            long r4 = r12.mo79743a(r1)
            com.google.android.apps.gsa.search.shared.service.al r12 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_KEEP_SCREEN_ON
            r12.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r1)
            com.google.protobuf.bt r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88116pt.f238220a
            com.google.android.apps.gsa.search.shared.service.b.px r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88120px.f238222d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.pu r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88117pu) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.search.shared.service.b.px r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88120px) r7
            int r8 = r7.f238224a
            r8 = r8 | r2
            r7.f238224a = r8
            int r5 = (int) r4
            r7.f238225b = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.gsa.search.shared.service.b.px r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88120px) r4
            r4.f238226c = r2
            int r2 = r4.f238224a
            r0 = r0 | r2
            r4.f238224a = r0
            com.google.protobuf.bv r0 = r6.build()
            com.google.android.apps.gsa.search.shared.service.b.px r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88120px) r0
            r12.mo81965b(r1, r0)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r12 = r12.mo81964a()
            r11.mo103482a(r12)
            goto L_0x0862
        L_0x02fa:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88221tq.f238456a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r0 = r11.f169971d
            java.lang.Object r12 = r12.mo58854l(r0)
            if (r12 != 0) goto L_0x0312
            java.lang.Object r11 = r11.f169969b
            goto L_0x0316
        L_0x0312:
            java.lang.Object r11 = r11.mo58889c(r12)
        L_0x0316:
            com.google.android.apps.gsa.search.shared.service.b.ts r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88223ts) r11
            int r12 = r11.f238459a
            r12 = r12 & r2
            if (r12 == 0) goto L_0x0862
            com.google.android.apps.gsa.search.shared.service.b.bp r11 = r11.f238460b
            if (r11 != 0) goto L_0x0323
            com.google.android.apps.gsa.search.shared.service.b.bp r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87734bp.f237219c
        L_0x0323:
            com.google.android.apps.gsa.staticplugins.w.h.aj r12 = r10.f327173M
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            r12.f327212a = r11
            goto L_0x0862
        L_0x032d:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87721bc.f237196a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r12.mo58857o(r11)
            if (r11 == 0) goto L_0x036c
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87721bc.f237196a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r1 = r11.f169971d
            java.lang.Object r12 = r12.mo58854l(r1)
            if (r12 != 0) goto L_0x035a
            java.lang.Object r11 = r11.f169969b
            goto L_0x035e
        L_0x035a:
            java.lang.Object r11 = r11.mo58889c(r12)
        L_0x035e:
            com.google.android.apps.gsa.search.shared.service.b.gv r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87875gv) r11
            long r11 = r11.f237729a
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            r10.f327183W = r11
        L_0x036c:
            com.google.android.apps.gsa.search.shared.service.j r11 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.HOTWORD_DETECTED_IN_INTERACTOR
            r11.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r12)
            java.lang.Class<com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData> r12 = com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData.class
            android.os.Parcelable r12 = r13.mo81912b(r12)
            r11.mo82015c(r12)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r13 = r11.mo82013a()
            com.google.android.apps.gsa.c.l r11 = r10.f327178R
            java.lang.Class<com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData> r12 = com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData.class
            android.os.Parcelable r12 = r13.mo81912b(r12)
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r12 = (com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData) r12
            android.net.Uri r12 = r12.f253054b
            r11.a(r12)
            boolean r11 = r10.m195868y()
            if (r11 != 0) goto L_0x03a7
            boolean r11 = r10.m195869z()
            if (r11 != 0) goto L_0x03a7
            boolean r11 = r10.m195866w()
            if (r11 != 0) goto L_0x03a7
            boolean r11 = r10.m195867x()
            if (r11 == 0) goto L_0x089b
        L_0x03a7:
            java.lang.Class<com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData> r11 = com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData.class
            android.os.Parcelable r11 = r13.mo81912b(r11)
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r11 = (com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData) r11
            android.net.Uri r11 = r11.f253054b
            if (r11 == 0) goto L_0x03dc
            android.content.Context r12 = r10.f327189c     // Catch:{ SecurityException -> 0x03c7, IOException -> 0x03c5 }
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch:{ SecurityException -> 0x03c7, IOException -> 0x03c5 }
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r11 = r12.openFileDescriptor(r11, r1)     // Catch:{ SecurityException -> 0x03c7, IOException -> 0x03c5 }
            if (r11 == 0) goto L_0x03dc
            r11.close()     // Catch:{ SecurityException -> 0x03c7, IOException -> 0x03c5 }
            goto L_0x03dc
        L_0x03c5:
            r11 = move-exception
            goto L_0x03c8
        L_0x03c7:
            r11 = move-exception
        L_0x03c8:
            com.google.common.f.e r12 = f327159a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "CarAssistantSessCtlr"
            r12.mo56378ag(r1, r2)
            java.lang.String r1 = "#closeAudioProvider"
            r2 = 18698(0x490a, float:2.6201E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56382g(r11)).mo56372aa(r2)).mo56386p(r1)
        L_0x03dc:
            com.google.common.f.e r11 = f327159a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r1)
            java.lang.String r12 = "Sending AudioStatusChangedBroadcast to :interactor. audioSourceType: AudioSourceType.INTERACTOR, isActive: false"
            r1 = 18713(0x4919, float:2.6222E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r12)
            android.content.Context r11 = r10.f327189c
            java.lang.String r12 = r10.f327206u
            com.google.android.apps.gsa.c.f.a.k.a(r11, r12, r3, r0)
            goto L_0x0862
        L_0x03f9:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87713av.f237184a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r12.mo58857o(r11)
            if (r11 != 0) goto L_0x0410
            goto L_0x002f
        L_0x0410:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87713av.f237184a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r0 = r11.f169971d
            java.lang.Object r12 = r12.mo58854l(r0)
            if (r12 != 0) goto L_0x0428
            java.lang.Object r11 = r11.f169969b
            goto L_0x042c
        L_0x0428:
            java.lang.Object r11 = r11.mo58889c(r12)
        L_0x042c:
            com.google.android.apps.gsa.search.shared.service.b.by r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87743by) r11
            com.google.android.libraries.gsa.k.g r12 = r10.f327167G
            com.google.android.apps.gsa.staticplugins.w.h.ah r0 = new com.google.android.apps.gsa.staticplugins.w.h.ah
            r0.<init>(r10, r11)
            java.lang.String r11 = "Close the mic opened before query commit for PTT button or on screen mic tap"
            r1 = 5000(0x1388, double:2.4703E-320)
            r12.mo28213m(r11, r1, r0)
            goto L_0x0862
        L_0x043e:
            boolean r11 = r10.m195869z()
            if (r11 != 0) goto L_0x0862
            boolean r11 = r10.m195867x()
            if (r11 != 0) goto L_0x0862
            boolean r11 = r10.m195866w()
            if (r11 != 0) goto L_0x0862
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f327192f
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250346bR
            boolean r11 = r11.mo79746e(r0)
            if (r11 != 0) goto L_0x046e
            com.google.common.f.x r11 = r12.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r0)
            java.lang.String r12 = "Assistant Suggestions is not enabled."
            r0 = 18731(0x492b, float:2.6248E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x0862
        L_0x046e:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87735bq.f237224a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r0 = r11.f169971d
            java.lang.Object r12 = r12.mo58854l(r0)
            if (r12 != 0) goto L_0x0486
            java.lang.Object r11 = r11.f169969b
            goto L_0x048a
        L_0x0486:
            java.lang.Object r11 = r11.mo58889c(r12)
        L_0x048a:
            com.google.android.apps.gsa.search.shared.service.b.bs r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87737bs) r11
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r12 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r12 = r13.mo81912b(r12)
            com.google.android.apps.gsa.shared.search.Query r12 = (com.google.android.apps.gsa.shared.search.Query) r12
            if (r12 == 0) goto L_0x0862
            java.lang.String r11 = r11.f237227a
            com.google.android.apps.gsa.search.core.carassistant.c.a r0 = r10.f327203q
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_SUGGESTION_BEGIN_FETCH_ACTION_FULFILLMENT_DATA
            r0.mo79322d(r1)
            com.google.android.apps.gsa.search.core.al.s.a.p r0 = r10.f327185Y
            com.google.common.util.concurrent.cx r0 = r0.mo79088a(r11)
            com.google.android.libraries.gsa.k.g r1 = r10.f327167G
            com.google.android.apps.gsa.staticplugins.w.h.x r2 = new com.google.android.apps.gsa.staticplugins.w.h.x
            r2.<init>(r10, r11, r12)
            com.google.android.apps.gsa.shared.util.c.ag r11 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r12 = "getSuggestionActionFulfillmentData"
            r11.<init>(r0, r1, r12, r2)
            com.google.android.apps.gsa.staticplugins.w.h.y r12 = new com.google.android.apps.gsa.staticplugins.w.h.y
            r12.<init>(r10)
            r11.mo85223a(r12)
            goto L_0x0862
        L_0x04bd:
            r10.m195864u(r3)
            goto L_0x0862
        L_0x04c2:
            r10.m195864u(r2)
            goto L_0x0862
        L_0x04c7:
            dagger.a r11 = r10.f327191e
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.staticplugins.w.h.f.d r11 = (com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8825f.C118055d) r11
            com.google.android.libraries.gsa.k.g r12 = r11.f327639b
            dagger.a r0 = r11.f327640c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.aa.bh r0 = (com.google.android.apps.gsa.shared.p6968aa.C89037bh) r0
            com.google.common.util.concurrent.cx r0 = r0.mo27378c()
            com.google.android.apps.gsa.staticplugins.w.h.f.c r1 = new com.google.android.apps.gsa.staticplugins.w.h.f.c
            r1.<init>(r11)
            java.lang.String r11 = "NetworkUiController: NetworkMonitor#getConnectivityInfoFuture callback"
            r12.mo28211k(r0, r11, r1)
            goto L_0x0862
        L_0x04e9:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87873gt.f237726a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r0.mo58887l(r11)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r0.mo58857o(r11)
            if (r11 != 0) goto L_0x0512
            com.google.common.f.x r11 = r12.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r0)
            java.lang.String r12 = "HOTWORD_DETECTED_ON_ACTIVE_CLIENT, but no HotwordQueryDetectedEventExtension"
            r0 = 18736(0x4930, float:2.6255E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x0862
        L_0x0512:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87873gt.f237726a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r0.mo58887l(r11)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r1 = r11.f169971d
            java.lang.Object r0 = r0.mo58854l(r1)
            if (r0 != 0) goto L_0x052a
            java.lang.Object r11 = r11.f169969b
            goto L_0x052e
        L_0x052a:
            java.lang.Object r11 = r11.mo58889c(r0)
        L_0x052e:
            com.google.android.apps.gsa.search.shared.service.c.b.ad r11 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r11
            com.google.protobuf.z r11 = r11.f239036b
            android.os.Parcelable$Creator r0 = com.google.android.apps.gsa.shared.search.Query.CREATOR
            android.os.Parcelable r11 = com.google.android.apps.gsa.shared.util.C90772bp.m148301i(r11, r0)
            com.google.android.apps.gsa.shared.search.Query r11 = (com.google.android.apps.gsa.shared.search.Query) r11
            if (r11 != 0) goto L_0x0550
            com.google.common.f.x r11 = r12.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r0)
            java.lang.String r12 = "can't construct query"
            r0 = 18735(0x492f, float:2.6253E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x0862
        L_0x0550:
            com.google.android.apps.gsa.c.l r12 = r10.f327178R
            android.net.Uri r0 = r11.f252787z
            r12.a(r0)
            r10.mo103473r(r11)
            goto L_0x0862
        L_0x055c:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87970ki.f237919a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r0.mo58887l(r11)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r0.mo58857o(r11)
            if (r11 != 0) goto L_0x0585
            com.google.common.f.x r11 = r12.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r0)
            java.lang.String r12 = "Client event MAPS_NAVIGATION_STATE_UPDATE send without MapsNavigationStateUpdateEvent extension."
            r0 = 18738(0x4932, float:2.6258E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x0862
        L_0x0585:
            dagger.a r11 = r10.f327162B
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r11 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r11
            com.google.protobuf.bt r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87970ki.f237919a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r13.f236955a
            com.google.protobuf.bt r12 = com.google.protobuf.C62942bv.checkIsLite(r12)
            r0.mo58887l(r12)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r1 = r12.f169971d
            java.lang.Object r0 = r0.mo58854l(r1)
            if (r0 != 0) goto L_0x05a5
            java.lang.Object r12 = r12.f169969b
            goto L_0x05a9
        L_0x05a5:
            java.lang.Object r12 = r12.mo58889c(r0)
        L_0x05a9:
            com.google.android.apps.gsa.search.shared.service.b.km r12 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87974km) r12
            com.google.android.apps.gsa.search.shared.service.b.kl r12 = r12.f237926a
            if (r12 != 0) goto L_0x05b1
            com.google.android.apps.gsa.search.shared.service.b.kl r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87973kl.f237920b
        L_0x05b1:
            com.google.protobuf.z r12 = r12.f237922a
            java.lang.Object r0 = r11.f236439a
            monitor-enter(r0)
            r11.f236457s = r12     // Catch:{ all -> 0x05bb }
            monitor-exit(r0)     // Catch:{ all -> 0x05bb }
            goto L_0x0862
        L_0x05bb:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x05bb }
            throw r11
        L_0x05be:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88125qb.f238233a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r12.mo58857o(r11)
            if (r11 == 0) goto L_0x0862
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88125qb.f238233a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r0 = r11.f169971d
            java.lang.Object r12 = r12.mo58854l(r0)
            if (r12 != 0) goto L_0x05eb
            java.lang.Object r11 = r11.f169969b
            goto L_0x05ef
        L_0x05eb:
            java.lang.Object r11 = r11.mo58889c(r12)
        L_0x05ef:
            com.google.android.apps.gsa.search.shared.service.b.qd r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88127qd) r11
            java.lang.String r11 = r11.f238236a
            com.google.protobuf.bt r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C88125qb.f238233a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r13.f236955a
            com.google.protobuf.bt r12 = com.google.protobuf.C62942bv.checkIsLite(r12)
            r0.mo58887l(r12)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r2 = r12.f169971d
            java.lang.Object r0 = r0.mo58854l(r2)
            if (r0 != 0) goto L_0x060b
            java.lang.Object r12 = r12.f169969b
            goto L_0x060f
        L_0x060b:
            java.lang.Object r12 = r12.mo58889c(r0)
        L_0x060f:
            com.google.android.apps.gsa.search.shared.service.b.qd r12 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88127qd) r12
            java.lang.String r12 = r12.f238237b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x0623
            java.lang.String r2 = "KEY_PHONE_NUMBER"
            r0.putString(r2, r12)
        L_0x0623:
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x062e
            java.lang.String r12 = "KEY RECIPIENT NAME"
            r0.putString(r12, r11)
        L_0x062e:
            com.google.assistant.e.j.du r11 = com.google.android.libraries.assistant.auto.tng.p945f.p950b.p952b.C13367a.m29620a(r0)
            r10.mo103467c(r11, r1)
            goto L_0x0862
        L_0x0637:
            boolean r11 = r10.m195869z()
            if (r11 != 0) goto L_0x0862
            boolean r11 = r10.m195867x()
            if (r11 != 0) goto L_0x0862
            boolean r11 = r10.m195866w()
            if (r11 != 0) goto L_0x0862
            com.google.android.apps.gsa.search.shared.service.b.bw r11 = r13.f236955a
            int r11 = r11.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r11)
            if (r11 != 0) goto L_0x0655
            com.google.android.apps.gsa.search.shared.service.b.bu r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x0655:
            java.lang.Class<com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper> r12 = com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper.class
            android.os.Parcelable r12 = r13.mo81912b(r12)
            com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper r12 = (com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper) r12
            com.google.android.apps.gsa.search.core.al.bl.a r0 = r10.f327210y
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89846n(r12)
            com.google.common.util.concurrent.cx r12 = r0.mo78566i(r12)
            com.google.android.apps.gsa.staticplugins.w.h.ad r0 = new com.google.android.apps.gsa.staticplugins.w.h.ad
            r0.<init>(r10, r13, r11)
            com.google.common.util.concurrent.bg r11 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r12, r0, r11)
            goto L_0x0862
        L_0x0673:
            java.lang.Class<android.os.Bundle> r11 = android.os.Bundle.class
            android.os.Parcelable r11 = r13.mo81912b(r11)
            android.os.Bundle r11 = (android.os.Bundle) r11
            java.lang.String r12 = "active_notifications"
            android.os.Parcelable[] r11 = r11.getParcelableArray(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            if (r11 == 0) goto L_0x0697
            r0 = r11
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r11 = r11.length
            java.lang.Class<com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper[]> r1 = com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper[].class
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r0, r11, r1)
            com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper[] r11 = (com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper[]) r11
            java.util.Collections.addAll(r12, r11)
        L_0x0697:
            com.google.android.apps.gsa.search.core.al.bl.a r11 = r10.f327210y
            r11.mo78565h(r12)
            goto L_0x0862
        L_0x069e:
            r10.mo103466a()
            goto L_0x0862
        L_0x06a3:
            com.google.android.libraries.assistant.auto.tng.l.n r11 = r10.f327187aa
            com.google.common.util.concurrent.cx r11 = r11.mo21336a()
            com.google.android.apps.gsa.staticplugins.w.h.ac r12 = new com.google.android.apps.gsa.staticplugins.w.h.ac
            r12.<init>()
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r11, r12, r0)
            com.google.android.apps.gsa.g.c.b r11 = r10.f327168H
            r11.a()
            com.google.android.apps.gsa.search.core.al.b.b r11 = r10.f327179S
            dagger.a r12 = r10.f327162B
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r12 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r12
            r11.mo78497q(r12)
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88105pi.f238198a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r12.mo58857o(r11)
            if (r11 == 0) goto L_0x0862
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88105pi.f238198a
            com.google.android.apps.gsa.search.shared.service.b.bw r12 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r12.mo58887l(r11)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r0 = r11.f169971d
            java.lang.Object r12 = r12.mo58854l(r0)
            if (r12 != 0) goto L_0x06f2
            java.lang.Object r11 = r11.f169969b
            goto L_0x06f6
        L_0x06f2:
            java.lang.Object r11 = r11.mo58889c(r12)
        L_0x06f6:
            com.google.android.apps.gsa.search.shared.service.b.pk r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk) r11
            int r12 = r11.f238201a
            r12 = r12 & r2
            if (r12 == 0) goto L_0x0862
            com.google.common.base.ax r12 = r10.f327211z
            boolean r12 = r12.mo56113h()
            if (r12 == 0) goto L_0x0862
            com.google.common.base.ax r12 = r10.f327211z
            java.lang.Object r12 = r12.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r12 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r12
            boolean r11 = r11.f238202b
            r12.mo96441f(r11)
            com.google.common.base.ax r11 = r10.f327211z
            java.lang.Object r11 = r11.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r11 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r11
            r11.mo96446k(r3)
            goto L_0x0862
        L_0x071f:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r0.mo58887l(r11)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r0.mo58857o(r11)
            if (r11 != 0) goto L_0x0748
            com.google.common.f.x r11 = r12.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r0)
            java.lang.String r12 = "OpaClientInputEvent extension is missing. Bail out."
            r0 = 18754(0x4942, float:2.628E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x0862
        L_0x0748:
            com.google.protobuf.bt r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r13.f236955a
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r0.mo58887l(r11)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r4 = r11.f169971d
            java.lang.Object r0 = r0.mo58854l(r4)
            if (r0 != 0) goto L_0x0760
            java.lang.Object r11 = r11.f169969b
            goto L_0x0764
        L_0x0760:
            java.lang.Object r11 = r11.mo58889c(r0)
        L_0x0764:
            com.google.android.apps.gsa.search.shared.service.b.oy r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r11
            if (r11 != 0) goto L_0x077c
            com.google.common.f.x r11 = r12.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r0)
            java.lang.String r12 = "OpaClientInputEvent extension is null. Bail out."
            r0 = 18753(0x4941, float:2.6279E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x0862
        L_0x077c:
            int r0 = r11.f238176a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x07b2
            com.google.protobuf.z r0 = r11.f238177b
            int r0 = r0.mo59031d()
            if (r0 != 0) goto L_0x078a
            goto L_0x07b2
        L_0x078a:
            com.google.protobuf.z r11 = r11.f238177b     // Catch:{ ct -> 0x0795 }
            com.google.assistant.e.j.du r12 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ ct -> 0x0795 }
            com.google.protobuf.bv r11 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r12, (com.google.protobuf.C63088z) r11)     // Catch:{ ct -> 0x0795 }
            com.google.assistant.e.j.du r11 = (com.google.assistant.p3897e.p3921j.C51805du) r11     // Catch:{ ct -> 0x0795 }
            goto L_0x07ab
        L_0x0795:
            r11 = move-exception
            com.google.common.f.e r12 = f327159a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "CarAssistantSessCtlr"
            r12.mo56378ag(r0, r2)
            java.lang.String r0 = "Trying to parse invalid ClientInput."
            r2 = 18752(0x4940, float:2.6277E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56382g(r11)).mo56372aa(r2)).mo56386p(r0)
            r11 = r1
        L_0x07ab:
            if (r11 == 0) goto L_0x0862
            r10.mo103471p(r11, r1)
            goto L_0x0862
        L_0x07b2:
            com.google.common.f.x r11 = r12.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r0)
            java.lang.String r12 = "Client input is empty. Bail out."
            r0 = 18751(0x493f, float:2.6276E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x0862
        L_0x07c6:
            r10.mo103468m()
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f327192f
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250467dg
            boolean r11 = r11.mo79746e(r12)
            r2 = r2 ^ r11
            goto L_0x089b
        L_0x07d4:
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r11 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r11 = r13.mo81912b(r11)
            com.google.android.apps.gsa.shared.search.Query r11 = (com.google.android.apps.gsa.shared.search.Query) r11
            boolean r11 = r10.mo103473r(r11)
            r2 = r2 ^ r11
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f327192f
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250310ai
            boolean r11 = r11.mo79746e(r12)
            if (r11 == 0) goto L_0x089b
            com.google.android.apps.gsa.shared.util.v r11 = r10.f327188ab
            boolean r11 = r11.mo85390b()
            if (r11 == 0) goto L_0x089b
            com.google.android.apps.gsa.search.core.al.s.a.b r11 = r10.f327186Z
            r11.mo79083a()
            goto L_0x089b
        L_0x07fa:
            r10.mo103469n()
            goto L_0x089b
        L_0x07ff:
            r10.m195863t(r3)
            goto L_0x0862
        L_0x0803:
            r10.m195863t(r2)
            goto L_0x0862
        L_0x0807:
            java.lang.Class<com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList> r11 = com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList.class
            boolean r11 = r13.mo81913d(r11)
            if (r11 != 0) goto L_0x0822
            com.google.common.f.x r11 = r12.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r0)
            java.lang.String r12 = "performLegacyActiveNotificationWork(): empty remote notifications list"
            r0 = 18763(0x494b, float:2.6293E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x0862
        L_0x0822:
            java.lang.Class<com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList> r11 = com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList.class
            android.os.Parcelable r11 = r13.mo81912b(r11)
            com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList r11 = (com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList) r11
            com.google.common.b.gu r11 = r11.mo70914a()
            int r0 = r11.size()
            if (r0 != r2) goto L_0x0840
            java.lang.Object r11 = r11.get(r3)
            com.google.android.apps.gsa.handsfree.notifications.RemoteNotification r11 = (com.google.android.apps.gsa.handsfree.notifications.RemoteNotification) r11
            com.google.android.apps.gsa.search.core.al.ar.a r12 = r10.f327161A
            r12.mo78444b(r11)
            goto L_0x0862
        L_0x0840:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0862
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "CarAssistantSessCtlr"
            r12.mo56378ag(r0, r1)
            java.lang.String r0 = "handleTouchTriggeredMessageList. # of notification(%d) != 1."
            int r11 = r11.size()
            r1 = 18761(0x4949, float:2.629E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56387q(r0, r11)
            goto L_0x0862
        L_0x085d:
            com.google.android.apps.gsa.search.core.al.cj.a r11 = r10.f327209x
            r11.mo78724a()
        L_0x0862:
            r2 = 0
            goto L_0x089b
        L_0x0864:
            java.lang.Class<com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList> r11 = com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList.class
            boolean r11 = r13.mo81913d(r11)
            if (r11 != 0) goto L_0x087f
            com.google.common.f.x r11 = r12.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "CarAssistantSessCtlr"
            r11.mo56378ag(r12, r0)
            java.lang.String r12 = "onNewActiveNotifications(). No parcelable ParcelableRemoteNotificationsList."
            r0 = 18740(0x4934, float:2.626E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x0862
        L_0x087f:
            java.lang.Class<com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList> r11 = com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList.class
            android.os.Parcelable r11 = r13.mo81912b(r11)
            com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList r11 = (com.google.android.apps.gsa.handsfree.notifications.ParcelableRemoteNotificationsList) r11
            com.google.common.b.gu r12 = r11.mo70914a()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0862
            com.google.android.apps.gsa.search.core.al.cj.a r0 = r10.f327209x
            boolean r11 = r11.mo70915b()
            r0.mo78725b(r12, r11)
            goto L_0x0862
        L_0x089b:
            if (r2 == 0) goto L_0x08a0
            r14.mo80279a(r13)
        L_0x08a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8793w.p8816h.C117886ai.mo80293f(long, com.google.android.apps.gsa.search.shared.service.ClientEventData, com.google.android.apps.gsa.search.core.service.e.c):void");
    }

    /* renamed from: g */
    public final void mo80294g(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            this.f327178R.b();
            this.f327174N.mo103480b(this.f327182V);
        }
        if (this.f327192f.mo79746e(C90086ek.f250321at)) {
            mo103472q(C88244um.CLIENT_NOT_ACTIVATED);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: h */
    public final void mo80295h() {
        if (this.f327192f.mo79746e(C90086ek.f250467dg)) {
            this.f327165E.mo103502d();
        }
        C117909a aVar = this.f327207v;
        aVar.f327270a.mo80761o(aVar);
        aVar.f327271b = C58836b.f156633a;
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        C86775r rVar = (C86775r) aVar;
        this.f327184X = rVar.f234384f.f236951d;
        C58833ax axVar = this.f327173M.f327212a;
        C88248uq uqVar = (C88248uq) C88249ur.f238702d.createBuilder();
        long j = this.f327182V;
        uqVar.copyOnWrite();
        C88249ur urVar = (C88249ur) uqVar.instance;
        urVar.f238704a |= 1;
        urVar.f238705b = j;
        if (axVar.mo56113h()) {
            C87734bp bpVar = (C87734bp) axVar.mo56107c();
            uqVar.copyOnWrite();
            C88249ur urVar2 = (C88249ur) uqVar.instance;
            bpVar.getClass();
            urVar2.f238706c = bpVar;
            urVar2.f238704a |= 2;
        }
        C86771n nVar = rVar.f234383e;
        C87684al alVar = new C87684al(C88244um.SESSION_STARTED);
        alVar.mo81965b(C88247up.f238701a, (C88249ur) uqVar.build());
        nVar.mo80379b(alVar.mo81964a());
        if (this.f327192f.mo79746e(C90086ek.f250467dg)) {
            this.f327165E.mo103501c(rVar.f234383e);
        }
        if (this.f327192f.mo79746e(C90086ek.f250411cd)) {
            new C90873ag(this.f327177Q.mo78523a(), this.f327167G, "onPlaybackStateChanged", C118069o.f327689a).mo85223a(C118070p.f327690a);
        }
        if (this.f327188ab.mo85390b()) {
            this.f327174N.mo103479a(this.f327182V, rVar.f234384f, new C118077w(this));
        }
        if (this.f327208w.mo56113h()) {
            ((C85702a) this.f327208w.mo56107c()).mo79336b();
        }
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        C58976aa aaVar = C58975e.f156826a;
        this.f327182V = j;
        if (this.f327208w.mo56113h()) {
            ((C85702a) this.f327208w.mo56107c()).mo79335a();
        }
        C117909a aVar = this.f327207v;
        aVar.f327270a.mo80760l(aVar);
        C62940bt r6 = C62942bv.checkIsLite(C88407ae.f239046a);
        bbVar.mo58887l(r6);
        if (bbVar.f169962ag.mo58857o(r6.f169971d)) {
            C62940bt r62 = C62942bv.checkIsLite(C88407ae.f239046a);
            bbVar.mo58887l(r62);
            Object l = bbVar.f169962ag.mo58854l(r62.f169971d);
            if (l == null) {
                obj = r62.f169969b;
            } else {
                obj = r62.mo58889c(l);
            }
            Context context = this.f327189c;
            Intent b = C89429a.m145444b(context, "com.google.android.apps.gsa.binaries.auto.app.voiceplate.VoicePlateActivity");
            b.putExtra("handover-session-id", j);
            b.addFlags(268435456);
            context.startActivity(b);
            Query query = (Query) C90772bp.m148301i(((C88406ad) obj).f239036b, Query.CREATOR);
            if (query == null) {
                C59104x d = f327159a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CarAssistantSessCtlr");
                ((C59052c) ((C59052c) d).mo56372aa(18746)).mo56386p("Failed to construct query from hotword query context");
                int i = C90755l.f253831a;
                return;
            }
            mo103473r(query);
        }
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }

    /* renamed from: m */
    public final void mo103468m() {
        if (this.f327192f.mo79746e(C90086ek.f250467dg)) {
            C118024cn cnVar = (C118024cn) this.f327193g.mo27525b();
            C58976aa aaVar = C58975e.f156826a;
            C86577w wVar = cnVar.f327564w;
            if (wVar != null) {
                C60537to toVar = C60537to.UNKNOWN_STATE;
                wVar.mo80181b();
                cnVar.f327564w = null;
                cnVar.f327543b.mo103500b();
            }
            if (cnVar.f327563v.mo56113h()) {
                ((C74458k) cnVar.f327563v.mo56107c()).mo70778e();
            }
            C58833ax a = cnVar.mo103495a();
            if (a.mo56113h()) {
                cnVar.f327554m.mo80167b((Query) a.mo56107c(), 465, C60537to.BACK_PRESSED, (C90456c) null);
            }
        }
        C117936f fVar = (C117936f) this.f327166F.mo27525b();
        C58817ah ahVar = fVar.f327337a;
        if (ahVar != null) {
            C60870cx cxVar = (C60870cx) ahVar.apply((Object) null);
            fVar.f327337a = null;
        }
    }

    /* renamed from: n */
    public final void mo103469n() {
        C58976aa aaVar = C58975e.f156826a;
        this.f327194h.mo77890d();
        new C90873ag(this.f327172L, this.f327167G, "online - stopSpeaking", C118080z.f327705a).mo85223a(C117878aa.f327145a);
        new C90873ag(this.f327171K, this.f327167G, "offline - stopSpeaking", C117879ab.f327146a).mo85223a(C117888b.f327213a);
    }

    /* renamed from: o */
    public final void mo103470o(int i) {
        m195865v(this.f327196j, new TtsRequest(this.f327195i.getString(i), false));
    }

    /* renamed from: p */
    public final void mo103471p(C51805du duVar, String str) {
        C58976aa aaVar = C58975e.f156826a;
        Query query = this.f327196j;
        if (str != null) {
            query = query.mo84278aO("user-agent-suffix", str);
            if (this.f327192f.mo79746e(C90086ek.f250506es)) {
                query = query.mo84278aO("application-id-override", "gearhead");
            }
        }
        C87684al alVar = new C87684al(C88244um.ASSISTANT_REQUEST_ID);
        alVar.mo81966c(query);
        ServiceEventData a = alVar.mo81964a();
        C87682aj ajVar = this.f327170J.f234157a;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(a);
        }
        new C90873ag(this.f327172L, this.f327167G, "sendClientInput", new C118073s(str, duVar, new C84367m(query))).mo85223a(C118074t.f327696a);
    }

    /* renamed from: q */
    public final void mo103472q(C88244um umVar) {
        C87682aj ajVar = this.f327170J.f234157a;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(new C87684al(umVar).mo81964a());
        }
    }

    /* renamed from: r */
    public final boolean mo103473r(Query query) {
        Parcelable h;
        C58833ax axVar;
        C85698m mVar;
        C85697l lVar;
        C85697l lVar2;
        if (m195868y() || m195869z() || m195867x() || m195866w()) {
            return true;
        }
        if (this.f327184X == amo.ANDROID_AUTO_PROJECTED) {
            C117907d dVar = this.f327163C;
            if (query.mo84456dj() || query.mo84455di() || query.mo84453dg() || query.mo84454dh()) {
                C85685a aVar = dVar.f327264d;
                C58833ax a = aVar.f231713e.mo79314a(1);
                long a2 = aVar.f231714f.mo79743a(C90086ek.f250473dm);
                if (!a.mo56113h() || ((long) ((C85694i) a.mo56107c()).f231734d) >= a2 || !aVar.mo79313b()) {
                    axVar = C58836b.f156633a;
                } else {
                    C85694i iVar = (C85694i) a.mo56107c();
                    int i = iVar.f231734d;
                    int i2 = i + 1;
                    int i3 = C85685a.f231711c - i;
                    if (i3 > 0) {
                        int nextInt = C58851bo.f156649a.nextInt(i3);
                        int i4 = 1;
                        int i5 = 0;
                        while (true) {
                            if (i4 > C85685a.f231712d) {
                                mVar = C85698m.UNKNOWN_QUERY_TYPE;
                                break;
                            }
                            if (iVar.f231732b == 2) {
                                lVar2 = (C85697l) iVar.f231733c;
                            } else {
                                lVar2 = C85697l.f231736b;
                            }
                            C62995dn dnVar = lVar2.f231738a;
                            Integer valueOf = Integer.valueOf(i4);
                            if ((!dnVar.containsKey(valueOf) || ((Integer) dnVar.get(valueOf)).intValue() <= 0) && !C85685a.f231710b.contains(C85698m.m137663a(i4))) {
                                if (i5 == nextInt) {
                                    mVar = C85698m.m137663a(i4);
                                    break;
                                }
                                i5++;
                            }
                            i4++;
                        }
                    } else {
                        mVar = C85698m.UNKNOWN_QUERY_TYPE;
                    }
                    C85689d dVar2 = aVar.f231713e;
                    C85693h hVar = (C85693h) C85694i.f231729e.createBuilder();
                    hVar.copyOnWrite();
                    C85694i iVar2 = (C85694i) hVar.instance;
                    iVar2.f231731a |= 1;
                    iVar2.f231734d = i2;
                    if (iVar.f231732b == 2) {
                        lVar = (C85697l) iVar.f231733c;
                    } else {
                        lVar = C85697l.f231736b;
                    }
                    C85695j jVar = (C85695j) lVar.toBuilder();
                    int i6 = mVar.f231745f;
                    jVar.copyOnWrite();
                    C85697l lVar3 = (C85697l) jVar.instance;
                    C62995dn dnVar2 = lVar3.f231738a;
                    if (!dnVar2.f170058b) {
                        lVar3.f231738a = dnVar2.mo58980a();
                    }
                    lVar3.f231738a.put(Integer.valueOf(i6), 1);
                    hVar.copyOnWrite();
                    C85694i iVar3 = (C85694i) hVar.instance;
                    C85697l lVar4 = (C85697l) jVar.build();
                    lVar4.getClass();
                    iVar3.f231733c = lVar4;
                    iVar3.f231732b = 2;
                    dVar2.mo79315b(1, (C85694i) hVar.build());
                    if (((long) iVar.f231734d) < aVar.f231714f.mo79743a(C90086ek.f250472dl)) {
                        int ordinal = mVar.ordinal();
                        if (ordinal == 1) {
                            axVar = C58833ax.m90834k(aVar.f231715g.getString(R.string.voiceplate_query_suggestion_drive_to_gas_station));
                        } else if (ordinal == 2) {
                            axVar = C58833ax.m90834k(aVar.f231715g.getString(R.string.voiceplate_query_suggestion_play_music));
                        } else if (ordinal == 3) {
                            axVar = C58833ax.m90834k(aVar.f231715g.getString(R.string.voiceplate_query_suggestion_make_a_call));
                        } else if (ordinal != 4) {
                            C59104x d = C85685a.f231709a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "DiscoInfoProvider");
                            ((C59052c) ((C59052c) d).mo56372aa(7562)).mo56389s("Unknown query type: %s", mVar.name());
                            axVar = C58836b.f156633a;
                        } else {
                            axVar = C58833ax.m90834k(aVar.f231715g.getString(R.string.voiceplate_query_suggestion_play_news));
                        }
                    } else {
                        axVar = C58836b.f156633a;
                    }
                }
                if (axVar.mo56113h()) {
                    C58976aa aaVar = C58975e.f156826a;
                    axVar.mo56107c();
                    C87684al alVar = new C87684al(C88244um.CAR_ASSISTANT_DISCOVERABILITY_INFO);
                    C62940bt btVar = C87714aw.f237185a;
                    C87715ax axVar2 = (C87715ax) C87716ay.f237186c.createBuilder();
                    C16717ae aeVar = (C16717ae) C16718af.f48884c.createBuilder();
                    C16731as asVar = (C16731as) C16732at.f48938c.createBuilder();
                    String str = (String) axVar.mo56107c();
                    asVar.copyOnWrite();
                    C16732at atVar = (C16732at) asVar.instance;
                    str.getClass();
                    atVar.f48940a |= 1;
                    atVar.f48941b = str;
                    aeVar.copyOnWrite();
                    C16718af afVar = (C16718af) aeVar.instance;
                    C16732at atVar2 = (C16732at) asVar.build();
                    atVar2.getClass();
                    afVar.f48887b = atVar2;
                    afVar.f48886a = 2;
                    axVar2.copyOnWrite();
                    C87716ay ayVar = (C87716ay) axVar2.instance;
                    C16718af afVar2 = (C16718af) aeVar.build();
                    afVar2.getClass();
                    ayVar.f237189b = afVar2;
                    ayVar.f237188a |= 1;
                    alVar.mo81965b(btVar, (C87716ay) axVar2.build());
                    dVar.mo103482a(alVar.mo81964a());
                }
            }
        }
        boolean e = this.f327192f.mo79746e(C90086ek.f250402cU);
        if (!this.f327192f.mo79746e(C90086ek.f250467dg) || (!e && !query.mo84420dA())) {
            if ((!this.f327188ab.mo85390b() && !this.f327192f.mo79746e(C90086ek.f250490ec)) || !query.mo84392cY()) {
                return false;
            }
            ((C117936f) this.f327166F.mo27525b()).mo103484a(query);
            return true;
        } else if (!query.mo84372cE() || !this.f327192f.mo79746e(C90086ek.f250495eh)) {
            if (query.mo84456dj() && !query.mo84316bA() && this.f327183W.mo56113h()) {
                query = query.mo84279aP(((Long) this.f327183W.mo56107c()).longValue());
            }
            ((C118024cn) this.f327193g.mo27525b()).mo103496b(query.mo84445dZ());
            return true;
        } else if (query.f252786y == null || (h = query.mo84478h("notification-message")) == null || !(h instanceof TtsRequest)) {
            C59104x d2 = f327159a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "CarAssistantSessCtlr");
            ((C59052c) ((C59052c) d2).mo56372aa(18757)).mo56386p("Could not parse query TTS.");
            return false;
        } else {
            m195865v(query, (TtsRequest) h);
            return true;
        }
    }

    /* renamed from: s */
    public final void mo103474s() {
        if (this.f327192f.mo79746e(C90086ek.f250515m) && ((C9311c) this.f327202p.mo27525b()).f32303b.get() > 0) {
            this.f327167G.mo28202b("TTS system exited cold boot", new C117910e(this));
        }
        this.f327203q.mo79322d(C89849ae.ASSISTANT_AUTO_COLD_BOOT_END);
    }
}
