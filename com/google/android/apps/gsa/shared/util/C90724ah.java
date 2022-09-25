package com.google.android.apps.gsa.shared.util;

import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.ah */
/* compiled from: PG */
public final class C90724ah {
    /* renamed from: a */
    public static boolean m148178a(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        return list.equals(list2);
    }
}
