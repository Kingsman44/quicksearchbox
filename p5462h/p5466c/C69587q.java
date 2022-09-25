package p5462h.p5466c;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: h.c.q */
/* compiled from: PG */
public final /* synthetic */ class C69587q {
    /* renamed from: a */
    public static /* synthetic */ boolean m100999a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
