package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.ThreadFactory;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.C70128t;

/* renamed from: io.b.e.g.s */
/* compiled from: PG */
public final class C70066s extends C70128t {

    /* renamed from: b */
    public static final C70069v f186780b = new C70069v("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* renamed from: c */
    final ThreadFactory f186781c;

    public C70066s() {
        throw null;
    }

    public C70066s(ThreadFactory threadFactory) {
        this.f186781c = threadFactory;
    }

    /* renamed from: a */
    public final C70127s mo61458a() {
        return new C70067t(this.f186781c);
    }
}
