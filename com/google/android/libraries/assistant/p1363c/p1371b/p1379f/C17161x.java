package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.common.base.C58869cf;
import com.google.common.base.C58890d;
import com.google.common.base.C58903m;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.b.f.x */
/* compiled from: PG */
public final class C17161x {

    /* renamed from: a */
    private static final Pattern f49867a = Pattern.compile("^(([A-Za-z]{1,8}|\\*)(\\-([A-Za-z0-9]{1,8}|\\*))*)$");

    /* renamed from: a */
    public static Optional m34312a(String str, Locale locale) {
        if (str.trim().isEmpty()) {
            return Optional.empty();
        }
        for (String str2 : C58869cf.m90936b(new C58903m(',')).mo56153g(str)) {
            String trim = str2.trim();
            if (m34314c(trim)) {
                List i = C58869cf.m90936b(new C58903m('-')).mo56155i(trim);
                List i2 = C58869cf.m90936b(new C58903m('-')).mo56155i(locale.toLanguageTag());
                String language = new Locale((String) i.get(0)).getLanguage();
                String str3 = (String) i2.get(0);
                if (language.equals("*") || C58890d.m90990e(language, str3)) {
                    int i3 = 1;
                    int i4 = 1;
                    while (i3 < i.size()) {
                        String str4 = (String) i.get(i3);
                        if (str4.equals("*")) {
                            i3++;
                        } else if (i4 < i2.size()) {
                            String str5 = (String) i2.get(i4);
                            if (C58890d.m90990e(str4, str5)) {
                                i3++;
                            } else if (str5.length() == 1) {
                            }
                            i4++;
                        }
                    }
                    return Optional.m71637of(str2);
                }
            } else {
                throw new IllegalArgumentException(String.format("The language range parameter %s was not formatted correctly", new Object[]{trim}));
            }
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public static boolean m34313b(String str) {
        if (!str.trim().isEmpty()) {
            for (String trim : C58869cf.m90936b(new C58903m(',')).mo56153g(str)) {
                if (!m34314c(trim.trim())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m34314c(String str) {
        return f49867a.matcher(str).find();
    }
}
