package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: io.b.e.g.f */
/* compiled from: PG */
final class C70053f implements Future {

    /* renamed from: a */
    final C69803b f186739a;

    public C70053f(C69803b bVar) {
        this.f186739a = bVar;
    }

    public final boolean cancel(boolean z) {
        this.f186739a.dispose();
        return false;
    }

    public final Object get() {
        return null;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }
}
