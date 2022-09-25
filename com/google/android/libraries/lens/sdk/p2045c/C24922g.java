package com.google.android.libraries.lens.sdk.p2045c;

import android.os.IBinder;

/* renamed from: com.google.android.libraries.lens.sdk.c.g */
/* compiled from: PG */
final class C24922g implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final C24914a f68042a;

    /* renamed from: b */
    final /* synthetic */ C24923h f68043b;

    public C24922g(C24923h hVar, C24914a aVar) {
        this.f68043b = hVar;
        this.f68042a = aVar;
    }

    public final void binderDied() {
        this.f68043b.f68045b.execute(new C24921f(this));
    }
}
