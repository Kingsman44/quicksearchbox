package androidx.biometric;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.aj */
/* compiled from: PG */
final class C0906aj implements Executor {

    /* renamed from: a */
    private final Handler f2991a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f2991a.post(runnable);
    }
}
