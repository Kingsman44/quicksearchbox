package p5488io.p5490b.p5491a.p5493b;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.a.b.c */
/* compiled from: PG */
final class C69798c extends C70127s {

    /* renamed from: a */
    private final Handler f186185a;

    /* renamed from: b */
    private volatile boolean f186186b;

    public C69798c(Handler handler) {
        this.f186185a = handler;
    }

    public final void dispose() {
        this.f186186b = true;
        this.f186185a.removeCallbacksAndMessages(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: b */
    public final C69803b mo61456b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        } else if (this.f186186b) {
            return C69829e.INSTANCE;
        } else {
            Runnable d = C70101a.m102022d(runnable);
            Handler handler = this.f186185a;
            C69799d dVar = new C69799d(handler, d);
            Message obtain = Message.obtain(handler, dVar);
            obtain.obj = this;
            this.f186185a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f186186b) {
                return dVar;
            }
            this.f186185a.removeCallbacks(dVar);
            return C69829e.INSTANCE;
        }
    }
}
