package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.bumptech.glide.load.p293a.p295b.C5686b;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138259j;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.l */
/* compiled from: PG */
public final /* synthetic */ class C138286l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ OneSearchImageProvider f376236a;

    /* renamed from: b */
    public final /* synthetic */ C138259j f376237b;

    public /* synthetic */ C138286l(OneSearchImageProvider oneSearchImageProvider, C138259j jVar) {
        this.f376236a = oneSearchImageProvider;
        this.f376237b = jVar;
    }

    public final void run() {
        OneSearchImageProvider oneSearchImageProvider = this.f376236a;
        C138259j jVar = this.f376237b;
        try {
            oneSearchImageProvider.mo114230c((C5686b) oneSearchImageProvider.f376210d.mo17428b(), jVar.f376161b, Optional.empty());
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) OneSearchImageProvider.f376207a.mo56226d()).mo56382g(e)).mo56372aa(41151)).mo56389s("Failed to pre-cache image: %s", jVar.f376161b);
        }
    }
}
