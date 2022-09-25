package com.google.android.libraries.p11029ao.p11032c;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ao.c.l */
/* compiled from: PG */
final class C147811l {
    /* renamed from: a */
    public static Object m240920a(Callable callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
