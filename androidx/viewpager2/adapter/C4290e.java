package androidx.viewpager2.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.viewpager2.adapter.e */
/* compiled from: PG */
public final class C4290e {

    /* renamed from: a */
    public final List f13882a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public static final void m12317b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C4294i) it.next()).mo9204a();
        }
    }

    /* renamed from: a */
    public final void mo9199a(C4295j jVar) {
        this.f13882a.add(jVar);
    }

    /* renamed from: c */
    public final List mo9200c() {
        ArrayList arrayList = new ArrayList();
        for (C4295j a : this.f13882a) {
            arrayList.add(a.mo9205a());
        }
        return arrayList;
    }
}
