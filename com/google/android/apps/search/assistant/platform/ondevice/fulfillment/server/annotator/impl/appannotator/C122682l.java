package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator.l */
/* compiled from: PG */
public final /* synthetic */ class C122682l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AppAnnotatorFactory f339942a;

    /* renamed from: b */
    public final /* synthetic */ C122959k f339943b;

    public /* synthetic */ C122682l(AppAnnotatorFactory appAnnotatorFactory, C122959k kVar) {
        this.f339942a = appAnnotatorFactory;
        this.f339943b = kVar;
    }

    public final Object apply(Object obj) {
        AppAnnotatorFactory appAnnotatorFactory = this.f339942a;
        C122959k kVar = this.f339943b;
        Void voidR = (Void) obj;
        appAnnotatorFactory.mo105719a();
        return Optional.m71637of(new C122692v(appAnnotatorFactory, kVar));
    }
}
