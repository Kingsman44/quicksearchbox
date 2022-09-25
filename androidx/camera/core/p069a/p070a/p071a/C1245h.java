package androidx.camera.core.p069a.p070a.p071a;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.a.a.a.h */
/* compiled from: PG */
final class C1245h implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f3639a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", new Object[]{Integer.valueOf(this.f3639a.getAndIncrement())}));
        return thread;
    }
}
