package p5488io.p5490b.p5497e.p5501d;

import java.util.concurrent.CountDownLatch;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: io.b.e.d.d */
/* compiled from: PG */
public abstract class C69851d extends CountDownLatch implements C70123o, C69803b {

    /* renamed from: a */
    public Object f186218a;

    /* renamed from: b */
    public Throwable f186219b;

    /* renamed from: c */
    C69803b f186220c;

    /* renamed from: d */
    volatile boolean f186221d;

    public C69851d() {
        super(1);
    }

    /* renamed from: a */
    public final void mo25986a() {
        countDown();
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        this.f186220c = bVar;
        if (this.f186221d) {
            bVar.dispose();
        }
    }

    public final void dispose() {
        this.f186221d = true;
        C69803b bVar = this.f186220c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
