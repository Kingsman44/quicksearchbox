package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.a.d */
/* compiled from: PG */
public final class C120580d {

    /* renamed from: a */
    private final C120581e f335392a;

    /* renamed from: b */
    private final C120578b f335393b;

    public C120580d(C120581e eVar, C120578b bVar) {
        C69664n.m101061g(eVar, "orchestrationStateLogger");
        C69664n.m101061g(bVar, "baseFulfillmentProducer");
        this.f335392a = eVar;
        this.f335393b = bVar;
    }

    /* renamed from: h */
    private final void m199720h(C120578b bVar, C120577a aVar, boolean z) {
        C120581e eVar = this.f335392a;
        C120578b bVar2 = this.f335393b;
        C69664n.m101061g(bVar2, "from");
        C69664n.m101061g(bVar, "to");
        C69664n.m101061g(aVar, "reason");
        eVar.mo104852a("Fallback occurred from " + bVar2 + " to " + bVar + " (" + aVar + ")");
        if (z) {
            mo104847c(bVar);
        }
    }

    /* renamed from: a */
    public final void mo104845a(C120578b bVar, boolean z) {
        C69664n.m101061g(bVar, "to");
        m199720h(bVar, C120577a.EXCEPTION, z);
    }

    /* renamed from: b */
    public final void mo104846b(C120578b bVar, boolean z) {
        C69664n.m101061g(bVar, "to");
        m199720h(bVar, C120577a.NO_RESULT, z);
    }

    /* renamed from: c */
    public final void mo104847c(C120578b bVar) {
        C69664n.m101061g(bVar, "terminalProducer");
        this.f335392a.mo104853b(bVar);
    }

    /* renamed from: d */
    public final void mo104848d(C120578b bVar) {
        C69664n.m101061g(bVar, "to");
        m199720h(bVar, C120577a.LOW_QUALITY_ON_DEVICE_RESULT, true);
    }

    /* renamed from: e */
    public final void mo104849e(C120578b bVar) {
        C69664n.m101061g(bVar, "to");
        m199720h(bVar, C120577a.ON_DEVICE_MDA_DISABLED, true);
    }

    /* renamed from: f */
    public final void mo104850f(C120578b bVar) {
        C69664n.m101061g(bVar, "to");
        m199720h(bVar, C120577a.ON_DEVICE_MDA_FAILED, true);
    }

    /* renamed from: g */
    public final void mo104851g(C120578b bVar) {
        C69664n.m101061g(bVar, "to");
        m199720h(bVar, C120577a.ON_DEVICE_MDA_LOST, true);
    }
}
