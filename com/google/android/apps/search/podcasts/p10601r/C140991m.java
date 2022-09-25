package com.google.android.apps.search.podcasts.p10601r;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.r.m */
/* compiled from: PG */
public final class C140991m {
    /* renamed from: a */
    public static boolean m228953a(List list, int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2) + 1;
        if (min < 0 || max > list.size()) {
            return false;
        }
        Collections.rotate(list.subList(min, max), i < i2 ? -1 : 1);
        return true;
    }
}
