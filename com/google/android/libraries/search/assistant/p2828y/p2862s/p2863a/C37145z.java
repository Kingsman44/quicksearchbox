package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import java.util.Comparator;
import p5462h.p5465b.C69544a;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.z */
/* compiled from: PG */
public final class C37145z implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Comparator f96738a;

    public C37145z(Comparator comparator) {
        this.f96738a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.f96738a.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        Comparator comparator = C37095ae.f96612a;
        return C69544a.m100954a(Boolean.valueOf(((C37095ae) obj2).f96626n), Boolean.valueOf(((C37095ae) obj).f96626n));
    }
}
