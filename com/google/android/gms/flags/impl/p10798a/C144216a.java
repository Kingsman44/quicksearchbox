package com.google.android.gms.flags.impl.p10798a;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.a.a */
/* compiled from: PG */
public final class C144216a {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static Object m234458a(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
