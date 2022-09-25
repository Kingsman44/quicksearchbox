package androidx.camera.core;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.bi */
/* compiled from: PG */
final class C1463bi implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f4038a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "CameraX-image_capture_" + this.f4038a.getAndIncrement());
    }
}
