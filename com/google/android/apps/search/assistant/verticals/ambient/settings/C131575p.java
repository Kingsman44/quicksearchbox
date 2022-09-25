package com.google.android.apps.search.assistant.verticals.ambient.settings;

import com.google.android.libraries.search.udcdataservice.C41385a;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41409h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.p */
/* compiled from: PG */
public final class C131575p {

    /* renamed from: a */
    private final C41409h f359480a;

    /* renamed from: b */
    private final C60887da f359481b;

    public C131575p(C41409h hVar, C60887da daVar) {
        this.f359480a = hVar;
        this.f359481b = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo110194a() {
        C60870cx b = this.f359480a.mo43949b(new C41387c[]{C41387c.LOCATION_HISTORY_AND_REPORTING}, C41385a.ASSISTANT);
        C58817ah c = C47810es.m84963c(C131574o.f359479a);
        return C60922j.m93044g(b, C47810es.m84963c(c), this.f359481b);
    }

    /* renamed from: b */
    public final C60870cx mo110195b() {
        C60870cx b = this.f359480a.mo43949b(new C41387c[]{C41387c.WEB_HISTORY}, C41385a.ASSISTANT);
        C58817ah c = C47810es.m84963c(C131573n.f359478a);
        return C60922j.m93044g(b, C47810es.m84963c(c), this.f359481b);
    }
}
