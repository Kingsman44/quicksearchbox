package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.p082b.C1637e;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1639g;
import androidx.constraintlayout.widget.C1746e;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.b.a.c */
/* compiled from: PG */
public final class C1618c {

    /* renamed from: a */
    public final ArrayList f4496a = new ArrayList();

    /* renamed from: b */
    public final C1639g f4497b;

    /* renamed from: c */
    private final C1617b f4498c = new C1617b();

    public C1618c(C1639g gVar) {
        this.f4497b = gVar;
    }

    /* renamed from: a */
    public final void mo4567a(C1639g gVar) {
        this.f4496a.clear();
        int size = gVar.f4756be.size();
        for (int i = 0; i < size; i++) {
            C1638f fVar = (C1638f) gVar.f4756be.get(i);
            if (fVar.f4605Y[0] == C1637e.MATCH_CONSTRAINT || fVar.f4605Y[1] == C1637e.MATCH_CONSTRAINT) {
                this.f4496a.add(fVar);
            }
        }
        gVar.f4685b.f4502b = true;
    }

    /* renamed from: b */
    public final boolean mo4568b(C1746e eVar, C1638f fVar, int i) {
        C1617b bVar = this.f4498c;
        C1637e[] eVarArr = fVar.f4605Y;
        bVar.f4486a = eVarArr[0];
        bVar.f4487b = eVarArr[1];
        bVar.f4488c = fVar.mo4631i();
        this.f4498c.f4489d = fVar.mo4630h();
        C1617b bVar2 = this.f4498c;
        bVar2.f4494i = false;
        bVar2.f4495j = i;
        C1637e eVar2 = bVar2.f4486a;
        C1637e eVar3 = C1637e.MATCH_CONSTRAINT;
        C1617b bVar3 = this.f4498c;
        C1637e eVar4 = bVar3.f4487b;
        C1637e eVar5 = C1637e.MATCH_CONSTRAINT;
        boolean z = eVar2 == eVar3 && fVar.f4623ac > 0.0f;
        boolean z2 = eVar4 == eVar5 && fVar.f4623ac > 0.0f;
        if (z && fVar.f4666v[0] == 4) {
            bVar3.f4486a = C1637e.FIXED;
        }
        if (z2 && fVar.f4666v[1] == 4) {
            bVar3.f4487b = C1637e.FIXED;
        }
        eVar.mo4865a(fVar, bVar3);
        fVar.mo4618D(this.f4498c.f4490e);
        fVar.mo4648z(this.f4498c.f4491f);
        C1617b bVar4 = this.f4498c;
        fVar.f4589I = bVar4.f4493h;
        fVar.mo4645w(bVar4.f4492g);
        C1617b bVar5 = this.f4498c;
        bVar5.f4495j = 0;
        return bVar5.f4494i;
    }

    /* renamed from: c */
    public final void mo4569c(C1639g gVar, int i, int i2, int i3) {
        int i4 = gVar.f4632al;
        int i5 = gVar.f4633am;
        gVar.mo4617C(0);
        gVar.mo4616B(0);
        gVar.mo4618D(i2);
        gVar.mo4648z(i3);
        gVar.mo4617C(i4);
        gVar.mo4616B(i5);
        C1639g gVar2 = this.f4497b;
        gVar2.f4690c = i;
        gVar2.mo4653d();
    }
}
