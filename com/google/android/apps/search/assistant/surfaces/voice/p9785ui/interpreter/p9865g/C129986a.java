package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9865g;

import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.g.a */
/* compiled from: PG */
public final class C129986a {
    /* renamed from: a */
    public static final String m212186a(String str) {
        C69664n.m101061g(str, "languageCode");
        Locale locale = Locale.getDefault();
        C69664n.m101060f(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        C69664n.m101060f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int B = C69764m.m101185B(lowerCase, '-', 0, 6);
        int B2 = C69764m.m101185B(lowerCase, '_', 0, 6);
        if (B >= 0) {
            String substring = lowerCase.substring(0, B);
            C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        } else if (B2 < 0) {
            return lowerCase;
        } else {
            String substring2 = lowerCase.substring(0, B2);
            C69664n.m101060f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }
}
