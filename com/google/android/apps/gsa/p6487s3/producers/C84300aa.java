package com.google.android.apps.gsa.p6487s3.producers;

import android.os.SystemClock;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.s3.producers.aa */
/* compiled from: PG */
public final class C84300aa {

    /* renamed from: a */
    private final long f229422a;

    public C84300aa(long j) {
        this.f229422a = j + SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final Object mo77841a(Future future) {
        try {
            return C90877ak.m148473g(future, Math.max(0, this.f229422a - SystemClock.elapsedRealtime()), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (ExecutionException e2) {
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            throw new IOException("Timed out waiting for task :", e3);
        } catch (CancellationException e4) {
            throw new IOException(e4);
        }
    }
}
