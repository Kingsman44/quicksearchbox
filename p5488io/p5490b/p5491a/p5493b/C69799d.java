package p5488io.p5490b.p5491a.p5493b;

import android.os.Handler;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.a.b.d */
/* compiled from: PG */
final class C69799d implements Runnable, C69803b {

    /* renamed from: a */
    private final Handler f186187a;

    /* renamed from: b */
    private final Runnable f186188b;

    /* renamed from: c */
    private volatile boolean f186189c;

    public C69799d(Handler handler, Runnable runnable) {
        this.f186187a = handler;
        this.f186188b = runnable;
    }

    public final void dispose() {
        this.f186187a.removeCallbacks(this);
        this.f186189c = true;
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final void run() {
        try {
            this.f186188b.run();
        } catch (Throwable th) {
            C70101a.m102023e(th);
        }
    }
}
