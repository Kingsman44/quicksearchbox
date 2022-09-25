package com.google.android.libraries.lens.view.utils;

import java.util.Locale;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.utils.y */
/* compiled from: PG */
public final class C28136y {
    /* renamed from: a */
    public static String m52430a(Locale locale) {
        String b = m52431b(locale);
        if (b.startsWith("zh")) {
            return "zh";
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ba A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m52431b(java.util.Locale r8) {
        /*
            java.lang.String r0 = r8.getLanguage()
            int r1 = r0.hashCode()
            r2 = 3365(0xd25, float:4.715E-42)
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == r2) goto L_0x0059
            r2 = 3391(0xd3f, float:4.752E-42)
            if (r1 == r2) goto L_0x004f
            r2 = 3404(0xd4c, float:4.77E-42)
            if (r1 == r2) goto L_0x0045
            r2 = 3508(0xdb4, float:4.916E-42)
            if (r1 == r2) goto L_0x003b
            r2 = 3886(0xf2e, float:5.445E-42)
            if (r1 == r2) goto L_0x0031
            r2 = 101385(0x18c09, float:1.4207E-40)
            if (r1 == r2) goto L_0x0027
            goto L_0x0063
        L_0x0027:
            java.lang.String r1 = "fil"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 2
            goto L_0x0064
        L_0x0031:
            java.lang.String r1 = "zh"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 5
            goto L_0x0064
        L_0x003b:
            java.lang.String r1 = "nb"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 0
            goto L_0x0064
        L_0x0045:
            java.lang.String r1 = "jv"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 4
            goto L_0x0064
        L_0x004f:
            java.lang.String r1 = "ji"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 3
            goto L_0x0064
        L_0x0059:
            java.lang.String r1 = "in"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x0063:
            r1 = -1
        L_0x0064:
            if (r1 == 0) goto L_0x00ba
            if (r1 == r7) goto L_0x00b7
            if (r1 == r6) goto L_0x00b4
            if (r1 == r5) goto L_0x00b1
            if (r1 == r4) goto L_0x00ae
            if (r1 == r3) goto L_0x0071
            return r0
        L_0x0071:
            java.lang.String r0 = r8.getScript()
            java.lang.String r1 = "Hans"
            boolean r1 = android.text.TextUtils.equals(r0, r1)
            java.lang.String r2 = "zh-CN"
            if (r1 == 0) goto L_0x0080
            goto L_0x00ad
        L_0x0080:
            java.lang.String r1 = "Hant"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            java.lang.String r1 = "zh-TW"
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            r2 = r1
            goto L_0x00ad
        L_0x008c:
            java.util.Locale r0 = java.util.Locale.TAIWAN
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = r8.getCountry()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x009d
            goto L_0x008a
        L_0x009d:
            java.util.Locale r0 = java.util.Locale.CHINA
            java.lang.String r0 = r0.getCountry()
            java.lang.String r8 = r8.getCountry()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x008a
        L_0x00ad:
            return r2
        L_0x00ae:
            java.lang.String r8 = "jw"
            return r8
        L_0x00b1:
            java.lang.String r8 = "yi"
            return r8
        L_0x00b4:
            java.lang.String r8 = "tl"
            return r8
        L_0x00b7:
            java.lang.String r8 = "id"
            return r8
        L_0x00ba:
            java.lang.String r8 = "no"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.utils.C28136y.m52431b(java.util.Locale):java.lang.String");
    }

    /* renamed from: c */
    public static Locale m52432c(Locale locale) {
        if (!locale.getLanguage().equals("zh")) {
            return locale;
        }
        if (locale.getCountry().equals("TW") || locale.getCountry().equals("HK")) {
            return Locale.forLanguageTag("zh-Hant");
        }
        return Locale.forLanguageTag("zh-Hans");
    }

    /* renamed from: d */
    public static Locale m52433d(Locale locale) {
        return Locale.forLanguageTag("tl").equals(locale) ? Locale.forLanguageTag("fil") : locale;
    }

    /* renamed from: e */
    public static Locale m52434e(Locale locale) {
        return (Objects.equals(locale, Locale.SIMPLIFIED_CHINESE) || Objects.equals(locale, Locale.TRADITIONAL_CHINESE)) ? Locale.CHINESE : locale;
    }
}
