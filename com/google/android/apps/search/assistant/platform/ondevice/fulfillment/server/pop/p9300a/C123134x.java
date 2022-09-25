package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123057e;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.x */
/* compiled from: PG */
public final /* synthetic */ class C123134x implements C123057e {

    /* renamed from: a */
    public final /* synthetic */ C123089ac f340800a;

    /* renamed from: b */
    public final /* synthetic */ GalliumIpc f340801b;

    public /* synthetic */ C123134x(C123089ac acVar, GalliumIpc galliumIpc) {
        this.f340800a = acVar;
        this.f340801b = galliumIpc;
    }

    /* renamed from: a */
    public final C60870cx mo105810a() {
        C123089ac acVar = this.f340800a;
        GalliumIpc galliumIpc = this.f340801b;
        Objects.requireNonNull(galliumIpc);
        C123132v vVar = new C123132v(galliumIpc);
        return C60856cj.m92905n(C47810es.m84965e(vVar), acVar.f340691h);
    }
}
