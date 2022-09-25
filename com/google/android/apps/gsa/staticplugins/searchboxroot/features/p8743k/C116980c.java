package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8743k;

import android.util.SparseArray;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.searchbox.root.p3199a.C41629c;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.k.c */
/* compiled from: PG */
public final class C116980c implements C41629c {

    /* renamed from: a */
    private final C86124t f324751a;

    public C116980c(C86124t tVar) {
        this.f324751a = tVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 15000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        boolean z;
        boolean z2 = this.f324751a.mo79746e(C90014bt.f247783nf) && ((C88616t) aVar).f239557b == 7;
        if (z2) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41633g gVar = (C41633g) it.next();
                if (sparseArray.get(gVar.mo44221q().intValue()) != null) {
                    ((List) sparseArray.get(gVar.mo44221q().intValue())).add(gVar);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(gVar);
                    sparseArray.put(gVar.mo44221q().intValue(), arrayList);
                }
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                Collections.sort((List) sparseArray.get(sparseArray.keyAt(i)), C116979b.f324750a);
            }
            z = false;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                List list2 = (List) sparseArray.get(sparseArray.keyAt(i2));
                int size = list2.size() - 1;
                int i3 = 0;
                while (i3 < size) {
                    int k = ((C41633g) list2.get(i3)).mo44215k();
                    ((C41633g) list2.get(i3)).mo44204d(((C41633g) list2.get(size)).mo44215k());
                    ((C41633g) list2.get(size)).mo44204d(k);
                    i3++;
                    size--;
                    z = true;
                }
            }
        } else {
            z = false;
        }
        return z2 && z;
    }
}
