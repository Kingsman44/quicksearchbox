package com.google.android.libraries.search.location.p3029a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.location.a.ad */
/* compiled from: PG */
final class C38584ad implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Set f101987a;

    /* renamed from: b */
    final /* synthetic */ C38586af f101988b;

    public C38584ad(C38586af afVar, Set set) {
        this.f101988b = afVar;
        this.f101987a = set;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C38586af.f101990a.mo56223a(this.f101988b.f101991b).mo56382g(th)).mo56372aa(53143)).mo56386p("Failed to get #hasAccessToLocationData.");
        C38586af.m67879l(this.f101987a, true);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C38586af.m67879l(this.f101987a, ((Boolean) obj).booleanValue());
    }
}
