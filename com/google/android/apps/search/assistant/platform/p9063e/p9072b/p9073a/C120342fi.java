package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.gsa.binaries.satin.app.aoa;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120391a;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17251p;
import com.google.android.libraries.search.assistant.p2513e.p2514a.C32566c;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2904c.p2990z.p2991a.C38287c;
import com.google.android.libraries.search.p2904c.p2990z.p2991a.C38289e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66551ah;
import com.google.speech.p5208h.C66552ai;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66675i;
import com.google.speech.p5208h.C66676j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.fi */
/* compiled from: PG */
public final class C120342fi implements C17266e {

    /* renamed from: a */
    public static final C66607ce f334806a;

    /* renamed from: b */
    public static final C59071e f334807b = C59071e.m91332i("com.google.android.apps.search.assistant.platform.e.b.a.fi");

    /* renamed from: c */
    public final Executor f334808c;

    /* renamed from: d */
    public final C60870cx f334809d;

    /* renamed from: e */
    public final C32566c f334810e;

    /* renamed from: f */
    public final C119891j f334811f;

    /* renamed from: g */
    public final C120695j f334812g;

    /* renamed from: h */
    public final long f334813h;

    /* renamed from: i */
    public final aoa f334814i;

    /* renamed from: j */
    public C38287c f334815j = null;

    /* renamed from: k */
    public final C38289e f334816k;

    /* renamed from: l */
    private final C120227bq f334817l;

    /* renamed from: m */
    private final AtomicBoolean f334818m = new AtomicBoolean(false);

    /* renamed from: n */
    private final C60870cx f334819n;

    static {
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        C62940bt btVar = C66552ai.f180998d;
        C66551ah ahVar = (C66551ah) C66552ai.f180997c.createBuilder();
        ahVar.copyOnWrite();
        C66552ai aiVar = (C66552ai) ahVar.instance;
        aiVar.f181000a |= 1;
        aiVar.f181001b = true;
        cdVar.mo58885m(btVar, (C66552ai) ahVar.build());
        f334806a = (C66607ce) cdVar.build();
    }

    public C120342fi(C60870cx cxVar, Executor executor, C60870cx cxVar2, C32566c cVar, aoa aoa, C119893l lVar, C120695j jVar, C38289e eVar, C120227bq bqVar, long j) {
        this.f334819n = cxVar;
        this.f334808c = executor;
        this.f334809d = cxVar2;
        this.f334810e = cVar;
        this.f334814i = aoa;
        C119891j a = C119891j.m198765a(lVar.f333897d);
        this.f334811f = a == null ? C119891j.DEFAULT_AUDIO_ENCODING : a;
        this.f334812g = jVar;
        this.f334816k = eVar;
        this.f334817l = bqVar;
        this.f334813h = j;
    }

    /* renamed from: a */
    public final C60870cx mo23245a() {
        C60870cx j = C60856cj.m92901j(this.f334809d);
        C120338fe feVar = new C120338fe(this);
        return C60922j.m93044g(j, C47810es.m84963c(feVar), this.f334808c);
    }

    /* renamed from: b */
    public final C60870cx mo104724b(C120391a aVar, Consumer consumer) {
        C63088z a = aVar.mo104738a();
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        C62940bt btVar = C66676j.f181379d;
        C66675i iVar = (C66675i) C66676j.f181378c.createBuilder();
        iVar.copyOnWrite();
        C66676j jVar = (C66676j) iVar.instance;
        a.getClass();
        jVar.f181382a |= 1;
        jVar.f181383b = a;
        cdVar.mo58885m(btVar, (C66676j) iVar.build());
        ((C17251p) consumer).accept((C66607ce) cdVar.build());
        if (!this.f334818m.getAndSet(true)) {
            this.f334817l.f334569a.mo19974a(C37176a.f96925bq);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo23246c(Consumer consumer) {
        C60870cx j = C60856cj.m92901j(this.f334819n);
        C120335fb fbVar = new C120335fb(this, consumer);
        return C60922j.m93045h(j, C47810es.m84966f(fbVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo104725d(C120510g gVar) {
        C60870cx cxVar = this.f334809d;
        C120340fg fgVar = new C120340fg(this, gVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(fgVar), this.f334808c);
    }

    /* renamed from: e */
    public final void mo104726e(C120391a aVar) {
        C38287c cVar = this.f334815j;
        if (cVar != null) {
            cVar.mo41358b(aVar.mo104738a());
            return;
        }
        C59104x d = f334807b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        C59052c cVar2 = (C59052c) d;
        cVar2.mo56374ac(500, TimeUnit.MILLISECONDS);
        ((C59052c) cVar2.mo56372aa(34706)).mo56386p("Audio record writer wasn't initialized.");
    }
}
