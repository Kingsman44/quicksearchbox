package androidx.constraintlayout.p079a.p082b;

import androidx.constraintlayout.p079a.C1648c;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.b.o */
/* compiled from: PG */
public class C1647o extends C1638f {

    /* renamed from: be */
    public ArrayList f4756be = new ArrayList();

    /* renamed from: T */
    public final void mo4671T(C1638f fVar) {
        this.f4756be.add(fVar);
        C1638f fVar2 = fVar.f4606Z;
        if (fVar2 != null) {
            ((C1647o) fVar2).mo4672U(fVar);
        }
        fVar.f4606Z = this;
    }

    /* renamed from: U */
    public final void mo4672U(C1638f fVar) {
        this.f4756be.remove(fVar);
        fVar.mo4641s();
    }

    /* renamed from: d */
    public void mo4653d() {
        ArrayList arrayList = this.f4756be;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1638f fVar = (C1638f) this.f4756be.get(i);
                if (fVar instanceof C1647o) {
                    ((C1647o) fVar).mo4653d();
                }
            }
        }
    }

    /* renamed from: s */
    public void mo4641s() {
        this.f4756be.clear();
        super.mo4641s();
    }

    /* renamed from: v */
    public final void mo4644v(C1648c cVar) {
        super.mo4644v(cVar);
        int size = this.f4756be.size();
        for (int i = 0; i < size; i++) {
            ((C1638f) this.f4756be.get(i)).mo4644v(cVar);
        }
    }
}
