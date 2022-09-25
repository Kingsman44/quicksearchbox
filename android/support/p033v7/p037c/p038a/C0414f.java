package android.support.p033v7.p037c.p038a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: android.support.v7.c.a.f */
/* compiled from: PG */
final class C0414f implements Executor {

    /* renamed from: a */
    final Handler f1397a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f1397a.post(runnable);
    }
}
