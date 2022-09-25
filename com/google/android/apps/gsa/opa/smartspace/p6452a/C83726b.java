package com.google.android.apps.gsa.opa.smartspace.p6452a;

import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.gsa.shared.p7041h.C89782n;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.a.b */
/* compiled from: PG */
public final /* synthetic */ class C83726b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C83727c f228199a;

    /* renamed from: b */
    public final /* synthetic */ long f228200b;

    public /* synthetic */ C83726b(C83727c cVar, long j) {
        this.f228199a = cVar;
        this.f228200b = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C83727c cVar = this.f228199a;
        long millis = TimeUnit.DAYS.toMillis(this.f228200b);
        long b = cVar.f228202b.mo26870b();
        HashSet hashSet = new HashSet();
        Collection<C89776h> f = cVar.f228201a.mo83624f(b, millis, cVar.f228203c.mo79746e(C89985ax.f246700ah));
        Collection e = cVar.f228201a.mo83623e();
        ArrayList d = C58597ky.m90213d(f.size());
        for (C89776h hVar : f) {
            String c = C89782n.m146153c(hVar);
            if (c != null && hashSet.add(c)) {
                long j = hVar.f242992l;
                if (j == 0 || C89782n.m146152b(j, e) != null) {
                    d.add(hVar);
                } else {
                    C58976aa aaVar = C58975e.f156826a;
                }
            }
        }
        return d;
    }
}
