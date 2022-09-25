package com.google.android.libraries.phenotype.client;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.libraries.phenotype.client.af */
/* compiled from: PG */
public final class C31650af extends C31654aj {

    /* renamed from: a */
    final /* synthetic */ C31651ag f85136a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31650af(C31652ah ahVar, String str, Object obj, boolean z, C31651ag agVar) {
        super(ahVar, str, obj, z);
        this.f85136a = agVar;
    }

    /* renamed from: a */
    public final Object mo37295a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.f85136a.mo34773a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        String c = super.mo37304c();
        String obj2 = obj.toString();
        Log.e("PhenotypeFlag", "Invalid byte[] value for " + c + ": " + obj2);
        return null;
    }
}
