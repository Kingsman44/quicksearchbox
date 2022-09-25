package androidx.biometric;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.u */
/* compiled from: PG */
final class C0947u implements Executor {

    /* renamed from: a */
    private final Handler f3044a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f3044a.post(runnable);
    }
}
