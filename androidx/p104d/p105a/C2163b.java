package androidx.p104d.p105a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: androidx.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C2163b {
    /* renamed from: a */
    public static /* synthetic */ boolean m6018a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
