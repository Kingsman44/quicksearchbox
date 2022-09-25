package kotlinx.coroutines;

import java.util.concurrent.Future;

/* renamed from: kotlinx.coroutines.bo */
/* compiled from: PG */
final class C71614bo implements C71615bp {

    /* renamed from: a */
    private final Future f191050a;

    public C71614bo(Future future) {
        this.f191050a = future;
    }

    /* renamed from: lT */
    public final void mo62732lT() {
        this.f191050a.cancel(false);
    }

    public final String toString() {
        Future future = this.f191050a;
        return "DisposableFutureHandle[" + future + "]";
    }
}
