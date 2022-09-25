package com.google.android.apps.gsa.shared.p7129r;

import android.os.HandlerThread;
import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.apps.gsa.shared.r.i */
/* compiled from: PG */
public final /* synthetic */ class C90467i implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f252721a;

    /* renamed from: b */
    public final /* synthetic */ HandlerThread f252722b;

    public /* synthetic */ C90467i(CountDownLatch countDownLatch, HandlerThread handlerThread) {
        this.f252721a = countDownLatch;
        this.f252722b = handlerThread;
    }

    public final void onPixelCopyFinished(int i) {
        CountDownLatch countDownLatch = this.f252721a;
        HandlerThread handlerThread = this.f252722b;
        countDownLatch.countDown();
        handlerThread.quitSafely();
    }
}
