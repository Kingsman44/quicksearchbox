package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.C122694b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.C122976b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122999at;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator.h */
/* compiled from: PG */
public final class C122678h implements C122694b, C122976b {

    /* renamed from: a */
    private final C122999at f339938a;

    public C122678h(AppAnnotatorFactory appAnnotatorFactory) {
        Objects.requireNonNull(appAnnotatorFactory);
        this.f339938a = new C122999at(new C122673c(appAnnotatorFactory), C122674d.f339934a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo105713b() {
        C60870cx b = this.f339938a.mo105816b();
        C122672b bVar = C122672b.f339932a;
        return C60922j.m93044g(b, C47810es.m84963c(bVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo105714c() {
        return this.f339938a.mo105815a();
    }
}
