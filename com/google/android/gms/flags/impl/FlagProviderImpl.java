package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.flags.C144213b;
import com.google.android.gms.flags.impl.p10798a.C144216a;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;

/* compiled from: PG */
public class FlagProviderImpl extends C144213b {

    /* renamed from: a */
    private boolean f390635a = false;

    /* renamed from: b */
    private SharedPreferences f390636b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.f390635a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.f390636b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) C144216a.m234458a(new C144215a(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: ".concat(String.valueOf(e.getMessage())));
        }
        return valueOf.booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.f390635a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.f390636b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) C144216a.m234458a(new C144217b(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: ".concat(String.valueOf(e.getMessage())));
        }
        return valueOf.intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        if (!this.f390635a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.f390636b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) C144216a.m234458a(new C144218c(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: ".concat(String.valueOf(e.getMessage())));
        }
        return valueOf.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.f390635a) {
            return str2;
        }
        try {
            return (String) C144216a.m234458a(new C144219d(this.f390636b, str, str2));
        } catch (Exception e) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: ".concat(String.valueOf(e.getMessage())));
            return str2;
        }
    }

    public void init(C144165j jVar) {
        SharedPreferences sharedPreferences;
        Context context = (Context) C144166k.m234388a(jVar);
        if (!this.f390635a) {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    if (C144221f.f390650a == null) {
                        C144221f.f390650a = (SharedPreferences) C144216a.m234458a(new C144220e(createPackageContext));
                    }
                    sharedPreferences = C144221f.f390650a;
                }
                this.f390636b = sharedPreferences;
                this.f390635a = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                Log.w("FlagProviderImpl", "Could not retrieve sdk flags, continuing with defaults: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }
}
