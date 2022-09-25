package com.google.android.apps.gsa.staticplugins.searchregionpreference;

import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchregionpreference.b */
/* compiled from: PG */
final class C117048b implements Comparator {

    /* renamed from: a */
    final /* synthetic */ String f324987a;

    public C117048b(String str) {
        this.f324987a = str;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str.equals(this.f324987a)) {
            return -1;
        }
        if (str2.equals(this.f324987a)) {
            return 1;
        }
        return str.compareToIgnoreCase(str2);
    }
}
