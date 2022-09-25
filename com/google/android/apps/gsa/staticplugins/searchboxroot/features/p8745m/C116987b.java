package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8745m;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.searchbox.root.p3199a.C41628b;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.m.b */
/* compiled from: PG */
public final class C116987b implements C41628b {

    /* renamed from: a */
    private final C86124t f324776a;

    public C116987b(C86124t tVar) {
        this.f324776a = tVar;
    }

    /* renamed from: c */
    private static int m194418c(C41633g gVar) {
        if (gVar.mo44217m() == 84 && gVar.mo44222r().contains(223)) {
            return 5;
        }
        if (gVar.mo44217m() == 84) {
            return 4;
        }
        if (gVar.mo44217m() == 156 && gVar.mo44222r().contains(286)) {
            return 6;
        }
        if (gVar.mo44217m() != 156 || !gVar.mo44222r().contains(298)) {
            return gVar.mo44217m() == 89 ? 2 : 1;
        }
        return 3;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 10300;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        boolean z;
        if (!this.f324776a.mo79746e(C90085ej.f250159aj)) {
            return false;
        }
        if (!this.f324776a.mo79746e(C90085ej.f250157ah)) {
            Iterator it = list.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                z2 |= !(m194418c((C41633g) it.next()) != 5);
            }
            if (z2) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (m194418c((C41633g) it2.next()) == 4) {
                        it2.remove();
                    }
                }
            }
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator it3 = list.iterator();
        boolean z3 = false;
        while (true) {
            if (!it3.hasNext()) {
                z = false;
                break;
            }
            int c = m194418c((C41633g) it3.next());
            if (c == 5 || c == 4) {
                if (z3) {
                    z = true;
                    break;
                }
                z3 = true;
            }
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            C41633g gVar = (C41633g) it4.next();
            C41693s sVar = gVar.mo44218n().f109009c;
            if (sVar == null) {
                sVar = C41693s.f109053h;
            }
            String str = sVar.f109059e;
            int c2 = m194418c(gVar);
            if (c2 != 1 && ((!z || c2 != 6) && (!hashMap.containsKey(str) || c2 - 1 > m194418c((C41633g) hashMap.get(str)) - 1))) {
                hashMap.put(str, gVar);
            }
        }
        boolean z4 = false;
        for (C41633g c3 : hashMap.values()) {
            z4 |= !(m194418c(c3) != 5);
        }
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            C41633g gVar2 = (C41633g) it5.next();
            C41693s sVar2 = gVar2.mo44218n().f109009c;
            if (sVar2 == null) {
                sVar2 = C41693s.f109053h;
            }
            String str2 = sVar2.f109059e;
            if (!z || m194418c(gVar2) != 6) {
                int c4 = m194418c(gVar2);
                C41633g gVar3 = (C41633g) hashMap.get(str2);
                int i = c4 - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 || i == 4) {
                            if (gVar3 != null) {
                                if (gVar2 != gVar3) {
                                    if (c4 == m194418c(gVar3)) {
                                    }
                                }
                            }
                        } else if (i != 5) {
                        }
                    }
                    if (gVar2 == gVar3) {
                        if (z4 && this.f324776a.mo79746e(C90085ej.f250227e)) {
                            gVar2.mo44209i();
                            gVar2.mo44205e(C41669ai.f108958g);
                        }
                    }
                } else if (gVar2 == gVar3) {
                }
                it5.remove();
            } else {
                it5.remove();
            }
        }
        return false;
    }
}
