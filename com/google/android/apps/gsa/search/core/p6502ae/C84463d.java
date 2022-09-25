package com.google.android.apps.gsa.search.core.p6502ae;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84430al;

/* renamed from: com.google.android.apps.gsa.search.core.ae.d */
/* compiled from: PG */
public final class C84463d {
    /* renamed from: a */
    public static CharSequence m134800a(Context context, C84430al alVar, int i) {
        if (i == 0) {
            return null;
        }
        return context.getPackageManager().getText(alVar.f229734b, i, alVar.f229738f);
    }

    /* renamed from: b */
    public static String m134801b(C84430al alVar) {
        return "enable_corpus_".concat(String.valueOf(alVar.f229733a));
    }

    /* renamed from: c */
    public static boolean m134802c(SharedPreferences sharedPreferences, C84430al alVar) {
        return sharedPreferences.getBoolean("enable_corpus_".concat(String.valueOf(alVar.f229733a)), true);
    }
}
