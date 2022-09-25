package com.google.android.gms.learning.p10825e.p10826a;

import android.os.IBinder;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.gms.learning.e.a.n */
/* compiled from: PG */
public final /* synthetic */ class C144751n implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ C144755r f391593a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f391594b;

    public /* synthetic */ C144751n(C144755r rVar, SettableFuture settableFuture) {
        this.f391593a = rVar;
        this.f391594b = settableFuture;
    }

    public final void binderDied() {
        C144755r rVar = this.f391593a;
        SettableFuture settableFuture = this.f391594b;
        rVar.f391600b.mo34866h("Binder died");
        rVar.f391599a.mo120056h(1137);
        settableFuture.mo57356n((Object) null);
    }
}
