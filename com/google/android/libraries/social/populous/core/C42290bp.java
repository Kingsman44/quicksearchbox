package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58903m;
import com.google.common.base.C58912v;
import java.util.Locale;

/* renamed from: com.google.android.libraries.social.populous.core.bp */
/* compiled from: PG */
public final class C42290bp {

    /* renamed from: a */
    private static final C58912v f110917a = new C58903m('.');

    /* renamed from: a */
    public static String m74449a(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.getDefault());
        if (!lowerCase.endsWith("@gmail.com") && !lowerCase.endsWith("@googlemail.com")) {
            return lowerCase;
        }
        lowerCase.length();
        return String.valueOf(f110917a.mo56193m(lowerCase.substring(0, lowerCase.lastIndexOf(64)))).concat("@gmail.com");
    }
}
