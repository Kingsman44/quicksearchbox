package com.google.android.apps.gsa.search.core.p6513aj;

import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90075e;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90128g;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.search.core.aj.ae */
/* compiled from: PG */
public final /* synthetic */ class C84520ae {
    /* renamed from: a */
    public static C58495hd m135165a(C58528ij ijVar) {
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            Object next = lA.next();
            if (next instanceof C90048d) {
                gzVar.mo55429h(Integer.valueOf(((C90048d) next).f248757a), next);
            } else if (next instanceof C90102f) {
                gzVar.mo55429h(Integer.valueOf(((C90102f) next).f250556a), next);
            } else if (next instanceof C90075e) {
                gzVar.mo55429h(Integer.valueOf(((C90075e) next).f249778a), next);
            } else if (next instanceof C90129h) {
                gzVar.mo55429h(Integer.valueOf(((C90129h) next).f251802a), next);
            } else if (next instanceof C90128g) {
                gzVar.mo55429h(Integer.valueOf(((C90128g) next).f251801a), next);
            } else {
                throw new AssertionError("Incompatible param: ".concat(String.valueOf(String.valueOf(next))));
            }
        }
        return gzVar.mo55427f(false);
    }
}
