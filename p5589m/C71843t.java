package p5589m;

import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.t */
/* compiled from: PG */
public final class C71843t {

    /* renamed from: a */
    private static final C71842s f191380a = new C71842s(new byte[0], 0, 0, false);

    /* renamed from: b */
    private static final int f191381b;

    /* renamed from: c */
    private static final AtomicReference[] f191382c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int highestOneBit = Integer.highestOneBit((availableProcessors + availableProcessors) - 1);
        f191381b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f191382c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final C71842s m105210a() {
        AtomicReference c = m105212c();
        C71842s sVar = f191380a;
        C71842s sVar2 = (C71842s) c.getAndSet(sVar);
        if (sVar2 == sVar) {
            return new C71842s();
        }
        if (sVar2 == null) {
            c.set((Object) null);
            return new C71842s();
        }
        c.set(sVar2.f191378f);
        sVar2.f191378f = null;
        sVar2.f191375c = 0;
        return sVar2;
    }

    /* renamed from: b */
    public static final void m105211b(C71842s sVar) {
        C69664n.m101061g(sVar, "segment");
        if (sVar.f191378f != null || sVar.f191379g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!sVar.f191376d) {
            AtomicReference c = m105212c();
            C71842s sVar2 = f191380a;
            C71842s sVar3 = (C71842s) c.getAndSet(sVar2);
            if (sVar3 != sVar2) {
                int i = sVar3 != null ? sVar3.f191375c : 0;
                if (i >= 65536) {
                    c.set(sVar3);
                    return;
                }
                sVar.f191378f = sVar3;
                sVar.f191374b = 0;
                sVar.f191375c = i + 8192;
                c.set(sVar);
            }
        }
    }

    /* renamed from: c */
    private static final AtomicReference m105212c() {
        return f191382c[(int) (Thread.currentThread().getId() & (((long) f191381b) - 1))];
    }
}
