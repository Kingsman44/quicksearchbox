package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.bh */
/* compiled from: PG */
final class C101961bh {
    /* renamed from: a */
    static int m168747a(String str, String str2) {
        if (str.isEmpty()) {
            return 0;
        }
        Locale forLanguageTag = Locale.forLanguageTag(str2);
        BreakIterator wordInstance = BreakIterator.getWordInstance(forLanguageTag);
        wordInstance.setText(str);
        int i = 0;
        int i2 = 0;
        for (int first = wordInstance.first(); first != -1; first = wordInstance.next()) {
            if (m168749c(str.substring(i2, first).toLowerCase(forLanguageTag))) {
                i++;
            }
            i2 = first;
        }
        return i;
    }

    /* renamed from: b */
    static int m168748b(String str, int i, String str2) {
        Locale forLanguageTag = Locale.forLanguageTag(str2);
        BreakIterator wordInstance = BreakIterator.getWordInstance(forLanguageTag);
        wordInstance.setText(str);
        int i2 = 0;
        for (int first = wordInstance.first(); first != -1 && i > 0; first = wordInstance.next()) {
            if (m168749c(str.substring(i2, first).toLowerCase(forLanguageTag))) {
                i--;
            }
            i2 = first;
        }
        return i2;
    }

    /* renamed from: c */
    private static boolean m168749c(String str) {
        if (str.length() == 1) {
            return Character.isLetterOrDigit(str.charAt(0));
        }
        return !str.trim().isEmpty();
    }
}
