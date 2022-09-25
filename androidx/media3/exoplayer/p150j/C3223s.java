package androidx.media3.exoplayer.p150j;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.media3.exoplayer.j.s */
/* compiled from: PG */
public final /* synthetic */ class C3223s implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f9689a;

    public /* synthetic */ C3223s(Handler handler) {
        this.f9689a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f9689a.post(runnable);
    }
}
