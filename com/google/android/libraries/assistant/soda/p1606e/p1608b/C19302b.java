package com.google.android.libraries.assistant.soda.p1606e.p1608b;

import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.soda.e.b.b */
/* compiled from: PG */
public final class C19302b {
    /* renamed from: a */
    public static String m36800a(String str) {
        return String.format("hotword_%s", new Object[]{str});
    }

    /* renamed from: b */
    public static String m36801b(String str) {
        return String.valueOf(Locale.forLanguageTag(str).getLanguage()).concat("-*");
    }
}
