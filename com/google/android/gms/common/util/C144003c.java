package com.google.android.gms.common.util;

import android.util.Base64;

/* renamed from: com.google.android.gms.common.util.c */
/* compiled from: PG */
public final class C144003c {
    /* renamed from: a */
    public static String m234182a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
