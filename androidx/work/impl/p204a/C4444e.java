package androidx.work.impl.p204a;

import androidx.work.C4380ad;
import androidx.work.impl.p204a.p205a.C4416a;
import androidx.work.impl.p204a.p205a.C4417b;
import androidx.work.impl.p204a.p205a.C4418c;
import androidx.work.impl.p204a.p205a.C4419d;
import androidx.work.impl.p204a.p205a.C4420e;
import androidx.work.impl.p204a.p205a.C4421f;
import androidx.work.impl.p204a.p205a.C4422g;
import androidx.work.impl.p204a.p205a.C4423h;
import androidx.work.impl.p204a.p205a.C4424i;
import androidx.work.impl.p204a.p206b.C4434i;
import androidx.work.impl.p204a.p206b.C4435j;
import androidx.work.impl.p204a.p206b.C4441p;
import androidx.work.impl.p207b.C4470ae;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.e */
/* compiled from: PG */
public final class C4444e implements C4443d, C4418c {

    /* renamed from: a */
    public final C4442c f14130a;

    /* renamed from: b */
    public final Object f14131b = new Object();

    /* renamed from: c */
    private final C4419d[] f14132c;

    public C4444e(C4441p pVar, C4442c cVar) {
        C4419d[] dVarArr = {new C4416a(pVar.f14126a), new C4417b(pVar.f14127b), new C4424i(pVar.f14129d), new C4420e(pVar.f14128c), new C4423h(pVar.f14128c), new C4422g(pVar.f14128c), new C4421f(pVar.f14128c)};
        this.f14130a = cVar;
        this.f14132c = dVarArr;
    }

    /* renamed from: a */
    public final void mo9389a(Iterable iterable) {
        C69664n.m101061g(iterable, "workSpecs");
        synchronized (this.f14131b) {
            C4419d[] dVarArr = this.f14132c;
            for (int i = 0; i < 7; i++) {
                dVarArr[i].mo9371d((C4418c) null);
            }
            C4419d[] dVarArr2 = this.f14132c;
            for (int i2 = 0; i2 < 7; i2++) {
                C4419d dVar = dVarArr2[i2];
                C69664n.m101061g(iterable, "workSpecs");
                dVar.f14100b.clear();
                dVar.f14101c.clear();
                List list = dVar.f14100b;
                for (Object next : iterable) {
                    if (dVar.mo9369b((C4470ae) next)) {
                        list.add(next);
                    }
                }
                List<C4470ae> list2 = dVar.f14100b;
                List list3 = dVar.f14101c;
                for (C4470ae aeVar : list2) {
                    list3.add(aeVar.f14217b);
                }
                if (dVar.f14100b.isEmpty()) {
                    dVar.f14099a.mo9383f(dVar);
                } else {
                    C4434i iVar = dVar.f14099a;
                    if (dVar == null) {
                        C69664n.m101064j("listener");
                    }
                    synchronized (iVar.f14116b) {
                        if (iVar.f14117c.add(dVar)) {
                            if (iVar.f14117c.size() == 1) {
                                iVar.f14118d = iVar.mo9377b();
                                C4380ad h = C4380ad.m12560h();
                                String str = C4435j.f14120a;
                                h.mo9309a(str, iVar.getClass().getSimpleName() + ": initial state = " + iVar.f14118d);
                                iVar.mo9380d();
                            }
                            dVar.mo9368a(iVar.f14118d);
                        }
                    }
                }
                dVar.mo9372e(dVar.f14103e, dVar.f14102d);
            }
            C4419d[] dVarArr3 = this.f14132c;
            for (int i3 = 0; i3 < 7; i3++) {
                dVarArr3[i3].mo9371d(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo9390b() {
        synchronized (this.f14131b) {
            C4419d[] dVarArr = this.f14132c;
            for (int i = 0; i < 7; i++) {
                C4419d dVar = dVarArr[i];
                if (!dVar.f14100b.isEmpty()) {
                    dVar.f14100b.clear();
                    dVar.f14099a.mo9383f(dVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo9391c(String str) {
        boolean z;
        C4419d dVar;
        C69664n.m101061g(str, "workSpecId");
        synchronized (this.f14131b) {
            C4419d[] dVarArr = this.f14132c;
            z = false;
            int i = 0;
            while (true) {
                if (i >= 7) {
                    dVar = null;
                    break;
                }
                dVar = dVarArr[i];
                C69664n.m101061g(str, "workSpecId");
                Object obj = dVar.f14102d;
                if (obj != null && dVar.mo9370c(obj) && dVar.f14101c.contains(str)) {
                    break;
                }
                i++;
            }
            if (dVar != null) {
                C4380ad h = C4380ad.m12560h();
                String str2 = C4445f.f14133a;
                h.mo9309a(str2, "Work " + str + " constrained by " + dVar.getClass().getSimpleName());
            }
            if (dVar == null) {
                z = true;
            }
        }
        return z;
    }
}
