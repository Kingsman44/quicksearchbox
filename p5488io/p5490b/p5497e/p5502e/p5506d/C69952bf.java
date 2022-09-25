package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.b.e.e.d.bf */
/* compiled from: PG */
public final /* synthetic */ class C69952bf {
    /* renamed from: a */
    public static /* synthetic */ boolean m101648a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
