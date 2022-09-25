package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8726c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.searchbox.root.p3199a.C41629c;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.c.b */
/* compiled from: PG */
public final class C116879b implements C41629c {

    /* renamed from: a */
    private final int f324374a;

    public C116879b(C86124t tVar) {
        this.f324374a = (int) tVar.mo79743a(C90085ej.f250137aN);
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 10000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        boolean z;
        int i;
        boolean z2;
        boolean z3 = false;
        if (((C88616t) aVar).f239556a.mo84406cm()) {
            Iterator it = list.iterator();
            z2 = false;
            i = 0;
            z = false;
            while (it.hasNext()) {
                int intValue = ((C41633g) it.next()).mo44221q().intValue();
                if (intValue == C41669ai.f108958g.intValue()) {
                    z = true;
                } else if (intValue == C41669ai.f108960i.intValue()) {
                    z2 = true;
                } else if (intValue == C41669ai.f108954c.intValue()) {
                    i++;
                }
            }
        } else {
            z2 = false;
            i = 0;
            z = false;
        }
        if (!z) {
            return false;
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C41633g gVar = (C41633g) listIterator.next();
            int intValue2 = gVar.mo44221q().intValue();
            if (intValue2 == C41669ai.f108954c.intValue()) {
                gVar.mo44204d(gVar.mo44215k() + 5000);
            } else if (intValue2 == C41669ai.f108961j.intValue()) {
                if (z2) {
                    if (i < this.f324374a) {
                        gVar.mo44205e(C41669ai.f108954c);
                    } else {
                        listIterator.remove();
                        z3 = true;
                    }
                } else if (i < this.f324374a + 1) {
                    gVar.mo44205e(C41669ai.f108954c);
                } else {
                    listIterator.remove();
                    z3 = true;
                }
                i++;
                z3 = true;
            }
        }
        return z3;
    }
}
