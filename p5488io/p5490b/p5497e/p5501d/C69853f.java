package p5488io.p5490b.p5497e.p5501d;

import java.util.concurrent.CountDownLatch;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.C70100i;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: io.b.e.d.f */
/* compiled from: PG */
public final class C69853f extends CountDownLatch implements C70130v, C69801b, C70100i {

    /* renamed from: a */
    public Object f186222a;

    /* renamed from: b */
    public Throwable f186223b;

    /* renamed from: c */
    public C69803b f186224c;

    /* renamed from: d */
    public volatile boolean f186225d;

    public C69853f() {
        super(1);
    }

    /* renamed from: a */
    public final void mo26090a() {
        countDown();
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186223b = th;
        countDown();
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        this.f186222a = obj;
        countDown();
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        this.f186224c = bVar;
        if (this.f186225d) {
            bVar.dispose();
        }
    }
}
