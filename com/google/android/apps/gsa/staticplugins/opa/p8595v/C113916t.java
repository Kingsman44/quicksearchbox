package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.shared.p6345h.C81323s;
import com.google.android.apps.gsa.nga.shared.p6407v.C83278h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82338bm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82492he;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82567jz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82569ka;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.ShowVoiceActionsEventParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87760co;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87763cr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87765ct;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87767cv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88308ww;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88310wy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88351yl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88353yn;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.speech.audio.p7263a.C92148j;
import com.google.android.apps.gsa.speech.audio.p7263a.C92154p;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106284l;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107487m;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107554c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107508ab;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107510ad;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107528g;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107530i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59693ch;
import com.google.common.p4552o.C59694ci;
import com.google.common.p4552o.C59697cl;
import com.google.common.p4552o.C59698cm;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import dagger.C68214a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.t */
/* compiled from: PG */
public final class C113916t implements C87682aj, C90991b {

    /* renamed from: a */
    public static final C59071e f315389a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.v.t");

    /* renamed from: A */
    private long f315390A;

    /* renamed from: B */
    private boolean f315391B;

    /* renamed from: b */
    public final C21370a f315392b;

    /* renamed from: c */
    public final C86124t f315393c;

    /* renamed from: d */
    public final Map f315394d;

    /* renamed from: e */
    public C58833ax f315395e;

    /* renamed from: f */
    public C58833ax f315396f;

    /* renamed from: g */
    public final C113920x f315397g;

    /* renamed from: h */
    public final C68214a f315398h;

    /* renamed from: i */
    public C58833ax f315399i;

    /* renamed from: j */
    public boolean f315400j;

    /* renamed from: k */
    public boolean f315401k;

    /* renamed from: l */
    public e f315402l;

    /* renamed from: m */
    private final C68214a f315403m;

    /* renamed from: n */
    private final C22871g f315404n;

    /* renamed from: o */
    private final C22871g f315405o;

    /* renamed from: p */
    private final Queue f315406p = new C58781rt(new C58425eo(10));

    /* renamed from: q */
    private final C107698i f315407q;

    /* renamed from: r */
    private final C58833ax f315408r;

    /* renamed from: s */
    private final C58833ax f315409s;

    /* renamed from: t */
    private final C68214a f315410t;

    /* renamed from: u */
    private final C58833ax f315411u;

    /* renamed from: v */
    private C58833ax f315412v;

    /* renamed from: w */
    private final C113898b f315413w;

    /* renamed from: x */
    private final u f315414x;

    /* renamed from: y */
    private final C58833ax f315415y;

    /* renamed from: z */
    private long f315416z;

    public C113916t(C68214a aVar, C107710u uVar, C107698i iVar, C22871g gVar, C22871g gVar2, C21370a aVar2, C86124t tVar, C58833ax axVar, C58833ax axVar2, C68214a aVar3, C113898b bVar, u uVar2, C58833ax axVar3, C113920x xVar, C68214a aVar4, C58833ax axVar4) {
        this.f315403m = aVar;
        this.f315404n = gVar;
        this.f315405o = gVar2;
        this.f315410t = aVar3;
        this.f315413w = bVar;
        this.f315414x = uVar2;
        this.f315392b = aVar2;
        this.f315393c = tVar;
        C58836b bVar2 = C58836b.f156633a;
        this.f315395e = bVar2;
        this.f315396f = bVar2;
        this.f315399i = bVar2;
        this.f315412v = bVar2;
        this.f315394d = new HashMap();
        this.f315408r = axVar;
        this.f315409s = axVar2;
        this.f315407q = iVar;
        this.f315411u = axVar3;
        this.f315397g = xVar;
        this.f315402l = e.a;
        this.f315398h = aVar4;
        this.f315415y = axVar4;
        C107710u uVar3 = uVar;
        uVar.mo96220c(this, C88244um.SHOW_RECOGNITION_STATE, C88244um.CONVERSATION_SURFACE_EVENT, C88244um.SHOW_VOICE_ACTIONS, C88244um.TTS_PLAYBACK_DONE, C88244um.ASSISTANT_REQUEST_ID, C88244um.OPA_SESSION_SERVICE_EVENT, C88244um.CARD_DECISION_CONTAINING_TTS, C88244um.SET_FINAL_RECOGNIZED_TEXT);
    }

    /* renamed from: p */
    private final void m188598p(C89849ae aeVar) {
        C58836b bVar = C58836b.f156633a;
        m188599q(aeVar, bVar, bVar, bVar, false);
    }

    /* renamed from: q */
    private final void m188599q(C89849ae aeVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, boolean z) {
        long j;
        C60870cx cxVar;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        if (this.f315395e.mo56113h()) {
            fVar.mo83701c("rId", Long.toString(((Query) this.f315395e.mo56107c()).f252749G));
        }
        if (this.f315396f.mo56113h()) {
            fVar.mo83701c("assistSessionId", Long.toString(((Long) this.f315396f.mo56107c()).longValue()));
        }
        if (axVar.mo56113h()) {
            j = ((Long) axVar.mo56107c()).longValue();
        } else {
            j = this.f315392b.mo26872d();
        }
        fVar.f246204d = j;
        this.f315406p.add(new C113912p(System.currentTimeMillis(), aeVar, this.f315395e.mo56106b(C113901e.f315358a), this.f315396f));
        if (!this.f315395e.mo56113h() && !axVar2.mo56113h() && !z) {
            ((C89859i) this.f315403m.mo27525b()).mo74236a(fVar.mo83699a());
        } else if (this.f315395e.mo56113h()) {
            Query query = (Query) this.f315395e.mo56107c();
            if (this.f315415y.mo56113h()) {
                cxVar = C60922j.m93044g(((C81323s) this.f315415y.mo56107c()).mo74936a(), new C113909m(this, query), C60826bg.f164896a);
            } else {
                cxVar = C60856cj.m92900i((C59582aj) C59687cb.f160034bf.createBuilder());
            }
            C60870cx cxVar2 = cxVar;
            C113911o oVar = new C113911o(this, axVar2, axVar3, z, fVar);
            C60856cj.m92911t(cxVar2, C47810es.m84974n(oVar), C60826bg.f164896a);
        } else {
            mo100761e(axVar2, axVar3, z, fVar, (C59582aj) C59687cb.f160034bf.createBuilder());
        }
    }

    /* renamed from: r */
    private final void m188600r() {
        m188601s(TimeUnit.SECONDS.toMillis(this.f315393c.mo79743a(C90014bt.f247293eS)));
    }

    /* renamed from: s */
    private final void m188601s(long j) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f315412v.mo56113h()) {
            C82567jz c = C82569ka.m131549c();
            ((C82338bm) c).f224930b = "timeout_overwrite";
            mo100768l(c.mo75772a());
        }
        this.f315412v = C58833ax.m90834k(new C113897a(this.f315392b.mo26870b(), this.f315404n.mo28208h("response-timed-out", j, new C113900d(this))));
    }

    /* renamed from: a */
    public final Boolean mo100759a() {
        boolean z = false;
        if (this.f315395e.mo56113h() && ((Query) this.f315395e.mo56107c()).mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final void mo100760b() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f315412v.mo56113h()) {
            ((C113915s) this.f315412v.mo56107c()).mo100753b().cancel(false);
        }
        this.f315412v = C58836b.f156633a;
    }

    /* renamed from: e */
    public final void mo100761e(C58833ax axVar, C58833ax axVar2, boolean z, C89856f fVar, C59582aj ajVar) {
        if (axVar.mo56113h()) {
            ajVar.copyOnWrite();
            C59687cb cbVar = C59687cb.f160034bf;
            ((C59687cb) ajVar.instance).f160125f = C59687cb.emptyProtobufList();
            ajVar.mo57006c((Iterable) axVar.mo56107c());
        }
        if (axVar2.mo56113h()) {
            C59753ej ejVar = (C59753ej) axVar2.mo56107c();
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            C59687cb cbVar3 = C59687cb.f160034bf;
            ejVar.getClass();
            cbVar2.f160126g = ejVar;
            cbVar2.f160062a |= 2;
        }
        if (z && this.f315408r.mo56113h()) {
            if (((C74714bo) this.f315408r.mo56107c()).mo71081c()) {
                ajVar.copyOnWrite();
                C59687cb cbVar4 = (C59687cb) ajVar.instance;
                C59687cb cbVar5 = C59687cb.f160034bf;
                cbVar4.f160115b |= 4194304;
                cbVar4.f160059X = true;
            }
            if (this.f315409s.mo56113h()) {
                C48420g b = ((C83278h) this.f315409s.mo56107c()).mo75573b();
                ajVar.copyOnWrite();
                C59687cb cbVar6 = (C59687cb) ajVar.instance;
                C59687cb cbVar7 = C59687cb.f160034bf;
                b.getClass();
                cbVar6.f160060Y = b;
                cbVar6.f160115b |= 8388608;
            }
        }
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f315403m.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: f */
    public final void mo100762f() {
        if (this.f315416z > 0) {
            C89849ae aeVar = C89849ae.OPA_ANDROID_LAST_HIDE_SUGGESTION_CAROUSEL;
            C58833ax k = C58833ax.m90834k(Long.valueOf(this.f315416z));
            C58836b bVar = C58836b.f156633a;
            m188599q(aeVar, k, bVar, bVar, false);
        }
        if (this.f315390A > 0) {
            C89849ae aeVar2 = C89849ae.OPA_ANDROID_LAST_SHOW_SUGGESTION_CAROUSEL;
            C58833ax k2 = C58833ax.m90834k(Long.valueOf(this.f315390A));
            C58836b bVar2 = C58836b.f156633a;
            m188599q(aeVar2, k2, bVar2, bVar2, false);
        }
        this.f315391B = true;
        this.f315416z = 0;
        this.f315390A = 0;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        ParcelableVoiceAction parcelableVoiceAction;
        Object obj;
        Object obj2;
        C89849ae aeVar;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        C58976aa aaVar = C58975e.f156826a;
        C89849ae aeVar2 = C89849ae.UNKNOWN_EVENT;
        C113913q qVar = C113913q.ACTION_SHOWED;
        int ordinal = a.ordinal();
        if (ordinal != 31) {
            if (ordinal == 44) {
                mo100763g();
            } else if (ordinal != 46) {
                int i = 1;
                if (ordinal != 54) {
                    if (ordinal == 112) {
                        C62940bt btVar = C107505a.f299120a;
                        C88246uo uoVar = serviceEventData.f236959a;
                        C62940bt r1 = C62942bv.checkIsLite(btVar);
                        uoVar.mo58887l(r1);
                        if (!uoVar.f169962ag.mo58857o(r1.f169971d)) {
                            C59104x d = f315389a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "QueryEndStateTracker");
                            ((C59052c) ((C59052c) d).mo56372aa(24319)).mo56387q("onServiceEvent: %s missing OpaSessionServiceEvent extension", a.f238695cJ);
                            return;
                        }
                        C107556e eVar = (C107556e) serviceEventData.mo81918e(C107505a.f299120a);
                        int a2 = C107554c.m178398a(eVar.f299213b);
                        if (a2 != 0) {
                            i = a2;
                        }
                        int i2 = i - 1;
                        if (i2 == 5) {
                            C62940bt r0 = C62942bv.checkIsLite(C107508ab.f299127a);
                            eVar.mo58887l(r0);
                            Object l = eVar.f169962ag.mo58854l(r0.f169971d);
                            if (l == null) {
                                obj = r0.f169969b;
                            } else {
                                obj = r0.mo58889c(l);
                            }
                            C107510ad adVar = (C107510ad) obj;
                            C59753ej ejVar = adVar.f299131b;
                            if (ejVar == null) {
                                ejVar = C59753ej.f161449e;
                            }
                            if (ejVar.f161452b != 524292) {
                                C89849ae a3 = this.f315413w.mo100757a(adVar);
                                C58836b bVar = C58836b.f156633a;
                                C58833ax k = C58833ax.m90834k(adVar.f299133d);
                                C59753ej ejVar2 = adVar.f299131b;
                                if (ejVar2 == null) {
                                    ejVar2 = C59753ej.f161449e;
                                }
                                mo100764h(a3, bVar, k, C58833ax.m90834k(ejVar2));
                            }
                        } else if (i2 == 6) {
                            C62940bt r02 = C62942bv.checkIsLite(C107528g.f299162a);
                            eVar.mo58887l(r02);
                            if (eVar.f169962ag.mo58857o(r02.f169971d)) {
                                C62940bt r03 = C62942bv.checkIsLite(C107528g.f299162a);
                                eVar.mo58887l(r03);
                                Object l2 = eVar.f169962ag.mo58854l(r03.f169971d);
                                if (l2 == null) {
                                    obj2 = r03.f169969b;
                                } else {
                                    obj2 = r03.mo58889c(l2);
                                }
                                C89849ae aeVar3 = C89849ae.OPA_ENDSTATE_CANCEL_NEW_HOTWORD;
                                C58833ax k2 = C58833ax.m90834k(Long.valueOf(((C107530i) obj2).f299165a - 1));
                                C58836b bVar2 = C58836b.f156633a;
                                mo100764h(aeVar3, k2, bVar2, bVar2);
                            }
                        } else if (i2 == 7) {
                            C89849ae aeVar4 = C89849ae.OPA_ENDSTATE_SUCCESS;
                            C58836b bVar3 = C58836b.f156633a;
                            mo100764h(aeVar4, bVar3, bVar3, bVar3);
                            m188598p(C89849ae.OPA_FOLLOW_ON_QUERY_COMMIT_ACTION_V2);
                        } else if (i2 == 8) {
                            this.f315394d.put(C113913q.TTS_RECEIVED, C58836b.f156633a);
                        } else if (i2 == 10) {
                            C89849ae aeVar5 = C89849ae.OPA_ENDSTATE_NO_SPEECH_DETECTED;
                            C58836b bVar4 = C58836b.f156633a;
                            mo100764h(aeVar5, bVar4, bVar4, bVar4);
                        }
                    } else if (ordinal == 141) {
                        this.f315394d.put(C113913q.TTS_RECEIVED, C58836b.f156633a);
                    } else if (ordinal == 72) {
                        C87768cw cwVar = (C87768cw) serviceEventData.mo81918e(C87760co.f237522a);
                        if (this.f315394d.containsKey(C113913q.QUERY_TRACKING_STARTED)) {
                            int a4 = C87765ct.m142765a(cwVar.f237532e);
                            if (a4 == 0) {
                                a4 = 1;
                            }
                            int i3 = a4 - 1;
                            if (i3 == 1) {
                                this.f315394d.put(C113913q.DELTA_RECEIVED, C58836b.f156633a);
                                C63088z zVar = cwVar.f237529b;
                                if (this.f315393c.mo79746e(C90014bt.f247316ep)) {
                                    try {
                                        if (((C51809dy) C62942bv.parseFrom((C62942bv) C51809dy.f135933f, zVar, C62921ba.m95368a())).f135936b.equals("device.FETCH_ASSIST_DATA")) {
                                            m188598p(C89849ae.FAD_CLIENT_OP_RECEIVED);
                                        }
                                    } catch (C62974ct unused) {
                                    }
                                }
                                m188598p(C89849ae.CONVERSATION_DELTA_RECEIVED);
                            } else if (i3 == 2) {
                                int a5 = C87767cv.m142766a(cwVar.f237533f);
                                if (a5 == 0) {
                                    a5 = 1;
                                }
                                if (this.f315394d.containsKey(C113913q.DELTA_STREAM_RECEIVED)) {
                                    if (this.f315394d.containsKey(C113913q.DELTA_RECEIVED)) {
                                        m188598p(C89849ae.CONVERSATION_DELTA_PROCESSED);
                                    }
                                } else if (this.f315394d.containsKey(C113913q.DELTA_RECEIVED)) {
                                    int i4 = a5 - 1;
                                    if (i4 == 1) {
                                        C89849ae aeVar6 = C89849ae.OPA_ENDSTATE_SUCCESS;
                                        C58836b bVar5 = C58836b.f156633a;
                                        mo100764h(aeVar6, bVar5, bVar5, bVar5);
                                    } else if (i4 == 2) {
                                        C89849ae aeVar7 = C89849ae.OPA_ENDSTATE_CLIENTOP_EXECUTION_FAILURE;
                                        C58836b bVar6 = C58836b.f156633a;
                                        mo100764h(aeVar7, bVar6, bVar6, bVar6);
                                    } else if (i4 == 3) {
                                        if (this.f315394d.containsKey(C113913q.ACTIVITY_STOPPED)) {
                                            aeVar = C89849ae.OPA_ENDSTATE_CANCEL_ACTIVITY_STOP;
                                        } else {
                                            aeVar = C89849ae.OPA_ENDSTATE_CLIENTOP_EXECUTION_CANCELLED;
                                        }
                                        C58836b bVar7 = C58836b.f156633a;
                                        mo100764h(aeVar, bVar7, bVar7, bVar7);
                                    }
                                }
                            } else if (i3 == 4) {
                                C89849ae aeVar8 = C89849ae.OPA_ENDSTATE_SUCCESS;
                                C58836b bVar8 = C58836b.f156633a;
                                mo100764h(aeVar8, bVar8, bVar8, bVar8);
                                if (!this.f315408r.mo56113h() || !((C74714bo) this.f315408r.mo56107c()).mo71081c()) {
                                    m188598p(C89849ae.OPA_MIC_OPEN_FOR_FOLLOW_ON);
                                }
                            } else if (i3 == 5) {
                                int a6 = C87763cr.m142764a(cwVar.f237534g);
                                if (a6 != 0) {
                                    i = a6;
                                }
                                if (i == 2) {
                                    this.f315394d.put(C113913q.DELTA_STREAM_RECEIVED, C58836b.f156633a);
                                    long millis = TimeUnit.SECONDS.toMillis(this.f315393c.mo79743a(C90014bt.f247291eQ));
                                    if (this.f315412v.mo56113h()) {
                                        long b = this.f315392b.mo26870b() - ((C113915s) this.f315412v.mo56107c()).mo100752a();
                                        if (b < millis) {
                                            mo100760b();
                                            m188601s(millis - b);
                                            return;
                                        }
                                        return;
                                    }
                                    C59104x c = f315389a.mo56225c();
                                    c.mo56378ag(C58975e.f156826a, "QueryEndStateTracker");
                                    ((C59052c) ((C59052c) c).mo56372aa(24345)).mo56386p("Timeout logger task was not scheduled");
                                } else if (!this.f315393c.mo79746e(C90014bt.f247292eR) || this.f315394d.containsKey(C113913q.DELTA_STREAM_RECEIVED)) {
                                    int i5 = i - 1;
                                    if (i5 == 2) {
                                        C89849ae aeVar9 = C89849ae.OPA_ENDSTATE_CLIENTOP_EXECUTION_FAILURE;
                                        C58836b bVar9 = C58836b.f156633a;
                                        mo100764h(aeVar9, bVar9, bVar9, bVar9);
                                    } else if (i5 == 3) {
                                        C89849ae aeVar10 = C89849ae.OPA_ENDSTATE_CLIENTOP_EXECUTION_CANCELLED;
                                        C58836b bVar10 = C58836b.f156633a;
                                        mo100764h(aeVar10, bVar10, bVar10, bVar10);
                                    } else if (i5 == 4) {
                                        C89849ae aeVar11 = C89849ae.OPA_ENDSTATE_SUCCESS;
                                        C58836b bVar11 = C58836b.f156633a;
                                        mo100764h(aeVar11, bVar11, bVar11, bVar11);
                                    }
                                }
                            }
                        }
                    } else if (ordinal == 73 && serviceEventData.mo81913d(Query.class)) {
                        Query query = (Query) serviceEventData.mo81912b(Query.class);
                        if (!this.f315395e.mo56113h() || ((Query) this.f315395e.mo56107c()).f252749G != query.f252749G) {
                            if (query.mo84456dj()) {
                                m188598p(C89849ae.OPA_CANCEL_NEW_HOTWORD);
                                C89849ae aeVar12 = C89849ae.OPA_ENDSTATE_CANCEL_NEW_HOTWORD;
                                C58836b bVar12 = C58836b.f156633a;
                                mo100764h(aeVar12, bVar12, bVar12, bVar12);
                            } else if (query.mo84263a("android.opa.extra.TRIGGERED_BY") == 76) {
                                C89849ae aeVar13 = C89849ae.OPA_ENDSTATE_CANCEL_INLINE_REFINEMENT;
                                C58836b bVar13 = C58836b.f156633a;
                                mo100764h(aeVar13, bVar13, bVar13, bVar13);
                                m188598p(C89849ae.OPA_SRP_RESULT_CLICK_REFINE_SEARCH);
                            } else if (this.f315393c.mo79746e(C90014bt.f247187cS) && query.mo84263a("android.opa.extra.TRIGGERED_BY") == 58 && this.f315394d.containsKey(C113913q.QUERY_TRACKING_STARTED)) {
                                C58833ax k3 = C58833ax.m90834k(query);
                                this.f315399i = k3;
                                k3.mo56107c();
                                m188598p(C89849ae.OPA_QUERY_TRIGGERED_BY_CLIENT_OP_RESULT);
                                return;
                            } else if (query.mo84363bw("android.opa.extra.RECOGNITION_CANCEL_BY_NGA")) {
                                if (!this.f315395e.mo56113h() || !this.f315397g.mo100775d(((Query) this.f315395e.mo56107c()).f252749G, C113919w.HANDOVER_CONFIRMED)) {
                                    this.f315394d.clear();
                                    mo100760b();
                                    this.f315395e = C58833ax.m90834k(query);
                                    m188598p(C89849ae.OPA_RECOGNITION_CANCEL_BY_NGA);
                                    return;
                                }
                                if (this.f315397g.mo100775d(((Query) this.f315395e.mo56107c()).f252749G, C113919w.GRAPH_FAILURE)) {
                                    C89849ae aeVar14 = C89849ae.OPA_ENDSTATE_FAILURE_GRAPH_FAILURE;
                                    C58836b bVar14 = C58836b.f156633a;
                                    mo100764h(aeVar14, bVar14, bVar14, bVar14);
                                } else {
                                    C89849ae aeVar15 = C89849ae.OPA_ENDSTATE_CANCEL_UNKNOWN;
                                    C58836b bVar15 = C58836b.f156633a;
                                    mo100764h(aeVar15, bVar15, bVar15, bVar15);
                                }
                                this.f315395e = C58833ax.m90834k(query);
                                return;
                            } else if (this.f315393c.mo79746e(C90014bt.f247710mL) && this.f315394d.containsKey(C113913q.QUERY_TRACKING_STARTED) && query.mo84263a("android.opa.extra.TRIGGERED_BY") == 48) {
                                this.f315399i = C58833ax.m90834k(query);
                                return;
                            } else if (!mo100759a().booleanValue() || !query.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA") || !query.mo84364bx("android.opa.extra.ASSISTANT_RESPONSE")) {
                                m188598p(C89849ae.OPA_CANCEL_TRACKING_NEW_QUERY);
                                C89849ae aeVar16 = C89849ae.OPA_ENDSTATE_CANCEL_TRACKING_NEW_QUERY;
                                C58836b bVar16 = C58836b.f156633a;
                                mo100764h(aeVar16, bVar16, bVar16, bVar16);
                            } else {
                                this.f315394d.clear();
                                mo100760b();
                                m188598p(C89849ae.OPA_CONVERSATION_DELTA_FROM_NGA);
                            }
                            C58833ax k4 = C58833ax.m90834k(query);
                            this.f315395e = k4;
                            k4.mo56107c();
                            if (query.mo84385cR() && !query.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA")) {
                                return;
                            }
                            if (!this.f315401k || this.f315400j) {
                                mo100763g();
                                this.f315394d.put(C113913q.QUERY_TRACKING_STARTED, C58836b.f156633a);
                                long j = query.f252749G;
                            }
                        }
                    }
                } else if (this.f315394d.containsKey(C113913q.QUERY_TRACKING_STARTED)) {
                    C88310wy wyVar = (C88310wy) serviceEventData.mo81918e(C88308ww.f238829a);
                    if ((wyVar.f238832a & 1) != 0 && wyVar.f238833b >= 0) {
                        List list = ((ShowVoiceActionsEventParcelable) serviceEventData.mo81912b(ShowVoiceActionsEventParcelable.class)).f236961b;
                        int i6 = wyVar.f238833b;
                        if (i6 < list.size() && (parcelableVoiceAction = (ParcelableVoiceAction) list.get(i6)) != null && parcelableVoiceAction.f236008a != null) {
                            if (!this.f315394d.containsKey(C113913q.UI_UPDATED)) {
                                m188598p(C89849ae.OPA_RESPONSE_UI_FIRST_DISPLAYED);
                            }
                            if (this.f315394d.containsKey(C113913q.TTS_RECEIVED)) {
                                this.f315394d.put(C113913q.ACTION_SHOWED, C58836b.f156633a);
                                return;
                            }
                            C89849ae aeVar17 = C89849ae.OPA_ENDSTATE_SUCCESS;
                            C58836b bVar17 = C58836b.f156633a;
                            mo100764h(aeVar17, bVar17, bVar17, bVar17);
                        }
                    }
                }
            } else if (((C88304ws) serviceEventData.mo81918e(C88302wq.f238816a)).f238820b == 9 && this.f315394d.containsKey(C113913q.QUERY_TRACKING_STARTED) && !this.f315412v.mo56113h() && !mo100759a().booleanValue()) {
                m188600r();
            }
        } else if (!this.f315394d.containsKey(C113913q.QUERY_TRACKING_STARTED)) {
            C59104x c2 = f315389a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "QueryEndStateTracker");
            ((C59052c) ((C59052c) c2).mo56372aa(24348)).mo56386p("return processTtsPlayDone: query not tracking");
        } else if (this.f315394d.containsKey(C113913q.ACTION_SHOWED)) {
            C62940bt btVar2 = C88351yl.f238936a;
            C88246uo uoVar2 = serviceEventData.f236959a;
            C62940bt r04 = C62942bv.checkIsLite(btVar2);
            uoVar2.mo58887l(r04);
            if (!uoVar2.f169962ag.mo58857o(r04.f169971d)) {
                C59104x c3 = f315389a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "QueryEndStateTracker");
                ((C59052c) ((C59052c) c3).mo56372aa(24347)).mo56386p("processTtsPlayDone - Missing tts play done timestamp.");
                C89849ae aeVar18 = C89849ae.OPA_ENDSTATE_SUCCESS;
                C58836b bVar18 = C58836b.f156633a;
                mo100764h(aeVar18, bVar18, bVar18, bVar18);
                return;
            }
            C89849ae aeVar19 = C89849ae.OPA_ENDSTATE_SUCCESS;
            C58833ax k5 = C58833ax.m90834k(Long.valueOf(((C88353yn) serviceEventData.mo81918e(C88351yl.f238936a)).f238940b));
            C58836b bVar19 = C58836b.f156633a;
            mo100764h(aeVar19, k5, bVar19, bVar19);
        }
    }

    /* renamed from: g */
    public final void mo100763g() {
        if (mo100759a().booleanValue() && mo100771o()) {
            if (this.f315395e.mo56113h()) {
                Query query = (Query) this.f315395e.mo56107c();
                if (!this.f315393c.mo79746e(C90126fx.f251199eM)) {
                    C106284l lVar = (C106284l) C106286n.f296543f.createBuilder();
                    long j = query.f252749G;
                    lVar.copyOnWrite();
                    C106286n nVar = (C106286n) lVar.instance;
                    nVar.f296546b = 16;
                    nVar.f296547c = Long.valueOf(j);
                    C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
                    C107502c cVar = C107502c.NGA_CLIENT_EVENT;
                    dVar.copyOnWrite();
                    C107504e eVar = (C107504e) dVar.instance;
                    eVar.f299118b = cVar.f299114n;
                    eVar.f299117a |= 1;
                    dVar.mo58885m(C107487m.f299082a, (C106286n) lVar.build());
                    C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
                    jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
                    this.f315407q.mo96219b(jVar.mo82013a());
                }
                this.f315397g.mo100774c(query.f252749G, C113919w.HANDOVER_RECEIVED);
            }
            if (!this.f315412v.mo56113h()) {
                m188600r();
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("QueryEndStateTracker");
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Recent snapshots");
        synchronized (this.f315406p) {
            for (C113912p m : this.f315406p) {
                e.mo85286m(m);
            }
        }
    }

    /* renamed from: h */
    public final void mo100764h(C89849ae aeVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        char c;
        C89849ae aeVar2 = aeVar;
        if (this.f315394d.containsKey(C113913q.QUERY_TRACKING_STARTED)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f315395e.mo56111f();
            mo100760b();
            if (!this.f315391B) {
                mo100762f();
            }
            this.f315391B = false;
            String F = ((C86054o) this.f315410t.mo27525b()).mo79659F();
            if (this.f315393c.mo79746e(C90066dr.f249659B) && F != null && ((aeVar2 == C89849ae.OPA_ENDSTATE_CANCEL_BACK_PRESSED || aeVar2 == C89849ae.OPA_ENDSTATE_CANCEL_ACTIVITY_STOP || aeVar2 == C89849ae.OPA_ENDSTATE_CANCEL_EXPLICIT_CLOSE) && this.f315395e.mo56113h())) {
                long j = ((Query) this.f315395e.mo56107c()).f252749G;
                if (!this.f315397g.mo100775d(j, C113919w.END_STATE_LOGGED)) {
                    ((C86054o) this.f315410t.mo27525b()).mo79659F();
                    long d = this.f315392b.mo26872d();
                    C59697cl clVar = (C59697cl) C59698cm.f160165g.createBuilder();
                    clVar.copyOnWrite();
                    C59698cm cmVar = (C59698cm) clVar.instance;
                    cmVar.f160168b = 1;
                    cmVar.f160167a |= 1;
                    C89851ag agVar = C89851ag.OPA_VOICE_RELIABILITY;
                    clVar.copyOnWrite();
                    C59698cm cmVar2 = (C59698cm) clVar.instance;
                    cmVar2.f160170d = agVar.f246200fb;
                    cmVar2.f160167a |= 2;
                    C59693ch chVar = (C59693ch) C59694ci.f160157e.createBuilder();
                    int i = aeVar2.f245884YW;
                    chVar.copyOnWrite();
                    C59694ci ciVar = (C59694ci) chVar.instance;
                    ciVar.f160159a |= 1;
                    ciVar.f160160b = i;
                    chVar.copyOnWrite();
                    C59694ci ciVar2 = (C59694ci) chVar.instance;
                    ciVar2.f160159a |= 2;
                    ciVar2.f160161c = d;
                    clVar.copyOnWrite();
                    C59698cm cmVar3 = (C59698cm) clVar.instance;
                    C59694ci ciVar3 = (C59694ci) chVar.build();
                    ciVar3.getClass();
                    cmVar3.mo57046a();
                    cmVar3.f160169c.add(ciVar3);
                    clVar.copyOnWrite();
                    C59698cm cmVar4 = (C59698cm) clVar.instance;
                    cmVar4.f160172f = aeVar2.f245884YW;
                    cmVar4.f160167a |= 8;
                    Stream sorted = Collection.EL.stream(this.f315394d.entrySet()).map(new C113902f(d)).filter(C113903g.f315360a).map(C113904h.f315361a).sorted(Comparator.EL.reversed(Comparator.CC.comparingLong(C113905i.f315362a)));
                    Objects.requireNonNull(clVar);
                    sorted.forEach(new C113906j(clVar));
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    C59698cm cmVar5 = (C59698cm) clVar.build();
                    cmVar5.getClass();
                    ufVar.f164184bl = cmVar5;
                    ufVar.f164252g |= 65536;
                    long b = this.f315392b.mo26870b();
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    ufVar2.f164093a |= 1;
                    ufVar2.f164257l = b;
                    String b2 = C39191a.m68623b(j);
                    tzVar.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar.instance;
                    b2.getClass();
                    ufVar3.f164093a |= 4;
                    ufVar3.f164259n = b2;
                    String str = ((Query) this.f315395e.mo56107c()).f252770i;
                    tzVar.copyOnWrite();
                    C60555uf ufVar4 = (C60555uf) tzVar.instance;
                    str.getClass();
                    ufVar4.f164249d |= 64;
                    ufVar4.f164133an = str;
                    u uVar = this.f315414x;
                    C65753ak akVar = C65753ak.FOOTPRINTS_FALSE_ACCEPT;
                    C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
                    C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
                    gVar.copyOnWrite();
                    ((C63070h) gVar.instance).f170217a = "type.googleapis.com/wireless_android_play_playlog.GsaClientEvent";
                    C63088z byteString = ((C60555uf) tzVar.build()).toByteString();
                    gVar.copyOnWrite();
                    byteString.getClass();
                    ((C63070h) gVar.instance).f170218b = byteString;
                    ayVar.copyOnWrite();
                    C65768az azVar = (C65768az) ayVar.instance;
                    C63070h hVar = (C63070h) gVar.build();
                    hVar.getClass();
                    azVar.f178799e = hVar;
                    azVar.f178795a |= 8;
                    C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
                    long j2 = ((C60555uf) tzVar.instance).f164257l;
                    cVar.copyOnWrite();
                    C65139d dVar = (C65139d) cVar.instance;
                    dVar.f176309a |= 1;
                    dVar.f176310b = j2 * 1000;
                    ayVar.copyOnWrite();
                    C65768az azVar2 = (C65768az) ayVar.instance;
                    C65139d dVar2 = (C65139d) cVar.build();
                    dVar2.getClass();
                    azVar2.f178796b = dVar2;
                    azVar2.f178795a |= 1;
                    C90875ai.m148465b(C113907k.f315364a, uVar.d(F, akVar, (C65768az) ayVar.build(), true), this.f315405o, "Geller write logging").mo85223a(C113908l.f315365a);
                }
            }
            this.f315394d.clear();
            m188599q(aeVar, axVar, axVar2, axVar3, true);
            if (this.f315395e.mo56113h()) {
                if (this.f315415y.mo56113h()) {
                    C60856cj.m92911t(((C81323s) this.f315415y.mo56107c()).mo74936a(), C47810es.m84974n(new C113910n(this)), C60826bg.f164896a);
                }
                this.f315397g.mo100774c(((Query) this.f315395e.mo56107c()).f252749G, C113919w.END_STATE_LOGGED);
            }
            this.f315395e = C58836b.f156633a;
            if (this.f315399i.mo56113h()) {
                this.f315394d.put(C113913q.QUERY_TRACKING_STARTED, C58833ax.m90834k(Long.valueOf(this.f315392b.mo26872d())));
                this.f315395e = this.f315399i;
                this.f315399i = C58836b.f156633a;
                m188600r();
            }
            if (this.f315411u.mo56113h()) {
                C58833ax j3 = C58833ax.m90833j(C92154p.m151288a());
                if (j3.mo56113h()) {
                    C92148j jVar = (C92148j) j3.mo56107c();
                    if (!jVar.f256918a.isEnabled()) {
                        c = 1;
                    } else {
                        c = (jVar.f256918a.getProfileConnectionState(1) == 2 || jVar.f256918a.getProfileConnectionState(2) == 2) ? (char) 2 : 3;
                    }
                    C58833ax axVar4 = C58836b.f156633a;
                    C89849ae aeVar3 = C89849ae.UNKNOWN_EVENT;
                    C88244um umVar = C88244um.ATTACH_WEBVIEW;
                    int ordinal = aeVar.ordinal();
                    if (ordinal != 953) {
                        switch (ordinal) {
                            case 977:
                            case 978:
                            case 979:
                                axVar4 = C58833ax.m90834k(C113914r.FAILURE);
                                break;
                            default:
                                switch (ordinal) {
                                    case 992:
                                    case 993:
                                    case 994:
                                    case 995:
                                    case 996:
                                    case 997:
                                    case 998:
                                    case 999:
                                    case 1000:
                                        break;
                                }
                                axVar4 = C58833ax.m90834k(C113914r.FAILURE);
                                break;
                        }
                    } else {
                        axVar4 = C58833ax.m90834k(C113914r.SUCCESS);
                    }
                    if (axVar4.mo56113h()) {
                        C83305i iVar = (C83305i) this.f315411u.mo56107c();
                        String str2 = c != 1 ? c != 2 ? "ENABLED_NOT_CONNECTED" : "ENABLED_CONNECTED" : "DISABLED";
                        String name = ((C113914r) axVar4.mo56107c()).name();
                        if (name != null) {
                            iVar.mo75579d(new C82492he("REQUEST_STATUS_WITH_BLUETOOTH_STATE_COUNT", name, str2));
                            return;
                        }
                        throw new NullPointerException("Null status");
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo100765i() {
        C58976aa aaVar = C58975e.f156826a;
        C89849ae aeVar = C89849ae.OPA_ENDSTATE_CANCEL_MIC_TAP;
        C58836b bVar = C58836b.f156633a;
        mo100764h(aeVar, bVar, bVar, bVar);
    }

    /* renamed from: j */
    public final void mo100766j(Query query) {
        C89849ae aeVar;
        C89849ae aeVar2;
        C58976aa aaVar = C58975e.f156826a;
        int a = query.mo84263a("android.opa.extra.TRIGGERED_BY");
        if (!(a == 105 || a == 109 || a == 110)) {
            switch (a) {
                case 45:
                case 46:
                    aeVar2 = C89849ae.OPA_ENDSTATE_CANCEL_SUGGESTION_CHIP;
                    aeVar = C89849ae.OPA_SUGGESTION_CHIP_TAP;
                    break;
                case 47:
                    break;
                case 48:
                    aeVar2 = C89849ae.OPA_ENDSTATE_CANCEL_INLINE_REFINEMENT;
                    aeVar = C89849ae.OPA_INLINE_REFINEMENT;
                    break;
                default:
                    switch (a) {
                        case 75:
                        case 77:
                            aeVar2 = C89849ae.OPA_ENDSTATE_CANCEL_SUGGESTION;
                            aeVar = C89849ae.OPA_SUGGESTION_TAP;
                            break;
                        case 76:
                            aeVar2 = C89849ae.OPA_ENDSTATE_CANCEL_INLINE_REFINEMENT;
                            aeVar = C89849ae.OPA_SRP_RESULT_CLICK_REFINE_SEARCH;
                            break;
                        default:
                            aeVar2 = C89849ae.OPA_ENDSTATE_CANCEL_UNKNOWN;
                            aeVar = C89849ae.OPA_TEXT_QUERY_UNKNOWN;
                            break;
                    }
            }
        }
        aeVar2 = C89849ae.OPA_ENDSTATE_CANCEL_KEYBORAD;
        aeVar = C89849ae.OPA_TEXT_QUERY_SUBMIT;
        C58836b bVar = C58836b.f156633a;
        mo100764h(aeVar2, bVar, bVar, bVar);
        if (this.f315393c.mo79746e(C90014bt.f247244dW) || this.f315393c.mo79746e(C90014bt.f247710mL)) {
            this.f315395e = C58833ax.m90834k(query);
            this.f315394d.put(C113913q.QUERY_TRACKING_STARTED, C58836b.f156633a);
        }
        m188598p(aeVar);
        m188600r();
    }

    /* renamed from: k */
    public final void mo100767k() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f315394d.containsKey(C113913q.QUERY_TRACKING_STARTED)) {
            if (!this.f315394d.containsKey(C113913q.UI_UPDATED)) {
                m188598p(C89849ae.OPA_RESPONSE_UI_FIRST_DISPLAYED);
            }
            this.f315394d.put(C113913q.UI_UPDATED, C58836b.f156633a);
        }
    }

    /* renamed from: l */
    public final void mo100768l(C82569ka kaVar) {
        if (this.f315411u.mo56113h()) {
            ((C83305i) this.f315411u.mo56107c()).mo75579d(kaVar);
        }
    }

    /* renamed from: m */
    public final void mo100769m(boolean z) {
        this.f315416z = this.f315392b.mo26872d();
        if (z) {
            mo100762f();
        }
    }

    /* renamed from: n */
    public final void mo100770n(boolean z) {
        this.f315390A = this.f315392b.mo26872d();
        if (z) {
            mo100762f();
        }
    }

    /* renamed from: o */
    public final boolean mo100771o() {
        return ((Boolean) this.f315395e.mo56106b(new C113899c(this)).mo56109e(false)).booleanValue();
    }
}
