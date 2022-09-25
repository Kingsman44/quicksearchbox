package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.grpc.em */
/* compiled from: PG */
public final class C70708em {
    /* renamed from: a */
    public static C70711ep m103390a(C70298d dVar, C70706ek... ekVarArr) {
        C58838bb.m90866a(dVar, "bindableService");
        return m103391b(dVar.mo17222gs(), Arrays.asList(ekVarArr));
    }

    /* renamed from: b */
    public static C70711ep m103391b(C70711ep epVar, List list) {
        C58838bb.m90866a(epVar, "serviceDef");
        if (list.isEmpty()) {
            return epVar;
        }
        C70716eu euVar = epVar.f188452a;
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        for (C70709en enVar : epVar.mo62431a()) {
            C70705ej ejVar = enVar.f188451b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ejVar = new C70707el((C70706ek) it.next(), ejVar);
            }
            C70710eo.m103395c(enVar.mo62430a(ejVar), str, hashMap);
        }
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}
