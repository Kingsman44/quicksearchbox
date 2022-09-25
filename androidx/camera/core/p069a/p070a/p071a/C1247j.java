package androidx.camera.core.p069a.p070a.p071a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.a.a.a.j */
/* compiled from: PG */
public final class C1247j {

    /* renamed from: a */
    private static volatile ScheduledExecutorService f3642a;

    private C1247j() {
    }

    /* renamed from: a */
    public static ScheduledExecutorService m3414a() {
        if (f3642a != null) {
            return f3642a;
        }
        synchronized (C1247j.class) {
            if (f3642a == null) {
                f3642a = new C1244g(new Handler(Looper.getMainLooper()));
            }
        }
        return f3642a;
    }
}
