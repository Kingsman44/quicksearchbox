package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70120l;
import p5488io.p5490b.C70122n;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69829e;

/* renamed from: io.b.e.e.d.f */
/* compiled from: PG */
public final class C69976f extends C70120l {

    /* renamed from: a */
    final Iterable f186517a;

    /* renamed from: b */
    final C69822d f186518b;

    /* renamed from: c */
    final int f186519c;

    public C69976f(Iterable iterable, C69822d dVar, int i) {
        this.f186517a = iterable;
        this.f186518b = dVar;
        this.f186519c = i;
    }

    /* renamed from: q */
    public final void mo61493q(C70123o oVar) {
        C70122n[] nVarArr = new C70120l[8];
        int i = 0;
        for (C70122n nVar : this.f186517a) {
            if (i == nVarArr.length) {
                C70122n[] nVarArr2 = new C70122n[((i >> 2) + i)];
                System.arraycopy(nVarArr, 0, nVarArr2, 0, i);
                nVarArr = nVarArr2;
            }
            nVarArr[i] = nVar;
            i++;
        }
        if (i == 0) {
            C69829e.m101314d(oVar);
            return;
        }
        C69975e eVar = new C69975e(oVar, this.f186518b, i, this.f186519c);
        C69974d[] dVarArr = eVar.f186509c;
        int length = dVarArr.length;
        eVar.f186507a.mo26850d(eVar);
        for (int i2 = 0; i2 < length && !eVar.f186513g && !eVar.f186512f; i2++) {
            nVarArr[i2].mo61539p(dVarArr[i2]);
        }
    }
}
