package com.google.android.gms.analytics;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.analytics.internal.C142721ar;

/* renamed from: com.google.android.gms.analytics.d */
/* compiled from: PG */
public final class C142697d {
    /* renamed from: a */
    public static String m231525a(String str, int i) {
        if (i <= 0) {
            C142721ar.m231569a("index out of range for prefix", str);
            return BuildConfig.FLAVOR;
        }
        return str + i;
    }
}
