package com.google.android.gms.cast.framework.internal;

import android.os.Looper;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.cast.framework.internal.p */
/* compiled from: PG */
final class C143452p implements C143434a {

    /* renamed from: a */
    final /* synthetic */ C143454r f388985a;

    public C143452p(C143454r rVar) {
        this.f388985a = rVar;
    }

    /* renamed from: a */
    public final void mo118546a() {
        C143454r rVar = this.f388985a;
        C143454r.f388988a.mo118884b("Stopping RouteDiscovery.", new Object[0]);
        rVar.f388990c.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            rVar.f388992e.mo118694b(rVar);
        } else {
            new C144861c(Looper.getMainLooper()).post(new C143449m(rVar));
        }
    }

    /* renamed from: b */
    public final void mo118547b() {
        this.f388985a.mo118695m();
    }
}
