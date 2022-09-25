package com.google.android.libraries.p1703d;

import android.content.Context;

/* renamed from: com.google.android.libraries.d.q */
/* compiled from: PG */
public final /* synthetic */ class C20661q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f57928a;

    /* renamed from: b */
    public final /* synthetic */ C20668x f57929b;

    public /* synthetic */ C20661q(Context context, C20668x xVar) {
        this.f57928a = context;
        this.f57929b = xVar;
    }

    public final void run() {
        this.f57928a.unbindService(this.f57929b);
    }
}
