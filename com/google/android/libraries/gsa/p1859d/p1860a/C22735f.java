package com.google.android.libraries.gsa.p1859d.p1860a;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.d.a.f */
/* compiled from: PG */
public final class C22735f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f62556a;

    public C22735f(SettableFuture settableFuture) {
        this.f62556a = settableFuture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f62556a.mo57357o(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            this.f62556a.mo57357o(new Exception("No response received."));
        } else {
            this.f62556a.mo57356n(guVar.get(0));
        }
    }
}
