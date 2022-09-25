package androidx.mediarouter.p175a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.mediarouter.a.a */
/* compiled from: PG */
public final /* synthetic */ class C3664a implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f11792a;

    public /* synthetic */ C3664a(Handler handler) {
        this.f11792a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f11792a.post(runnable);
    }
}
