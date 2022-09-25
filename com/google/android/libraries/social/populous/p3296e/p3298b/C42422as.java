package com.google.android.libraries.social.populous.p3296e.p3298b;

import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.e.b.as */
/* compiled from: PG */
public enum C42422as {
    NOT_COMPARABLE,
    SUBSET,
    EQUAL,
    SUPERSET;

    /* renamed from: a */
    public static C42422as m74735a(Set set, Set set2) {
        Set set3 = set.size() >= set2.size() ? set : set2;
        if (set.size() < set2.size()) {
            set2 = set;
        }
        if (!set3.containsAll(set2)) {
            return NOT_COMPARABLE;
        }
        if (set2.size() == set3.size()) {
            return EQUAL;
        }
        return set3 == set ? SUPERSET : SUBSET;
    }
}
