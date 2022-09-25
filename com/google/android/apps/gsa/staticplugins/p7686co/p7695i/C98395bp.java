package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.common.p4522b.C58528ij;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.bp */
/* compiled from: PG */
public final class C98395bp {

    /* renamed from: a */
    private final C58528ij f274680a;

    public C98395bp(C86124t tVar) {
        this.f274680a = C58528ij.m90006F(tVar.mo79749o(C90010bp.f246951aT));
    }

    /* renamed from: a */
    public final boolean mo91067a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (this.f274680a.contains(Integer.valueOf(((Integer) it.next()).intValue()))) {
                return true;
            }
        }
        return false;
    }
}
