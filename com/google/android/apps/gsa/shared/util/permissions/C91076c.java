package com.google.android.apps.gsa.shared.util.permissions;

import android.content.Context;
import android.os.Build;
import androidx.core.content.C1882h;
import androidx.core.p094f.C1888a;

/* renamed from: com.google.android.apps.gsa.shared.util.permissions.c */
/* compiled from: PG */
public final class C91076c {
    /* renamed from: a */
    public static boolean m148792a(Context context) {
        if (!C1888a.m5149c() && Build.VERSION.SDK_INT <= 30) {
            return true;
        }
        if (C1882h.m5137c(context.getApplicationContext(), "android.permission.BLUETOOTH_SCAN") == 0 && C1882h.m5137c(context.getApplicationContext(), "android.permission.BLUETOOTH_CONNECT") == 0) {
            return true;
        }
        return false;
    }
}
