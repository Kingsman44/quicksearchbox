package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122984ae;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.t */
/* compiled from: PG */
public final /* synthetic */ class C123546t implements C122984ae {

    /* renamed from: a */
    public final /* synthetic */ Executor f341387a;

    public /* synthetic */ C123546t(Executor executor) {
        this.f341387a = executor;
    }

    /* renamed from: a */
    public final C60870cx mo105811a(Object obj) {
        Executor executor = this.f341387a;
        GalliumIpc galliumIpc = (GalliumIpc) obj;
        Objects.requireNonNull(galliumIpc);
        return C60856cj.m92903l(C47810es.m84977q(new C123535i(galliumIpc)), executor);
    }
}
