package p5488io.p5490b.p5497e.p5502e.p5507e;

import org.p5649d.C72639b;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5497e.p5500c.C69842a;
import p5488io.p5490b.p5497e.p5509f.C70037c;
import p5488io.p5490b.p5516h.C70099a;

/* renamed from: io.b.e.e.e.m */
/* compiled from: PG */
public final class C70009m extends C70099a {

    /* renamed from: a */
    final C70099a f186626a;

    /* renamed from: b */
    final C70128t f186627b;

    /* renamed from: c */
    final int f186628c;

    public C70009m(C70099a aVar, C70128t tVar, int i) {
        this.f186626a = aVar;
        this.f186627b = tVar;
        this.f186628c = i;
    }

    /* renamed from: a */
    public final int mo61563a() {
        return ((C70000d) this.f186626a).f186596b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo61577b(int i, C72639b[] bVarArr, C72639b[] bVarArr2, C70127s sVar) {
        C69842a aVar = bVarArr[i];
        C70037c cVar = new C70037c(this.f186628c);
        if (aVar instanceof C69842a) {
            bVarArr2[i] = new C70007k(aVar, this.f186628c, cVar, sVar);
        } else {
            bVarArr2[i] = new C70008l(aVar, this.f186628c, cVar, sVar);
        }
    }
}
