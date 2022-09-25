package com.google.android.apps.gsa.staticplugins.p8793w;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.c.l;
import com.google.android.apps.gsa.handsfree.k;
import com.google.android.apps.gsa.languagepack.av;
import com.google.android.apps.gsa.p5836c.C74453e;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.search.core.carassistant.C85729g;
import com.google.android.apps.gsa.search.core.carassistant.C85737o;
import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C89977ap;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.C90499g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11791b;
import com.google.android.libraries.assistant.auto.jumpboost.p649a.p652c.C11432a;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1010a.C13637a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59583ak;
import com.google.common.p4552o.C59584al;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.al */
/* compiled from: PG */
public final class C117724al implements CarAssistantSessionManager {

    /* renamed from: a */
    public static final C59071e f326726a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.al");

    /* renamed from: A */
    private final C117728ap f326727A;

    /* renamed from: B */
    private final C68214a f326728B;

    /* renamed from: C */
    private final C74453e f326729C;

    /* renamed from: D */
    private final C22871g f326730D;

    /* renamed from: E */
    private final l f326731E;

    /* renamed from: F */
    private final C68214a f326732F;

    /* renamed from: G */
    private final C22871g f326733G;

    /* renamed from: H */
    private final C22871g f326734H;

    /* renamed from: I */
    private boolean f326735I;

    /* renamed from: J */
    private boolean f326736J;

    /* renamed from: K */
    private C58485gu f326737K = C58485gu.m89845m();

    /* renamed from: L */
    private boolean f326738L = false;

    /* renamed from: M */
    private SearchError f326739M;

    /* renamed from: N */
    private C58833ax f326740N;

    /* renamed from: O */
    private C58833ax f326741O;

    /* renamed from: P */
    private final C68214a f326742P;

    /* renamed from: Q */
    private C85729g f326743Q;

    /* renamed from: R */
    private final C13637a f326744R;

    /* renamed from: S */
    private final C117734av f326745S;

    /* renamed from: T */
    private int f326746T = 3;

    /* renamed from: U */
    private final C117732at f326747U;

    /* renamed from: V */
    private final C117732at f326748V;

    /* renamed from: b */
    public final C22871g f326749b;

    /* renamed from: c */
    public final C92194i f326750c;

    /* renamed from: d */
    public final C85700a f326751d;

    /* renamed from: e */
    public final C68214a f326752e;

    /* renamed from: f */
    public final C11432a f326753f;

    /* renamed from: g */
    public final Queue f326754g;

    /* renamed from: h */
    public final C117723ak f326755h;

    /* renamed from: i */
    public Long f326756i;

    /* renamed from: j */
    public boolean f326757j;

    /* renamed from: k */
    public boolean f326758k;

    /* renamed from: l */
    public boolean f326759l;

    /* renamed from: m */
    public boolean f326760m;

    /* renamed from: n */
    public List f326761n;

    /* renamed from: o */
    public final C85710c f326762o;

    /* renamed from: p */
    public final av f326763p;

    /* renamed from: q */
    private final C11791b f326764q;

    /* renamed from: r */
    private final C86124t f326765r;

    /* renamed from: s */
    private final C91077d f326766s;

    /* renamed from: t */
    private final k f326767t;

    /* renamed from: u */
    private final C87673aa f326768u;

    /* renamed from: v */
    private final C117730ar f326769v;

    /* renamed from: w */
    private final C68214a f326770w;

    /* renamed from: x */
    private final CarAssistantSessionManager.Config f326771x;

    /* renamed from: y */
    private final C85737o f326772y;

    /* renamed from: z */
    private final C21370a f326773z;

    public C117724al(C11791b bVar, C86124t tVar, C22871g gVar, C91077d dVar, C92194i iVar, C85700a aVar, k kVar, C87673aa aaVar, C117730ar arVar, C117734av avVar, C68214a aVar2, CarAssistantSessionManager.Config config, C117733au auVar, C85737o oVar, C68214a aVar3, C21370a aVar4, C117728ap apVar, C68214a aVar5, C74453e eVar, C22871g gVar2, l lVar, C68214a aVar6, C22871g gVar3, C68214a aVar7, C11432a aVar8, av avVar2, C85710c cVar, C90821bm bmVar, C13637a aVar9) {
        C87673aa aaVar2 = aaVar;
        C117733au auVar2 = auVar;
        C117723ak akVar = new C117723ak();
        this.f326755h = akVar;
        C60856cj.m92900i(false);
        this.f326760m = false;
        this.f326761n = new ArrayList();
        C58836b bVar2 = C58836b.f156633a;
        this.f326740N = bVar2;
        this.f326741O = bVar2;
        this.f326764q = bVar;
        this.f326765r = tVar;
        this.f326749b = gVar;
        this.f326766s = dVar;
        this.f326750c = iVar;
        this.f326751d = aVar;
        this.f326767t = kVar;
        this.f326768u = aaVar2;
        this.f326769v = arVar;
        this.f326745S = avVar;
        this.f326770w = aVar2;
        this.f326771x = config;
        this.f326772y = oVar;
        this.f326742P = aVar3;
        this.f326773z = aVar4;
        this.f326727A = apVar;
        this.f326728B = aVar5;
        this.f326729C = eVar;
        this.f326730D = gVar2;
        this.f326731E = lVar;
        this.f326732F = aVar6;
        this.f326733G = gVar3;
        this.f326752e = aVar7;
        this.f326753f = aVar8;
        this.f326763p = avVar2;
        this.f326762o = cVar;
        this.f326744R = aVar9;
        C118569b bVar3 = C118569b.OPA_AUTO_CONVERSATION_END_TIMEOUT_COUNT;
        Objects.requireNonNull(this);
        this.f326747U = auVar2.mo103446a("sessionTimeout", bVar3, new C118099r(this));
        this.f326748V = auVar2.mo103446a("voiceplateRetentionDelayEndTimeout", (C118569b) null, new C118100s(this));
        this.f326734H = bmVar.mo85163a(C117721ai.class);
        this.f326754g = new C58425eo((int) tVar.mo79743a(C90086ek.f250486dz));
        akVar.mo103435a(new C117718af(this));
        akVar.mo103435a(new C117720ah(gVar, aaVar2));
    }

    /* renamed from: o */
    private final C60870cx m195617o() {
        return this.f326734H.mo28209i(this.f326763p.e((C90936cf) null), "Initialize languagePackUpdateController", new C118096o(this));
    }

    /* renamed from: p */
    private final void m195618p() {
        C59104x b = f326726a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
        ((C59052c) ((C59052c) b).mo56372aa(18483)).mo56386p("Cancelling sessionTimeout.");
        this.f326747U.mo103444a();
    }

    /* renamed from: q */
    private final void m195619q(Function function, C22869e eVar, String str) {
        new C90873ag(this.f326730D.mo28209i(this.f326764q.mo20150c(), str, new C118086j(function)), this.f326730D, str, new C118102u(this, str, eVar)).mo85223a(new C117713aa(str));
    }

    /* renamed from: r */
    private final void m195620r(boolean z) {
        this.f326738L = true;
        new C90873ag(m195617o(), this.f326749b, "log end event", new C117852e(this, z)).mo85223a(new C117855f(this, z));
    }

    /* renamed from: s */
    private final void m195621s(String str, String str2) {
        if (!this.f326765r.mo79746e(C90086ek.f250438dD)) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (this.f326735I) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                C59104x d = f326726a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
                ((C59052c) ((C59052c) d).mo56372aa(18528)).mo56386p("Third party agent missing icon and/or name");
                return;
            }
            this.f326735I = true;
            this.f326736J = false;
            m195619q(C118106y.f327746a, new C118107z(this, str, str2), "#onThirdPartyProviderInfo");
        }
    }

    /* renamed from: t */
    private final synchronized void m195622t(ServiceEventData serviceEventData) {
        C58976aa aaVar = C58975e.f156826a;
        SearchError searchError = null;
        if (serviceEventData.mo81913d(ParcelableVoiceAction.class)) {
            VoiceAction voiceAction = ((ParcelableVoiceAction) serviceEventData.mo81912b(ParcelableVoiceAction.class)).f236008a;
            if (voiceAction instanceof SearchError) {
                SearchError searchError2 = (SearchError) voiceAction;
                if (searchError2 != null) {
                    searchError = searchError2;
                }
            }
        }
        this.f326739M = searchError;
        if (searchError == null || searchError.mo81135N() != C89885b.RECOGNIZER_GENERAL_VOICE_SEARCH_TIMEOUT.f246280a) {
            this.f326751d.mo79325g(mo79300b());
        } else {
            this.f326751d.mo79331m(mo79300b());
        }
        m195619q(C117735b.f326802a, new C117758c(this), "#updateRecognitionState");
    }

    /* renamed from: u */
    private final void m195623u() {
        long a = this.f326765r.mo79743a(C90086ek.f250445dK);
        C58976aa aaVar = C58975e.f156826a;
        this.f326747U.mo103445b((int) a);
    }

    /* renamed from: v */
    private final void m195624v(ServiceEventData serviceEventData) {
        m195623u();
        if (serviceEventData.mo81913d(Query.class) && !((Query) serviceEventData.mo81912b(Query.class)).mo84385cR()) {
            this.f326740N = C58833ax.m90834k((Query) serviceEventData.mo81912b(Query.class));
            this.f326751d.mo79332n((Query) serviceEventData.mo81912b(Query.class));
            C58976aa aaVar = C58975e.f156826a;
            C39191a.m68623b(((Query) this.f326740N.mo56107c()).f252749G);
        }
    }

    /* renamed from: w */
    private final void m195625w(int i) {
        C58976aa aaVar = C58975e.f156826a;
        int i2 = this.f326746T;
        if (i2 != 0) {
            if (m195626x(i)) {
                this.f326751d.mo79322d(C89849ae.ASSISTANT_AUTO_ROUTINE_EXECUTION_STARTED);
            } else if (i2 == 4 && i == 7) {
                this.f326751d.mo79322d(C89849ae.ASSISTANT_AUTO_ROUTINE_EXECUTION_ENDED);
                i = 7;
            } else if (i == 8) {
                this.f326751d.mo79322d(C89849ae.ASSISTANT_AUTO_ROUTINE_EXECUTION_FAILED);
            } else {
                C59104x d = f326726a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
                ((C59052c) ((C59052c) d).mo56372aa(18517)).mo56386p("Routine Appflow not logged");
            }
            if (m195626x(i)) {
                m195619q(C117716ad.f326717a, new C117717ae(this), "#onRoutineExecutionStart");
            }
            this.f326746T = i;
            return;
        }
        throw null;
    }

    /* renamed from: x */
    private final boolean m195626x(int i) {
        if (this.f326746T == 3) {
            return i == 5 || i == 4;
        }
        return false;
    }

    /* renamed from: a */
    public final C87726bh mo79299a() {
        return this.f326755h.f326724a;
    }

    /* renamed from: b */
    public final C59687cb mo79300b() {
        C59687cb cbVar = C59687cb.f160034bf;
        C58833ax axVar = this.f326740N;
        C58833ax axVar2 = this.f326741O;
        if (axVar.mo56113h()) {
            cbVar = C90499g.m147582b((Query) axVar.mo56107c(), ((SharedPreferences) this.f326728B.mo27525b()).getLong("last_missed_hotword_time_ms", -1), axVar2);
            if (axVar2.mo56113h()) {
                C58976aa aaVar = C58975e.f156826a;
                C39191a.m68623b(((Query) axVar.mo56107c()).f252749G);
                axVar2.mo56107c();
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                C39191a.m68623b(((Query) axVar.mo56107c()).f252749G);
            }
        }
        SearchError searchError = this.f326739M;
        if (searchError != null) {
            C59582aj ajVar = (C59582aj) cbVar.toBuilder();
            C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
            int O = searchError.mo81136O();
            eVar.copyOnWrite();
            C59770f fVar = (C59770f) eVar.instance;
            fVar.f161503a |= 1;
            fVar.f161504b = O;
            int N = searchError.mo81135N();
            eVar.copyOnWrite();
            C59770f fVar2 = (C59770f) eVar.instance;
            fVar2.f161503a |= 2;
            fVar2.f161505c = N;
            ajVar.mo57008e((C59770f) eVar.build());
            cbVar = (C59687cb) ajVar.build();
        }
        if (this.f326765r.mo79746e(C89977ap.f246593a)) {
            C59582aj ajVar2 = (C59582aj) cbVar.toBuilder();
            C59583ak akVar = (C59583ak) C59584al.f159003e.createBuilder();
            String g = C58837ba.m90858g(this.f326771x.mo79280h());
            akVar.copyOnWrite();
            C59584al alVar = (C59584al) akVar.instance;
            alVar.f159005a |= 1;
            alVar.f159006b = g;
            String i = this.f326771x.mo79282i();
            akVar.copyOnWrite();
            C59584al alVar2 = (C59584al) akVar.instance;
            alVar2.f159005a |= 2;
            alVar2.f159007c = C58837ba.m90858g(i);
            C13637a aVar = this.f326744R;
            C58976aa aaVar3 = C58975e.f156826a;
            boolean z = aVar.f41675a;
            akVar.copyOnWrite();
            C59584al alVar3 = (C59584al) akVar.instance;
            alVar3.f159005a |= 4;
            alVar3.f159008d = z;
            C59584al alVar4 = (C59584al) akVar.build();
            ajVar2.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar2.instance;
            alVar4.getClass();
            cbVar2.f160077aO = alVar4;
            cbVar2.f160123d |= 256;
            cbVar = (C59687cb) ajVar2.build();
        }
        if (!cbVar.equals(C59687cb.f160034bf)) {
            return cbVar;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo79301c() {
        C59104x b = f326726a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
        ((C59052c) ((C59052c) b).mo56372aa(18481)).mo56386p("activate()");
        if (!this.f326757j) {
            C22871g gVar = this.f326733G;
            C68214a aVar = this.f326732F;
            Objects.requireNonNull(aVar);
            gVar.mo28212l("Prewarm S3 Personalization", new C117849d(aVar));
            this.f326768u.mo81932c();
            if (this.f326771x.mo79275d() == 0) {
                Bundle bundle = new Bundle();
                bundle.putString("source", this.f326771x.mo79285l());
                this.f326768u.mo81947s(bundle);
            } else {
                this.f326768u.mo81946r(this.f326771x.mo79275d(), (Bundle) null, C88431bb.f239082a);
            }
            this.f326768u.mo81937i(new C88489j(C87739bu.GEARHEAD_CONNECTED).mo82013a());
            this.f326757j = true;
        }
    }

    /* renamed from: e */
    public final void mo79302e() {
        C59104x b = f326726a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
        ((C59052c) ((C59052c) b).mo56372aa(18482)).mo56355H("cancelSession(): sessionStateManager: %s, isActive: %b", this.f326755h.f326724a, this.f326757j);
        int i = this.f326746T;
        if (i == 5 || i == 4) {
            this.f326751d.mo79322d(C89849ae.ASSISTANT_AUTO_ROUTINE_EXECUTION_CANCELLED);
        }
        mo103440l();
    }

    /* renamed from: f */
    public final void mo79303f() {
        if (!this.f326727A.f326782b) {
            C59104x b = f326726a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
            ((C59052c) ((C59052c) b).mo56372aa(18493)).mo56389s("deactivate(): isHandingOver=%b", false);
            if (this.f326757j) {
                this.f326757j = false;
                this.f326768u.mo81937i(new C88489j(C87739bu.GEARHEAD_DISCONNECTED).mo82013a());
                mo103440l();
                this.f326768u.mo81948t(false);
                this.f326768u.mo81933e();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:171|172) */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r0 = f326726a.mo56225c();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "CarAssistantSessionMgr");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(18478)).mo56354G("Failed to parse %s argument from %s client op", "third_party_start_indicator_args", r4.f135936b);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x0495 */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x041b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x043a A[Catch:{ ct -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04b6 A[Catch:{ ct -> 0x04d1 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79304g(com.google.android.apps.gsa.search.shared.service.ServiceEventData r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            com.google.android.apps.gsa.search.shared.service.b.uo r0 = r2.f236959a
            int r0 = r0.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r0)
            if (r0 != 0) goto L_0x0010
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x0010:
            r3 = r0
            com.google.common.f.e r0 = f326726a
            com.google.common.f.x r4 = r0.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "CarAssistantSessionMgr"
            r4.mo56378ag(r5, r6)
            java.lang.String r5 = r3.name()
            r7 = 18540(0x486c, float:2.598E-41)
            java.lang.String r8 = "#onServiceEvent: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r8, r5)
            boolean r4 = r1.f326757j
            if (r4 != 0) goto L_0x003e
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r6)
            java.lang.String r2 = "onServiceEvent called while SessionController is inactive; discarding event"
            r3 = 18541(0x486d, float:2.5981E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x003e:
            int r4 = r3.ordinal()
            r5 = 16
            java.lang.String r7 = "#updateIsTtsPlaying"
            r9 = 2
            r10 = 0
            r11 = 1
            switch(r4) {
                case 3: goto L_0x06fe;
                case 11: goto L_0x062b;
                case 12: goto L_0x062b;
                case 16: goto L_0x062b;
                case 31: goto L_0x0617;
                case 32: goto L_0x0601;
                case 44: goto L_0x05f9;
                case 45: goto L_0x05f4;
                case 46: goto L_0x05a7;
                case 47: goto L_0x05a2;
                case 51: goto L_0x0586;
                case 54: goto L_0x0561;
                case 57: goto L_0x050d;
                case 66: goto L_0x04e6;
                case 72: goto L_0x02b5;
                case 73: goto L_0x02b0;
                case 83: goto L_0x0259;
                case 100: goto L_0x062b;
                case 113: goto L_0x062b;
                case 128: goto L_0x021a;
                case 133: goto L_0x01f0;
                case 149: goto L_0x008f;
                case 172: goto L_0x0078;
                case 173: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x070b
        L_0x004e:
            com.google.android.apps.gsa.staticplugins.w.ak r0 = r1.f326755h
            com.google.android.apps.gsa.search.shared.service.b.bh r0 = r0.f326724a
            com.google.android.apps.gsa.search.shared.service.b.bh r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh.ONGOING
            if (r0 != r4) goto L_0x0073
            boolean r0 = r1.f326738L
            if (r0 != 0) goto L_0x0073
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r0 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r0 = r2.mo81913d(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r0 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r0 = r2.mo81912b(r0)
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0
            boolean r0 = r0.mo84338bW()
            if (r0 == 0) goto L_0x0073
            r1.m195620r(r10)
        L_0x0073:
            r16.m195624v(r17)
            goto L_0x070b
        L_0x0078:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87853g.f237693a
            java.lang.Object r0 = r2.mo81918e(r0)
            com.google.android.apps.gsa.search.shared.service.b.i r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87907i) r0
            int r0 = r0.f237797b
            int r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88220tp.m142793a(r0)
            if (r0 != 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r9 = r0
        L_0x008a:
            r1.m195625w(r9)
            goto L_0x070b
        L_0x008f:
            com.google.android.apps.gsa.search.core.carassistant.o r4 = r1.f326772y
            com.google.android.apps.gsa.search.core.carassistant.m r5 = com.google.android.apps.gsa.search.core.carassistant.C85736n.m137758m()
            com.google.android.libraries.f.a r7 = r1.f326773z
            long r7 = r7.mo26871c()
            r5.mo79338b(r7)
            com.google.android.apps.gsa.shared.search.QueryTriggerType r7 = com.google.android.apps.gsa.shared.search.QueryTriggerType.GEARHEAD_SCREEN_MIC
            r5.mo79342f(r7)
            com.google.android.apps.gsa.search.core.carassistant.n r5 = r5.mo79337a()
            com.google.android.apps.gsa.shared.search.Query r4 = r4.mo79386a(r5)
            com.google.android.apps.gsa.search.core.carassistant.h r4 = com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest.m137614q(r4)
            r4.mo79307b(r11)
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest r4 = r4.mo79306a()
            com.google.common.f.x r5 = r0.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r6)
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$Config r7 = r1.f326771x
            com.google.common.o.amo r7 = r7.mo79279g()
            r8 = 18485(0x4835, float:2.5903E-41)
            java.lang.String r9 = "startSession(): clientName: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56389s(r9, r7)
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250464dd
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x00df
            com.google.android.apps.gsa.staticplugins.w.at r5 = r1.f326748V
            r5.mo103444a()
            com.google.android.apps.gsa.staticplugins.w.ap r5 = r1.f326727A
            r5.f326782b = r10
        L_0x00df:
            com.google.android.apps.gsa.shared.search.Query r5 = r4.mo79255b()
            com.google.common.base.C58893dc.m90996a(r5)
            java.lang.CharSequence r7 = r5.f252768g
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r7 = r7 ^ r11
            r16.m195623u()
            if (r7 == 0) goto L_0x00fc
            com.google.android.apps.gsa.search.core.i.t r8 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250422co
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x0145
        L_0x00fc:
            com.google.android.apps.gsa.shared.util.permissions.d r8 = r1.f326766s
            com.google.android.apps.gsa.shared.util.permissions.a.a r8 = r8.f254356c
            java.lang.String r9 = "android.permission.RECORD_AUDIO"
            boolean r8 = r8.mo85346a(r9)
            if (r8 != 0) goto L_0x0145
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "GSA does not have RECORD_AUDIO permission"
            r5 = 18492(0x483c, float:2.5913E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$Config r0 = r1.f326771x
            com.google.common.o.amo r0 = r0.mo79279g()
            com.google.common.o.amo r4 = com.google.common.p4552o.amo.ANDROID_AUTO_EMBEDDED
            if (r0 != r4) goto L_0x0136
            com.google.android.apps.gsa.staticplugins.w.av r0 = r1.f326745S
            r4 = 2132091068(0x7f1520bc, float:1.9822494E38)
            r0.mo103447a(r4)
            com.google.android.apps.gsa.handsfree.k r0 = r1.f326767t
            com.google.common.b.qy r4 = new com.google.common.b.qy
            r4.<init>(r9)
            r0.c(r4)
            goto L_0x070b
        L_0x0136:
            com.google.android.apps.gsa.staticplugins.w.av r0 = r1.f326745S
            r4 = 2132091070(0x7f1520be, float:1.9822498E38)
            r0.mo103447a(r4)
            com.google.android.apps.gsa.handsfree.k r0 = r1.f326767t
            r0.g()
            goto L_0x070b
        L_0x0145:
            com.google.common.b.gu r8 = r4.mo79257d()
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x016a
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250858y
            boolean r4 = r4.mo79746e(r8)
            if (r4 == 0) goto L_0x0186
            com.google.android.apps.gsa.search.shared.service.aa r4 = r1.f326768u
            com.google.android.apps.gsa.search.shared.service.j r8 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r9 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.CLEAR_ACTIVE_NOTIFICATIONS
            r8.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r9)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r8 = r8.mo82013a()
            r4.mo81937i(r8)
            goto L_0x0186
        L_0x016a:
            com.google.android.apps.gsa.search.shared.service.aa r8 = r1.f326768u
            com.google.android.apps.gsa.search.shared.service.j r9 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.NEW_ACTIVE_NOTIFICATIONS
            r9.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r11)
            com.google.common.b.gu r4 = r4.mo79257d()
            com.google.android.apps.gsa.handsfree.notifications.AutoValue_ParcelableRemoteNotificationsList r11 = new com.google.android.apps.gsa.handsfree.notifications.AutoValue_ParcelableRemoteNotificationsList
            r11.<init>(r4, r10)
            r9.mo82015c(r11)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r4 = r9.mo82013a()
            r8.mo81937i(r4)
        L_0x0186:
            com.google.common.f.x r4 = r0.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r8, r6)
            java.lang.String r8 = "Assistant enabled. Building and sending query"
            r9 = 18487(0x4837, float:2.5906E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r9)).mo56386p(r8)
            if (r7 == 0) goto L_0x01b8
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "Text search, no beep played"
            r6 = 18490(0x483a, float:2.591E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r4)
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250490ec
            boolean r0 = r0.mo79746e(r4)
            if (r0 != 0) goto L_0x01e2
            com.google.android.apps.gsa.search.core.carassistant.c.a r0 = r1.f326751d
            r0.mo79332n(r5)
            goto L_0x01e2
        L_0x01b8:
            android.net.Uri r4 = r5.f252787z
            if (r4 != 0) goto L_0x01cd
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "No audio uri, no beep played"
            r6 = 18489(0x4839, float:2.5909E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r4)
            goto L_0x01e2
        L_0x01cd:
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "Beep played"
            r6 = 18488(0x4838, float:2.5907E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r4)
            com.google.android.apps.gsa.speech.audio.e.i r0 = r1.f326750c
            r0.mo86853i()
        L_0x01e2:
            com.google.android.apps.gsa.search.core.carassistant.c.a r0 = r1.f326751d
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_COMMIT_QUERY
            r0.mo79322d(r4)
            com.google.android.apps.gsa.staticplugins.w.ar r0 = r1.f326769v
            r0.mo103443a(r5)
            goto L_0x070b
        L_0x01f0:
            com.google.common.b.gu r0 = r1.f326737K
            com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper[] r4 = new com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper[r10]
            java.lang.Object[] r0 = r0.toArray(r4)
            com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper[] r0 = (com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper[]) r0
            int r4 = r0.length
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "active_notifications"
            r4.putParcelableArray(r5, r0)
            com.google.android.apps.gsa.search.shared.service.aa r0 = r1.f326768u
            com.google.android.apps.gsa.search.shared.service.j r5 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.DELIVER_GEARHEAD_NOTIFICATIONS
            r5.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r6)
            r5.mo82015c(r4)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r4 = r5.mo82013a()
            r0.mo81937i(r4)
            goto L_0x070b
        L_0x021a:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88247up.f238701a
            java.lang.Object r0 = r2.mo81918e(r0)
            com.google.android.apps.gsa.search.shared.service.b.ur r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88249ur) r0
            long r4 = r0.f238705b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.f326756i = r4
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250273Y
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x070b
            int r4 = r0.f238704a
            r4 = r4 & r9
            if (r4 == 0) goto L_0x070b
            com.google.android.apps.gsa.search.shared.service.b.bp r4 = r0.f238706c
            if (r4 != 0) goto L_0x023f
            com.google.android.apps.gsa.search.shared.service.b.bp r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87734bp.f237219c
        L_0x023f:
            int r4 = r4.f237221a
            int r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88220tp.m142793a(r4)
            if (r4 != 0) goto L_0x0248
            goto L_0x0249
        L_0x0248:
            r9 = r4
        L_0x0249:
            r1.f326746T = r9
            com.google.android.apps.gsa.staticplugins.w.p r4 = com.google.android.apps.gsa.staticplugins.p8793w.C118097p.f327731a
            com.google.android.apps.gsa.staticplugins.w.q r5 = new com.google.android.apps.gsa.staticplugins.w.q
            r5.<init>(r1, r0)
            java.lang.String r0 = "#onSessionHandoverToAgsa"
            r1.m195619q(r4, r5, r0)
            goto L_0x070b
        L_0x0259:
            com.google.android.apps.gsa.staticplugins.w.at r0 = r1.f326748V
            r0.mo103444a()
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f326765r
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250439dE
            long r4 = r0.mo79743a(r4)
            int r0 = (int) r4
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88116pt.f238220a
            com.google.android.apps.gsa.search.shared.service.b.uo r5 = r2.f236959a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r5.mo58887l(r4)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x029b
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88116pt.f238220a
            java.lang.Object r4 = r2.mo81918e(r4)
            com.google.android.apps.gsa.search.shared.service.b.px r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88120px) r4
            int r5 = r4.f238224a
            r5 = r5 & r11
            if (r5 == 0) goto L_0x028b
            int r0 = r4.f238225b
        L_0x028b:
            int r4 = r4.f238226c
            int r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88119pw.m142786a(r4)
            if (r4 != 0) goto L_0x0294
            goto L_0x029b
        L_0x0294:
            if (r4 != r9) goto L_0x029b
            com.google.android.apps.gsa.staticplugins.w.at r4 = r1.f326748V
            r4.mo103445b(r0)
        L_0x029b:
            com.google.android.apps.gsa.staticplugins.w.ap r4 = r1.f326727A
            com.google.android.apps.gsa.search.core.i.t r5 = r4.f326781a
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250497ej
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x070b
            com.google.android.apps.gsa.staticplugins.w.at r5 = r4.f326783c
            r5.mo103445b(r0)
            r4.f326782b = r11
            goto L_0x070b
        L_0x02b0:
            r16.m195624v(r17)
            goto L_0x070b
        L_0x02b5:
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87760co.f237522a
            com.google.android.apps.gsa.search.shared.service.b.uo r5 = r2.f236959a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r5.mo58887l(r4)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 != 0) goto L_0x02dc
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "ServiceEventData doesn't have ConversationSurfaceEventData when it should."
            r5 = 18537(0x4869, float:2.5976E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x070b
        L_0x02dc:
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87760co.f237522a
            java.lang.Object r4 = r2.mo81918e(r4)
            com.google.android.apps.gsa.search.shared.service.b.cw r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw) r4
            java.lang.String r5 = r4.f237531d
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x02f4
            java.lang.String r5 = r4.f237531d
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r5)
            r1.f326741O = r5
        L_0x02f4:
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250377bw
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x0315
            if (r4 == 0) goto L_0x0315
            int r5 = r4.f237532e
            int r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87765ct.m142765a(r5)
            if (r5 != 0) goto L_0x0309
            goto L_0x0315
        L_0x0309:
            r7 = 5
            if (r5 != r7) goto L_0x0315
            boolean r5 = r1.f326738L
            if (r5 != 0) goto L_0x0315
            com.google.android.apps.gsa.speech.audio.e.i r5 = r1.f326750c
            r5.mo86853i()
        L_0x0315:
            r5 = 4
            r7 = -1
            if (r4 != 0) goto L_0x031b
            goto L_0x0397
        L_0x031b:
            int r12 = r4.f237532e
            int r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87765ct.m142765a(r12)
            if (r12 != 0) goto L_0x0324
            r12 = 1
        L_0x0324:
            int r12 = r12 + r7
            if (r12 == r11) goto L_0x0390
            if (r12 == r9) goto L_0x0334
            if (r12 == r5) goto L_0x032c
            goto L_0x0397
        L_0x032c:
            boolean r12 = r1.f326738L
            if (r12 != 0) goto L_0x0397
            r1.m195620r(r11)
            goto L_0x0397
        L_0x0334:
            com.google.protobuf.cq r12 = r4.f237536i
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x0397
            com.google.android.apps.gsa.search.core.i.t r12 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247543jD
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x0397
            com.google.protobuf.cq r12 = r4.f237536i
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89842j(r12)
            com.google.common.o.cb r13 = com.google.common.p4552o.C59687cb.f160034bf
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.common.o.aj r13 = (com.google.common.p4552o.C59582aj) r13
            com.google.common.base.ax r14 = r1.f326740N
            boolean r14 = r14.mo56113h()
            if (r14 == 0) goto L_0x037d
            com.google.common.base.ax r14 = r1.f326740N
            java.lang.Object r14 = r14.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r14 = (com.google.android.apps.gsa.shared.search.Query) r14
            dagger.a r15 = r1.f326728B
            java.lang.Object r15 = r15.mo27525b()
            android.content.SharedPreferences r15 = (android.content.SharedPreferences) r15
            java.lang.String r8 = "last_missed_hotword_time_ms"
            r9 = -1
            long r8 = r15.getLong(r8, r9)
            com.google.common.base.ax r10 = r1.f326741O
            com.google.common.o.cb r8 = com.google.android.apps.gsa.shared.search.C90499g.m147582b(r14, r8, r10)
            r13.mergeFrom(r8)
        L_0x037d:
            r13.mo57005b(r12)
            com.google.android.apps.gsa.search.core.carassistant.c.a r8 = r1.f326751d
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CONVERSATION_DELTA_CLIENT_OPS_EXECUTED
            com.google.protobuf.bv r10 = r13.build()
            com.google.common.o.cb r10 = (com.google.common.p4552o.C59687cb) r10
            r12 = 0
            r8.mo79323e(r9, r12, r10)
            goto L_0x0397
        L_0x0390:
            com.google.android.apps.gsa.search.core.carassistant.c.a r8 = r1.f326751d
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CONVERSATION_DELTA_RECEIVED
            r8.mo79322d(r9)
        L_0x0397:
            if (r4 != 0) goto L_0x039a
            goto L_0x03d1
        L_0x039a:
            int r8 = r4.f237532e
            int r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C87765ct.m142765a(r8)
            if (r8 != 0) goto L_0x03a3
            r8 = 1
        L_0x03a3:
            int r8 = r8 + r7
            if (r8 == r11) goto L_0x03a7
            goto L_0x03d1
        L_0x03a7:
            int r8 = r1.f326746T
            if (r8 != r5) goto L_0x03bc
            com.google.common.f.x r5 = r0.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r8, r6)
            java.lang.String r8 = "DELTA_RECEIVED triggered after last delta for delta has already been received"
            r9 = 18508(0x484c, float:2.5935E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r9)).mo56386p(r8)
            goto L_0x03c8
        L_0x03bc:
            int r5 = r4.f237537j
            int r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88220tp.m142793a(r5)
            if (r5 != 0) goto L_0x03c5
            r5 = 2
        L_0x03c5:
            r1.m195625w(r5)
        L_0x03c8:
            boolean r5 = r1.f326759l
            if (r5 != 0) goto L_0x03d1
            r1.f326759l = r11
            r16.m195623u()
        L_0x03d1:
            int r5 = r4.f237528a
            r5 = r5 & r11
            if (r5 == 0) goto L_0x070b
            com.google.protobuf.z r4 = r4.f237529b     // Catch:{ ct -> 0x04d1 }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x04d1 }
            com.google.assistant.e.j.dy r8 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f     // Catch:{ ct -> 0x04d1 }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r4, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x04d1 }
            com.google.assistant.e.j.dy r4 = (com.google.assistant.p3897e.p3921j.C51809dy) r4     // Catch:{ ct -> 0x04d1 }
            java.lang.String r5 = r4.f135936b     // Catch:{ ct -> 0x04d1 }
            int r8 = r5.hashCode()     // Catch:{ ct -> 0x04d1 }
            r9 = -1573932694(0xffffffffa22fb16a, float:-2.3810845E-18)
            if (r8 == r9) goto L_0x040e
            r9 = -1066437403(0xffffffffc06f74e5, float:-3.7415097)
            if (r8 == r9) goto L_0x0404
            r9 = 144171367(0x897e167, float:9.140974E-34)
            if (r8 == r9) goto L_0x03fa
            goto L_0x0418
        L_0x03fa:
            java.lang.String r8 = "ui.THIRD_PARTY_START_INDICATOR"
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L_0x0418
            r10 = 0
            goto L_0x0419
        L_0x0404:
            java.lang.String r8 = "ui.SHOW_SLICE_CARD"
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L_0x0418
            r10 = 1
            goto L_0x0419
        L_0x040e:
            java.lang.String r8 = "ui.SHOW_APP_WIDGET"
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L_0x0418
            r10 = 2
            goto L_0x0419
        L_0x0418:
            r10 = -1
        L_0x0419:
            if (r10 == 0) goto L_0x043a
            if (r10 == r11) goto L_0x070b
            r4 = 2
            if (r10 == r4) goto L_0x070b
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x04d1 }
            r0.mo56378ag(r4, r6)     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x04d1 }
            r4 = 18519(0x4857, float:2.595E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x04d1 }
            java.lang.String r4 = "Unhandled client op: %s"
            r0.mo56389s(r4, r5)     // Catch:{ ct -> 0x04d1 }
            goto L_0x070b
        L_0x043a:
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f326765r     // Catch:{ ct -> 0x04d1 }
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250438dD     // Catch:{ ct -> 0x04d1 }
            boolean r5 = r5.mo79746e(r7)     // Catch:{ ct -> 0x04d1 }
            if (r5 == 0) goto L_0x070b
            com.google.assistant.e.j.e.ih r5 = com.google.assistant.p3897e.p3921j.p3926e.C52036ih.f136574g     // Catch:{ ct -> 0x04d1 }
            com.google.protobuf.eb r5 = r5.getParserForType()     // Catch:{ ct -> 0x04d1 }
            java.lang.String r7 = "third_party_start_indicator_args"
            com.google.assistant.e.j.dw r8 = r4.f135938d     // Catch:{ ct -> 0x04d1 }
            if (r8 != 0) goto L_0x0452
            com.google.assistant.e.j.dw r8 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ ct -> 0x04d1 }
        L_0x0452:
            com.google.protobuf.cq r8 = r8.f135932a     // Catch:{ ct -> 0x04d1 }
            com.google.android.apps.gsa.staticplugins.w.a r9 = new com.google.android.apps.gsa.staticplugins.w.a     // Catch:{ ct -> 0x04d1 }
            r9.<init>()     // Catch:{ ct -> 0x04d1 }
            com.google.common.base.ax r8 = com.google.common.p4522b.C58557jl.m90122c(r8, r9)     // Catch:{ ct -> 0x04d1 }
            boolean r9 = r8.mo56113h()     // Catch:{ ct -> 0x04d1 }
            if (r9 != 0) goto L_0x047f
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x04d1 }
            r0.mo56378ag(r5, r6)     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x04d1 }
            r5 = 18479(0x482f, float:2.5895E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x04d1 }
            java.lang.String r5 = "Failed to find %s argument in %s client op"
            java.lang.String r4 = r4.f135936b     // Catch:{ ct -> 0x04d1 }
            r0.mo56354G(r5, r7, r4)     // Catch:{ ct -> 0x04d1 }
        L_0x047d:
            r8 = 0
            goto L_0x04b2
        L_0x047f:
            java.lang.Object r0 = r8.mo56107c()     // Catch:{ ct -> 0x0495 }
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0     // Catch:{ ct -> 0x0495 }
            com.google.assistant.e.j.ka r0 = r0.f137066c     // Catch:{ ct -> 0x0495 }
            if (r0 != 0) goto L_0x048b
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0495 }
        L_0x048b:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x0495 }
            java.lang.Object r0 = r5.mo59008g(r0)     // Catch:{ ct -> 0x0495 }
            com.google.protobuf.MessageLite r0 = (com.google.protobuf.MessageLite) r0     // Catch:{ ct -> 0x0495 }
            r8 = r0
            goto L_0x04b2
        L_0x0495:
            com.google.common.f.e r0 = f326726a     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x04d1 }
            r0.mo56378ag(r5, r6)     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x04d1 }
            r5 = 18478(0x482e, float:2.5893E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ ct -> 0x04d1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x04d1 }
            java.lang.String r5 = "Failed to parse %s argument from %s client op"
            java.lang.String r4 = r4.f135936b     // Catch:{ ct -> 0x04d1 }
            r0.mo56354G(r5, r7, r4)     // Catch:{ ct -> 0x04d1 }
            goto L_0x047d
        L_0x04b2:
            com.google.assistant.e.j.e.ih r8 = (com.google.assistant.p3897e.p3921j.p3926e.C52036ih) r8     // Catch:{ ct -> 0x04d1 }
            if (r8 == 0) goto L_0x070b
            com.google.assistant.e.c.c.gh r0 = r8.f136578c     // Catch:{ ct -> 0x04d1 }
            if (r0 != 0) goto L_0x04bc
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ ct -> 0x04d1 }
        L_0x04bc:
            int r4 = r0.f133012b     // Catch:{ ct -> 0x04d1 }
            r5 = 3
            if (r4 != r5) goto L_0x04c6
            java.lang.Object r0 = r0.f133013c     // Catch:{ ct -> 0x04d1 }
            com.google.assistant.e.c.c.fl r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51075fl) r0     // Catch:{ ct -> 0x04d1 }
            goto L_0x04c8
        L_0x04c6:
            com.google.assistant.e.c.c.fl r0 = com.google.assistant.p3897e.p3902c.p3907c.C51075fl.f132982e     // Catch:{ ct -> 0x04d1 }
        L_0x04c8:
            java.lang.String r4 = r0.f132985b     // Catch:{ ct -> 0x04d1 }
            java.lang.String r0 = r0.f132986c     // Catch:{ ct -> 0x04d1 }
            r1.m195621s(r4, r0)     // Catch:{ ct -> 0x04d1 }
            goto L_0x070b
        L_0x04d1:
            r0 = move-exception
            com.google.common.f.e r4 = f326726a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r6)
            java.lang.String r5 = "Failed to parse client op from conversationSurfaceEventData."
            r6 = 18520(0x4858, float:2.5952E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)
            goto L_0x070b
        L_0x04e6:
            boolean r0 = r1.f326738L
            if (r0 != 0) goto L_0x04fa
            com.google.android.apps.gsa.search.shared.service.aa r0 = r1.f326768u
            com.google.android.apps.gsa.search.shared.service.j r4 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.REQUEST_WELCOME_TTS_ON_TIMEOUT
            r4.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r5)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r4 = r4.mo82013a()
            r0.mo81937i(r4)
        L_0x04fa:
            com.google.android.apps.gsa.search.core.carassistant.c.a r0 = r1.f326751d
            com.google.common.o.cb r4 = r16.mo79300b()
            r0.mo79326h(r4)
            com.google.android.apps.gsa.speech.audio.e.i r0 = r1.f326750c
            r0.mo86849e(r11)
            r0 = 0
            r1.f326738L = r0
            goto L_0x070b
        L_0x050d:
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250438dD
            boolean r0 = r0.mo79746e(r4)
            if (r0 == 0) goto L_0x070b
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88283vy.f238773a
            java.lang.Object r0 = r2.mo81918e(r0)
            com.google.android.apps.gsa.search.shared.service.b.wa r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88286wa) r0
            com.google.assistant.e.e.a.j r0 = r0.f238777b
            if (r0 != 0) goto L_0x0525
            com.google.assistant.e.e.a.j r0 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
        L_0x0525:
            com.google.protobuf.cq r4 = r0.f133272g
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x055a
            com.google.protobuf.cq r0 = r0.f133272g
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            com.google.assistant.e.e.a.b r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51187b) r0
            com.google.assistant.e.a.f r4 = r0.f133241e
            if (r4 != 0) goto L_0x053c
            com.google.assistant.e.a.f r4 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
        L_0x053c:
            int r4 = r4.f132452e
            int r4 = com.google.assistant.p3897e.p3898a.C50869e.m85974a(r4)
            if (r4 != 0) goto L_0x0545
            goto L_0x0549
        L_0x0545:
            r5 = 2
            if (r4 == r5) goto L_0x0549
            goto L_0x055a
        L_0x0549:
            com.google.assistant.e.a.f r0 = r0.f133241e
            if (r0 != 0) goto L_0x0550
            com.google.assistant.e.a.f r4 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
            goto L_0x0551
        L_0x0550:
            r4 = r0
        L_0x0551:
            java.lang.String r8 = r4.f132450c
            if (r0 != 0) goto L_0x0557
            com.google.assistant.e.a.f r0 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
        L_0x0557:
            java.lang.String r0 = r0.f132449b
            goto L_0x055c
        L_0x055a:
            r0 = 0
            r8 = 0
        L_0x055c:
            r1.m195621s(r8, r0)
            goto L_0x070b
        L_0x0561:
            java.lang.Class<com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction> r0 = com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction.class
            boolean r0 = r2.mo81913d(r0)
            if (r0 == 0) goto L_0x070b
            java.lang.Class<com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction> r0 = com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction.class
            android.os.Parcelable r0 = r2.mo81912b(r0)
            com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction r0 = (com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction) r0
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f236008a
            if (r0 == 0) goto L_0x070b
            boolean r4 = r0.mo81052B()
            if (r4 == 0) goto L_0x070b
            boolean r0 = r0.mo81077p()
            if (r0 != 0) goto L_0x070b
            r16.mo103441m()
            goto L_0x070b
        L_0x0586:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88256uy.f238719a
            java.lang.Object r0 = r2.mo81918e(r0)
            com.google.android.apps.gsa.search.shared.service.b.va r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88259va) r0
            int r0 = r0.f238724b
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0595
            r10 = 1
            goto L_0x0596
        L_0x0595:
            r10 = 0
        L_0x0596:
            com.google.android.apps.gsa.staticplugins.w.m r0 = com.google.android.apps.gsa.staticplugins.p8793w.C118094m.f327727a
            com.google.android.apps.gsa.staticplugins.w.n r4 = new com.google.android.apps.gsa.staticplugins.w.n
            r4.<init>(r1, r10)
            r1.m195619q(r0, r4, r7)
            goto L_0x070b
        L_0x05a2:
            r16.m195622t(r17)
            goto L_0x070b
        L_0x05a7:
            com.google.android.apps.gsa.staticplugins.w.ak r4 = r1.f326755h
            com.google.android.apps.gsa.search.shared.service.b.bh r4 = r4.f326724a
            com.google.android.apps.gsa.search.shared.service.b.bh r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh.ONGOING
            if (r4 != r5) goto L_0x070b
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq.f238816a
            java.lang.Object r4 = r2.mo81918e(r4)
            com.google.android.apps.gsa.search.shared.service.b.ws r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws) r4
            int r4 = r4.f238820b
            java.lang.String r5 = com.google.android.apps.gsa.shared.util.C90737au.m148206a(r4)
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r7, r6)
            java.lang.String r6 = "setting recognition state to %s"
            r7 = 18546(0x4872, float:2.5988E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56389s(r6, r5)
            com.google.android.apps.gsa.staticplugins.w.g r0 = com.google.android.apps.gsa.staticplugins.p8793w.C117859g.f327085a
            com.google.android.apps.gsa.staticplugins.w.h r5 = new com.google.android.apps.gsa.staticplugins.w.h
            r5.<init>(r1, r4)
            java.lang.String r6 = "#updateRecognitionState"
            r1.m195619q(r0, r5, r6)
            r0 = 2
            if (r4 != r0) goto L_0x05ef
            com.google.android.apps.gsa.search.core.carassistant.c.a r0 = r1.f326751d
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_START_LISTENING
            r0.mo79322d(r4)
            com.google.android.apps.gsa.staticplugins.w.i r0 = com.google.android.apps.gsa.staticplugins.p8793w.C118081i.f327706a
            com.google.android.apps.gsa.staticplugins.w.k r4 = new com.google.android.apps.gsa.staticplugins.w.k
            r4.<init>(r1)
            java.lang.String r5 = "#updateIsTtsPlaying#updateRecognitionState"
            r1.m195619q(r0, r4, r5)
        L_0x05ef:
            r16.m195623u()
            goto L_0x070b
        L_0x05f4:
            r16.m195618p()
            goto L_0x070b
        L_0x05f9:
            r0 = 0
            r1.f326738L = r0
            r16.m195623u()
            goto L_0x070b
        L_0x0601:
            com.google.android.apps.gsa.search.core.carassistant.c.a r0 = r1.f326751d
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TTS_PLAY_STARTED
            r0.mo79322d(r4)
            r16.m195618p()
            com.google.android.apps.gsa.staticplugins.w.ab r0 = com.google.android.apps.gsa.staticplugins.p8793w.C117714ab.f326715a
            com.google.android.apps.gsa.staticplugins.w.ac r4 = new com.google.android.apps.gsa.staticplugins.w.ac
            r4.<init>(r1)
            r1.m195619q(r0, r4, r7)
            goto L_0x070b
        L_0x0617:
            com.google.android.apps.gsa.search.core.carassistant.c.a r0 = r1.f326751d
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TTS_PLAY_DONE
            r0.mo79322d(r4)
            com.google.android.apps.gsa.staticplugins.w.ak r0 = r1.f326755h
            com.google.android.apps.gsa.search.shared.service.b.bh r0 = r0.f326724a
            com.google.android.apps.gsa.search.shared.service.b.bh r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh.IDLE
            if (r0 == r4) goto L_0x070b
            r16.m195623u()
            goto L_0x070b
        L_0x062b:
            com.google.android.apps.gsa.search.shared.service.b.uo r4 = r2.f236959a
            int r4 = r4.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r4)
            if (r4 != 0) goto L_0x0637
            com.google.android.apps.gsa.search.shared.service.b.um r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x0637:
            int r4 = r4.ordinal()
            r7 = 11
            if (r4 == r7) goto L_0x06a4
            r7 = 12
            if (r4 == r7) goto L_0x06a1
            if (r4 == r5) goto L_0x0663
            r5 = 100
            if (r4 == r5) goto L_0x065f
            r5 = 113(0x71, float:1.58E-43)
            if (r4 == r5) goto L_0x065f
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "Unhandled Conversation Service Event - returning."
            r5 = 18498(0x4842, float:2.5921E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x070b
        L_0x065f:
            r4 = 0
            r1.f326759l = r4
            goto L_0x06a7
        L_0x0663:
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250467dg
            boolean r4 = r4.mo79746e(r5)
            if (r4 != 0) goto L_0x070b
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88360yu.f238954a
            com.google.android.apps.gsa.search.shared.service.b.uo r5 = r2.f236959a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r5.mo58887l(r4)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x0690
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88360yu.f238954a
            java.lang.Object r0 = r2.mo81918e(r0)
            com.google.android.apps.gsa.search.shared.service.b.yw r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw) r0
            boolean r0 = r0.f238958b
            r1.f326758k = r0
            goto L_0x070b
        L_0x0690:
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "Could not update conversation state."
            r5 = 18504(0x4848, float:2.593E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x070b
        L_0x06a1:
            r1.f326758k = r11
            goto L_0x070b
        L_0x06a4:
            r4 = 0
            r1.f326758k = r4
        L_0x06a7:
            boolean r4 = r1.f326758k
            if (r4 != 0) goto L_0x06ed
            boolean r4 = r1.f326759l
            if (r4 == 0) goto L_0x06b0
            goto L_0x06ed
        L_0x06b0:
            com.google.android.apps.gsa.staticplugins.w.ap r4 = r1.f326727A
            boolean r4 = r4.f326782b
            if (r4 == 0) goto L_0x06c7
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "Routine action execution in-progress ignoring this event."
            r5 = 18501(0x4845, float:2.5925E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x070b
        L_0x06c7:
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250497ej
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x06d9
            com.google.android.apps.gsa.staticplugins.w.at r0 = r1.f326748V
            r4 = 500(0x1f4, float:7.0E-43)
            r0.mo103445b(r4)
            goto L_0x070b
        L_0x06d9:
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "Session about to end."
            r5 = 18500(0x4844, float:2.5924E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            r16.mo103438j()
            goto L_0x070b
        L_0x06ed:
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "Session has not completed yet."
            r5 = 18499(0x4843, float:2.5923E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x070b
        L_0x06fe:
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f326765r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250321at
            boolean r0 = r0.mo79746e(r4)
            if (r0 == 0) goto L_0x070b
            r16.mo103440l()
        L_0x070b:
            boolean r0 = r1.f326760m
            if (r0 == 0) goto L_0x0714
            java.util.List r0 = r1.f326761n
            r0.add(r2)
        L_0x0714:
            com.google.android.apps.gsa.staticplugins.w.w r0 = new com.google.android.apps.gsa.staticplugins.w.w
            r0.<init>(r1, r3, r2)
            com.google.android.apps.gsa.staticplugins.w.x r3 = new com.google.android.apps.gsa.staticplugins.w.x
            r3.<init>(r1, r2)
            java.lang.String r2 = "#onServiceEvent"
            r1.m195619q(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8793w.C117724al.mo79304g(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (!this.f326754g.isEmpty()) {
            fVar.mo85291r("Auto Voice Session Controller Dump");
            C91006f e = fVar.mo85281e((Object) null);
            for (List<ServiceEventData> it : this.f326754g) {
                e.mo85279c("Completed Voice Session");
                C91006f e2 = e.mo85281e((Object) null);
                for (ServiceEventData serviceEventData : it) {
                    C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
                    if (a == null) {
                        a = C88244um.ATTACH_WEBVIEW;
                    }
                    e2.mo85279c("Event").mo85276a(C90752i.m148229c(a.name()));
                    if (a == C88244um.SET_QUERY) {
                        C91006f e3 = e2.mo85281e((Object) null);
                        try {
                            Query query = (Query) serviceEventData.mo81912b(Query.class);
                            e3.mo85279c("RequestId").mo85276a(C90752i.m148233g(C39191a.m68623b(query.f252749G)));
                            e3.mo85279c("QueryChar").mo85276a(C90752i.m148233g(query.f252768g));
                        } catch (ClassCastException | NullPointerException e4) {
                            C59104x c = f326726a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
                            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e4)).mo56372aa(18494)).mo56386p("error getting query");
                        }
                    }
                }
            }
            this.f326754g.clear();
            this.f326761n.clear();
        }
    }

    /* renamed from: h */
    public final void mo79305h(C85729g gVar) {
        this.f326743Q = gVar;
    }

    /* renamed from: i */
    public final C85729g mo103437i() {
        C85729g gVar = this.f326743Q;
        return gVar != null ? gVar : (C85729g) this.f326770w.mo27525b();
    }

    /* renamed from: j */
    public final void mo103438j() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f326755h.f326724a == C87726bh.IDLE) {
            C59081b.m91349a(C58979ad.FULL, "stack size");
            return;
        }
        mo103441m();
        C60870cx o = m195617o();
        C22871g gVar = this.f326730D;
        C85700a aVar = this.f326751d;
        Objects.requireNonNull(aVar);
        new C90873ag(o, gVar, "log end event", new C118101t(aVar)).mo85223a(new C118103v(this));
        C58836b bVar = C58836b.f156633a;
        this.f326740N = bVar;
        this.f326741O = bVar;
        m195618p();
        this.f326755h.mo103436b(C87726bh.IDLE);
        this.f326759l = false;
        this.f326758k = false;
        this.f326735I = false;
        this.f326736J = false;
        this.f326737K = C58485gu.m89845m();
        this.f326746T = 3;
        this.f326738L = false;
        mo103437i().mo79381e();
    }

    /* renamed from: k */
    public final void mo103439k(boolean z) {
        C89849ae aeVar;
        C89849ae aeVar2;
        C89849ae aeVar3;
        this.f326739M = null;
        if (this.f326771x.mo79279g() == amo.ANDROID_AUTO_PHONE) {
            C85700a aVar = this.f326751d;
            if (z) {
                aeVar3 = C89849ae.AAV_START_MIC_OPEN_FOR_FOLLOW_ON;
            } else {
                aeVar3 = C89849ae.AAV_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT;
            }
            aVar.mo79327i(aeVar3);
        } else if (this.f326771x.mo79279g() == amo.ANDROID_AUTO_PROJECTED) {
            C85700a aVar2 = this.f326751d;
            if (z) {
                aeVar2 = C89849ae.AAP_START_MIC_OPEN_FOR_FOLLOW_ON;
            } else {
                aeVar2 = C89849ae.AAP_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT;
            }
            aVar2.mo79327i(aeVar2);
        } else if (this.f326771x.mo79279g() == amo.ANDROID_AUTO_EMBEDDED) {
            C85700a aVar3 = this.f326751d;
            if (z) {
                aeVar = C89849ae.AAE_START_MIC_OPEN_FOR_FOLLOW_ON;
            } else {
                aeVar = C89849ae.AAE_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT;
            }
            aVar3.mo79327i(aeVar);
        }
    }

    /* renamed from: l */
    public final void mo103440l() {
        C59071e eVar = f326726a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
        ((C59052c) ((C59052c) b).mo56372aa(18554)).mo56355H("stopSession(): sessionStateManager: %s, isActive: %b", this.f326755h.f326724a, this.f326757j);
        if (this.f326755h.f326724a == C87726bh.ONGOING) {
            C74449d dVar = this.f326729C.f208531a;
            this.f326731E.b();
            this.f326755h.mo103436b(C87726bh.STOPPED);
            this.f326768u.mo81937i(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
            boolean z = false;
            if (this.f326765r.mo79746e(C90086ek.f250314am) && this.f326771x.mo79279g() == amo.ANDROID_AUTO_PROJECTED) {
                z = true;
            }
            if (!z) {
                this.f326768u.mo81937i(new C88489j(C87739bu.CANCEL).mo82013a());
                this.f326768u.mo81937i(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
            }
            if (this.f326765r.mo79746e(C90086ek.f250438dD) && this.f326735I && !this.f326736J) {
                if (this.f326765r.mo79746e(C90086ek.f250283aH)) {
                    C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
                    dsVar.copyOnWrite();
                    C51805du duVar = (C51805du) dsVar.instance;
                    duVar.f135926a |= 1;
                    duVar.f135927b = "ui.TAP_EXIT_THIRD_PARTY";
                    C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
                    C63088z byteString = ((C51805du) dsVar.build()).toByteString();
                    oxVar.copyOnWrite();
                    C88094oy oyVar = (C88094oy) oxVar.instance;
                    byteString.getClass();
                    oyVar.f238176a |= 1;
                    oyVar.f238177b = byteString;
                    C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
                    jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
                    this.f326768u.mo81937i(jVar.mo82013a());
                }
                this.f326736J = true;
            }
            if (this.f326757j) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
                ((C59052c) ((C59052c) b2).mo56372aa(18555)).mo56358K("sessionTimeout scheduled, isActive: %b, isProcessingConversationDeltas: %b", this.f326757j, this.f326759l);
                this.f326747U.mo103445b(true != this.f326735I ? SimpleSnackbar.LENGTH_SHORT : 500);
            } else {
                mo103438j();
            }
            if (z) {
                this.f326768u.mo81931b(((Query) this.f326742P.mo27525b()).mo84259V());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo103441m() {
        int i = this.f326746T;
        if (i == 5 || i == 6) {
            m195625w(8);
        } else if (i == 4) {
            m195625w(7);
        } else {
            C59104x d = f326726a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
            ((C59052c) ((C59052c) d).mo56372aa(18556)).mo56386p("No change of routine end state occurred due to unexpected current state");
        }
    }

    /* renamed from: n */
    public final boolean mo103442n() {
        int i = this.f326746T;
        return i == 5 || i == 4 || i == 6;
    }
}
