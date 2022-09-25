package com.google.android.apps.gsa.search.core.webview;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.webview.o */
/* compiled from: PG */
public final class C87269o {

    /* renamed from: a */
    private final Map f235718a = new HashMap();

    /* renamed from: a */
    public final synchronized C87268n mo80916a(String str) {
        C87268n nVar = (C87268n) this.f235718a.get(str);
        if (nVar != null) {
            return nVar;
        }
        C87268n nVar2 = new C87268n();
        this.f235718a.put(str, nVar2);
        return nVar2;
    }
}
