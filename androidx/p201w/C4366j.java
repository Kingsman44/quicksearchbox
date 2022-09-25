package androidx.p201w;

import androidx.core.p097i.C1970e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.w.j */
/* compiled from: PG */
public final class C4366j {
    /* renamed from: a */
    public static final void m12516a(String str, C4368l lVar, List list) {
        list.add(new C1970e(str, lVar));
    }

    /* renamed from: b */
    public static final C4370n m12517b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1970e eVar = (C1970e) it.next();
            arrayList.add(new C4369m((String) eVar.f5888a, (C4368l) eVar.f5889b));
        }
        return new C4370n(arrayList);
    }
}
