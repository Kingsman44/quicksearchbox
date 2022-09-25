package com.google.android.libraries.p1963i;

/* renamed from: com.google.android.libraries.i.ah */
/* compiled from: PG */
final class C23833ah implements Runnable {

    /* renamed from: a */
    private final Runnable f65254a;

    public C23833ah(Runnable runnable) {
        this.f65254a = runnable;
    }

    public final void run() {
        try {
            this.f65254a.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public final String toString() {
        return this.f65254a.toString();
    }
}
