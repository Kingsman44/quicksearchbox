package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.b.e.e.d.bn */
/* compiled from: PG */
public final /* synthetic */ class C69960bn {
    /* renamed from: a */
    public static /* synthetic */ boolean m101672a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
