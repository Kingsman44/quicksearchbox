package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1642j;

/* renamed from: androidx.constraintlayout.a.b.a.k */
/* compiled from: PG */
public final class C1626k extends C1633r {
    public C1626k(C1638f fVar) {
        super(fVar);
        fVar.f4652h.mo4573d();
        fVar.f4653i.mo4573d();
        this.f4542h = ((C1642j) fVar).f4737aO;
    }

    /* renamed from: g */
    private final void m4346g(C1622g gVar) {
        this.f4544j.f4518j.add(gVar);
        gVar.f4519k.add(this.f4544j);
    }

    /* renamed from: b */
    public final void mo4571b() {
        C1638f fVar = this.f4538d;
        C1642j jVar = (C1642j) fVar;
        int i = jVar.f4739b;
        int i2 = jVar.f4740c;
        float f = jVar.f4735a;
        if (jVar.f4737aO == 1) {
            if (i != -1) {
                this.f4544j.f4519k.add(fVar.f4606Z.f4652h.f4544j);
                this.f4538d.f4606Z.f4652h.f4544j.f4518j.add(this.f4544j);
                this.f4544j.f4513e = i;
            } else if (i2 != -1) {
                this.f4544j.f4519k.add(fVar.f4606Z.f4652h.f4545k);
                this.f4538d.f4606Z.f4652h.f4545k.f4518j.add(this.f4544j);
                this.f4544j.f4513e = -i2;
            } else {
                C1622g gVar = this.f4544j;
                gVar.f4510b = true;
                gVar.f4519k.add(fVar.f4606Z.f4652h.f4545k);
                this.f4538d.f4606Z.f4652h.f4545k.f4518j.add(this.f4544j);
            }
            m4346g(this.f4538d.f4652h.f4544j);
            m4346g(this.f4538d.f4652h.f4545k);
            return;
        }
        if (i != -1) {
            this.f4544j.f4519k.add(fVar.f4606Z.f4653i.f4544j);
            this.f4538d.f4606Z.f4653i.f4544j.f4518j.add(this.f4544j);
            this.f4544j.f4513e = i;
        } else if (i2 != -1) {
            this.f4544j.f4519k.add(fVar.f4606Z.f4653i.f4545k);
            this.f4538d.f4606Z.f4653i.f4545k.f4518j.add(this.f4544j);
            this.f4544j.f4513e = -i2;
        } else {
            C1622g gVar2 = this.f4544j;
            gVar2.f4510b = true;
            gVar2.f4519k.add(fVar.f4606Z.f4653i.f4545k);
            this.f4538d.f4606Z.f4653i.f4545k.f4518j.add(this.f4544j);
        }
        m4346g(this.f4538d.f4653i.f4544j);
        m4346g(this.f4538d.f4653i.f4545k);
    }

    /* renamed from: c */
    public final void mo4572c() {
        C1638f fVar = this.f4538d;
        if (((C1642j) fVar).f4737aO == 1) {
            fVar.f4625ae = this.f4544j.f4514f;
        } else {
            fVar.f4626af = this.f4544j.f4514f;
        }
    }

    /* renamed from: d */
    public final void mo4573d() {
        this.f4544j.mo4583b();
    }

    /* renamed from: e */
    public final boolean mo4574e() {
        return false;
    }

    /* renamed from: f */
    public final void mo4575f() {
        C1622g gVar = this.f4544j;
        if (gVar.f4511c && !gVar.f4517i) {
            int i = ((C1622g) gVar.f4519k.get(0)).f4514f;
            this.f4544j.mo4584c((int) ((((float) i) * ((C1642j) this.f4538d).f4735a) + 0.5f));
        }
    }
}
