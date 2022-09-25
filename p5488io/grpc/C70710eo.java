package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.grpc.eo */
/* compiled from: PG */
public final class C70710eo {
    /* renamed from: a */
    public static final C70711ep m103393a(String str, C70716eu euVar, Map map) {
        if (euVar == null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (C70709en enVar : map.values()) {
                arrayList.add(enVar.f188450a);
            }
            C70715et etVar = new C70715et(str);
            etVar.f188455b.addAll(arrayList);
            euVar = new C70716eu(etVar);
        }
        HashMap hashMap = new HashMap(map);
        for (C70338di diVar : euVar.f188457b) {
            C70709en enVar2 = (C70709en) hashMap.remove(diVar.f187497b);
            if (enVar2 == null) {
                throw new IllegalStateException("No method bound for descriptor entry ".concat(diVar.f187497b));
            } else if (enVar2.f188450a != diVar) {
                throw new IllegalStateException("Bound method for " + diVar.f187497b + " not same instance as method in service descriptor");
            }
        }
        if (hashMap.size() <= 0) {
            return new C70711ep(euVar, map);
        }
        throw new IllegalStateException("No entry in descriptor matching bound method ".concat(((C70709en) hashMap.values().iterator().next()).f188450a.f187497b));
    }

    /* renamed from: b */
    public static final void m103394b(C70338di diVar, C70705ej ejVar, String str, C70716eu euVar, Map map) {
        C58838bb.m90866a(diVar, "method must not be null");
        m103395c(new C70709en(diVar, ejVar), str, map);
    }

    /* renamed from: c */
    public static final void m103395c(C70709en enVar, String str, Map map) {
        C70338di diVar = enVar.f188450a;
        C58838bb.m90879n(str.equals(diVar.f187498c), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str, diVar.f187497b);
        String str2 = diVar.f187497b;
        C58838bb.m90887v(!map.containsKey(str2), "Method by same name already registered: %s", str2);
        map.put(str2, enVar);
    }
}
