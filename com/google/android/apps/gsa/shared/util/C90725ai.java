package com.google.android.apps.gsa.shared.util;

import android.text.TextUtils;
import com.google.common.base.C58838bb;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.ai */
/* compiled from: PG */
public final class C90725ai {
    /* renamed from: a */
    public static String m148179a(String str, String str2) {
        C58838bb.m90866a(str, "locale is null.");
        return str.replace('-', '_').toUpperCase(Locale.US).concat(str2);
    }

    /* renamed from: b */
    public static Locale m148180b(String str, Locale locale) {
        if (str == null || TextUtils.isEmpty(str)) {
            return locale;
        }
        int indexOf = str.indexOf(95);
        if (indexOf == -1) {
            return new Locale(str);
        }
        String substring = str.substring(0, indexOf);
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(95, i);
        if (indexOf2 == -1) {
            return new Locale(substring, str.substring(i));
        }
        String substring2 = str.substring(i, indexOf2);
        int i2 = indexOf2 + 1;
        int indexOf3 = str.indexOf(95, i2);
        return new Locale(substring, substring2, indexOf3 == -1 ? str.substring(i2) : str.substring(i2, indexOf3));
    }

    /* renamed from: c */
    public static boolean m148181c(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        if (str2 == null) {
            return false;
        }
        int indexOf = str.indexOf(45);
        if (indexOf == -1) {
            indexOf = str.length();
        }
        int indexOf2 = str2.indexOf(45);
        if (indexOf2 == -1) {
            indexOf2 = str2.length();
        }
        if (indexOf != indexOf2) {
            return false;
        }
        return str.regionMatches(0, str2, 0, indexOf);
    }
}
