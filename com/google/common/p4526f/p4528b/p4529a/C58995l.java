package com.google.common.p4526f.p4528b.p4529a;

import com.evernote.android.state.BuildConfig;
import java.util.logging.Level;

/* renamed from: com.google.common.f.b.a.l */
/* compiled from: PG */
public final class C58995l {
    /* renamed from: a */
    public static int m91182a(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }

    /* renamed from: b */
    public static String m91183b(String str) {
        if (str.length() > 23) {
            int i = -1;
            int length = str.length() - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                } else {
                    length--;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = BuildConfig.FLAVOR.concat(String.valueOf(str));
        return concat.substring(0, Math.min(concat.length(), 23));
    }
}
