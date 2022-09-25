package androidx.camera.core.p069a.p070a.p071a;

import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.a.a.a.a */
/* compiled from: PG */
public final class C1238a implements Executor {

    /* renamed from: a */
    private static volatile C1238a f3628a;

    /* renamed from: a */
    public static Executor m3410a() {
        if (f3628a != null) {
            return f3628a;
        }
        synchronized (C1238a.class) {
            if (f3628a == null) {
                f3628a = new C1238a();
            }
        }
        return f3628a;
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
