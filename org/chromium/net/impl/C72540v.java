package org.chromium.net.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: org.chromium.net.impl.v */
/* compiled from: PG */
public final class C72540v {

    /* renamed from: a */
    public static final C72539u f193033a = new C72506cl();

    private C72540v() {
    }

    /* renamed from: a */
    public static C72539u m107236a(Context context) {
        Class<? extends U> cls;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (applicationInfo.metaData.getBoolean("org.chromium.net.CronetMetricsOptIn") && Build.VERSION.SDK_INT >= 30) {
                    try {
                        cls = C72540v.class.getClassLoader().loadClass("com.google.net.cronet.telemetry.CronetLoggerImpl").asSubclass(C72539u.class);
                    } catch (ClassNotFoundException unused) {
                        cls = null;
                    }
                    if (cls == null) {
                        return f193033a;
                    }
                    try {
                        return (C72539u) cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{1});
                    } catch (Exception unused2) {
                        return f193033a;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
        }
        return f193033a;
    }
}
