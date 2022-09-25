package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.b.e.g.m */
/* compiled from: PG */
public final /* synthetic */ class C70060m {
    /* renamed from: a */
    public static /* synthetic */ boolean m101923a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
