package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.geller.f.ca */
/* compiled from: PG */
public final /* synthetic */ class C21845ca implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f60296a;

    public /* synthetic */ C21845ca(C58528ij ijVar) {
        this.f60296a = ijVar;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f60296a;
        C58490gz gzVar = new C58490gz(4);
        for (Map map : (List) obj) {
            for (C65753ak akVar : map.keySet()) {
                if (ijVar.contains(akVar)) {
                    gzVar.mo55429h(akVar, (C21850cf) map.get(akVar));
                }
            }
        }
        return gzVar.mo55427f(true);
    }
}
