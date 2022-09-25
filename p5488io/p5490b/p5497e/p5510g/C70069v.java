package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.b.e.g.v */
/* compiled from: PG */
public final class C70069v extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a */
    final String f186784a;

    /* renamed from: b */
    final int f186785b;

    /* renamed from: c */
    final boolean f186786c;

    public C70069v(String str) {
        this(str, 5, false);
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f186784a + '-' + incrementAndGet();
        Thread uVar = this.f186786c ? new C70068u(runnable, str) : new Thread(runnable, str);
        uVar.setPriority(this.f186785b);
        uVar.setDaemon(true);
        return uVar;
    }

    public final String toString() {
        String str = this.f186784a;
        return "RxThreadFactory[" + str + "]";
    }

    public C70069v(String str, int i, boolean z) {
        this.f186784a = str;
        this.f186785b = i;
        this.f186786c = z;
    }
}
