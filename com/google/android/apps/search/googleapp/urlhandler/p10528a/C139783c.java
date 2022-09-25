package com.google.android.apps.search.googleapp.urlhandler.p10528a;

import com.google.android.apps.search.googleapp.customtabs.p10150b.C133674b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.a.c */
/* compiled from: PG */
public final /* synthetic */ class C139783c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C139785e f379913a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f379914b;

    /* renamed from: c */
    public final /* synthetic */ Instant f379915c;

    public /* synthetic */ C139783c(C139785e eVar, C60870cx cxVar, Instant instant) {
        this.f379913a = eVar;
        this.f379914b = cxVar;
        this.f379915c = instant;
    }

    public final C60870cx apply(Object obj) {
        C139785e eVar = this.f379913a;
        C60870cx cxVar = this.f379914b;
        Instant instant = this.f379915c;
        C133674b bVar = (C133674b) obj;
        if (!eVar.f379921b && !bVar.f364108j) {
            return cxVar;
        }
        C139784d dVar = new C139784d(eVar, instant);
        return C60922j.m93044g(cxVar, C47810es.m84963c(dVar), eVar.f379920a);
    }
}
