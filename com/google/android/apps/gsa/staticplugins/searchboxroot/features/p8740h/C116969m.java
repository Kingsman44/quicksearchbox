package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.m */
/* compiled from: PG */
public final class C116969m implements C41630d {

    /* renamed from: a */
    private final C86124t f324730a;

    public C116969m(C86124t tVar) {
        this.f324730a = tVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 7000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        int i;
        int i2;
        Iterator it = list.iterator();
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            i = 136;
            i2 = 22;
            if (!it.hasNext()) {
                break;
            }
            C41633g gVar = (C41633g) it.next();
            z2 |= !(gVar.mo44216l() != 1);
            if (gVar.mo44216l() == 3 && (gVar.mo44217m() == 35 || gVar.mo44222r().contains(136))) {
                i5++;
                z4 = true;
            }
            z3 |= !(gVar.mo44216l() != 22);
            if (gVar.mo44216l() == 26) {
                i4++;
                z = true;
            }
            if (z4 || z || z3) {
                i3 = Math.max(i3, gVar.mo44215k());
            }
        }
        int i6 = 0;
        if (!z) {
            return false;
        }
        int i7 = i4 + i3;
        int a = (int) this.f324730a.mo79743a(C90085ej.f250135aL);
        int a2 = (int) this.f324730a.mo79743a(C90120fr.f250782V);
        ListIterator listIterator = list.listIterator();
        int i8 = i5 + i7;
        int i9 = i7;
        int i10 = i3;
        int i11 = 0;
        while (listIterator.hasNext()) {
            C41633g gVar2 = (C41633g) listIterator.next();
            if (gVar2.mo44216l() == 3 || gVar2.mo44216l() == i2 || gVar2.mo44216l() == 26) {
                if (gVar2.mo44216l() == 3 && (gVar2.mo44217m() == 35 || gVar2.mo44222r().contains(Integer.valueOf(i)))) {
                    if (z2) {
                        listIterator.remove();
                    } else if (i6 >= a2) {
                        listIterator.remove();
                    } else {
                        gVar2.mo44204d(i8);
                        i6++;
                        i8--;
                    }
                }
                i2 = 22;
                if (gVar2.mo44216l() == 22 && gVar2.mo44217m() == 0) {
                    if (z2) {
                        listIterator.remove();
                    } else {
                        gVar2.mo44204d(i10);
                        i10--;
                    }
                }
                if (gVar2.mo44216l() == 26) {
                    if (z2) {
                        listIterator.remove();
                    } else if (i11 >= a) {
                        listIterator.remove();
                    } else {
                        gVar2.mo44204d(i9);
                        i11++;
                        i9--;
                    }
                }
                i = 136;
            }
            i2 = 22;
        }
        return true;
    }
}
