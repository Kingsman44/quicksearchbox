package com.google.android.libraries.social.populous.logging;

import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.social.populous.logging.e */
/* compiled from: PG */
public final class C42570e {
    /* renamed from: a */
    public static int m75127a(int i, int i2) {
        int i3 = i - 1;
        if (i != 0) {
            return (i3 == 1 || i3 == 17) ? i2 == 0 ? 3 : 2 : (i3 == 12 || i3 == 13) ? 5 : 4;
        }
        throw null;
    }

    /* renamed from: b */
    public static int m75128b(Throwable th) {
        return th instanceof CancellationException ? 5 : 4;
    }
}
