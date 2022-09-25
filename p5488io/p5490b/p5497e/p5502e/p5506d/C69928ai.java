package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70120l;
import p5488io.p5490b.C70123o;

/* renamed from: io.b.e.e.d.ai */
/* compiled from: PG */
public final class C69928ai extends C70120l {

    /* renamed from: a */
    final Object[] f186389a;

    public C69928ai(Object[] objArr) {
        this.f186389a = objArr;
    }

    /* renamed from: q */
    public final void mo61493q(C70123o oVar) {
        C69927ah ahVar = new C69927ah(oVar, this.f186389a);
        oVar.mo26850d(ahVar);
        if (!ahVar.f186387d) {
            Object[] objArr = ahVar.f186385b;
            for (int i = 0; i < 2 && !ahVar.f186388e; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    C70123o oVar2 = ahVar.f186384a;
                    oVar2.mo25987b(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                ahVar.f186384a.mo25988lL(obj);
            }
            if (!ahVar.f186388e) {
                ahVar.f186384a.mo25986a();
            }
        }
    }
}
