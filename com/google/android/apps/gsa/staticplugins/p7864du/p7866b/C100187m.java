package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.util.SparseArray;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118327r;
import com.google.android.apps.gsa.store.C118336y;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.m */
/* compiled from: PG */
public final class C100187m {

    /* renamed from: a */
    final SparseArray f280211a = new SparseArray();

    /* renamed from: a */
    public final int mo91793a(int i) {
        C58838bb.m90868c(i < this.f280211a.size());
        return this.f280211a.keyAt(i);
    }

    /* renamed from: b */
    public final String mo91794b(C118302a aVar) {
        C58838bb.m90868c(mo91797e(aVar));
        return (String) this.f280211a.get(aVar.f328381a);
    }

    /* renamed from: c */
    public final void mo91795c(C118327r rVar) {
        C58485gu guVar = rVar.f328453a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C118336y yVar = (C118336y) guVar.get(i);
            int c = yVar.mo103659c();
            if (c == 4 || c == 6 || c == 8 || c == 10) {
                mo91796d(C118302a.m196461a(Integer.parseInt(yVar.mo103656b())));
            } else if (c == 17) {
                mo91795c((C118327r) yVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo91796d(C118302a aVar) {
        if (!mo91797e(aVar)) {
            SparseArray sparseArray = this.f280211a;
            int i = aVar.f328381a;
            int size = sparseArray.size();
            C58838bb.m90868c(size < 26);
            sparseArray.put(i, String.valueOf((char) (size + 65)));
        }
    }

    /* renamed from: e */
    public final boolean mo91797e(C118302a aVar) {
        return this.f280211a.get(aVar.f328381a) != null;
    }
}
