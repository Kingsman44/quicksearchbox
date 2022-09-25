package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.ao */
/* compiled from: PG */
public final /* synthetic */ class C122994ao implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122999at f340534a;

    public /* synthetic */ C122994ao(C122999at atVar) {
        this.f340534a = atVar;
    }

    public final C60870cx apply(Object obj) {
        C122997ar arVar = this.f340534a.f340538b;
        Objects.requireNonNull(arVar);
        return (C60870cx) ((Optional) obj).map(new C122991al(arVar)).orElse(C60866ct.f164955a);
    }
}
