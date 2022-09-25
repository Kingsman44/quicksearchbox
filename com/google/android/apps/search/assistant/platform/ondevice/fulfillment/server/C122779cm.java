package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122405ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.cm */
/* compiled from: PG */
public final /* synthetic */ class C122779cm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122405ax f340097a;

    public /* synthetic */ C122779cm(C122405ax axVar) {
        this.f340097a = axVar;
    }

    public final C60870cx apply(Object obj) {
        return (C60870cx) ((Optional) obj).map(new C122756bw(this.f340097a)).orElseGet(C122757bx.f340073a);
    }
}
