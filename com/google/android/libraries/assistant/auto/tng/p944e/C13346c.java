package com.google.android.libraries.assistant.auto.tng.p944e;

import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.libraries.componentview.services.application.LogData;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.e.c */
/* compiled from: PG */
public final /* synthetic */ class C13346c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C13349f f41070a;

    /* renamed from: b */
    public final /* synthetic */ LogData f41071b;

    public /* synthetic */ C13346c(C13349f fVar, LogData logData) {
        this.f41070a = fVar;
        this.f41071b = logData;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C13349f fVar = this.f41070a;
        LogData logData = this.f41071b;
        C86034c cVar = fVar.f41076c;
        if (cVar == null) {
            cxVar = C60856cj.m92899h(new RuntimeException("TikTokAccountHelper was not injected."));
        } else {
            C60870cx b = cVar.mo79697b();
            C13345b bVar = new C13345b(fVar);
            cxVar = C60922j.m93044g(b, C47810es.m84963c(bVar), fVar.f57736e);
        }
        C13347d dVar = new C13347d(logData);
        return C60922j.m93044g(cxVar, C47810es.m84963c(dVar), fVar.f57736e);
    }
}
