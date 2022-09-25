package androidx.camera.core;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.p */
/* compiled from: PG */
final class C1566p implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f4291a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", new Object[]{Integer.valueOf(this.f4291a.getAndIncrement())}));
        return thread;
    }
}
