package androidx.work.impl.utils.p209a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: androidx.work.impl.utils.a.f */
/* compiled from: PG */
public final /* synthetic */ class C4572f {
    /* renamed from: a */
    public static /* synthetic */ boolean m12961a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
