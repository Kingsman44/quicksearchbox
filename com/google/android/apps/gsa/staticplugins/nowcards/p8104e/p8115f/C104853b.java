package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8115f;

import com.google.common.base.C58838bb;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.f.b */
/* compiled from: PG */
public final class C104853b {
    /* renamed from: a */
    public static int m173813a(String str) {
        String[] split = str.split("-");
        C58838bb.m90869d(split.length == 3, "Invalid feature name was given");
        return Integer.parseInt(split[2]);
    }

    /* renamed from: b */
    public static String m173814b(int i) {
        return String.format(Locale.ENGLISH, "%s-type-%s", new Object[]{"TYPE_MODULE", Integer.valueOf(i)});
    }
}
