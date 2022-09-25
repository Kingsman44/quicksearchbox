package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8736i;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.i.c */
/* compiled from: PG */
public final class C116918c implements C41630d {

    /* renamed from: a */
    private final C86124t f324615a;

    public C116918c(C86124t tVar) {
        this.f324615a = tVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 12000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        if (this.f324615a.mo79746e(C90085ej.f250182bF)) {
            C88616t tVar = (C88616t) aVar;
            if (tVar.f239561f.getBoolean("cs::on_focus") || tVar.f239561f.getBoolean("cs::on_focus_fallback")) {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((C41633g) it.next()).mo44216l() == 1) {
                        i++;
                    }
                }
                if (((long) i) <= this.f324615a.mo79743a(C90085ej.f250138aO)) {
                    return false;
                }
                ListIterator listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if (((C41633g) listIterator.next()).mo44216l() != 1) {
                        listIterator.remove();
                    }
                }
            }
        }
        return false;
    }
}
