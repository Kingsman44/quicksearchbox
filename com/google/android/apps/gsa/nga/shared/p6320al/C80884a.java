package com.google.android.apps.gsa.nga.shared.p6320al;

import java.text.Normalizer;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.al.a */
/* compiled from: PG */
public final class C80884a {
    @Deprecated
    /* renamed from: a */
    public static String m128736a(CharSequence charSequence) {
        return Normalizer.normalize(charSequence, Normalizer.Form.NFKC).toLowerCase(Locale.US);
    }

    /* renamed from: b */
    public static String m128737b(CharSequence charSequence, Locale locale) {
        return Normalizer.normalize(charSequence, Normalizer.Form.NFKC).toLowerCase(locale);
    }
}
