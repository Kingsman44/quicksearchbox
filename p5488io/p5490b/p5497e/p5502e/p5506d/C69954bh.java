package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70122n;
import p5488io.p5490b.C70123o;

/* renamed from: io.b.e.e.d.bh */
/* compiled from: PG */
public final class C69954bh implements C70122n {

    /* renamed from: a */
    private final AtomicReference f186454a;

    public C69954bh(AtomicReference atomicReference) {
        this.f186454a = atomicReference;
    }

    /* renamed from: p */
    public final void mo61539p(C70123o oVar) {
        C69953bg bgVar;
        C69949bc[] bcVarArr;
        C69949bc[] bcVarArr2;
        loop0:
        while (true) {
            bgVar = (C69953bg) this.f186454a.get();
            if (bgVar != null) {
                break;
            }
            C69953bg bgVar2 = new C69953bg(new C69955bi());
            AtomicReference atomicReference = this.f186454a;
            while (true) {
                if (atomicReference.compareAndSet((Object) null, bgVar2)) {
                    bgVar = bgVar2;
                    break loop0;
                } else if (atomicReference.get() != null) {
                }
            }
        }
        C69949bc bcVar = new C69949bc(bgVar, oVar);
        oVar.mo26850d(bcVar);
        do {
            bcVarArr = (C69949bc[]) bgVar.f186452e.get();
            if (bcVarArr == C69953bg.f186449b) {
                break;
            }
            int length = bcVarArr.length;
            bcVarArr2 = new C69949bc[(length + 1)];
            System.arraycopy(bcVarArr, 0, bcVarArr2, 0, length);
            bcVarArr2[length] = bcVar;
        } while (!C69952bf.m101648a(bgVar.f186452e, bcVarArr, bcVarArr2));
        if (bcVar.f186446d) {
            bgVar.mo61536f(bcVar);
        } else {
            bgVar.f186450c.mo61533b(bcVar);
        }
    }
}
