package com.google.android.apps.gsa.shared.util.p7159c;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: com.google.android.apps.gsa.shared.util.c.cc */
/* compiled from: PG */
public final class C90933cc {
    @Deprecated
    /* renamed from: a */
    public static void m148546a(Future future) {
        try {
            C90877ak.m148472f(future);
        } catch (CancellationException | ExecutionException unused) {
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
    }

    @Deprecated
    /* renamed from: b */
    public static void m148547b(Future future, TimeUnit timeUnit) {
        try {
            C90877ak.m148473g(future, 1000, timeUnit);
        } catch (CancellationException | ExecutionException | TimeoutException unused) {
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
    }
}
