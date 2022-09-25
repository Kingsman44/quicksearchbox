package com.google.android.libraries.phenotype.client;

import android.util.Log;

/* renamed from: com.google.android.libraries.phenotype.client.aa */
/* compiled from: PG */
public final class C31645aa extends C31654aj {
    public C31645aa(C31652ah ahVar, String str, Long l, boolean z) {
        super(ahVar, str, l, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo37295a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String c = super.mo37304c();
        String obj2 = obj.toString();
        Log.e("PhenotypeFlag", "Invalid long value for " + c + ": " + obj2);
        return null;
    }
}
