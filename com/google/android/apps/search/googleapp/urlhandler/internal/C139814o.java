package com.google.android.apps.search.googleapp.urlhandler.internal;

import com.google.android.apps.search.googleapp.urlhandler.C139786b;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.o */
/* compiled from: PG */
public final class C139814o {

    /* renamed from: a */
    public final C139786b f380023a;

    /* renamed from: b */
    private final Executor f380024b;

    public C139814o(Executor executor, C139786b bVar) {
        this.f380024b = executor;
        this.f380023a = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo115286a(C60870cx cxVar, C139823j jVar, boolean z, boolean z2, int i) {
        C139813n nVar = new C139813n(this, jVar, z, z2, i);
        return C60922j.m93044g(cxVar, C47810es.m84963c(nVar), this.f380024b);
    }
}
