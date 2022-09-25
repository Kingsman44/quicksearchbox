package com.google.android.apps.gsa.staticplugins.gearhead;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.google.android.apps.auto.p450a.p451a.C8898bp;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.projection.C84190d;
import com.google.android.apps.gsa.projection.C84196h;
import com.google.android.apps.gsa.projection.p6477a.C84184a;
import com.google.android.apps.gsa.projection.p6478b.C84186a;
import com.google.android.apps.gsa.projection.p6478b.C84187b;
import com.google.android.apps.gsa.search.core.carassistant.C$AutoValue_CarAssistantSessionManager_Config;
import com.google.android.apps.gsa.search.core.carassistant.C85729g;
import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.gearhead.projected.C101380i;
import com.google.android.gearhead.sdk.assistant.C142658d;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.android.gearhead.sdk.assistant.C142664j;
import com.google.android.gearhead.sdk.assistant.ClientStateSnapshot;
import com.google.android.gearhead.sdk.assistant.VoiceSessionConfig;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11626b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11628d;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a.C11574at;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a.C11613n;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d.C11636b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.C11652a;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11749a;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11791b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11764am;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11777m;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p690i.C11805l;
import com.google.android.libraries.assistant.auto.jumpboost.p649a.p652c.C11432a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13043e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13044f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p;
import com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.C16893a;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p961c.C13436d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2871b.C37251i;
import com.google.android.libraries.search.p2871b.C37266j;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.function.Consumer;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.be */
/* compiled from: PG */
public final class C101325be implements C84186a, C85729g {

    /* renamed from: a */
    public static final C58974d f282743a = C58974d.m91135i("CarAssistant");

    /* renamed from: A */
    public final C42876ab f282744A;

    /* renamed from: B */
    public final C69464a f282745B;

    /* renamed from: C */
    public final C11628d f282746C;

    /* renamed from: D */
    public final C39141kp f282747D;

    /* renamed from: E */
    long f282748E = -1;

    /* renamed from: F */
    public boolean f282749F;

    /* renamed from: G */
    public Long f282750G;

    /* renamed from: H */
    public boolean f282751H = false;

    /* renamed from: I */
    volatile BroadcastReceiver f282752I;

    /* renamed from: J */
    volatile BroadcastReceiver f282753J;

    /* renamed from: K */
    public final C84190d f282754K;

    /* renamed from: L */
    public C142664j f282755L;

    /* renamed from: M */
    private final C11749a f282756M;

    /* renamed from: N */
    private final C22871g f282757N;

    /* renamed from: O */
    private final C11432a f282758O;

    /* renamed from: P */
    private final C101326bf f282759P;

    /* renamed from: Q */
    private final C101327bg f282760Q;

    /* renamed from: R */
    private final C101324bd f282761R = new C101324bd(this);

    /* renamed from: S */
    private final C101312aw f282762S = new C101312aw(this);

    /* renamed from: T */
    private final C84196h f282763T;

    /* renamed from: U */
    private final C84187b f282764U;

    /* renamed from: V */
    private final CarAssistantSessionManager.Config f282765V;

    /* renamed from: W */
    private final C69464a f282766W;

    /* renamed from: X */
    private final C69464a f282767X;

    /* renamed from: Y */
    private final C69464a f282768Y;

    /* renamed from: Z */
    private boolean f282769Z = true;

    /* renamed from: aa */
    private final C11574at f282770aa;

    /* renamed from: ab */
    private final C11613n f282771ab;

    /* renamed from: b */
    public final C37251i f282772b;

    /* renamed from: c */
    public final C11791b f282773c;

    /* renamed from: d */
    public final SharedPreferences f282774d;

    /* renamed from: e */
    public final C21370a f282775e;

    /* renamed from: f */
    public final C86124t f282776f;

    /* renamed from: g */
    public final C86054o f282777g;

    /* renamed from: h */
    public final C85700a f282778h;

    /* renamed from: i */
    public final C101330bj f282779i;

    /* renamed from: j */
    public final C101332bl f282780j;

    /* renamed from: k */
    public final C16893a f282781k;

    /* renamed from: l */
    public final CarAssistantSessionManager f282782l;

    /* renamed from: m */
    public final C142660f f282783m;

    /* renamed from: n */
    public final C101380i f282784n;

    /* renamed from: o */
    public final ae f282785o;

    /* renamed from: p */
    public final Context f282786p;

    /* renamed from: q */
    public final C84184a f282787q;

    /* renamed from: r */
    public final C22871g f282788r;

    /* renamed from: s */
    public final C11626b f282789s;

    /* renamed from: t */
    public final C11636b f282790t;

    /* renamed from: u */
    public final C22871g f282791u;

    /* renamed from: v */
    public final C69464a f282792v;

    /* renamed from: w */
    public final C69464a f282793w;

    /* renamed from: x */
    public final C69464a f282794x;

    /* renamed from: y */
    public final C69464a f282795y;

    /* renamed from: z */
    public final C87673aa f282796z;

    public C101325be(C11764am amVar, C11791b bVar, C37266j jVar, SharedPreferences sharedPreferences, C21370a aVar, C86124t tVar, C22871g gVar, C86054o oVar, C11432a aVar2, C85700a aVar3, C101330bj bjVar, C101326bf bfVar, C101332bl blVar, CarAssistantSessionManager carAssistantSessionManager, C101327bg bgVar, C142660f fVar, C84190d dVar, C101380i iVar, ae aeVar, Context context, C84184a aVar4, C84196h hVar, C22871g gVar2, C84187b bVar2, C11626b bVar3, C11636b bVar4, C22871g gVar3, CarAssistantSessionManager.Config config, C58485gu guVar, C69464a aVar5, C11574at atVar, C42876ab abVar, C87673aa aaVar, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C16893a aVar10, C69464a aVar11, C69464a aVar12, C11613n nVar, C69464a aVar13, C11628d dVar2, C39141kp kpVar) {
        C13043e eVar = (C13043e) C13044f.f40495e.createBuilder();
        C$AutoValue_CarAssistantSessionManager_Config _autovalue_carassistantsessionmanager_config = (C$AutoValue_CarAssistantSessionManager_Config) config;
        String g = C58837ba.m90858g(_autovalue_carassistantsessionmanager_config.f231673e);
        eVar.copyOnWrite();
        C13044f fVar2 = (C13044f) eVar.instance;
        fVar2.f40497a = 1 | fVar2.f40497a;
        fVar2.f40498b = g;
        String str = _autovalue_carassistantsessionmanager_config.f231674f;
        eVar.copyOnWrite();
        C13044f fVar3 = (C13044f) eVar.instance;
        fVar3.f40497a |= 2;
        fVar3.f40499c = C58837ba.m90858g(str);
        C13044f fVar4 = (C13044f) eVar.build();
        C13044f fVar5 = fVar4;
        C11777m mVar = amVar.f37891a;
        C11652a aVar14 = (C11652a) mVar.f37910a.mo17428b();
        C11652a aVar15 = aVar14;
        aVar14.getClass();
        C34837a aVar16 = (C34837a) mVar.f37911b.mo17428b();
        C34837a aVar17 = aVar16;
        aVar16.getClass();
        Executor executor = (Executor) mVar.f37912c.mo17428b();
        Executor executor2 = executor;
        executor.getClass();
        C71422aw awVar = (C71422aw) mVar.f37913d.mo17428b();
        C71422aw awVar2 = awVar;
        awVar.getClass();
        C69464a aVar18 = mVar.f37914e;
        C47770dh dhVar = (C47770dh) mVar.f37915f.mo17428b();
        C47770dh dhVar2 = dhVar;
        dhVar.getClass();
        C21370a aVar19 = (C21370a) mVar.f37916g.mo17428b();
        C21370a aVar20 = aVar19;
        aVar19.getClass();
        C11805l lVar = (C11805l) mVar.f37917h.mo17428b();
        C11805l lVar2 = lVar;
        lVar.getClass();
        C69464a aVar21 = mVar.f37918i;
        C69464a aVar22 = mVar.f37919j;
        C11750a aVar23 = r2;
        C11636b bVar5 = (C11636b) mVar.f37920k.mo17428b();
        C11750a aVar24 = aVar23;
        C11636b bVar6 = bVar5;
        bVar5.getClass();
        Map map = (Map) mVar.f37921l.mo17428b();
        C11777m mVar2 = mVar;
        Map map2 = map;
        map.getClass();
        fVar4.getClass();
        guVar.getClass();
        C69464a aVar25 = mVar2.f37922m;
        C13436d dVar3 = (C13436d) mVar2.f37923n.mo17428b();
        C13436d dVar4 = dVar3;
        dVar3.getClass();
        C32240a aVar26 = (C32240a) mVar2.f37924o.mo17428b();
        aVar26.getClass();
        C11750a aVar27 = new C11750a(aVar15, aVar17, executor2, awVar2, aVar18, dhVar2, aVar20, lVar2, aVar21, aVar22, bVar6, map2, fVar5, guVar, aVar25, dVar4, aVar26);
        this.f282756M = aVar23;
        this.f282773c = bVar;
        this.f282772b = jVar.mo40826a();
        this.f282774d = sharedPreferences;
        this.f282775e = aVar;
        this.f282776f = tVar;
        this.f282757N = gVar;
        this.f282777g = oVar;
        this.f282758O = aVar2;
        this.f282778h = aVar3;
        this.f282779i = bjVar;
        this.f282759P = bfVar;
        this.f282780j = blVar;
        this.f282781k = aVar10;
        this.f282782l = carAssistantSessionManager;
        this.f282760Q = bgVar;
        this.f282783m = fVar;
        this.f282754K = dVar;
        this.f282784n = iVar;
        this.f282785o = aeVar;
        this.f282786p = context;
        this.f282787q = aVar4;
        this.f282763T = hVar;
        this.f282788r = gVar2;
        this.f282764U = bVar2;
        this.f282789s = bVar3;
        this.f282790t = bVar4;
        this.f282791u = gVar3;
        this.f282765V = config;
        this.f282770aa = atVar;
        this.f282792v = aVar5;
        this.f282744A = abVar;
        this.f282796z = aaVar;
        this.f282793w = aVar6;
        this.f282794x = aVar7;
        this.f282795y = aVar8;
        this.f282767X = aVar9;
        this.f282771ab = nVar;
        this.f282768Y = aVar11;
        this.f282745B = aVar12;
        this.f282766W = aVar13;
        this.f282746C = dVar2;
        this.f282747D = kpVar;
    }

    /* renamed from: o */
    public static void m167594o(C8898bp bpVar) {
        int i;
        C13054p pVar = C13054p.IDLE;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C8898bp bpVar2 = C8898bp.EVENT_TYPE_UNSPECIFIED;
        int ordinal = bpVar.ordinal();
        if (ordinal == 4) {
            i = 1618;
        } else if (ordinal != 7) {
            switch (ordinal) {
                case 11:
                    i = 1582;
                    break;
                case 12:
                    i = 1583;
                    break;
                case 13:
                    i = 1595;
                    break;
                case 14:
                    i = 1610;
                    break;
                case 15:
                    i = 1611;
                    break;
                case 16:
                    i = 1614;
                    break;
                case 17:
                    i = 1615;
                    break;
                case 18:
                    i = 1616;
                    break;
                case 19:
                    i = 1617;
                    break;
                default:
                    ((C58970a) ((C58970a) f282743a.mo56224b()).mo56372aa(20018)).mo56389s("Untracked GearheadEvent %s", bpVar.name());
                    i = -1;
                    break;
            }
        } else {
            i = 1575;
        }
        if (i != -1) {
            C89949q.m146523g(i);
        }
    }

    /* renamed from: u */
    private final void m167595u(boolean z) {
        Intent intent = new Intent("action_auto_projected_client_info");
        intent.putExtra("extra_auto_projected_client_active", z);
        this.f282786p.sendBroadcast(intent);
    }

    /* renamed from: v */
    private final void m167596v() {
        this.f282773c.mo20154g(C13054p.IDLE);
        this.f282773c.mo20152e(false);
        this.f282773c.mo20153f(false);
    }

    /* renamed from: w */
    private final void m167597w(C60870cx cxVar) {
        new C90873ag(cxVar, this.f282788r, "Start Car Activity", new C101334d(this)).mo85223a(C101335e.f282824a);
    }

    /* renamed from: a */
    public final C142658d mo77655a() {
        if (this.f282749F) {
            return this.f282761R;
        }
        try {
            this.f282783m.asBinder().linkToDeath(this.f282762S, 0);
            this.f282782l.mo79301c();
            this.f282782l.mo79305h(this);
            C101330bj bjVar = this.f282779i;
            if (!bjVar.f282813c) {
                bjVar.mo92249b();
                bjVar.mo92248a();
                C86127w wVar = bjVar.f282811a;
                wVar.f232790a.mo79724c(bjVar.f282812b);
                bjVar.f282813c = true;
            }
            this.f282784n.mo92254b();
            m167596v();
            if (this.f282776f.mo79746e(C90086ek.f250319ar)) {
                ((C58970a) ((C58970a) f282743a.mo56224b()).mo56372aa(20027)).mo56386p("register CarMicrophoneBroadcastReceiver");
                this.f282791u.mo28212l("create-car-mic-broadcast-receiver", new C101291ab(this));
            }
            if (((Boolean) this.f282766W.mo17428b()).booleanValue()) {
                ((C58970a) ((C58970a) f282743a.mo56224b()).mo56372aa(20028)).mo56386p("register ZwiebackDebugBroadcastReceiver");
                this.f282791u.mo28212l("create-zwieback-debug-broadcast-receiver", new C101336f(this));
            }
            if (mo92242t()) {
                if (((Boolean) this.f282768Y.mo17428b()).booleanValue()) {
                    new C90873ag(this.f282771ab.mo20081a(), this.f282791u, "Start prewarm after connection", new C101292ac(this)).mo85223a(C101293ad.f282699a);
                } else {
                    this.f282789s.mo20078b();
                }
            }
            if (this.f282776f.mo79746e(C90086ek.f250313al)) {
                new C90873ag(this.f282744A.mo46042d(), this.f282788r, "firstQueryTime", new C101339i(this)).mo85223a(C101341k.f282830a);
            }
            if (this.f282776f.mo79746e(C90086ek.f250427ct)) {
                m167595u(true);
            }
            this.f282749F = true;
            return this.f282761R;
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f282743a.mo56225c()).mo56382g(e)).mo56372aa(19989)).mo56386p("Client process died before car assistant activation");
            return this.f282761R;
        }
    }

    /* renamed from: b */
    public final void mo77656b() {
        if (this.f282749F) {
            ((C58970a) ((C58970a) f282743a.mo56226d()).mo56372aa(20019)).mo56386p("onDestroy(): Car assistant still active");
        }
        mo92235l();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo79379c() {
    }

    /* renamed from: d */
    public final void mo79380d(ServiceEventData serviceEventData) {
        mo92236m(new C101299aj(this, serviceEventData), "onServiceEvent");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = (com.google.common.p4552o.p4553a.C59470au) com.google.common.p4552o.p4553a.C59473ax.f157780o.createBuilder((com.google.common.p4552o.p4553a.C59473ax) com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) com.google.common.p4552o.p4553a.C59473ax.f157780o, r11.f282783m.mo117447i(), com.google.protobuf.C62921ba.m95368a()));
        r3 = new java.util.Random();
        r2.copyOnWrite();
        r9 = (com.google.common.p4552o.p4553a.C59473ax) r2.instance;
        r9.f157782a |= 16;
        r9.f157788g = (((com.google.common.p4552o.p4553a.C59473ax) r2.instance).f157788g + ((long) r3.nextInt(9))) + 1;
        r2.copyOnWrite();
        r6 = (com.google.common.p4552o.p4553a.C59473ax) r2.instance;
        r6.f157782a |= 32;
        r6.f157789h = (r9.f157789h + ((long) r3.nextInt(9))) + 1;
        r2.copyOnWrite();
        ((com.google.common.p4552o.p4553a.C59473ax) r2.instance).f157787f = com.google.common.p4552o.p4553a.C59473ax.emptyProtobufList();
        r2.copyOnWrite();
        r4 = (com.google.common.p4552o.p4553a.C59473ax) r2.instance;
        r4.mo56967a();
        com.google.protobuf.C62947c.addAll((java.lang.Iterable) (java.util.List) p3186j$.util.Collection.EL.stream(java.util.Collections.unmodifiableList(r6.f157787f)).map(new com.google.android.apps.gsa.staticplugins.gearhead.C101398q(r3)).collect(p3186j$.util.stream.Collectors.toCollection(com.google.android.apps.gsa.staticplugins.gearhead.C101399r.f282930a)), (java.util.List) r4.f157787f);
        r2 = (com.google.common.p4552o.p4553a.C59473ax) r2.build();
        r1.copyOnWrite();
        r3 = (com.google.common.p4552o.C60555uf) r1.instance;
        r2.getClass();
        r3.f164263r = r2;
        r3.f164093a |= 128;
        com.google.android.apps.gsa.shared.logger.C89949q.m146525j((com.google.common.p4552o.C60555uf) r1.build(), (com.google.common.p4552o.C60321oe) null, (com.google.protos.p4816ai.p4818b.C63196b) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0191, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0192, code lost:
        ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) f282743a.mo56226d()).mo56382g(r0)).mo56372aa(20025)).mo56386p("Couldn't log Gearhead session info.");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00dd */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79381e() {
        /*
            r11 = this;
            com.google.common.f.a.d r0 = f282743a
            com.google.common.f.x r1 = r0.mo56224b()
            java.lang.String r2 = "onVoiceSessionEnd()"
            r3 = 20023(0x4e37, float:2.8058E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.search.core.i.t r1 = r11.f282776f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250461da
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x01ab
            com.google.common.o.uf r1 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            int r3 = r2.f164093a
            r3 = r3 | 2
            r2.f164093a = r3
            r3 = 1527(0x5f7, float:2.14E-42)
            r2.f164258m = r3
            java.lang.Long r2 = r11.f282750G
            r3 = 4
            if (r2 == 0) goto L_0x004e
            long r4 = r2.longValue()
            java.lang.String r2 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r4)
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            r2.getClass()
            int r5 = r4.f164093a
            r5 = r5 | r3
            r4.f164093a = r5
            r4.f164259n = r2
        L_0x004e:
            com.google.android.apps.gsa.projection.b.b r2 = r11.f282764U
            int r2 = r2.f229171a
            if (r2 < r3) goto L_0x01a0
            r0 = 0
            com.google.android.gearhead.sdk.assistant.f r2 = r11.f282783m     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            byte[] r2 = r2.mo117447i()     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.android.apps.auto.a.a.bk r4 = com.google.android.apps.auto.p450a.p451a.C8893bk.f30858l     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r2, (com.google.protobuf.C62921ba) r3)     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.android.apps.auto.a.a.bk r2 = (com.google.android.apps.auto.p450a.p451a.C8893bk) r2     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.common.o.a.ax r2 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11634j.m27336b(r2)     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b r3 = r11.f282790t     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            java.lang.String r3 = r3.f37595e     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.common.o.a.ax r4 = com.google.common.p4552o.p4553a.C59473ax.f157780o     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.protobuf.bn r4 = r4.createBuilder(r2)     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.common.o.a.au r4 = (com.google.common.p4552o.p4553a.C59470au) r4     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r4.copyOnWrite()     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.common.o.a.ax r5 = (com.google.common.p4552o.p4553a.C59473ax) r5     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            int r6 = r5.f157782a     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r6 = r6 | 512(0x200, float:7.175E-43)
            r5.f157782a = r6     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r6 = 0
            r5.f157793l = r6     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            java.lang.String r3 = com.google.common.base.C58837ba.m90858g(r3)     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r4.copyOnWrite()     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.common.o.a.ax r5 = (com.google.common.p4552o.p4553a.C59473ax) r5     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            int r6 = r5.f157782a     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r5.f157782a = r6     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r5.f157794m = r3     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.protobuf.bv r3 = r4.build()     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.common.o.a.ax r3 = (com.google.common.p4552o.p4553a.C59473ax) r3     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r1.copyOnWrite()     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.protobuf.bv r4 = r1.instance     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r3.getClass()     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r4.f164263r = r3     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            int r3 = r4.f164093a     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r3 = r3 | 128(0x80, float:1.794E-43)
            r4.f164093a = r3     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.android.apps.gsa.search.core.i.t r3 = r11.f282776f     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250462db     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            long r3 = r3.mo79743a(r4)     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d2
            com.google.android.libraries.gsa.k.g r5 = r11.f282791u     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b r6 = r11.f282790t     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.common.util.concurrent.cx r2 = r6.mo20093a(r2, r3)     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.android.apps.gsa.staticplugins.gearhead.ar r3 = new com.google.android.apps.gsa.staticplugins.gearhead.ar     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            r3.<init>()     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            java.lang.String r4 = "CarAssistant has finished saving recent session telemetry."
            r5.mo28211k(r2, r4, r3)     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
        L_0x00d2:
            com.google.protobuf.bv r2 = r1.build()     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r2, r0, r0, r0)     // Catch:{ RemoteException | ct | NullPointerException | UnsupportedOperationException -> 0x00dd }
            goto L_0x01ab
        L_0x00dd:
            com.google.android.gearhead.sdk.assistant.f r2 = r11.f282783m     // Catch:{ Exception -> 0x0191 }
            byte[] r2 = r2.mo117447i()     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.ax r4 = com.google.common.p4552o.p4553a.C59473ax.f157780o     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r2, (com.google.protobuf.C62921ba) r3)     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.ax r2 = (com.google.common.p4552o.p4553a.C59473ax) r2     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.ax r3 = com.google.common.p4552o.p4553a.C59473ax.f157780o     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bn r2 = r3.createBuilder(r2)     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.au r2 = (com.google.common.p4552o.p4553a.C59470au) r2     // Catch:{ Exception -> 0x0191 }
            java.util.Random r3 = new java.util.Random     // Catch:{ Exception -> 0x0191 }
            r3.<init>()     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.ax r4 = (com.google.common.p4552o.p4553a.C59473ax) r4     // Catch:{ Exception -> 0x0191 }
            long r4 = r4.f157788g     // Catch:{ Exception -> 0x0191 }
            r6 = 9
            int r7 = r3.nextInt(r6)     // Catch:{ Exception -> 0x0191 }
            long r7 = (long) r7     // Catch:{ Exception -> 0x0191 }
            long r4 = r4 + r7
            r7 = 1
            long r4 = r4 + r7
            r2.copyOnWrite()     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.ax r9 = (com.google.common.p4552o.p4553a.C59473ax) r9     // Catch:{ Exception -> 0x0191 }
            int r10 = r9.f157782a     // Catch:{ Exception -> 0x0191 }
            r10 = r10 | 16
            r9.f157782a = r10     // Catch:{ Exception -> 0x0191 }
            r9.f157788g = r4     // Catch:{ Exception -> 0x0191 }
            long r4 = r9.f157789h     // Catch:{ Exception -> 0x0191 }
            int r6 = r3.nextInt(r6)     // Catch:{ Exception -> 0x0191 }
            long r9 = (long) r6     // Catch:{ Exception -> 0x0191 }
            long r4 = r4 + r9
            long r4 = r4 + r7
            r2.copyOnWrite()     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.ax r6 = (com.google.common.p4552o.p4553a.C59473ax) r6     // Catch:{ Exception -> 0x0191 }
            int r7 = r6.f157782a     // Catch:{ Exception -> 0x0191 }
            r7 = r7 | 32
            r6.f157782a = r7     // Catch:{ Exception -> 0x0191 }
            r6.f157789h = r4     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.cq r4 = r6.f157787f     // Catch:{ Exception -> 0x0191 }
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)     // Catch:{ Exception -> 0x0191 }
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)     // Catch:{ Exception -> 0x0191 }
            com.google.android.apps.gsa.staticplugins.gearhead.q r5 = new com.google.android.apps.gsa.staticplugins.gearhead.q     // Catch:{ Exception -> 0x0191 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0191 }
            j$.util.stream.Stream r3 = r4.map(r5)     // Catch:{ Exception -> 0x0191 }
            com.google.android.apps.gsa.staticplugins.gearhead.r r4 = com.google.android.apps.gsa.staticplugins.gearhead.C101399r.f282930a     // Catch:{ Exception -> 0x0191 }
            j$.util.stream.Collector r4 = p3186j$.util.stream.Collectors.toCollection(r4)     // Catch:{ Exception -> 0x0191 }
            java.lang.Object r3 = r3.collect(r4)     // Catch:{ Exception -> 0x0191 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x0191 }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.ax r4 = (com.google.common.p4552o.p4553a.C59473ax) r4     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.cq r5 = com.google.common.p4552o.p4553a.C59473ax.emptyProtobufList()     // Catch:{ Exception -> 0x0191 }
            r4.f157787f = r5     // Catch:{ Exception -> 0x0191 }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.ax r4 = (com.google.common.p4552o.p4553a.C59473ax) r4     // Catch:{ Exception -> 0x0191 }
            r4.mo56967a()     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.cq r4 = r4.f157787f     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r4)     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.a.ax r2 = (com.google.common.p4552o.p4553a.C59473ax) r2     // Catch:{ Exception -> 0x0191 }
            r1.copyOnWrite()     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3     // Catch:{ Exception -> 0x0191 }
            r2.getClass()     // Catch:{ Exception -> 0x0191 }
            r3.f164263r = r2     // Catch:{ Exception -> 0x0191 }
            int r2 = r3.f164093a     // Catch:{ Exception -> 0x0191 }
            r2 = r2 | 128(0x80, float:1.794E-43)
            r3.f164093a = r2     // Catch:{ Exception -> 0x0191 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ Exception -> 0x0191 }
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1     // Catch:{ Exception -> 0x0191 }
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r1, r0, r0, r0)     // Catch:{ Exception -> 0x0191 }
            goto L_0x01ab
        L_0x0191:
            r0 = move-exception
            com.google.common.f.a.d r1 = f282743a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Couldn't log Gearhead session info."
            r3 = 20025(0x4e39, float:2.8061E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            goto L_0x01ab
        L_0x01a0:
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Minimum API version of 4 required to log Gearhead session info."
            r2 = 20024(0x4e38, float:2.806E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x01ab:
            com.google.android.apps.gsa.staticplugins.gearhead.ak r0 = new com.google.android.apps.gsa.staticplugins.gearhead.ak
            r0.<init>(r11)
            java.lang.String r1 = "onSessionEnded"
            r11.mo92236m(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.gearhead.C101325be.mo79381e():void");
    }

    /* renamed from: f */
    public final void mo79382f(String str, String str2) {
        mo92236m(new C101405x(this, str, str2), "onThirdPartyProviderInfo");
    }

    /* renamed from: g */
    public final void mo79383g(boolean z) {
        mo92236m(new C101342l(this, z), "updateIsTtsPlaying");
    }

    /* renamed from: h */
    public final void mo79384h(int i) {
        mo92236m(new C101401t(this, i), "updateRecognitionState");
    }

    /* renamed from: i */
    public final /* synthetic */ void mo79385i() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0437, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0438, code lost:
        p5462h.p5472e.C69598b.m101013a(r15, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x043b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00da, code lost:
        if (r15.isEmpty() == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f1, code lost:
        if (r15 != 4) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fa, code lost:
        r8 = com.evernote.android.state.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0103, code lost:
        r8 = "and.gsa.fusion.notification";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010d, code lost:
        if (r8 == null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        r8 = "and.gsa.fusion.mic";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0272, code lost:
        if (r14 == null) goto L_0x0274;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo92233j(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r14, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot r15) {
        /*
            r13 = this;
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97493bL
            com.google.android.libraries.search.b.i.a r0 = r0.mo40779c()
            com.google.protobuf.bt r1 = com.google.common.p4552o.C59711cz.f160208s
            com.google.common.o.cz r2 = com.google.common.p4552o.C59711cz.f160207r
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.cy r2 = (com.google.common.p4552o.C59710cy) r2
            com.google.common.o.db r3 = com.google.common.p4552o.C59717db.f160291d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.da r3 = (com.google.common.p4552o.C59716da) r3
            boolean r4 = r13.f282769Z
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.db r5 = (com.google.common.p4552o.C59717db) r5
            int r6 = r5.f160293a
            r7 = 1
            r6 = r6 | r7
            r5.f160293a = r6
            r5.f160294b = r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.db r3 = (com.google.common.p4552o.C59717db) r3
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.common.o.cz r4 = (com.google.common.p4552o.C59711cz) r4
            r3.getClass()
            r4.f160224o = r3
            int r3 = r4.f160210a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r4.f160210a = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.common.o.cz r2 = (com.google.common.p4552o.C59711cz) r2
            r3 = r0
            com.google.android.libraries.search.b.i.b r3 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r3
            r3.mo40792p(r1, r2)
            r13.mo92234k(r0)
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a r0 = r13.f282756M
            com.google.android.apps.gsa.search.core.i.t r1 = r13.f282776f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250313al
            boolean r1 = r1.mo79746e(r2)
            r2 = 0
            if (r1 == 0) goto L_0x007c
            long r3 = r13.f282748E
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x007c
            com.google.android.libraries.f.a r1 = r13.f282775e
            long r3 = r1.mo26870b()
            long r5 = r13.f282748E
            long r3 = r3 - r5
            com.google.android.apps.gsa.search.core.i.t r1 = r13.f282776f
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250282aG
            long r5 = r1.mo79743a(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x007c
            r1 = 1
            goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.r r3 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13056r.f40527d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.q r3 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13055q) r3
            boolean r4 = r13.f282769Z
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.r r5 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13056r) r5
            int r6 = r5.f40529a
            r6 = r6 | r7
            r5.f40529a = r6
            r5.f40530b = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.r r4 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13056r) r4
            int r5 = r4.f40529a
            r6 = 2
            r5 = r5 | r6
            r4.f40529a = r5
            r4.f40531c = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.r r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13056r) r1
            java.lang.String r3 = "voiceSessionConfig"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r3)
            java.lang.String r4 = "requestMetadata"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            r4 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r4 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r4
            r4.f37832j = r14
            r4.f37833k = r15
            r4.f37834l = r1
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r3)
            int r1 = r14.f387135f
            r5 = 3
            java.lang.String r8 = "and.gsa.fusion.rail.media.recommendation"
            r9 = 9
            if (r1 == r9) goto L_0x0110
            java.lang.String r10 = "and.gsa.fusion.mic"
            java.lang.String r11 = ""
            java.lang.String r12 = "and.gsa.fusion.notification"
            switch(r1) {
                case 1: goto L_0x00ff;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00fc;
                case 4: goto L_0x00e0;
                case 5: goto L_0x0110;
                case 6: goto L_0x00dd;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            java.util.List r15 = r15.f387106b
            if (r15 == 0) goto L_0x00fa
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x00fa
            goto L_0x0103
        L_0x00dd:
            java.lang.String r8 = "and.gsa.fusion.assistant.suggestion"
            goto L_0x0110
        L_0x00e0:
            android.os.Bundle r15 = r14.f387137h
            if (r15 == 0) goto L_0x00fa
            java.lang.String r1 = "VOICE_SESSION_TRIGGER_KEY"
            int r15 = r15.getInt(r1, r2)
            if (r15 == r7) goto L_0x00f7
            if (r15 == r6) goto L_0x010f
            if (r15 == r5) goto L_0x00f4
            r1 = 4
            if (r15 == r1) goto L_0x0110
            goto L_0x00fa
        L_0x00f4:
            java.lang.String r8 = "and.gsa.fusion.bluetooth"
            goto L_0x0110
        L_0x00f7:
            java.lang.String r8 = "and.gsa.fusion.hotword"
            goto L_0x0110
        L_0x00fa:
            r8 = r11
            goto L_0x0110
        L_0x00fc:
            java.lang.String r8 = "and.gsa.fusion.hardware.button"
            goto L_0x0110
        L_0x00ff:
            int r15 = r14.f387130a
            if (r15 != r6) goto L_0x0105
        L_0x0103:
            r8 = r12
            goto L_0x0110
        L_0x0105:
            com.google.android.apps.auto.a.a.bp r15 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11793d.m27457a(r14)
            java.lang.String r8 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11793d.m27459c(r15)
            if (r8 != 0) goto L_0x0110
        L_0x010f:
            r8 = r10
        L_0x0110:
            r4.f37835m = r8
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b r15 = r4.f37830h
            java.lang.String r1 = r14.f387140k
            r15.f37595e = r1
            com.google.apps.tiktok.tracing.dh r15 = r4.f37826d
            java.lang.String r1 = "AssistantRequestFactory#create "
            com.google.apps.tiktok.tracing.ax r15 = r15.mo51613c(r1)
            int r1 = r14.f387130a     // Catch:{ all -> 0x0435 }
            java.lang.String r4 = "AssistantRequestFactory"
            java.lang.String r8 = "newBuilder()"
            r10 = 0
            switch(r1) {
                case 1: goto L_0x03b6;
                case 2: goto L_0x03af;
                case 3: goto L_0x036a;
                case 4: goto L_0x02ef;
                case 5: goto L_0x01e8;
                case 6: goto L_0x017f;
                case 7: goto L_0x0136;
                case 8: goto L_0x012e;
                default: goto L_0x012a;
            }
        L_0x012a:
            com.google.common.f.e r0 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a.f37822a     // Catch:{ all -> 0x0435 }
            goto L_0x03f4
        L_0x012e:
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r0     // Catch:{ all -> 0x0435 }
            com.google.common.util.concurrent.cx r14 = r0.mo20131d(r7)     // Catch:{ all -> 0x0435 }
            goto L_0x0413
        L_0x0136:
            r1 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r1 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r1     // Catch:{ all -> 0x0435 }
            java.lang.String r1 = r1.f37835m     // Catch:{ all -> 0x0435 }
            if (r1 != 0) goto L_0x0143
            java.lang.String r1 = "requestSource"
            p5462h.p5473f.p5475b.C69664n.m101065k(r1)     // Catch:{ all -> 0x0435 }
            r1 = r10
        L_0x0143:
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0435 }
            android.os.Bundle r14 = r14.f387137h     // Catch:{ all -> 0x0435 }
            if (r14 == 0) goto L_0x0178
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.g r3 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g.AUTO_PROJECTED     // Catch:{ all -> 0x0435 }
            java.lang.String r4 = "PHONE_NUMBER_KEY"
            java.lang.String r4 = r14.getString(r4)     // Catch:{ all -> 0x0435 }
            java.lang.String r5 = "RECIPIENT_NAME_KEY"
            java.lang.String r5 = r14.getString(r5)     // Catch:{ all -> 0x0435 }
            java.lang.String r6 = "ADD_PRE_DIALOG_CONFIRMATION_KEY"
            boolean r14 = r14.getBoolean(r6)     // Catch:{ all -> 0x0435 }
            com.google.assistant.e.j.du r14 = com.google.android.libraries.assistant.auto.tng.p945f.p950b.p952b.C13367a.m29621b(r4, r5, r14)     // Catch:{ all -> 0x0435 }
            r4 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r4 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r4     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.f.a r4 = r4.f37827e     // Catch:{ all -> 0x0435 }
            long r4 = r4.mo26871c()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.c r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12967c.m29204a(r3, r1, r4)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12967c.m29207d(r1, r14)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r0     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r14 = r0.mo20129b(r1)     // Catch:{ all -> 0x0435 }
            goto L_0x0179
        L_0x0178:
            r14 = r10
        L_0x0179:
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)     // Catch:{ all -> 0x0435 }
            goto L_0x0413
        L_0x017f:
            r14 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r14 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r14     // Catch:{ all -> 0x0435 }
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r14 = r14.f37832j     // Catch:{ all -> 0x0435 }
            if (r14 != 0) goto L_0x018a
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)     // Catch:{ all -> 0x0435 }
            r14 = r10
        L_0x018a:
            com.google.android.gearhead.sdk.assistant.i r14 = r14.f387142m     // Catch:{ all -> 0x0435 }
            if (r14 == 0) goto L_0x01e1
            r1 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r1 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r1     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.l r1 = r1.f37828f     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.c r3 = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.c     // Catch:{ all -> 0x0435 }
            r3.<init>(r1, r14)     // Catch:{ all -> 0x0435 }
            java.util.concurrent.Executor r14 = r1.f37966d     // Catch:{ all -> 0x0435 }
            java.util.concurrent.Callable r1 = com.google.apps.tiktok.tracing.C47810es.m84978r(r3)     // Catch:{ all -> 0x0435 }
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92904m(r1, r14)     // Catch:{ all -> 0x0435 }
            java.lang.String r1 = "Failed to update ITranscriptionCallback"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0435 }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r14, r1, r3)     // Catch:{ all -> 0x0435 }
            r14 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r14 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r14     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.c r14 = r14.mo20128a()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ai r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12977ai.f40350a     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ah r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12976ah) r1     // Catch:{ all -> 0x0435 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ak r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ai r1 = r1.mo20862a()     // Catch:{ all -> 0x0435 }
            r14.copyOnWrite()     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bv r3 = r14.instance     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r3 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d) r3     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r4 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d.f40365e     // Catch:{ all -> 0x0435 }
            r1.getClass()     // Catch:{ all -> 0x0435 }
            r3.f40369c = r1     // Catch:{ all -> 0x0435 }
            r1 = 8
            r3.f40368b = r1     // Catch:{ all -> 0x0435 }
            java.lang.String r1 = "createRequestBuilder().a…transcriptionRequest {} }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r1)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r0     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r14 = r0.mo20129b(r14)     // Catch:{ all -> 0x0435 }
            goto L_0x01e2
        L_0x01e1:
            r14 = r10
        L_0x01e2:
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)     // Catch:{ all -> 0x0435 }
            goto L_0x0413
        L_0x01e8:
            r14 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r14 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r14     // Catch:{ all -> 0x0435 }
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r14 = r14.f37832j     // Catch:{ all -> 0x0435 }
            if (r14 != 0) goto L_0x01f3
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)     // Catch:{ all -> 0x0435 }
            r14 = r10
        L_0x01f3:
            int r14 = r14.f387135f     // Catch:{ all -> 0x0435 }
            r1 = 5
            java.lang.String r6 = "createRequestBuilder().a…            }\n          }"
            if (r14 == r1) goto L_0x024f
            r1 = 6
            if (r14 == r1) goto L_0x0202
            if (r14 == r9) goto L_0x024f
            r14 = r10
            goto L_0x02e9
        L_0x0202:
            r14 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r14 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r14     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.c r14 = r14.mo20128a()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.aa r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12969aa.f40337e     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.z r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13008z) r1     // Catch:{ all -> 0x0435 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ac r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")     // Catch:{ all -> 0x0435 }
            r4 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r4 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r4     // Catch:{ all -> 0x0435 }
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r4 = r4.f37832j     // Catch:{ all -> 0x0435 }
            if (r4 != 0) goto L_0x0223
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)     // Catch:{ all -> 0x0435 }
            r4 = r10
        L_0x0223:
            java.lang.String r3 = r4.f387141l     // Catch:{ all -> 0x0435 }
            java.lang.String r4 = "voiceSessionConfig.suggestionActionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ all -> 0x0435 }
            r1.mo20858b(r3)     // Catch:{ all -> 0x0435 }
            r1.mo20859c()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.aa r1 = r1.mo20857a()     // Catch:{ all -> 0x0435 }
            r14.copyOnWrite()     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bv r3 = r14.instance     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r3 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d) r3     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r4 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d.f40365e     // Catch:{ all -> 0x0435 }
            r1.getClass()     // Catch:{ all -> 0x0435 }
            r3.f40369c = r1     // Catch:{ all -> 0x0435 }
            r3.f40368b = r5     // Catch:{ all -> 0x0435 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r6)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r0     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r14 = r0.mo20129b(r14)     // Catch:{ all -> 0x0435 }
            goto L_0x02e9
        L_0x024f:
            r14 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r14 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r14     // Catch:{ ct -> 0x027c }
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r14 = r14.f37832j     // Catch:{ ct -> 0x027c }
            if (r14 != 0) goto L_0x025a
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)     // Catch:{ ct -> 0x027c }
            r14 = r10
        L_0x025a:
            android.os.Bundle r14 = r14.f387137h     // Catch:{ ct -> 0x027c }
            if (r14 == 0) goto L_0x0274
            java.lang.String r1 = "DISPLAYED_MEDIA_RECS_ON_SIDECARD"
            byte[] r14 = r14.getByteArray(r1)     // Catch:{ ct -> 0x027c }
            if (r14 == 0) goto L_0x0274
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x027c }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ad r3 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11673ad.f37660b     // Catch:{ ct -> 0x027c }
            com.google.protobuf.bv r14 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r14, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x027c }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ad r14 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11673ad) r14     // Catch:{ ct -> 0x027c }
            if (r14 != 0) goto L_0x0276
        L_0x0274:
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ad r14 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11673ad.f37660b     // Catch:{ ct -> 0x027c }
        L_0x0276:
            java.lang.String r1 = "{\n            voiceSessi…ultInstance()\n          }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r1)     // Catch:{ ct -> 0x027c }
            goto L_0x02a7
        L_0x027c:
            r14 = move-exception
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a.f37822a     // Catch:{ all -> 0x0435 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0435 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0435 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0435 }
            r1.mo56378ag(r3, r4)     // Catch:{ all -> 0x0435 }
            com.google.common.f.x r14 = r1.mo56382g(r14)     // Catch:{ all -> 0x0435 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0435 }
            java.lang.String r1 = "Failed to parse displayed media recs from the CustomPayload."
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0435 }
            r4 = 43447(0xa9b7, float:6.0882E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x0435 }
            r14.mo56379ah(r3)     // Catch:{ all -> 0x0435 }
            r14.mo56386p(r1)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ad r14 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11673ad.f37660b     // Catch:{ all -> 0x0435 }
            java.lang.String r1 = "{\n            logger\n   …ultInstance()\n          }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r1)     // Catch:{ all -> 0x0435 }
        L_0x02a7:
            r1 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r1 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r1     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.c r1 = r1.mo20128a()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.s r3 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13001s.f40405b     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.r r3 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13000r) r3     // Catch:{ all -> 0x0435 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.u r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")     // Catch:{ all -> 0x0435 }
            r3.mo20870c()     // Catch:{ all -> 0x0435 }
            com.google.protobuf.cq r14 = r14.f37662a     // Catch:{ all -> 0x0435 }
            java.lang.String r4 = "displayedMediaRecs.mediaRecommendationsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r4)     // Catch:{ all -> 0x0435 }
            r3.mo20869b(r14)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.s r14 = r3.mo20868a()     // Catch:{ all -> 0x0435 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r3 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d) r3     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r4 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d.f40365e     // Catch:{ all -> 0x0435 }
            r14.getClass()     // Catch:{ all -> 0x0435 }
            r3.f40369c = r14     // Catch:{ all -> 0x0435 }
            r14 = 10
            r3.f40368b = r14     // Catch:{ all -> 0x0435 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r0     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r14 = r0.mo20129b(r1)     // Catch:{ all -> 0x0435 }
        L_0x02e9:
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)     // Catch:{ all -> 0x0435 }
            goto L_0x0413
        L_0x02ef:
            r14 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r14 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r14     // Catch:{ all -> 0x0435 }
            com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r14 = r14.f37832j     // Catch:{ all -> 0x0435 }
            if (r14 != 0) goto L_0x02fa
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)     // Catch:{ all -> 0x0435 }
            r14 = r10
        L_0x02fa:
            java.lang.String r14 = r14.f387132c     // Catch:{ all -> 0x0435 }
            if (r14 == 0) goto L_0x0363
            r1 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r1 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r1     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.c r1 = r1.mo20128a()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ae r3 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12973ae.f40345c     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ad r3 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12972ad) r3     // Catch:{ all -> 0x0435 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ag r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ak r4 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak.f40447c     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.af r4 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13018af) r4     // Catch:{ all -> 0x0435 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r8)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.am r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.aj r5 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13022aj.f40443c     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ai r5 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13021ai) r5     // Catch:{ all -> 0x0435 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ao r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")     // Catch:{ all -> 0x0435 }
            r5.mo20874b(r14)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.aj r14 = r5.mo20873a()     // Catch:{ all -> 0x0435 }
            r4.mo20872b(r14)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ak r14 = r4.mo20871a()     // Catch:{ all -> 0x0435 }
            r3.mo20861b(r14)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ae r14 = r3.mo20860a()     // Catch:{ all -> 0x0435 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0435 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r3 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d) r3     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r4 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d.f40365e     // Catch:{ all -> 0x0435 }
            r14.getClass()     // Catch:{ all -> 0x0435 }
            r3.f40369c = r14     // Catch:{ all -> 0x0435 }
            r3.f40368b = r6     // Catch:{ all -> 0x0435 }
            java.lang.String r14 = "createRequestBuilder().a…} }\n          }\n        }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r0     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r14 = r0.mo20129b(r1)     // Catch:{ all -> 0x0435 }
            goto L_0x0364
        L_0x0363:
            r14 = r10
        L_0x0364:
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)     // Catch:{ all -> 0x0435 }
            goto L_0x0413
        L_0x036a:
            r14 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r14 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r14     // Catch:{ all -> 0x0435 }
            g.a.a r14 = r14.f37829g     // Catch:{ all -> 0x0435 }
            java.lang.Object r14 = r14.mo17428b()     // Catch:{ all -> 0x0435 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0435 }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0435 }
            if (r14 != 0) goto L_0x039c
            com.google.common.f.e r14 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a.f37822a     // Catch:{ all -> 0x0435 }
            com.google.common.f.x r14 = r14.mo56225c()     // Catch:{ all -> 0x0435 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0435 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0435 }
            r14.mo56378ag(r0, r4)     // Catch:{ all -> 0x0435 }
            java.lang.String r0 = "Direct Reply on AAP is currently not supported."
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x0435 }
            r3 = 43453(0xa9bd, float:6.089E-41)
            r1.<init>(r3)     // Catch:{ all -> 0x0435 }
            r14.mo56379ah(r1)     // Catch:{ all -> 0x0435 }
            r14.mo56386p(r0)     // Catch:{ all -> 0x0435 }
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x0435 }
            goto L_0x0413
        L_0x039c:
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.b r14 = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.b     // Catch:{ all -> 0x0435 }
            r1 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r1 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r1     // Catch:{ all -> 0x0435 }
            r14.<init>(r1)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r0     // Catch:{ all -> 0x0435 }
            java.lang.String r1 = "DirectReply"
            com.google.common.util.concurrent.cx r14 = r0.mo20130c(r1, r14)     // Catch:{ all -> 0x0435 }
            goto L_0x0413
        L_0x03af:
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r0     // Catch:{ all -> 0x0435 }
            com.google.common.util.concurrent.cx r14 = r0.mo20131d(r2)     // Catch:{ all -> 0x0435 }
            goto L_0x0413
        L_0x03b6:
            r14 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r14 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r14     // Catch:{ all -> 0x0435 }
            java.util.Map r14 = r14.f37831i     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.g r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g.AUTO_PROJECTED     // Catch:{ all -> 0x0435 }
            java.lang.Object r14 = p5462h.p5463a.C69505av.m100865g(r14, r1)     // Catch:{ all -> 0x0435 }
            g.a.a r14 = (p5460g.p5461a.C69464a) r14     // Catch:{ all -> 0x0435 }
            java.lang.Object r14 = r14.mo17428b()     // Catch:{ all -> 0x0435 }
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.tng.f.c.b.b.n r1 = com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b.C13428n.UNREAD     // Catch:{ all -> 0x0435 }
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0435 }
            p5462h.p5473f.p5475b.C69664n.m101058d(r14)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.search.assistant.performer.communication.d.aa r14 = (com.google.android.libraries.search.assistant.performer.communication.p2736d.C35608aa) r14     // Catch:{ all -> 0x0435 }
            r1 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r1 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r1     // Catch:{ all -> 0x0435 }
            com.google.common.util.concurrent.cx r1 = r1.mo20132e()     // Catch:{ all -> 0x0435 }
            com.google.common.util.concurrent.cx r14 = r14.mo21082b(r1)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.c r1 = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.c     // Catch:{ all -> 0x0435 }
            r3 = r0
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r3 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r3     // Catch:{ all -> 0x0435 }
            r1.<init>(r3)     // Catch:{ all -> 0x0435 }
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11750a) r0     // Catch:{ all -> 0x0435 }
            java.util.concurrent.Executor r0 = r0.f37825c     // Catch:{ all -> 0x0435 }
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r1)     // Catch:{ all -> 0x0435 }
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60922j.m93044g(r14, r1, r0)     // Catch:{ all -> 0x0435 }
            goto L_0x0413
        L_0x03f4:
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0435 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0435 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0435 }
            r0.mo56378ag(r1, r4)     // Catch:{ all -> 0x0435 }
            java.lang.String r1 = "Unsupported voice session type: %d"
            int r14 = r14.f387130a     // Catch:{ all -> 0x0435 }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0435 }
            r4 = 43451(0xa9bb, float:6.0888E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x0435 }
            r0.mo56379ah(r3)     // Catch:{ all -> 0x0435 }
            r0.mo56387q(r1, r14)     // Catch:{ all -> 0x0435 }
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x0435 }
        L_0x0413:
            p5462h.p5472e.C69598b.m101013a(r15, r10)
            r13.f282769Z = r2
            com.google.apps.tiktok.tracing.contrib.b.f r14 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r14)
            com.google.android.apps.gsa.staticplugins.gearhead.v r15 = new com.google.android.apps.gsa.staticplugins.gearhead.v
            r15.<init>(r13)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r14 = r14.mo51515h(r15, r0)
            com.google.android.apps.gsa.staticplugins.gearhead.w r15 = new com.google.android.apps.gsa.staticplugins.gearhead.w
            r15.<init>(r13)
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r14 = r14.mo51513e(r0, r15, r1)
            return r14
        L_0x0435:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x0437 }
        L_0x0437:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r15, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.gearhead.C101325be.mo92233j(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot):com.google.common.util.concurrent.cx");
    }

    /* renamed from: k */
    public final void mo92234k(C37254c cVar) {
        this.f282772b.mo40774b(cVar.mo40779c());
    }

    /* renamed from: l */
    public final void mo92235l() {
        if (this.f282749F) {
            this.f282749F = false;
            this.f282769Z = true;
            C58974d dVar = f282743a;
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(20033)).mo56386p("unregister CarMicrophoneBroadcastReceiver");
            BroadcastReceiver broadcastReceiver = this.f282752I;
            if (broadcastReceiver != null) {
                this.f282786p.unregisterReceiver(broadcastReceiver);
                this.f282752I = null;
            }
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(20034)).mo56386p("unregister ZwiebackDebugBroadcastReceiver");
            BroadcastReceiver broadcastReceiver2 = this.f282753J;
            if (broadcastReceiver2 != null) {
                this.f282786p.unregisterReceiver(broadcastReceiver2);
                this.f282753J = null;
            }
            C84196h hVar = this.f282763T;
            hVar.f229185a = null;
            hVar.f229186b = null;
            C101330bj bjVar = this.f282779i;
            if (bjVar.f282813c) {
                bjVar.f282813c = false;
                C86127w wVar = bjVar.f282811a;
                wVar.f232790a.mo79725d(bjVar.f282812b);
            }
            this.f282782l.mo79303f();
            this.f282782l.mo79305h((C85729g) null);
            this.f282784n.mo92255c();
            this.f282783m.asBinder().unlinkToDeath(this.f282762S, 0);
            C87541c cVar = (C87541c) this.f282759P.f282798b.mo27525b();
            synchronized (cVar.f236439a) {
                cVar.f236456r = null;
                cVar.f236444f = null;
                cVar.f236454p = null;
            }
            m167596v();
            this.f282770aa.mo20074a();
            if (this.f282776f.mo79746e(C90086ek.f250427ct)) {
                m167595u(false);
            }
        }
    }

    /* renamed from: m */
    public final void mo92236m(Consumer consumer, String str) {
        C90875ai.m148465b(C101316b.f282730a, this.f282788r.mo28209i(this.f282773c.mo20150c(), "#Fetch isFusionRequestInProgress", new C101287a(consumer)), this.f282788r, str.concat(" Callback")).mo85223a(new C101333c(str));
    }

    /* renamed from: n */
    public final void mo92237n(String str, C22869e eVar) {
        this.f282757N.mo28212l("ICarAssistantImpl.".concat(str), new C101406y(this, str, eVar));
    }

    /* renamed from: p */
    public final void mo92238p(Intent intent) {
        ((C58970a) ((C58970a) f282743a.mo56224b()).mo56372aa(20030)).mo56389s("startActivity(): intent %s", intent.toUri(0));
        this.f282778h.mo79322d(C89849ae.ASSISTANT_AUTO_START_ACTIVITY_INTENT);
        this.f282758O.mo19966a(intent);
    }

    /* renamed from: q */
    public final void mo92239q(VoiceSessionConfig voiceSessionConfig, ClientStateSnapshot clientStateSnapshot) {
        if (this.f282776f.mo79746e(C90086ek.f250313al) && this.f282769Z) {
            new C90873ag(this.f282788r.mo28210j(this.f282744A.mo46042d(), "get AapActivationInfo on first query", new C101340j(this)), this.f282788r, "update AapActivationInfo on first query", C101402u.f282934a).mo85223a(C101295af.f282702a);
        }
        if (this.f282776f.mo79746e(C90086ek.f250325ax)) {
            new C90873ag(this.f282773c.mo20149b(), this.f282788r, "#Fetch MediaRecSessionState", new C101343m(this, voiceSessionConfig, clientStateSnapshot)).mo85223a(C101344n.f282836a);
        } else {
            mo92240r(voiceSessionConfig, clientStateSnapshot);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015c, code lost:
        if (r3.f282801b.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90086ek.f250320as) != false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0167, code lost:
        if (r4 != 9) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x027f, code lost:
        r2 = r3.mo92244b(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0284, code lost:
        r3 = com.google.android.apps.gsa.staticplugins.gearhead.C101327bg.f282800a.mo56225c();
        r3.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GearheadVSRFactory");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(20060)).mo56387q("Unsupported voice session type: %d", r12.f387130a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02a2, code lost:
        if (r2 == null) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02a4, code lost:
        r2 = r12.f387137h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02a6, code lost:
        if (r2 == null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02a8, code lost:
        r2 = com.google.android.apps.auto.p450a.p451a.C8898bp.m23511a(r2.getInt("DIRECT_QUERY_TRIGGER_ID", -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02b3, code lost:
        if (r2 == null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02b5, code lost:
        m167594o(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02b8, code lost:
        r13 = mo92233j(r12, r13);
        r11.f282787q.f229168c = r11.f282782l;
        r12 = r12.f387135f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02c4, code lost:
        if (r12 == 5) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02c6, code lost:
        if (r12 != 9) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02c9, code lost:
        r12 = r11.f282782l;
        p3186j$.util.Objects.requireNonNull(r12);
        mo92237n("activate()", new com.google.android.apps.gsa.staticplugins.gearhead.C101407z(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02e0, code lost:
        if (r11.f282776f.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90086ek.f250286aK) == false) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02e2, code lost:
        mo92237n("start()", new com.google.android.apps.gsa.staticplugins.gearhead.C101290aa(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ec, code lost:
        r11.f282773c.mo20152e(true);
        m167597w(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02f4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02f9, code lost:
        if (mo92241s() == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02fb, code lost:
        r11.f282773c.mo20154g(com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p.ONGOING);
        m167597w(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0305, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0306, code lost:
        ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0.mo56225c()).mo56372aa(20032)).mo56386p("media rec was wrongly triggered when the feature is disabled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0311, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0312, code lost:
        r11.f282747D.mo41687b("INVALID_REQUEST_PARAMS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0319, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92240r(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig r12, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot r13) {
        /*
            r11 = this;
            com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot r0 = r13.f387107c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00f8
            com.google.android.apps.gsa.staticplugins.gearhead.bf r3 = r11.f282759P
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            com.google.common.b.hd r5 = com.google.android.apps.gsa.staticplugins.gearhead.C101326bf.f282797a
            int r6 = r0.f387109b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0022
            java.lang.String r6 = "FACET_TYPE"
            com.google.android.apps.gsa.staticplugins.gearhead.C101326bf.m167617a(r4, r6, r5)
        L_0x0022:
            androidx.c.o r5 = r0.f387112e
            if (r5 == 0) goto L_0x0066
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            com.google.common.b.hd r7 = com.google.android.apps.gsa.staticplugins.gearhead.C101326bf.f282797a
            com.google.common.b.ij r7 = r7.entrySet()
            com.google.common.b.sl r7 = r7.iterator()
        L_0x0035:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0061
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r9 = r5.mo3726e(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x0035
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            com.google.android.apps.gsa.staticplugins.gearhead.C101326bf.m167617a(r6, r8, r9)
            goto L_0x0035
        L_0x0061:
            java.lang.String r5 = "DEFAULT_PACKAGES"
            com.google.android.apps.gsa.staticplugins.gearhead.C101326bf.m167617a(r4, r5, r6)
        L_0x0066:
            java.lang.String r5 = "APP_WHITELIST"
            org.json.JSONArray r6 = r3.f282799c
            com.google.android.apps.gsa.staticplugins.gearhead.C101326bf.m167617a(r4, r5, r6)
            java.lang.String r5 = "IS_NAVIGATING"
            boolean r0 = r0.f387110c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.apps.gsa.staticplugins.gearhead.C101326bf.m167617a(r4, r5, r0)
            java.lang.String r0 = r4.toString()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r3 = r3.f282798b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r3 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r3
            java.lang.String[] r4 = com.google.android.apps.gsa.shared.util.C90721ae.f253793b
            r4 = r4[r1]
            java.lang.Object r5 = r3.f236439a
            monitor-enter(r5)
            r3.f236444f = r2     // Catch:{ all -> 0x00f5 }
            r3.f236454p = r2     // Catch:{ all -> 0x00f5 }
            com.google.knowledge.b.ai r6 = r3.f236456r     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x009c
            com.google.protobuf.bn r6 = r6.toBuilder()     // Catch:{ all -> 0x00f5 }
            com.google.knowledge.b.ah r6 = (com.google.knowledge.p4671b.C61789ah) r6     // Catch:{ all -> 0x00f5 }
            goto L_0x00a4
        L_0x009c:
            com.google.knowledge.b.ai r6 = com.google.knowledge.p4671b.C61790ai.f166898o     // Catch:{ all -> 0x00f5 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x00f5 }
            com.google.knowledge.b.ah r6 = (com.google.knowledge.p4671b.C61789ah) r6     // Catch:{ all -> 0x00f5 }
        L_0x00a4:
            com.google.knowledge.b.g r7 = com.google.knowledge.p4671b.C61814g.f166984j     // Catch:{ all -> 0x00f5 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x00f5 }
            com.google.knowledge.b.e r7 = (com.google.knowledge.p4671b.C61812e) r7     // Catch:{ all -> 0x00f5 }
            r7.copyOnWrite()     // Catch:{ all -> 0x00f5 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x00f5 }
            com.google.knowledge.b.g r8 = (com.google.knowledge.p4671b.C61814g) r8     // Catch:{ all -> 0x00f5 }
            r4.getClass()     // Catch:{ all -> 0x00f5 }
            int r9 = r8.f166986a     // Catch:{ all -> 0x00f5 }
            r9 = r9 | r1
            r8.f166986a = r9     // Catch:{ all -> 0x00f5 }
            r8.f166987b = r4     // Catch:{ all -> 0x00f5 }
            r6.copyOnWrite()     // Catch:{ all -> 0x00f5 }
            com.google.protobuf.bv r4 = r6.instance     // Catch:{ all -> 0x00f5 }
            com.google.knowledge.b.ai r4 = (com.google.knowledge.p4671b.C61790ai) r4     // Catch:{ all -> 0x00f5 }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ all -> 0x00f5 }
            com.google.knowledge.b.g r7 = (com.google.knowledge.p4671b.C61814g) r7     // Catch:{ all -> 0x00f5 }
            r7.getClass()     // Catch:{ all -> 0x00f5 }
            r4.f166903d = r7     // Catch:{ all -> 0x00f5 }
            int r7 = r4.f166900a     // Catch:{ all -> 0x00f5 }
            r7 = r7 | 16
            r4.f166900a = r7     // Catch:{ all -> 0x00f5 }
            com.google.protobuf.bt r4 = com.google.knowledge.p4671b.C61798aq.f166935a     // Catch:{ all -> 0x00f5 }
            com.google.bp.a.d.f r7 = com.google.p4242bp.p4243a.p4247d.C56166f.f149643c     // Catch:{ all -> 0x00f5 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x00f5 }
            com.google.bp.a.d.e r7 = (com.google.p4242bp.p4243a.p4247d.C56165e) r7     // Catch:{ all -> 0x00f5 }
            r7.mo54329a(r0)     // Catch:{ all -> 0x00f5 }
            com.google.protobuf.bv r0 = r7.build()     // Catch:{ all -> 0x00f5 }
            com.google.bp.a.d.f r0 = (com.google.p4242bp.p4243a.p4247d.C56166f) r0     // Catch:{ all -> 0x00f5 }
            r6.mo58885m(r4, r0)     // Catch:{ all -> 0x00f5 }
            com.google.protobuf.bv r0 = r6.build()     // Catch:{ all -> 0x00f5 }
            com.google.knowledge.b.ai r0 = (com.google.knowledge.p4671b.C61790ai) r0     // Catch:{ all -> 0x00f5 }
            r3.f236456r = r0     // Catch:{ all -> 0x00f5 }
            monitor-exit(r5)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f8
        L_0x00f5:
            r12 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00f5 }
            throw r12
        L_0x00f8:
            com.google.common.f.a.d r0 = f282743a
            com.google.common.f.x r3 = r0.mo56224b()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            r4 = 20031(0x4e3f, float:2.807E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            java.lang.String r4 = "startOrQueueVoiceSession(): Type: %d"
            int r5 = r12.f387130a
            r3.mo56387q(r4, r5)
            com.google.android.apps.gsa.staticplugins.gearhead.bg r3 = r11.f282760Q
            java.lang.String r4 = r12.f387140k
            if (r4 == 0) goto L_0x0119
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b r5 = r3.f282804e
            r5.f37595e = r4
        L_0x0119:
            int r4 = r12.f387130a
            r5 = 9
            r6 = 5
            switch(r4) {
                case 1: goto L_0x027f;
                case 2: goto L_0x022f;
                case 3: goto L_0x01db;
                case 4: goto L_0x01a7;
                case 5: goto L_0x0160;
                case 6: goto L_0x0154;
                case 7: goto L_0x0123;
                case 8: goto L_0x022f;
                default: goto L_0x0121;
            }
        L_0x0121:
            goto L_0x0284
        L_0x0123:
            android.os.Bundle r3 = r12.f387137h
            if (r3 != 0) goto L_0x0129
            goto L_0x02a2
        L_0x0129:
            java.lang.String r2 = "RECIPIENT_NAME_KEY"
            java.lang.String r2 = r3.getString(r2)
            android.os.Bundle r3 = r12.f387137h
            java.lang.String r4 = "PHONE_NUMBER_KEY"
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r2 = com.google.common.base.C58837ba.m90858g(r2)
            com.google.android.apps.gsa.search.core.carassistant.h r4 = com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest.m137613p()
            r7 = r4
            com.google.android.apps.gsa.search.core.carassistant.a r7 = (com.google.android.apps.gsa.search.core.carassistant.C85682a) r7
            r8 = 10
            r7.f231698h = r8
            r7.f231693c = r2
            java.lang.String r2 = com.google.common.base.C58837ba.m90858g(r3)
            r7.f231694d = r2
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest r2 = r4.mo79306a()
            goto L_0x02a2
        L_0x0154:
            com.google.android.apps.gsa.search.core.i.t r4 = r3.f282801b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250320as
            boolean r4 = r4.mo79746e(r7)
            if (r4 == 0) goto L_0x0284
            goto L_0x027f
        L_0x0160:
            int r4 = r12.f387135f
            if (r4 == r6) goto L_0x0182
            r7 = 6
            if (r4 == r7) goto L_0x016b
            if (r4 == r5) goto L_0x0182
            goto L_0x02a2
        L_0x016b:
            com.google.android.apps.gsa.shared.search.Query r2 = r3.f282802c
            java.lang.String r3 = r12.f387141l
            com.google.android.apps.gsa.search.core.carassistant.h r4 = com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest.m137613p()
            r7 = r4
            com.google.android.apps.gsa.search.core.carassistant.a r7 = (com.google.android.apps.gsa.search.core.carassistant.C85682a) r7
            r7.f231698h = r6
            r7.f231691a = r2
            r7.f231692b = r3
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest r2 = r4.mo79306a()
            goto L_0x02a2
        L_0x0182:
            com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot r2 = r13.f387107c
            if (r2 == 0) goto L_0x0192
            androidx.c.o r2 = r2.f387112e
            if (r2 == 0) goto L_0x0192
            java.lang.Object r2 = r2.mo3726e(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0194
        L_0x0192:
            java.lang.String r2 = ""
        L_0x0194:
            com.google.android.apps.gsa.search.core.carassistant.h r3 = com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest.m137613p()
            r4 = r3
            com.google.android.apps.gsa.search.core.carassistant.a r4 = (com.google.android.apps.gsa.search.core.carassistant.C85682a) r4
            r7 = 11
            r4.f231698h = r7
            r4.f231695e = r2
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest r2 = r3.mo79306a()
            goto L_0x02a2
        L_0x01a7:
            java.lang.String r4 = r12.f387132c
            if (r4 != 0) goto L_0x01ad
            goto L_0x02a2
        L_0x01ad:
            com.google.android.apps.gsa.search.core.carassistant.o r2 = r3.f282803d
            com.google.android.apps.gsa.search.core.carassistant.m r4 = com.google.android.apps.gsa.search.core.carassistant.C85736n.m137758m()
            long r7 = r3.mo92243a(r12)
            r4.mo79338b(r7)
            com.google.android.apps.gsa.shared.search.QueryTriggerType r3 = com.google.android.apps.gsa.shared.search.QueryTriggerType.GEARHEAD_DIRECT_ACTION
            r4.mo79342f(r3)
            java.lang.String r3 = r12.f387132c
            r7 = r4
            com.google.android.apps.gsa.search.core.carassistant.e r7 = (com.google.android.apps.gsa.search.core.carassistant.C85703e) r7
            r7.f231749d = r3
            r4.mo79339c(r1)
            com.google.android.apps.gsa.search.core.carassistant.n r3 = r4.mo79337a()
            com.google.android.apps.gsa.shared.search.Query r2 = r2.mo79386a(r3)
            com.google.android.apps.gsa.search.core.carassistant.h r2 = com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest.m137614q(r2)
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest r2 = r2.mo79306a()
            goto L_0x02a2
        L_0x01db:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.List r4 = r13.f387106b
            if (r4 != 0) goto L_0x01f7
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.gearhead.C101327bg.f282800a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "GearheadVSRFactory"
            r3.mo56378ag(r4, r7)
            java.lang.String r4 = "createReadMessageVoiceSessionRequest(): RecentMessages is null."
            r7 = 20059(0x4e5b, float:2.8109E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56386p(r4)
            goto L_0x02a2
        L_0x01f7:
            int r7 = r4.size()
            if (r7 == r1) goto L_0x0217
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.gearhead.C101327bg.f282800a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "GearheadVSRFactory"
            r3.mo56378ag(r7, r8)
            java.lang.String r7 = "createReadMessageVoiceSessionRequest(): # messages (%d) != 1 in client state snapshot."
            int r4 = r4.size()
            r8 = 20058(0x4e5a, float:2.8107E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r8)).mo56387q(r7, r4)
            goto L_0x02a2
        L_0x0217:
            boolean r2 = r12.f387139j
            com.google.common.b.gu r2 = r3.mo92246d(r4, r2)
            com.google.bb.a.x r7 = com.google.p4152bb.p4153a.C55421x.REPLY_TO_NOTIFICATION
            com.google.common.b.gu r3 = r3.mo92245c(r12, r4, r7)
            r4 = 8
            com.google.android.apps.gsa.search.core.carassistant.h r2 = com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest.m137615r(r2, r3, r4)
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest r2 = r2.mo79306a()
            goto L_0x02a2
        L_0x022f:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.List r4 = r13.f387106b
            if (r4 != 0) goto L_0x024a
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.gearhead.C101327bg.f282800a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "GearheadVSRFactory"
            r3.mo56378ag(r4, r7)
            java.lang.String r4 = "createReadMessageVoiceSessionRequest(): RecentMessages is null."
            r7 = 20056(0x4e58, float:2.8104E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56386p(r4)
            goto L_0x02a2
        L_0x024a:
            int r7 = r4.size()
            if (r7 == r1) goto L_0x0269
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.gearhead.C101327bg.f282800a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "GearheadVSRFactory"
            r3.mo56378ag(r7, r8)
            java.lang.String r7 = "createReadMessageVoiceSessionRequest(): # messages (%d) != 1 in client state snapshot."
            int r4 = r4.size()
            r8 = 20055(0x4e57, float:2.8103E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r8)).mo56387q(r7, r4)
            goto L_0x02a2
        L_0x0269:
            boolean r2 = r12.f387139j
            com.google.common.b.gu r2 = r3.mo92246d(r4, r2)
            com.google.bb.a.x r7 = com.google.p4152bb.p4153a.C55421x.READ_NOTIFICATION
            com.google.common.b.gu r3 = r3.mo92245c(r12, r4, r7)
            r4 = 2
            com.google.android.apps.gsa.search.core.carassistant.h r2 = com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest.m137615r(r2, r3, r4)
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest r2 = r2.mo79306a()
            goto L_0x02a2
        L_0x027f:
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest r2 = r3.mo92244b(r12, r13)
            goto L_0x02a2
        L_0x0284:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.gearhead.C101327bg.f282800a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "GearheadVSRFactory"
            r3.mo56378ag(r4, r7)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 20060(0x4e5c, float:2.811E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "Unsupported voice session type: %d"
            int r7 = r12.f387130a
            r3.mo56387q(r4, r7)
        L_0x02a2:
            if (r2 == 0) goto L_0x0312
            android.os.Bundle r2 = r12.f387137h
            if (r2 == 0) goto L_0x02b8
            java.lang.String r3 = "DIRECT_QUERY_TRIGGER_ID"
            r4 = -1
            int r2 = r2.getInt(r3, r4)
            com.google.android.apps.auto.a.a.bp r2 = com.google.android.apps.auto.p450a.p451a.C8898bp.m23511a(r2)
            if (r2 == 0) goto L_0x02b8
            m167594o(r2)
        L_0x02b8:
            com.google.common.util.concurrent.cx r13 = r11.mo92233j(r12, r13)
            com.google.android.apps.gsa.projection.a.a r2 = r11.f282787q
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager r3 = r11.f282782l
            r2.f229168c = r3
            int r12 = r12.f387135f
            if (r12 == r6) goto L_0x02f5
            if (r12 != r5) goto L_0x02c9
            goto L_0x02f5
        L_0x02c9:
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager r12 = r11.f282782l
            p3186j$.util.Objects.requireNonNull(r12)
            com.google.android.apps.gsa.staticplugins.gearhead.z r0 = new com.google.android.apps.gsa.staticplugins.gearhead.z
            r0.<init>(r12)
            java.lang.String r12 = "activate()"
            r11.mo92237n(r12, r0)
            com.google.android.apps.gsa.search.core.i.t r12 = r11.f282776f
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250286aK
            boolean r12 = r12.mo79746e(r0)
            if (r12 == 0) goto L_0x02ec
            com.google.android.apps.gsa.staticplugins.gearhead.aa r12 = new com.google.android.apps.gsa.staticplugins.gearhead.aa
            r12.<init>(r11)
            java.lang.String r0 = "start()"
            r11.mo92237n(r0, r12)
        L_0x02ec:
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.b r12 = r11.f282773c
            r12.mo20152e(r1)
            r11.m167597w(r13)
            return
        L_0x02f5:
            boolean r12 = r11.mo92241s()
            if (r12 == 0) goto L_0x0306
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.b r12 = r11.f282773c
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.p r0 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p.ONGOING
            r12.mo20154g(r0)
            r11.m167597w(r13)
            return
        L_0x0306:
            com.google.common.f.x r12 = r0.mo56225c()
            java.lang.String r13 = "media rec was wrongly triggered when the feature is disabled"
            r0 = 20032(0x4e40, float:2.8071E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r12).mo56372aa(r0)).mo56386p(r13)
            return
        L_0x0312:
            com.google.android.libraries.search.logging.d.kp r12 = r11.f282747D
            java.lang.String r13 = "INVALID_REQUEST_PARAMS"
            r12.mo41687b(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.gearhead.C101325be.mo92240r(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig, com.google.android.gearhead.sdk.assistant.ClientStateSnapshot):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r2.f282765V;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo92241s() {
        /*
            r2 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f282776f
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250325ax
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0018
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$Config r0 = r2.f282765V
            if (r0 == 0) goto L_0x0018
            com.google.android.apps.gsa.search.core.carassistant.$AutoValue_CarAssistantSessionManager_Config r0 = (com.google.android.apps.gsa.search.core.carassistant.C$AutoValue_CarAssistantSessionManager_Config) r0
            com.google.common.o.amo r0 = r0.f231669a
            com.google.common.o.amo r1 = com.google.common.p4552o.amo.ANDROID_AUTO_PROJECTED
            if (r0 != r1) goto L_0x0018
            r0 = 1
            return r0
        L_0x0018:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.gearhead.C101325be.mo92241s():boolean");
    }

    /* renamed from: t */
    public final boolean mo92242t() {
        return ((Boolean) this.f282767X.mo17428b()).booleanValue() || this.f282776f.mo79746e(C90086ek.f250401cT);
    }
}
