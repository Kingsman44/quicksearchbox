package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.text.TextUtils;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.libraries.searchbox.root.p3199a.C41628b;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.y */
/* compiled from: PG */
public final class C116940y implements C41628b {
    /* renamed from: a */
    public final int mo44213a() {
        return 13000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        C88616t tVar = (C88616t) aVar;
        boolean z = false;
        if (TextUtils.isEmpty(tVar.f239556a.mo84352bk()) && !list.isEmpty() && tVar.f239556a.mo84406cm()) {
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                C41633g gVar = (C41633g) listIterator.next();
                if (gVar.mo44221q().intValue() != C41669ai.f108954c.intValue() && gVar.mo44216l() == 1) {
                    gVar.mo44205e(C41669ai.f108954c);
                    z = true;
                }
            }
        }
        return z;
    }
}
