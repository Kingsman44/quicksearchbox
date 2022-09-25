package com.google.android.apps.gsa.shared.util.p7170h;

import java.lang.Character;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.util.h.a */
/* compiled from: PG */
public final class C91040a {

    /* renamed from: a */
    private static final Set f254286a;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(Character.UnicodeBlock.HANGUL_JAMO);
        hashSet.add(Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT);
        hashSet.add(Character.UnicodeBlock.KANGXI_RADICALS);
        hashSet.add(Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION);
        hashSet.add(Character.UnicodeBlock.HIRAGANA);
        hashSet.add(Character.UnicodeBlock.KATAKANA);
        hashSet.add(Character.UnicodeBlock.BOPOMOFO);
        hashSet.add(Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO);
        hashSet.add(Character.UnicodeBlock.KANBUN);
        hashSet.add(Character.UnicodeBlock.BOPOMOFO_EXTENDED);
        hashSet.add(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS);
        hashSet.add(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS);
        hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY);
        hashSet.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A);
        hashSet.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
        hashSet.add(Character.UnicodeBlock.HANGUL_SYLLABLES);
        hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS);
        hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS);
        hashSet.add(Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS);
        hashSet.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B);
        hashSet.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
        f254286a = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public static boolean m148715a(String str) {
        int length = str.length();
        boolean z = true;
        for (int i = 0; i < length; i++) {
            boolean isWhitespace = Character.isWhitespace(str.codePointAt(i));
            int codePointAt = str.codePointAt(i);
            if (((codePointAt & -256) == 0 || !f254286a.contains(Character.UnicodeBlock.of(codePointAt))) && !isWhitespace) {
                return false;
            }
            z &= isWhitespace;
        }
        return length > 0 && !z;
    }
}
