package com.google.common.p4522b;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: com.google.common.b.rb */
/* compiled from: PG */
final class C58763rb {
    /* renamed from: a */
    public static Comparator m90668a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? C58701ou.f156429a : comparator;
    }

    /* renamed from: b */
    public static boolean m90669b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = m90668a((SortedSet) iterable);
        } else if (!(iterable instanceof C58762ra)) {
            return false;
        } else {
            comparator2 = ((C58762ra) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
