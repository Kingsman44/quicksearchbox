package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.C143876h;

/* renamed from: com.google.android.gms.analytics.internal.h */
/* compiled from: PG */
public final class C142738h {

    /* renamed from: a */
    public static final String f387330a;

    /* renamed from: b */
    public static final String f387331b;

    static {
        String replaceAll = String.valueOf(C143876h.f389990c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        f387330a = replaceAll;
        f387331b = "ma".concat(String.valueOf(replaceAll));
    }
}
