package androidx.camera.core;

import androidx.camera.core.p069a.C1292af;
import androidx.camera.core.p069a.C1333bt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: androidx.camera.core.t */
/* compiled from: PG */
public final class C1570t {

    /* renamed from: a */
    public static final C1570t f4296a;

    /* renamed from: b */
    public static final C1570t f4297b;

    /* renamed from: c */
    public final LinkedHashSet f4298c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1569s.m4170a(0, linkedHashSet);
        f4296a = new C1570t(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C1569s.m4170a(1, linkedHashSet2);
        f4297b = new C1570t(linkedHashSet2);
    }

    public C1570t(LinkedHashSet linkedHashSet) {
        this.f4298c = linkedHashSet;
    }

    /* renamed from: a */
    public final Integer mo4448a() {
        Iterator it = this.f4298c.iterator();
        Integer num = null;
        while (it.hasNext()) {
            C1568r rVar = (C1568r) it.next();
            if (rVar instanceof C1333bt) {
                Integer valueOf = Integer.valueOf(((C1333bt) rVar).f3815b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: b */
    public final LinkedHashSet mo4449b(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1292af) it.next()).mo3841z());
        }
        List c = mo4450c(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            C1292af afVar = (C1292af) it2.next();
            if (c.contains(afVar.mo3841z())) {
                linkedHashSet2.add(afVar);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: c */
    public final List mo4450c(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f4298c.iterator();
        while (it.hasNext()) {
            arrayList = ((C1568r) it.next()).mo4209b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* renamed from: d */
    public final void mo4451d(LinkedHashSet linkedHashSet) {
        Iterator it = mo4449b(linkedHashSet).iterator();
        if (it.hasNext()) {
            C1292af afVar = (C1292af) it.next();
            return;
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
