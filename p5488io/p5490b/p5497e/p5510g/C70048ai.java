package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.TimeUnit;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.g.ai */
/* compiled from: PG */
public final class C70048ai extends C70128t {
    /* renamed from: a */
    public final C70127s mo61458a() {
        return new C70047ah();
    }

    /* renamed from: b */
    public final C69803b mo61593b(Runnable runnable) {
        C70101a.m102022d(runnable).run();
        return C69829e.INSTANCE;
    }

    /* renamed from: c */
    public final C69803b mo61459c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C70101a.m102022d(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C70101a.m102023e(e);
        }
        return C69829e.INSTANCE;
    }
}
