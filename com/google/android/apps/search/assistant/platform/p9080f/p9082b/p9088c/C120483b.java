package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120509f;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120392a;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.b */
/* compiled from: PG */
final class C120483b implements C120511h {

    /* renamed from: a */
    private final C32534ai f335071a;

    /* renamed from: b */
    private final C120392a f335072b;

    /* renamed from: c */
    private final AtomicBoolean f335073c = new AtomicBoolean(false);

    public C120483b(C32534ai aiVar, C120392a aVar) {
        C69664n.m101061g(aiVar, "buffer");
        C69664n.m101061g(aVar, "backendSession");
        this.f335071a = aiVar;
        this.f335072b = aVar;
    }

    /* renamed from: a */
    public final C120507d mo104768a() {
        C120507d a = this.f335072b.mo104739a();
        C69664n.m101060f(a, "backendSession.config()");
        return a;
    }

    /* renamed from: b */
    public final C60870cx mo104769b() {
        C60870cx c = this.f335072b.mo104741c();
        C69664n.m101060f(c, "backendSession.micOpenElapsedRealtime()");
        return c;
    }

    /* renamed from: c */
    public final C60870cx mo104770c(C120509f fVar) {
        C69664n.m101061g(fVar, "consumer");
        return this.f335071a.mo38133a(new C120482a(fVar));
    }

    public final /* synthetic */ void close() {
        mo104773e(C120510g.RESOURCE_NO_LONGER_NEEDED);
    }

    /* renamed from: d */
    public final Optional mo104772d() {
        Optional d = this.f335072b.mo104743d();
        C69664n.m101060f(d, "backendSession.hotwordEvent()");
        return d;
    }

    /* renamed from: e */
    public final void mo104773e(C120510g gVar) {
        C69664n.m101061g(gVar, "reason");
        if (this.f335073c.getAndSet(true)) {
            C59052c cVar = (C59052c) C120498q.f335119a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ConvEngine.Audio");
            String str = gVar.f335156i;
            cVar.mo56379ah(new C59094n(35468));
            cVar.mo56389s("Ignore closing AudioInputSession on %s", str);
            return;
        }
        C59052c cVar2 = (C59052c) C120498q.f335119a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "ConvEngine.Audio");
        String str2 = gVar.f335156i;
        cVar2.mo56379ah(new C59094n(35467));
        cVar2.mo56389s("Closing AudioInputSession on %s", str2);
        this.f335071a.mo38135c((Throwable) null);
        this.f335072b.close();
    }
}
