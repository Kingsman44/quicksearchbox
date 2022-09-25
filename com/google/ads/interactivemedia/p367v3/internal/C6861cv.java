package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Build;
import java.util.HashSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cv */
/* compiled from: PG */
public final class C6861cv {

    /* renamed from: a */
    public static final String f21762a;

    /* renamed from: b */
    private static final HashSet f21763b = new HashSet();

    /* renamed from: c */
    private static String f21764c = "goog.exo.core";

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
        sb.append("ExoPlayerLib/2.12.1 (Linux;Android ");
        sb.append(str);
        sb.append(") ExoPlayerLib/2.12.1");
        f21762a = sb.toString();
    }

    /* renamed from: a */
    public static synchronized String m19919a() {
        String str;
        synchronized (C6861cv.class) {
            str = f21764c;
        }
        return str;
    }

    /* renamed from: b */
    public static synchronized void m19920b(String str) {
        synchronized (C6861cv.class) {
            if (f21763b.add(str)) {
                String str2 = f21764c;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                f21764c = sb.toString();
            }
        }
    }
}
