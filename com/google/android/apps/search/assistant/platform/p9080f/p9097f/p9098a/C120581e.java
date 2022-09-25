package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a;

import com.google.android.libraries.search.assistant.p2570h.p2578b.p2582d.C33470a;
import java.util.concurrent.CopyOnWriteArrayList;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.a.e */
/* compiled from: PG */
public final class C120581e {

    /* renamed from: a */
    private final C33470a f335394a;

    /* renamed from: b */
    private final CopyOnWriteArrayList f335395b = new CopyOnWriteArrayList();

    public C120581e(C33470a aVar) {
        C69664n.m101061g(aVar, "prefetchDebugStateMonitor");
        this.f335394a = aVar;
    }

    /* renamed from: a */
    public final void mo104852a(String str) {
        this.f335395b.add(str);
        C33470a aVar = this.f335394a;
        aVar.f89578a.mo38877d("Fulfillment Orchestration Events:", this.f335395b);
    }

    /* renamed from: b */
    public final void mo104853b(C120578b bVar) {
        C69664n.m101061g(bVar, "terminalFulfillmentProducer");
        new StringBuilder("Terminal Fulfillment Producer: ").append(bVar);
        mo104852a("Terminal Fulfillment Producer: ".concat(String.valueOf(bVar)));
    }
}
