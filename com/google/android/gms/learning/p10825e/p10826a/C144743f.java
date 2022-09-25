package com.google.android.gms.learning.p10825e.p10826a;

import android.os.IBinder;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.learning.e.a.f */
/* compiled from: PG */
final class C144743f implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final AtomicReference f391549a = new AtomicReference();

    /* renamed from: b */
    final /* synthetic */ C144749l f391550b;

    public C144743f(C144749l lVar) {
        this.f391550b = lVar;
    }

    public final void binderDied() {
        this.f391550b.f391574c.mo34866h("Binder died!");
        Future future = (Future) this.f391549a.getAndSet((Object) null);
        if (future != null) {
            this.f391550b.f391574c.mo34866h("Cancelling pending future!");
            future.cancel(false);
        }
    }
}
