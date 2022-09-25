package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bb */
/* compiled from: PG */
final class C6814bb {

    /* renamed from: a */
    private final Context f21578a;

    /* renamed from: b */
    private final C6811az f21579b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f21580c;

    public C6814bb(Context context, Handler handler, C6813ba baVar) {
        this.f21578a = context.getApplicationContext();
        this.f21579b = new C6811az(this, handler, baVar);
    }

    /* renamed from: a */
    public final void mo15492a(boolean z) {
        if (this.f21580c) {
            this.f21578a.unregisterReceiver(this.f21579b);
            this.f21580c = false;
        }
    }
}
