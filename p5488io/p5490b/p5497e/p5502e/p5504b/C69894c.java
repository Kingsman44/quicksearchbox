package p5488io.p5490b.p5497e.p5502e.p5504b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.b.e.e.b.c */
/* compiled from: PG */
public final /* synthetic */ class C69894c {
    /* renamed from: a */
    public static /* synthetic */ boolean m101474a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
