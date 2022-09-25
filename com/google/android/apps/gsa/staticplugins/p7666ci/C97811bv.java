package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.content.ComponentName;
import androidx.annotation.C0826b;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.opa.smartspace.p6452a.C83725a;
import com.google.android.apps.gsa.p8839t.C118366g;
import com.google.android.apps.gsa.p8839t.C118451i;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.p8839t.p8841b.C118345d;
import com.google.android.apps.gsa.p8839t.p8841b.C118346e;
import com.google.android.apps.gsa.p8839t.p8844e.C118356e;
import com.google.android.apps.gsa.p8839t.p8844e.C118357f;
import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.gsa.p8839t.p8847h.C118435k;
import com.google.android.apps.gsa.p8839t.p8847h.C118449y;
import com.google.android.apps.gsa.p8839t.p8847h.C118450z;
import com.google.android.apps.gsa.search.core.google.p6790a.C85810bb;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88142qs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88144qu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110560t;
import com.google.android.apps.gsa.staticplugins.p7666ci.p7670d.C97823a;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.assistant.platform.pcp.api.C123598n;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123747bn;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15799i;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.C15814a;
import com.google.android.libraries.assistant.pcp.p1573k.C18926f;
import com.google.android.libraries.assistant.pcp.p1573k.C18929i;
import com.google.android.libraries.assistant.pcp.p1573k.C18930j;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51444hy;
import com.google.assistant.p3897e.p3917i.p3918a.C51447ia;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bv */
/* compiled from: PG */
public final class C97811bv implements C118339a, C87682aj, C90991b {

    /* renamed from: A */
    private static final C31164au f273108A = C31164au.m58092b("PcpV1GetProactiveContent_");

    /* renamed from: a */
    public static final C59071e f273109a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ci.bv");

    /* renamed from: b */
    public static final C31164au f273110b = C31164au.m58092b("PcpV0PotterOnlyGetProactiveContent_");

    /* renamed from: c */
    public static final C31164au f273111c = C31164au.m58092b("PcpV0PotterGetProactiveContent_");

    /* renamed from: d */
    public static final C31164au f273112d = C31164au.m58092b("PcpV0OnDeviceMediaGetProactiveContent_");

    /* renamed from: e */
    public static final C31164au f273113e = C31164au.m58092b("PcpV0OnDeviceMediaCacheOnlyGetProactiveContent_");

    /* renamed from: z */
    private static final C31164au f273114z = C31164au.m58092b("PcpV0GetProactiveContent_");

    /* renamed from: B */
    private final C22871g f273115B;

    /* renamed from: C */
    private final Query f273116C;

    /* renamed from: D */
    private final C58833ax f273117D;

    /* renamed from: E */
    private final CopyOnWriteArraySet f273118E;

    /* renamed from: F */
    private final C118561t f273119F;

    /* renamed from: G */
    private final C58833ax f273120G;

    /* renamed from: H */
    private final C58833ax f273121H;

    /* renamed from: I */
    private final C85810bb f273122I;

    /* renamed from: J */
    private boolean f273123J = false;

    /* renamed from: K */
    private boolean f273124K = false;

    /* renamed from: f */
    public final C83581al f273125f;

    /* renamed from: g */
    public final C22871g f273126g;

    /* renamed from: h */
    public final C22871g f273127h;

    /* renamed from: i */
    public final C21370a f273128i;

    /* renamed from: j */
    public final C86124t f273129j;

    /* renamed from: k */
    public final C97823a f273130k;

    /* renamed from: l */
    public final C118426bs f273131l;

    /* renamed from: m */
    public final C118366g f273132m;

    /* renamed from: n */
    public final C118451i f273133n;

    /* renamed from: o */
    public final C18930j f273134o;

    /* renamed from: p */
    public final C118345d f273135p;

    /* renamed from: q */
    public final C118356e f273136q;

    /* renamed from: r */
    public final C83725a f273137r;

    /* renamed from: s */
    public final C118435k f273138s;

    /* renamed from: t */
    public final C91022f f273139t;

    /* renamed from: u */
    public final C118449y f273140u;

    /* renamed from: v */
    public final C124100bz f273141v;

    /* renamed from: w */
    public final C18926f f273142w;

    /* renamed from: x */
    public final ConcurrentHashMap f273143x = new ConcurrentHashMap();

    /* renamed from: y */
    public final ConcurrentHashMap f273144y = new ConcurrentHashMap();

    public C97811bv(C83581al alVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C21370a aVar, C86124t tVar, Query query, C97823a aVar2, C118426bs bsVar, C118366g gVar4, C118451i iVar, C58833ax axVar, C18930j jVar, C118346e eVar, C118357f fVar, C110560t tVar2, C118561t tVar3, C58833ax axVar2, C58833ax axVar3, C85810bb bbVar, C118435k kVar, C91022f fVar2, C118449y yVar, C124100bz bzVar, C18926f fVar3) {
        C118346e eVar2 = eVar;
        this.f273125f = alVar;
        this.f273115B = gVar;
        this.f273126g = gVar2;
        this.f273127h = gVar3;
        this.f273128i = aVar;
        this.f273129j = tVar;
        this.f273116C = query.mo84309au().mo84272aI(amo.ANDROID_AUTO_PROJECTED);
        this.f273130k = aVar2;
        this.f273131l = bsVar;
        this.f273132m = gVar4;
        this.f273133n = iVar;
        this.f273117D = axVar;
        this.f273134o = jVar;
        C86124t tVar4 = (C86124t) eVar2.f328493a.mo17428b();
        tVar4.getClass();
        C22871g gVar5 = (C22871g) eVar2.f328494b.mo17428b();
        gVar5.getClass();
        C58833ax axVar4 = (C58833ax) eVar2.f328495c.mo17428b();
        axVar4.getClass();
        C68214a a = C68219e.m98518a(((C68226l) eVar2.f328496d).f184585a);
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) eVar2.f328497e).f184585a);
        a2.getClass();
        this.f273135p = new C118345d(tVar4, gVar5, axVar4, a, a2);
        this.f273136q = fVar.mo103678a();
        this.f273137r = tVar2.mo98766a(C39226b.TAG_CLASSIC_ASSISTANT_PCP_CLASSIC);
        this.f273119F = tVar3;
        this.f273120G = axVar2;
        this.f273121H = axVar3;
        this.f273118E = new CopyOnWriteArraySet();
        this.f273122I = bbVar;
        this.f273138s = kVar;
        this.f273139t = fVar2;
        this.f273140u = yVar;
        this.f273141v = bzVar;
        this.f273142w = fVar3;
        mo90819i("Init SearchServiceClient", new C97805bp(this));
    }

    /* renamed from: a */
    public final C60870cx mo90813a(C53306j jVar, List list) {
        return mo90821k(jVar, list, !C118426bs.f328681c.contains(jVar), false, C123777f.f341922a);
    }

    /* renamed from: b */
    public final C60870cx mo90814b(C53306j jVar, List list, boolean z) {
        return mo90821k(jVar, list, z, false, C123777f.f341922a);
    }

    /* renamed from: e */
    public final C60870cx mo90815e(C53306j jVar, List list, boolean z, C123777f fVar) {
        return mo90821k(jVar, list, z, false, fVar);
    }

    /* renamed from: f */
    public final void mo90816f(C123598n nVar) {
        this.f273118E.add(nVar);
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.OPA_ZERO_STATE_RESPONSE) {
            C62940bt btVar = C88142qs.f238266a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (!uoVar.f169962ag.mo58857o(r0.f169971d)) {
                C59104x d = f273109a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                ((C59052c) ((C59052c) d).mo56372aa(30287)).mo56386p("#onServiceEvent(): event is missing OpaZeroStateResponseEventData.");
                return;
            }
            try {
                C53422nh nhVar = (C53422nh) C62942bv.parseFrom((C62942bv) C53422nh.f140182m, ((C88144qu) serviceEventData.mo81918e(C88142qs.f238266a)).f238270b, C62921ba.m95368a());
                nhVar.getClass();
                C53306j a2 = C53306j.m86809a(nhVar.f140193j);
                if (a2 == null) {
                    a2 = C53306j.UNKNOWNN;
                }
                C58487gw c = this.f273131l.mo103692c(nhVar);
                Iterator it = this.f273118E.iterator();
                while (it.hasNext()) {
                    C123598n nVar = (C123598n) it.next();
                    if (nVar.mo22862a() == a2) {
                        nVar.mo22864g();
                    }
                }
                C58485gu b = C118426bs.f328679a.mo55277g(a2);
                int size = b.size();
                int i = 0;
                while (i < size) {
                    Integer num = (Integer) b.get(i);
                    SettableFuture settableFuture = (SettableFuture) this.f273143x.remove(num);
                    C59071e eVar = f273109a;
                    C59104x b2 = eVar.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                    C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(30283);
                    int b3 = C123747bn.m203106b(num.intValue());
                    String a3 = C123747bn.m203105a(b3);
                    if (b3 != 0) {
                        cVar.mo56355H("#handleZeroStateResponse(): pending futures data type %s, null {%b}.", a3, settableFuture == null);
                        if (settableFuture != null && !settableFuture.isDone()) {
                            if (c.map.containsKey(num)) {
                                C59104x b4 = eVar.mo56224b();
                                b4.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                                C59052c cVar2 = (C59052c) ((C59052c) b4).mo56372aa(30285);
                                int b5 = C123747bn.m203106b(num.intValue());
                                String a4 = C123747bn.m203105a(b5);
                                if (b5 != 0) {
                                    cVar2.mo56389s("#handleZeroStateResponse(): data type %s SET pending futures.", a4);
                                    C118364f fVar = (C118364f) C118365g.f328542b.createBuilder();
                                    fVar.mo103679a(c.mo55277g(num));
                                    settableFuture.mo57356n(C58833ax.m90834k((C118365g) fVar.build()));
                                } else {
                                    throw null;
                                }
                            } else {
                                C59104x b6 = eVar.mo56224b();
                                b6.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                                C59052c cVar3 = (C59052c) ((C59052c) b6).mo56372aa(30284);
                                int b7 = C123747bn.m203106b(num.intValue());
                                String a5 = C123747bn.m203105a(b7);
                                if (b7 != 0) {
                                    cVar3.mo56389s("#handleZeroStateResponse(): data type %s NO pending futures.", a5);
                                    settableFuture.mo57356n(C58836b.f156633a);
                                } else {
                                    throw null;
                                }
                            }
                        }
                        i++;
                    } else {
                        throw null;
                    }
                }
            } catch (C62974ct e) {
                C59104x d2 = f273109a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(30286)).mo56389s("#onServiceEvent(): failed to parse ZeroStateClientResponse proto: %s", e);
            }
        } else {
            C59104x d3 = f273109a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
            C59052c cVar4 = (C59052c) ((C59052c) d3).mo56372aa(30294);
            C88244um a6 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a6 == null) {
                a6 = C88244um.ATTACH_WEBVIEW;
            }
            cVar4.mo56389s("Unhandled service event: %s", a6.name());
        }
    }

    /* renamed from: g */
    public final void mo90817g(C123598n nVar) {
        this.f273118E.remove(nVar);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C59104x b = f273109a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
        ((C59052c) ((C59052c) b).mo56372aa(30282)).mo56386p("on dump start");
        fVar.mo85291r("PCP.ImplV0 Dump");
    }

    /* renamed from: h */
    public final C60870cx mo90818h(C53306j jVar, List list, C123777f fVar) {
        return mo90821k(jVar, list, true, true, fVar);
    }

    /* renamed from: i */
    public final void mo90819i(String str, C22869e eVar) {
        if (!C22872h.m42744d(C0826b.class)) {
            this.f273115B.mo28212l(str, eVar);
        } else {
            eVar.run();
        }
    }

    /* renamed from: j */
    public final void mo90820j(C53306j jVar, C123777f fVar) {
        Object obj;
        int i;
        C53306j jVar2 = jVar;
        C123777f fVar2 = fVar;
        C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
        hpVar.copyOnWrite();
        C53271hs hsVar = (C53271hs) hpVar.instance;
        hsVar.f139663l = jVar2.f139793X;
        hsVar.f139652a |= 512;
        C53270hr hrVar = C53270hr.FOREGROUND;
        hpVar.copyOnWrite();
        C53271hs hsVar2 = (C53271hs) hpVar.instance;
        hsVar2.f139665n = hrVar.f139649g;
        hsVar2.f139652a |= 2048;
        C51098gh a = this.f273122I.mo79453a((C51447ia) null, jVar2 == C53306j.AUTO_PROJECTED ? this.f273116C : null, C58836b.f156633a);
        C59104x b = f273109a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
        ((C59052c) ((C59052c) b).mo56372aa(30296)).mo56389s("Sticky app %s", a);
        C51444hy hyVar = (C51444hy) C51450id.f133992h.createBuilder();
        if (a != null) {
            hyVar.copyOnWrite();
            C51450id idVar = (C51450id) hyVar.instance;
            idVar.f133997d = a;
            idVar.f133994a |= 2;
        }
        if (this.f273129j.mo79746e(C90069du.f249734l)) {
            C118426bs bsVar = this.f273131l;
            C58485gu c = bsVar.f328690k.mo24219c(C18929i.MOSTLY_USED, C118426bs.m196610e(jVar, fVar));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C62940bt r4 = C62942bv.checkIsLite(C123726at.f341744i);
            fVar2.mo58887l(r4);
            if (fVar2.f169962ag.mo58857o(r4.f169971d)) {
                C62940bt r42 = C62942bv.checkIsLite(C123726at.f341744i);
                fVar2.mo58887l(r42);
                Object l = fVar2.f169962ag.mo58854l(r42.f169971d);
                if (l == null) {
                    obj = r42.f169969b;
                } else {
                    obj = r42.mo58889c(l);
                }
                C123726at atVar = (C123726at) obj;
                int size = c.size();
                int i2 = 0;
                while (i2 < size) {
                    ComponentName componentName = (ComponentName) c.get(i2);
                    Iterator it = atVar.f341747b.iterator();
                    while (true) {
                        i = i2 + 1;
                        if (!it.hasNext()) {
                            break;
                        } else if (((C123723aq) it.next()).f341740b.equals(componentName.getPackageName())) {
                            linkedHashSet.add(componentName);
                        }
                    }
                    i2 = i;
                }
            }
            ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6988)).mo56389s("#getFilteredMediaAppPackageNames() mostlyUsedMediaApps %s", c);
            ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6989)).mo56389s("#getFilteredMediaAppPackageNames() requestedMediaApps %s", linkedHashSet);
            hyVar.mo53616a((Iterable) Collection.EL.stream((List) Collection.EL.stream(bsVar.f328692m.mo24191b(c, linkedHashSet, jVar, fVar, true, BuildConfig.FLAVOR, false)).map(C118450z.f328783a).distinct().collect(Collectors.toList())).map(C97795bf.f273052a).collect(Collectors.toList()));
        }
        hpVar.copyOnWrite();
        C53271hs hsVar3 = (C53271hs) hpVar.instance;
        C51450id idVar2 = (C51450id) hyVar.build();
        idVar2.getClass();
        hsVar3.f139657f = idVar2;
        hsVar3.f139652a |= 16;
        C60870cx i3 = C60856cj.m92900i(C58836b.f156633a);
        if (this.f273129j.mo79746e(C90069du.f249730h) && C53306j.AUTO_EMBEDDED.equals(jVar2) && this.f273121H.mo56113h()) {
            i3 = ((C15814a) this.f273121H.mo56107c()).mo22573a(C15799i.f47030a);
        }
        C60856cj.m92911t(i3, C47810es.m84974n(new C97808bs(this, hpVar)), C60826bg.f164896a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: com.google.common.b.gu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo90821k(com.google.assistant.p3994s.p3995a.C53306j r20, java.util.List r21, boolean r22, boolean r23, com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f r24) {
        /*
            r19 = this;
            r12 = r19
            r13 = r20
            r0 = r21
            r14 = r22
            r7 = r23
            r6 = r24
            com.google.common.f.e r1 = f273109a
            com.google.common.f.x r2 = r1.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "PCP.ImplV0"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "getProactiveContent"
            r5 = 30274(0x7642, float:4.2423E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)
            com.google.common.b.ij r2 = com.google.android.apps.gsa.p8839t.p8847h.C118426bs.f328682d
            com.google.common.b.qy r2 = (com.google.common.p4522b.C58759qy) r2
            java.lang.Object r2 = r2.f156534a
            boolean r2 = r2.equals(r13)
            r15 = 1
            if (r2 != 0) goto L_0x0201
            com.google.common.b.ij r2 = com.google.android.apps.gsa.p8839t.p8847h.C118426bs.f328683e
            boolean r2 = java.util.Collections.disjoint(r0, r2)
            if (r2 != 0) goto L_0x0037
            goto L_0x0201
        L_0x0037:
            com.google.assistant.s.a.j r1 = com.google.assistant.p3994s.p3995a.C53306j.AUTO_EMBEDDED
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0102
            boolean r1 = r12.f273123J
            if (r1 != 0) goto L_0x00e4
            r12.f273123J = r15
            com.google.android.apps.gsa.tasks.t r1 = r12.f273119F
            com.google.android.apps.gsa.tasks.by r2 = com.google.android.apps.gsa.tasks.C118522by.PROACTIVE_CLIENT_PLATFORM_EMBEDDED_AUTO_REFRESH
            com.google.android.apps.gsa.tasks.ag r3 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.tasks.af r3 = (com.google.android.apps.gsa.tasks.C118471af) r3
            com.google.android.apps.gsa.search.core.i.t r4 = r12.f273129j
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247556jQ
            long r4 = r4.mo79743a(r5)
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.android.apps.gsa.tasks.ag r8 = (com.google.android.apps.gsa.tasks.C118472ag) r8
            int r9 = r8.f328821a
            r9 = r9 | r15
            r8.f328821a = r9
            r8.f328822b = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.gsa.tasks.ag r4 = (com.google.android.apps.gsa.tasks.C118472ag) r4
            int r5 = r4.f328821a
            r5 = r5 | 2
            r4.f328821a = r5
            r8 = 6000(0x1770, double:2.9644E-320)
            r4.f328823c = r8
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.gsa.tasks.ag r4 = (com.google.android.apps.gsa.tasks.C118472ag) r4
            r4.f328824d = r15
            int r5 = r4.f328821a
            r5 = r5 | 4
            r4.f328821a = r5
            com.google.android.apps.gsa.tasks.ak r4 = com.google.android.apps.gsa.tasks.C118476ak.f328838a
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.tasks.aj r4 = (com.google.android.apps.gsa.tasks.C118475aj) r4
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.p8839t.p8845f.C118359a.f328525a
            com.google.android.apps.gsa.t.f.c r8 = com.google.android.apps.gsa.p8839t.p8845f.C118361c.f328526e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.t.f.b r8 = (com.google.android.apps.gsa.p8839t.p8845f.C118360b) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.t.f.c r9 = (com.google.android.apps.gsa.p8839t.p8845f.C118361c) r9
            int r10 = r9.f328528a
            r10 = r10 | r15
            r9.f328528a = r10
            r9.f328529b = r15
            com.google.assistant.s.a.j r9 = com.google.assistant.p3994s.p3995a.C53306j.AUTO_EMBEDDED
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.apps.gsa.t.f.c r10 = (com.google.android.apps.gsa.p8839t.p8845f.C118361c) r10
            int r9 = r9.f139793X
            r10.f328530c = r9
            int r9 = r10.f328528a
            r9 = r9 | 2
            r10.f328528a = r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.apps.gsa.t.f.c r8 = (com.google.android.apps.gsa.p8839t.p8845f.C118361c) r8
            r4.mo58885m(r5, r8)
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.apps.gsa.tasks.ag r5 = (com.google.android.apps.gsa.tasks.C118472ag) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.apps.gsa.tasks.ak r4 = (com.google.android.apps.gsa.tasks.C118476ak) r4
            r4.getClass()
            r5.f328827g = r4
            int r4 = r5.f328821a
            r4 = r4 | 32
            r5.f328821a = r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.gsa.tasks.ag r3 = (com.google.android.apps.gsa.tasks.C118472ag) r3
            r1.mo103754e(r2, r3)
        L_0x00e4:
            boolean r1 = r12.f273124K
            if (r1 != 0) goto L_0x0102
            r12.f273124K = r15
            com.google.common.base.ax r1 = r12.f273120G
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0102
            com.google.common.base.ax r1 = r12.f273120G
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.assistant.auto.tng.suggestions.b.g.b.a r1 = (com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15939a) r1
            com.google.android.apps.gsa.staticplugins.ci.bu r2 = new com.google.android.apps.gsa.staticplugins.ci.bu
            r2.<init>(r12)
            r1.mo22619a(r2)
        L_0x0102:
            com.google.android.apps.gsa.t.h.k r1 = r12.f273138s
            com.google.common.base.ax r16 = r1.mo103698a()
            com.google.common.b.gw r1 = com.google.android.apps.gsa.p8839t.p8847h.C118426bs.f328679a
            com.google.common.b.gu r1 = r1.mo55277g(r13)
            if (r0 == 0) goto L_0x0130
            boolean r2 = r21.isEmpty()
            if (r2 == 0) goto L_0x0117
            goto L_0x0130
        L_0x0117:
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            p3186j$.util.Objects.requireNonNull(r21)
            com.google.android.apps.gsa.t.h.as r2 = new com.google.android.apps.gsa.t.h.as
            r2.<init>(r0)
            j$.util.stream.Stream r0 = r1.filter(r2)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r1)
            r1 = r0
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1
        L_0x0130:
            r11 = r1
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x0144
            com.google.android.apps.gsa.t.h.k r1 = r12.f273138s
            com.google.common.base.ax r1 = r1.mo103698a()
            goto L_0x0146
        L_0x0144:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x0146:
            r8 = r1
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x0154
            com.google.android.apps.gsa.t.h.k r0 = r12.f273138s
            com.google.common.base.ax r0 = r0.mo103698a()
            goto L_0x0156
        L_0x0154:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0156:
            r9 = r0
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x016a
            com.google.android.apps.gsa.t.h.k r1 = r12.f273138s
            com.google.common.base.ax r1 = r1.mo103698a()
            goto L_0x016c
        L_0x016a:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x016c:
            r10 = r1
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x017a
            com.google.android.apps.gsa.t.h.k r0 = r12.f273138s
            com.google.common.base.ax r0 = r0.mo103698a()
            goto L_0x017c
        L_0x017a:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x017c:
            r17 = r0
            j$.util.concurrent.ConcurrentHashMap r5 = new j$.util.concurrent.ConcurrentHashMap
            r5.<init>()
            com.google.android.libraries.gsa.k.g r4 = r12.f273126g
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r11)
            com.google.android.apps.gsa.staticplugins.ci.bm r1 = new com.google.android.apps.gsa.staticplugins.ci.bm
            r1.<init>(r12, r13, r7, r5)
            j$.util.stream.Stream r0 = r0.map(r1)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92906o(r0)
            com.google.android.apps.gsa.staticplugins.ci.bn r2 = new com.google.android.apps.gsa.staticplugins.ci.bn
            r0 = r2
            r1 = r19
            r15 = r2
            r2 = r20
            r13 = r3
            r3 = r11
            r14 = r4
            r4 = r22
            r6 = r24
            r7 = r23
            r18 = r11
            r11 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "Update cacheAvailabilityMap"
            com.google.common.util.concurrent.cx r6 = r14.mo28210j(r13, r0, r15)
            com.google.android.apps.gsa.t.h.k r0 = r12.f273138s
            j.a.i.b.a.aq r1 = p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq.f190077a
            com.google.protobuf.bn r1 = r1.createBuilder()
            j.a.i.b.a.ap r1 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap) r1
            com.google.protobuf.bt r2 = p5535j.p5536a.p5562i.p5568b.p5569a.C71209as.f190081h
            j.a.i.b.a.as r3 = p5535j.p5536a.p5562i.p5568b.p5569a.C71209as.f190080g
            com.google.protobuf.bn r3 = r3.createBuilder()
            j.a.i.b.a.ar r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar) r3
            r4 = r18
            r3.mo62656a(r4)
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            j.a.i.b.a.as r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71209as) r4
            int r5 = r4.f190083a
            r7 = 1
            r5 = r5 | r7
            r4.f190083a = r5
            r5 = r22
            r4.f190085c = r5
            com.google.protobuf.bv r3 = r3.build()
            j.a.i.b.a.as r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71209as) r3
            r1.mo58885m(r2, r3)
            com.google.protobuf.bv r1 = r1.build()
            r3 = r1
            j.a.i.b.a.aq r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq) r3
            com.google.android.libraries.performance.primes.au r5 = f273114z
            r1 = r6
            r2 = r16
            r4 = r20
            r0.mo103699b(r1, r2, r3, r4, r5)
            return r6
        L_0x0201:
            r5 = r14
            com.google.common.f.x r2 = r1.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "PCP V1 flow is enabled."
            r8 = 30275(0x7643, float:4.2424E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r8)).mo56386p(r3)
            com.google.common.base.ax r2 = r12.f273117D
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0289
            com.google.android.apps.gsa.t.h.k r1 = r12.f273138s
            com.google.common.base.ax r2 = r1.mo103698a()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            if (r7 == 0) goto L_0x023b
            com.google.common.base.ax r0 = r12.f273117D
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.t.c.a r0 = (com.google.android.apps.gsa.p8839t.p8842c.C118348a) r0
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r1)
            r4 = 0
            r7 = r20
            com.google.common.util.concurrent.cx r0 = r0.mo90804b(r7, r3, r6, r4)
            goto L_0x0249
        L_0x023b:
            r7 = r20
            com.google.common.base.ax r0 = r12.f273117D
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.t.c.a r0 = (com.google.android.apps.gsa.p8839t.p8842c.C118348a) r0
            com.google.common.util.concurrent.cx r0 = r0.mo90805c(r7, r1, r6, r5)
        L_0x0249:
            r6 = r0
            com.google.android.apps.gsa.t.h.k r0 = r12.f273138s
            j.a.i.b.a.aq r3 = p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq.f190077a
            com.google.protobuf.bn r3 = r3.createBuilder()
            j.a.i.b.a.ap r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap) r3
            com.google.protobuf.bt r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71209as.f190081h
            j.a.i.b.a.as r8 = p5535j.p5536a.p5562i.p5568b.p5569a.C71209as.f190080g
            com.google.protobuf.bn r8 = r8.createBuilder()
            j.a.i.b.a.ar r8 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar) r8
            r8.mo62656a(r1)
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            j.a.i.b.a.as r1 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71209as) r1
            int r9 = r1.f190083a
            r10 = 1
            r9 = r9 | r10
            r1.f190083a = r9
            r1.f190085c = r5
            com.google.protobuf.bv r1 = r8.build()
            j.a.i.b.a.as r1 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71209as) r1
            r3.mo58885m(r4, r1)
            com.google.protobuf.bv r1 = r3.build()
            r3 = r1
            j.a.i.b.a.aq r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq) r3
            com.google.android.libraries.performance.primes.au r5 = f273108A
            r1 = r6
            r4 = r20
            r0.mo103699b(r1, r2, r3, r4, r5)
            return r6
        L_0x0289:
            com.google.common.f.x r0 = r1.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Missing PcpTngEntryPoint binding."
            r2 = 30276(0x7644, float:4.2426E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.search.assistant.platform.pcp.f.bm r0 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm.f341818b
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7666ci.C97811bv.mo90821k(com.google.assistant.s.a.j, java.util.List, boolean, boolean, com.google.android.apps.search.assistant.platform.pcp.f.f):com.google.common.util.concurrent.cx");
    }
}
