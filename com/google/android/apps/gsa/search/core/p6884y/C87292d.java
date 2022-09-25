package com.google.android.apps.gsa.search.core.p6884y;

import com.google.android.libraries.gsa.monet.service.C23050a;
import com.google.android.libraries.gsa.monet.service.C23055f;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.y.d */
/* compiled from: PG */
public final class C87292d implements C23055f {

    /* renamed from: a */
    private final Map f235754a;

    public C87292d(Map map) {
        this.f235754a = map;
    }

    /* renamed from: a */
    public final C23050a mo28492a(String str) {
        C68214a aVar = (C68214a) this.f235754a.get(str);
        if (aVar != null) {
            return (C23050a) aVar.mo27525b();
        }
        return null;
    }
}
