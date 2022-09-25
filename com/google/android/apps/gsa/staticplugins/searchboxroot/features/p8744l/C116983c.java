package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8744l;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.l.c */
/* compiled from: PG */
public final class C116983c implements C41630d {

    /* renamed from: a */
    private final C86124t f324762a;

    public C116983c(C86124t tVar) {
        this.f324762a = tVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 4000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        boolean z = false;
        if (list.isEmpty()) {
            return false;
        }
        if (this.f324762a.mo79746e(C90085ej.f250220bv) && ((C88616t) aVar).f239556a.mo84405cl()) {
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                C41633g gVar = (C41633g) listIterator.next();
                if (gVar.mo44216l() == 3 && gVar.mo44217m() == 35) {
                    listIterator.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
