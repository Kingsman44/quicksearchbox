package androidx.core.p096h;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: androidx.core.h.e */
/* compiled from: PG */
final class C1952e {
    /* renamed from: a */
    static ULocale m5283a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* renamed from: b */
    static ULocale m5284b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: c */
    static String m5285c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
