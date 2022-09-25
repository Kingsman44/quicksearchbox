package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8731d;

import com.google.android.libraries.searchbox.root.p3199a.C41629c;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.d.a */
/* compiled from: PG */
public final class C116901a implements C41629c {
    /* renamed from: c */
    private static boolean m194234c(List list, int i, int i2) {
        if (i >= i2) {
            return false;
        }
        ((C41633g) list.get(i)).mo44202b();
        for (int i3 = i + 1; i3 < i2; i3++) {
            ((C41633g) list.get(i3)).mo44203c();
        }
        ((C41633g) list.get(i2)).mo44201a();
        return true;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 16000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            C41633g gVar = (C41633g) list.get(i3);
            if (gVar.mo44222r().contains(378)) {
                if (z) {
                    z2 |= m194234c(list, i, i2);
                }
                z = true;
                i = i3;
                i2 = i;
            } else if (gVar.mo44222r().contains(379) && z) {
                i2 = i3;
            } else if (z) {
                z2 |= m194234c(list, i, i2);
                z = false;
                i = -1;
                i2 = -1;
            }
        }
        if (z) {
            z2 |= m194234c(list, i, i2);
        }
        if (z2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C41633g) it.next()).mo44206f();
            }
        }
        return false;
    }
}
