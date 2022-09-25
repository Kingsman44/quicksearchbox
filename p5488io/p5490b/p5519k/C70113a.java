package p5488io.p5490b.p5519k;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.b.k.a */
/* compiled from: PG */
public final /* synthetic */ class C70113a {
    /* renamed from: a */
    public static /* synthetic */ boolean m102026a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
