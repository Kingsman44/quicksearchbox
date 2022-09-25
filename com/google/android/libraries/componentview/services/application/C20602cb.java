package com.google.android.libraries.componentview.services.application;

import android.net.Uri;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.services.application.cb */
/* compiled from: PG */
public final /* synthetic */ class C20602cb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C20606cf f57802a;

    /* renamed from: b */
    public final /* synthetic */ Map f57803b;

    public /* synthetic */ C20602cb(C20606cf cfVar, Map map) {
        this.f57802a = cfVar;
        this.f57803b = map;
    }

    public final C60870cx apply(Object obj) {
        C20606cf cfVar = this.f57802a;
        Map map = this.f57803b;
        return cfVar.f57810b.mo25518c((Uri) obj, map, false);
    }
}
