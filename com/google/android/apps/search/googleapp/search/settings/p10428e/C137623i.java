package com.google.android.apps.search.googleapp.search.settings.p10428e;

import java.util.Comparator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e.i */
/* compiled from: PG */
final class C137623i implements Comparator {

    /* renamed from: a */
    final /* synthetic */ String f374346a;

    public C137623i(String str) {
        this.f374346a = str;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (C69664n.m101066l(str, this.f374346a)) {
            return -1;
        }
        if (C69664n.m101066l(str2, this.f374346a)) {
            return 1;
        }
        C69664n.m101060f(str, "a");
        C69664n.m101060f(str2, "b");
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(str2, "other");
        return str.compareToIgnoreCase(str2);
    }
}
