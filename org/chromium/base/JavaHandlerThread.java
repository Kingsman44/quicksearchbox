package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;

/* compiled from: PG */
public class JavaHandlerThread {

    /* renamed from: a */
    public final HandlerThread f192497a;

    /* renamed from: b */
    public Throwable f192498b;

    public JavaHandlerThread(String str, int i) {
        this.f192497a = new HandlerThread(str, i);
    }

    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    private Throwable getUncaughtExceptionIfAny() {
        return this.f192498b;
    }

    private boolean isAlive() {
        return this.f192497a.isAlive();
    }

    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.f192497a.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.f192497a.setUncaughtExceptionHandler(new C72385k(this));
    }

    private void quitThreadSafely(long j) {
        new Handler(this.f192497a.getLooper()).post(new C72384j(this, j));
        this.f192497a.getLooper().quitSafely();
    }

    private void startAndInitialize(long j, long j2) {
        if (this.f192497a.getState() == Thread.State.NEW) {
            this.f192497a.start();
        }
        new Handler(this.f192497a.getLooper()).post(new C72383i(j, j2));
    }
}
