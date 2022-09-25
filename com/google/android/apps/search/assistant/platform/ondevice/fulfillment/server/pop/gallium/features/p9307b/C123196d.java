package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9307b;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122618d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.b.d */
/* compiled from: PG */
public final class C123196d implements C123197e {

    /* renamed from: b */
    public static final /* synthetic */ int f340894b = 0;

    /* renamed from: a */
    public final Executor f340895a;

    /* renamed from: d */
    private final C122618d f340896d;

    public C123196d(C122618d dVar, Executor executor) {
        this.f340896d = dVar;
        this.f340895a = executor;
    }

    /* renamed from: a */
    public final C60870cx mo105906a(C123201i iVar) {
        C60870cx a = this.f340896d.mo105693a();
        C123195c cVar = new C123195c(this, iVar);
        return C60922j.m93045h(a, C47810es.m84966f(cVar), this.f340895a);
    }
}
