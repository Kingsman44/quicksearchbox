package com.google.android.libraries.geller.p1818f.p1819a;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.HashSet;
import java.util.Set;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.geller.f.a.e */
/* compiled from: PG */
public final class C21790e {
    /* renamed from: a */
    public static void m40906a(C21942ah ahVar, C58495hd hdVar, long j, C65813cq cqVar) {
        HashSet hashSet = new HashSet();
        C58459fv fvVar = new C58459fv();
        C58800sl lA = hdVar.keySet().iterator();
        while (lA.hasNext()) {
            C65753ak akVar = (C65753ak) lA.next();
            C21850cf cfVar = (C21850cf) hdVar.get(akVar);
            if (cfVar != null) {
                if (cfVar.mo27152b().isEmpty()) {
                    hashSet.add(akVar);
                } else {
                    C58485gu b = cfVar.mo27152b();
                    int size = b.size();
                    for (int i = 0; i < size; i++) {
                        fvVar.mo54920x((Throwable) b.get(i), akVar);
                    }
                }
            }
        }
        for (Throwable th : fvVar.mo54951D()) {
            Set h = fvVar.mo54986h(th);
            if (th instanceof C70761fa) {
                ahVar.mo27222f(h, ((C70761fa) th).f188571a.getCode(), j, cqVar);
            }
        }
        ahVar.mo27222f(hashSet, Status.Code.OK, j, cqVar);
    }
}
