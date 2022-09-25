package com.google.android.libraries.gcoreclient.p1803w.p1804a;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import java.util.HashMap;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.w.a.a */
/* compiled from: PG */
public class C21708a {

    /* renamed from: a */
    public final Configurations f60026a;

    public C21708a(Configurations configurations) {
        this.f60026a = configurations;
        new HashMap();
    }

    /* renamed from: a */
    public final C21712e[] mo27073a() {
        Configuration[] configurationArr = this.f60026a.f393983d;
        if (configurationArr == null) {
            return null;
        }
        C21712e[] eVarArr = new C21712e[configurationArr.length];
        for (int i = 0; i < configurationArr.length; i++) {
            eVarArr[i] = new C21712e(configurationArr[i]);
        }
        return eVarArr;
    }
}
