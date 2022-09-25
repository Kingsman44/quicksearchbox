package androidx.camera.core;

import java.util.concurrent.ExecutorService;

/* renamed from: androidx.camera.core.av */
/* compiled from: PG */
public final /* synthetic */ class C1421av implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ExecutorService f3977a;

    public /* synthetic */ C1421av(ExecutorService executorService) {
        this.f3977a = executorService;
    }

    public final void run() {
        this.f3977a.shutdown();
    }
}
