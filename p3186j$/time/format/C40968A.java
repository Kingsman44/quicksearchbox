package p3186j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: j$.time.format.A */
final class C40968A {

    /* renamed from: a */
    private final Map f107289a;

    /* renamed from: b */
    private final HashMap f107290b;

    C40968A(Map map) {
        this.f107289a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i = C40969B.f107294d;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, C40969B.f107292b);
            hashMap.put((C40974G) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put((Object) null, arrayList);
        }
        Collections.sort(arrayList, C40969B.f107292b);
        this.f107290b = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo43246a(long j, C40974G g) {
        Map map = (Map) this.f107289a.get(g);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Iterator mo43247b(C40974G g) {
        List list = (List) this.f107290b.get(g);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
