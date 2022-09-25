package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122618d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9291g.C122883a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.C122976b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122999at;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.u */
/* compiled from: PG */
public final class C122713u implements C122618d, C122976b, C122883a {

    /* renamed from: a */
    private final C122999at f339995a;

    public C122713u(C122699g gVar, C60887da daVar) {
        Objects.requireNonNull(gVar);
        this.f339995a = new C122999at(new C122711s(gVar), C122712t.f339994a, daVar);
    }

    /* renamed from: a */
    public final C60870cx mo105693a() {
        return this.f339995a.mo105816b();
    }

    /* renamed from: b */
    public final C60870cx mo105728b() {
        C60870cx b = this.f339995a.mo105816b();
        C122710r rVar = C122710r.f339992a;
        return C60922j.m93044g(b, C47810es.m84963c(rVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo105714c() {
        return this.f339995a.mo105815a();
    }
}
