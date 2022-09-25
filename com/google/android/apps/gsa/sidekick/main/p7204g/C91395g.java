package com.google.android.apps.gsa.sidekick.main.p7204g;

import com.google.android.apps.gsa.sidekick.shared.util.C91955af;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7744ii;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.sidekick.main.g.g */
/* compiled from: PG */
public final class C91395g implements Iterator {

    /* renamed from: a */
    public final Iterator f254979a;

    public C91395g(C7744ii iiVar, String str) {
        C7726hr hrVar = iiVar.f27057b;
        C58485gu j = C58485gu.m89842j((hrVar == null ? C7726hr.f27008i : hrVar).f27012c);
        if (str == null) {
            this.f254979a = j.listIterator(0);
            return;
        }
        int a = C58557jl.m90120a(j, new C91393e(str));
        if (a != -1) {
            this.f254979a = j.subList(a, j.size()).listIterator(0);
            return;
        }
        String c = C91955af.m150906c(iiVar);
        throw new C91399k("No such element " + str + " in cursor for tree " + c);
    }

    /* renamed from: a */
    public final C7726hr next() {
        return (C7726hr) this.f254979a.next();
    }

    public final boolean hasNext() {
        return this.f254979a.hasNext();
    }
}
