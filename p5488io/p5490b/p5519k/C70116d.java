package p5488io.p5490b.p5519k;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.b.k.d */
/* compiled from: PG */
public final /* synthetic */ class C70116d {
    /* renamed from: a */
    public static /* synthetic */ boolean m102038a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
