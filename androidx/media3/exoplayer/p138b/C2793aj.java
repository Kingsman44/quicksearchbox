package androidx.media3.exoplayer.p138b;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.media3.exoplayer.b.aj */
/* compiled from: PG */
public final /* synthetic */ class C2793aj implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f7718a;

    public /* synthetic */ C2793aj(Handler handler) {
        this.f7718a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f7718a.post(runnable);
    }
}
