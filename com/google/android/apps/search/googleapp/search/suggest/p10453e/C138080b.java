package com.google.android.apps.search.googleapp.search.suggest.p10453e;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.e.b */
/* compiled from: PG */
public final class C138080b {
    /* renamed from: a */
    public static String m224415a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return BuildConfig.FLAVOR;
        }
        int length2 = charSequence.length();
        int i2 = i;
        boolean z = false;
        while (i2 < length2) {
            char charAt = charSequence.charAt(i2);
            boolean isWhitespace = Character.isWhitespace(charAt);
            if (!isWhitespace || (!z && charAt == ' ')) {
                i2++;
                z = isWhitespace;
            } else {
                StringBuilder sb = new StringBuilder((length2 - i) + 1);
                boolean z2 = false;
                while (i < length2) {
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
        return charSequence.subSequence(i, length2).toString();
    }
}
