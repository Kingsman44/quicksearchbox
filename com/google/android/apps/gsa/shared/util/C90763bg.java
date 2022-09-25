package com.google.android.apps.gsa.shared.util;

import android.telephony.PhoneNumberUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90934cd;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.util.bg */
/* compiled from: PG */
public final class C90763bg {

    /* renamed from: a */
    private static final Pattern f253851a = Pattern.compile("[-.()\\s]");

    static {
        Pattern.compile("\\w+");
        Pattern.compile("\\p{Punct}*");
    }

    /* renamed from: a */
    public static String m148261a(String str) {
        String str2;
        String str3;
        int indexOf = str.indexOf(44);
        int indexOf2 = str.indexOf(59);
        if (indexOf >= 0 && indexOf2 >= 0) {
            indexOf = Math.min(indexOf, indexOf2);
        } else if (indexOf < 0) {
            indexOf = indexOf2;
        }
        if (indexOf < 0) {
            str2 = str;
            str3 = BuildConfig.FLAVOR;
        } else {
            str2 = str.substring(0, indexOf);
            str3 = str.substring(indexOf).replace(" ", BuildConfig.FLAVOR);
        }
        if (C90934cd.m148548a()) {
            Pattern pattern = f253851a;
            return String.valueOf(PhoneNumberUtils.formatNumber(pattern.matcher(str2).replaceAll(BuildConfig.FLAVOR))).concat(String.valueOf(pattern.matcher(str3).replaceAll(BuildConfig.FLAVOR)));
        }
        String formatNumber = PhoneNumberUtils.formatNumber(str2, Locale.getDefault().getCountry());
        return formatNumber == null ? str : formatNumber.concat(String.valueOf(str3));
    }

    /* renamed from: b */
    public static String m148262b(String str) {
        return (!str.startsWith("\"") || !str.endsWith("\"") || str.length() <= 2) ? str : str.substring(1, str.length() - 1);
    }

    /* renamed from: c */
    public static String m148263c(Object obj) {
        return obj == null ? BuildConfig.FLAVOR : obj.toString();
    }

    /* renamed from: d */
    public static boolean m148264d(String str, Iterable iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (Pattern.matches((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }
}
