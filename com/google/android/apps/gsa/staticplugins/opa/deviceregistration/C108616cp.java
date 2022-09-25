package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.common.base.C58817ah;
import com.google.common.base.C58820ak;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cp */
/* compiled from: PG */
final class C108616cp extends k {

    /* renamed from: a */
    public final SettableFuture f302134a = new SettableFuture();

    /* renamed from: b */
    private final C58817ah f302135b;

    public C108616cp(C58817ah ahVar) {
        this.f302135b = ahVar;
    }

    /* renamed from: e */
    public static C108616cp m180628e() {
        return new C108616cp(C58820ak.f156611a);
    }

    /* renamed from: gf */
    public final void mo97023gf(Throwable th) {
        C59104x d = C108617cq.f302136a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "DeviceRequestHelper");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24156)).mo56386p("Non-Fatal (retry-able) error");
    }

    /* renamed from: gn */
    public final void mo97024gn(Throwable th) {
        this.f302134a.mo57357o(th);
    }

    /* renamed from: go */
    public final void mo97025go(Object obj) {
        this.f302134a.mo57356n(this.f302135b.apply(obj));
    }
}
