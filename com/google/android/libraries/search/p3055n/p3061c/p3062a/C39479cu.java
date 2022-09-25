package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.libraries.search.p3055n.C39264an;
import com.google.android.libraries.search.p3055n.C39274ax;
import com.google.android.libraries.search.p3055n.C39356be;
import com.google.android.libraries.search.p3055n.C39357bf;
import com.google.android.libraries.search.p3055n.C39677db;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.android.libraries.search.p3055n.C39818v;
import com.google.android.libraries.search.p3055n.C39820x;
import com.google.android.libraries.search.p3055n.p3061c.C39379a;
import com.google.android.libraries.search.p3055n.p3061c.C39645b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a.C39383c;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a.C39384d;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d.C39493h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39499d;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39501f;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39518a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3070g.C39533d;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39580br;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i.C39621m;
import com.google.android.libraries.search.p3055n.p3074d.C39675b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67091ks;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.cu */
/* compiled from: PG */
public final class C39479cu implements C39379a, C39644z, C39384d {

    /* renamed from: a */
    public static final C59071e f103938a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.cu");

    /* renamed from: A */
    public C58833ax f103939A;

    /* renamed from: B */
    public C58833ax f103940B;

    /* renamed from: C */
    public AccountId f103941C;

    /* renamed from: D */
    public C58833ax f103942D;

    /* renamed from: E */
    public C58833ax f103943E;

    /* renamed from: F */
    public C39390af f103944F;

    /* renamed from: G */
    public int f103945G;

    /* renamed from: H */
    private final Executor f103946H;

    /* renamed from: I */
    private final AtomicLong f103947I = new AtomicLong(0);

    /* renamed from: J */
    private C39390af f103948J;

    /* renamed from: K */
    private final C39493h f103949K;

    /* renamed from: L */
    private final C39675b f103950L;

    /* renamed from: b */
    public final C39645b f103951b;

    /* renamed from: c */
    public final C39407aw f103952c;

    /* renamed from: d */
    public final Executor f103953d;

    /* renamed from: e */
    public final ScheduledExecutorService f103954e;

    /* renamed from: f */
    public final C47632e f103955f;

    /* renamed from: g */
    public final Context f103956g;

    /* renamed from: h */
    public final C39501f f103957h;

    /* renamed from: i */
    public final C39385aa f103958i;

    /* renamed from: j */
    public final C39621m f103959j;

    /* renamed from: k */
    public final boolean f103960k;

    /* renamed from: l */
    public final C39387ac f103961l;

    /* renamed from: m */
    public String f103962m = null;

    /* renamed from: n */
    public C39393ai f103963n = null;

    /* renamed from: o */
    public final C58833ax f103964o;

    /* renamed from: p */
    public final Map f103965p;

    /* renamed from: q */
    public final AtomicReference f103966q = new AtomicReference((Object) null);

    /* renamed from: r */
    public final AtomicReference f103967r = new AtomicReference((Object) null);

    /* renamed from: s */
    public final C39533d f103968s;

    /* renamed from: t */
    public final PowerManager f103969t;

    /* renamed from: u */
    public final C39526i f103970u;

    /* renamed from: v */
    public final AtomicBoolean f103971v = new AtomicBoolean(false);

    /* renamed from: w */
    public final AtomicReference f103972w = new AtomicReference((Object) null);

    /* renamed from: x */
    public C58833ax f103973x;

    /* renamed from: y */
    public C58833ax f103974y;

    /* renamed from: z */
    public C58833ax f103975z;

    public C39479cu(C58833ax axVar, C39645b bVar, C39526i iVar, C39501f fVar, C39493h hVar, C39407aw awVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Context context, Map map, C39621m mVar, C39675b bVar2, C39385aa aaVar, boolean z, C39387ac acVar, C39383c cVar, C39533d dVar, PowerManager powerManager) {
        C58836b bVar3 = C58836b.f156633a;
        this.f103973x = bVar3;
        this.f103974y = bVar3;
        this.f103975z = bVar3;
        this.f103939A = bVar3;
        this.f103940B = bVar3;
        this.f103941C = null;
        this.f103942D = bVar3;
        this.f103943E = bVar3;
        this.f103945G = 0;
        this.f103964o = axVar;
        this.f103951b = bVar;
        this.f103949K = hVar;
        this.f103952c = awVar;
        this.f103953d = executor;
        this.f103954e = scheduledExecutorService;
        this.f103955f = new C47632e();
        this.f103957h = fVar;
        this.f103965p = map;
        this.f103956g = context;
        this.f103958i = aaVar;
        this.f103959j = mVar;
        this.f103950L = bVar2;
        this.f103960k = z;
        this.f103961l = acVar;
        this.f103970u = iVar;
        this.f103968s = dVar;
        this.f103969t = powerManager;
        this.f103946H = new C60904dr(executor);
        cVar.mo41795c(this);
    }

    /* renamed from: p */
    public static boolean m68890p(C67087ko koVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C39260aj.f103415g);
        koVar.mo58887l(r0);
        Object l = koVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C39260aj ajVar = (C39260aj) obj;
        C67050je jeVar = ajVar.f103420d;
        if (jeVar == null) {
            jeVar = C67050je.f182262f;
        }
        if ((jeVar.f182264a & 4) != 0) {
            C67050je jeVar2 = ajVar.f103420d;
            if (jeVar2 == null) {
                jeVar2 = C67050je.f182262f;
            }
            C67091ks ksVar = jeVar2.f182267d;
            if (ksVar == null) {
                ksVar = C67091ks.f182386h;
            }
            boolean z = ksVar.f182389b;
            C59104x b = f103938a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b).mo56372aa(53628)).mo56389s("Speaker detected : %b.", Boolean.valueOf(z));
            return z;
        }
        C59104x d = f103938a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) d).mo56372aa(53627)).mo56386p("No SpeakerIdInfo!");
        return false;
    }

    /* renamed from: t */
    private final C60870cx m68891t(AccountId accountId) {
        C39430bg bgVar = new C39430bg(this, accountId);
        return C60856cj.m92905n(C47810es.m84965e(bgVar), this.f103946H);
    }

    /* renamed from: a */
    public final C60870cx mo41786a(C39767h hVar, AccountId accountId) {
        this.f103971v.set(true);
        C58976aa aaVar = C58975e.f156826a;
        C39357bf bfVar = hVar.f104599c;
        if (bfVar == null) {
            bfVar = C39357bf.f103644d;
        }
        C39356be a = C39356be.m68761a(bfVar.f103647b);
        if (a == null) {
            a = C39356be.DEFAULT_PERSONAL;
        }
        a.name();
        C39636r rVar = new C39636r();
        rVar.f104346a = mo41850k(C39389ae.INITIALIZE.name());
        rVar.mo41791b(C39389ae.INITIALIZE);
        C39411b a2 = rVar.mo41790a();
        C60870cx t = m68891t(accountId);
        C39470cl clVar = new C39470cl(this, a2);
        C60870cx h = C60922j.m93045h(t, C47810es.m84966f(clVar), this.f103953d);
        C47558bi a3 = C47831fm.m85006a("#initialize");
        try {
            C60870cx b = this.f103955f.mo51512b(new C39471cm(this, h, a2, hVar), this.f103953d);
            a3.mo51417a(b);
            a3.close();
            return b;
        } catch (Throwable th) {
            C39429bf.m68861a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final C60870cx mo41787b() {
        this.f103971v.set(false);
        C59104x b = f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53617)).mo56386p("#shutdown");
        mo41854o((C37252a) null, C39389ae.SHUTDOWN, "#onSodaAudioAdapterDisconnect");
        C39389ae aeVar = C39389ae.SHUTDOWN;
        C39636r rVar = new C39636r();
        rVar.f104346a = mo41850k(aeVar.name());
        rVar.mo41791b(aeVar);
        C39411b a = rVar.mo41790a();
        this.f103970u.mo41868a(C37176a.f97162gO.mo40779c(), a);
        return this.f103955f.mo51512b(new C39464cf(this, a, aeVar), this.f103953d);
    }

    /* renamed from: c */
    public final C60870cx mo41788c(C39767h hVar, AccountId accountId) {
        C59104x b = f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(53621);
        C39357bf bfVar = hVar.f104599c;
        if (bfVar == null) {
            bfVar = C39357bf.f103644d;
        }
        C39356be a = C39356be.m68761a(bfVar.f103647b);
        if (a == null) {
            a = C39356be.DEFAULT_PERSONAL;
        }
        cVar.mo56389s("#update. Operational mode passed in HotwordConfig is %s", a.name());
        C39389ae aeVar = C39389ae.CONFIG_UPDATE_FROM_APA;
        C39636r rVar = new C39636r();
        rVar.f104346a = mo41850k(aeVar.name());
        rVar.mo41791b(aeVar);
        C39411b a2 = rVar.mo41790a();
        C60870cx t = m68891t(accountId);
        C39431bh bhVar = new C39431bh(this, a2);
        C60870cx h = C60922j.m93045h(t, C47810es.m84966f(bhVar), this.f103953d);
        C47558bi a3 = C47831fm.m85006a("#update");
        try {
            C60870cx b2 = this.f103955f.mo51512b(new C39432bi(this, h, a2, aeVar, hVar), this.f103953d);
            a3.mo51417a(b2);
            a3.close();
            return b2;
        } catch (Throwable th) {
            C39429bf.m68861a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final C60870cx mo41789d(C39264an anVar) {
        return this.f103955f.mo51512b(new C39442bs(this, anVar), this.f103953d);
    }

    /* renamed from: e */
    public final C60870cx mo41844e(C39767h hVar, C58833ax axVar, boolean z, C39393ai aiVar, C39411b bVar) {
        C60870cx cxVar;
        C59071e eVar = f103938a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53565)).mo56389s("getAllConfigAndTakeAction called because of %s", bVar.mo41820a().name());
        if (this.f103971v.get()) {
            if (z || !this.f103973x.mo56113h() || ((C39425bb) this.f103973x.mo56107c()).mo41840a().f395875G == null) {
                this.f103942D = C58833ax.m90834k(false);
                this.f103943E = C58836b.f156633a;
                this.f103970u.mo41870d(C37176a.f97232hf.mo40779c(), bVar);
                C60870cx a = this.f103949K.mo41862a();
                C39434bk bkVar = new C39434bk(this, bVar);
                cxVar = C60922j.m93045h(a, C47810es.m84966f(bkVar), this.f103953d);
            } else {
                this.f103970u.mo41870d(C37176a.f97236hj.mo40779c(), bVar);
                cxVar = C60856cj.m92900i((C39425bb) this.f103973x.mo56107c());
            }
            return C47633f.m84733g(cxVar).mo51516i(new C39447bx(this, hVar, axVar, aiVar, bVar), this.f103953d).mo51514f(Exception.class, new C39448by(this, bVar), this.f103953d);
        }
        C59104x d = eVar.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) d).mo56372aa(53566)).mo56389s("Ignore pending operation requested by %s because a shutdown was received!", bVar.mo41820a().name());
        return C60866ct.f164955a;
    }

    /* renamed from: f */
    public final C60870cx mo41845f(C39419h hVar) {
        C37259h hVar2;
        C59104x b = f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53579)).mo56389s("Hotword detection is running : %b, no further operation required.", Boolean.valueOf(hVar.mo41833h()));
        C39645b bVar = this.f103951b;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C62940bt btVar = C39820x.f104710d;
        C39818v vVar = (C39818v) C39820x.f104709c.createBuilder();
        int i = true != hVar.mo41833h() ? 3 : 2;
        vVar.copyOnWrite();
        C39820x xVar = (C39820x) vVar.instance;
        xVar.f104713b = i - 1;
        xVar.f104712a |= 1;
        knVar.mo58885m(btVar, (C39820x) vVar.build());
        bVar.mo39385a((C67087ko) knVar.build());
        if (hVar.mo41826b().mo41820a() == C39389ae.HOTWORD_TIMEOUT) {
            hVar2 = C37176a.f97309jc.mo40806d();
        } else {
            hVar2 = C37176a.f97245hs.mo40806d();
        }
        return mo41857s(hVar2, hVar.mo41826b(), C39518a.m68940b(hVar), 4);
    }

    /* renamed from: g */
    public final C60870cx mo41846g(C60870cx cxVar, C39419h hVar) {
        C59104x b = f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53580)).mo56386p("#handleStartHotwordDetectionResult");
        C39438bo boVar = new C39438bo(this, hVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(boVar), this.f103953d);
    }

    /* renamed from: h */
    public final C60870cx mo41847h() {
        if (!this.f103974y.mo56113h()) {
            return C60856cj.m92900i(false);
        }
        C39406av avVar = (C39406av) this.f103974y.mo56107c();
        C58976aa aaVar = C58975e.f156826a;
        return avVar.f103748b.mo51512b(new C39401aq(avVar), avVar.f103749c);
    }

    /* renamed from: i */
    public final C60870cx mo41848i(C39419h hVar, C39396al alVar) {
        if (!this.f103974y.mo56113h()) {
            C59104x b = f103938a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b).mo56372aa(53619)).mo56386p("Create HotwordDetectorManager!");
            this.f103974y = C58833ax.m90834k(this.f103952c.mo41819a((C33497h) this.f103964o.mo56107c(), hVar.mo41828d(), alVar, this.f103970u));
        }
        if (this.f103948J == null) {
            C59104x b2 = f103938a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b2).mo56372aa(53618)).mo56386p("Create HotwordDetectionCallback.");
            this.f103948J = C39428be.m68860a(new C39477cs(this));
        }
        if (hVar.mo41832g()) {
            this.f103970u.mo41870d(C37176a.f97240hn.mo40779c(), hVar.mo41826b());
            C39390af afVar = this.f103948J;
            afVar.getClass();
            C39633o oVar = ((C39406av) this.f103974y.mo56107c()).f103752f;
            C59104x b3 = C39633o.f104316a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) b3).mo56372aa(53498)).mo56386p("#startDspHotwordRecognition");
            return oVar.f104318c.mo51512b(new C39517f(oVar, afVar), oVar.f104320e);
        }
        this.f103970u.mo41870d(C37176a.f97241ho.mo40779c(), hVar.mo41826b());
        C39406av avVar = (C39406av) this.f103974y.mo56107c();
        C39390af afVar2 = this.f103948J;
        afVar2.getClass();
        return avVar.f103748b.mo51512b(new C39397am(avVar, afVar2), avVar.f103749c);
    }

    /* renamed from: j */
    public final C60870cx mo41849j(boolean z, C39419h hVar) {
        C59104x b = f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53620)).mo56386p("#stopHotwordDetection");
        C39406av avVar = (C39406av) this.f103974y.mo56107c();
        C60870cx b2 = avVar.f103748b.mo51512b(new C39400ap(avVar), avVar.f103749c);
        C39465cg cgVar = new C39465cg(this, z, hVar);
        return C60922j.m93045h(b2, C47810es.m84966f(cgVar), this.f103953d);
    }

    /* renamed from: k */
    public final String mo41850k(String str) {
        String uuid = UUID.randomUUID().toString();
        long incrementAndGet = this.f103947I.incrementAndGet();
        return uuid + "_" + str + "___" + incrementAndGet;
    }

    /* renamed from: l */
    public final void mo41851l(C39393ai aiVar, C39411b bVar) {
        C39436bm bmVar = new C39436bm(this, aiVar, bVar);
        C46459k.m82829b(C60856cj.m92902k(C47810es.m84965e(bmVar), 5, TimeUnit.SECONDS, this.f103954e), "Failed to handle onError.", new Object[0]);
    }

    /* renamed from: m */
    public final void mo41852m(C67087ko koVar) {
        this.f103951b.mo39385a(koVar);
        this.f103950L.mo41985a();
    }

    /* renamed from: n */
    public final void mo41853n(C67087ko koVar, String str) {
        DesugarAtomicReference.getAndUpdate(this.f103972w, new C39443bt(str, koVar));
    }

    /* renamed from: o */
    public final void mo41854o(C37252a aVar, C39389ae aeVar, String str) {
        DesugarAtomicReference.getAndUpdate(this.f103966q, new C39467ci(this, aVar, aeVar, str));
    }

    /* renamed from: q */
    public final C60870cx mo41855q(boolean z, int i) {
        C60870cx cxVar;
        this.f103945G = 0;
        String k = mo41850k("RECONFIG_HOTWORD_DETECTOR");
        if (z) {
            C39406av avVar = (C39406av) this.f103974y.mo56107c();
            C59104x b = C39406av.f103747a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordDetectorManager");
            ((C59052c) ((C59052c) b).mo56372aa(53525)).mo56386p("#isSodaHotwordRunning");
            C47632e eVar = avVar.f103748b;
            C39580br brVar = avVar.f103750d;
            Objects.requireNonNull(brVar);
            cxVar = eVar.mo51512b(new C39399ao(brVar), avVar.f103749c);
        } else {
            cxVar = C60856cj.m92900i(false);
        }
        C39449bz bzVar = new C39449bz(this, k, i);
        return C47633f.m84733g(C60922j.m93045h(cxVar, C47810es.m84966f(bzVar), this.f103953d)).mo51515h(C39439bp.f103828a, this.f103953d).mo51513e(Throwable.class, new C39441br(this, i), this.f103953d);
    }

    /* renamed from: r */
    public final void mo41856r(C58833ax axVar, int i) {
        if (this.f103939A.mo56113h() && ((C39419h) this.f103939A.mo56107c()).mo41832g()) {
            this.f103970u.mo41872f(C37176a.f97286ig.mo40806d(), axVar, i);
        }
    }

    /* renamed from: s */
    public final C60870cx mo41857s(C37259h hVar, C39411b bVar, C71082ea eaVar, int i) {
        C59071e eVar = f103938a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53612)).mo56386p("logRequestHandlingNonErrorEndEvent");
        this.f103970u.mo41873g(hVar, bVar, eaVar, i);
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b2).mo56372aa(53613)).mo56386p("Reset requestIdOfFirstError and firstStartErrorCausesRetry!");
        this.f103962m = null;
        this.f103963n = null;
        return C60866ct.f164955a;
    }

    /* renamed from: u */
    public final String mo41796u() {
        StringBuilder sb = new StringBuilder("\t \t SodaTriggeringFrontend\n");
        if (this.f103939A.mo56113h()) {
            C39419h hVar = (C39419h) this.f103939A.mo56107c();
            StringBuilder sb2 = new StringBuilder("\t \t   DSP Available: ");
            sb2.append(hVar.mo41832g());
            sb2.append("\n\t \t   Screen On: ");
            sb2.append(hVar.mo41835i());
            sb2.append("\n\t \t   Hotword Running: ");
            sb2.append(hVar.mo41833h());
            sb2.append("\n\t \t   Voice Match Enabled: ");
            sb2.append(hVar.mo41836j());
            sb2.append("\n\t \t   Voice Match Enforced: ");
            sb2.append(hVar.mo41837k());
            sb2.append("\n\t \t   ActionRequestInfo\n");
            C39411b b = hVar.mo41826b();
            sb2.append("\t \t     App Flow Logging Tag: " + b.mo41821b() + "\n\t \t     Requester: " + b.mo41820a().name() + "\n");
            sb2.append("\t \t   Hotword Config\n");
            C39767h a = hVar.mo41825a();
            StringBuilder sb3 = new StringBuilder();
            if ((a.f104597a & 1) != 0) {
                sb3.append("\t \t     Locale Config\n");
                C39274ax axVar = a.f104598b;
                if (axVar == null) {
                    axVar = C39274ax.f103452c;
                }
                sb3.append("\t \t       Locale: " + axVar.f103455b + "\n");
            }
            sb3.append("\t \t     Operational Config\n");
            C39357bf bfVar = a.f104599c;
            if (bfVar == null) {
                bfVar = C39357bf.f103644d;
            }
            StringBuilder sb4 = new StringBuilder("\t \t       Mode: ");
            C39356be a2 = C39356be.m68761a(bfVar.f103647b);
            if (a2 == null) {
                a2 = C39356be.DEFAULT_PERSONAL;
            }
            sb4.append(a2.name());
            sb4.append("\n");
            if ((bfVar.f103646a & 2) != 0) {
                sb4.append("\t \t       Test Config\n");
                C39677db dbVar = bfVar.f103648c;
                if (dbVar == null) {
                    dbVar = C39677db.f104438c;
                }
                sb4.append("\t \t         Disable DSP: " + dbVar.f104440a + "\n\t \t         Bypass Voice Match: " + dbVar.f104441b + "\n");
            }
            sb3.append(sb4.toString());
            sb2.append(sb3.toString());
            C39393ai c = hVar.mo41827c();
            if (c != null) {
                sb2.append("\t \t   Hotword Detection Error\n");
                sb2.append("\t \t     Error Code: " + c.mo41808a().name() + "\n\t \t     Error Message: " + c.mo41809b() + "\n");
            }
            sb2.append("\t \t   Internal Hotword Config\n");
            C39425bb d = hVar.mo41828d();
            StringBuilder sb5 = new StringBuilder("\t \t     ");
            sb5.append(d.mo41840a());
            sb5.append("\n\t \t     Hotword Config Response\n");
            C39499d b2 = d.mo41841b();
            sb5.append("\t \t       Hotword for Navigation Enabled: " + b2.f104025b + "\n");
            sb2.append(sb5.toString());
            sb.append(sb2.toString());
        }
        return sb.toString();
    }
}
