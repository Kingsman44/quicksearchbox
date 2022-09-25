package com.google.android.gms.learning.p10825e.p10826a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.dynamite.proxy.C144639i;
import com.google.android.gms.learning.dynamite.proxy.C144644n;
import com.google.common.base.C58835az;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.gms.learning.e.a.e */
/* compiled from: PG */
final class C144742e extends C144644n {

    /* renamed from: a */
    final /* synthetic */ long f391546a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f391547b;

    /* renamed from: c */
    final /* synthetic */ C144749l f391548c;

    public C144742e(C144749l lVar, long j, SettableFuture settableFuture) {
        this.f391548c = lVar;
        this.f391546a = j;
        this.f391547b = settableFuture;
    }

    /* renamed from: e */
    public final void mo120098e(Status status, long j, long j2) {
        C144748k kVar = this.f391548c.f391580i;
        if (kVar != null) {
            kVar.f391569e.addAndGet(kVar.f391565a.mo26884a() - this.f391546a);
            this.f391548c.f391580i.f391571g.addAndGet(j);
            this.f391548c.f391580i.f391570f.addAndGet(j2);
        }
        this.f391548c.f391574c.mo34866h("Could not acquire iterator: ".concat(String.valueOf(String.valueOf(status))));
        this.f391547b.mo57356n(new C58835az((Object) null, status));
    }

    /* renamed from: f */
    public final void mo120099f(C144639i iVar, long j, long j2) {
        C144748k kVar = this.f391548c.f391580i;
        if (kVar != null) {
            kVar.f391569e.addAndGet(kVar.f391565a.mo26884a() - this.f391546a);
            this.f391548c.f391580i.f391571g.addAndGet(j);
            this.f391548c.f391580i.f391570f.addAndGet(j2);
        }
        this.f391547b.mo57356n(new C58835az(iVar, (Object) null));
    }
}
