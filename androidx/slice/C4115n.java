package androidx.slice;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.slice.n */
/* compiled from: PG */
final class C4115n implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f13150a;

    public C4115n(Handler handler) {
        this.f13150a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f13150a.post(runnable);
    }
}
