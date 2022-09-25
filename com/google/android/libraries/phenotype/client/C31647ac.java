package com.google.android.libraries.phenotype.client;

import android.util.Log;
import com.google.android.p10905k.C146606e;

/* renamed from: com.google.android.libraries.phenotype.client.ac */
/* compiled from: PG */
final class C31647ac extends C31654aj {
    public C31647ac(C31652ah ahVar, String str, Boolean bool, boolean z) {
        super(ahVar, str, bool, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo37295a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C146606e.f395968c.matcher(str).matches()) {
                return true;
            }
            if (C146606e.f395969d.matcher(str).matches()) {
                return false;
            }
        }
        String c = super.mo37304c();
        String obj2 = obj.toString();
        Log.e("PhenotypeFlag", "Invalid boolean value for " + c + ": " + obj2);
        return null;
    }
}
