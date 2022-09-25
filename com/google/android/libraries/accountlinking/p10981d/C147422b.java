package com.google.android.libraries.accountlinking.p10981d;

import com.google.common.util.concurrent.C60916ec;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.accountlinking.d.b */
/* compiled from: PG */
public final class C147422b {
    /* renamed from: a */
    public static Throwable m240341a(Throwable th) {
        if (th == null) {
            return null;
        }
        if ((th instanceof ExecutionException) || (th instanceof C60916ec)) {
            return m240341a(th.getCause());
        }
        return th;
    }
}
