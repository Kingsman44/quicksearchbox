package com.google.android.libraries.gsa.util;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.gsa.util.f */
/* compiled from: PG */
public final class C23341f {
    /* renamed from: a */
    public static int m43774a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static int m43775b(CharSequence charSequence, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (!Character.isWhitespace(charSequence.charAt(i3))) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: c */
    static String m43776c(CharSequence charSequence, int i, int i2) {
        int i3 = i;
        boolean z = false;
        while (i3 < i2) {
            char charAt = charSequence.charAt(i3);
            boolean isWhitespace = Character.isWhitespace(charAt);
            if (!isWhitespace || (!z && charAt == ' ')) {
                i3++;
                z = isWhitespace;
            } else {
                StringBuilder sb = new StringBuilder((i2 - i) + 1);
                boolean z2 = false;
                while (i < i2) {
                    if (Character.isWhitespace(charSequence.charAt(i))) {
                        z2 = true;
                    } else {
                        if (z2) {
                            sb.append(' ');
                        }
                        sb.append(charSequence.charAt(i));
                        z2 = false;
                    }
                    i++;
                }
                if (z2) {
                    sb.append(' ');
                }
                return sb.toString();
            }
        }
        return charSequence.subSequence(i, i2).toString();
    }

    /* renamed from: d */
    public static String m43777d(CharSequence charSequence) {
        int a = m43774a(charSequence, 0, charSequence.length());
        if (a == -1) {
            return BuildConfig.FLAVOR;
        }
        return m43776c(charSequence, a, m43775b(charSequence, 0, charSequence.length()) + 1);
    }

    /* renamed from: e */
    public static String m43778e(CharSequence charSequence) {
        int a = m43774a(charSequence, 0, charSequence.length());
        if (a == -1) {
            return BuildConfig.FLAVOR;
        }
        return m43776c(charSequence, a, charSequence.length());
    }
}
