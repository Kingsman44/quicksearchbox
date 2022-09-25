package com.google.android.apps.search.assistant.libraries.p8978i;

import java.text.Normalizer;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.libraries.i.a */
/* compiled from: PG */
public final class C119408a {
    /* renamed from: a */
    public static String m198131a(CharSequence charSequence, Locale locale) {
        return Normalizer.normalize(charSequence, Normalizer.Form.NFKC).toLowerCase(locale);
    }
}
