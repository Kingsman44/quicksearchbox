package com.google.android.apps.gsa.staticplugins.smartspace;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.ce;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83737ai;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.opa.smartspace.p6453b.C83743a;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83784b;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.opa.smartspace.p6458g.C83791c;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86291ag;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90070dv;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.sidekick.main.p7201d.C91284a;
import com.google.android.apps.gsa.smartspace.C92034ad;
import com.google.android.apps.gsa.smartspace.C92035ae;
import com.google.android.apps.gsa.smartspace.C92109e;
import com.google.android.apps.gsa.smartspace.C92110f;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8466q.C110907c;
import com.google.android.apps.gsa.staticplugins.smartspace.p8763d.C117375d;
import com.google.android.apps.gsa.staticplugins.smartspace.p8766g.C117405i;
import com.google.android.apps.gsa.staticplugins.smartspace.p8766g.C117406j;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.assistant.platform.pcp.api.C123604t;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123819aj;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124109ch;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131176a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.C131650d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3820ak.C49215n;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50838j;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3897e.p3921j.aai;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C52017hp;
import com.google.assistant.p3994s.p3995a.C53228gc;
import com.google.assistant.p3994s.p3995a.C53229gd;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53232gg;
import com.google.assistant.p3994s.p3995a.C53234gi;
import com.google.assistant.p3994s.p3995a.C53236gk;
import com.google.assistant.p3994s.p3995a.C53239gn;
import com.google.assistant.p3994s.p3995a.C53242gq;
import com.google.assistant.p3994s.p3995a.C53243gr;
import com.google.assistant.p3994s.p3995a.C53244gs;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.aky;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p375ai.p378b.C8200zf;
import com.google.p375ai.p378b.C8207zm;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57014f;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57016h;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4953bc.p4954a.C64400d;
import com.google.protos.p4953bc.p4954a.C64406j;
import com.google.protos.p4953bc.p4954a.C64408l;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64417h;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64422m;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64423n;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64429t;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64431v;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.OffsetDateTime;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.ai */
/* compiled from: PG */
public final class C117350ai extends C86734a implements C85299b {

    /* renamed from: a */
    public static final C59071e f325731a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.smartspace.ai");

    /* renamed from: b */
    static final String[] f325732b = {"com.google.android.apps.nexuslauncher", "com.google.android.apps.pixelclauncher"};

    /* renamed from: u */
    private static final long f325733u = Duration.ofHours(1).toMillis();

    /* renamed from: A */
    private final C22871g f325734A;

    /* renamed from: B */
    private final C83793i f325735B;

    /* renamed from: C */
    private final bm f325736C;

    /* renamed from: D */
    private final C83784b f325737D;

    /* renamed from: E */
    private final C83743a f325738E;

    /* renamed from: F */
    private final C83791c f325739F;

    /* renamed from: G */
    private final ce f325740G;

    /* renamed from: H */
    private final C86034c f325741H;

    /* renamed from: I */
    private final C68214a f325742I;

    /* renamed from: J */
    private final C131650d f325743J;

    /* renamed from: K */
    private final C92125t f325744K;

    /* renamed from: L */
    private final C84469a f325745L;

    /* renamed from: M */
    private final C83783a f325746M;

    /* renamed from: N */
    private final C86054o f325747N;

    /* renamed from: O */
    private final C74637ae f325748O;

    /* renamed from: P */
    private final C92110f f325749P;

    /* renamed from: Q */
    private boolean f325750Q;

    /* renamed from: R */
    private long f325751R = 0;

    /* renamed from: S */
    private boolean f325752S = false;

    /* renamed from: T */
    private String f325753T = BuildConfig.FLAVOR;

    /* renamed from: U */
    private final C117406j f325754U;

    /* renamed from: c */
    public final Context f325755c;

    /* renamed from: f */
    public final C21370a f325756f;

    /* renamed from: g */
    public final C86127w f325757g;

    /* renamed from: h */
    public final C86124t f325758h;

    /* renamed from: i */
    public final C92122r f325759i;

    /* renamed from: j */
    public final C22871g f325760j;

    /* renamed from: k */
    public final C83794j f325761k;

    /* renamed from: l */
    public final C83785c f325762l;

    /* renamed from: m */
    public final C123604t f325763m;

    /* renamed from: n */
    public final C130895ag f325764n;

    /* renamed from: o */
    public final C58833ax f325765o;

    /* renamed from: p */
    public final C58974d f325766p;

    /* renamed from: q */
    public final C124100bz f325767q;

    /* renamed from: r */
    public final C83807w f325768r;

    /* renamed from: s */
    public final C124109ch f325769s;

    /* renamed from: t */
    public final C110907c f325770t;

    /* renamed from: v */
    private final C91189au f325771v;

    /* renamed from: w */
    private final C117375d f325772w;

    /* renamed from: x */
    private final C68214a f325773x;

    /* renamed from: y */
    private final C68214a f325774y;

    /* renamed from: z */
    private final C86291ag f325775z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117350ai(Context context, C21370a aVar, C86127w wVar, C86124t tVar, C91189au auVar, C92122r rVar, C117375d dVar, C117406j jVar, C68214a aVar2, C68214a aVar3, C86291ag agVar, C22871g gVar, C22871g gVar2, C110907c cVar, C83794j jVar2, C83793i iVar, bm bmVar, C83784b bVar, C83785c cVar2, C83743a aVar4, C83791c cVar3, ce ceVar, C86034c cVar4, C68214a aVar5, C123604t tVar2, C131650d dVar2, C92125t tVar3, C130895ag agVar2, C58833ax axVar, C83564a aVar6, C84469a aVar7, C124100bz bzVar, C83783a aVar8, C83807w wVar2, C124109ch chVar, C86054o oVar, C74637ae aeVar, C92110f fVar) {
        super(C118575h.WORKER_SMARTSPACE, "smartspace");
        this.f325755c = context;
        this.f325757g = wVar;
        this.f325756f = aVar;
        this.f325758h = tVar;
        this.f325771v = auVar;
        this.f325759i = rVar;
        this.f325754U = jVar;
        this.f325772w = dVar;
        this.f325773x = aVar2;
        this.f325774y = aVar3;
        this.f325775z = agVar;
        this.f325760j = gVar;
        this.f325734A = gVar2;
        this.f325770t = cVar;
        this.f325761k = jVar2;
        this.f325735B = iVar;
        this.f325736C = bmVar;
        this.f325737D = bVar;
        this.f325762l = cVar2;
        this.f325738E = aVar4;
        this.f325739F = cVar3;
        this.f325740G = ceVar;
        this.f325741H = cVar4;
        this.f325742I = aVar5;
        this.f325763m = tVar2;
        this.f325743J = dVar2;
        this.f325744K = tVar3;
        this.f325764n = agVar2;
        this.f325765o = axVar;
        this.f325766p = aVar6.mo76900a("AA.SmartspaceWorker");
        this.f325745L = aVar7;
        this.f325767q = bzVar;
        this.f325746M = aVar8;
        this.f325749P = fVar;
        this.f325768r = wVar2;
        this.f325769s = chVar;
        this.f325747N = oVar;
        this.f325748O = aeVar;
    }

    /* renamed from: n */
    private final C60870cx m194995n(C50794cr crVar) {
        return this.f325762l.mo77128j(crVar);
    }

    /* renamed from: p */
    private final C60870cx m194996p(String str) {
        return this.f325762l.mo77129k(str);
    }

    /* renamed from: u */
    private final C60870cx m194997u() {
        return this.f325737D.mo77117c();
    }

    /* renamed from: v */
    private final C60870cx m194998v() {
        C58976aa aaVar = C58975e.f156826a;
        return C60922j.m93044g(this.f325748O.mo71019b(), new C117342aa(this), C60826bg.f164896a);
    }

    /* renamed from: w */
    private final C60870cx m194999w() {
        return this.f325737D.mo77116b();
    }

    /* renamed from: a */
    public final C60870cx mo78849a(Intent intent) {
        String stringExtra;
        String str;
        Intent intent2 = intent;
        C58976aa aaVar = C58975e.f156826a;
        intent.getAction();
        if ("com.google.android.apps.gsa.weatherwidget.ENABLE_UPDATE".equals(intent.getAction())) {
            if (intent2.hasExtra("package_name")) {
                if (intent2.hasExtra("package_name")) {
                    str = intent2.getStringExtra("package_name");
                    String[] strArr = f325732b;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= 2) {
                            break;
                        } else if (strArr[i].equals(str)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                str = null;
            } else {
                str = "com.google.android.apps.nexuslauncher";
            }
            if (str == null) {
                return C118826c.f331423b;
            }
            C86338r a = this.f325757g.f232790a.mo79722a();
            if (a.getBoolean("weather_widget_enabled", false)) {
                return this.f325734A.mo28210j(this.f325762l.mo77120b(), "getCurrentWeatherData", new C117440u(this));
            }
            C86338r a2 = this.f325757g.f232790a.mo79722a();
            PackageManager packageManager = this.f325755c.getPackageManager();
            if (!str.equals(a2.getString("weather_widget_target_package_name", (String) null))) {
                try {
                    if ((packageManager.getApplicationInfo(str, 0).flags & 1) != 0) {
                        C59104x b = f325731a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                        ((C59052c) ((C59052c) b).mo56372aa(33019)).mo56386p("enableSmartspaceForWeatherWidget isValidWeatherWidgetPackage");
                        C86341u uVar = new C86341u((C86346z) a);
                        uVar.mo80085k("weather_widget_enabled", true);
                        uVar.mo80073h("weather_widget_target_package_name", str);
                        uVar.mo80086l(false);
                        return this.f325770t.mo98927a();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C118826c.f331423b;
        } else if ("com.google.android.apps.dreamliner.ENABLE_UPDATE".equals(intent.getAction())) {
            return mo103272k(intent2, true);
        } else {
            if ("com.google.android.apps.dreamliner.DISABLE_UPDATE".equals(intent.getAction())) {
                return mo103272k(intent2, false);
            }
            if ("com.google.android.apps.gsa.smartspace.CLICK_EVENT".equals(intent.getAction()) || "com.google.android.systemui.smartspace.CLICK_EVENT".equals(intent.getAction())) {
                C60870cx cxVar = C118826c.f331423b;
                C50794cr crVar = C50794cr.UNDEFINED;
                if (intent2.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE") && (crVar = C50794cr.m85938a(intent2.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", 0))) == null) {
                    crVar = C50794cr.UNDEFINED;
                }
                if (!C92111g.m151147e(crVar)) {
                    C59104x d = f325731a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                    ((C59052c) ((C59052c) d).mo56372aa(33039)).mo56386p("Invalid card type in click intent.");
                    return cxVar;
                }
                C50731p pVar = C50731p.UNDEFINED;
                if (intent2.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE") && (pVar = C50731p.m85907a(intent2.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE", 0))) == null) {
                    pVar = C50731p.UNDEFINED;
                }
                if (pVar == C50731p.BROADCAST) {
                    this.f325759i.mo86770h(this.f325755c, intent2);
                } else if (pVar != C50731p.START_ACTIVITY) {
                    C59104x d2 = f325731a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                    ((C59052c) ((C59052c) d2).mo56372aa(33035)).mo56386p("Action type is undefined!");
                    this.f325759i.mo86770h(this.f325755c, intent2);
                }
                aky a3 = C83793i.m133413a(intent);
                boolean z = this.f325736C.u() && this.f325736C.w();
                boolean booleanExtra = intent2.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", false);
                boolean booleanExtra2 = intent2.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_DATA_FROM_THIRD_PARTY_APP", false);
                if (!booleanExtra && !intent2.getBooleanExtra("com.google.android.apps.search.assistant.verticals.ambient.shared.constants.SMARTSPACE_EXTRA_BLUECHIP_INTENT", false)) {
                    this.f325744K.mo86700e(crVar, a3, z, false, booleanExtra2);
                }
                if (crVar == C50794cr.WEATHER || crVar == C50794cr.AIR_QUALITY) {
                    return m194998v();
                }
                if (crVar == C50794cr.TIPS) {
                    if (!this.f325758h.mo79746e(C90070dv.f249749a)) {
                        return m194995n(C50794cr.TIPS);
                    }
                    return C60856cj.m92893b(((C123819aj) this.f325742I.mo27525b()).mo106136a(), this.f325746M.mo77109h(C50794cr.TIPS)).mo57334a(C117453x.f326010a, C60826bg.f164896a);
                } else if (crVar == C50794cr.ALARM) {
                    return m194995n(crVar);
                } else {
                    if ((crVar == C50794cr.WEATHER_ALERT || crVar == C50794cr.BIRTHDAY) && (stringExtra = intent2.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_ID")) != null) {
                        return m194996p(stringExtra);
                    }
                    return cxVar;
                }
            } else if ("com.google.android.apps.gsa.smartspace.SETTINGS".equals(intent.getAction())) {
                this.f325759i.mo86769g();
                return C118826c.f331423b;
            } else if ("com.google.android.apps.gsa.weatherwidget.WEATHER_CLICK".equals(intent.getAction())) {
                C60870cx cxVar2 = C118826c.f331423b;
                if (!intent2.hasExtra("com.google.android.apps.gsa.weatherwidget.extra.WEATHER_ACTIVITY")) {
                    C59104x d3 = f325731a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                    ((C59052c) ((C59052c) d3).mo56372aa(33040)).mo56386p("Incomplete intent extra.");
                } else {
                    cxVar2 = m194998v();
                    Intent intent3 = (Intent) intent2.getParcelableExtra("com.google.android.apps.gsa.weatherwidget.extra.WEATHER_ACTIVITY");
                    if (C92122r.m151191m(intent3)) {
                        C90476a aVar = C91018d.f254254a;
                        this.f325755c.startActivity(intent3);
                    }
                }
                return cxVar2;
            } else if ("com.google.android.apps.gsa.broadcastreceiver.ACTION_SMARTSPACE_RESULT".equals(intent.getAction())) {
                try {
                    C92035ae j = mo103271j((C8207zm) C62942bv.parseFrom((C62942bv) C8207zm.f28820n, intent.getExtras().getByteArray("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_RESULT"), C62921ba.m95368a()));
                    if (j == null) {
                        return C118826c.f331423b;
                    }
                    return mo78853f(j);
                } catch (C62974ct e) {
                    C59104x d4 = f325731a.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                    ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e)).mo56372aa(33023)).mo56386p("Failed parsing Smartspace response.");
                    return C118826c.f331423b;
                }
            } else if ("com.google.android.apps.gsa.broadcastreceiverACTION_SMARTSPACE_WEATHER_UNIT_CHANGED".equals(intent.getAction())) {
                return this.f325770t.mo98927a();
            } else {
                if ("com.google.android.apps.gsa.broadcastreceiver.ACTION_SMARTSPACE_PREFERENCE_CHANGED".equals(intent.getAction())) {
                    if (!this.f325758h.mo79746e(C89985ax.f246674aA)) {
                        return m194997u();
                    }
                    int intExtra = intent2.getIntExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.PREFERENCE_KEY_CHANGED_EXTRA", -1);
                    if (intExtra == -1 || intExtra != 1) {
                        return m194997u();
                    }
                    return this.f325762l.mo77126h(intent2.getBooleanExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.PREFERENCE_CHANGED_VALUE_EXTRA", false));
                } else if ("android.intent.action.PACKAGES_SUSPENDED".equals(intent.getAction()) || "android.intent.action.PACKAGES_UNSUSPENDED".equals(intent.getAction())) {
                    return this.f325737D.mo77117c();
                } else {
                    if ("com.google.android.apps.oemsmartspace.ENABLE_UPDATE".equals(intent.getAction())) {
                        return mo103273l(intent2, true);
                    }
                    if ("com.google.android.apps.oemsmartspace.DISABLE_UPDATE".equals(intent.getAction())) {
                        return mo103273l(intent2, false);
                    }
                    if (!"com.google.android.apps.gsa.smartspace.DISMISS_EVENT".equals(intent.getAction()) || this.f325758h.mo79746e(C90017bw.f248036m)) {
                        intent.getAction();
                        return C118826c.f331423b;
                    }
                    int intExtra2 = intent2.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_ID", -1);
                    long longExtra = intent2.getLongExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_DISMISS_RECORD_EXPIRATION_TIME", 0);
                    C50794cr a4 = C50794cr.m85938a(intent2.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", 0));
                    boolean booleanExtra3 = intent2.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", false);
                    if (intExtra2 == -1 || a4 == C50794cr.UNDEFINED) {
                        C59104x d5 = f325731a.mo56226d();
                        d5.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                        ((C59052c) ((C59052c) d5).mo56372aa(33020)).mo56359L("Invalid card dismiss information, cardId: %d, type: %s, ttl: %d", Integer.valueOf(intExtra2), a4.name(), Long.valueOf(longExtra));
                        return C118826c.f331423b;
                    } else if (a4 == C50794cr.WEATHER_ALERT) {
                        return m194996p(String.valueOf(intExtra2));
                    } else {
                        return this.f325762l.mo77119a(Integer.toString(intExtra2), longExtra, a4, booleanExtra3);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78850b(byte[] r5) {
        /*
            r4 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.smartspace.m r0 = com.google.android.apps.gsa.smartspace.C92117m.f256824i     // Catch:{ ct -> 0x002c }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r0, (byte[]) r5)     // Catch:{ ct -> 0x002c }
            com.google.android.apps.gsa.smartspace.m r5 = (com.google.android.apps.gsa.smartspace.C92117m) r5     // Catch:{ ct -> 0x002c }
            com.google.android.apps.gsa.search.core.i.t r0 = r4.f325758h     // Catch:{ ct -> 0x002a }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90070dv.f249749a     // Catch:{ ct -> 0x002a }
            boolean r0 = r0.mo79746e(r1)     // Catch:{ ct -> 0x002a }
            if (r0 == 0) goto L_0x0044
            int r0 = r5.f256832g     // Catch:{ ct -> 0x002a }
            int r0 = com.google.android.apps.gsa.smartspace.C92116l.m151154a(r0)     // Catch:{ ct -> 0x002a }
            if (r0 != 0) goto L_0x001d
            r0 = 1
        L_0x001d:
            int r0 = r0 + -1
            com.google.assistant.c.cr r0 = com.google.assistant.p3886c.C50794cr.m85938a(r0)     // Catch:{ ct -> 0x002a }
            com.google.assistant.c.cr r1 = com.google.assistant.p3886c.C50794cr.TIPS     // Catch:{ ct -> 0x002a }
            if (r0 != r1) goto L_0x0044
            com.google.common.util.concurrent.cx r5 = com.google.android.apps.gsa.p8883x.C118826c.f331423b     // Catch:{ ct -> 0x002a }
            return r5
        L_0x002a:
            r0 = move-exception
            goto L_0x002f
        L_0x002c:
            r5 = move-exception
            r0 = r5
            r5 = 0
        L_0x002f:
            com.google.common.f.e r1 = f325731a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "SmartspaceWorker"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Trying to parse invalid serialized proto."
            r3 = 33025(0x8101, float:4.6278E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x0044:
            if (r5 != 0) goto L_0x0049
            com.google.common.util.concurrent.cx r5 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r5
        L_0x0049:
            com.google.common.util.concurrent.cx r5 = r4.mo78853f(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.C117350ai.mo78850b(byte[]):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo78851c(byte[] bArr) {
        C64408l lVar;
        String str;
        C64429t tVar;
        String str2;
        C8207zm zmVar;
        C8207zm zmVar2;
        byte[] bArr2 = bArr;
        try {
            C57017i iVar = (C57017i) C62942bv.parseFrom((C62942bv) C57017i.f152204o, bArr2, C62921ba.m95368a());
            this.f325764n.mo109882R(C57016h.m88253a(iVar.f152207b).f152203j);
            boolean e = this.f325758h.mo79746e(C90017bw.f247969be);
            C57014f fVar = iVar.f152219n;
            if (fVar == null) {
                fVar = C57014f.f152189c;
            }
            int i = 1;
            if ((fVar.f152191a & 1) != 0) {
                Account a = this.f325747N.mo79668a();
                if (a != null) {
                    C57014f fVar2 = iVar.f152219n;
                    if (fVar2 == null) {
                        fVar2 = C57014f.f152189c;
                    }
                    if (fVar2.f152192b.equals(C91284a.m149219a(a))) {
                        this.f325764n.mo109866B("MATCH_PRIMARY_ACCOUNT", C57016h.m88253a(iVar.f152207b).f152203j, e);
                        ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33081)).mo56386p("Push message account matches primary account");
                    } else {
                        this.f325764n.mo109866B("MISMATCH_PRIMARY_ACCOUNT", C57016h.m88253a(iVar.f152207b).f152203j, e);
                        ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33080)).mo56386p("Push message account mismatches primary account");
                        if (this.f325758h.mo79746e(C89985ax.f246726i)) {
                            return C118826c.f331423b;
                        }
                    }
                }
            } else {
                this.f325764n.mo109866B("NO_ACCOUNT_IN_PUSH", C57016h.m88253a(iVar.f152207b).f152203j, e);
                ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33082)).mo56386p("No account info found in push message");
            }
            switch (C57016h.m88253a(iVar.f152207b).ordinal()) {
                case 0:
                    ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33029)).mo56386p("handleMessage #FLIGHT_STATUS");
                    this.f325764n.mo109871G("FLIGHT_STATUS_PUSH_MESSAGE_RECEIVED");
                    this.f325764n.mo109871G("FLIGHT_STATUS_PUSH_MESSAGE_RECEIVED_LEGACY_FLIGHT_STATUS");
                    if (!this.f325759i.f256848d.mo86757m()) {
                        this.f325764n.mo109871G("FLIGHT_FEATURE_NOT_AVAILABLE");
                        return C118826c.f331423b;
                    } else if (this.f325761k.mo77180s()) {
                        if (iVar.f152207b == 1) {
                            lVar = (C64408l) iVar.f152208c;
                        } else {
                            lVar = C64408l.f174685w;
                        }
                        ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33054)).mo56354G("maybeSyncZerostateFlightData for %s %s", lVar.f174694e, lVar.f174693d);
                        long b = this.f325738E.f228268e.mo26870b();
                        if (!lVar.f174702m.isEmpty()) {
                            str = lVar.f174702m;
                        } else if (!lVar.f174711v.isEmpty()) {
                            str = lVar.f174711v;
                        } else if (!lVar.f174705p.isEmpty()) {
                            str = lVar.f174705p;
                        } else {
                            str = !lVar.f174708s.isEmpty() ? lVar.f174708s : lVar.f174701l;
                        }
                        C59104x b2 = C83743a.f228266d.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "OpaSSFlightUtils");
                        C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(6851);
                        C64406j a2 = C64406j.m96401a(lVar.f174706q);
                        if (a2 == null) {
                            a2 = C64406j.NO_VALUE;
                        }
                        cVar.mo56354G("Check flight in display range: flightStatus.status=%s, departureTime=%s", a2.name(), str);
                        Optional b3 = C83743a.m133333b(str);
                        C58528ij ijVar = C83743a.f228264b;
                        C64406j a3 = C64406j.m96401a(lVar.f174706q);
                        if (a3 == null) {
                            a3 = C64406j.NO_VALUE;
                        }
                        if (!ijVar.contains(a3) && b3.isPresent()) {
                            long longValue = ((Long) b3.get()).longValue();
                            if (b <= C131179d.f358768d + longValue && b >= longValue - C131179d.f358766b) {
                                if (!this.f325738E.mo77068c()) {
                                    ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33056)).mo56386p("Not sending flight request intent because request is throttled.");
                                    this.f325764n.mo109871G("FLIGHT_STATUS_PUSH_MESSAGE_THROTTLED");
                                } else {
                                    ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33055)).mo56386p("Sending flight request intent to sync zerostate flight data.");
                                    this.f325735B.mo77152h(bArr2);
                                }
                                return C118826c.f331423b;
                            }
                        }
                        ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33057)).mo56386p("Not sending flight request intent because not in display range.");
                        this.f325764n.mo109871G("FLIGHT_STATUS_PUSH_MESSAGE_NOT_IN_DISPLAY_RANGE");
                        return C118826c.f331423b;
                    } else {
                        if (!this.f325761k.mo77173k()) {
                            this.f325735B.mo77152h(bArr2);
                        }
                        return C118826c.f331423b;
                    }
                case 1:
                    ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33027)).mo56386p("handleMessage #RENDERABLE_FLIGHT_STATUS");
                    this.f325764n.mo109871G("FLIGHT_STATUS_PUSH_MESSAGE_RECEIVED");
                    this.f325764n.mo109871G("FLIGHT_STATUS_PUSH_MESSAGE_RECEIVED_RENDERABLE_FLIGHT_STATUS");
                    if (iVar.f152207b == 19) {
                        C64423n nVar = ((C64429t) iVar.f152208c).f174762b;
                        if (nVar == null) {
                            nVar = C64423n.f174740m;
                        }
                        int i2 = nVar.f174742a;
                        if (!((262144 & i2) == 0 || (i2 & 524288) == 0)) {
                            Optional b4 = C83743a.m133333b(nVar.f174752k);
                            int b5 = C64400d.m96400b(nVar.f174753l);
                            if (b5 != 0) {
                                i = b5;
                            }
                            String a4 = C64400d.m96399a(i);
                            if (b4.isPresent()) {
                                this.f325764n.mo109892aA(Duration.ofMillis(this.f325756f.mo26870b() - ((Long) b4.get()).longValue()), a4);
                            }
                        }
                    }
                    if (!this.f325759i.f256848d.mo86757m()) {
                        this.f325764n.mo109871G("FLIGHT_FEATURE_NOT_AVAILABLE");
                        return C118826c.f331423b;
                    } else if (this.f325761k.mo77180s()) {
                        if (iVar.f152207b == 19) {
                            tVar = (C64429t) iVar.f152208c;
                        } else {
                            tVar = C64429t.f174759d;
                        }
                        C58970a aVar = (C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33058);
                        C64417h hVar = tVar.f174763c;
                        if (hVar == null) {
                            hVar = C64417h.f174725c;
                        }
                        String str3 = hVar.f174727a;
                        C64417h hVar2 = tVar.f174763c;
                        if (hVar2 == null) {
                            hVar2 = C64417h.f174725c;
                        }
                        aVar.mo56354G("maybeSyncZerostateFlightData for %s %s", str3, hVar2.f174728b);
                        C83743a aVar2 = this.f325738E;
                        C64423n nVar2 = tVar.f174762b;
                        if (nVar2 == null) {
                            nVar2 = C64423n.f174740m;
                        }
                        C58528ij ijVar2 = C83743a.f228265c;
                        C64431v a5 = C64431v.m96403a(nVar2.f174751j);
                        if (a5 == null) {
                            a5 = C64431v.UNKNOWN_CASE;
                        }
                        if (!ijVar2.contains(a5)) {
                            Instant ofEpochMilli = Instant.ofEpochMilli(aVar2.f228268e.mo26870b());
                            int i3 = nVar2.f174743b;
                            if (i3 == 8) {
                                str2 = ((C64422m) nVar2.f174744c).f174738a;
                            } else if (i3 == 7) {
                                str2 = ((C64422m) nVar2.f174744c).f174738a;
                            } else {
                                C64422m mVar = nVar2.f174749h;
                                if (mVar == null) {
                                    mVar = C64422m.f174736b;
                                }
                                str2 = mVar.f174738a;
                            }
                            C59104x b6 = C83743a.f228266d.mo56224b();
                            b6.mo56378ag(C58975e.f156826a, "OpaSSFlightUtils");
                            C59052c cVar2 = (C59052c) ((C59052c) b6).mo56372aa(6852);
                            C64431v a6 = C64431v.m96403a(nVar2.f174751j);
                            if (a6 == null) {
                                a6 = C64431v.UNKNOWN_CASE;
                            }
                            cVar2.mo56354G("Check flight in display range: flightStatus.synthesized_status=%s, departureTime=%s", a6.name(), str2);
                            Instant instant = OffsetDateTime.parse(str2).toInstant();
                            Instant minusMillis = instant.minusMillis(C131179d.f358766b);
                            Instant plusMillis = instant.plusMillis(C131179d.f358768d);
                            if (!ofEpochMilli.isBefore(minusMillis) && !ofEpochMilli.isAfter(plusMillis)) {
                                if (!this.f325738E.mo77068c()) {
                                    ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33060)).mo56386p("Not sending flight request intent because request is throttled.");
                                    this.f325764n.mo109871G("FLIGHT_STATUS_PUSH_MESSAGE_THROTTLED");
                                } else {
                                    ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33059)).mo56386p("Send flight request intent to sync zerostate flight data.");
                                    this.f325735B.mo77152h(bArr2);
                                }
                                return C118826c.f331423b;
                            }
                        }
                        ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33061)).mo56386p("Not sending flight request intent because not in display range.");
                        this.f325764n.mo109871G("FLIGHT_STATUS_PUSH_MESSAGE_NOT_IN_DISPLAY_RANGE");
                        return C118826c.f331423b;
                    } else {
                        if (!this.f325761k.mo77173k()) {
                            this.f325735B.mo77152h(bArr2);
                        }
                        return C118826c.f331423b;
                    }
                case 2:
                    if (this.f325745L.mo78043q()) {
                        return C118826c.f331423b;
                    }
                    if (iVar.f152207b == 2) {
                        zmVar = (C8207zm) iVar.f152208c;
                    } else {
                        zmVar = C8207zm.f28820n;
                    }
                    ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33074)).mo56386p("Received weather push message.");
                    this.f325767q.mo106282a(1);
                    int i4 = zmVar.f28822a;
                    if ((i4 & 1) == 0 || (i4 & 2) == 0 || (i4 & 4) == 0 || (i4 & 16) == 0) {
                        C58970a aVar3 = (C58970a) ((C58970a) this.f325766p.mo56226d()).mo56372aa(33075);
                        int i5 = zmVar.f28822a;
                        aVar3.mo56360M("Handling response ignored due to missing fields. Temp=%b, Unit=%b, IconUrl=%b IsCelsius=%b", Boolean.valueOf(1 == (i5 & 1)), Boolean.valueOf((i5 & 2) != 0), Boolean.valueOf((i5 & 4) != 0), Boolean.valueOf((i5 & 16) != 0));
                    }
                    C58970a aVar4 = (C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33076);
                    Integer valueOf = Integer.valueOf(zmVar.f28823b);
                    String str4 = zmVar.f28824c;
                    String str5 = zmVar.f28825d;
                    String str6 = zmVar.f28826e;
                    Boolean valueOf2 = Boolean.valueOf(zmVar.f28827f);
                    C8200zf zfVar = zmVar.f28829h;
                    if (zfVar == null) {
                        zfVar = C8200zf.f28802b;
                    }
                    String str7 = zfVar.f28804a;
                    C63042fg fgVar = zmVar.f28831j;
                    if (fgVar == null) {
                        fgVar = C63042fg.f170152c;
                    }
                    aVar4.mo56365R("Push weather data used: Temp=%d, Unit=%s, IconUrl=%s, WeatherDescription=%s, isCelsius=%b, location=%s, currentUpdateTimeMillis=%d, hasAirQuality=%b, source=%s", valueOf, str4, str5, str6, valueOf2, str7, Long.valueOf(C62953e.m95478c(fgVar)), Boolean.valueOf((zmVar.f28822a & 2048) != 0), C53232gg.GCM_PUSH);
                    if (iVar.f152207b == 2) {
                        zmVar2 = (C8207zm) iVar.f152208c;
                    } else {
                        zmVar2 = C8207zm.f28820n;
                    }
                    C92035ae j = mo103271j(zmVar2);
                    if (j == null) {
                        ((C58970a) ((C58970a) this.f325766p.mo56226d()).mo56372aa(33031)).mo56386p("weather content could not be extracted from push message");
                        break;
                    } else {
                        this.f325743J.mo110242a(C31164au.m58091a(C31164au.m58092b("SmartspaceUpdate_"), C31164au.m58093c((String) null, C50794cr.WEATHER)));
                        if (!this.f325758h.mo79746e(C90070dv.f249755g)) {
                            ((C58970a) ((C58970a) this.f325766p.mo56224b()).mo56372aa(33030)).mo56386p("Pcp not enabled path");
                            return mo78853f(j);
                        }
                        C60870cx h = C60922j.m93045h(this.f325741H.mo79697b(), C47810es.m84966f(new C117441v(this, j)), C60826bg.f164896a);
                        mo78853f(j);
                        return this.f325734A.mo28209i(h, "weather data put to pcp", C117442w.f325978a);
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    C58976aa aaVar = C58975e.f156826a;
                    return mo78853f(iVar);
                case 7:
                    C58976aa aaVar2 = C58975e.f156826a;
                    if (!this.f325745L.mo78032f()) {
                        return C118826c.f331423b;
                    }
                    C59104x b7 = f325731a.mo56224b();
                    b7.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                    ((C59052c) ((C59052c) b7).mo56372aa(33033)).mo56386p("Creating local channel");
                    return C60922j.m93044g(this.f325741H.mo79697b(), C47810es.m84963c(new C117455z(this)), new C117454y(this));
            }
        } catch (C62974ct e2) {
            C59104x d = f325731a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(33028)).mo56386p("Failed parsing Smartspace FlightStatus push message.");
        }
        return C118826c.f331423b;
    }

    /* renamed from: e */
    public final C60870cx mo78852e(aas aas) {
        Object obj;
        if (!this.f325758h.mo79746e(C90017bw.f248017cq)) {
            C59104x b = f325731a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) b).mo56372aa(33063)).mo56386p("Sending suggestions from server to Hybrid Hotseat disabled; skipping.");
            return C60856cj.m92900i(C118826c.f331422a);
        }
        C62940bt r0 = C62942bv.checkIsLite(aai.f134644c);
        aas.mo58887l(r0);
        if (!aas.f169962ag.mo58857o(r0.f169971d)) {
            C59104x d = f325731a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) d).mo56372aa(33062)).mo56386p("Hybrid Hotseat extension missing.");
            return C60856cj.m92900i(C118826c.f331422a);
        }
        C62940bt r02 = C62942bv.checkIsLite(aai.f134644c);
        aas.mo58887l(r02);
        Object l = aas.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C50838j jVar = ((aai) obj).f134646a;
        if (jVar == null) {
            jVar = C50838j.f132370b;
        }
        return this.f325749P.mo86731c(jVar);
    }

    /* renamed from: f */
    public final C60870cx mo78853f(Object obj) {
        C58833ax axVar;
        C53245gt gtVar;
        OptionalLong optionalLong;
        C53234gi giVar;
        C53234gi giVar2;
        OptionalLong optionalLong2;
        Object obj2 = obj;
        ArrayList arrayList = new ArrayList();
        C117406j jVar = this.f325754U;
        C58480gp e = C58485gu.m89837e();
        for (C117405i iVar : jVar.f325912a) {
            if (iVar.mo103285e(obj2)) {
                jVar.f325913b.mo109890Z(iVar.mo103282b());
                e.mo55395g(iVar.mo103283c(obj2));
            }
        }
        C58801sm G = e.mo55394f().listIterator(0);
        while (G.hasNext()) {
            SettableFuture settableFuture = new SettableFuture();
            this.f325734A.mo28211k((C60870cx) G.next(), "executeSmartspaceAction", new C117348ag(this, settableFuture, obj2));
            arrayList.add(settableFuture);
        }
        if (obj2 instanceof C92035ae) {
            axVar = C58833ax.m90834k((C92035ae) obj2);
        } else {
            if (obj2 instanceof C83739ak) {
                C83739ak akVar = (C83739ak) obj2;
                C83738aj ajVar = akVar.f228233b;
                if (ajVar == null) {
                    ajVar = C83738aj.f228226c;
                }
                if (ajVar.f228228a == 3) {
                    C83738aj ajVar2 = akVar.f228233b;
                    if (ajVar2 == null) {
                        ajVar2 = C83738aj.f228226c;
                    }
                    if (ajVar2.f228228a == 3) {
                        gtVar = (C53245gt) ajVar2.f228229b;
                    } else {
                        gtVar = C53245gt.f139564n;
                    }
                    C53230ge geVar = (C53230ge) gtVar.f139569c.get(0);
                    OptionalLong empty = OptionalLong.empty();
                    C49215n nVar = null;
                    if (!this.f325758h.mo79746e(C90017bw.f247969be) || !this.f325761k.mo77161F()) {
                        optionalLong = empty;
                        giVar = null;
                    } else {
                        if ((gtVar.f139567a & 16) != 0) {
                            giVar2 = gtVar.f139573g;
                            if (giVar2 == null) {
                                giVar2 = C53234gi.f139523e;
                            }
                        } else {
                            giVar2 = null;
                        }
                        if ((gtVar.f139567a & 8) != 0) {
                            C63042fg fgVar = gtVar.f139572f;
                            if (fgVar == null) {
                                fgVar = C63042fg.f170152c;
                            }
                            if (fgVar.f170154a > 0) {
                                C63042fg fgVar2 = gtVar.f139572f;
                                if (fgVar2 == null) {
                                    fgVar2 = C63042fg.f170152c;
                                }
                                optionalLong2 = OptionalLong.m71641of(C62953e.m95478c(fgVar2));
                                giVar = giVar2;
                                optionalLong = optionalLong2;
                            }
                        }
                        optionalLong2 = OptionalLong.m71641of(this.f325756f.mo26870b());
                        giVar = giVar2;
                        optionalLong = optionalLong2;
                    }
                    if ((gtVar.f139567a & 1024) != 0 && (nVar = gtVar.f139579m) == null) {
                        nVar = C49215n.f127253d;
                    }
                    C49215n nVar2 = nVar;
                    int parseInt = Integer.parseInt(geVar.f139507c);
                    boolean z = gtVar.f139574h;
                    String str = geVar.f139512h;
                    String str2 = geVar.f139506b;
                    C62971cq cqVar = gtVar.f139569c;
                    int a = C52017hp.m86469a(geVar.f139513i);
                    int i = a == 0 ? 1 : a;
                    C53232gg a2 = C53232gg.m86789a(gtVar.f139568b);
                    if (a2 == null) {
                        a2 = C53232gg.UNKNOWN;
                    }
                    axVar = C58833ax.m90834k(new C92035ae(parseInt, z, str, str2, (C92034ad) null, (String) null, giVar, cqVar, optionalLong, i, nVar2, a2));
                }
            }
            axVar = C58836b.f156633a;
        }
        if (axVar.mo56113h()) {
            C92035ae aeVar = (C92035ae) axVar.mo56107c();
            C58976aa aaVar = C58975e.f156826a;
            C86341u uVar = new C86341u((C86346z) this.f325757g.f232790a.mo79722a());
            uVar.mo80085k("weather_widget_cache_temperature", Integer.valueOf(aeVar.f256572a));
            uVar.mo80085k("weather_widget_cache_unit_is_celsius", Boolean.valueOf(aeVar.f256573b));
            uVar.mo80073h("weather_widget_cache_icon_url", aeVar.f256574c);
            uVar.mo80073h("weather_widget_cache_icon_description", aeVar.f256575d);
            uVar.mo80085k("weather_widget_cache_timestamp", Long.valueOf(this.f325756f.mo26870b()));
            uVar.mo80086l(false);
            this.f325750Q = true;
            if (this.f325751R != 0) {
                this.f325764n.mo109894aC(this.f325756f.mo26870b() - this.f325751R);
            }
            this.f325751R = this.f325756f.mo26870b();
            this.f325752S = aeVar.f256573b;
            this.f325753T = aeVar.f256574c;
            SettableFuture settableFuture2 = new SettableFuture();
            Uri parse = Uri.parse(aeVar.f256574c);
            C91189au auVar = this.f325771v;
            auVar.mo85428r(auVar.mo85418e(parse, 7), "SmartspaceWorker.ImageCallback", new C117349ah(this, aeVar, settableFuture2));
            arrayList.add(settableFuture2);
        }
        return C118826c.m197212b(arrayList);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WeatherWidgetManager");
        if (!this.f325750Q) {
            fVar.mo85292s(C90752i.m148229c("No weather data available to dump"));
            return;
        }
        fVar.mo85279c("Time").mo85276a(C90752i.m148229c(new Date(this.f325751R).toString()));
        fVar.mo85279c("Temp").mo85276a(C90752i.m148230d(0));
        fVar.mo85279c("IsCelsius").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f325752S)));
        fVar.mo85279c("Icon").mo85276a(C90752i.m148229c(this.f325753T));
    }

    /* renamed from: h */
    public final void mo78855h(byte[] bArr) {
        C92109e eVar;
        try {
            eVar = (C92109e) C62942bv.parseFrom((C62942bv) C92109e.f256805i, bArr);
        } catch (C62974ct e) {
            C59104x d = f325731a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(33069)).mo56386p("Trying to parse invalid serialized proto.");
            eVar = null;
        }
        if (eVar == null) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            mo78853f(eVar);
        }
    }

    /* renamed from: i */
    public final C83739ak mo103270i(C92035ae aeVar) {
        C49215n nVar;
        C53229gd gdVar = (C53229gd) C53230ge.f139503j.createBuilder();
        String valueOf = String.valueOf(aeVar.f256572a);
        gdVar.copyOnWrite();
        C53230ge geVar = (C53230ge) gdVar.instance;
        valueOf.getClass();
        geVar.f139505a |= 2;
        geVar.f139507c = valueOf;
        String str = aeVar.f256574c;
        gdVar.copyOnWrite();
        C53230ge geVar2 = (C53230ge) gdVar.instance;
        str.getClass();
        geVar2.f139505a |= 64;
        geVar2.f139512h = str;
        String str2 = aeVar.f256575d;
        gdVar.copyOnWrite();
        C53230ge geVar3 = (C53230ge) gdVar.instance;
        str2.getClass();
        geVar3.f139505a |= 1;
        geVar3.f139506b = str2;
        int i = aeVar.f256584m;
        gdVar.copyOnWrite();
        C53230ge geVar4 = (C53230ge) gdVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            geVar4.f139513i = i2;
            geVar4.f139505a |= 128;
            C53243gr grVar = (C53243gr) C53244gs.f139553j.createBuilder();
            String valueOf2 = String.valueOf(aeVar.f256572a);
            grVar.copyOnWrite();
            C53244gs gsVar = (C53244gs) grVar.instance;
            valueOf2.getClass();
            gsVar.f139555a |= 2;
            gsVar.f139557c = valueOf2;
            String str3 = aeVar.f256574c;
            grVar.copyOnWrite();
            C53244gs gsVar2 = (C53244gs) grVar.instance;
            str3.getClass();
            gsVar2.f139555a |= 64;
            gsVar2.f139562h = str3;
            String str4 = aeVar.f256575d;
            grVar.copyOnWrite();
            C53244gs gsVar3 = (C53244gs) grVar.instance;
            str4.getClass();
            gsVar3.f139555a |= 1;
            gsVar3.f139556b = str4;
            int i3 = aeVar.f256584m;
            grVar.copyOnWrite();
            C53244gs gsVar4 = (C53244gs) grVar.instance;
            int i4 = i3 - 1;
            if (i3 != 0) {
                gsVar4.f139563i = i4;
                gsVar4.f139555a |= 128;
                if (!aeVar.f256580i.isEmpty()) {
                    C53230ge geVar5 = (C53230ge) aeVar.f256580i.get(0);
                    String str5 = geVar5.f139508d;
                    gdVar.copyOnWrite();
                    C53230ge geVar6 = (C53230ge) gdVar.instance;
                    str5.getClass();
                    geVar6.f139505a |= 4;
                    geVar6.f139508d = str5;
                    String str6 = geVar5.f139509e;
                    gdVar.copyOnWrite();
                    C53230ge geVar7 = (C53230ge) gdVar.instance;
                    str6.getClass();
                    geVar7.f139505a |= 8;
                    geVar7.f139509e = str6;
                    String str7 = geVar5.f139508d;
                    grVar.copyOnWrite();
                    C53244gs gsVar5 = (C53244gs) grVar.instance;
                    str7.getClass();
                    gsVar5.f139555a |= 4;
                    gsVar5.f139558d = str7;
                    String str8 = geVar5.f139509e;
                    grVar.copyOnWrite();
                    C53244gs gsVar6 = (C53244gs) grVar.instance;
                    str8.getClass();
                    gsVar6.f139555a |= 8;
                    gsVar6.f139559e = str8;
                    if ((geVar5.f139505a & 16) != 0) {
                        C53236gk a = C53236gk.m86793a(geVar5.f139510f);
                        if (a == null) {
                            a = C53236gk.UNKNOWN_PRECIPITATION_TYPE;
                        }
                        gdVar.copyOnWrite();
                        C53230ge geVar8 = (C53230ge) gdVar.instance;
                        geVar8.f139510f = a.f139534d;
                        geVar8.f139505a |= 16;
                        C53236gk a2 = C53236gk.m86793a(geVar5.f139510f);
                        if (a2 == null) {
                            a2 = C53236gk.UNKNOWN_PRECIPITATION_TYPE;
                        }
                        grVar.copyOnWrite();
                        C53244gs gsVar7 = (C53244gs) grVar.instance;
                        gsVar7.f139560f = a2.f139534d;
                        gsVar7.f139555a |= 16;
                    }
                    if ((geVar5.f139505a & 32) != 0) {
                        String str9 = geVar5.f139511g;
                        gdVar.copyOnWrite();
                        C53230ge geVar9 = (C53230ge) gdVar.instance;
                        str9.getClass();
                        geVar9.f139505a |= 32;
                        geVar9.f139511g = str9;
                        String str10 = geVar5.f139511g;
                        grVar.copyOnWrite();
                        C53244gs gsVar8 = (C53244gs) grVar.instance;
                        str10.getClass();
                        gsVar8.f139555a |= 32;
                        gsVar8.f139561g = str10;
                    }
                }
                C53228gc gcVar = (C53228gc) C53245gt.f139564n.createBuilder();
                gcVar.mo53966b((C53230ge) gdVar.build());
                boolean z = aeVar.f256573b;
                gcVar.copyOnWrite();
                C53245gt gtVar = (C53245gt) gcVar.instance;
                gtVar.f139567a |= 32;
                gtVar.f139574h = z;
                C53232gg ggVar = aeVar.f256583l;
                gcVar.copyOnWrite();
                C53245gt gtVar2 = (C53245gt) gcVar.instance;
                gtVar2.f139568b = ggVar.f139522g;
                gtVar2.f139567a |= 1;
                if (this.f325758h.mo79746e(C89985ax.f246708ap)) {
                    C53244gs gsVar9 = (C53244gs) grVar.build();
                    gcVar.copyOnWrite();
                    C53245gt gtVar3 = (C53245gt) gcVar.instance;
                    gsVar9.getClass();
                    gtVar3.f139571e = gsVar9;
                    gtVar3.f139567a |= 4;
                }
                String str11 = aeVar.f256578g;
                if (str11 != null) {
                    C53239gn gnVar = (C53239gn) C53242gq.f139546f.createBuilder();
                    gnVar.copyOnWrite();
                    C53242gq gqVar = (C53242gq) gnVar.instance;
                    gqVar.f139548a |= 2;
                    gqVar.f139550c = str11;
                    C53242gq gqVar2 = (C53242gq) gnVar.build();
                    gcVar.copyOnWrite();
                    C53245gt gtVar4 = (C53245gt) gcVar.instance;
                    gqVar2.getClass();
                    gtVar4.f139577k = gqVar2;
                    gtVar4.f139567a |= 256;
                }
                if (this.f325758h.mo79746e(C90017bw.f247969be) && this.f325761k.mo77161F()) {
                    C53234gi giVar = aeVar.f256579h;
                    if (giVar != null) {
                        gcVar.copyOnWrite();
                        C53245gt gtVar5 = (C53245gt) gcVar.instance;
                        gtVar5.f139573g = giVar;
                        gtVar5.f139567a |= 16;
                    }
                    if (aeVar.f256581j.isPresent()) {
                        C63042fg i5 = C62953e.m95484i(aeVar.f256581j.getAsLong());
                        gcVar.copyOnWrite();
                        C53245gt gtVar6 = (C53245gt) gcVar.instance;
                        i5.getClass();
                        gtVar6.f139572f = i5;
                        gtVar6.f139567a |= 8;
                    }
                }
                List list = aeVar.f256580i;
                if (list.size() > 1) {
                    for (int i6 = 1; i6 < aeVar.f256580i.size(); i6++) {
                        gcVar.mo53966b((C53230ge) list.get(i6));
                    }
                }
                if (this.f325758h.mo79746e(C89985ax.f246740w) && (nVar = aeVar.f256582k) != null) {
                    gcVar.copyOnWrite();
                    C53245gt gtVar7 = (C53245gt) gcVar.instance;
                    gtVar7.f139579m = nVar;
                    gtVar7.f139567a |= 1024;
                }
                C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
                C83737ai aiVar = (C83737ai) C83738aj.f228226c.createBuilder();
                C53245gt gtVar8 = (C53245gt) gcVar.build();
                aiVar.copyOnWrite();
                C83738aj ajVar = (C83738aj) aiVar.instance;
                gtVar8.getClass();
                ajVar.f228229b = gtVar8;
                ajVar.f228228a = 3;
                C83738aj ajVar2 = (C83738aj) aiVar.build();
                abVar.copyOnWrite();
                C83739ak akVar = (C83739ak) abVar.instance;
                ajVar2.getClass();
                akVar.f228233b = ajVar2;
                akVar.f228232a |= 1;
                return (C83739ak) abVar.build();
            }
            throw null;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C60870cx mo103272k(Intent intent, boolean z) {
        if (!intent.hasExtra("com.google.android.apps.dreamliner.extra.VERIFICATION_KEY")) {
            C59104x d = f325731a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) d).mo56372aa(33042)).mo56386p("No verification key found on intent.");
            return C118826c.f331423b;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.google.android.apps.dreamliner.extra.VERIFICATION_KEY");
        if (pendingIntent == null) {
            return C118826c.f331423b;
        }
        String creatorPackage = pendingIntent.getCreatorPackage();
        if (!((C84413ad) this.f325774y.mo27525b()).mo77972i(creatorPackage) || !"com.google.android.apps.dreamliner".equals(creatorPackage)) {
            C59104x d2 = f325731a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) d2).mo56372aa(33041)).mo56386p("Failed to verify intent.");
        } else {
            C86338r a = this.f325757g.f232790a.mo79722a();
            if (a.getBoolean("smartspace_dreamliner_enabled", false) != z) {
                C86341u uVar = new C86341u((C86346z) a);
                uVar.mo80085k("smartspace_dreamliner_enabled", Boolean.valueOf(z));
                uVar.mo80086l(false);
            }
            if (z) {
                m194999w();
            }
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C60870cx mo103273l(Intent intent, boolean z) {
        if (!this.f325758h.mo79746e(C90014bt.f247453hT)) {
            return C118826c.f331423b;
        }
        if (!this.f325755c.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE") && !this.f325758h.mo79746e(C90017bw.f248043t)) {
            C59104x d = f325731a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) d).mo56372aa(33051)).mo56386p("Device doesn't have the oem smartspace feature enabled");
            return C118826c.f331423b;
        } else if (!intent.hasExtra("com.google.android.apps.oemsmartspace.extra.VERIFICATION_KEY")) {
            C59104x d2 = f325731a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) d2).mo56372aa(33050)).mo56386p("Missing verification key, set up oemsmartspace failed");
            return C118826c.f331423b;
        } else {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.google.android.apps.oemsmartspace.extra.VERIFICATION_KEY");
            int intExtra = intent.getIntExtra("com.google.android.apps.oemsmartspace.JAR_LIB_VERSION_KEY", 0);
            if (pendingIntent == null || intExtra == 0) {
                C59071e eVar = f325731a;
                C59104x d3 = eVar.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                C59052c cVar = (C59052c) ((C59052c) d3).mo56372aa(33043);
                Object obj = pendingIntent;
                if (pendingIntent == null) {
                    obj = "null";
                }
                cVar.mo56389s("Missing information, pendingIntent is: %s", obj);
                C59104x d4 = eVar.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                ((C59052c) ((C59052c) d4).mo56372aa(33044)).mo56387q("oemSmartspaceVersion is: %d", intExtra);
                return C118826c.f331423b;
            }
            String creatorPackage = pendingIntent.getCreatorPackage();
            if (creatorPackage == null || creatorPackage.isEmpty()) {
                C59104x d5 = f325731a.mo56226d();
                d5.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                ((C59052c) ((C59052c) d5).mo56372aa(33045)).mo56386p("The intent PackageName is empty");
                return C118826c.f331423b;
            }
            if (intExtra == 1) {
                if (this.f325740G.a(creatorPackage, C131176a.f358726a) || this.f325758h.mo79746e(C90017bw.f248031h)) {
                    intExtra = 1;
                } else {
                    C59104x d6 = f325731a.mo56226d();
                    d6.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
                    ((C59052c) ((C59052c) d6).mo56372aa(33049)).mo56386p("The provided package name is not in the whitelist");
                    return C118826c.f331423b;
                }
            }
            if (intExtra <= 1 || this.f325755c.getPackageManager().checkPermission("com.google.android.googlequicksearchbox.permission.REGISTER_SMARTSPACE", creatorPackage) != -1) {
                boolean booleanExtra = intent.getBooleanExtra("com.google.android.apps.oemsmartspace.HIDE_PERSONAL_NOTIFICATION", false);
                C86338r a = this.f325757g.f232790a.mo79722a();
                if (a.getBoolean("com.google.android.apps.oemsmartspace.HIDE_PERSONAL_NOTIFICATION", false) != booleanExtra) {
                    C86341u uVar = new C86341u((C86346z) a);
                    uVar.mo80085k("com.google.android.apps.oemsmartspace.HIDE_PERSONAL_NOTIFICATION", Boolean.valueOf(booleanExtra));
                    uVar.mo80086l(false);
                }
                String stringExtra = intent.getStringExtra("com.google.android.apps.oemsmartspace.SMARTSPACE_TYPE_KEY");
                if (stringExtra == null) {
                    C58976aa aaVar = C58975e.f156826a;
                    return C118826c.f331423b;
                }
                if (stringExtra.equals("com.google.android.apps.oemsmartspace.SMARTSPACE_FOR_SYSUI")) {
                    if (a.getBoolean("smartspace_oem_sysui_enabled", false) != z) {
                        C86341u uVar2 = new C86341u((C86346z) a);
                        uVar2.mo80085k("smartspace_oem_sysui_enabled", Boolean.valueOf(z));
                        uVar2.mo80086l(false);
                    }
                    if (z) {
                        if (!creatorPackage.equals(a.getString("smartspace_oem_sysui_package_name", BuildConfig.FLAVOR))) {
                            C86341u uVar3 = new C86341u((C86346z) a);
                            uVar3.mo80073h("smartspace_oem_sysui_package_name", creatorPackage);
                            uVar3.mo80086l(false);
                        }
                        mo78854g("smartspace_oem_systemui_listener", true);
                    } else {
                        C86341u uVar4 = new C86341u((C86346z) a);
                        uVar4.mo80075j("smartspace_oem_sysui_package_name");
                        uVar4.mo80086l(false);
                        mo78854g("smartspace_oem_systemui_listener", false);
                    }
                } else if (stringExtra.equals("com.google.android.apps.oemsmartspace.SMARTSPACE_FOR_LAUNCHER")) {
                    if (a.getBoolean("smartspace_oem_launcher_enabled", false) != z) {
                        C86341u uVar5 = new C86341u((C86346z) a);
                        uVar5.mo80085k("smartspace_oem_launcher_enabled", Boolean.valueOf(z));
                        uVar5.mo80086l(false);
                    }
                    if (z) {
                        if (!creatorPackage.equals(a.getString("smartspace_oem_launcher_package_name", BuildConfig.FLAVOR))) {
                            C86341u uVar6 = new C86341u((C86346z) a);
                            uVar6.mo80073h("smartspace_oem_launcher_package_name", creatorPackage);
                            uVar6.mo80086l(false);
                        }
                        mo78854g("smartspace_oem_launcher_listener", true);
                    } else {
                        C86341u uVar7 = new C86341u((C86346z) a);
                        uVar7.mo80075j("smartspace_oem_launcher_package_name");
                        uVar7.mo80086l(false);
                        mo78854g("smartspace_oem_launcher_listener", false);
                    }
                } else if (!stringExtra.equals("com.google.android.apps.oemsmartspace.SMARTSPACE_FOR_AOD")) {
                    return C118826c.f331423b;
                } else {
                    if (a.getBoolean("smartspace_oem_aod_enabled", false) != z) {
                        C86341u uVar8 = new C86341u((C86346z) a);
                        uVar8.mo80085k("smartspace_oem_aod_enabled", Boolean.valueOf(z));
                        uVar8.mo80086l(false);
                    }
                    if (z) {
                        if (!creatorPackage.equals(a.getString("smartspace_oem_aod_package_name", BuildConfig.FLAVOR))) {
                            C86341u uVar9 = new C86341u((C86346z) a);
                            uVar9.mo80073h("smartspace_oem_aod_package_name", creatorPackage);
                            uVar9.mo80086l(false);
                        }
                        mo78854g("smartspace_oem_aod_listener", true);
                    } else {
                        C86341u uVar10 = new C86341u((C86346z) a);
                        uVar10.mo80075j("smartspace_oem_aod_package_name");
                        uVar10.mo80086l(false);
                        mo78854g("smartspace_oem_aod_listener", false);
                    }
                }
                if (z) {
                    if (a.getInt("com.google.android.apps.oemsmartspace.JAR_LIB_VERSION_KEY", 0) != intExtra) {
                        C86341u uVar11 = new C86341u((C86346z) a);
                        uVar11.mo80085k("com.google.android.apps.oemsmartspace.JAR_LIB_VERSION_KEY", Integer.valueOf(intExtra));
                        uVar11.mo80086l(false);
                    }
                    String stringExtra2 = intent.getStringExtra("com.google.android.apps.oemsmartspace.SMARTSPACE_RESOURCE_PACKAGE");
                    if (stringExtra2 != null && !stringExtra2.isEmpty()) {
                        C86341u uVar12 = new C86341u((C86346z) a);
                        uVar12.mo80073h("com.google.android.apps.oemsmartspace.SMARTSPACE_RESOURCE_PACKAGE", stringExtra2);
                        uVar12.mo80086l(false);
                    }
                    boolean booleanExtra2 = intent.getBooleanExtra("com.google.android.apps.oemsmartspace.SMARTSPACE_ENABLE_DATE_KEY", true);
                    if (a.getBoolean("com.google.android.apps.oemsmartspace.SMARTSPACE_ENABLE_DATE_KEY", true) != booleanExtra2) {
                        C86341u uVar13 = new C86341u((C86346z) a);
                        uVar13.mo80085k("com.google.android.apps.oemsmartspace.SMARTSPACE_ENABLE_DATE_KEY", Boolean.valueOf(booleanExtra2));
                        uVar13.mo80086l(false);
                    }
                    C58976aa aaVar2 = C58975e.f156826a;
                    return m194999w();
                }
                if (a.contains("com.google.android.apps.oemsmartspace.JAR_LIB_VERSION_KEY")) {
                    C86341u uVar14 = new C86341u((C86346z) a);
                    uVar14.mo80075j("com.google.android.apps.oemsmartspace.JAR_LIB_VERSION_KEY");
                    uVar14.mo80086l(false);
                }
                return C118826c.f331423b;
            }
            C59104x d7 = f325731a.mo56226d();
            d7.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) d7).mo56372aa(33048)).mo56389s("package: %s does not have permission granted", creatorPackage);
            return C118826c.f331423b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo103274m() {
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        long millis = TimeUnit.HOURS.toMillis(2);
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 2;
        agVar.f328823c = millis;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328824d = 1;
        agVar2.f328821a |= 4;
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        agVar3.f328821a |= 16;
        agVar3.f328826f = false;
        afVar.copyOnWrite();
        C118472ag agVar4 = (C118472ag) afVar.instance;
        agVar4.f328821a |= 8;
        agVar4.f328825e = true;
        ((C118561t) this.f325773x.mo27525b()).mo103754e(C118522by.NOW_UPDATE_GCM_REGISTRATION, (C118472ag) afVar.build());
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a8, code lost:
        if ((r15 & 8) == 0) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02aa, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ad, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02af, code lost:
        r29 = !r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02b1, code lost:
        if (1 == r6) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02b3, code lost:
        r28 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02b6, code lost:
        r28 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02b8, code lost:
        r3.mo109942o(false, false, false, r28, r29);
        r2 = (com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2.f228374d.mo56226d()).mo56372aa(6868);
        r3 = r7.f28792a;
        r5 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02d9, code lost:
        if ((r3 & 8) == 0) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02db, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02dd, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02df, code lost:
        if (1 == r5) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02e1, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02e3, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e4, code lost:
        r2.mo56358K("Weather hourly forecast ignored due to missing fields. Temp=%b, IconUrl=%b ", r5, r3);
        r2 = com.google.common.base.C58836b.f156633a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x011b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.smartspace.C92035ae mo103271j(com.google.p375ai.p378b.C8207zm r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            int r2 = r1.f28822a
            r3 = r2 & 1
            java.lang.String r4 = "SmartspaceWorker"
            r7 = 1
            if (r3 == 0) goto L_0x0644
            r3 = r2 & 2
            if (r3 == 0) goto L_0x0644
            r3 = r2 & 4
            if (r3 == 0) goto L_0x0644
            r2 = r2 & 16
            if (r2 == 0) goto L_0x0644
            int r9 = r1.f28823b
            java.lang.String r2 = r1.f28824c
            java.lang.String r11 = r1.f28825d
            java.lang.String r12 = r1.f28826e
            com.google.ai.b.zf r2 = r1.f28829h
            if (r2 != 0) goto L_0x0027
            com.google.ai.b.zf r2 = com.google.p375ai.p378b.C8200zf.f28802b
        L_0x0027:
            java.lang.String r14 = r2.f28804a
            boolean r10 = r1.f28827f
            com.google.android.apps.gsa.search.core.preferences.ag r2 = r0.f325775z
            g.a.a r3 = r2.f233330a
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.search.core.preferences.j r3 = (com.google.android.apps.gsa.search.core.preferences.C86319j) r3
            com.google.android.apps.gsa.search.core.preferences.h r3 = r3.mo80040a()
            int r3 = r3.mo80037e()
            r8 = -1
            if (r3 != 0) goto L_0x0047
            com.google.android.apps.gsa.search.core.preferences.r r2 = r2.f233331b
            java.lang.String r3 = "temp_units"
            r2.getInt(r3, r8)
        L_0x0047:
            com.google.ai.b.za r2 = r1.f28830i
            if (r2 != 0) goto L_0x004d
            com.google.ai.b.za r2 = com.google.p375ai.p378b.C8195za.f28790j
        L_0x004d:
            int r2 = r2.f28792a
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x006a
            com.google.ai.b.za r2 = r1.f28830i
            if (r2 != 0) goto L_0x0059
            com.google.ai.b.za r2 = com.google.p375ai.p378b.C8195za.f28790j
        L_0x0059:
            int r2 = r2.f28800i
            int r2 = com.google.p375ai.p378b.C8197zc.m22967a(r2)
            if (r2 != 0) goto L_0x0062
            r2 = 1
        L_0x0062:
            int r2 = r2 + r8
            int r2 = com.google.assistant.p3897e.p3921j.p3926e.C52017hp.m86469a(r2)
            r18 = r2
            goto L_0x006c
        L_0x006a:
            r18 = 1
        L_0x006c:
            j$.util.OptionalLong r2 = p3186j$.util.OptionalLong.empty()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f325758h
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247661lP
            boolean r3 = r3.mo79746e(r13)
            if (r3 == 0) goto L_0x0107
            int r3 = r1.f28822a
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0107
            com.google.ai.b.zl r3 = r1.f28828g
            if (r3 != 0) goto L_0x0088
            com.google.ai.b.zl r3 = com.google.p375ai.p378b.C8206zl.f28815c
        L_0x0088:
            java.lang.String r13 = r3.f28817a
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x0107
            com.google.ai.b.zk r13 = r3.f28818b
            if (r13 != 0) goto L_0x0096
            com.google.ai.b.zk r13 = com.google.p375ai.p378b.C8205zk.f28810c
        L_0x0096:
            com.google.ai.b.zj r13 = r13.f28813b
            if (r13 != 0) goto L_0x009c
            com.google.ai.b.zj r13 = com.google.p375ai.p378b.C8204zj.f28806b
        L_0x009c:
            java.lang.String r13 = r13.f28808a
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x0107
            com.google.ai.b.zk r13 = r3.f28818b
            if (r13 != 0) goto L_0x00aa
            com.google.ai.b.zk r13 = com.google.p375ai.p378b.C8205zk.f28810c
        L_0x00aa:
            java.lang.String r13 = r13.f28812a
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x0107
            java.lang.String r13 = r3.f28817a
            if (r13 == 0) goto L_0x00ff
            com.google.ai.b.zk r3 = r3.f28818b
            if (r3 != 0) goto L_0x00bd
            com.google.ai.b.zk r15 = com.google.p375ai.p378b.C8205zk.f28810c
            goto L_0x00be
        L_0x00bd:
            r15 = r3
        L_0x00be:
            com.google.ai.b.zj r15 = r15.f28813b
            if (r15 != 0) goto L_0x00c4
            com.google.ai.b.zj r15 = com.google.p375ai.p378b.C8204zj.f28806b
        L_0x00c4:
            java.lang.String r15 = r15.f28808a
            if (r15 == 0) goto L_0x00f7
            if (r3 != 0) goto L_0x00cf
            com.google.ai.b.zk r16 = com.google.p375ai.p378b.C8205zk.f28810c
            r6 = r16
            goto L_0x00d0
        L_0x00cf:
            r6 = r3
        L_0x00d0:
            java.lang.String r6 = r6.f28812a
            if (r6 == 0) goto L_0x00ef
            com.google.android.apps.gsa.smartspace.a r5 = new com.google.android.apps.gsa.smartspace.a
            r5.<init>(r13, r15, r6)
            if (r3 != 0) goto L_0x00de
            com.google.ai.b.zk r6 = com.google.p375ai.p378b.C8205zk.f28810c
            goto L_0x00df
        L_0x00de:
            r6 = r3
        L_0x00df:
            com.google.ai.b.zj r6 = r6.f28813b
            if (r6 != 0) goto L_0x00e5
            com.google.ai.b.zj r6 = com.google.p375ai.p378b.C8204zj.f28806b
        L_0x00e5:
            java.lang.String r6 = r6.f28808a
            if (r3 != 0) goto L_0x00eb
            com.google.ai.b.zk r3 = com.google.p375ai.p378b.C8205zk.f28810c
        L_0x00eb:
            java.lang.String r3 = r3.f28812a
            r13 = r5
            goto L_0x0108
        L_0x00ef:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null actionUrl"
            r1.<init>(r2)
            throw r1
        L_0x00f7:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null publisherName"
            r1.<init>(r2)
            throw r1
        L_0x00ff:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null title"
            r1.<init>(r2)
            throw r1
        L_0x0107:
            r13 = 0
        L_0x0108:
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f325758h
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247969be
            boolean r3 = r3.mo79746e(r5)
            r5 = 2
            if (r3 == 0) goto L_0x03ee
            com.google.android.apps.gsa.opa.smartspace.j r3 = r0.f325761k
            boolean r3 = r3.mo77161F()
            if (r3 == 0) goto L_0x03ee
            int r2 = r1.f28822a
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0360
            com.google.android.apps.gsa.opa.smartspace.g.c r2 = r0.f325739F
            com.google.ai.b.yw r3 = r1.f28832k
            if (r3 != 0) goto L_0x0129
            com.google.ai.b.yw r3 = com.google.p375ai.p378b.C8190yw.f28770e
        L_0x0129:
            int r6 = r3.f28772a
            r15 = r6 & 1
            if (r15 == 0) goto L_0x02f7
            r6 = r6 & r5
            if (r6 == 0) goto L_0x02f7
            com.google.protobuf.cq r6 = r3.f28775d
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x013c
            goto L_0x02f7
        L_0x013c:
            com.google.assistant.s.a.gi r6 = com.google.assistant.p3994s.p3995a.C53234gi.f139523e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.s.a.gh r6 = (com.google.assistant.p3994s.p3995a.C53233gh) r6
            com.google.cg.d r15 = r3.f28773b
            if (r15 != 0) goto L_0x014a
            com.google.cg.d r15 = com.google.p4479cg.C58072d.f155218d
        L_0x014a:
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.s.a.gi r8 = (com.google.assistant.p3994s.p3995a.C53234gi) r8
            r15.getClass()
            r8.f139526b = r15
            int r15 = r8.f139525a
            r15 = r15 | r7
            r8.f139525a = r15
            int r8 = r3.f28774c
            r6.copyOnWrite()
            com.google.protobuf.bv r15 = r6.instance
            com.google.assistant.s.a.gi r15 = (com.google.assistant.p3994s.p3995a.C53234gi) r15
            int r7 = r15.f139525a
            r7 = r7 | r5
            r15.f139525a = r7
            r15.f139527c = r8
            com.google.protobuf.cq r3 = r3.f28775d
            java.util.Iterator r3 = r3.iterator()
        L_0x0171:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x02ec
            java.lang.Object r7 = r3.next()
            com.google.ai.b.za r7 = (com.google.p375ai.p378b.C8195za) r7
            com.google.assistant.s.a.gs r8 = com.google.assistant.p3994s.p3995a.C53244gs.f139553j
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.s.a.gr r8 = (com.google.assistant.p3994s.p3995a.C53243gr) r8
            int r15 = r7.f28792a
            r21 = r15 & 1
            if (r21 == 0) goto L_0x02a1
            r22 = r15 & 8
            if (r22 == 0) goto L_0x02a1
            int r15 = r7.f28793b
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r8.copyOnWrite()
            com.google.protobuf.bv r5 = r8.instance
            com.google.assistant.s.a.gs r5 = (com.google.assistant.p3994s.p3995a.C53244gs) r5
            r15.getClass()
            r23 = r3
            int r3 = r5.f139555a
            r21 = 2
            r3 = r3 | 2
            r5.f139555a = r3
            r5.f139557c = r15
            java.lang.String r3 = r7.f28796e
            r8.copyOnWrite()
            com.google.protobuf.bv r5 = r8.instance
            com.google.assistant.s.a.gs r5 = (com.google.assistant.p3994s.p3995a.C53244gs) r5
            r3.getClass()
            int r15 = r5.f139555a
            r15 = r15 | 64
            r5.f139555a = r15
            r5.f139562h = r3
            int r3 = r7.f28792a
            r3 = r3 & 16
            if (r3 == 0) goto L_0x01db
            java.lang.String r3 = r7.f28797f
            r8.copyOnWrite()
            com.google.protobuf.bv r5 = r8.instance
            com.google.assistant.s.a.gs r5 = (com.google.assistant.p3994s.p3995a.C53244gs) r5
            r3.getClass()
            int r15 = r5.f139555a
            r20 = 1
            r15 = r15 | 1
            r5.f139555a = r15
            r5.f139556b = r3
        L_0x01db:
            int r3 = r7.f28792a
            r5 = 2
            r3 = r3 & r5
            if (r3 == 0) goto L_0x01f9
            int r3 = r7.f28794c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.copyOnWrite()
            com.google.protobuf.bv r5 = r8.instance
            com.google.assistant.s.a.gs r5 = (com.google.assistant.p3994s.p3995a.C53244gs) r5
            r3.getClass()
            int r15 = r5.f139555a
            r15 = r15 | 4
            r5.f139555a = r15
            r5.f139558d = r3
        L_0x01f9:
            int r3 = r7.f28792a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0217
            int r3 = r7.f28795d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.copyOnWrite()
            com.google.protobuf.bv r5 = r8.instance
            com.google.assistant.s.a.gs r5 = (com.google.assistant.p3994s.p3995a.C53244gs) r5
            r3.getClass()
            int r15 = r5.f139555a
            r15 = r15 | 8
            r5.f139555a = r15
            r5.f139559e = r3
        L_0x0217:
            int r3 = r7.f28792a
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x023b
            int r3 = r7.f28798g
            int r3 = com.google.p375ai.p378b.C8193yz.m22966a(r3)
            if (r3 != 0) goto L_0x0226
            r3 = 1
        L_0x0226:
            com.google.assistant.s.a.gk r3 = com.google.android.apps.gsa.opa.smartspace.p6458g.C83791c.m133402i(r3)
            r8.copyOnWrite()
            com.google.protobuf.bv r5 = r8.instance
            com.google.assistant.s.a.gs r5 = (com.google.assistant.p3994s.p3995a.C53244gs) r5
            int r3 = r3.f139534d
            r5.f139560f = r3
            int r3 = r5.f139555a
            r3 = r3 | 16
            r5.f139555a = r3
        L_0x023b:
            int r3 = r7.f28792a
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0259
            int r3 = r7.f28799h
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.copyOnWrite()
            com.google.protobuf.bv r5 = r8.instance
            com.google.assistant.s.a.gs r5 = (com.google.assistant.p3994s.p3995a.C53244gs) r5
            r3.getClass()
            int r15 = r5.f139555a
            r15 = r15 | 32
            r5.f139555a = r15
            r5.f139561g = r3
        L_0x0259:
            int r3 = r7.f28792a
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0284
            int r3 = r7.f28800i
            int r3 = com.google.p375ai.p378b.C8197zc.m22967a(r3)
            if (r3 != 0) goto L_0x0268
            r3 = 1
        L_0x0268:
            r5 = -1
            int r3 = r3 + r5
            int r3 = com.google.assistant.p3897e.p3921j.p3926e.C52017hp.m86469a(r3)
            r8.copyOnWrite()
            com.google.protobuf.bv r5 = r8.instance
            com.google.assistant.s.a.gs r5 = (com.google.assistant.p3994s.p3995a.C53244gs) r5
            int r7 = r3 + -1
            if (r3 == 0) goto L_0x0282
            r5.f139563i = r7
            int r3 = r5.f139555a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r5.f139555a = r3
            goto L_0x0284
        L_0x0282:
            r3 = 0
            throw r3
        L_0x0284:
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.s.a.gi r3 = (com.google.assistant.p3994s.p3995a.C53234gi) r3
            com.google.protobuf.bv r5 = r8.build()
            com.google.assistant.s.a.gs r5 = (com.google.assistant.p3994s.p3995a.C53244gs) r5
            r5.getClass()
            r3.mo53969a()
            com.google.protobuf.cq r3 = r3.f139528d
            r3.add(r5)
            r3 = r23
            r5 = 2
            goto L_0x0171
        L_0x02a1:
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r3 = r2.f228371a
            r5 = 1
            r6 = r21 ^ 1
            r8 = r15 & 8
            if (r8 == 0) goto L_0x02ad
            r20 = 1
            goto L_0x02af
        L_0x02ad:
            r20 = 0
        L_0x02af:
            r29 = r20 ^ 1
            if (r5 == r6) goto L_0x02b6
            r28 = 0
            goto L_0x02b8
        L_0x02b6:
            r28 = 1
        L_0x02b8:
            r25 = 0
            r26 = 0
            r27 = 0
            r24 = r3
            r24.mo109942o(r25, r26, r27, r28, r29)
            com.google.common.f.a.d r2 = r2.f228374d
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r3 = 6868(0x1ad4, float:9.624E-42)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            int r3 = r7.f28792a
            r5 = r3 & 1
            r3 = r3 & 8
            if (r3 == 0) goto L_0x02dd
            r3 = 1
            goto L_0x02de
        L_0x02dd:
            r3 = 0
        L_0x02de:
            r6 = 1
            if (r6 == r5) goto L_0x02e3
            r5 = 0
            goto L_0x02e4
        L_0x02e3:
            r5 = 1
        L_0x02e4:
            java.lang.String r6 = "Weather hourly forecast ignored due to missing fields. Temp=%b, IconUrl=%b "
            r2.mo56358K(r6, r5, r3)
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x0322
        L_0x02ec:
            com.google.protobuf.bv r2 = r6.build()
            com.google.assistant.s.a.gi r2 = (com.google.assistant.p3994s.p3995a.C53234gi) r2
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0322
        L_0x02f7:
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r2 = r2.f228371a
            com.google.protobuf.cq r5 = r3.f28775d
            boolean r24 = r5.isEmpty()
            int r3 = r3.f28772a
            r5 = r3 & 1
            r6 = 1
            r5 = r5 ^ r6
            r7 = 2
            r3 = r3 & r7
            if (r3 == 0) goto L_0x030c
            r20 = 1
            goto L_0x030e
        L_0x030c:
            r20 = 0
        L_0x030e:
            r26 = r20 ^ 1
            if (r6 == r5) goto L_0x0315
            r25 = 0
            goto L_0x0317
        L_0x0315:
            r25 = 1
        L_0x0317:
            r27 = 0
            r28 = 0
            r23 = r2
            r23.mo109942o(r24, r25, r26, r27, r28)
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0322:
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x0360
            java.lang.Object r2 = r2.mo56107c()
            com.google.assistant.s.a.gi r2 = (com.google.assistant.p3994s.p3995a.C53234gi) r2
            com.google.common.f.e r3 = f325731a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r5, r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r5 = 33014(0x80f6, float:4.6262E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.cg.d r5 = r2.f139526b
            if (r5 != 0) goto L_0x034a
            com.google.cg.d r5 = com.google.p4479cg.C58072d.f155218d
        L_0x034a:
            int r6 = r2.f139527c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.protobuf.cq r7 = r2.f139528d
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Weather hourly forecast data used: utc_date=%s, start_hour=%d, number of hours=%d"
            r3.mo56359L(r8, r5, r6, r7)
            goto L_0x0361
        L_0x0360:
            r2 = 0
        L_0x0361:
            int r3 = r1.f28822a
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03c8
            com.google.protobuf.fg r3 = r1.f28831j
            if (r3 != 0) goto L_0x036d
            com.google.protobuf.fg r3 = com.google.protobuf.C63042fg.f170152c
        L_0x036d:
            long r5 = r3.f170154a
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x03c8
            com.google.protobuf.fg r3 = r1.f28831j
            if (r3 != 0) goto L_0x037b
            com.google.protobuf.fg r3 = com.google.protobuf.C63042fg.f170152c
        L_0x037b:
            long r5 = com.google.protobuf.p4750c.C62953e.m95478c(r3)
            j$.util.OptionalLong r3 = p3186j$.util.OptionalLong.m71641of(r5)
            com.google.android.libraries.f.a r7 = r0.f325756f
            long r7 = r7.mo26870b()
            long r7 = r7 - r5
            long r23 = f325733u
            int r15 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r15 <= 0) goto L_0x03eb
            com.google.common.f.e r7 = f325731a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r4)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r8 = 33013(0x80f5, float:4.6261E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)
            r23 = r7
            com.google.common.f.c r23 = (com.google.common.p4526f.C59052c) r23
            java.lang.String r24 = "Stale current weather data: currentUpdateTime in millis=%d, currentTimeMillis=%d"
            com.google.android.libraries.f.a r7 = r0.f325756f
            long r27 = r7.mo26870b()
            r25 = r5
            r23.mo56350C(r24, r25, r27)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r7 = r0.f325764n
            com.google.android.libraries.f.a r8 = r0.f325756f
            long r23 = r8.mo26870b()
            long r23 = r23 - r5
            j$.time.Duration r5 = p3186j$.time.Duration.ofMillis(r23)
            r6 = 2
            r7.mo109931d(r6, r5)
            goto L_0x03eb
        L_0x03c8:
            com.google.android.libraries.f.a r3 = r0.f325756f
            long r5 = r3.mo26870b()
            j$.util.OptionalLong r3 = p3186j$.util.OptionalLong.m71641of(r5)
            com.google.common.f.e r5 = f325731a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r4)
            java.lang.String r6 = "Missing current weather update time from sno push."
            r7 = 33012(0x80f4, float:4.626E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r5 = r0.f325764n
            r6 = 2
            r5.mo109932e(r6)
        L_0x03eb:
            r15 = r2
            r2 = r3
            goto L_0x03ef
        L_0x03ee:
            r15 = 0
        L_0x03ef:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.android.apps.gsa.opa.smartspace.g.c r5 = r0.f325739F
            com.google.ai.b.yu r6 = r1.f28833l
            if (r6 != 0) goto L_0x03fc
            com.google.ai.b.yu r6 = com.google.p375ai.p378b.C8188yu.f28765c
        L_0x03fc:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r6.f28767a
            r20 = 1
            r8 = r8 & 1
            if (r8 == 0) goto L_0x05a3
            com.google.protobuf.cq r8 = r6.f28768b
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0413
            goto L_0x05a3
        L_0x0413:
            com.google.protobuf.cq r6 = r6.f28768b
            java.util.Iterator r6 = r6.iterator()
        L_0x0419:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x059c
            java.lang.Object r8 = r6.next()
            com.google.ai.b.za r8 = (com.google.p375ai.p378b.C8195za) r8
            r21 = r6
            int r6 = r8.f28792a
            r23 = r6 & 2
            if (r23 == 0) goto L_0x0524
            r23 = r6 & 4
            if (r23 == 0) goto L_0x0524
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0524
            com.google.assistant.s.a.ge r6 = com.google.assistant.p3994s.p3995a.C53230ge.f139503j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.s.a.gd r6 = (com.google.assistant.p3994s.p3995a.C53229gd) r6
            r23 = r2
            int r2 = r8.f28794c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r6.copyOnWrite()
            r24 = r15
            com.google.protobuf.bv r15 = r6.instance
            com.google.assistant.s.a.ge r15 = (com.google.assistant.p3994s.p3995a.C53230ge) r15
            r2.getClass()
            r25 = r14
            int r14 = r15.f139505a
            r14 = r14 | 4
            r15.f139505a = r14
            r15.f139508d = r2
            int r2 = r8.f28795d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r6.copyOnWrite()
            com.google.protobuf.bv r14 = r6.instance
            com.google.assistant.s.a.ge r14 = (com.google.assistant.p3994s.p3995a.C53230ge) r14
            r2.getClass()
            int r15 = r14.f139505a
            r15 = r15 | 8
            r14.f139505a = r15
            r14.f139509e = r2
            java.lang.String r2 = r8.f28796e
            r6.copyOnWrite()
            com.google.protobuf.bv r14 = r6.instance
            com.google.assistant.s.a.ge r14 = (com.google.assistant.p3994s.p3995a.C53230ge) r14
            r2.getClass()
            int r15 = r14.f139505a
            r15 = r15 | 64
            r14.f139505a = r15
            r14.f139512h = r2
            int r2 = r8.f28792a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x04a3
            java.lang.String r2 = r8.f28797f
            r6.copyOnWrite()
            com.google.protobuf.bv r14 = r6.instance
            com.google.assistant.s.a.ge r14 = (com.google.assistant.p3994s.p3995a.C53230ge) r14
            r2.getClass()
            int r15 = r14.f139505a
            r20 = 1
            r15 = r15 | 1
            r14.f139505a = r15
            r14.f139506b = r2
        L_0x04a3:
            int r2 = r8.f28792a
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x04c7
            int r2 = r8.f28798g
            int r2 = com.google.p375ai.p378b.C8193yz.m22966a(r2)
            if (r2 != 0) goto L_0x04b2
            r2 = 1
        L_0x04b2:
            com.google.assistant.s.a.gk r2 = com.google.android.apps.gsa.opa.smartspace.p6458g.C83791c.m133402i(r2)
            r6.copyOnWrite()
            com.google.protobuf.bv r14 = r6.instance
            com.google.assistant.s.a.ge r14 = (com.google.assistant.p3994s.p3995a.C53230ge) r14
            int r2 = r2.f139534d
            r14.f139510f = r2
            int r2 = r14.f139505a
            r2 = r2 | 16
            r14.f139505a = r2
        L_0x04c7:
            int r2 = r8.f28792a
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x04e5
            int r2 = r8.f28799h
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r6.copyOnWrite()
            com.google.protobuf.bv r14 = r6.instance
            com.google.assistant.s.a.ge r14 = (com.google.assistant.p3994s.p3995a.C53230ge) r14
            r2.getClass()
            int r15 = r14.f139505a
            r15 = r15 | 32
            r14.f139505a = r15
            r14.f139511g = r2
        L_0x04e5:
            int r2 = r8.f28792a
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0510
            int r2 = r8.f28800i
            int r2 = com.google.p375ai.p378b.C8197zc.m22967a(r2)
            if (r2 != 0) goto L_0x04f4
            r2 = 1
        L_0x04f4:
            r14 = -1
            int r2 = r2 + r14
            int r2 = com.google.assistant.p3897e.p3921j.p3926e.C52017hp.m86469a(r2)
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.s.a.ge r8 = (com.google.assistant.p3994s.p3995a.C53230ge) r8
            int r15 = r2 + -1
            if (r2 == 0) goto L_0x050e
            r8.f139513i = r15
            int r2 = r8.f139505a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r8.f139505a = r2
            goto L_0x0511
        L_0x050e:
            r2 = 0
            throw r2
        L_0x0510:
            r14 = -1
        L_0x0511:
            com.google.protobuf.bv r2 = r6.build()
            com.google.assistant.s.a.ge r2 = (com.google.assistant.p3994s.p3995a.C53230ge) r2
            r7.add(r2)
            r6 = r21
            r2 = r23
            r15 = r24
            r14 = r25
            goto L_0x0419
        L_0x0524:
            r23 = r2
            r25 = r14
            r24 = r15
            com.google.common.f.a.d r2 = r5.f228374d
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r6 = 6880(0x1ae0, float:9.641E-42)
            com.google.common.f.x r2 = r2.mo56372aa(r6)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            int r6 = r8.f28792a
            r7 = r6 & 2
            if (r7 == 0) goto L_0x0542
            r7 = 1
            goto L_0x0543
        L_0x0542:
            r7 = 0
        L_0x0543:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r14 = r6 & 4
            if (r14 == 0) goto L_0x054d
            r14 = 1
            goto L_0x054e
        L_0x054d:
            r14 = 0
        L_0x054e:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0558
            r6 = 1
            goto L_0x0559
        L_0x0558:
            r6 = 0
        L_0x0559:
            java.lang.String r15 = "Weather daily forecast ignored due to missing fields. highTemp=%b, lowTemp=%b, IconUrl=%b "
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r2.mo56359L(r15, r7, r14, r6)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r2 = r5.f228371a
            com.google.assistant.s.a.gg r5 = com.google.assistant.p3994s.p3995a.C53232gg.GCM_PUSH
            int r5 = r5.f139522g
            int r6 = r8.f28792a
            r7 = r6 & 2
            if (r7 == 0) goto L_0x0572
            r7 = 1
            r20 = 1
            goto L_0x0575
        L_0x0572:
            r7 = 1
            r20 = 0
        L_0x0575:
            r30 = r20 ^ 1
            r8 = r6 & 4
            if (r8 == 0) goto L_0x057e
            r20 = 1
            goto L_0x0580
        L_0x057e:
            r20 = 0
        L_0x0580:
            r31 = r20 ^ 1
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0588
            r6 = 1
            goto L_0x0589
        L_0x0588:
            r6 = 0
        L_0x0589:
            r28 = 0
            r29 = 0
            r32 = r6 ^ 1
            r26 = r2
            r27 = r5
            r26.mo109934g(r27, r28, r29, r30, r31, r32)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x05f6
        L_0x059c:
            r23 = r2
            r25 = r14
            r24 = r15
            goto L_0x05f6
        L_0x05a3:
            r23 = r2
            r25 = r14
            r24 = r15
            com.google.common.f.a.d r2 = r5.f228374d
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r7 = 6879(0x1adf, float:9.64E-42)
            com.google.common.f.x r2 = r2.mo56372aa(r7)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            int r7 = r6.f28767a
            com.google.protobuf.cq r8 = r6.f28768b
            boolean r8 = r8.isEmpty()
            r14 = 1
            r7 = r7 & r14
            if (r14 == r7) goto L_0x05c7
            r7 = 0
            goto L_0x05c8
        L_0x05c7:
            r7 = 1
        L_0x05c8:
            java.lang.String r15 = "Weather daily forecast ignored due to missing fields. hasStartDate=%b, ForecastListIsEmpty=%b "
            r2.mo56358K(r15, r7, r8)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r2 = r5.f228371a
            com.google.assistant.s.a.gg r5 = com.google.assistant.p3994s.p3995a.C53232gg.GCM_PUSH
            int r5 = r5.f139522g
            com.google.protobuf.cq r7 = r6.f28768b
            boolean r28 = r7.isEmpty()
            int r6 = r6.f28767a
            r6 = r6 & r14
            r6 = r6 ^ r14
            if (r14 == r6) goto L_0x05e2
            r29 = 0
            goto L_0x05e4
        L_0x05e2:
            r29 = 1
        L_0x05e4:
            r30 = 0
            r31 = 0
            r32 = 0
            r26 = r2
            r27 = r5
            r26.mo109934g(r27, r28, r29, r30, r31, r32)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x05f6:
            r3.addAll(r7)
            int r2 = r1.f28822a
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x0618
            com.google.common.f.e r2 = f325731a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r5, r4)
            java.lang.String r4 = "Missing current weather from sno push."
            r5 = 33011(0x80f3, float:4.6258E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r2 = r0.f325764n
            r4 = 2
            r2.mo109930c(r4)
        L_0x0618:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f325758h
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246740w
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x0631
            int r2 = r1.f28822a
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0631
            com.google.assistant.ak.n r5 = r1.f28834m
            if (r5 != 0) goto L_0x062e
            com.google.assistant.ak.n r5 = com.google.assistant.p3820ak.C49215n.f127253d
        L_0x062e:
            r19 = r5
            goto L_0x0633
        L_0x0631:
            r19 = 0
        L_0x0633:
            com.google.android.apps.gsa.smartspace.ae r1 = new com.google.android.apps.gsa.smartspace.ae
            com.google.assistant.s.a.gg r20 = com.google.assistant.p3994s.p3995a.C53232gg.GCM_PUSH
            r8 = r1
            r14 = r25
            r15 = r24
            r16 = r3
            r17 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0644:
            com.google.common.f.e r2 = f325731a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r4)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 33008(0x80f0, float:4.6254E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            r3 = r2
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            int r1 = r1.f28822a
            r2 = r1 & 1
            r4 = 1
            if (r4 == r2) goto L_0x0665
            r20 = 0
            goto L_0x0667
        L_0x0665:
            r20 = 1
        L_0x0667:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r20)
            r2 = r1 & 2
            if (r2 == 0) goto L_0x0672
            r20 = 1
            goto L_0x0674
        L_0x0672:
            r20 = 0
        L_0x0674:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r20)
            r2 = r1 & 4
            if (r2 == 0) goto L_0x067f
            r20 = 1
            goto L_0x0681
        L_0x067f:
            r20 = 0
        L_0x0681:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r20)
            r1 = r1 & 16
            if (r1 == 0) goto L_0x068c
            r16 = 1
            goto L_0x068e
        L_0x068c:
            r16 = 0
        L_0x068e:
            java.lang.String r4 = "Handling response ignored due to missing fields. Temp=%b, Unit=%b, IconUrl=%b IsCelsius=%b"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r16)
            r3.mo56360M(r4, r5, r6, r7, r8)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.C117350ai.mo103271j(com.google.ai.b.zm):com.google.android.apps.gsa.smartspace.ae");
    }

    /* renamed from: g */
    public final C60870cx mo78854g(String str, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            C58976aa aaVar = C58975e.f156826a;
            C86338r a = this.f325757g.f232790a.mo79722a();
            if ("smartspace_generic_intent_listener".equals(str) && a.getBoolean("weather_widget_enabled", false)) {
                C86341u uVar = new C86341u((C86346z) a);
                uVar.mo80085k("weather_widget_enabled", false);
                uVar.mo80086l(false);
            }
            C86338r a2 = this.f325757g.f232790a.mo79722a();
            Set stringSet = a2.getStringSet("smartspace_listeners", (Set) null);
            C86346z zVar = (C86346z) a2;
            C86341u uVar2 = new C86341u(zVar);
            HashSet hashSet = new HashSet();
            if (stringSet != null) {
                hashSet.addAll(stringSet);
            }
            hashSet.add(str);
            uVar2.mo80074i("smartspace_listeners", hashSet);
            uVar2.mo80085k("smartspace_enabled", true);
            uVar2.mo80086l(false);
            boolean contains = a2.contains("smartspace_oobe_dismissed");
            boolean e = this.f325758h.mo79746e(C90017bw.f247899aN);
            if (!contains && this.f325757g.f232790a.mo79722a().getBoolean("smartspace_enabled", false) && e && this.f325755c.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE")) {
                C86341u uVar3 = new C86341u(zVar);
                uVar3.mo80085k("smartspace_oobe_dismissed", false);
                uVar3.mo80086l(false);
                this.f325735B.mo77153i(false, false);
            }
            mo103274m();
            if (this.f325761k.mo77178p()) {
                this.f325735B.mo77150f();
            }
            this.f325761k.f228395f.mo77149e();
            this.f325770t.mo98927a();
            arrayList.add(C118826c.f331423b);
            arrayList.add(this.f325737D.mo77115a());
            return C118826c.m197212b(arrayList);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C86338r a3 = this.f325757g.f232790a.mo79722a();
        Set stringSet2 = a3.getStringSet("smartspace_listeners", (Set) null);
        if (stringSet2 != null && stringSet2.contains(str)) {
            HashSet hashSet2 = new HashSet(stringSet2);
            hashSet2.remove(str);
            C86341u uVar4 = new C86341u((C86346z) a3);
            uVar4.mo80074i("smartspace_listeners", hashSet2);
            if (hashSet2.isEmpty()) {
                uVar4.mo80085k("smartspace_enabled", false);
                mo103274m();
                C117375d dVar = this.f325772w;
                if (!dVar.f325839b.mo77164I()) {
                    dVar.f325838a.mo103752c(C118522by.SMARTSPACE_CALENDAR_REFRESH);
                    dVar.f325838a.mo103752c(C118522by.SMARTSPACE_CALENDAR_UPDATE);
                }
            }
            uVar4.mo80086l(false);
        }
        return C118826c.f331423b;
    }
}
