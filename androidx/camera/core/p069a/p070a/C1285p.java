package androidx.camera.core.p069a.p070a;

import android.os.Looper;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.camera.core.a.a.p */
/* compiled from: PG */
public final class C1285p {
    /* renamed from: a */
    public static void m3462a() {
        C1974i.m5315c(m3463b(), "Not in application's main thread");
    }

    /* renamed from: b */
    public static boolean m3463b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
