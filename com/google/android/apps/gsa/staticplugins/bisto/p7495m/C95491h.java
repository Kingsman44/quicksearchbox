package com.google.android.apps.gsa.staticplugins.bisto.p7495m;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124547c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.m.h */
/* compiled from: PG */
final class C95491h implements C22868d {

    /* renamed from: a */
    final /* synthetic */ String f267214a;

    /* renamed from: b */
    final /* synthetic */ C124547c f267215b;

    /* renamed from: c */
    final /* synthetic */ C95493j f267216c;

    public C95491h(C95493j jVar, String str, C124547c cVar) {
        this.f267216c = jVar;
        this.f267214a = str;
        this.f267215b = cVar;
    }

    /* renamed from: c */
    private final void m157944c() {
        this.f267216c.f267226j.remove(this.f267214a);
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (th instanceof C95492i) {
            C59071e eVar = C95493j.f267217a;
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C59104x c = C95493j.f267217a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DevCusDownloader");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15106)).mo56386p("Download failed");
        }
        this.f267216c.mo89390c(this.f267214a, this.f267215b);
        m157944c();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C59071e eVar = C95493j.f267217a;
        C58976aa aaVar = C58975e.f156826a;
        m157944c();
    }
}
