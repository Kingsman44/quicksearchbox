package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58912v;
import java.util.Locale;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.b */
/* compiled from: PG */
public final class C42092b {

    /* renamed from: a */
    private static final C58912v f110043a = new C58903m('.');

    /* renamed from: b */
    private static final C58869cf f110044b = C58869cf.m90936b(new C58903m('.'));

    /* renamed from: c */
    private static final C58869cf f110045c = C58869cf.m90936b(new C58903m('@'));

    /* renamed from: a */
    public static String m73789a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.trim().toLowerCase(Locale.getDefault());
        if (!lowerCase.endsWith("@gmail.com") && !lowerCase.endsWith("@googlemail.com")) {
            return lowerCase;
        }
        lowerCase.length();
        return String.valueOf(f110043a.mo56193m(lowerCase.substring(0, lowerCase.lastIndexOf(64)))).concat("@gmail.com");
    }

    /* renamed from: b */
    public static String m73790b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null || TextUtils.isEmpty(telephonyManager.getSimCountryIso())) {
            return Locale.getDefault().getCountry();
        }
        return new Locale(Locale.getDefault().getLanguage(), telephonyManager.getSimCountryIso()).getCountry();
    }

    /* renamed from: c */
    public static String m73791c(String str, Context context) {
        String formatNumber = PhoneNumberUtils.formatNumber(str, m73790b(context));
        return formatNumber == null ? str : formatNumber;
    }

    /* renamed from: d */
    public static boolean m73792d(String str, String str2) {
        return m73789a(str).equals(m73789a(str2));
    }

    /* renamed from: e */
    public static boolean m73793e(String str, String str2, Context context) {
        if (str != null && str.equals(str2)) {
            return true;
        }
        String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(str, m73790b(context));
        String formatNumberToE1642 = PhoneNumberUtils.formatNumberToE164(str2, m73790b(context));
        if (formatNumberToE164 == null || !formatNumberToE164.equals(formatNumberToE1642)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m73794f(java.lang.String r8) {
        /*
            r0 = 60
            int r0 = r8.indexOf(r0)
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L_0x009e
            r0 = 62
            int r0 = r8.indexOf(r0)
            if (r0 == r2) goto L_0x0014
            goto L_0x009e
        L_0x0014:
            com.google.common.base.u r0 = com.google.common.base.C58911u.f156751b
            boolean r0 = r0.mo56189h(r8)
            if (r0 == 0) goto L_0x009e
            com.google.common.base.cf r0 = f110045c
            java.util.List r8 = r0.mo56155i(r8)
            int r0 = r8.size()
            r3 = 2
            if (r0 == r3) goto L_0x002a
            return r1
        L_0x002a:
            java.lang.Object r0 = r8.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r4 = 1
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x009e
            char r5 = r0.charAt(r1)
            r6 = 46
            if (r5 == r6) goto L_0x009e
            int r5 = r0.length()
            int r5 = r5 + r2
            char r5 = r0.charAt(r5)
            if (r5 == r6) goto L_0x009e
            java.lang.String r5 = ".."
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0059
            goto L_0x009e
        L_0x0059:
            com.google.common.base.cf r0 = f110044b
            java.util.List r8 = r0.mo56155i(r8)
            int r0 = r8.size()
            if (r0 >= r3) goto L_0x0066
            return r1
        L_0x0066:
            java.util.Iterator r0 = r8.iterator()
        L_0x006a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0090
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x008f
            char r6 = r5.charAt(r1)
            r7 = 45
            if (r6 == r7) goto L_0x008f
            int r6 = r5.length()
            int r6 = r6 + r2
            char r5 = r5.charAt(r6)
            if (r5 != r7) goto L_0x006a
        L_0x008f:
            return r1
        L_0x0090:
            java.lang.Object r8 = com.google.common.p4522b.C58557jl.m90131l(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.length()
            if (r8 >= r3) goto L_0x009d
            return r1
        L_0x009d:
            return r4
        L_0x009e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.peoplekit.common.dataservice.C42092b.m73794f(java.lang.String):boolean");
    }
}
