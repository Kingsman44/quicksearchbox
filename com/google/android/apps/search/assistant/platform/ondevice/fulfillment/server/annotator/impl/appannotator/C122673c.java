package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122998as;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator.c */
/* compiled from: PG */
public final /* synthetic */ class C122673c implements C122998as {

    /* renamed from: a */
    public final /* synthetic */ AppAnnotatorFactory f339933a;

    public /* synthetic */ C122673c(AppAnnotatorFactory appAnnotatorFactory) {
        this.f339933a = appAnnotatorFactory;
    }

    /* renamed from: a */
    public final C60870cx mo105711a() {
        AppAnnotatorFactory appAnnotatorFactory = this.f339933a;
        if (!appAnnotatorFactory.f339929g.f339939a || appAnnotatorFactory.f339927e.f339499e) {
            return C60856cj.m92900i(Optional.empty());
        }
        C122959k e = appAnnotatorFactory.f339924b.mo105802e();
        return C47633f.m84733g(appAnnotatorFactory.mo105720b(e)).mo51513e(Throwable.class, C122681k.f339941a, C60826bg.f164896a).mo51515h(new C122682l(appAnnotatorFactory, e), C60826bg.f164896a);
    }
}
