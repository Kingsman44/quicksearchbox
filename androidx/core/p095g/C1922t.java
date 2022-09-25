package androidx.core.p095g;

import android.os.Handler;
import androidx.core.p097i.C1967b;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.g.t */
/* compiled from: PG */
public final class C1922t implements Runnable {

    /* renamed from: a */
    private final Callable f5816a;

    /* renamed from: b */
    private final C1967b f5817b;

    /* renamed from: c */
    private final Handler f5818c;

    public C1922t(Handler handler, Callable callable, C1967b bVar) {
        this.f5816a = callable;
        this.f5817b = bVar;
        this.f5818c = handler;
    }

    public final void run() {
        C1914l lVar;
        try {
            lVar = ((C1912j) this.f5816a).call();
        } catch (Exception unused) {
            lVar = null;
        }
        this.f5818c.post(new C1921s(this.f5817b, lVar));
    }
}
