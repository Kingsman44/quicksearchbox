package androidx.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.camera.core.o */
/* compiled from: PG */
public final /* synthetic */ class C1565o implements RejectedExecutionHandler {

    /* renamed from: a */
    public static final /* synthetic */ C1565o f4290a = new C1565o();

    private /* synthetic */ C1565o() {
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C1477bw.m3980c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
