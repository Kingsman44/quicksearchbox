package com.google.android.apps.gsa.search.core.service;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.search.core.service.ae */
/* compiled from: PG */
final class C86609ae implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f233963a;

    /* renamed from: b */
    final /* synthetic */ long f233964b;

    /* renamed from: c */
    final /* synthetic */ C86610af f233965c;

    public C86609ae(C86610af afVar, long j, long j2) {
        this.f233965c = afVar;
        this.f233963a = j;
        this.f233964b = j2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C86610af.f233966a.mo56226d()).mo56382g(th)).mo56372aa(8381)).mo56388r("Requesting client %d to unbind immediately as the original task failed", this.f233963a);
        this.f233965c.f233971f.mo28212l("Request client to unbind", new C86607ac(this, this.f233963a));
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f233965c.f233971f.mo28213m("Request client to unbind", this.f233964b, new C86608ad(this, this.f233963a));
    }
}
