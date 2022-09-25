package p5488io.p5490b.p5497e.p5498a;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.b.e.a.c */
/* compiled from: PG */
public final /* synthetic */ class C69827c {
    /* renamed from: a */
    public static /* synthetic */ boolean m101304a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
