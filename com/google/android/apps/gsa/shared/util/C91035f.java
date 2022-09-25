package com.google.android.apps.gsa.shared.util;

import androidx.core.p096h.C1950c;
import androidx.core.p096h.C1956i;
import androidx.core.p096h.C1963p;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.f */
/* compiled from: PG */
public final class C91035f {

    /* renamed from: a */
    private static final Locale f254282a = new Locale("ar");

    /* renamed from: b */
    private static Locale f254283b = Locale.getDefault();

    /* renamed from: c */
    private static C1950c f254284c = C1950c.m5272a();

    /* renamed from: a */
    public static C1950c m148705a() {
        Locale locale = Locale.getDefault();
        if (!f254283b.equals(locale)) {
            f254283b = locale;
            f254284c = C1950c.m5273b(locale);
        }
        return f254284c;
    }

    /* renamed from: b */
    public static String m148706b(int i, String str) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        C1950c a = m148705a();
        C1950c a2 = m148705a();
        String f = a2.mo5101f(integerInstance.format((long) i), a2.f5867d);
        return a.mo5101f(f + "°" + str, m148710f());
    }

    /* renamed from: d */
    public static String m148708d(String str) {
        if (str == null) {
            return null;
        }
        C1950c a = m148705a();
        return a.mo5101f(str, a.f5867d);
    }

    /* renamed from: e */
    public static String m148709e(double d) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(0);
        percentInstance.setMaximumFractionDigits(0);
        return m148705a().mo5101f(percentInstance.format(d / 100.0d), m148710f());
    }

    /* renamed from: f */
    private static C1956i m148710f() {
        return f254282a.getLanguage().equals(Locale.getDefault().getLanguage()) ? C1963p.f5880b : C1963p.f5879a;
    }

    /* renamed from: g */
    private static boolean m148711g(String str) {
        return str.startsWith("ar") || str.startsWith("he") || str.startsWith("iw") || str.startsWith("fa");
    }

    /* renamed from: c */
    public static String m148707c(String str, String str2, String str3) {
        str.getClass();
        boolean g = m148711g(str3);
        if (g == m148711g(str2)) {
            return str;
        }
        C1950c c = C1950c.m5274c(g);
        return c.mo5101f(str, c.f5867d);
    }
}
