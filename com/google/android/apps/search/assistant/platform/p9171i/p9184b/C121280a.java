package com.google.android.apps.search.assistant.platform.p9171i.p9184b;

import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9198g.C121339a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.a */
/* compiled from: PG */
final class C121280a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C121339a f336853a;

    /* renamed from: b */
    final /* synthetic */ C121287b f336854b;

    public C121280a(C121287b bVar, C121339a aVar) {
        this.f336854b = bVar;
        this.f336853a = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C121287b.f336856a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TapasIndexerAcc");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(35760)).mo56386p("#startOffline#onFailure");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f336854b) {
            this.f336854b.f336857b = Optional.m71637of(this.f336853a);
        }
    }
}
