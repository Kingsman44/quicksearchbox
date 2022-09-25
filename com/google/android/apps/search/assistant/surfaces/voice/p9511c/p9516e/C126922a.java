package com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9516e;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.c.e.a */
/* compiled from: PG */
public final class C126922a {

    /* renamed from: a */
    private static final List f349452a = C69540x.m100947e("iPhone", "iPad", "iPod", "iMac", "eBay", "mRNA", "tRNA", "rRNA", "deVries");

    /* renamed from: a */
    public static final String m207614a(String str, Locale locale) {
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(locale, "locale");
        if (str.length() == 0) {
            return str;
        }
        C69664n.m101061g(str, "<this>");
        if (str.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (Character.isUpperCase(str.charAt(0))) {
            return str;
        } else {
            List<String> list = f349452a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String m : list) {
                    if (C69764m.m101234m(str, m)) {
                        return str;
                    }
                }
            }
            if (str.length() <= 0) {
                return str;
            }
            char charAt = str.charAt(0);
            C69664n.m101061g(locale, "locale");
            C69664n.m101061g(locale, "locale");
            String valueOf = String.valueOf(charAt);
            C69664n.m101059e(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(locale);
            C69664n.m101060f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (upperCase.length() <= 1) {
                String valueOf2 = String.valueOf(charAt);
                C69664n.m101059e(valueOf2, "null cannot be cast to non-null type java.lang.String");
                String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
                C69664n.m101060f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (C69664n.m101066l(upperCase, upperCase2)) {
                    upperCase = String.valueOf(Character.toTitleCase(charAt));
                }
            } else if (charAt != 329) {
                char charAt2 = upperCase.charAt(0);
                C69664n.m101059e(upperCase, "null cannot be cast to non-null type java.lang.String");
                String substring = upperCase.substring(1);
                C69664n.m101060f(substring, "this as java.lang.String).substring(startIndex)");
                C69664n.m101059e(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                C69664n.m101060f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                upperCase = charAt2 + lowerCase;
            }
            String substring2 = str.substring(1);
            C69664n.m101060f(substring2, "this as java.lang.String).substring(startIndex)");
            return String.valueOf(upperCase).concat(String.valueOf(substring2));
        }
    }
}
