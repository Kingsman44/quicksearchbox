package p5488io.p5490b.p5491a.p5493b;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.a.b.e */
/* compiled from: PG */
final class C69800e extends C70128t {

    /* renamed from: b */
    private final Handler f186190b;

    public C69800e(Handler handler) {
        this.f186190b = handler;
    }

    /* renamed from: a */
    public final C70127s mo61458a() {
        return new C69798c(this.f186190b);
    }

    /* renamed from: c */
    public final C69803b mo61459c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            Runnable d = C70101a.m102022d(runnable);
            Handler handler = this.f186190b;
            C69799d dVar = new C69799d(handler, d);
            this.f186190b.sendMessageDelayed(Message.obtain(handler, dVar), timeUnit.toMillis(j));
            return dVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
