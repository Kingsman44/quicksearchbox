package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8735h;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.h.b */
/* compiled from: PG */
public final class C116914b implements C41630d {

    /* renamed from: a */
    private final C86338r f324607a;

    public C116914b(C86338r rVar) {
        this.f324607a = rVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 900;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        boolean z = false;
        if (this.f324607a.getBoolean("suggest_trends_enabled", true)) {
            return false;
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (((C41633g) listIterator.next()).mo44222r().contains(143)) {
                listIterator.remove();
                z = true;
            }
        }
        return z;
    }
}
