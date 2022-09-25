package android.support.p033v7.app;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: android.support.v7.app.u */
/* compiled from: PG */
final class C0400u {
    /* renamed from: a */
    static LocaleList m1319a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* renamed from: b */
    static void m1320b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
