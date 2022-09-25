package android.support.p033v7.widget;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.bj */
/* compiled from: PG */
final class C0540bj {
    /* renamed from: a */
    static LocaleList m1980a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* renamed from: b */
    static void m1981b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
