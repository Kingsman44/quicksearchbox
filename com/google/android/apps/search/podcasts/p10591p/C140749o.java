package com.google.android.apps.search.podcasts.p10591p;

import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.p.o */
/* compiled from: PG */
public final class C140749o {

    /* renamed from: a */
    public final C39141kp f382198a;

    /* renamed from: b */
    private final C140745k f382199b;

    /* renamed from: c */
    private final C69613f f382200c;

    public C140749o(C39141kp kpVar, C140745k kVar, String str) {
        C69664n.m101061g(kpVar, "clientStreamz");
        C69664n.m101061g(kVar, "podcastsClientStreamz");
        C69664n.m101061g(str, "versionName");
        this.f382198a = kpVar;
        this.f382199b = kVar;
        this.f382200c = new C69747m(new C140748n(str));
    }

    /* renamed from: a */
    public final String mo115852a() {
        return (String) this.f382200c.mo5768a();
    }

    /* renamed from: b */
    public final void mo115853b(String str, C140735a aVar) {
        C69664n.m101061g(str, "tabType");
        C69664n.m101061g(aVar, "loadStatus");
        C140745k kVar = this.f382199b;
        ((C19567d) kVar.f382185c.mo6453a()).mo24822a(1, str, aVar.mo115848a());
    }

    /* renamed from: c */
    public final void mo115854c(C140735a aVar) {
        C69664n.m101061g(aVar, "loadStatus");
        C140745k kVar = this.f382199b;
        ((C19567d) kVar.f382184b.mo6453a()).mo24822a(1, aVar.mo115848a());
    }

    /* renamed from: d */
    public final void mo115855d(C140735a aVar) {
        C69664n.m101061g(aVar, "loadStatus");
        C140745k kVar = this.f382199b;
        ((C19567d) kVar.f382186d.mo6453a()).mo24822a(1, aVar.mo115848a());
    }
}
