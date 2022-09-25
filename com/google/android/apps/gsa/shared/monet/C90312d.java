package com.google.android.apps.gsa.shared.monet;

import com.google.android.libraries.gsa.monet.p1886a.C22936a;
import com.google.android.libraries.gsa.monet.p1886a.C22948m;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.monet.d */
/* compiled from: PG */
public final class C90312d implements C22948m {

    /* renamed from: a */
    private final Map f252238a;

    public C90312d(Map map) {
        this.f252238a = map;
    }

    /* renamed from: a */
    public final C22936a mo28319a(String str) {
        C68214a aVar = (C68214a) this.f252238a.get(str);
        if (aVar != null) {
            return (C22936a) aVar.mo27525b();
        }
        return null;
    }
}
