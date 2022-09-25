package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.gms.common.util.g */
/* compiled from: PG */
public final class C144007g {

    /* renamed from: a */
    public static Boolean f390245a;

    /* renamed from: b */
    public static Boolean f390246b;

    /* renamed from: c */
    private static Boolean f390247c;

    /* renamed from: d */
    private static Boolean f390248d;

    /* renamed from: a */
    public static boolean m234185a(PackageManager packageManager) {
        if (f390247c == null) {
            f390247c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f390247c.booleanValue();
    }

    /* renamed from: b */
    public static boolean m234186b(Context context) {
        m234185a(context.getPackageManager());
        if (f390248d == null) {
            f390248d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f390248d.booleanValue() && C144013m.m234192a();
    }
}
