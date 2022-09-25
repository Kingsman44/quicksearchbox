package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.text.TextUtils;
import com.google.android.libraries.searchbox.root.p3199a.C41628b;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.common.base.C58832aw;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.v */
/* compiled from: PG */
public final class C116937v implements C41628b {
    /* renamed from: a */
    public final int mo44213a() {
        return 11000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            C41633g gVar = (C41633g) it.next();
            String str = null;
            if (gVar.mo44223s()) {
                C54228aq o = gVar.mo44219o();
                C54216ae aeVar = o.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                if ((aeVar.f142290a & 128) != 0) {
                    C54216ae aeVar2 = o.f142334f;
                    if (aeVar2 == null) {
                        aeVar2 = C54216ae.f142285C;
                    }
                    str = true != aeVar2.f142298i ? "0" : "1";
                }
            }
            if (!TextUtils.isEmpty(str) && gVar.mo44221q() == C41669ai.f108954c) {
                arrayList.add(gVar);
            } else if (C58832aw.m90831a(gVar.mo44221q(), C41669ai.f108961j)) {
                i = Math.max(i, gVar.mo44215k());
                z = true;
            }
        }
        if (!z || arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C41633g gVar2 = (C41633g) arrayList.get(i2);
            gVar2.mo44204d(gVar2.mo44215k() + i);
            gVar2.mo44205e(C41669ai.f108961j);
        }
        return true;
    }
}
