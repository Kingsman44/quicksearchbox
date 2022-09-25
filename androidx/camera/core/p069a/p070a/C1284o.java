package androidx.camera.core.p069a.p070a;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.camera.core.a.a.o */
/* compiled from: PG */
public final class C1284o {

    /* renamed from: a */
    private static volatile Handler f3720a;

    private C1284o() {
    }

    /* renamed from: a */
    public static Handler m3461a() {
        if (f3720a != null) {
            return f3720a;
        }
        synchronized (C1284o.class) {
            if (f3720a == null) {
                f3720a = Handler.createAsync(Looper.getMainLooper());
            }
        }
        return f3720a;
    }
}
