package com.google.android.libraries.phenotype.client;

import android.util.Log;

/* renamed from: com.google.android.libraries.phenotype.client.ad */
/* compiled from: PG */
public final class C31648ad extends C31654aj {
    public C31648ad(C31652ah ahVar, String str, Double d) {
        super(ahVar, str, d, true);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo37295a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String c = super.mo37304c();
        String obj2 = obj.toString();
        Log.e("PhenotypeFlag", "Invalid double value for " + c + ": " + obj2);
        return null;
    }
}
