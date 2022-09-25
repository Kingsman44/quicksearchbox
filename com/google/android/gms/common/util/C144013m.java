package com.google.android.gms.common.util;

import android.os.Build;

/* renamed from: com.google.android.gms.common.util.m */
/* compiled from: PG */
public final class C144013m {
    /* renamed from: a */
    public static boolean m234192a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: b */
    public static boolean m234193b() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
