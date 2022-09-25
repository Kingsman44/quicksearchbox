package com.google.common.util;

import com.evernote.android.state.BuildConfig;
import java.util.regex.Pattern;

/* renamed from: com.google.common.util.c */
/* compiled from: PG */
public final class C60790c {
    static {
        Pattern.compile("^/+");
        Pattern.compile("/+$");
        Pattern.compile("/{2,}");
        Pattern.compile("(.*[^/])/+$");
    }

    /* renamed from: a */
    public static String m92793a(String... strArr) {
        int i = r0 - 1;
        if (i == -1) {
            return BuildConfig.FLAVOR;
        }
        for (String length : strArr) {
            i += length.length();
        }
        char[] cArr = new char[i];
        int i2 = 0;
        for (String str : strArr) {
            if (!str.isEmpty()) {
                if (i2 > 0 && cArr[i2 - 1] != '/') {
                    cArr[i2] = '/';
                    i2++;
                }
                int length2 = str.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt = str.charAt(i3);
                    if (charAt == '/') {
                        if (i2 <= 0 || cArr[i2 - 1] != '/') {
                            charAt = '/';
                        }
                    }
                    cArr[i2] = charAt;
                    i2++;
                }
            }
        }
        return new String(cArr, 0, i2);
    }
}
