package androidx.core.p094f;

import androidx.core.p096h.C1953f;
import java.util.Locale;

/* renamed from: androidx.core.f.h */
/* compiled from: PG */
final class C1895h {

    /* renamed from: a */
    private static final Locale[] f5772a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* renamed from: a */
    static Locale m5158a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: b */
    static boolean m5159b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m5160c(locale) || m5160c(locale2)) {
            return false;
        }
        String a = C1953f.m5286a(locale);
        if (!a.isEmpty()) {
            return a.equals(C1953f.m5286a(locale2));
        }
        String country = locale.getCountry();
        if (country.isEmpty() || country.equals(locale2.getCountry())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m5160c(Locale locale) {
        Locale[] localeArr = f5772a;
        int length = localeArr.length;
        for (int i = 0; i < 2; i++) {
            if (localeArr[i].equals(locale)) {
                return true;
            }
        }
        return false;
    }
}
