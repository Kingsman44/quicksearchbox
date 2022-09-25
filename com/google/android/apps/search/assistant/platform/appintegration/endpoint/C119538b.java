package com.google.android.apps.search.assistant.platform.appintegration.endpoint;

import com.google.frameworks.client.data.android.server.C61560h;
import java.util.HashMap;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70235o;
import p5488io.grpc.binder.C70236p;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.endpoint.b */
/* compiled from: PG */
public final class C119538b {

    /* renamed from: a */
    public final C61560h f333177a;

    public C119538b(C61560h hVar, C70235o oVar) {
        this.f333177a = hVar;
        HashMap hashMap = new HashMap();
        hashMap.put("java.com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationService", oVar);
        hashMap.put("java.com.google.android.libraries.assistant.appintegration.shared.grpc.callback.AppIntegrationCallbackService", oVar);
        hVar.mo58122b(C70236p.m102388a(hashMap), new C70229i(true, C70229i.f187211a.f187213c));
    }
}
