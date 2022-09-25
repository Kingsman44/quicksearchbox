package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.common.util.concurrent.o */
/* compiled from: PG */
final class C60927o extends C60926n {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f165043a;

    /* renamed from: b */
    final AtomicIntegerFieldUpdater f165044b;

    public C60927o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f165043a = atomicReferenceFieldUpdater;
        this.f165044b = atomicIntegerFieldUpdater;
    }

    /* renamed from: a */
    public final int mo57426a(C60929q qVar) {
        return this.f165044b.decrementAndGet(qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP:0: B:1:0x0002->B:4:0x000e, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57427b(com.google.common.util.concurrent.C60929q r3, java.util.Set r4) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f165043a
        L_0x0002:
            r1 = 0
            boolean r1 = r0.compareAndSet(r3, r1, r4)
            if (r1 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L_0x0002
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60927o.mo57427b(com.google.common.util.concurrent.q, java.util.Set):void");
    }
}
