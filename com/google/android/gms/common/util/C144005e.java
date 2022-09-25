package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.common.util.e */
/* compiled from: PG */
public final class C144005e {
    /* renamed from: a */
    public static void m234184a(Context context, Throwable th) {
        try {
            C143919bh.m233958a(context);
            C143919bh.m233958a(th);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }
}
