package androidx.constraintlayout.p079a.p082b;

import androidx.constraintlayout.p079a.p082b.p083a.C1617b;
import androidx.constraintlayout.widget.C1746e;

/* renamed from: androidx.constraintlayout.a.b.n */
/* compiled from: PG */
public class C1646n extends C1643k {

    /* renamed from: bg */
    public int f4745bg = 0;

    /* renamed from: bh */
    public int f4746bh = 0;

    /* renamed from: bi */
    public int f4747bi = 0;

    /* renamed from: bj */
    public int f4748bj = 0;

    /* renamed from: bk */
    public int f4749bk = 0;

    /* renamed from: bl */
    public int f4750bl = 0;

    /* renamed from: bm */
    public boolean f4751bm = false;

    /* renamed from: bn */
    public int f4752bn = 0;

    /* renamed from: bo */
    public int f4753bo = 0;

    /* renamed from: bp */
    protected final C1617b f4754bp = new C1617b();

    /* renamed from: bq */
    C1746e f4755bq = null;

    /* renamed from: P */
    public void mo4660P(int i, int i2, int i3, int i4) {
    }

    /* renamed from: T */
    public final void mo4668T() {
        mo4669U();
    }

    /* renamed from: U */
    public final void mo4669U() {
        for (int i = 0; i < this.f4743bf; i++) {
            C1638f fVar = this.f4742be[i];
            if (fVar != null) {
                fVar.f4591K = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo4670V(C1638f fVar, C1637e eVar, int i, C1637e eVar2, int i2) {
        C1746e eVar3;
        C1638f fVar2;
        while (true) {
            eVar3 = this.f4755bq;
            if (eVar3 != null || (fVar2 = this.f4606Z) == null) {
                C1617b bVar = this.f4754bp;
                bVar.f4486a = eVar;
                bVar.f4487b = eVar2;
                bVar.f4488c = i;
                bVar.f4489d = i2;
                eVar3.mo4865a(fVar, bVar);
                fVar.mo4618D(this.f4754bp.f4490e);
                fVar.mo4648z(this.f4754bp.f4491f);
                C1617b bVar2 = this.f4754bp;
                fVar.f4589I = bVar2.f4493h;
                fVar.mo4645w(bVar2.f4492g);
            } else {
                this.f4755bq = ((C1639g) fVar2).f4689bd;
            }
        }
        C1617b bVar3 = this.f4754bp;
        bVar3.f4486a = eVar;
        bVar3.f4487b = eVar2;
        bVar3.f4488c = i;
        bVar3.f4489d = i2;
        eVar3.mo4865a(fVar, bVar3);
        fVar.mo4618D(this.f4754bp.f4490e);
        fVar.mo4648z(this.f4754bp.f4491f);
        C1617b bVar22 = this.f4754bp;
        fVar.f4589I = bVar22.f4493h;
        fVar.mo4645w(bVar22.f4492g);
    }
}
