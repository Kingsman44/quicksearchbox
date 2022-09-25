package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ib */
final /* synthetic */ class C7003ib implements Executor {

    /* renamed from: a */
    private final Handler f22352a;

    private C7003ib(Handler handler) {
        this.f22352a = handler;
    }

    /* renamed from: a */
    static Executor m20666a(Handler handler) {
        return new C7003ib(handler);
    }

    public final void execute(Runnable runnable) {
        this.f22352a.post(runnable);
    }
}
