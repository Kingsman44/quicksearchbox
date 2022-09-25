package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.y */
/* compiled from: PG */
public final /* synthetic */ class C123135y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ GalliumIpc f340802a;

    /* renamed from: b */
    public final /* synthetic */ PortableAssistant f340803b;

    public /* synthetic */ C123135y(GalliumIpc galliumIpc, PortableAssistant portableAssistant) {
        this.f340802a = galliumIpc;
        this.f340803b = portableAssistant;
    }

    public final C60870cx apply(Object obj) {
        GalliumIpc galliumIpc = this.f340802a;
        PortableAssistant portableAssistant = this.f340803b;
        Void voidR = (Void) obj;
        C60870cx k = GalliumIpc.m35424k(galliumIpc.nativeStartAllAgents(galliumIpc.f51691d));
        C123136z zVar = new C123136z(portableAssistant);
        return C60922j.m93044g(k, C47810es.m84963c(zVar), C60826bg.f164896a);
    }
}
