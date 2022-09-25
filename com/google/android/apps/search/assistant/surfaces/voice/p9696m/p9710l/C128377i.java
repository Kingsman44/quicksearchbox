package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9029a.C119725a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128364a;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128365b;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128366c;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128368e;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128369f;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128544a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17362b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17506i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17510m;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17518u;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.alz;
import com.google.assistant.p3897e.p3921j.aos;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.i */
/* compiled from: PG */
public final class C128377i {

    /* renamed from: a */
    public static final C59071e f353069a = C59071e.m91331h();

    /* renamed from: b */
    public static final C17508k f353070b;

    /* renamed from: c */
    public static final C33480d f353071c = C33480d.m62053a("speech_output_args", "assistant.api.client_op.SpeechOutputArgs", aos.f135519e);

    /* renamed from: d */
    public static final C51785da f353072d;

    /* renamed from: k */
    private static final Duration f353073k = Duration.ofSeconds(10);

    /* renamed from: e */
    public final C71422aw f353074e;

    /* renamed from: f */
    public final C119725a f353075f;

    /* renamed from: g */
    public final C37215b f353076g;

    /* renamed from: h */
    public final C119793ao f353077h;

    /* renamed from: i */
    public final C128384p f353078i;

    /* renamed from: j */
    public final C17362b f353079j;

    /* renamed from: l */
    private final Executor f353080l;

    /* renamed from: m */
    private final Executor f353081m;

    /* renamed from: n */
    private final C128544a f353082n;

    /* renamed from: o */
    private final C60950i f353083o;

    static {
        C17506i iVar = (C17506i) C17508k.f50521c.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C17510m a = C69664n.m101061g(iVar, "builder");
        C17518u uVar = C17518u.f50532a;
        C69664n.m101060f(uVar, "getDefaultInstance()");
        a.mo23377c(uVar);
        f353070b = a.mo23375a();
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        C69664n.m101060f(czVar, "newBuilder()");
        alz a2 = C69664n.m101061g(czVar, "builder");
        a2.mo53699b("tts.OUTPUT");
        C51773cz czVar2 = a2.f135357a;
        czVar2.copyOnWrite();
        C51785da daVar = (C51785da) czVar2.instance;
        daVar.f135877a |= 2;
        daVar.f135879c = 2;
        f353072d = a2.mo53698a();
    }

    public C128377i(C71422aw awVar, Executor executor, C60888db dbVar, Executor executor2, C119725a aVar, C17362b bVar, C128544a aVar2, C60950i iVar, C37215b bVar2, C119793ao aoVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(dbVar, "scheduledExecutorService");
        C69664n.m101061g(executor2, "sequentialExecutor");
        C69664n.m101061g(aVar2, "timepointEventQueue");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(bVar2, "appFlowLogger");
        C69664n.m101061g(aoVar, "clientOpContext");
        this.f353074e = awVar;
        this.f353080l = executor;
        this.f353081m = executor2;
        this.f353075f = aVar;
        this.f353079j = bVar;
        this.f353082n = aVar2;
        this.f353083o = iVar;
        this.f353076g = bVar2;
        this.f353077h = aoVar;
        this.f353078i = new C128384p(aVar2, executor2, iVar);
    }

    /* renamed from: a */
    public final void mo108400a(String str) {
        C128544a aVar = this.f353082n;
        C128364a aVar2 = (C128364a) C128365b.f353033d.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C69664n.m101061g(aVar2, "builder");
        aVar2.copyOnWrite();
        C128365b bVar = (C128365b) aVar2.instance;
        bVar.f353035a |= 1;
        bVar.f353036b = str;
        C62942bv build = aVar2.build();
        C69664n.m101060f(build, "_builder.build()");
        Duration duration = f353073k;
        C69664n.m101060f(duration, "TTS_TIMEPOINT_STORE_EVENT_QUEUE_TIMEOUT");
        C128366c cVar = (C128366c) C128369f.f353045c.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C69664n.m101061g(cVar, "builder");
        C128368e eVar = C128368e.TIMED_OUT;
        C69664n.m101061g(eVar, "value");
        cVar.copyOnWrite();
        C128369f fVar = (C128369f) cVar.instance;
        fVar.f353048b = eVar.f353044e;
        fVar.f353047a |= 1;
        C62942bv build2 = cVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        C60856cj.m92911t(aVar.mo108509a((C128365b) build, duration, (C128369f) build2), C47810es.m84974n(new C128374f(str)), this.f353080l);
    }
}
