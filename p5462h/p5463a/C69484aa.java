package p5462h.p5463a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p5462h.C69685i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.aa */
/* compiled from: PG */
class C69484aa extends C69542z {
    /* renamed from: k */
    public static final int m100804k(Iterable iterable, int i) {
        C69664n.m101061g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: l */
    public static final List m100805l(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C69540x.m100811r(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    /* renamed from: m */
    public static final C69685i m100806m(Iterable iterable) {
        int k = C69540x.m100804k(iterable, 10);
        ArrayList arrayList = new ArrayList(k);
        ArrayList arrayList2 = new ArrayList(k);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C69685i iVar = (C69685i) it.next();
            arrayList.add(iVar.f186052a);
            arrayList2.add(iVar.f186053b);
        }
        return new C69685i(arrayList, arrayList2);
    }
}
