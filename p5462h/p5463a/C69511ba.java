package p5462h.p5463a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69731k;

/* renamed from: h.a.ba */
/* compiled from: PG */
class C69511ba extends C69509az {
    /* renamed from: w */
    public static final List m100882w(Map map) {
        C69664n.m101061g(map, "<this>");
        if (map.size() == 0) {
            return C69496am.f185918a;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C69496am.f185918a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return C69540x.m100944b(new C69685i(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C69685i(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C69685i(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    /* renamed from: x */
    public static final C69731k m100883x(Map map) {
        C69664n.m101061g(map, "<this>");
        return C69540x.m100847ac(map.entrySet());
    }
}
