package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121125c;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130808j;
import com.google.android.libraries.search.udcdataservice.C41385a;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41409h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.ap */
/* compiled from: PG */
public final class C130752ap implements C130808j {

    /* renamed from: a */
    private final C41409h f357953a;

    /* renamed from: b */
    private final ExecutorService f357954b;

    /* renamed from: c */
    private final C121125c f357955c;

    public C130752ap(C41409h hVar, C121125c cVar, ExecutorService executorService) {
        this.f357953a = hVar;
        this.f357955c = cVar;
        this.f357954b = executorService;
    }

    /* renamed from: a */
    public final C60870cx mo109812a() {
        C60870cx a = this.f357955c.mo105058a();
        C60870cx b = this.f357953a.mo43949b(new C41387c[]{C41387c.WEB_AND_APP_HISTORY}, C41385a.ASSISTANT);
        C130750an anVar = C130750an.f357950a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(anVar), this.f357954b);
        return C47638k.m84753d(a, g).mo51520a(new C130751ao(a, g), this.f357954b);
    }
}
