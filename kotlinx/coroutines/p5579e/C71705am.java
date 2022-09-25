package kotlinx.coroutines.p5579e;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: kotlinx.coroutines.e.am */
/* compiled from: PG */
public final class C71705am {
    public volatile AtomicReferenceArray array;

    public C71705am(int i) {
        this.array = new AtomicReferenceArray(i);
    }

    /* renamed from: a */
    public final Object mo62965a(int i) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo62966b(int i, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, obj);
            return;
        }
        int i2 = i + 1;
        int i3 = length + length;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, obj);
        this.array = atomicReferenceArray2;
    }
}
