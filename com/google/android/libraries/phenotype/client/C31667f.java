package com.google.android.libraries.phenotype.client;

import android.net.Uri;
import androidx.p060c.C0984n;

/* renamed from: com.google.android.libraries.phenotype.client.f */
/* compiled from: PG */
public final class C31667f {

    /* renamed from: a */
    private final C0984n f85179a;

    public C31667f(C0984n nVar) {
        this.f85179a = nVar;
    }

    /* renamed from: a */
    public final String mo37313a(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        C0984n nVar = (C0984n) this.f85179a.get(str);
        if (nVar == null) {
            return null;
        }
        if (str2 != null) {
            str3 = str2.concat(String.valueOf(str3));
        }
        return (String) nVar.get(str3);
    }
}
