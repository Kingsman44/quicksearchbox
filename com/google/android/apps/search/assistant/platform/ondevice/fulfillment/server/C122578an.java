package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122401at;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.an */
/* compiled from: PG */
public final /* synthetic */ class C122578an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122720au f339744a;

    /* renamed from: b */
    public final /* synthetic */ C122401at f339745b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f339746c;

    public /* synthetic */ C122578an(C122720au auVar, C122401at atVar, C60870cx cxVar) {
        this.f339744a = auVar;
        this.f339745b = atVar;
        this.f339746c = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C122720au auVar = this.f339744a;
        C122401at atVar = this.f339745b;
        C60870cx cxVar = this.f339746c;
        C122811k kVar = (C122811k) obj;
        C123001av avVar = auVar.f340020h;
        Objects.requireNonNull(kVar);
        C60870cx c = avVar.mo105820c(2004, new C122575ak(kVar));
        C60870cx c2 = auVar.f340020h.mo105820c(2003, new C122576al(auVar, kVar, atVar));
        return C47638k.m84753d(cxVar, c2).mo51521b(new C122577am(auVar, atVar, c, cxVar, c2), C60826bg.f164896a);
    }
}
