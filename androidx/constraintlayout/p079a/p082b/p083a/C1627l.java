package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1615a;
import androidx.constraintlayout.p079a.p082b.C1638f;

/* renamed from: androidx.constraintlayout.a.b.a.l */
/* compiled from: PG */
final class C1627l extends C1633r {
    public C1627l(C1638f fVar) {
        super(fVar);
    }

    /* renamed from: g */
    private final void m4352g(C1622g gVar) {
        this.f4544j.f4518j.add(gVar);
        gVar.f4519k.add(this.f4544j);
    }

    /* renamed from: b */
    public final void mo4571b() {
        C1638f fVar = this.f4538d;
        if (fVar instanceof C1615a) {
            C1622g gVar = this.f4544j;
            gVar.f4510b = true;
            C1615a aVar = (C1615a) fVar;
            int i = aVar.f4482a;
            boolean z = aVar.f4483b;
            int i2 = 0;
            if (i == 0) {
                gVar.f4520l = 4;
                while (i2 < aVar.f4743bf) {
                    C1638f fVar2 = aVar.f4742be[i2];
                    if (z || fVar2.f4637aq != 8) {
                        C1622g gVar2 = fVar2.f4652h.f4544j;
                        gVar2.f4518j.add(this.f4544j);
                        this.f4544j.f4519k.add(gVar2);
                    }
                    i2++;
                }
                m4352g(this.f4538d.f4652h.f4544j);
                m4352g(this.f4538d.f4652h.f4545k);
            } else if (i == 1) {
                gVar.f4520l = 5;
                while (i2 < aVar.f4743bf) {
                    C1638f fVar3 = aVar.f4742be[i2];
                    if (z || fVar3.f4637aq != 8) {
                        C1622g gVar3 = fVar3.f4652h.f4545k;
                        gVar3.f4518j.add(this.f4544j);
                        this.f4544j.f4519k.add(gVar3);
                    }
                    i2++;
                }
                m4352g(this.f4538d.f4652h.f4544j);
                m4352g(this.f4538d.f4652h.f4545k);
            } else if (i == 2) {
                gVar.f4520l = 6;
                while (i2 < aVar.f4743bf) {
                    C1638f fVar4 = aVar.f4742be[i2];
                    if (z || fVar4.f4637aq != 8) {
                        C1622g gVar4 = fVar4.f4653i.f4544j;
                        gVar4.f4518j.add(this.f4544j);
                        this.f4544j.f4519k.add(gVar4);
                    }
                    i2++;
                }
                m4352g(this.f4538d.f4653i.f4544j);
                m4352g(this.f4538d.f4653i.f4545k);
            } else if (i == 3) {
                gVar.f4520l = 7;
                while (i2 < aVar.f4743bf) {
                    C1638f fVar5 = aVar.f4742be[i2];
                    if (z || fVar5.f4637aq != 8) {
                        C1622g gVar5 = fVar5.f4653i.f4545k;
                        gVar5.f4518j.add(this.f4544j);
                        this.f4544j.f4519k.add(gVar5);
                    }
                    i2++;
                }
                m4352g(this.f4538d.f4653i.f4544j);
                m4352g(this.f4538d.f4653i.f4545k);
            }
        }
    }

    /* renamed from: c */
    public final void mo4572c() {
        C1638f fVar = this.f4538d;
        if (fVar instanceof C1615a) {
            int i = ((C1615a) fVar).f4482a;
            if (i == 0 || i == 1) {
                fVar.f4625ae = this.f4544j.f4514f;
            } else {
                fVar.f4626af = this.f4544j.f4514f;
            }
        }
    }

    /* renamed from: d */
    public final void mo4573d() {
        this.f4539e = null;
        this.f4544j.mo4583b();
    }

    /* renamed from: e */
    public final boolean mo4574e() {
        return false;
    }

    /* renamed from: f */
    public final void mo4575f() {
        C1615a aVar = (C1615a) this.f4538d;
        int i = aVar.f4482a;
        int i2 = 0;
        int i3 = -1;
        for (C1622g gVar : this.f4544j.f4519k) {
            int i4 = gVar.f4514f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.f4544j.mo4584c(i3 + aVar.f4484c);
        } else {
            this.f4544j.mo4584c(i2 + aVar.f4484c);
        }
    }
}
