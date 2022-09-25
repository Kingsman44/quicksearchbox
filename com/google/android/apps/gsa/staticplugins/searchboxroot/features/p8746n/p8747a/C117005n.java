package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.n */
/* compiled from: PG */
public final class C117005n implements C41630d {

    /* renamed from: a */
    private final C86124t f324812a;

    public C117005n(C86124t tVar) {
        this.f324812a = tVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 6000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            C41633g gVar = (C41633g) it.next();
            z2 |= !(gVar.mo44216l() != 1);
            if (gVar.mo44216l() == 3 || gVar.mo44216l() == 22) {
                if (gVar.mo44217m() == 0) {
                    z = true;
                } else if (gVar.mo44217m() == 35 || gVar.mo44222r().contains(136)) {
                    i2++;
                }
            }
            i3 = Math.max(i3, gVar.mo44215k());
        }
        if (i2 == 0) {
            if (!z) {
                return false;
            }
            i2 = 0;
        }
        int i4 = i3 + i2;
        int a = (int) this.f324812a.mo79743a(C90120fr.f250782V);
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C41633g gVar2 = (C41633g) listIterator.next();
            if ((gVar2.mo44216l() == 3 || gVar2.mo44216l() == 22) && (gVar2.mo44217m() == 0 || gVar2.mo44222r().contains(136))) {
                if (z2) {
                    listIterator.remove();
                } else if (gVar2.mo44217m() == 35 || gVar2.mo44222r().contains(136)) {
                    i++;
                    if (!z || i <= a) {
                        gVar2.mo44204d(i4);
                        i4--;
                    } else {
                        listIterator.remove();
                    }
                }
            }
        }
        return true;
    }
}
