package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.m */
/* compiled from: PG */
public final class C117004m implements C41630d {

    /* renamed from: a */
    private final C86124t f324811a;

    public C117004m(C86124t tVar) {
        this.f324811a = tVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 4000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        String g;
        boolean e = this.f324811a.mo79746e(C90085ej.f250152ac);
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 1500;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            C41633g gVar = (C41633g) it.next();
            if (gVar.mo44217m() == 83) {
                z = true;
            } else if (gVar.mo44217m() == 110) {
                if (e && (g = C89235z.m145135g((Suggestion) gVar)) != null) {
                    hashSet.add(g);
                }
                if (gVar.mo44215k() < i2) {
                    i2 = gVar.mo44215k();
                }
                z2 = true;
            } else if (gVar.mo44216l() == 19) {
                z3 = true;
            }
        }
        if (!z && !z2 && !z3) {
            return false;
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C41633g gVar2 = (C41633g) listIterator.next();
            if (gVar2.mo44217m() == 97 && z) {
                listIterator.remove();
            } else if (gVar2.mo44217m() == 84) {
                if (z2) {
                    C41693s sVar = gVar2.mo44218n().f109009c;
                    if (sVar == null) {
                        sVar = C41693s.f109053h;
                    }
                    String O = C89235z.m73095O(sVar.f109057c);
                    C41693s sVar2 = gVar2.mo44218n().f109009c;
                    if (sVar2 == null) {
                        sVar2 = C41693s.f109053h;
                    }
                    String h = C89235z.m145136h(O, sVar2.f109059e);
                    if (!e || hashSet.contains(h)) {
                        listIterator.remove();
                    } else {
                        i++;
                        gVar2.mo44204d(i2 - i);
                    }
                }
                if (z3 && gVar2.mo44216l() != 19) {
                    listIterator.remove();
                }
            } else if (gVar2.mo44217m() == 110 && !e) {
                gVar2.mo44205e(C41669ai.f108961j);
            }
        }
        return true;
    }
}
