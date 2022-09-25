package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.p3289c.p3293d.C42245m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.social.populous.core.bj */
/* compiled from: PG */
public final class C42284bj {
    /* renamed from: a */
    public static int m74440a(Throwable th) {
        if (th instanceof C42245m) {
            return ((C42245m) th).mo44927b();
        }
        if (th instanceof TimeoutException) {
            return 12;
        }
        if (th instanceof InterruptedException) {
            return 14;
        }
        if (th instanceof CancellationException) {
            return 13;
        }
        if (th.getCause() != null) {
            return m74440a(th.getCause());
        }
        return 3;
    }
}
