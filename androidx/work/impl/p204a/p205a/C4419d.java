package androidx.work.impl.p204a.p205a;

import androidx.work.C4380ad;
import androidx.work.impl.p204a.C4415a;
import androidx.work.impl.p204a.C4442c;
import androidx.work.impl.p204a.C4444e;
import androidx.work.impl.p204a.C4445f;
import androidx.work.impl.p204a.p206b.C4434i;
import androidx.work.impl.p207b.C4470ae;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.a.a.d */
/* compiled from: PG */
public abstract class C4419d implements C4415a {

    /* renamed from: a */
    public final C4434i f14099a;

    /* renamed from: b */
    public final List f14100b = new ArrayList();

    /* renamed from: c */
    public final List f14101c = new ArrayList();

    /* renamed from: d */
    public Object f14102d;

    /* renamed from: e */
    public C4418c f14103e;

    public C4419d(C4434i iVar) {
        this.f14099a = iVar;
    }

    /* renamed from: a */
    public final void mo9368a(Object obj) {
        this.f14102d = obj;
        mo9372e(this.f14103e, obj);
    }

    /* renamed from: b */
    public abstract boolean mo9369b(C4470ae aeVar);

    /* renamed from: c */
    public abstract boolean mo9370c(Object obj);

    /* renamed from: d */
    public final void mo9371d(C4418c cVar) {
        if (this.f14103e != cVar) {
            this.f14103e = cVar;
            mo9372e(cVar, this.f14102d);
        }
    }

    /* renamed from: e */
    public final void mo9372e(C4418c cVar, Object obj) {
        if (!this.f14100b.isEmpty() && cVar != null) {
            if (obj == null || mo9370c(obj)) {
                List list = this.f14100b;
                synchronized (((C4444e) cVar).f14131b) {
                    C4442c cVar2 = ((C4444e) cVar).f14130a;
                    if (cVar2 != null) {
                        cVar2.mo9388f(list);
                    }
                }
                return;
            }
            List list2 = this.f14100b;
            synchronized (((C4444e) cVar).f14131b) {
                ArrayList<C4470ae> arrayList = new ArrayList<>();
                for (Object next : list2) {
                    if (((C4444e) cVar).mo9391c(((C4470ae) next).f14217b)) {
                        arrayList.add(next);
                    }
                }
                for (C4470ae aeVar : arrayList) {
                    C4380ad h = C4380ad.m12560h();
                    String str = C4445f.f14133a;
                    h.mo9309a(str, "Constraints met for " + aeVar);
                }
                C4442c cVar3 = ((C4444e) cVar).f14130a;
                if (cVar3 != null) {
                    cVar3.mo9387e(arrayList);
                }
            }
        }
    }
}
