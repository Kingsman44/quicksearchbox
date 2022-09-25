package org.chromium.base;

import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
public class LocaleUtils {
    private LocaleUtils() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m107021a(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 3365(0xd25, float:4.715E-42)
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == r1) goto L_0x0045
            r1 = 3374(0xd2e, float:4.728E-42)
            if (r0 == r1) goto L_0x003b
            r1 = 3391(0xd3f, float:4.752E-42)
            if (r0 == r1) goto L_0x0031
            r1 = 3405(0xd4d, float:4.771E-42)
            if (r0 == r1) goto L_0x0027
            r1 = 3704(0xe78, float:5.19E-42)
            if (r0 == r1) goto L_0x001d
            goto L_0x004f
        L_0x001d:
            java.lang.String r0 = "tl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004f
            r0 = 3
            goto L_0x0050
        L_0x0027:
            java.lang.String r0 = "jw"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004f
            r0 = 4
            goto L_0x0050
        L_0x0031:
            java.lang.String r0 = "ji"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x003b:
            java.lang.String r0 = "iw"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004f
            r0 = 0
            goto L_0x0050
        L_0x0045:
            java.lang.String r0 = "in"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004f
            r0 = 2
            goto L_0x0050
        L_0x004f:
            r0 = -1
        L_0x0050:
            if (r0 == 0) goto L_0x0067
            if (r0 == r5) goto L_0x0064
            if (r0 == r4) goto L_0x0061
            if (r0 == r3) goto L_0x005e
            if (r0 == r2) goto L_0x005b
            return r6
        L_0x005b:
            java.lang.String r6 = "jv"
            return r6
        L_0x005e:
            java.lang.String r6 = "fil"
            return r6
        L_0x0061:
            java.lang.String r6 = "id"
            return r6
        L_0x0064:
            java.lang.String r6 = "yi"
            return r6
        L_0x0067:
            java.lang.String r6 = "he"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.LocaleUtils.m107021a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static String m107022b(Locale locale) {
        String a = m107021a(locale.getLanguage());
        String country = locale.getCountry();
        if (a.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (country.isEmpty()) {
            return a;
        }
        return a + "-" + country;
    }

    private static String getDefaultCountryCode() {
        C72379e a = C72379e.m107036a();
        if (a.mo63845c()) {
            return a.mo63844b();
        }
        return Locale.getDefault().getCountry();
    }

    public static String getDefaultLocaleListString() {
        LocaleList localeList = LocaleList.getDefault();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < localeList.size(); i++) {
            Locale locale = localeList.get(i);
            String language = locale.getLanguage();
            String a = m107021a(language);
            if (!a.equals(language)) {
                locale = new Locale.Builder().setLocale(locale).setLanguage(a).build();
            }
            arrayList.add(m107022b(locale));
        }
        return TextUtils.join(",", arrayList);
    }

    public static String getDefaultLocaleString() {
        return m107022b(Locale.getDefault());
    }
}
