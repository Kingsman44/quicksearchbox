package com.google.android.libraries.social.populous.logging;

import com.google.android.libraries.social.populous.p3289c.p3293d.C42245m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.social.populous.logging.ab */
/* compiled from: PG */
public final class C42564ab {
    /* renamed from: a */
    public static int m75120a(Throwable th) {
        if (th instanceof C42245m) {
            int b = ((C42245m) th).mo44927b() - 1;
            if (b == 2) {
                return 3;
            }
            if (b == 3) {
                return 6;
            }
            if (b == 5) {
                return 9;
            }
            if (b == 6) {
                return 7;
            }
            if (b == 7) {
                return 10;
            }
            if (b == 8) {
                return 11;
            }
            if (b == 18) {
                return 12;
            }
            if (b == 19) {
                return 13;
            }
            switch (b) {
                case 11:
                    return 8;
                case 12:
                    return 4;
                case 13:
                    return 5;
                default:
                    return 1;
            }
        } else if (th instanceof TimeoutException) {
            return 8;
        } else {
            if (th instanceof InterruptedException) {
                return 5;
            }
            if (th instanceof CancellationException) {
                return 4;
            }
            if (th.getCause() != null) {
                return m75120a(th.getCause());
            }
            return 3;
        }
    }
}
