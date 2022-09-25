package com.google.android.gms.learning.dynamite.training;

import android.os.IBinder;
import com.google.common.base.C58835az;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.gms.learning.dynamite.training.bm */
/* compiled from: PG */
public final /* synthetic */ class C144697bm implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ C144704bt f391476a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f391477b;

    public /* synthetic */ C144697bm(C144704bt btVar, SettableFuture settableFuture) {
        this.f391476a = btVar;
        this.f391477b = settableFuture;
    }

    public final void binderDied() {
        C144704bt btVar = this.f391476a;
        SettableFuture settableFuture = this.f391477b;
        C144704bt.f391492a.mo34866h("Binder died");
        btVar.f391499h.mo120056h(1186);
        settableFuture.mo57356n(new C58835az((Object) null, 1));
    }
}
