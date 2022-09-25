package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.app.ActivityManager;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.f */
/* compiled from: PG */
public final /* synthetic */ class C31600f implements C58881cr {

    /* renamed from: a */
    public static final /* synthetic */ C31600f f85064a = new C31600f();

    private /* synthetic */ C31600f() {
    }

    /* renamed from: a */
    public final Object mo6453a() {
        boolean z;
        if (ActivityManager.isUserAMonkey()) {
            z = true;
        } else {
            z = ActivityManager.isRunningInUserTestHarness();
        }
        return Boolean.valueOf(z);
    }
}
