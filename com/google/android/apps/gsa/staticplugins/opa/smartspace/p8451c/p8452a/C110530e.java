package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.p8452a;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.a.e */
/* compiled from: PG */
final class C110530e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C110531f f308143a;

    public C110530e(C110531f fVar) {
        this.f308143a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f308143a.f308145b.mo56226d()).mo56382g(th)).mo56372aa(26579)).mo56386p("Failed to schedule calendar refresh task status check worker");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        UUID uuid = (UUID) obj;
        ((C58970a) ((C58970a) this.f308143a.f308145b.mo56224b()).mo56372aa(26580)).mo56386p("Scheduled calendar refresh task status check worker successfully");
    }
}
