package com.google.android.libraries.p1963i;

import android.util.Log;
import java.util.logging.Level;

/* renamed from: com.google.android.libraries.i.ae */
/* compiled from: PG */
final class C23830ae implements Runnable {

    /* renamed from: a */
    private final Runnable f65251a;

    public C23830ae(Runnable runnable) {
        this.f65251a = runnable;
    }

    public final void run() {
        try {
            this.f65251a.run();
        } catch (Throwable th) {
            C23831af.f65252a.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ErrorLoggingExecutorService$LoggingRunnable", "run", "Uncaught exception from runnable", th);
            Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
        }
    }

    public final String toString() {
        return this.f65251a.toString();
    }
}
