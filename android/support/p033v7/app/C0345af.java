package android.support.p033v7.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.p094f.C1897j;

/* renamed from: android.support.v7.app.af */
/* compiled from: PG */
final class C0345af {
    /* renamed from: a */
    static C1897j m1060a(Configuration configuration) {
        return C1897j.m5165b(configuration.getLocales().toLanguageTags());
    }

    /* renamed from: b */
    static void m1061b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* renamed from: c */
    public static void m1062c(C1897j jVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(jVar.f5774b.f5775a.toLanguageTags()));
    }

    /* renamed from: d */
    static void m1063d(Configuration configuration, C1897j jVar) {
        configuration.setLocales(LocaleList.forLanguageTags(jVar.f5774b.f5775a.toLanguageTags()));
    }
}
