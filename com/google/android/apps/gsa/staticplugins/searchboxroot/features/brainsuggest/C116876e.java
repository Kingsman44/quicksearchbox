package com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest;

import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.e */
/* compiled from: PG */
public final class C116876e implements C41630d {
    /* renamed from: a */
    public final int mo44213a() {
        return 10000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        Iterator it = list.iterator();
        char c = 1;
        while (it.hasNext()) {
            C41633g gVar = (C41633g) it.next();
            if (gVar.mo44216l() != 13) {
                gVar.mo44204d(gVar.mo44215k() + 10);
                if (c == 2) {
                    c = 3;
                }
            } else if (c == 1) {
                c = 2;
            }
        }
        if (c == 3) {
            return true;
        }
        return false;
    }
}
