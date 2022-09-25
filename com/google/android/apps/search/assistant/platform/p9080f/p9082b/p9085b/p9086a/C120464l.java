package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.C120479b;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120692g;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33576a;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33577b;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33578c;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a.C33580e;
import com.google.android.libraries.search.assistant.p2511d.C32558u;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33437e;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5085c.p5086a.p5090b.p5091a.p5092a.C65490b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.l */
/* compiled from: PG */
public final class C120464l implements C120479b {

    /* renamed from: a */
    public final C71422aw f335029a;

    /* renamed from: b */
    public final AtomicBoolean f335030b = new AtomicBoolean(false);

    /* renamed from: c */
    private final C120692g f335031c;

    /* renamed from: d */
    private final Executor f335032d;

    /* renamed from: e */
    private final C33578c f335033e;

    /* renamed from: f */
    private final C33437e f335034f;

    /* renamed from: g */
    private final C33447g f335035g;

    /* renamed from: h */
    private final C33580e f335036h;

    public C120464l(C33578c cVar, C33580e eVar, C120692g gVar, C33437e eVar2, C33447g gVar2, Executor executor, C71422aw awVar) {
        C69664n.m101061g(gVar, "interactionController");
        C69664n.m101061g(eVar2, "configurationShutdownHookRegistry");
        C69664n.m101061g(gVar2, "utteranceShutdownHookRegistry");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f335033e = cVar;
        this.f335036h = eVar;
        this.f335031c = gVar;
        this.f335034f = eVar2;
        this.f335035g = gVar2;
        this.f335032d = executor;
        this.f335029a = awVar;
        gVar.mo104877b().mo104264b(new C120450b(this));
        eVar2.mo38840a(new C120455c(this));
        gVar2.mo38849b(new C120456d(this));
    }

    /* renamed from: a */
    public final C47630c mo104761a() {
        if (!this.f335030b.get()) {
            C33578c cVar = this.f335033e;
            return C32558u.m60376a(cVar.f89766b, new C33576a(cVar, (C69577g) null)).mo51505c(new C33577b(cVar), cVar.f89767c).mo51505c(new C120462j(this), this.f335032d);
        }
        throw new C120465m("Unable to send request to focus policy", C65490b.UNABLE_TO_SEND_UTTERANCE_REQUEST, (Throwable) null);
    }

    /* renamed from: b */
    public final C60870cx mo104762b() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx a = this.f335036h.mo38993a();
        C120463k kVar = C120463k.f335028a;
        return C60846c.m92878g(a, Throwable.class, C47810es.m84963c(kVar), this.f335032d);
    }
}
