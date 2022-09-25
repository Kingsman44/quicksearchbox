package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.TimeUnit;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5497e.p5498a.C69830f;

/* renamed from: io.b.e.g.b */
/* compiled from: PG */
final class C70049b extends C70127s {

    /* renamed from: a */
    volatile boolean f186725a;

    /* renamed from: b */
    private final C69830f f186726b;

    /* renamed from: c */
    private final C69802a f186727c;

    /* renamed from: d */
    private final C69830f f186728d;

    /* renamed from: e */
    private final C70051d f186729e;

    public C70049b(C70051d dVar) {
        this.f186729e = dVar;
        C69830f fVar = new C69830f();
        this.f186726b = fVar;
        C69802a aVar = new C69802a();
        this.f186727c = aVar;
        C69830f fVar2 = new C69830f();
        this.f186728d = fVar2;
        fVar2.mo61462b(fVar);
        fVar2.mo61462b(aVar);
    }

    /* renamed from: a */
    public final C69803b mo61591a(Runnable runnable) {
        if (this.f186725a) {
            return C69829e.INSTANCE;
        }
        return this.f186729e.mo61613h(runnable, 0, TimeUnit.MILLISECONDS, this.f186726b);
    }

    /* renamed from: b */
    public final C69803b mo61456b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f186725a) {
            return C69829e.INSTANCE;
        }
        return this.f186729e.mo61613h(runnable, j, timeUnit, this.f186727c);
    }

    public final void dispose() {
        if (!this.f186725a) {
            this.f186725a = true;
            this.f186728d.dispose();
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
