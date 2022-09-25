package androidx.camera.core;

import android.os.HandlerThread;

/* renamed from: androidx.camera.core.ce */
/* compiled from: PG */
public final /* synthetic */ class C1501ce implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ HandlerThread f4138a;

    public /* synthetic */ C1501ce(HandlerThread handlerThread) {
        this.f4138a = handlerThread;
    }

    public final void run() {
        this.f4138a.quitSafely();
    }
}
