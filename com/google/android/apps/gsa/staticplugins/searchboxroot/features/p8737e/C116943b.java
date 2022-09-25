package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8737e;

import com.google.android.libraries.searchbox.root.p3199a.C41629c;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.e.b */
/* compiled from: PG */
public final class C116943b implements C41629c {

    /* renamed from: a */
    public static final C58485gu f324667a = C58485gu.m89846n(139);

    /* renamed from: a */
    public final int mo44213a() {
        return 14000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        boolean z;
        boolean z2;
        ListIterator listIterator = list.listIterator();
        while (true) {
            z = false;
            if (listIterator.hasNext()) {
                if (((C41633g) listIterator.next()).mo44217m() == 167) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        ListIterator listIterator2 = list.listIterator();
        while (z2 && listIterator2.hasNext()) {
            if (f324667a.contains(Integer.valueOf(((C41633g) listIterator2.next()).mo44217m()))) {
                listIterator2.remove();
                z = true;
            }
        }
        return z;
    }
}
