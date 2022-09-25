package com.facebook.litho;

import android.util.Log;

/* renamed from: com.facebook.litho.ga */
/* compiled from: PG */
public abstract class C6348ga implements Runnable {

    /* renamed from: b */
    public final Throwable f18788b;

    public C6348ga(boolean z) {
        if (z) {
            Thread currentThread = Thread.currentThread();
            this.f18788b = new Throwable("Runnable instantiated on thread id: " + currentThread.getId() + ", name: " + currentThread.getName());
            return;
        }
        this.f18788b = null;
    }

    /* renamed from: a */
    public abstract void mo12842a(C6348ga gaVar);

    public final void run() {
        try {
            mo12842a(this);
        } catch (Throwable th) {
            if (this.f18788b != null) {
                Log.w("LithoThreadTracing", "--- start debug trace");
                Log.w("LithoThreadTracing", "Thread tracing stacktrace", this.f18788b);
                Log.w("LithoThreadTracing", "--- end debug trace");
            }
            throw th;
        }
    }
}
