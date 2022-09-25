package com.google.android.libraries.social.populous.logging;

import android.database.sqlite.SQLiteException;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42245m;
import com.google.protobuf.C62974ct;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.social.populous.logging.m */
/* compiled from: PG */
public final class C42578m {
    /* renamed from: a */
    public static int m75141a(Throwable th) {
        if (th instanceof TimeoutException) {
            return 5;
        }
        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
            return 4;
        }
        if (th instanceof C62974ct) {
            return 10;
        }
        if (th instanceof SecurityException) {
            return 3;
        }
        if (th instanceof C42245m) {
            int i = ((C42245m) th).f110596a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return 5;
            } else {
                if (i2 == 1 || i2 == 2) {
                    return 4;
                }
                if (i2 != 5) {
                    return 9;
                }
                return 3;
            }
        } else if (th instanceof SQLiteException) {
            int a = C42565ac.m75121a((SQLiteException) th) - 1;
            if (a != 3) {
                if (a == 4 || a == 9) {
                    return 4;
                }
                if (a == 12) {
                    return 6;
                }
                if (a != 23) {
                    if (a != 26) {
                        return 9;
                    }
                    return 10;
                }
            }
            return 3;
        } else if (th.getCause() != null) {
            return m75141a(th.getCause());
        } else {
            return 2;
        }
    }
}
