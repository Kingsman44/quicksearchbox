package p5488io.p5490b.p5497e.p5502e.p5507e;

import org.p5649d.C72639b;
import p5488io.p5490b.C70092f;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5497e.p5502e.p5504b.C69895d;
import p5488io.p5490b.p5497e.p5510g.C70073z;
import p5488io.p5490b.p5516h.C70099a;

/* renamed from: io.b.e.e.e.h */
/* compiled from: PG */
public final class C70004h extends C70092f {

    /* renamed from: b */
    final C70099a f186609b;

    /* renamed from: c */
    final int f186610c;

    public C70004h(C70099a aVar, int i) {
        this.f186609b = aVar;
        this.f186610c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo61492e(C72639b bVar) {
        C70003g gVar = new C70003g(bVar, this.f186609b.mo61563a(), this.f186610c);
        bVar.mo61494a(gVar);
        C70099a aVar = this.f186609b;
        C70001e[] eVarArr = gVar.f186604b;
        if (aVar.mo61637c(eVarArr)) {
            int length = eVarArr.length;
            C72639b[] bVarArr = new C72639b[length];
            for (int i = 0; i < length; i++) {
                C69997a aVar2 = (C69997a) aVar;
                bVarArr[i] = new C69895d(eVarArr[i], aVar2.f186576b, aVar2.f186577c);
            }
            C70099a aVar3 = ((C69997a) aVar).f186575a;
            if (aVar3.mo61637c(bVarArr)) {
                C72639b[] bVarArr2 = new C72639b[length];
                C70009m mVar = (C70009m) aVar3;
                C70128t tVar = mVar.f186627b;
                if (tVar instanceof C70073z) {
                    ((C70073z) tVar).mo61596e(length, new C70006j(mVar, bVarArr, bVarArr2));
                } else {
                    for (int i2 = 0; i2 < length; i2++) {
                        mVar.mo61577b(i2, bVarArr, bVarArr2, mVar.f186627b.mo61458a());
                    }
                }
                C70099a aVar4 = mVar.f186626a;
                if (aVar4.mo61637c(bVarArr2)) {
                    C70000d dVar = (C70000d) aVar4;
                    dVar.f186595a.mo61634d(new C69999c(bVarArr2, dVar.f186597c));
                }
            }
        }
    }
}
