package com.google.android.libraries.performance.primes.p2398c;

import android.app.Application;
import android.content.Context;

/* renamed from: com.google.android.libraries.performance.primes.c.b */
/* compiled from: PG */
public final class C31220b {

    /* renamed from: a */
    public final C31223e f84117a;

    public C31220b(Context context, C31223e eVar) {
        this.f84117a = eVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(eVar.f84133a);
        application.registerComponentCallbacks(eVar.f84133a);
    }
}
