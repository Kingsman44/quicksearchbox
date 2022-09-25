package com.google.android.apps.search.assistant.verticals.automation.routines.p10034g;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.g.a */
/* compiled from: PG */
public final class C131895a {
    /* renamed from: a */
    public static int m214361a(int i) {
        C58838bb.m90871f(i >= 0, "Negative value %s", i);
        if (i < 100000) {
            if (i < 100) {
                return i >= 10 ? 2 : 1;
            }
            if (i < 1000) {
                return 3;
            }
            return i >= 10000 ? 5 : 4;
        } else if (i < 10000000) {
            return i >= 1000000 ? 7 : 6;
        } else {
            if (i < 100000000) {
                return 8;
            }
            return i >= 1000000000 ? 10 : 9;
        }
    }
}
