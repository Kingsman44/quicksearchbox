package com.google.android.apps.gsa.search.core.preferences.cards;

import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.cards.g */
/* compiled from: PG */
public final /* synthetic */ class C86309g implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C86309g f233360a = new C86309g();

    private /* synthetic */ C86309g() {
    }

    public final int compare(Object obj, Object obj2) {
        C86308f fVar = (C86308f) obj;
        C86308f fVar2 = (C86308f) obj2;
        int compareTo = fVar.f233358a.f236405a.compareTo(fVar2.f233358a.f236405a);
        if (compareTo != 0) {
            return compareTo;
        }
        String str = fVar.f233359b.f236373d;
        String str2 = fVar2.f233359b.f236373d;
        if (str == null || str2 == null) {
            return 0;
        }
        return str.compareTo(str2);
    }
}
