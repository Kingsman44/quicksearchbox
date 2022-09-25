package com.google.android.apps.gsa.nga.engine.p6056o;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.au;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.m */
/* compiled from: PG */
public final class C77419m {
    /* renamed from: a */
    public static String m124184a(String str, Locale locale) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        if (!str.endsWith("?") && locale.getLanguage().equals(Locale.ENGLISH.getLanguage()) && str.toLowerCase(locale).matches(".*(are|can|should|could) (you|we).*")) {
            str = String.valueOf(str).concat("?");
        }
        return au.a(str);
    }
}
