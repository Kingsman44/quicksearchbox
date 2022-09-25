package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import java.util.Comparator;
import p5462h.p5465b.C69544a;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.w */
/* compiled from: PG */
public final class C37142w implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Comparator f96735a;

    public C37142w(Comparator comparator) {
        this.f96735a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.f96735a.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        Comparator comparator = C37095ae.f96612a;
        return C69544a.m100954a(Double.valueOf(((C37095ae) obj2).f96618f), Double.valueOf(((C37095ae) obj).f96618f));
    }
}
