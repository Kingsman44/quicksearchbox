package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium;

import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.l */
/* compiled from: PG */
public final /* synthetic */ class C123538l implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C123538l f341368a = new C123538l();

    private /* synthetic */ C123538l() {
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        ((C59052c) ((C59052c) C123548v.f341398a.mo56226d()).mo56372aa(34949)).mo56386p("Gallium prewarm on resource update failed");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
