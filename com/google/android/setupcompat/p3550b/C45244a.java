package com.google.android.setupcompat.p3550b;

import android.os.Build;

/* renamed from: com.google.android.setupcompat.b.a */
/* compiled from: PG */
public final class C45244a {
    /* renamed from: a */
    public static boolean m80595a() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* renamed from: b */
    public static boolean m80596b() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (Build.VERSION.CODENAME.equals("REL") && Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'T' && Build.VERSION.CODENAME.charAt(0) <= 'Z') {
            return true;
        }
        if (!Build.VERSION.CODENAME.equals("Tiramisu") || Build.VERSION.SDK_INT < 32) {
            return false;
        }
        return true;
    }
}
