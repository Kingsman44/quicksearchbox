package com.google.android.apps.gsa.searchbox.p6944c.p6950d;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.c.d.b */
/* compiled from: PG */
public final class C88600b {
    /* renamed from: a */
    public static boolean m143213a(C86124t tVar, String str, List list) {
        if (list.isEmpty() || list.contains(str)) {
            return tVar.mo79746e(C90085ej.f250159aj);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m143214b(C86124t tVar, String str, List list) {
        return tVar.mo79746e(C90085ej.f250159aj) && list.contains(str);
    }
}
