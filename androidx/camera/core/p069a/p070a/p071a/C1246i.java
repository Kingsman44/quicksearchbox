package androidx.camera.core.p069a.p070a.p071a;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: androidx.camera.core.a.a.a.i */
/* compiled from: PG */
public final class C1246i implements Executor {

    /* renamed from: a */
    private static volatile Executor f3640a;

    /* renamed from: b */
    private final ExecutorService f3641b = Executors.newFixedThreadPool(2, new C1245h());

    /* renamed from: a */
    public static Executor m3413a() {
        if (f3640a != null) {
            return f3640a;
        }
        synchronized (C1246i.class) {
            if (f3640a == null) {
                f3640a = new C1246i();
            }
        }
        return f3640a;
    }

    public final void execute(Runnable runnable) {
        this.f3641b.execute(runnable);
    }
}
