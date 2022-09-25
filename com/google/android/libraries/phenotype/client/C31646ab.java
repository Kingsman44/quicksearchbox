package com.google.android.libraries.phenotype.client;

import android.util.Log;

/* renamed from: com.google.android.libraries.phenotype.client.ab */
/* compiled from: PG */
public final class C31646ab extends C31654aj {
    public C31646ab(C31652ah ahVar, String str, Integer num) {
        super(ahVar, str, num, false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo37295a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String c = super.mo37304c();
        String obj2 = obj.toString();
        Log.e("PhenotypeFlag", "Invalid int value for " + c + ": " + obj2);
        return null;
    }
}
