package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0826b;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.C90548ak;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.speech.audio.C92173d;
import com.google.android.apps.gsa.speech.audio.C92185e;
import com.google.android.apps.gsa.speech.audio.C92195f;
import com.google.android.apps.gsa.speech.audio.C92196g;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92410p;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92509c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.C101718a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.C101725ag;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19247b;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.assistant.soda.C19385u;
import com.google.android.libraries.assistant.soda.C19387w;
import com.google.android.libraries.assistant.soda.C19389y;
import com.google.android.libraries.assistant.soda.C19390z;
import com.google.android.libraries.assistant.soda.data.C19283a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5218j.C67001hj;
import com.google.speech.p5218j.C67007hp;
import com.google.speech.p5218j.C67010hs;
import com.google.speech.p5218j.C67013hv;
import com.google.speech.p5218j.C67014hw;
import com.google.speech.p5218j.C67017hz;
import com.google.speech.p5218j.C67026ih;
import com.google.speech.p5218j.C67042ix;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67066ju;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67083kk;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67117lr;
import com.google.speech.p5218j.C67152mz;
import com.google.speech.p5218j.C67170o;
import com.google.speech.p5218j.C67171p;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.bf */
/* compiled from: PG */
public final class C101959bf extends C101943aq implements C19347o, C19283a {

    /* renamed from: a */
    public static final C59071e f284455a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.bf");

    /* renamed from: b */
    static final long f284456b = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: c */
    static final long f284457c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: A */
    private final C68214a f284458A;

    /* renamed from: B */
    private final C86054o f284459B;

    /* renamed from: C */
    private final boolean f284460C;

    /* renamed from: D */
    private final boolean f284461D;

    /* renamed from: E */
    private final C89859i f284462E;

    /* renamed from: F */
    private final Executor f284463F;

    /* renamed from: G */
    private boolean f284464G;

    /* renamed from: H */
    private C87673aa f284465H;

    /* renamed from: I */
    private int f284466I;

    /* renamed from: J */
    private final C101983x f284467J;

    /* renamed from: d */
    public final C92173d f284468d;

    /* renamed from: e */
    public final C92196g f284469e;

    /* renamed from: f */
    public final C89994f f284470f;

    /* renamed from: g */
    public final C21370a f284471g;

    /* renamed from: h */
    public final C92410p f284472h;

    /* renamed from: i */
    public final C74555u f284473i;

    /* renamed from: j */
    public boolean f284474j;

    /* renamed from: k */
    public C19389y f284475k;

    /* renamed from: l */
    Map f284476l;

    /* renamed from: n */
    private final String f284477n;

    /* renamed from: o */
    private final String f284478o;

    /* renamed from: p */
    private final C90584f f284479p;

    /* renamed from: q */
    private final C101945as f284480q;

    /* renamed from: r */
    private final Context f284481r;

    /* renamed from: s */
    private final C22871g f284482s;

    /* renamed from: t */
    private final C22871g f284483t;

    /* renamed from: u */
    private final C22871g f284484u;

    /* renamed from: v */
    private final C19390z f284485v;

    /* renamed from: w */
    private final C87677ae f284486w;

    /* renamed from: x */
    private final C86124t f284487x;

    /* renamed from: y */
    private final C29409fd f284488y;

    /* renamed from: z */
    private final C42813k f284489z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101959bf(C101983x xVar, boolean z, C74555u uVar, C101860a aVar, C101725ag agVar, C101718a aVar2, C101945as asVar, C92196g gVar, C89994f fVar, Context context, C22871g gVar2, C22871g gVar3, C22871g gVar4, C19390z zVar, C87677ae aeVar, C86124t tVar, C29409fd fdVar, C42813k kVar, C68214a aVar3, C86054o oVar, C21370a aVar4, C92410p pVar, C89859i iVar, C90584f fVar2, String str) {
        super(aVar2, agVar);
        C22871g gVar5 = gVar4;
        C101725ag agVar2 = agVar;
        C101718a aVar5 = aVar2;
        this.f284467J = xVar;
        this.f284473i = uVar;
        this.f284477n = str;
        this.f284478o = aVar.mo92638c();
        this.f284469e = gVar;
        this.f284470f = fVar;
        this.f284481r = context;
        this.f284480q = asVar;
        this.f284482s = gVar2;
        this.f284483t = gVar3;
        this.f284484u = gVar5;
        this.f284485v = zVar;
        this.f284486w = aeVar;
        this.f284487x = tVar;
        this.f284488y = fdVar;
        this.f284489z = kVar;
        this.f284458A = aVar3;
        this.f284459B = oVar;
        this.f284471g = aVar4;
        this.f284472h = pVar;
        this.f284462E = iVar;
        this.f284460C = z;
        this.f284479p = fVar2;
        this.f284468d = C92195f.m151371a(fVar2);
        boolean z2 = false;
        if (!uVar.mo70891j() && fVar.mo83851N()) {
            z2 = true;
        }
        this.f284461D = z2;
        this.f284463F = new C101955bb(gVar5);
    }

    /* renamed from: l */
    public static C67017hz m168726l(String str) {
        C67010hs hsVar = (C67010hs) C67017hz.f182174c.createBuilder();
        C67013hv hvVar = (C67013hv) C67014hw.f182165c.createBuilder();
        hvVar.copyOnWrite();
        C67014hw hwVar = (C67014hw) hvVar.instance;
        hwVar.f182167a |= 1;
        hwVar.f182168b = str;
        hsVar.copyOnWrite();
        C67017hz hzVar = (C67017hz) hsVar.instance;
        C67014hw hwVar2 = (C67014hw) hvVar.build();
        hwVar2.getClass();
        hzVar.f182177b = hwVar2;
        hzVar.f182176a = 1;
        return (C67017hz) hsVar.build();
    }

    /* renamed from: p */
    private final void m168727p(C92173d dVar, C67171p pVar) {
        List list = (List) Map.EL.getOrDefault(this.f284476l, dVar, new ArrayList());
        list.add(pVar);
        this.f284476l.put(dVar, list);
    }

    /* renamed from: q */
    private final void m168728q(C22869e eVar) {
        C60870cx cxVar;
        this.f284475k.mo24535h();
        if (!C22872h.m42744d(C0826b.class)) {
            cxVar = this.f284482s.mo28207g("SodaHotwordDControllerhandleUtteranceCompleted", eVar);
        } else {
            eVar.run();
            cxVar = C60866ct.f164955a;
        }
        cxVar.mo4106b(new C101948av(this), C60826bg.f164896a);
    }

    /* renamed from: r */
    private final void m168729r(String str) {
        int i = 2;
        if (!str.isEmpty()) {
            i = 2 + C101961bh.m168747a(str, this.f284478o);
        }
        if (this.f284466I != i) {
            this.f284466I = i;
            this.f284467J.f284551a.mo92713q(i);
        }
    }

    /* renamed from: a */
    public final C101945as mo92724a() {
        return this.f284480q;
    }

    /* renamed from: b */
    public final C60870cx mo92725b() {
        if (this.f284460C) {
            return C60856cj.m92899h(new AssertionError("This should not be called in TiSid Home enrollment flow."));
        }
        C59071e eVar = f284455a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
        ((C59052c) ((C59052c) b).mo56372aa(20504)).mo56389s("enrollVoiceMatch with hotwordAudioType: %s", this.f284468d);
        if (this.f284468d != C92173d.UNKNOWN) {
            return this.f284483t.mo28202b("enroll voice match", new C101956bc(this));
        }
        C59104x c = eVar.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
        ((C59052c) ((C59052c) c).mo56372aa(20505)).mo56386p("not enrolling: hotword model corresponds to an unknown audio type");
        return C60856cj.m92899h(new IllegalStateException("hotword model corresponds to an unknown audio type"));
    }

    /* renamed from: c */
    public final void mo92726c() {
        this.f284476l.clear();
    }

    /* renamed from: d */
    public final void mo92727d() {
        C59071e eVar = f284455a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
        ((C59052c) ((C59052c) b).mo56372aa(20506)).mo56386p("connect");
        if (this.f284475k.mo24536i()) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
            ((C59052c) ((C59052c) d).mo56372aa(20508)).mo56386p("A previous Soda object was still initialized. Disconnecting first.");
            this.f284475k.mo24532e();
        }
        C67152mz c = this.f284475k.mo24530c();
        ((C90548ak) this.f284458A.mo27525b()).mo84668b(4, EventForDump.m147676e(8, String.format("Connect Status: %s", new Object[]{c.name()})), BuildConfig.FLAVOR);
        if (c == C67152mz.INVALID_LANGUAGE_PACK) {
            this.f284467J.f284551a.mo92710n(R.string.hotword_enrollment_invalid_language_pack);
        }
        if (c != C67152mz.NO_ERROR) {
            C59104x c2 = eVar.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
            ((C59052c) ((C59052c) c2).mo56372aa(20507)).mo56389s("Soda init failed with status: %s", c.name());
        }
        if (!this.f284465H.mo81953y()) {
            this.f284465H.mo81947s((Bundle) null);
        }
        this.f284465H.mo81932c();
    }

    /* renamed from: e */
    public final void mo92728e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f284465H.mo81948t(false);
        this.f284465H.mo81933e();
        this.f284475k.mo24535h();
        this.f284475k.mo24533f();
        mo92726c();
    }

    /* renamed from: f */
    public final void mo92729f() {
        C59104x b = f284455a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
        ((C59052c) ((C59052c) b).mo56372aa(20514)).mo56386p("initialize");
        HashMap hashMap = new HashMap();
        this.f284476l = hashMap;
        hashMap.put(this.f284468d, new ArrayList());
        this.f284476l.put(C92173d.TISID_ENROLLMENT, new ArrayList());
        boolean z = false;
        this.f284464G = this.f284460C || this.f284461D;
        String a = C92509c.m152171a(this.f284478o, this.f284479p, this.f284481r, this.f284488y, this.f284489z, this.f284487x.mo79746e(C90082eg.f250020cd));
        C19387w B = C19247b.m36941B();
        B.mo24385z(BuildConfig.FLAVOR);
        B.mo24376q(a);
        B.mo24372m(this.f284461D || this.f284460C);
        if (this.f284461D || this.f284460C) {
            z = true;
        }
        B.mo24381v(z);
        B.mo24363d(true);
        B.mo24365f(true);
        B.mo24359B(this.f284464G);
        B.mo24378s(this.f284478o);
        B.mo24383x(this);
        B.mo24384y(this);
        this.f284475k = B.mo24527C(this.f284485v);
        C87677ae aeVar = this.f284486w;
        C88486g gVar = new C88486g();
        gVar.f239199a = 2251799813685248L;
        gVar.f239201c = amo.SPEAKER_ID_ENROLLMENT;
        gVar.f239204f = "tisid_enrollment";
        C87673aa a2 = aeVar.mo81958a((C87682aj) null, (C90757ba) null, new ClientConfig(gVar));
        this.f284465H = a2;
        a2.mo81947s((Bundle) null);
    }

    /* renamed from: g */
    public final void mo92730g(Bundle bundle) {
    }

    /* renamed from: h */
    public final void mo92731h(String str) {
        this.f284475k.f54244j = str;
    }

    /* renamed from: i */
    public final void mo92732i(boolean z) {
        this.f284474j = z;
        if (z) {
            mo92738n();
        } else {
            this.f284475k.mo24535h();
        }
    }

    /* renamed from: j */
    public final void mo92733j(C66595bu buVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: m */
    public final void mo92737m(Exception exc) {
        C59104x c = f284455a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(20513)).mo56389s("%s", "SODA failed to start capturing.");
        ((C90548ak) this.f284458A.mo27525b()).mo84668b(4, EventForDump.m147676e(8, "SODA failed to start capturing."), "error");
    }

    /* renamed from: n */
    public final void mo92738n() {
        C19389y yVar = this.f284475k;
        C90873ag b = C90875ai.m148465b(C101950ax.f284442a, yVar.f54242h.mo19399b(C47810es.m84978r(new C19385u(yVar))), this.f284484u, "Get StartDetection Result");
        b.mo85224b(IllegalStateException.class, new C101951ay(this));
        b.mo85223a(new C101952az(this));
    }

    /* renamed from: o */
    public final void mo92739o(C92173d dVar) {
        C92195f a = this.f284469e.mo86868a(C92185e.f257011b);
        List<C67171p> list = (List) this.f284476l.get(dVar);
        list.getClass();
        for (C67171p pVar : list) {
            a.mo86855b(pVar.f182578b.mo59174N(), this.f284470f.mo83886af(), dVar);
            a.mo86855b(pVar.f182578b.mo59174N(), this.f284477n, dVar);
        }
    }

    /* renamed from: t */
    public final void mo23782t(C67087ko koVar) {
        C89849ae aeVar;
        C22869e eVar;
        if ((koVar.f182368a & 1) != 0) {
            C67050je jeVar = koVar.f182369b;
            if (jeVar == null) {
                jeVar = C67050je.f182262f;
            }
            C59104x b = f284455a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
            ((C59052c) ((C59052c) b).mo56372aa(20512)).mo56386p("Hotword detected");
            m168729r(BuildConfig.FLAVOR);
            if (!this.f284460C) {
                C92173d dVar = this.f284468d;
                C67073ka kaVar = jeVar.f182266c;
                if (kaVar == null) {
                    kaVar = C67073ka.f182324f;
                }
                C67171p pVar = kaVar.f182327b;
                if (pVar == null) {
                    pVar = C67171p.f182575e;
                }
                m168727p(dVar, pVar);
            }
            if (!this.f284461D && !this.f284460C) {
                C101983x xVar = this.f284467J;
                Objects.requireNonNull(xVar);
                m168728q(new C101957bd(xVar));
            }
            if (!this.f284464G) {
                this.f284465H.mo81937i(new C88489j(C87739bu.SEND_MULTI_DEVICE_ARBITRATION_REQUEST).mo82013a());
            }
        }
        if (this.f284460C && (koVar.f182368a & 256) != 0) {
            C67117lr lrVar = koVar.f182375h;
            if (lrVar == null) {
                lrVar = C67117lr.f182453b;
            }
            C58976aa aaVar = C58975e.f156826a;
            C89859i iVar = this.f284462E;
            if (lrVar.f182455a) {
                aeVar = C89849ae.VOICE_MATCH_SODA_QUERY_VALIDATION_SUCCESS;
            } else {
                aeVar = C89849ae.VOICE_MATCH_SODA_QUERY_VALIDATION_FAILURE;
            }
            iVar.mo83702b(aeVar);
            if (lrVar.f182455a) {
                C101983x xVar2 = this.f284467J;
                Objects.requireNonNull(xVar2);
                eVar = new C101946at(xVar2);
            } else {
                C101983x xVar3 = this.f284467J;
                Objects.requireNonNull(xVar3);
                eVar = new C101949aw(xVar3);
            }
            m168728q(eVar);
        }
        if ((this.f284461D || this.f284460C) && (koVar.f182368a & 2) != 0) {
            C67083kk kkVar = koVar.f182370c;
            if (kkVar == null) {
                kkVar = C67083kk.f182351g;
            }
            int i = kkVar.f182354b;
            if (i == 1) {
                C67042ix ixVar = (C67042ix) kkVar.f182355c;
                if (ixVar.f182230b.size() > 0) {
                    String str = (String) ixVar.f182230b.get(0);
                    C59104x b2 = f284455a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
                    ((C59052c) ((C59052c) b2).mo56372aa(20511)).mo56389s("Final recognition: %s", str);
                    m168729r(str);
                    if (this.f284461D) {
                        C92173d dVar2 = C92173d.TISID_ENROLLMENT;
                        C67171p pVar2 = ixVar.f182234f;
                        if (pVar2 == null) {
                            pVar2 = C67171p.f182575e;
                        }
                        List list = (List) this.f284476l.get(this.f284468d);
                        if (list != null && !list.isEmpty()) {
                            C63088z x = ((C67171p) C58557jl.m90131l(list)).f182578b.mo59177x(pVar2.f182578b);
                            C67170o oVar = (C67170o) C67171p.f182575e.createBuilder(pVar2);
                            oVar.copyOnWrite();
                            C67171p pVar3 = (C67171p) oVar.instance;
                            x.getClass();
                            pVar3.f182577a |= 1;
                            pVar3.f182578b = x;
                            pVar2 = (C67171p) oVar.build();
                        }
                        m168727p(dVar2, pVar2);
                        C101983x xVar4 = this.f284467J;
                        Objects.requireNonNull(xVar4);
                        m168728q(new C101957bd(xVar4));
                    }
                }
            } else if (i == 2) {
                C67066ju juVar = (C67066ju) kkVar.f182355c;
                if (juVar.f182305b.size() > 0) {
                    m168729r((String) juVar.f182305b.get(0));
                }
            }
        }
        C67026ih ihVar = koVar.f182373f;
        if (ihVar == null) {
            ihVar = C67026ih.f182188e;
        }
        if ((ihVar.f182190a & 1) != 0) {
            C67026ih ihVar2 = koVar.f182373f;
            if (ihVar2 == null) {
                ihVar2 = C67026ih.f182188e;
            }
            this.f284480q.f284437a = Math.min(100, (int) (ihVar2.f182191b * 6000.0f));
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void mo23783u() {
    }

    /* renamed from: v */
    public final /* synthetic */ void mo23784v(C19243af afVar) {
    }

    /* renamed from: s */
    public final C60870cx mo24441s(C67007hp hpVar) {
        C67001hj hjVar;
        long j;
        C67001hj hjVar2;
        if (hpVar.f182155a != 1) {
            return C60856cj.m92900i(m168726l("Only AuthData requests are supported."));
        }
        Account w = this.f284459B.mo79689w(this.f284477n);
        if (w == null) {
            return C60856cj.m92900i(m168726l("No account found."));
        }
        C60870cx e = this.f284459B.mo79671e("oauth2:https://www.googleapis.com/auth/googlenow", w, new C91032p());
        if (hpVar.f182155a == 1) {
            hjVar = (C67001hj) hpVar.f182156b;
        } else {
            hjVar = C67001hj.f182145c;
        }
        if ((hjVar.f182147a & 1) != 0) {
            if (hpVar.f182155a == 1) {
                hjVar2 = (C67001hj) hpVar.f182156b;
            } else {
                hjVar2 = C67001hj.f182145c;
            }
            j = (long) hjVar2.f182148b;
        } else {
            j = f284457c;
        }
        return C60922j.m93044g(C90877ak.m148471e(e, j, TimeUnit.MILLISECONDS, this.f284484u), new C101954ba(this), this.f284463F);
    }
}
