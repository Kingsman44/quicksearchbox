package com.google.android.libraries.search.video.conductor;

import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60888db;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.video.conductor.e */
/* compiled from: PG */
public final class C41482e {

    /* renamed from: a */
    private final C41480c f108373a;

    /* renamed from: b */
    private final Map f108374b = new HashMap();

    public C41482e(C41480c cVar) {
        this.f108373a = cVar;
    }

    /* renamed from: a */
    public final AutoplayConductorImpl mo44003a(String str) {
        if (this.f108374b.containsKey(str)) {
            return (AutoplayConductorImpl) this.f108374b.get(str);
        }
        C41480c cVar = this.f108373a;
        str.getClass();
        C41489l lVar = (C41489l) cVar.f108370a.mo17428b();
        lVar.getClass();
        C46439e eVar = (C46439e) cVar.f108371b.mo17428b();
        eVar.getClass();
        C60888db dbVar = (C60888db) cVar.f108372c.mo17428b();
        dbVar.getClass();
        AutoplayConductorImpl autoplayConductorImpl = new AutoplayConductorImpl(str, lVar, eVar, dbVar);
        this.f108374b.put(str, autoplayConductorImpl);
        return autoplayConductorImpl;
    }
}
