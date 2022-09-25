package com.google.android.gms.common.util;

import android.app.Application;

/* renamed from: com.google.android.gms.common.util.n */
/* compiled from: PG */
public final class C144014n {

    /* renamed from: a */
    private static String f390251a;

    /* renamed from: a */
    public static String m234194a() {
        if (f390251a == null) {
            f390251a = Application.getProcessName();
        }
        return f390251a;
    }
}
