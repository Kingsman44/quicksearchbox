package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.util.Log;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.o */
/* compiled from: PG */
final class C31609o implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            Log.i("ClearcutMetricXmitter", "Transmission has failed: ".concat(String.valueOf(String.valueOf(th))));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        Log.v("ClearcutMetricXmitter", "Transmission is done.");
    }
}
