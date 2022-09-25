package androidx.constraintlayout.p079a.p082b;

import androidx.constraintlayout.p079a.C1649d;

/* renamed from: androidx.constraintlayout.a.b.m */
/* compiled from: PG */
public final class C1645m extends C1646n {
    /* renamed from: P */
    public final void mo4660P(int i, int i2, int i3, int i4) {
        int i5 = this.f4749bk + this.f4750bl;
        int i6 = this.f4745bg + this.f4746bh;
        boolean z = false;
        if (this.f4743bf > 0) {
            i5 += this.f4742be[0].mo4631i();
            i6 += this.f4742be[0].mo4630h();
        }
        int max = Math.max(this.f4632al, i5);
        int max2 = Math.max(this.f4633am, i6);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(max, i2) : i == 0 ? max : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(max2, i4) : i3 == 0 ? max2 : 0;
        }
        this.f4752bn = i2;
        this.f4753bo = i4;
        mo4618D(i2);
        mo4648z(i4);
        if (this.f4743bf > 0) {
            z = true;
        }
        this.f4751bm = z;
    }

    /* renamed from: b */
    public final void mo4560b(C1649d dVar, boolean z) {
        super.mo4560b(dVar, z);
        if (this.f4743bf > 0) {
            C1638f fVar = this.f4742be[0];
            fVar.mo4642t();
            fVar.f4635ao = 0.5f;
            fVar.f4634an = 0.5f;
            fVar.mo4627M(2, this, 2, 0);
            fVar.mo4627M(4, this, 4, 0);
            fVar.mo4627M(3, this, 3, 0);
            fVar.mo4627M(5, this, 5, 0);
        }
    }
}
