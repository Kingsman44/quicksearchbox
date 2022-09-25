package com.google.android.libraries.gcoreclient.p1803w.p1804a;

import com.google.android.gms.phenotype.Configuration;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.w.a.e */
/* compiled from: PG */
public final class C21712e {

    /* renamed from: a */
    private final Configuration f60029a;

    public C21712e(Configuration configuration) {
        this.f60029a = configuration;
    }

    /* renamed from: a */
    public final C21714g[] mo27075a() {
        int length = this.f60029a.f393977b.length;
        C21714g[] gVarArr = new C21714g[length];
        for (int i = 0; i < length; i++) {
            gVarArr[i] = new C21714g(this.f60029a.f393977b[i]);
        }
        return gVarArr;
    }
}
