package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import java.util.Comparator;
import p5462h.p5465b.C69544a;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.aa */
/* compiled from: PG */
public final class C37091aa implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Comparator f96608a;

    public C37091aa(Comparator comparator) {
        this.f96608a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.f96608a.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        Comparator comparator = C37095ae.f96612a;
        return C69544a.m100954a(Double.valueOf(((C37095ae) obj2).f96622j), Double.valueOf(((C37095ae) obj).f96622j));
    }
}
