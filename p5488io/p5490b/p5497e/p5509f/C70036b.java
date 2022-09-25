package p5488io.p5490b.p5497e.p5509f;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5497e.p5500c.C69846e;

/* renamed from: io.b.e.f.b */
/* compiled from: PG */
public final class C70036b implements C69846e {

    /* renamed from: a */
    private final AtomicReference f186680a = new AtomicReference();

    /* renamed from: b */
    private final AtomicReference f186681b;

    public C70036b() {
        AtomicReference atomicReference = new AtomicReference();
        this.f186681b = atomicReference;
        C70035a aVar = new C70035a();
        atomicReference.lazySet(aVar);
        mo61583d(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C70035a mo61582a() {
        return (C70035a) this.f186680a.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61475c() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.mo61479lN()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo61476i()
            if (r0 == 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5509f.C70036b.mo61475c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C70035a mo61583d(C70035a aVar) {
        return (C70035a) this.f186680a.getAndSet(aVar);
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return ((C70035a) this.f186681b.get()) == mo61582a();
    }

    /* renamed from: j */
    public final boolean mo61477j(Object obj) {
        if (obj != null) {
            C70035a aVar = new C70035a(obj);
            mo61583d(aVar).lazySet(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        C70035a aVar;
        C70035a aVar2 = (C70035a) this.f186681b.get();
        C70035a aVar3 = (C70035a) aVar2.get();
        if (aVar3 != null) {
            Object obj = aVar3.f186679a;
            aVar3.f186679a = null;
            this.f186681b.lazySet(aVar3);
            return obj;
        } else if (aVar2 == mo61582a()) {
            return null;
        } else {
            do {
                aVar = (C70035a) aVar2.get();
            } while (aVar == null);
            Object obj2 = aVar.f186679a;
            aVar.f186679a = null;
            this.f186681b.lazySet(aVar);
            return obj2;
        }
    }
}
