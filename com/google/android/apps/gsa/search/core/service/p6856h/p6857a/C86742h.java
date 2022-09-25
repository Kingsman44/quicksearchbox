package com.google.android.apps.gsa.search.core.service.p6856h.p6857a;

import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.search.core.service.h.a.h */
/* compiled from: PG */
public final /* synthetic */ class C86742h implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C86742h f234314a = new C86742h();

    private /* synthetic */ C86742h() {
    }

    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int compareTo = str.compareTo(str2);
        if (compareTo != 0) {
            if (str.equals("module")) {
                return -1;
            }
            if (str2.equals("module")) {
                return 1;
            }
        }
        return compareTo;
    }
}
